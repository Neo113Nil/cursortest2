package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details;

import com.yandex.plus.core.data.common.b0;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.g;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k;
import defpackage.v75;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class e implements g {
    public final k a;

    public e(k kVar) {
        this.a = kVar;
    }

    @Override // com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.g
    public final PlusPayCompositeOfferDetails a(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails) {
        b0 widgetUrls;
        plusPayCompositeOfferDetails.getClass();
        List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups = plusPayCompositeOfferDetails.getPaymentMethodsGroups();
        ArrayList arrayList = new ArrayList(v75.o(paymentMethodsGroups, 10));
        for (PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup : paymentMethodsGroups) {
            List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods = paymentMethodsGroup.getPaymentMethods();
            ArrayList arrayList2 = new ArrayList(v75.o(paymentMethods, 10));
            for (PlusPayCompositeOfferDetails.PaymentMethod paymentMethod : paymentMethods) {
                if (paymentMethod.getType() == PlusPayCompositeOfferDetails.PaymentMethod.Type.CARD && (!((Boolean) this.a.invoke()).booleanValue() || ((widgetUrls = paymentMethod.getWidgetUrls()) != null && !widgetUrls.d()))) {
                    paymentMethod = PlusPayCompositeOfferDetails.PaymentMethod.copy$default(paymentMethod, null, null, null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
                }
                arrayList2.add(paymentMethod);
            }
            arrayList.add(PlusPayCompositeOfferDetails.PaymentMethodsGroup.copy$default(paymentMethodsGroup, null, arrayList2, null, 5, null));
        }
        return PlusPayCompositeOfferDetails.copy$default(plusPayCompositeOfferDetails, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, 6143, null);
    }
}
