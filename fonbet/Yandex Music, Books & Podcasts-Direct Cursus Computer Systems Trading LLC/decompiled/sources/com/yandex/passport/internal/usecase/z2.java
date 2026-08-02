package com.yandex.passport.internal.usecase;

import defpackage.xdr;
import java.io.Closeable;

/* loaded from: classes4.dex */
public final class z2 implements Closeable {
    public final /* synthetic */ a3 a;

    public z2(a3 a3Var) {
        this.a = a3Var;
        xdr xdrVar = (xdr) a3Var.c;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        xdr xdrVar = (xdr) this.a.c;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }
}
