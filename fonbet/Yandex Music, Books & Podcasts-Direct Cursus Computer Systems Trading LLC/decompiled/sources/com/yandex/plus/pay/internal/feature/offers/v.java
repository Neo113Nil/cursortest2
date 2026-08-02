package com.yandex.plus.pay.internal.feature.offers;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class v extends cg6 {
    public String j;
    public com.yandex.plus.pay.api.analytics.c k;
    public com.yandex.plus.pay.api.feature.offers.a l;
    public com.yandex.plus.pay.log.impl.b m;
    public /* synthetic */ Object n;
    public final /* synthetic */ x o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, null, null, null, this);
    }
}
