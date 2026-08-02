package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class p1 extends cg6 {
    public com.yandex.passport.sloth.d1 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ q1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = q1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.G(null, 0L, this);
    }
}
