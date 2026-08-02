package com.yandex.passport.data.network;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class u7 extends cg6 {
    public com.yandex.passport.common.network.n j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v7 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(v7 v7Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = v7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
