package ru.cprocsp.ACSP.tools.integrity;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import defpackage.g8e;
import defpackage.mwh0;
import defpackage.oyr;
import defpackage.w511;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.CSPInternalConfig;
import ru.cprocsp.ACSP.tools.common.Constants;
import ru.cprocsp.ACSP.tools.common.HexString;
import ru.cprocsp.ACSP.tools.common.IACSPContentProvider;
import ru.cprocsp.ACSP.tools.common.Infrastructure;
import ru.cprocsp.ACSP.tools.integrity.CSPIntegrityConstants;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public final class ACSPIntegrity extends PropertyFile implements IntegrityInterface, Constants, IACSPContentProvider {
    private byte[] apkDigest;
    private final String apkPath;
    private final Context applicationContext;
    private DigestResource dexDigestResource;
    private final DigestResource digestResource;
    private final DigestResource extraDigestResource;
    private final CSPIntegrityConstants.LibraryDigest libraryDigest;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ACSPIntegrity(Context context) throws Exception {
        super(oyr.t(r0, File.separator, Constants.INTEGRITY_RESULT_FILE), true);
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getAbsolutePath());
        this.apkPath = getApkPath(context);
        this.applicationContext = context;
        CSPIntegrityConstants.LibraryDigest chooseLibraryDigest = chooseLibraryDigest(context);
        this.libraryDigest = chooseLibraryDigest;
        if (CSPInternalConfig.isEmbedded()) {
            this.digestResource = preLoadAppDigestResource(context, chooseLibraryDigest.digestResourceId);
        } else {
            this.digestResource = preLoadAppDigestResourceFromContentResolver(context.createPackageContext("ru.cprocsp.ACSP", 2).getContentResolver(), CSPIntegrityConstants.DIGEST);
        }
        if (this.digestResource == null) {
            w511.s("Digest data for shared libraries not found.");
            throw null;
        }
        if (isDexIntegrityControlEnabled(context)) {
            CSPIntegrityConstants.DexDigest dexDigest = CSPIntegrityConstants.DEX_DIGEST;
            String str = dexDigest.digestFileName;
            DigestResource preLoadAppDigestFromAssets = preLoadAppDigestFromAssets(context);
            this.dexDigestResource = preLoadAppDigestFromAssets;
            if (preLoadAppDigestFromAssets == null) {
                this.dexDigestResource = preLoadAppDigestResource(context, dexDigest.digestResourceId);
            }
            DigestResource digestResource = this.dexDigestResource;
            if (digestResource == null || digestResource.getItems().isEmpty()) {
                if (CSPInternalConfig.isDebuggable()) {
                    String str2 = dexDigest.digestFileName;
                } else {
                    DigestResource digestResource2 = this.dexDigestResource;
                    if (digestResource2 == null) {
                        throw new Exception(oyr.t(new StringBuilder("Release mode: file "), dexDigest.digestFileName, " is required but not found."));
                    }
                    if (digestResource2.getItems().isEmpty()) {
                        throw new Exception(oyr.t(new StringBuilder("Release mode: non-empty file "), dexDigest.digestFileName, " is required."));
                    }
                }
            }
        } else {
            this.dexDigestResource = null;
            if (!CSPInternalConfig.isDebuggable()) {
                Log.e(LogConstants.APP_LOGGER_TAG, "Release mode: dex integrity control is disabled.");
            }
        }
        this.extraDigestResource = preLoadAppDigestResource(context, chooseLibraryDigest.extraDigestResourceId);
    }

    private byte[] calculateApkDigest() throws Exception {
        FileInputStream fileInputStream = new FileInputStream(this.apkPath);
        try {
            byte[] computeDigest = CSPIntegrity.computeDigest(fileInputStream, 32801);
            fileInputStream.close();
            return computeDigest;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int checkFileOnDisk(Context context, InputStream inputStream, Set<Map.Entry<String, String>> set) throws Exception {
        String staticCspNativeLibraryPath = CSPInternalConfig.getStaticCspNativeLibraryPath();
        DigestResource digestResource = new DigestResource(inputStream);
        if (set != null) {
            set.addAll(digestResource.getItems());
        }
        return !digestResource.new DiskFileDigestVerifier(staticCspNativeLibraryPath).verify() ? 1 : 0;
    }

    public static CSPIntegrityConstants.LibraryDigest chooseLibraryDigest(Context context) {
        return Infrastructure.isIsCspLib64() ? Infrastructure.isArm() ? CSPIntegrityConstants.DIGEST_ARM64 : CSPIntegrityConstants.DIGEST_X86_64 : Infrastructure.isArm() ? CSPIntegrityConstants.DIGEST_ARM : CSPIntegrityConstants.DIGEST_X86;
    }

    private String getApkPath(Context context) throws Exception {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.sourceDir;
    }

    private boolean isDexIntegrityControlEnabled(Context context) throws Exception {
        Properties properties = new Properties();
        properties.load(context.getResources().openRawResource(mwh0.csp_parameters));
        return Integer.parseInt(properties.getProperty("DexIntegrityControl", "1")) != 0;
    }

    private DigestResource preLoadAppDigestFromAssets(Context context) throws Exception {
        AssetManager assets = context.getAssets();
        String[] list = assets.list(CSPIntegrityConstants.DIGESTS_DIRECTORY);
        if (list != null && list.length != 0) {
            for (String str : list) {
                if (str.equalsIgnoreCase(CSPIntegrityConstants.DEX_DIGEST.digestFileName)) {
                    return new DigestResource(assets.open(CSPIntegrityConstants.DIGESTS_DIRECTORY + File.separator + list[0]));
                }
            }
        }
        return null;
    }

    private DigestResource preLoadAppDigestResource(Context context, String str) throws Exception {
        int identifier = context.getResources().getIdentifier(str, null, context.getPackageName());
        if (identifier == 0) {
            return null;
        }
        return new DigestResource(context.getResources().openRawResource(identifier));
    }

    private DigestResource preLoadAppDigestResourceFromContentResolver(ContentResolver contentResolver, String str) throws Exception {
        ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.parse("content://ru.cprocsp.ACSP.providers.ACSPContentProvider/" + str), "r");
        if (openFileDescriptor == null) {
            if (openFileDescriptor == null) {
                return null;
            }
            openFileDescriptor.close();
            return null;
        }
        try {
            DigestResource digestResource = new DigestResource(new FileInputStream(openFileDescriptor.getFileDescriptor()));
            openFileDescriptor.close();
            return digestResource;
        } catch (Throwable th) {
            try {
                openFileDescriptor.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private boolean save(Date date, boolean z) {
        try {
            this.options.put(CSPIntegrityConstants.CHECK_INTEGRITY_LAST_DATE, Long.toString(date.getTime()));
            this.options.put(CSPIntegrityConstants.CHECK_INTEGRITY_LAST_STATUS, Boolean.toString(z));
            save();
            return true;
        } catch (Exception e) {
            Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.cprocsp.ACSP.tools.integrity.IntegrityInterface
    public int check(boolean z) {
        boolean z2;
        boolean z3;
        long lastTime = getLastTime();
        Date time = Calendar.getInstance().getTime();
        long abs = Math.abs(time.getTime() - lastTime);
        if (!z && lastTime != 0 && abs <= 600000) {
            return getLastStatus();
        }
        String parent = new File(this.applicationContext.getApplicationInfo().sourceDir).getParent();
        String str = "lib/" + this.libraryDigest.architecture;
        final String str2 = this.libraryDigest.splitApkNameSuffix;
        ApkFile apkFile = new ApkFile(this.applicationContext.getPackageCodePath());
        ApkFilter apkFilter = new ApkFilter() { // from class: ru.cprocsp.ACSP.tools.integrity.ACSPIntegrity.1
            @Override // ru.cprocsp.ACSP.tools.integrity.ApkFilter
            public boolean accept(File file) {
                return file.getName().endsWith(str2 + ".apk");
            }
        };
        if (CSPInternalConfig.isCspUnpacked()) {
            String staticCspNativeLibraryPath = CSPInternalConfig.getStaticCspNativeLibraryPath();
            DigestResource digestResource = this.digestResource;
            Objects.requireNonNull(digestResource);
            z2 = digestResource.new DiskFileDigestVerifier(staticCspNativeLibraryPath).verify();
        } else {
            DigestResource digestResource2 = this.digestResource;
            Objects.requireNonNull(digestResource2);
            z2 = digestResource2.new ApkFileDigestVerifier(parent, str, new ApkFile[]{apkFile, apkFilter}).verify();
        }
        DigestResource digestResource3 = this.extraDigestResource;
        boolean z4 = z2;
        if (digestResource3 != null) {
            z4 = z2;
            if (!digestResource3.getItems().isEmpty()) {
                if (CSPInternalConfig.isCspUnpacked()) {
                    String staticCspNativeLibraryPath2 = CSPInternalConfig.getStaticCspNativeLibraryPath();
                    DigestResource digestResource4 = this.extraDigestResource;
                    Objects.requireNonNull(digestResource4);
                    z3 = digestResource4.new DiskFileDigestVerifier(staticCspNativeLibraryPath2).verify();
                } else {
                    DigestResource digestResource5 = this.extraDigestResource;
                    Objects.requireNonNull(digestResource5);
                    z3 = digestResource5.new ApkFileDigestVerifier(parent, str, new ApkFile[]{apkFile, apkFilter}).verify();
                }
                z4 = (z2 ? 1 : 0) & z3;
            }
        }
        DigestResource digestResource6 = this.dexDigestResource;
        boolean z5 = z4;
        if (digestResource6 != null) {
            z5 = z4;
            if (!digestResource6.getItems().isEmpty()) {
                DigestResource digestResource7 = this.dexDigestResource;
                Objects.requireNonNull(digestResource7);
                z5 = (z4 ? 1 : 0) & (new DigestResource.ApkFileDigestVerifier(digestResource7, parent, new ApkFile[]{apkFile}).verify() ? 1 : 0);
            }
        }
        save(time, z5);
        return !z5;
    }

    @Override // ru.cprocsp.ACSP.tools.integrity.IntegrityInterface
    public byte[] getApkDigest() {
        byte[] bArr;
        synchronized (this) {
            if (this.apkDigest == null) {
                try {
                    this.apkDigest = calculateApkDigest();
                } catch (Exception e) {
                    Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
                    this.apkDigest = null;
                }
            }
            bArr = this.apkDigest;
        }
        return bArr;
    }

    @Override // ru.cprocsp.ACSP.tools.integrity.IntegrityInterface
    public String getApkDigestItem(String str, String str2) {
        byte[] apkDigest = getApkDigest();
        if (apkDigest == null) {
            return null;
        }
        return str2 + Extension.O_BRAKE_SPACE + str + "):\n" + HexString.toHex(apkDigest);
    }

    @Override // ru.cprocsp.ACSP.tools.integrity.IntegrityInterface
    public List<String> getItems(String str, String str2, String str3) {
        String t;
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<String, String>> items = this.digestResource.getItems();
        DigestResource digestResource = this.extraDigestResource;
        if (digestResource != null) {
            items.addAll(digestResource.getItems());
        }
        if (str3 == null) {
            str3 = "\n";
        }
        int i = 0;
        for (Map.Entry<String, String> entry : items) {
            if (str == null || str2 == null) {
                StringBuilder sb = new StringBuilder("");
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getKey());
                sb.append(Extension.COLON_SPACE);
                t = oyr.t(sb, entry.getValue(), str3);
            } else {
                StringBuilder sb2 = new StringBuilder("");
                i++;
                sb2.append(i);
                sb2.append(". ");
                g8e.D(sb2, entry.getKey(), str3, str2, Extension.O_BRAKE_SPACE);
                sb2.append(str);
                sb2.append("): ");
                t = oyr.t(sb2, entry.getValue(), str3);
            }
            arrayList.add(t);
        }
        return arrayList;
    }

    public Set<Map.Entry<String, String>> getItemsWithoutFormatting() {
        return this.digestResource.getItems();
    }

    @Override // ru.cprocsp.ACSP.tools.integrity.IntegrityInterface
    public String getLastDate() {
        String property = this.options.getProperty(CSPIntegrityConstants.CHECK_INTEGRITY_LAST_DATE);
        if (property == null) {
            return null;
        }
        try {
            return CSPIntegrityConstants.INTEGRITY_DATE_FORMAT.format(new Date(Long.valueOf(property).longValue()));
        } catch (NumberFormatException e) {
            Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
            return null;
        }
    }

    @Override // ru.cprocsp.ACSP.tools.integrity.IntegrityInterface
    public int getLastStatus() {
        String property = this.options.getProperty(CSPIntegrityConstants.CHECK_INTEGRITY_LAST_STATUS);
        if (property == null) {
            return -1;
        }
        return !Boolean.valueOf(property).booleanValue() ? 1 : 0;
    }

    @Override // ru.cprocsp.ACSP.tools.integrity.IntegrityInterface
    public long getLastTime() {
        String property = this.options.getProperty(CSPIntegrityConstants.CHECK_INTEGRITY_LAST_DATE);
        if (property == null) {
            return 0L;
        }
        try {
            return Long.valueOf(property).longValue();
        } catch (NumberFormatException e) {
            Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
            return 0L;
        }
    }

    public static class DigestResource extends PropertyFile {

        public interface DigestVerifier {
            boolean verify();
        }

        public class DiskFileDigestVerifier extends FileDigestVerifier {
            private final String absolutePath;

            public DiskFileDigestVerifier(String str) {
                super();
                this.absolutePath = str;
            }

            @Override // ru.cprocsp.ACSP.tools.integrity.ACSPIntegrity.DigestResource.FileDigestVerifier
            public int calculateDigest(String str, byte[] bArr) {
                return CSPIntegrity.checkDigestOfFileOnDisk(32801, str, bArr);
            }

            @Override // ru.cprocsp.ACSP.tools.integrity.ACSPIntegrity.DigestResource.FileDigestVerifier
            public String getFilePath(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.absolutePath);
                return oyr.t(sb, File.separator, str);
            }
        }

        public abstract class FileDigestVerifier implements DigestVerifier {
            public FileDigestVerifier() {
            }

            public abstract int calculateDigest(String str, byte[] bArr);

            public abstract String getFilePath(String str);

            @Override // ru.cprocsp.ACSP.tools.integrity.ACSPIntegrity.DigestResource.DigestVerifier
            public boolean verify() {
                Enumeration keys = DigestResource.this.options.keys();
                boolean z = true;
                int i = 0;
                while (keys.hasMoreElements()) {
                    String str = (String) keys.nextElement();
                    z = z && calculateDigest(getFilePath(str), HexString.decodeHexBytes(DigestResource.this.options.getProperty(str))) == 0;
                    i++;
                }
                return i > 0 && z;
            }
        }

        public DigestResource(InputStream inputStream) throws Exception {
            super(inputStream);
        }

        public Set<Map.Entry<String, String>> getItems() {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.options.entrySet()) {
                hashSet.add(new AbstractMap.SimpleEntry((String) entry.getKey(), (String) entry.getValue()));
            }
            return hashSet;
        }

        public class ApkFileDigestVerifier extends FileDigestVerifier {
            private final List<ApkFile> apkFiles;
            private final String applicationPath;
            private final String relPath;

            public ApkFileDigestVerifier(String str, String str2, ApkFile[] apkFileArr) {
                super();
                this.applicationPath = str;
                this.relPath = str2;
                this.apkFiles = Arrays.asList(apkFileArr);
            }

            @Override // ru.cprocsp.ACSP.tools.integrity.ACSPIntegrity.DigestResource.FileDigestVerifier
            public int calculateDigest(String str, byte[] bArr) {
                ZipFile zipFile;
                IOException e;
                AabTree aabTree = new AabTree(this.applicationPath);
                ZipFile zipFile2 = null;
                ZipEntry zipEntry = null;
                for (ApkFile apkFile : this.apkFiles) {
                    try {
                        if (apkFile instanceof ApkFilter) {
                            aabTree.build((ApkFilter) apkFile);
                            Iterator<File> it = aabTree.getFiles().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ZipFile zipFile3 = new ZipFile(it.next().getAbsoluteFile());
                                try {
                                    zipEntry = zipFile3.getEntry(str);
                                    if (zipEntry != null) {
                                        zipFile2 = zipFile3;
                                        break;
                                    }
                                    zipFile2 = zipFile3;
                                } catch (IOException e2) {
                                    e = e2;
                                    zipFile = zipFile3;
                                    Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
                                    zipFile2 = zipFile;
                                }
                            }
                        } else {
                            zipFile = new ZipFile(apkFile.getFilePath());
                            try {
                                zipEntry = zipFile.getEntry(str);
                                zipFile2 = zipFile;
                            } catch (IOException e3) {
                                e = e3;
                                Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
                                zipFile2 = zipFile;
                            }
                        }
                    } catch (IOException e4) {
                        zipFile = zipFile2;
                        e = e4;
                    }
                    if (zipEntry != null) {
                        break;
                    }
                }
                if (zipFile2 != null && zipEntry != null) {
                    return CSPIntegrity.checkDigestOfFileInApk(32801, zipFile2, zipEntry, bArr);
                }
                Log.e(LogConstants.APP_LOGGER_TAG, "File " + str + " NOT found for integrity control.");
                return 1;
            }

            @Override // ru.cprocsp.ACSP.tools.integrity.ACSPIntegrity.DigestResource.FileDigestVerifier
            public String getFilePath(String str) {
                if (this.relPath == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.relPath);
                return oyr.t(sb, File.separator, str);
            }

            public ApkFileDigestVerifier(DigestResource digestResource, String str, ApkFile[] apkFileArr) {
                this(str, null, apkFileArr);
            }
        }
    }

    @Override // ru.cprocsp.ACSP.tools.integrity.IntegrityInterface
    public List<String> getItems() {
        return getItems(null, null, null);
    }

    public static int check(Context context, InputStream inputStream, Set<Map.Entry<String, String>> set) throws Exception {
        return checkFileOnDisk(context, inputStream, set);
    }
}
