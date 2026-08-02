package com.yandex.passport.internal.usecase;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class y1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ a2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(a2 a2Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = a2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object u = a2.u(this.k, null, null, null, null, null, this);
        return u == nm6.a ? u : new z7o(u);
    }
}
