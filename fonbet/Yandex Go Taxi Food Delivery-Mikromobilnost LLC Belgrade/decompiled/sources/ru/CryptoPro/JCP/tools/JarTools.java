package ru.CryptoPro.JCP.tools;

import defpackage.bs61;
import defpackage.cr61;
import defpackage.hr61;
import defpackage.qr61;
import java.net.JarURLConnection;
import java.net.URL;
import java.security.AccessController;
import java.util.jar.JarFile;

/* loaded from: classes4.dex */
public class JarTools {
    public static final String ATTRIBUTE_BUNDLE_NAME = "ru.CryptoPro.JCP.version.resources.ver";

    public static URL getClassURL(Class cls) {
        if (Platform.isAndroid) {
            return null;
        }
        return (URL) AccessController.doPrivileged(new qr61(0, cls));
    }

    public static String getFromManifest(Class cls, String str, String str2) {
        return (String) AccessController.doPrivileged(new cr61(cls, str2, str));
    }

    public static JarFile getJAR(URL url) throws Exception {
        if (!url.getProtocol().equalsIgnoreCase("jar")) {
            url = new URL("jar:" + url.toString() + "!/");
        }
        JarURLConnection jarURLConnection = (JarURLConnection) AccessController.doPrivileged(new hr61(1, url));
        jarURLConnection.setUseCaches(false);
        return jarURLConnection.getJarFile();
    }

    public static String getJarName(String str, boolean z) {
        return (String) AccessController.doPrivileged(new bs61(str, z));
    }

    public static String getYear(Class cls) {
        return (String) AccessController.doPrivileged(new qr61(1, cls));
    }

    public static String getFromManifest(String str, String str2, String str3) {
        try {
            return getFromManifest(Class.forName(str), str2, str3);
        } catch (Exception unused) {
            return null;
        }
    }

    public static JarFile getJAR(Class cls) throws Exception {
        if (Platform.isAndroid) {
            return null;
        }
        return getJAR(getClassURL(cls));
    }
}
