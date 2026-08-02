package com.yandex.plus.home.graphql.configuration;

import defpackage.cg6;
import defpackage.qqi;

/* loaded from: classes5.dex */
public final class g extends cg6 {
    public qqi j;
    public /* synthetic */ Object k;
    public final /* synthetic */ j l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(this);
    }
}
