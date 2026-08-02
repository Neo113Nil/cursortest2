package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details;

import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.g;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k;
import defpackage.c5b;

/* loaded from: classes5.dex */
public final class d implements g {
    public final k a;

    public d(k kVar) {
        this.a = kVar;
    }

    @Override // com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.g
    public final PlusPayCompositeOfferDetails a(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails) {
        plusPayCompositeOfferDetails.getClass();
        return ((Boolean) this.a.invoke()).booleanValue() ? plusPayCompositeOfferDetails : PlusPayCompositeOfferDetails.copy$default(plusPayCompositeOfferDetails, null, null, null, null, null, null, null, null, null, null, null, null, PlusPayAdditionalOffers.copy$default(plusPayCompositeOfferDetails.getAdditionalOffers(), null, null, c5b.a, null, null, 27, null), 4095, null);
    }
}
