package com.yandex.passport.internal.usecase;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class w2 extends cg6 {
    public y2 j;
    public com.yandex.passport.internal.d k;
    public Throwable l;
    public Object m;
    public Throwable n;
    public /* synthetic */ Object o;
    public final /* synthetic */ x2 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, cg6 cg6Var) {
        super(cg6Var);
        this.p = x2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, this);
    }
}
