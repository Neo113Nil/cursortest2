package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class f0 extends cg6 {
    public com.yandex.passport.internal.properties.l j;
    public com.yandex.passport.common.core.f k;
    public com.yandex.passport.common.core.f l;
    public com.yandex.passport.internal.l m;
    public /* synthetic */ Object n;
    public final /* synthetic */ h0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = h0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(null, null, null, this);
    }
}
