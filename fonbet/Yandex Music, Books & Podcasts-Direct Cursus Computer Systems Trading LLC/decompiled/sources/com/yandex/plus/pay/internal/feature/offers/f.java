package com.yandex.plus.pay.internal.feature.offers;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.cg6;
import defpackage.tqn;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class f extends cg6 {
    public com.yandex.plus.pay.api.analytics.c j;
    public Function1 k;
    public tqn l;
    public com.yandex.plus.pay.internal.feature.offers.pre.a m;
    public PlusPayCompositeOffers n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ j r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, null, null, this);
    }
}
