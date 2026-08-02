package ru.CryptoPro.CAdES.installer;

import java.io.IOException;
import java.net.URL;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PrivilegedAction;
import java.util.prefs.BackingStoreException;
import ru.CryptoPro.Install.ArgumentException;
import ru.CryptoPro.Install.ShellInstaller;

/* loaded from: classes4.dex */
public class ManifestInstall {

    /* renamed from: ru.CryptoPro.CAdES.installer.ManifestInstall$1, reason: invalid class name */
    class AnonymousClass1 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Object run() {
            CodeSource codeSource = ManifestInstall.class.getProtectionDomain().getCodeSource();
            if (codeSource != null) {
                return codeSource.getLocation();
            }
            return null;
        }
    }

    public static void main(String[] strArr) throws BackingStoreException, IOException, ArgumentException {
        ShellInstaller.makeAction((URL) AccessController.doPrivileged(new AnonymousClass1()), Install.ALL_INSTALL, Install.ALL_JARS, new String[]{"-install"});
    }
}
