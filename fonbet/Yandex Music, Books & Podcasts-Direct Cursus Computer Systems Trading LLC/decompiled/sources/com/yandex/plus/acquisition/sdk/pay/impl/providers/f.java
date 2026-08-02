package com.yandex.plus.acquisition.sdk.pay.impl.providers;

import com.yandex.plus.acquisition.sdk.pay.common.api.j;
import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import com.yandex.plus.pay.internal.feature.offers.x;
import com.yandex.plus.pay.internal.g;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.v75;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class f {
    public final com.yandex.plus.pay.a a;
    public final com.yandex.plus.acquisition.sdk.pay.impl.analytics.a b;
    public final d c;

    public f(com.yandex.plus.pay.a aVar, com.yandex.plus.acquisition.sdk.pay.impl.analytics.a aVar2, d dVar) {
        aVar.getClass();
        aVar2.getClass();
        this.a = aVar;
        this.b = aVar2;
        this.c = dVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|8|(1:(2:11|12)(2:47|48))(3:49|50|(1:52))|13|14|(5:16|(1:22)|23|(10:26|(2:29|27)|30|31|(1:33)(1:40)|34|(2:37|35)|38|39|24)|41)(1:45)|42|43))|60|6|7|8|(0)(0)|13|14|(0)(0)|42|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        r3 = defpackage.z7o.b;
        r3 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0082, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0084, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007b, code lost:
    
        r3 = defpackage.z7o.b;
        r3 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003e  */
    /* JADX WARN: Type inference failed for: r3v10, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, Set set, Map map, String str2, boolean z, com.yandex.plus.acquisition.sdk.pay.common.api.a aVar, cg6 cg6Var) {
        e eVar;
        Object obj;
        int i;
        ?? r3;
        com.yandex.plus.acquisition.sdk.api.offers.e eVar2;
        PlusPaySmartOffer.Meta meta;
        String sessionId;
        com.yandex.plus.acquisition.sdk.pay.common.api.a aVar2 = aVar;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.m = i2 - Integer.MIN_VALUE;
                e eVar3 = eVar;
                obj = eVar3.k;
                nm6 nm6Var = nm6.a;
                i = eVar3.m;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.api.feature.offers.b bVar = (com.yandex.plus.pay.api.feature.offers.b) ((g) this.a).e.getValue();
                    com.yandex.plus.pay.api.analytics.c a = this.b.a(aVar2.a, str2, aVar2.c);
                    eVar3.j = aVar2;
                    eVar3.m = 1;
                    obj = ((x) bVar).c(str, set, map, a, z, new com.yandex.plus.home.feature.webviews.internal.webview.e(11), eVar3);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = eVar3.j;
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                if (z7o.a(obj) != null) {
                    List list = (List) obj;
                    list.getClass();
                    aVar2.getClass();
                    b bVar2 = (b) this.c.a;
                    bVar2.getClass();
                    PlusPaySmartOffer plusPaySmartOffer = (PlusPaySmartOffer) CollectionsKt.firstOrNull(list);
                    if (plusPaySmartOffer != null && (meta = plusPaySmartOffer.getMeta()) != null && (sessionId = meta.getSessionId()) != null) {
                        bVar2.a.put(sessionId, list);
                    }
                    List list2 = list;
                    int i3 = 10;
                    r3 = new ArrayList(v75.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        PlusPaySmartOffer plusPaySmartOffer2 = (PlusPaySmartOffer) it.next();
                        int priority = plusPaySmartOffer2.getPriority();
                        String page = plusPaySmartOffer2.getPage();
                        String place = plusPaySmartOffer2.getPlace();
                        com.yandex.plus.acquisition.sdk.pay.common.api.g gVar = new com.yandex.plus.acquisition.sdk.pay.common.api.g(plusPaySmartOffer2.getTargetAndFeatures().getTarget(), plusPaySmartOffer2.getTargetAndFeatures().getFeatures());
                        String offerToken = plusPaySmartOffer2.getOfferToken();
                        boolean isOneClickEnabled = plusPaySmartOffer2.isOneClickEnabled();
                        PlusPaySmartOffer.Texts texts = plusPaySmartOffer2.getTexts();
                        j jVar = new j(texts.getSubscriptionName(), texts.getButtonText(), texts.getButtonTextWithDetails(), texts.getCombinedIntroductoryText(), texts.getCombinedPriceText(), texts.getCombinedFullOfferText(), texts.getPriceInMonth(), texts.getCommonPrice(), texts.getCurrencySymbol(), texts.getDiscountPercent(), texts.getFullPriceText(), texts.getCustomTexts());
                        PlusPaySmartOffer.Legals legals = plusPaySmartOffer2.getLegals();
                        String oneClickDisclaimer = legals.getOneClickDisclaimer();
                        String format = legals.getFormat();
                        List<PlusPaySmartOffer.Legals.Argument> arguments = legals.getArguments();
                        ArrayList arrayList = new ArrayList(v75.o(arguments, i3));
                        for (PlusPaySmartOffer.Legals.Argument argument : arguments) {
                            arrayList.add(new com.yandex.plus.acquisition.sdk.pay.common.api.d(argument.getKey(), argument.getValue(), argument.getUri()));
                            it = it;
                        }
                        Iterator it2 = it;
                        com.yandex.plus.acquisition.sdk.pay.common.api.e eVar4 = new com.yandex.plus.acquisition.sdk.pay.common.api.e(oneClickDisclaimer, format, arrayList);
                        String language = plusPaySmartOffer2.getLanguage();
                        PlusPaySmartOffer.Meta meta2 = plusPaySmartOffer2.getMeta();
                        com.yandex.plus.acquisition.sdk.pay.common.api.f fVar = new com.yandex.plus.acquisition.sdk.pay.common.api.f(meta2.getSessionId(), meta2.getBatchId(), meta2.getPositionId(), meta2.getMlRequestId(), meta2.getConfigId(), meta2.getPlaceId());
                        PlusPayCompositeOffers.Offer compositeOffer = plusPaySmartOffer2.getCompositeOffer();
                        String positionId = compositeOffer.getPositionId();
                        String activeTariffId = compositeOffer.getActiveTariffId();
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer = compositeOffer.getTariffOffer();
                        if (tariffOffer != null) {
                            String id = tariffOffer.getId();
                            String name = tariffOffer.getName();
                            String title = tariffOffer.getTitle();
                            String description = tariffOffer.getDescription();
                            String text = tariffOffer.getText();
                            String additionalText = tariffOffer.getAdditionalText();
                            String commonPeriod = tariffOffer.getCommonPeriod();
                            PlusPayPrice commonPrice = tariffOffer.getCommonPrice();
                            eVar2 = new com.yandex.plus.acquisition.sdk.api.offers.e(id, name, title, description, text, additionalText, commonPeriod, new com.yandex.plus.acquisition.sdk.api.offers.d(commonPrice.getAmount(), commonPrice.getCurrency()), d.a(tariffOffer.getVendor()), tariffOffer.getPayload());
                        } else {
                            eVar2 = null;
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers = compositeOffer.getOptionOffers();
                        ArrayList arrayList2 = new ArrayList(v75.o(optionOffers, 10));
                        for (PlusPayCompositeOffers.Offer.Option option : optionOffers) {
                            String id2 = option.getId();
                            String name2 = option.getName();
                            String title2 = option.getTitle();
                            String description2 = option.getDescription();
                            String text2 = option.getText();
                            String additionalText2 = option.getAdditionalText();
                            String commonPeriod2 = option.getCommonPeriod();
                            PlusPayPrice commonPrice2 = option.getCommonPrice();
                            arrayList2.add(new com.yandex.plus.acquisition.sdk.api.offers.e(id2, name2, title2, description2, text2, additionalText2, commonPeriod2, new com.yandex.plus.acquisition.sdk.api.offers.d(commonPrice2.getAmount(), commonPrice2.getCurrency()), d.a(option.getVendor()), option.getPayload()));
                        }
                        PlusPayCompositeOffers.Offer.Assets assets = compositeOffer.getAssets();
                        r3.add(new k(priority, page, place, gVar, offerToken, isOneClickEnabled, jVar, eVar4, language, fVar, new com.yandex.plus.acquisition.sdk.api.offers.c(positionId, activeTariffId, eVar2, arrayList2, new com.yandex.plus.acquisition.sdk.api.offers.a(assets.getButtonText(), assets.getButtonTextWithDetails(), assets.getSubscriptionName()), new com.yandex.plus.acquisition.sdk.api.offers.b(compositeOffer.getMeta().getSessionId(), compositeOffer.getMeta().getOffersBatchId()), aVar2.c, compositeOffer.getCanAttemptSilentPurchase())));
                        it = it2;
                        i3 = 10;
                    }
                } else {
                    r3 = c5b.a;
                }
                return (Serializable) r3;
            }
        }
        eVar = new e(this, cg6Var);
        e eVar32 = eVar;
        obj = eVar32.k;
        nm6 nm6Var2 = nm6.a;
        i = eVar32.m;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        if (z7o.a(obj) != null) {
        }
        return (Serializable) r3;
    }
}
