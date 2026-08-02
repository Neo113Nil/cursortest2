package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details;

import com.yandex.plus.core.data.common.b0;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.g;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k;
import defpackage.b6e;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class c implements g {
    public final com.yandex.plus.paymentsdk.internal.method.e a;
    public final k b;
    public final k c;

    public c(com.yandex.plus.paymentsdk.internal.method.e eVar, k kVar, k kVar2) {
        eVar.getClass();
        this.a = eVar;
        this.b = kVar;
        this.c = kVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (((java.lang.Boolean) r10.invoke()).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r7.d() == true) goto L31;
     */
    @Override // com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PlusPayCompositeOfferDetails a(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails) {
        plusPayCompositeOfferDetails.getClass();
        List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups = plusPayCompositeOfferDetails.getPaymentMethodsGroups();
        ArrayList arrayList = new ArrayList(v75.o(paymentMethodsGroups, 10));
        for (PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup : paymentMethodsGroups) {
            List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods = paymentMethodsGroup.getPaymentMethods();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : paymentMethods) {
                PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (PlusPayCompositeOfferDetails.PaymentMethod) obj;
                this.a.getClass();
                int i = b.a[paymentMethod.getType().ordinal()];
                boolean z = true;
                if (i != 1) {
                    if (i != 2) {
                        k kVar = this.b;
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    b6e.s();
                                    return null;
                                }
                                z = ((Boolean) kVar.invoke()).booleanValue();
                            }
                        }
                    } else {
                        if (((Boolean) this.c.invoke()).booleanValue()) {
                            b0 widgetUrls = paymentMethod.getWidgetUrls();
                            if (widgetUrls != null) {
                            }
                        }
                        z = false;
                    }
                }
                if (z) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(PlusPayCompositeOfferDetails.PaymentMethodsGroup.copy$default(paymentMethodsGroup, null, arrayList2, null, 5, null));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((PlusPayCompositeOfferDetails.PaymentMethodsGroup) next).getPaymentMethods().isEmpty()) {
                arrayList3.add(next);
            }
        }
        return PlusPayCompositeOfferDetails.copy$default(plusPayCompositeOfferDetails, null, null, null, null, null, null, null, null, null, null, null, arrayList3, null, 6143, null);
    }
}
