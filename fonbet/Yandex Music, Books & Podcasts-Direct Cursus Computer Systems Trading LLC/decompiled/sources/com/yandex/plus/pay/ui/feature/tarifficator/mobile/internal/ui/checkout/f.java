package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.cg6;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class f extends cg6 {
    public PlusPayCompositeOfferDetails.PaymentPromo j;
    public Function2 k;
    public String l;
    public CharSequence m;
    public com.yandex.plus.core.data.common.y n;
    public /* synthetic */ Object o;
    public final /* synthetic */ h p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.f(null, null, this);
    }
}
