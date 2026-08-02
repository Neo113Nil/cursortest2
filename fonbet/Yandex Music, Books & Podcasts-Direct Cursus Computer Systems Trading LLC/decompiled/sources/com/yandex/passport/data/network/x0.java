package com.yandex.passport.data.network;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class x0 extends cg6 {
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ y0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = y0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.x(null, this);
    }
}
