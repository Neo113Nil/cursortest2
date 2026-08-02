package ru.CryptoPro.ssl;

import java.security.PrivilegedExceptionAction;

/* loaded from: classes4.dex */
class cl_64 implements PrivilegedExceptionAction {
    public final /* synthetic */ cl_63 a;

    public cl_64(cl_63 cl_63Var) {
        this.a = cl_63Var;
    }

    @Override // java.security.PrivilegedExceptionAction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void run() throws Exception {
        this.a.C();
        return null;
    }
}
