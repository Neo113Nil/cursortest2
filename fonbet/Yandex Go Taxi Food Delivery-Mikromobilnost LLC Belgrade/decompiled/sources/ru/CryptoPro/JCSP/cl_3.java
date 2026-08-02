package ru.CryptoPro.JCSP;

import java.security.CodeSource;
import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
class cl_3 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public Object run() {
        CodeSource codeSource = ManifestInstall.class.getProtectionDomain().getCodeSource();
        if (codeSource != null) {
            return codeSource.getLocation();
        }
        return null;
    }
}
