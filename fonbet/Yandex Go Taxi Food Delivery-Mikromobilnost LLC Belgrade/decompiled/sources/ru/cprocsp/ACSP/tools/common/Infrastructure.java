package ru.cprocsp.ACSP.tools.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import defpackage.oyr;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.cprocsp.ACSP.tools.license.LicenseConstants;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class Infrastructure implements Constants {
    private final String appPath;
    private final Context applicationContext;

    public Infrastructure(Context context) {
        this.applicationContext = context;
        this.appPath = getApplicationPath(context);
    }

    private static boolean checkIfOptionSetInSystemProperty(String str, String[] strArr) {
        String property = System.getProperty(str);
        if (property == null) {
            return false;
        }
        boolean z = false;
        for (String str2 : strArr) {
            z = z || property.contains(str2);
        }
        return z;
    }

    public static boolean createSubDirectory(File file, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        File file2 = new File(oyr.t(sb, File.separator, str));
        if (file2.exists()) {
            return true;
        }
        return file2.mkdir();
    }

    public static boolean exists(File file, String str) {
        return new File(file, str).exists();
    }

    public static String getApplicationPath(Context context) {
        return context.getApplicationInfo().dataDir;
    }

    public static boolean isArm() {
        return checkIfOptionSetInSystemProperty("os.arch", new String[]{"arm", "arch64"});
    }

    public static boolean isIsCspLib64() {
        return checkIfOptionSetInSystemProperty("os.arch", new String[]{"64"});
    }

    private static boolean setPermissions(String str, String str2) {
        int i = -1;
        try {
            i = Runtime.getRuntime().exec("chmod " + str2 + " " + str).waitFor();
            if (i != 0) {
                Log.e(LogConstants.APP_LOGGER_TAG, "Chmod shell script failed. Returned code: " + i);
            }
        } catch (Exception e) {
            Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
        }
        return i == 0;
    }

    public boolean create() {
        File file = new File(this.appPath, CSPDirectoryConstants.DIRECTORY_CPROCSP);
        if (!file.exists()) {
            return file.mkdirs() && createSubDirectory(file, CSPDirectoryConstants.SUBDIRECTORY_ETC) && createSubDirectory(file, CSPDirectoryConstants.SUBDIRECTORY_TMP) && createSubDirectory(file, CSPDirectoryConstants.SUBDIRECTORY_KEYS) && createSubDirectory(file, CSPDirectoryConstants.SUBDIRECTORY_USERS);
        }
        file.toString();
        return true;
    }

    public boolean denyPermissions() {
        String licenseFile = getLicenseFile();
        File file = new File(getLicenseFile());
        return file.exists() && setPermissions(licenseFile, "700") && file.setReadable(false);
    }

    public Context getApplicationContext() {
        return this.applicationContext;
    }

    public ZipFile getCodeZipFile() throws IOException {
        return new ZipFile(this.applicationContext.getPackageCodePath());
    }

    public String getConfigFile() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEtcDirectory());
        sb.append(File.separator);
        sb.append(isIsCspLib64() ? ConfigConstants.FILE_CONFIG64 : ConfigConstants.FILE_CONFIG);
        return sb.toString();
    }

    public String getCproCspDirectory() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.appPath);
        return oyr.t(sb, File.separator, CSPDirectoryConstants.DIRECTORY_CPROCSP);
    }

    public String getEtcDirectory() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCproCspDirectory());
        return oyr.t(sb, File.separator, CSPDirectoryConstants.SUBDIRECTORY_ETC);
    }

    public String getKeysDirectory() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCproCspDirectory());
        return oyr.t(sb, File.separator, CSPDirectoryConstants.SUBDIRECTORY_KEYS);
    }

    public String getKeysDirectoryPath() {
        return getKeysDirectory() + File.separator + getUserDirUid();
    }

    public String getLicenseFile() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEtcDirectory());
        return oyr.t(sb, File.separator, LicenseConstants.FILE_LICENSE);
    }

    public String getRootStoreFile() {
        StringBuilder sb = new StringBuilder();
        sb.append(getStoresDirectory());
        return oyr.t(sb, File.separator, CSPDirectoryConstants.FILE_USERS_STORES_ROOT);
    }

    public String getStoresDirectory() {
        StringBuilder sb = new StringBuilder();
        sb.append(getUsersDirectory());
        return oyr.t(sb, File.separator, CSPDirectoryConstants.SUBDIRECTORY_USERS_STORES);
    }

    public String getTmpDirectory() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCproCspDirectory());
        return oyr.t(sb, File.separator, CSPDirectoryConstants.SUBDIRECTORY_TMP);
    }

    public String getUserDirUid() {
        ApplicationInfo applicationInfo = this.applicationContext.getApplicationInfo();
        return String.valueOf(applicationInfo.uid) + Extension.DOT_CHAR + String.valueOf(applicationInfo.uid);
    }

    public String getUsersDirectory() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCproCspDirectory());
        return oyr.t(sb, File.separator, CSPDirectoryConstants.SUBDIRECTORY_USERS);
    }

    public String getApplicationPath() {
        return this.appPath;
    }
}
