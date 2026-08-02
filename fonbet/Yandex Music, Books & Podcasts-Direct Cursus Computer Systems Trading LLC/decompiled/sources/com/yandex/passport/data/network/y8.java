package com.yandex.passport.data.network;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class y8 extends cg6 {
    public com.yandex.passport.common.network.n j;
    public /* synthetic */ Object k;
    public final /* synthetic */ z8 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(z8 z8Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = z8Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
