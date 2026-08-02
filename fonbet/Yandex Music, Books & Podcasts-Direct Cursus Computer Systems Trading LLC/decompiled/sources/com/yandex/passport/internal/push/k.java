package com.yandex.passport.internal.push;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class k extends cg6 {
    public com.yandex.passport.internal.l j;
    public h0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ m m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.j(null, null, this);
    }
}
