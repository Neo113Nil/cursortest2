package com.yandex.plus.home.graphql.experiments;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public com.yandex.plus.experiments.api.cache.f j;
    public com.yandex.plus.home.datasource.local.preferences.j k;
    public /* synthetic */ Object l;
    public final /* synthetic */ e m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(null, this);
    }
}
