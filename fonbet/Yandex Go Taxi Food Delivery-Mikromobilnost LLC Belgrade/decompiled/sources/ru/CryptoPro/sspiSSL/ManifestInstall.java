package ru.CryptoPro.sspiSSL;

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
        ShellInstaller.makeAction((URL) AccessController.doPrivileged(new puu0(5)), JSSPIInstall.ALL_INSTALL, JSSPIInstall.ALL_JARS, new String[]{"-install"});
    }
}
