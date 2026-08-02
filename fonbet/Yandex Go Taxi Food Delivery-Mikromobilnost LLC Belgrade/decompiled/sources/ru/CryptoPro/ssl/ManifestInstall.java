package ru.CryptoPro.ssl;

import java.io.IOException;
import java.net.URL;
import java.security.AccessController;
import java.util.prefs.BackingStoreException;
import ru.CryptoPro.Install.ArgumentException;
import ru.CryptoPro.Install.ShellInstaller;

/* loaded from: classes4.dex */
public class ManifestInstall {
    public static void main(String[] strArr) throws BackingStoreException, IOException, ArgumentException {
        ShellInstaller.makeAction((URL) AccessController.doPrivileged(new cl_81()), JTLSInstall.ALL_INSTALL, JTLSInstall.ALL_JARS, new String[]{"-install"});
    }
}
