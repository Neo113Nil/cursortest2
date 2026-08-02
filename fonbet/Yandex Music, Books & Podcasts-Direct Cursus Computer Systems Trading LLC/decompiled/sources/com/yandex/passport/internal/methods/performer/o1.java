package com.yandex.passport.internal.methods.performer;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class o1 extends cg6 {
    public com.yandex.passport.common.core.f j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ p1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p1 p1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = p1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return p1.a(this.m, null, null, this);
    }
}
