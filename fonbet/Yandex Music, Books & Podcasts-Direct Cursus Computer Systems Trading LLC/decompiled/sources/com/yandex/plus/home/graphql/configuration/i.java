package com.yandex.plus.home.graphql.configuration;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class i extends cg6 {
    public com.yandex.plus.core.openapi.f j;
    public /* synthetic */ Object k;
    public final /* synthetic */ j l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object a = j.a(this.l, this);
        return a == nm6.a ? a : new z7o(a);
    }
}
