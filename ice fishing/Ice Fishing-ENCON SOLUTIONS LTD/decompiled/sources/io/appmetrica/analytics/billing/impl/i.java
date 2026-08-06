package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class i implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c fromModel(BillingInfo billingInfo) {
        c cVar = new c();
        int i2 = h.f3555a[billingInfo.type.ordinal()];
        cVar.f3544a = i2 != 1 ? i2 != 2 ? 1 : 3 : 2;
        cVar.f3545b = billingInfo.productId;
        cVar.f3546c = billingInfo.purchaseToken;
        cVar.f3547d = billingInfo.purchaseTime;
        cVar.f3548e = billingInfo.sendTime;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BillingInfo toModel(c cVar) {
        ProductType productType;
        int i2 = cVar.f3544a;
        if (i2 == 2) {
            productType = ProductType.INAPP;
        } else if (i2 != 3) {
            productType = ProductType.UNKNOWN;
        } else {
            productType = ProductType.SUBS;
        }
        return new BillingInfo(productType, cVar.f3545b, cVar.f3546c, cVar.f3547d, cVar.f3548e);
    }
}
