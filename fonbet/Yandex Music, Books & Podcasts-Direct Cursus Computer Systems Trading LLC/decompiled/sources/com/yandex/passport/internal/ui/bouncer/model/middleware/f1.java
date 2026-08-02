package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class f1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ g1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = g1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object b = g1.b(this.k, null, this);
        return b == nm6.a ? b : new z7o(b);
    }
}
