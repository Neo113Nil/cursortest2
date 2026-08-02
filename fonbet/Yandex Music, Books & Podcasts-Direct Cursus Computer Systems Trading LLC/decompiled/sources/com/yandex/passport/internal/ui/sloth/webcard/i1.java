package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class i1 extends cg6 {
    public com.yandex.passport.sloth.data.g0 j;
    public com.yandex.passport.sloth.data.c k;
    public /* synthetic */ Object l;
    public final /* synthetic */ k1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = k1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return k1.a(this.m, this);
    }
}
