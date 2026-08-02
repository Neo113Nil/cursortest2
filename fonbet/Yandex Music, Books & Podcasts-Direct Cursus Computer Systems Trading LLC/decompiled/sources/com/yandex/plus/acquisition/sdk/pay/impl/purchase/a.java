package com.yandex.plus.acquisition.sdk.pay.impl.purchase;

import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import com.yandex.plus.pay.api.analytics.d;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class a extends cg6 {
    public k j;
    public com.yandex.plus.pay.ui.tarifficator.api.b k;
    public d l;
    public PlusPayCompositeOffers.Offer m;
    public b n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ b q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, null, this);
    }
}
