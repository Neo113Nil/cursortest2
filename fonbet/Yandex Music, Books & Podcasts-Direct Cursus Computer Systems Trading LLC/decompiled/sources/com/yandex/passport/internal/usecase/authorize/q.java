package com.yandex.passport.internal.usecase.authorize;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class q extends cg6 {
    public p j;
    public /* synthetic */ Object k;
    public final /* synthetic */ r l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object u = this.l.u(null, this);
        return u == nm6.a ? u : new z7o(u);
    }
}
