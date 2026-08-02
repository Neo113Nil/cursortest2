package ru.CryptoPro.JCPxml;

import java.io.IOException;
import java.net.URL;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PrivilegedAction;
import java.util.prefs.BackingStoreException;
import ru.CryptoPro.Install.ArgumentException;
import ru.CryptoPro.Install.ShellInstaller;

/* loaded from: classes4.dex */
public class SilentInstall {
    private SilentInstall() {
    }

    public static void main(String[] strArr) throws BackingStoreException, IOException, ArgumentException {
        ShellInstaller.makeAction((URL) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCPxml.SilentInstall.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                CodeSource codeSource = SilentInstall.class.getProtectionDomain().getCodeSource();
                if (codeSource != null) {
                    return codeSource.getLocation();
                }
                return null;
            }
        }), XMLInstall.ALL_INSTALL, XMLInstall.ALL_JARS, new String[]{"-install"});
    }
}
