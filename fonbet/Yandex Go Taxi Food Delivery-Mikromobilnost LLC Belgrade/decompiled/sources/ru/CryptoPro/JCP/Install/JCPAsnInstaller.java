package ru.CryptoPro.JCP.Install;

import defpackage.puu0;
import java.net.URL;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import ru.CryptoPro.Install.PackageInterface;
import ru.CryptoPro.Install.ShellInstaller;

/* loaded from: classes4.dex */
public class JCPAsnInstaller implements PackageInterface {
    public static final String PACKAGE_NICKNAME = "JCPAsn";
    public static final String[] a;
    public static final HashMap b;

    static {
        ResourceBundle.getBundle(JCPInstaller.BUNDLE_NAME, Locale.getDefault());
        a = new String[]{"ASN1P.jar"};
        HashMap hashMap = new HashMap(1);
        b = hashMap;
        hashMap.put(JCPAsnInstaller.class.getName(), "true");
    }

    public static void main(String[] strArr) {
        if (ShellInstaller.makeActionNoEx((URL) AccessController.doPrivileged(new puu0(1)), b, a, strArr)) {
            return;
        }
        System.exit(1);
    }
}
