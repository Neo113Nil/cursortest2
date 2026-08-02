package com.yandex.plus.home.graphql.panel;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public com.yandex.plus.home.benchmark.b j;
    public Function2 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object d = this.m.d(null, null, null, this);
        return d == nm6.a ? d : new z7o(d);
    }
}
