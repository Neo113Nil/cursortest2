package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public c j;
    public /* synthetic */ Object k;
    public final /* synthetic */ e l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object u = this.l.u(null, this);
        return u == nm6.a ? u : new z7o(u);
    }
}
