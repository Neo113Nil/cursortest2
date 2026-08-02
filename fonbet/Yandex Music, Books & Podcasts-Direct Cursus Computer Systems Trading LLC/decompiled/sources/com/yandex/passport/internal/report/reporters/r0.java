package com.yandex.passport.internal.report.reporters;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class r0 extends cg6 {
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ t0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = t0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.A(this);
    }
}
