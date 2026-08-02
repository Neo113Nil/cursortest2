package defpackage;

import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.b;
import com.yandex.plus.pay.internal.di.d;
import com.yandex.plus.pay.internal.feature.payment.a;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class und0 implements mod0 {
    public final add0 a;

    public und0(add0 add0Var) {
        this.a = add0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // defpackage.mod0
    public final lod0 a(ind0 ind0Var) {
        Object obj;
        ?? r3;
        PlusPayCompositeOffers.Offer.Vendor vendor;
        PlusPayAdditionalOffers additionalOffers;
        List<PlusPayAdditionalOffer> offers;
        PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
        Iterator it = ind0Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PlusTarifficatorPurchase) obj).getType() == PlusTarifficatorPurchase.Type.SILENT) {
                break;
            }
        }
        PlusTarifficatorPurchase plusTarifficatorPurchase2 = (PlusTarifficatorPurchase) obj;
        boolean l = jl40.l(plusTarifficatorPurchase2 != null ? plusTarifficatorPurchase2.getStatus() : null, PlusTarifficatorPurchase.Status.NotFinished.INSTANCE);
        PlusPayCompositeOfferDetails offerDetails = plusTarifficatorPurchase.getOfferDetails();
        if (offerDetails == null || (additionalOffers = offerDetails.getAdditionalOffers()) == null || (offers = additionalOffers.getOffers()) == null) {
            r3 = 0;
        } else {
            r3 = new ArrayList();
            for (Object obj2 : offers) {
                if (((PlusPayAdditionalOffer) obj2).isSelected()) {
                    r3.add(obj2);
                }
            }
        }
        if (r3 == 0) {
            r3 = EmptyList.a;
        }
        List list = r3;
        fpd0 e = ((b) this.a).e();
        PlusPayCompositeOffers.Offer offer = plusTarifficatorPurchase.getOffer();
        String paymentMethodId = plusTarifficatorPurchase.getPaymentMethodId();
        if (paymentMethodId == null) {
            ny61.g("paymentMethodId must not be null because of check in isAvailable");
            return null;
        }
        PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams = ind0Var.d;
        UUID uuid = ind0Var.a;
        Map map = ind0Var.e;
        a aVar = (a) e;
        aVar.getClass();
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if (tariffOffer == null || (vendor = tariffOffer.getVendor()) == null) {
            PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) kotlin.collections.a.R(offer.getOptionOffers());
            vendor = option != null ? option.getVendor() : null;
        }
        if (vendor != PlusPayCompositeOffers.Offer.Vendor.NATIVE) {
            ny61.g("Extended native payment is only for native offers");
            return null;
        }
        d dVar = (d) aVar.a;
        ibd0 ibd0Var = dVar.e;
        s5f s5fVar = (s5f) ibd0Var.r.getValue();
        c1u0 c1u0Var = (c1u0) ibd0Var.s.getValue();
        k0x0 k0x0Var = (k0x0) ibd0Var.t.getValue();
        com.yandex.plus.pay.internal.feature.cache.a b = ibd0Var.b();
        fad0 fad0Var = dVar.b;
        com.yandex.plus.pay.internal.feature.payment.p002native.a aVar2 = new com.yandex.plus.pay.internal.feature.payment.p002native.a(offer, paymentMethodId, uuid, l, plusPayPaymentAnalyticsParams, map, list, s5fVar, c1u0Var, k0x0Var, b, (qqx0) fad0Var.m.getValue(), dVar.d.b(), dVar.a.w, fad0Var.e);
        mdd0.c(aVar.b, gt90.b, aVar + ".startExtendedNativePayment(" + offer + Extension.FIX_SPACE + paymentMethodId + Extension.FIX_SPACE + plusPayPaymentAnalyticsParams.asString$pay_sdk_release() + Extension.FIX_SPACE + list + Extension.FIX_SPACE + uuid + ")=" + aVar2);
        return aVar2;
    }

    @Override // defpackage.mod0
    public final boolean b(ind0 ind0Var) {
        PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
        return (tpd.b(plusTarifficatorPurchase.getOffer()) == PlusPayCompositeOffers.Offer.Vendor.NATIVE) && (plusTarifficatorPurchase.getPaymentMethodId() != null);
    }
}
