package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import defpackage.cg6;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public PlusPayCompositeOfferDetails j;
    public PlusPayMailingAdsAgreement k;
    public Function2 l;
    public PlusPayAdditionalOffer m;
    public String n;
    public List o;
    public List p;
    public String q;
    public String r;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a s;
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.v = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, false, null, null, null, this);
    }
}
