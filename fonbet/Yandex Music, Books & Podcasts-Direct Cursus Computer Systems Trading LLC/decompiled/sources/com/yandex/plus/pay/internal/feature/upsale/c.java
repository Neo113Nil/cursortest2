package com.yandex.plus.pay.internal.feature.upsale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public PlusPayCompositeOffers.Offer j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
