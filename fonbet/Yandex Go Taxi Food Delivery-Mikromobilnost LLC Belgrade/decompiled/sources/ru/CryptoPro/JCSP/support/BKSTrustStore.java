package ru.CryptoPro.JCSP.support;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.cprocsp.ACSP.tools.common.HexString;
import ru.cprocsp.ACSP.util.UtilFile;
import ru.yandex.taxi.common_models.net.CacheStatus;

/* loaded from: classes4.dex */
public class BKSTrustStore {
    private static final String ROOT_CERTS_DIRECTORY = "root_certs";
    public static final String STORAGE_DIRECTORY = "security";
    public static final String STORAGE_FILE_TRUST = "cacerts";
    public static final char[] STORAGE_PASSWORD = {'c', 'h', 'a', 'n', 'g', 'e', 'i', 't'};
    public static final String STORAGE_TRUST = "Trust";
    public static final String STORAGE_TYPE = "BKS";

    /* renamed from: ru.CryptoPro.JCSP.support.BKSTrustStore$1, reason: invalid class name */
    public class AnonymousClass1 extends TrustStoreUpdater {
        final /* synthetic */ Context val$context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Context context2) {
            super(context);
            this.val$context = context2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$needUpdate$0(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }

        @Override // ru.CryptoPro.JCSP.support.MainUpdater
        public boolean needUpdate() {
            try {
                List certificateFiles = BKSTrustStore.getCertificateFiles(this.val$context.getAssets());
                certificateFiles.sort(new a());
                int hashCode = Arrays.hashCode(certificateFiles.toArray(new File[certificateFiles.size()]));
                String updateValue = getUpdateValue();
                if (updateValue == null) {
                    setUpdateValue(String.valueOf(hashCode));
                    return true;
                }
                if (Integer.parseInt(updateValue) == hashCode) {
                    return false;
                }
                setUpdateValue(String.valueOf(hashCode));
                return true;
            } catch (Exception e) {
                JCPLogger.thrown(e);
                return false;
            }
        }
    }

    private static boolean createOrUpdateStore(Context context, File file, char[] cArr, boolean z, boolean z2) {
        boolean z3;
        int i;
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder("Trying to ");
        sb.append(z2 ? "update" : "create");
        sb.append(" the store = ");
        sb.append(absolutePath);
        JCPLogger.fine(sb.toString());
        try {
            KeyStore keyStore = KeyStore.getInstance(STORAGE_TYPE);
            if (z2) {
                keyStore.load(new FileInputStream(file), cArr);
                i = keyStore.size();
            } else {
                keyStore.load(null, null);
                i = 0;
            }
            boolean z4 = true;
            if (z) {
                JCPLogger.fine("Adding certificates...");
                List<X509Certificate> readCertificates = readCertificates(context);
                Date time = Calendar.getInstance().getTime();
                for (X509Certificate x509Certificate : readCertificates) {
                    String hex = HexString.toHex(x509Certificate.getSerialNumber().toByteArray(), z4);
                    z3 = false;
                    if (x509Certificate.getNotAfter().before(time)) {
                        JCPLogger.fine("*** Certificate\nsn: " + HexString.toHex(x509Certificate.getSerialNumber().toByteArray(), true) + "\nsubject: " + x509Certificate.getSubjectDN() + "\nissuer: " + x509Certificate.getIssuerDN() + "\nvalid from: " + x509Certificate.getNotBefore() + "\nvalid till: " + x509Certificate.getNotAfter() + "\nhas not been stored because it expired!");
                    } else {
                        try {
                            String certificateAlias = keyStore.getCertificateAlias(x509Certificate);
                            if (certificateAlias != null) {
                                JCPLogger.info("*** Certificate\nsn: " + hex + "\nsubject: " + x509Certificate.getSubjectDN() + "\nissuer: " + x509Certificate.getIssuerDN() + "\nvalid from: " + x509Certificate.getNotBefore() + "\nvalid till: " + x509Certificate.getNotAfter() + "\nalready exists as " + certificateAlias);
                            } else {
                                keyStore.setCertificateEntry("root_csp_" + i + "_" + hex, x509Certificate);
                                i++;
                            }
                        } catch (Exception e) {
                            e = e;
                            JCPLogger.thrown(e);
                            return z3;
                        }
                    }
                    z4 = true;
                }
            }
            z3 = false;
            keyStore.store(new FileOutputStream(file), cArr);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Store has been ");
            sb2.append(z2 ? CacheStatus.SERIAL_UPDATED : "created");
            sb2.append(" = ");
            sb2.append(absolutePath);
            JCPLogger.fine(sb2.toString());
            return true;
        } catch (Exception e2) {
            e = e2;
            z3 = false;
        }
    }

    public static boolean createOrUpdateTrustStore(Context context, String str, String str2, char[] cArr) {
        if (cArr == null) {
            cArr = STORAGE_PASSWORD;
        }
        synchronized (BKSTrustStore.class) {
            try {
                File file = new File(str);
                if (!file.exists() && !file.mkdirs()) {
                    JCPLogger.warning("Couldn't create store directory = " + file.getAbsolutePath());
                    return false;
                }
                File file2 = new File(file, str2);
                boolean exists = file2.exists();
                if (!str2.equalsIgnoreCase("cacerts")) {
                    return createOrUpdateStore(context, file2, cArr, false, exists);
                }
                JCPLogger.fine("Checking if creating/updating is needed, store exists = " + exists);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, context);
                if (!anonymousClass1.needUpdate() || !createOrUpdateStore(context, file2, cArr, true, exists)) {
                    return true;
                }
                JCPLogger.fine("Store has been updated = " + anonymousClass1.markUpdated());
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<File> getCertificateFiles(AssetManager assetManager) throws Exception {
        String[] list = assetManager.list(ROOT_CERTS_DIRECTORY);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; list != null && i < list.length; i++) {
            String extractFileExtension = UtilFile.extractFileExtension(list[i]);
            if (extractFileExtension == null || !(extractFileExtension.equalsIgnoreCase("cer") || extractFileExtension.equalsIgnoreCase("crt") || extractFileExtension.equalsIgnoreCase("p7b"))) {
                JCPLogger.fine("File " + list[i] + " has been ignored.");
            } else {
                arrayList.add(new File(list[i]));
            }
        }
        return arrayList;
    }

    private static List<X509Certificate> readCertificates(Context context) throws Exception {
        ArrayList arrayList = new ArrayList();
        AssetManager assets = context.getAssets();
        List<File> certificateFiles = getCertificateFiles(assets);
        CertificateFactory certificateFactory = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
        Iterator<File> it = certificateFiles.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) certificateFactory.generateCertificate(assets.open(ROOT_CERTS_DIRECTORY + File.separator + it.next().getName())));
        }
        return arrayList;
    }
}
