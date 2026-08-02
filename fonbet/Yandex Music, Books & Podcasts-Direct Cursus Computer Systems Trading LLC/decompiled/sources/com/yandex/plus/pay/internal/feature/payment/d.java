package com.yandex.plus.pay.internal.feature.payment;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.feature.offers.t;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public PlusPayCompositeOffers.Offer j;
    public t k;
    public com.yandex.plus.pay.log.impl.b l;
    public /* synthetic */ Object m;
    public final /* synthetic */ i n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, null, this);
    }
}
