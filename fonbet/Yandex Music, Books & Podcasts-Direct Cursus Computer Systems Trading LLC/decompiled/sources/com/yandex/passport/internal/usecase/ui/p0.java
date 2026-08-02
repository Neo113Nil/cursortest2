package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class p0 extends cg6 {
    public o0 j;
    public String k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ r0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r0 r0Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = r0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.u(null, this);
    }
}
