package com.yandex.passport.internal.usecase;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class z1 extends cg6 {
    public a2 j;
    public v1 k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ a2 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = a2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return a2.v(this.n, null, this);
    }
}
