package ru.CryptoPro.ssl;

import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
class cl_94 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String run() {
        return System.getProperty("javax.net.ssl.sessionCacheSize");
    }
}
