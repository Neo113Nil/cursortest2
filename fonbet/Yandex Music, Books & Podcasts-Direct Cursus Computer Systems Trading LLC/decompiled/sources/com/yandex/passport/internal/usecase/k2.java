package com.yandex.passport.internal.usecase;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class k2 extends cg6 {
    public l2 j;
    public j2 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ l2 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = l2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return l2.u(this.m, null, this);
    }
}
