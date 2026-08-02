package ru.CryptoPro.ssl;

import java.security.PrivilegedExceptionAction;
import javax.security.auth.Subject;

/* loaded from: classes4.dex */
class cl_17 implements PrivilegedExceptionAction {
    public final /* synthetic */ cl_16 a;

    public cl_17(cl_16 cl_16Var) {
        this.a = cl_16Var;
    }

    @Override // java.security.PrivilegedExceptionAction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Subject run() throws Exception {
        return cl_77.a(this.a.v());
    }
}
