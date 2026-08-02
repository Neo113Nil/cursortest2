package com.yandex.passport.data.network.core;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class n extends cg6 {
    public o j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ o m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return o.z(this.m, null, this);
    }
}
