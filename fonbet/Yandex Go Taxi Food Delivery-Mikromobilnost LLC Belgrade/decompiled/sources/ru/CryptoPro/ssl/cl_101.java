package ru.CryptoPro.ssl;

import java.security.AccessControlContext;
import java.security.PrivilegedExceptionAction;

/* loaded from: classes4.dex */
class cl_101 implements PrivilegedExceptionAction {
    public final /* synthetic */ AccessControlContext a;

    public cl_101(AccessControlContext accessControlContext) {
        this.a = accessControlContext;
    }

    @Override // java.security.PrivilegedExceptionAction
    public Object run() throws Exception {
        return cl_77.c(this.a);
    }
}
