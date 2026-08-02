package com.yandex.plus.home.feature.webviews.internal.purchase.subscription;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public String j;
    public String k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, this);
    }
}
