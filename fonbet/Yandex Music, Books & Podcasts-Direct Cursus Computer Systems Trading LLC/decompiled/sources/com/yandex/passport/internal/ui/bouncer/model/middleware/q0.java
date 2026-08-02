package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class q0 extends cg6 {
    public com.yandex.passport.internal.ui.domik.x j;
    public /* synthetic */ Object k;
    public final /* synthetic */ r0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = r0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
