package ru.CryptoPro.JCPRequest;

import defpackage.puu0;
import java.net.URL;
import java.security.AccessController;
import java.util.HashMap;
import ru.CryptoPro.Install.PackageInterface;
import ru.CryptoPro.Install.ShellInstaller;

/* loaded from: classes4.dex */
public class RequestInstall implements PackageInterface {
    public static final String[] a = {"JCPRequest.jar"};
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap(1);
        b = hashMap;
        hashMap.put(RequestInstall.class.getName(), "true");
    }

    public static void main(String[] strArr) {
        if (ShellInstaller.makeActionNoEx((URL) AccessController.doPrivileged(new puu0(16)), b, a, strArr)) {
            return;
        }
        System.exit(1);
    }
}
