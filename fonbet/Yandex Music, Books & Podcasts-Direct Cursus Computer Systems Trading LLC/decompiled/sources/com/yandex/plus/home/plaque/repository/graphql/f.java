package com.yandex.plus.home.plaque.repository.graphql;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class f extends cg6 {
    public String j;
    public String k;
    public com.yandex.passport.internal.flags.experiments.p l;
    public /* synthetic */ Object m;
    public final /* synthetic */ g n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return g.i(this.n, null, null, null, this);
    }
}
