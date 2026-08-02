package ru.CryptoPro.ssl;

import java.security.PrivilegedExceptionAction;
import javax.security.auth.Subject;

/* loaded from: classes4.dex */
class cl_100 implements PrivilegedExceptionAction {
    public final /* synthetic */ cl_99 a;

    public cl_100(cl_99 cl_99Var) {
        this.a = cl_99Var;
    }

    @Override // java.security.PrivilegedExceptionAction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Subject run() throws Exception {
        return cl_77.b(this.a.v());
    }
}
