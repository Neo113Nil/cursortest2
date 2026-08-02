package defpackage;

import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class z430 implements t6d0 {
    public final sls a;

    public z430(sls slsVar) {
        this.a = slsVar;
    }

    @Override // defpackage.t6d0
    public final PlusPayCompositeOfferDetails a(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails) {
        return ((Boolean) this.a.invoke()).booleanValue() ? plusPayCompositeOfferDetails : PlusPayCompositeOfferDetails.copy$default(plusPayCompositeOfferDetails, null, null, null, null, null, null, null, null, null, null, null, null, PlusPayAdditionalOffers.copy$default(plusPayCompositeOfferDetails.getAdditionalOffers(), null, null, EmptyList.a, null, null, 27, null), 4095, null);
    }
}
