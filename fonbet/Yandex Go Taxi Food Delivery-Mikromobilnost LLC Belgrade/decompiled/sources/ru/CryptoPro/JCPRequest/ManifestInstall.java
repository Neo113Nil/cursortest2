package ru.CryptoPro.JCPRequest;

import defpackage.puu0;
import java.io.IOException;
import java.net.URL;
import java.security.AccessController;
import java.util.prefs.BackingStoreException;
import ru.CryptoPro.Install.ArgumentException;
import ru.CryptoPro.Install.ShellInstaller;

/* loaded from: classes4.dex */
public class ManifestInstall {
    public static void main(String[] strArr) throws BackingStoreException, IOException, ArgumentException {
        ShellInstaller.makeAction((URL) AccessController.doPrivileged(new puu0(12)), RequestInstall.b, RequestInstall.a, new String[]{"-install"});
    }
}
