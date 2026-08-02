package com.yandex.plus.home.graphql.experiments;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ e l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0L, this);
    }
}
