package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class s1 extends cg6 {
    public com.yandex.passport.sloth.data.m j;
    public com.yandex.passport.sloth.d1 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ t1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = t1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
