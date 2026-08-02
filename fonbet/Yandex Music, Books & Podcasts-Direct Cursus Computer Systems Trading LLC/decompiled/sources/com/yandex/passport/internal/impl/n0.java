package com.yandex.passport.internal.impl;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class n0 extends cg6 {
    public boolean j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ q0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = q0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(false, false, this);
    }
}
