package com.yandex.passport.internal.usecase;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class m0 extends cg6 {
    public com.yandex.passport.common.core.b j;
    public /* synthetic */ Object k;
    public final /* synthetic */ n0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = n0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(null, this);
    }
}
