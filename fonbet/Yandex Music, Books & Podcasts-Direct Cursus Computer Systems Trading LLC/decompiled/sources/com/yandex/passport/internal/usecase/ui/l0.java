package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class l0 extends cg6 {
    public k0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ m0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = m0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(null, this);
    }
}
