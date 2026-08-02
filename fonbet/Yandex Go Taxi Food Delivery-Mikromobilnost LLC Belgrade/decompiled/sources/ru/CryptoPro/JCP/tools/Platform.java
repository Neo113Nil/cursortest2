package ru.CryptoPro.JCP.tools;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.htf0;
import defpackage.hx61;
import defpackage.x4e;
import defpackage.yq61;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Locale;
import ru.CryptoPro.JCP.pref.BundleChooser;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes4.dex */
public class Platform {
    public static final String AIX = "AIX";
    public static final String CP_1251_PATTERN = "1251";
    public static final String CP_866_PATTERN = "866";
    public static final String CP_IBM866 = "IBM866";
    public static final String CP_KOI8R = "KOI8-R";
    public static final String CP_KOI8R_PATTERN = "koi8";
    public static final String CP_UTF8 = "UTF-8";
    public static final String CP_UTF8_PATTERN = "utf";
    public static final String CP_WIN1251 = "windows-1251";
    public static final String E2K = "E2K";
    public static final String LANG_VAR_NAME = "LANG";
    public static final String MAC_OS_X = "MAC OS";
    public static final String SPACE = " ";
    public static final String STR_ANDROID = "Android";
    public static final String STR_FILE_ENCODING = "file.encoding";
    public static final String[] STR_IBM;
    public static final String[] STR_OPENJDK;
    public static final String STR_RUNTIME_VENDOR_PROPERTY = "java.runtime.vendor";
    public static final String STR_VENDOR_PROPERTY = "java.vendor";
    public static final String STR_VM_VENDOR_PROPERTY = "java.vm.vendor";
    public static final String UNIX_POINT_SEPARATOR = "\\u002E";
    public static final String WINDOWS = "Windows";
    public static final String WIN_COMMAND = "cmd /c chcp";
    public static final String WIN_SEPARATOR = ":";
    public static final String[] a = {"redhat-release", "SuSE-release", "lsb-release", "os-release"};
    public static final String[] b = {"server", "2003", "2008", "2012", "2016", "2019", "2022"};
    public static final String[] c = {"server", "solaris", "freebsd", "aix", "hp-ux"};
    public static final String[] d = {"workstation", "desktop", "opensuse", "fedora", "debian", "suse linux 9", "suse linux 10", "lite", "linux mint"};
    public static final String[] e = {"linux es", "linux as"};
    public static final String[] f = {"linux ws", "workstation"};
    public static final String[] g;
    public static final boolean isAndroid;
    public static final boolean isIbm;
    public static final boolean isSun;

    static {
        String[] strArr = {"Ibm"};
        STR_IBM = strArr;
        String[] strArr2 = {"Oracle", "Sun", "BellSoft", "Amazon.com Inc.", "Eclipse Adoptium", "Eclipse OpenJ9", "Temurin", "Axiom", "Laboratory 50"};
        STR_OPENJDK = strArr2;
        boolean producedBy = producedBy(strArr2);
        isSun = producedBy;
        isIbm = producedBy(strArr) && !producedBy;
        isAndroid = producedBy("Android");
        g = new String[]{"distrib_description", "pretty_name", "distrib_id", "name", "id"};
    }

    public static String convertEncoding(String str) {
        return str.indexOf(CP_866_PATTERN) != -1 ? findCharsetPattern(CP_866_PATTERN) : str.indexOf(CP_1251_PATTERN) != -1 ? findCharsetPattern(CP_1251_PATTERN) : str;
    }

    public static String determineEncoding() {
        return isWindows() ? getWindowsEncoding() : getUnixEncoding();
    }

    public static String findCharsetPattern(String str) {
        for (Charset charset : Charset.availableCharsets().values()) {
            if (charset.toString().indexOf(str) != -1) {
                return charset.toString();
            }
        }
        return "";
    }

    public static String getEnv(String str) {
        return (String) AccessController.doPrivileged(new htf0(str, 7));
    }

    public static String getOSName() {
        return System.getProperty("os.name");
    }

    public static String getOSNameEx() {
        String readLinuxVersion;
        return (isWindows() || isMacOS() || (readLinuxVersion = readLinuxVersion()) == null || readLinuxVersion.length() == 0) ? getOSName() : readLinuxVersion;
    }

    public static String getOSNameExReduced() {
        String oSNameEx = getOSNameEx();
        StringBuilder sb = new StringBuilder();
        if (isWindows() || isMacOS()) {
            sb.append(oSNameEx);
        } else if (oSNameEx != null && oSNameEx.length() != 0) {
            String[] split = oSNameEx.split("\n");
            for (String str : g) {
                for (String str2 : split) {
                    int indexOf = str2.toLowerCase().indexOf(str);
                    if (indexOf > -1) {
                        int indexOf2 = str2.indexOf(61, indexOf);
                        if ((!str.equals("name") && !str.equals("id")) || (indexOf <= 0 && indexOf2 == str.length())) {
                            return indexOf2 > -1 ? str2.substring(indexOf2 + 1) : str2;
                        }
                    }
                }
            }
            for (String str3 : split) {
                sb.append(str3);
                sb.append("<BR>");
            }
        }
        return sb.toString();
    }

    public static String getPlatformArch() {
        return System.getProperty("os.arch");
    }

    public static String getPlatformDescription() {
        return getProcAmountString(Runtime.getRuntime().availableProcessors()) + " " + getPlatformArch() + Extension.FIX_SPACE + getOSNameEx();
    }

    public static String getProcAmountString(int i) {
        return BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres").getString(i != 1 ? i != 2 ? "panel.licensePage.ProcessorN.lic" : "panel.licensePage.Processor2.lic" : "panel.licensePage.Processor1.lic");
    }

    public static String getProperty(String str) {
        return (String) AccessController.doPrivileged(new htf0(str, 8));
    }

    public static String getUnixEncoding(String str) {
        try {
            str = str.split(UNIX_POINT_SEPARATOR)[1];
        } catch (Throwable unused) {
        }
        return (str == null || str.length() == 0) ? "UTF-8" : str;
    }

    public static String getWindowsEncoding() {
        String str;
        try {
            String str2 = new String(hx61.b());
            str = str2.indexOf(CP_866_PATTERN) != -1 ? CP_IBM866 : str2.indexOf(CP_1251_PATTERN) != -1 ? "windows-1251" : str2.split(":")[1].trim();
        } catch (Throwable unused) {
            str = null;
        }
        return (str == null || str.length() == 0) ? CP_IBM866 : str;
    }

    public static boolean is64Bit() {
        String property = System.getProperty("sun.arch.data.model", System.getProperty("com.ibm.vm.bitmode"));
        if (property != null) {
            return "64".equals(property);
        }
        String platformArch = getPlatformArch();
        if ("x86_64".equals(platformArch) || "amd64".equals(platformArch) || "ia64".equals(platformArch) || "powerpc64".equals(platformArch)) {
            return true;
        }
        return ("ppc64".equals(platformArch) && !isBigEndian()) || "aarch64".equals(platformArch);
    }

    public static boolean is86Arch() {
        String platformArch = getPlatformArch();
        return platformArch.equalsIgnoreCase("x86") || platformArch.equalsIgnoreCase("i386") || platformArch.equalsIgnoreCase("i486") || platformArch.equalsIgnoreCase("i586") || platformArch.equalsIgnoreCase("i686") || platformArch.equalsIgnoreCase("x64") || platformArch.equalsIgnoreCase("amd64");
    }

    public static boolean isAIX() {
        return getOSName().toLowerCase().contains(AIX.toLowerCase());
    }

    public static boolean isBigEndian() {
        return System.getProperty("sun.cpu.endian").trim().toUpperCase().equals("BIG");
    }

    public static boolean isElbrus() {
        return (isWindows() || isMacOS() || isAIX() || !getPlatformArch().toLowerCase().startsWith(E2K.toLowerCase())) ? false : true;
    }

    public static boolean isMacOS() {
        return getOSName().toLowerCase().contains(MAC_OS_X.toLowerCase());
    }

    public static boolean isServerLinux(String str) {
        if (searchVer(c, str)) {
            return true;
        }
        if (searchVer(d, str)) {
            return false;
        }
        return (searchVer(new String[]{"red hat", "GosLinux"}, str) && !searchVer(e, str) && searchVer(f, str)) ? false : true;
    }

    public static boolean isServerPlatform(String str) {
        if (isMacOS()) {
            return false;
        }
        if (!is86Arch()) {
            return true;
        }
        String lowerCase = str.toLowerCase();
        if (isWindows()) {
            return searchVer(b, lowerCase);
        }
        if (searchVer(c, lowerCase)) {
            return true;
        }
        String readLinuxVersion = readLinuxVersion();
        return readLinuxVersion.length() != 0 ? isServerLinux(readLinuxVersion.toLowerCase()) : isServerLinux(lowerCase);
    }

    public static boolean isValidEncoding(String str) {
        try {
            new String(new byte[0], str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isWindows() {
        return getOSName().toLowerCase().contains(WINDOWS.toLowerCase());
    }

    public static void print(String str) {
        System.out.getClass();
        System.out.getClass();
    }

    public static void printAllCharsets() {
        for (Charset charset : Charset.availableCharsets().values()) {
            PrintStream printStream = System.out;
            charset.toString();
            printStream.getClass();
        }
    }

    public static boolean producedBy(String str) {
        String str2;
        String str3;
        String str4 = null;
        try {
            str2 = getProperty(STR_VENDOR_PROPERTY);
        } catch (Throwable unused) {
            str2 = null;
        }
        try {
            str3 = getProperty(STR_VM_VENDOR_PROPERTY);
        } catch (Throwable unused2) {
            str3 = null;
        }
        try {
            str4 = getProperty(STR_RUNTIME_VENDOR_PROPERTY);
        } catch (Throwable unused3) {
        }
        return (str2 != null && str2.length() != 0 && str2.toLowerCase().indexOf(str.toLowerCase()) != -1) || (str3 != null && str3.length() != 0 && str3.toLowerCase().indexOf(str.toLowerCase()) != -1) || (str4 != null && str4.length() != 0 && str4.toLowerCase().indexOf(str.toLowerCase()) != -1);
    }

    public static String readLinuxVersion() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            StringBuilder sb2 = new StringBuilder();
            String str = File.separator;
            x4e.C(sb2, str, CSPDirectoryConstants.SUBDIRECTORY_ETC, str);
            sb2.append(a[i]);
            File file = new File(sb2.toString());
            String readVersion = (file.exists() && file.isFile()) ? readVersion(file) : null;
            if (readVersion != null) {
                sb.append(readVersion);
            }
        }
        return sb.toString();
    }

    public static String readVersion(File file) {
        FileInputStream fileInputStream;
        StringBuilder sb = new StringBuilder();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (IOException unused) {
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String trim = readLine.trim();
                    if (!trim.startsWith(ShimmerDivHandler.NUMBER_SING)) {
                        sb.append(trim);
                        sb.append("\n");
                    }
                }
                fileInputStream.close();
            } catch (IOException unused2) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return sb.toString();
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        return sb.toString();
    }

    public static boolean searchVer(String[] strArr, String str) {
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (str.indexOf(strArr[i2]) != -1 || str.indexOf(strArr[i2].toLowerCase()) != -1 || str.indexOf(strArr[i2].toUpperCase()) != -1) {
                i++;
            }
        }
        return i > 0;
    }

    public static void setEncoding() {
        String property = getProperty("file.encoding");
        if (property == null || property.length() == 0 || (isWindows() && property.indexOf(CP_1251_PATTERN) != -1)) {
            String determineEncoding = determineEncoding();
            String convertEncoding = convertEncoding(determineEncoding);
            if (convertEncoding != null && convertEncoding.length() != 0 && (!isSun || !isWindows())) {
                setProperty("file.encoding", convertEncoding);
            } else {
                print(determineEncoding);
                Locale.setDefault(Locale.ENGLISH);
            }
        }
    }

    public static void setProperty(String str, String str2) {
        AccessController.doPrivileged(new yq61(str, str2));
    }

    public static String getUnixEncoding() {
        return getUnixEncoding(getEnv(LANG_VAR_NAME));
    }

    public static boolean isServerPlatform() {
        return isServerPlatform(getOSName());
    }

    public static boolean producedBy(String[] strArr) {
        for (String str : strArr) {
            if (producedBy(str)) {
                return true;
            }
        }
        return false;
    }
}
