package com.yandex.plus.pay.internal.feature.offers.post;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public PlusPayCompositeOffers j;
    public String k;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ d n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
