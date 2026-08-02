package ru.CryptoPro.ssl;

import defpackage.ny61;
import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
class cl_78 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cl_79 run() {
        try {
            return (cl_79) Class.forName("ru.CryptoPro.ssl.krb5.Krb5ProxyImpl", true, null).newInstance();
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e) {
            ny61.f(e);
            return null;
        } catch (InstantiationException e2) {
            ny61.f(e2);
            return null;
        }
    }
}
