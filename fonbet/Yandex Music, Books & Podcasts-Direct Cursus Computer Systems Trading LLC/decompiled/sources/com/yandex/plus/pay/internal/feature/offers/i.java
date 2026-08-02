package com.yandex.plus.pay.internal.feature.offers;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class i extends cg6 {
    public PlusPayCompositeOffers j;
    public com.yandex.plus.pay.api.analytics.c k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, this);
    }
}
