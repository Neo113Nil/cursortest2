package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class n extends cg6 {
    public com.yandex.plus.pay.adapter.api.i j;
    public /* synthetic */ Object k;
    public final /* synthetic */ com.yandex.passport.data.network.l l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.yandex.passport.data.network.l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.A(null, null, null, this);
    }
}
