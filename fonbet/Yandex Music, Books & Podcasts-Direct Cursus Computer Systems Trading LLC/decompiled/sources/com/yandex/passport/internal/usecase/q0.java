package com.yandex.passport.internal.usecase;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class q0 extends cg6 {
    public com.yandex.passport.internal.l j;
    public com.yandex.passport.internal.credentials.f k;
    public /* synthetic */ Object l;
    public final /* synthetic */ s0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = s0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object v = this.m.v(null, null, null, this);
        return v == nm6.a ? v : new z7o(v);
    }
}
