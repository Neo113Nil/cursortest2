package com.yandex.plus.home.plaque.repository.graphql;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class e extends cg6 {
    public com.yandex.plus.home.benchmark.b j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ g n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        Object h = g.h(this.n, null, 0, 0, this);
        return h == nm6.a ? h : new z7o(h);
    }
}
