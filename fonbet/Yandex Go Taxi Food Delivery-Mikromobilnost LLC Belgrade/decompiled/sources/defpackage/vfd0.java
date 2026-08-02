package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import java.util.Map;

/* loaded from: classes2.dex */
public interface vfd0 {
    default void a(PlusPayCompositeOffers.Offer offer, int i, String str, String str2, String str3, Map map) {
        ((wqx0) this).f(i, offer.getMeta().getSessionId(), offer.getMeta().getOffersBatchId(), offer.getPositionId(), str, str2, str3, map);
    }

    default void b(PlusPayCompositeOffers.Offer offer, int i, String str, String str2, String str3, Map map) {
        ((wqx0) this).e(i, offer.getMeta().getSessionId(), offer.getMeta().getOffersBatchId(), offer.getPositionId(), str, str2, str3, map);
    }
}
