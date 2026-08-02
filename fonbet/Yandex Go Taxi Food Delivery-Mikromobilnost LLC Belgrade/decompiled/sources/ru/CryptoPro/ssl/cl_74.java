package ru.CryptoPro.ssl;

import java.security.PrivilegedExceptionAction;

/* loaded from: classes4.dex */
class cl_74 implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void run() throws Exception {
        Class.forName("sun.security.krb5.PrincipalName", true, null);
        return null;
    }
}
