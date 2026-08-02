package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.internal.feature.offers.q;
import com.yandex.plus.pay.internal.feature.offers.r;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer;", "getSwitchOffer", "(Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;)Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer;", "Lcom/yandex/plus/pay/internal/feature/offers/r;", "toOfferDetailsConfiguration", "(Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;)Lcom/yandex/plus/pay/internal/feature/offers/r;", "pay-sdk_release"}, k = 2, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class PlusPayAdditionalOffersKt {
    public static final PlusPayAdditionalOffer getSwitchOffer(@NotNull PlusPayAdditionalOffers plusPayAdditionalOffers) {
        Object obj;
        plusPayAdditionalOffers.getClass();
        Iterator<T> it = plusPayAdditionalOffers.getOffers().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PlusPayAdditionalOffer) obj).getOfferSwitchToggle() != null) {
                break;
            }
        }
        return (PlusPayAdditionalOffer) obj;
    }

    @NotNull
    public static final r toOfferDetailsConfiguration(@NotNull PlusPayAdditionalOffers plusPayAdditionalOffers) {
        plusPayAdditionalOffers.getClass();
        List<PlusPayUpsaleStep> passedUpsaleSteps = plusPayAdditionalOffers.getPassedUpsaleSteps();
        List<PlusPayAdditionalOffer> offers = plusPayAdditionalOffers.getOffers();
        ArrayList arrayList = new ArrayList(v75.o(offers, 10));
        for (PlusPayAdditionalOffer plusPayAdditionalOffer : offers) {
            arrayList.add(new q(plusPayAdditionalOffer.getOffer().getOfferName(), plusPayAdditionalOffer.getOffer().getOffersBatchId(), plusPayAdditionalOffer.getOffer().getPositionId(), plusPayAdditionalOffer.getUpsaleStep(), plusPayAdditionalOffer.isSelected()));
        }
        return new r(arrayList, passedUpsaleSteps);
    }
}
