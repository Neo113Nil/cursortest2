package com.yandex.plus.pay.ui.common.internal.error.content;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.b6e;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class d {
    public final com.yandex.plus.pay.ui.core.api.common.a a;

    public d(com.yandex.plus.pay.ui.core.api.common.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public static void d(j jVar) {
        jVar.d(R.string.PlusPay_Error_Google_Common_Title);
        jVar.c(R.string.PlusPay_Error_Google_Common_Subtitle);
        jVar.g.add(e.b);
    }

    public final h a(PlusPayCompositeOffers.Offer offer, com.yandex.plus.pay.ui.api.feature.payment.g gVar) {
        offer.getClass();
        gVar.getClass();
        boolean z = gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.a;
        com.yandex.plus.pay.ui.core.api.common.a aVar = this.a;
        if (z) {
            switch (((com.yandex.plus.pay.ui.api.feature.payment.a) gVar).a.ordinal()) {
                case 0:
                    return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(23));
                case 1:
                    return g.a(offer, aVar, new b(3));
                case 2:
                    return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(17));
                case 3:
                    return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(21));
                case 4:
                    return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(26));
                case 5:
                    return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(18));
                case 6:
                    return g.a(offer, aVar, new a(this, 3));
                case 7:
                    return g.a(offer, aVar, new a(this, 2));
                case 8:
                    return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(19));
                case 9:
                    return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(24));
                case 10:
                    return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(16));
                case 11:
                    return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(29));
                case 12:
                    return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(25));
                case 13:
                    return c(offer);
                case 14:
                    return g.a(offer, aVar, new a(this, 1));
                default:
                    b6e.s();
                    return null;
            }
        }
        if (!(gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.c)) {
            if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.b) {
                return g.a(offer, aVar, new b(1));
            }
            if ((gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.d) || (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.e) || (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.f)) {
                return c(offer);
            }
            b6e.s();
            return null;
        }
        int ordinal = ((com.yandex.plus.pay.ui.api.feature.payment.c) gVar).a.ordinal();
        if (ordinal == 0) {
            return g.a(offer, aVar, new b(1));
        }
        if (ordinal == 1) {
            return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(this, 22));
        }
        if (ordinal == 2) {
            return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(this, 27));
        }
        if (ordinal == 3) {
            return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(this, 28));
        }
        if (ordinal == 4) {
            return g.a(offer, aVar, new b(0));
        }
        if (ordinal == 5) {
            return g.a(offer, aVar, new b(this));
        }
        b6e.s();
        return null;
    }

    public final k b(int i, int i2) {
        com.yandex.plus.pay.ui.core.api.common.a aVar = this.a;
        return new k(aVar.get(i), aVar.get(i2));
    }

    public final h c(PlusPayCompositeOffers.Offer offer) {
        PlusPayCompositeOffers.Offer.Vendor vendor;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if (tariffOffer == null || (vendor = tariffOffer.getVendor()) == null) {
            PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) CollectionsKt.firstOrNull(offer.getOptionOffers());
            vendor = option != null ? option.getVendor() : null;
        }
        int i = vendor == null ? -1 : c.a[vendor.ordinal()];
        com.yandex.plus.pay.ui.core.api.common.a aVar = this.a;
        if (i != -1) {
            if (i == 1) {
                return g.a(offer, aVar, new a(this, 0));
            }
            if (i != 2 && i != 3) {
                b6e.s();
                return null;
            }
        }
        return g.a(offer, aVar, new com.yandex.plus.home.feature.webviews.internal.webview.e(20));
    }
}
