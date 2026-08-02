package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class y extends cg6 {
    public x j;
    public /* synthetic */ Object k;
    public final /* synthetic */ z l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = zVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(null, this);
    }
}
