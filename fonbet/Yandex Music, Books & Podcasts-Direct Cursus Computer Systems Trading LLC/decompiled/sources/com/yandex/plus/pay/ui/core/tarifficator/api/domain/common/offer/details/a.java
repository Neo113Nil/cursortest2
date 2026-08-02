package com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details;

import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.ihp;
import defpackage.kcc;
import defpackage.lhc;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class a {
    public static final PlusPayCompositeOfferDetails.PaymentMethod a(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, String str) {
        Object obj;
        plusPayCompositeOfferDetails.getClass();
        str.getClass();
        kcc kccVar = new kcc(new lhc(CollectionsKt.F(plusPayCompositeOfferDetails.getPaymentMethodsGroups()), new com.yandex.plus.pay.ui.common.internal.error.content.b(9), ihp.a));
        while (true) {
            if (!kccVar.hasNext()) {
                obj = null;
                break;
            }
            obj = kccVar.next();
            if (Intrinsics.d(((PlusPayCompositeOfferDetails.PaymentMethod) obj).getId(), str)) {
                break;
            }
        }
        return (PlusPayCompositeOfferDetails.PaymentMethod) obj;
    }
}
