package com.yandex.passport.internal.usecase;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class t2 extends cg6 {
    public com.yandex.passport.internal.l j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(v2 v2Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = v2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(null, this);
    }
}
