package ru.CryptoPro.ssl;

import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
class cl_76 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Class run() {
        try {
            return Class.forName("ru.CryptoPro.ssl.krb5.KerberosClientKeyExchangeImpl", true, null);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
