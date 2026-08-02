package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class m1 extends cg6 {
    public com.yandex.passport.internal.ui.bouncer.model.b1 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ n1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = n1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return n1.b(this.l, null, this);
    }
}
