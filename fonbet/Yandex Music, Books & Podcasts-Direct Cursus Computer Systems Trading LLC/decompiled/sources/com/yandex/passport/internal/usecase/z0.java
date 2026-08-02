package com.yandex.passport.internal.usecase;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class z0 extends cg6 {
    public a1 j;
    public com.yandex.passport.internal.credentials.f k;
    public /* synthetic */ Object l;
    public final /* synthetic */ a1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = a1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return a1.u(this.m, null, this);
    }
}
