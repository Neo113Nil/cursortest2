package com.yandex.passport.internal.impl;

import com.yandex.passport.api.z1;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class l extends cg6 {
    public z1 j;
    public x k;
    public /* synthetic */ Object l;
    public final /* synthetic */ x m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object u = this.m.u(null, null, this);
        return u == nm6.a ? u : new z7o(u);
    }
}
