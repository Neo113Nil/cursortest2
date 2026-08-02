package ru.CryptoPro.ssl;

import java.security.CodeSource;
import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
class cl_72 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public Object run() {
        CodeSource codeSource = JTLSInstall.class.getProtectionDomain().getCodeSource();
        if (codeSource != null) {
            return codeSource.getLocation();
        }
        return null;
    }
}
