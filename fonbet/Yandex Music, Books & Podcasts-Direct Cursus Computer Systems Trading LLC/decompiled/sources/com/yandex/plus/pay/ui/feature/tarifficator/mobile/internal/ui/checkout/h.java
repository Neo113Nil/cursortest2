package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffersKt;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.internal.model.PlusPayOfferSwitchToggle;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.ezd;
import defpackage.ihp;
import defpackage.jhp;
import defpackage.lcc;
import defpackage.lhc;
import defpackage.n8g;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t75;
import defpackage.u75;
import defpackage.v75;
import defpackage.xq0;
import defpackage.z75;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class h {
    public final com.yandex.plus.core.locale.a a;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d b;
    public final com.yandex.plus.pay.ui.core.api.common.a c;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k d;

    public h(com.yandex.plus.core.locale.a aVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar, com.yandex.plus.pay.ui.core.api.common.a aVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar) {
        aVar.getClass();
        dVar.getClass();
        aVar2.getClass();
        this.a = aVar;
        this.b = dVar;
        this.c = aVar2;
        this.d = kVar;
    }

    public static com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c h(PlusPayAdditionalOffer plusPayAdditionalOffer) {
        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c(plusPayAdditionalOffer.getOffer().getOfferName(), new com.yandex.plus.core.data.common.y(plusPayAdditionalOffer.getAssets().getLightImageUrl(), plusPayAdditionalOffer.getAssets().getDarkImageUrl()), plusPayAdditionalOffer.getAssets().getText(), plusPayAdditionalOffer.getAssets().getAdditionalText(), plusPayAdditionalOffer.getAssets().getBenefits(), (Boolean) null, 96);
    }

    public static com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c i(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c cVar, Set set) {
        return com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c.a(cVar, null, set.contains(cVar.a), 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02a3 A[LOOP:1: B:34:0x029d->B:36:0x02a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, boolean z, PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, String str, com.yandex.plus.pay.internal.feature.counter_offers.f fVar, cg6 cg6Var) {
        a aVar;
        int i;
        String str2;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c i2;
        boolean z2;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2;
        Function2 function2;
        List list;
        PlusPayMailingAdsAgreement plusPayMailingAdsAgreement2;
        PlusPayAdditionalOffer plusPayAdditionalOffer;
        List list2;
        String firstPaymentText;
        String str3;
        String str4;
        boolean z3;
        PlusPayAdditionalOffer plusPayAdditionalOffer2;
        List list3;
        List list4;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a aVar2;
        PlusPayAdditionalOffer plusPayAdditionalOffer3;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails3;
        Function2 function22;
        List list5;
        String str5;
        Object b;
        String str6;
        String str7;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails4;
        PlusPayAdditionalOffer plusPayAdditionalOffer4;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.f fVar2;
        Iterator it;
        PlusPayOfferSwitchToggle offerSwitchToggle;
        PlusPayOfferSwitchToggle offerSwitchToggle2;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.c cVar;
        PlusPayAdditionalOffer.Offer offer;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i3 = aVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.w = i3 - Integer.MIN_VALUE;
                Object obj = aVar.u;
                Object obj2 = nm6.a;
                i = aVar.w;
                com.yandex.plus.pay.ui.core.api.common.a aVar3 = this.c;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.c cVar2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    PlusPayAdditionalOffer switchOffer = PlusPayAdditionalOffersKt.getSwitchOffer(plusPayCompositeOfferDetails.getAdditionalOffers());
                    str2 = aVar3.get(R.string.PlusPay_Checkout_Title);
                    Set m = jhp.m(new lhc(new lcc(CollectionsKt.F(plusPayCompositeOfferDetails.getAdditionalOffers().getOffers()), true, new com.yandex.plus.pay.ui.common.internal.error.content.b(17)), new com.yandex.plus.pay.ui.common.internal.error.content.b(18), ihp.a));
                    if (switchOffer == null || !switchOffer.isSelected()) {
                        PlusPayCompositeOfferDetails.TariffOfferDetails tariffDetails = plusPayCompositeOfferDetails.getTariffDetails();
                        i2 = tariffDetails != null ? i(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c(tariffDetails.getOfferName(), new com.yandex.plus.core.data.common.y(tariffDetails.getLightImageUrl(), tariffDetails.getDarkImageUrl()), tariffDetails.getTitle(), tariffDetails.getText(), tariffDetails.getAdditionText()), m) : null;
                    } else {
                        i2 = i(h(switchOffer), m);
                    }
                    n8g b2 = t75.b();
                    if (i2 != null) {
                        b2.add(i2);
                    }
                    for (Iterator it2 = plusPayCompositeOfferDetails.getOptionOffersDetails().iterator(); it2.hasNext(); it2 = it2) {
                        PlusPayCompositeOfferDetails.OptionOfferDetails optionOfferDetails = (PlusPayCompositeOfferDetails.OptionOfferDetails) it2.next();
                        b2.add(i(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c(optionOfferDetails.getOfferName(), new com.yandex.plus.core.data.common.y(optionOfferDetails.getLightImageUrl(), optionOfferDetails.getDarkImageUrl()), optionOfferDetails.getTitle(), optionOfferDetails.getText(), optionOfferDetails.getAdditionText()), m));
                    }
                    n8g a = t75.a(b2);
                    aVar.j = plusPayCompositeOfferDetails;
                    aVar.k = plusPayMailingAdsAgreement;
                    aVar.l = fVar;
                    aVar.m = switchOffer;
                    aVar.n = str2;
                    aVar.o = a;
                    z2 = z;
                    aVar.t = z2;
                    aVar.w = 1;
                    Object e = e(plusPayCompositeOfferDetails, str, fVar, aVar);
                    if (e != obj2) {
                        plusPayCompositeOfferDetails2 = plusPayCompositeOfferDetails;
                        function2 = fVar;
                        list = a;
                        plusPayMailingAdsAgreement2 = plusPayMailingAdsAgreement;
                        plusPayAdditionalOffer = switchOffer;
                        obj = e;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = aVar.t;
                        aVar2 = aVar.s;
                        String str8 = aVar.r;
                        str4 = aVar.q;
                        list3 = aVar.p;
                        list4 = aVar.o;
                        String str9 = aVar.n;
                        plusPayAdditionalOffer4 = aVar.m;
                        plusPayCompositeOfferDetails4 = aVar.j;
                        qgg.h0(obj);
                        str6 = str8;
                        str7 = str9;
                        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a aVar4 = aVar2;
                        String str10 = str4;
                        List list6 = list3;
                        List list7 = list4;
                        List list8 = (List) obj;
                        if (z3) {
                            fVar2 = cVar2;
                        } else {
                            Locale a2 = this.a.a();
                            fVar2 = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.f((kotlin.text.c.o(a2.getLanguage(), "RU", true) && kotlin.text.c.o(a2.getCountry(), "RU", true)) ? R.drawable.pay_sdk_pay_logo_ru : R.drawable.pay_sdk_pay_logo_en, aVar3.get(R.string.PlusPay_Checkout_YPay_PaymentVia));
                        }
                        String str11 = aVar3.get(R.string.PlusPay_Checkout_PurchaseButton_Title);
                        List<PlusPayAdditionalOffer> offers = plusPayCompositeOfferDetails4.getAdditionalOffers().getOffers();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : offers) {
                            if (!Intrinsics.d(((PlusPayAdditionalOffer) obj3).getOffer().getOfferName(), (plusPayAdditionalOffer4 == null || (offer = plusPayAdditionalOffer4.getOffer()) == null) ? cVar2 : offer.getOfferName())) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            PlusPayAdditionalOffer plusPayAdditionalOffer5 = (PlusPayAdditionalOffer) it.next();
                            arrayList2.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.d(plusPayAdditionalOffer5.getAssets().getTitle(), com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c.a(h(plusPayAdditionalOffer5), Boolean.valueOf(plusPayAdditionalOffer5.isSelected()), false, 95)));
                        }
                        offerSwitchToggle = plusPayCompositeOfferDetails4.getAdditionalOffers().getOfferSwitchToggle();
                        cVar = cVar2;
                        cVar = cVar2;
                        if (offerSwitchToggle != null && plusPayAdditionalOffer4 != null) {
                            offerSwitchToggle2 = plusPayAdditionalOffer4.getOfferSwitchToggle();
                            cVar = cVar2;
                            if (offerSwitchToggle2 != null) {
                                cVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.c(offerSwitchToggle.getText(), offerSwitchToggle2.getText(), offerSwitchToggle2.getBadgeText(), plusPayAdditionalOffer4.isSelected());
                            }
                        }
                        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g(str7, list7, list6, aVar4, list8, str10, str6, fVar2, str11, arrayList2, cVar);
                    }
                    z3 = aVar.t;
                    str5 = aVar.r;
                    str4 = aVar.q;
                    list2 = aVar.p;
                    list5 = aVar.o;
                    str3 = aVar.n;
                    plusPayAdditionalOffer3 = aVar.m;
                    function22 = aVar.l;
                    plusPayCompositeOfferDetails3 = aVar.j;
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a aVar5 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a) obj;
                    firstPaymentText = str5;
                    aVar2 = aVar5;
                    plusPayAdditionalOffer2 = plusPayAdditionalOffer3;
                    plusPayCompositeOfferDetails2 = plusPayCompositeOfferDetails3;
                    list3 = list2;
                    list4 = list5;
                    function2 = function22;
                    aVar.j = plusPayCompositeOfferDetails2;
                    cVar2 = null;
                    aVar.k = null;
                    aVar.l = null;
                    aVar.m = plusPayAdditionalOffer2;
                    aVar.n = str3;
                    aVar.o = list4;
                    aVar.p = list3;
                    aVar.q = str4;
                    aVar.r = firstPaymentText;
                    aVar.s = aVar2;
                    aVar.t = z3;
                    aVar.w = 3;
                    b = b(plusPayCompositeOfferDetails2, function2, aVar);
                    if (b != obj2) {
                        str6 = firstPaymentText;
                        obj = b;
                        str7 = str3;
                        plusPayCompositeOfferDetails4 = plusPayCompositeOfferDetails2;
                        plusPayAdditionalOffer4 = plusPayAdditionalOffer2;
                        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a aVar42 = aVar2;
                        String str102 = str4;
                        List list62 = list3;
                        List list72 = list4;
                        List list82 = (List) obj;
                        if (z3) {
                        }
                        String str112 = aVar3.get(R.string.PlusPay_Checkout_PurchaseButton_Title);
                        List<PlusPayAdditionalOffer> offers2 = plusPayCompositeOfferDetails4.getAdditionalOffers().getOffers();
                        ArrayList arrayList3 = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        ArrayList arrayList22 = new ArrayList(v75.o(arrayList3, 10));
                        it = arrayList3.iterator();
                        while (it.hasNext()) {
                        }
                        offerSwitchToggle = plusPayCompositeOfferDetails4.getAdditionalOffers().getOfferSwitchToggle();
                        cVar = cVar2;
                        cVar = cVar2;
                        if (offerSwitchToggle != null) {
                            offerSwitchToggle2 = plusPayAdditionalOffer4.getOfferSwitchToggle();
                            cVar = cVar2;
                            if (offerSwitchToggle2 != null) {
                            }
                        }
                        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g(str7, list72, list62, aVar42, list82, str102, str6, fVar2, str112, arrayList22, cVar);
                    }
                    return obj2;
                }
                boolean z4 = aVar.t;
                list = aVar.o;
                str2 = aVar.n;
                plusPayAdditionalOffer = aVar.m;
                function2 = aVar.l;
                plusPayMailingAdsAgreement2 = aVar.k;
                plusPayCompositeOfferDetails2 = aVar.j;
                qgg.h0(obj);
                z2 = z4;
                list2 = (List) obj;
                String nextPaymentText = plusPayCompositeOfferDetails2.getPaymentText().getNextPaymentText();
                firstPaymentText = plusPayCompositeOfferDetails2.getPaymentText().getFirstPaymentText();
                if (plusPayMailingAdsAgreement2 != null) {
                    str3 = str2;
                    str4 = nextPaymentText;
                    z3 = z2;
                    plusPayAdditionalOffer2 = plusPayAdditionalOffer;
                    list3 = list2;
                    list4 = list;
                    aVar2 = null;
                    aVar.j = plusPayCompositeOfferDetails2;
                    cVar2 = null;
                    aVar.k = null;
                    aVar.l = null;
                    aVar.m = plusPayAdditionalOffer2;
                    aVar.n = str3;
                    aVar.o = list4;
                    aVar.p = list3;
                    aVar.q = str4;
                    aVar.r = firstPaymentText;
                    aVar.s = aVar2;
                    aVar.t = z3;
                    aVar.w = 3;
                    b = b(plusPayCompositeOfferDetails2, function2, aVar);
                    if (b != obj2) {
                    }
                    return obj2;
                }
                aVar.j = plusPayCompositeOfferDetails2;
                aVar.k = null;
                aVar.l = function2;
                aVar.m = plusPayAdditionalOffer;
                aVar.n = str2;
                aVar.o = list;
                aVar.p = list2;
                aVar.q = nextPaymentText;
                aVar.r = firstPaymentText;
                aVar.t = z2;
                aVar.w = 2;
                Object g = g(plusPayMailingAdsAgreement2, function2, aVar);
                if (g != obj2) {
                    PlusPayCompositeOfferDetails plusPayCompositeOfferDetails5 = plusPayCompositeOfferDetails2;
                    plusPayAdditionalOffer3 = plusPayAdditionalOffer;
                    plusPayCompositeOfferDetails3 = plusPayCompositeOfferDetails5;
                    str3 = str2;
                    function22 = function2;
                    str4 = nextPaymentText;
                    list5 = list;
                    str5 = firstPaymentText;
                    z3 = z2;
                    obj = g;
                    com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a aVar52 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a) obj;
                    firstPaymentText = str5;
                    aVar2 = aVar52;
                    plusPayAdditionalOffer2 = plusPayAdditionalOffer3;
                    plusPayCompositeOfferDetails2 = plusPayCompositeOfferDetails3;
                    list3 = list2;
                    list4 = list5;
                    function2 = function22;
                    aVar.j = plusPayCompositeOfferDetails2;
                    cVar2 = null;
                    aVar.k = null;
                    aVar.l = null;
                    aVar.m = plusPayAdditionalOffer2;
                    aVar.n = str3;
                    aVar.o = list4;
                    aVar.p = list3;
                    aVar.q = str4;
                    aVar.r = firstPaymentText;
                    aVar.s = aVar2;
                    aVar.t = z3;
                    aVar.w = 3;
                    b = b(plusPayCompositeOfferDetails2, function2, aVar);
                    if (b != obj2) {
                    }
                }
                return obj2;
            }
        }
        aVar = new a(this, cg6Var);
        Object obj4 = aVar.u;
        Object obj22 = nm6.a;
        i = aVar.w;
        com.yandex.plus.pay.ui.core.api.common.a aVar32 = this.c;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.c cVar22 = null;
        if (i != 0) {
        }
        list2 = (List) obj4;
        String nextPaymentText2 = plusPayCompositeOfferDetails2.getPaymentText().getNextPaymentText();
        firstPaymentText = plusPayCompositeOfferDetails2.getPaymentText().getFirstPaymentText();
        if (plusPayMailingAdsAgreement2 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, Function2 function2, cg6 cg6Var) {
        b bVar;
        int i;
        int i2;
        n8g b;
        n8g n8gVar;
        n8g n8gVar2;
        int i3;
        PlusPayRichText fromLegalInfo;
        Object a;
        Function2 function22;
        int i4;
        int i5;
        List list;
        PlusPayRichText promoLegalInfo;
        List list2;
        CharSequence charSequence;
        ArrayList arrayList;
        ListIterator listIterator;
        ezd ezdVar;
        Object next;
        int i6;
        CharSequence charSequence2;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i7 = bVar.q;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.q = i7 - Integer.MIN_VALUE;
                Object obj = bVar.o;
                nm6 nm6Var = nm6.a;
                i = bVar.q;
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar = this.b;
                i2 = 0;
                if (i != 0) {
                    qgg.h0(obj);
                    b = t75.b();
                    PlusPayLegalInfo legalInfo = plusPayCompositeOfferDetails.getLegalInfo();
                    if (legalInfo != null && (fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo)) != null) {
                        bVar.j = plusPayCompositeOfferDetails;
                        bVar.k = function2;
                        bVar.l = b;
                        bVar.m = b;
                        bVar.n = 0;
                        bVar.q = 1;
                        a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) dVar).a(fromLegalInfo, function2, bVar);
                        if (a != nm6Var) {
                            function22 = function2;
                            n8gVar2 = b;
                            i4 = 0;
                        }
                        return nm6Var;
                    }
                    n8gVar = b;
                    n8gVar2 = n8gVar;
                    i3 = 0;
                    n8g n8gVar3 = n8gVar;
                    i5 = i3;
                    b = n8gVar3;
                    function22 = function2;
                    list = n8gVar2;
                    promoLegalInfo = plusPayCompositeOfferDetails.getPromoLegalInfo();
                    if (promoLegalInfo != null) {
                        if (!((Boolean) this.d.invoke()).booleanValue()) {
                            promoLegalInfo = null;
                        }
                        if (promoLegalInfo != null) {
                            bVar.j = null;
                            bVar.k = null;
                            bVar.l = list;
                            bVar.m = b;
                            bVar.n = i5;
                            bVar.q = 2;
                            Object a2 = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) dVar).a(promoLegalInfo, function22, bVar);
                            if (a2 != nm6Var) {
                                n8g n8gVar4 = b;
                                obj = a2;
                                list2 = n8gVar4;
                                charSequence2 = (CharSequence) obj;
                                if (charSequence2 != null) {
                                }
                            }
                            return nm6Var;
                        }
                    }
                    n8g a3 = t75.a(list);
                    arrayList = new ArrayList(v75.o(a3, 10));
                    listIterator = a3.listIterator(0);
                    while (true) {
                        ezdVar = (ezd) listIterator;
                        if (!ezdVar.hasNext()) {
                        }
                        arrayList.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.b(i2, (CharSequence) next));
                        i2 = i6;
                    }
                } else if (i == 1) {
                    int i8 = bVar.n;
                    List list3 = bVar.m;
                    List list4 = bVar.l;
                    function22 = bVar.k;
                    PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2 = bVar.j;
                    qgg.h0(obj);
                    i4 = i8;
                    plusPayCompositeOfferDetails = plusPayCompositeOfferDetails2;
                    n8gVar2 = list4;
                    a = obj;
                    b = list3;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = bVar.m;
                    list = bVar.l;
                    qgg.h0(obj);
                    charSequence2 = (CharSequence) obj;
                    if (charSequence2 != null) {
                        if (StringsKt.U(charSequence2)) {
                            charSequence2 = null;
                        }
                        if (charSequence2 != null) {
                            list2.add(charSequence2);
                        }
                    }
                    n8g a32 = t75.a(list);
                    arrayList = new ArrayList(v75.o(a32, 10));
                    listIterator = a32.listIterator(0);
                    while (true) {
                        ezdVar = (ezd) listIterator;
                        if (!ezdVar.hasNext()) {
                            return arrayList;
                        }
                        next = ezdVar.next();
                        i6 = i2 + 1;
                        if (i2 < 0) {
                            u75.n();
                            throw null;
                        }
                        arrayList.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.b(i2, (CharSequence) next));
                        i2 = i6;
                    }
                }
                charSequence = (CharSequence) a;
                if (charSequence != null) {
                    if (StringsKt.U(charSequence)) {
                        charSequence = null;
                    }
                    if (charSequence != null) {
                        b.add(charSequence);
                        i5 = i4;
                        list = n8gVar2;
                        promoLegalInfo = plusPayCompositeOfferDetails.getPromoLegalInfo();
                        if (promoLegalInfo != null) {
                        }
                        n8g a322 = t75.a(list);
                        arrayList = new ArrayList(v75.o(a322, 10));
                        listIterator = a322.listIterator(0);
                        while (true) {
                            ezdVar = (ezd) listIterator;
                            if (!ezdVar.hasNext()) {
                            }
                            arrayList.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.b(i2, (CharSequence) next));
                            i2 = i6;
                        }
                    }
                }
                n8gVar = b;
                i3 = i4;
                function2 = function22;
                n8g n8gVar32 = n8gVar;
                i5 = i3;
                b = n8gVar32;
                function22 = function2;
                list = n8gVar2;
                promoLegalInfo = plusPayCompositeOfferDetails.getPromoLegalInfo();
                if (promoLegalInfo != null) {
                }
                n8g a3222 = t75.a(list);
                arrayList = new ArrayList(v75.o(a3222, 10));
                listIterator = a3222.listIterator(0);
                while (true) {
                    ezdVar = (ezd) listIterator;
                    if (!ezdVar.hasNext()) {
                    }
                    arrayList.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.b(i2, (CharSequence) next));
                    i2 = i6;
                }
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.o;
        nm6 nm6Var2 = nm6.a;
        i = bVar.q;
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar2 = this.b;
        i2 = 0;
        if (i != 0) {
        }
        charSequence = (CharSequence) a;
        if (charSequence != null) {
        }
        n8gVar = b;
        i3 = i4;
        function2 = function22;
        n8g n8gVar322 = n8gVar;
        i5 = i3;
        b = n8gVar322;
        function22 = function2;
        list = n8gVar2;
        promoLegalInfo = plusPayCompositeOfferDetails.getPromoLegalInfo();
        if (promoLegalInfo != null) {
        }
        n8g a32222 = t75.a(list);
        arrayList = new ArrayList(v75.o(a32222, 10));
        listIterator = a32222.listIterator(0);
        while (true) {
            ezdVar = (ezd) listIterator;
            if (!ezdVar.hasNext()) {
            }
            arrayList.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.b(i2, (CharSequence) next));
            i2 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PlusPayCompositeOfferDetails.PaymentMethod paymentMethod, String str, Function2 function2, cg6 cg6Var) {
        c cVar;
        int i;
        String id;
        com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a aVar;
        String title;
        com.yandex.plus.core.data.common.y icon;
        com.yandex.plus.core.data.common.v<com.yandex.plus.core.data.common.k> vVar;
        com.yandex.plus.core.data.common.v<com.yandex.plus.core.data.common.k> vVar2;
        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod2;
        Function2 function22;
        boolean z;
        CharSequence charSequence;
        PlusPayRichText badgeText;
        PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset buttonAsset;
        CharSequence charSequence2;
        CharSequence charSequence3;
        com.yandex.plus.core.data.common.v<com.yandex.plus.core.data.common.k> vVar3;
        com.yandex.plus.core.data.common.y yVar;
        String str2;
        String str3;
        com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a aVar2;
        com.yandex.plus.core.data.common.v<com.yandex.plus.core.data.common.k> vVar4;
        boolean z2;
        PlusPayRichText subtitleText;
        CharSequence charSequence4;
        com.yandex.plus.core.data.common.v<com.yandex.plus.core.data.common.k> vVar5;
        com.yandex.plus.core.data.common.y yVar2;
        String str4;
        com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a aVar3;
        String str5;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.v = i2 - Integer.MIN_VALUE;
                Object obj = cVar.t;
                nm6 nm6Var = nm6.a;
                i = cVar.v;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar = this.d;
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    id = paymentMethod.getId();
                    boolean d = Intrinsics.d(paymentMethod.getId(), str);
                    aVar = new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a(!paymentMethod.isBound(), paymentMethod.getType() == PlusPayCompositeOfferDetails.PaymentMethod.Type.NEW_YB_CARD);
                    title = paymentMethod.getTitle();
                    icon = paymentMethod.getIcon();
                    com.yandex.plus.core.data.common.v<com.yandex.plus.core.data.common.k> textColor = paymentMethod.getTextColor();
                    com.yandex.plus.core.data.common.v<com.yandex.plus.core.data.common.k> backgroundColor = paymentMethod.getBackgroundColor();
                    PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset buttonAsset2 = paymentMethod.getButtonAsset();
                    if (buttonAsset2 != null && (badgeText = buttonAsset2.getBadgeText()) != null) {
                        if (!((Boolean) kVar.invoke()).booleanValue()) {
                            badgeText = null;
                        }
                        if (badgeText != null) {
                            cVar.j = paymentMethod;
                            cVar.k = function2;
                            cVar.l = id;
                            cVar.m = aVar;
                            cVar.n = title;
                            cVar.o = icon;
                            cVar.p = textColor;
                            cVar.q = backgroundColor;
                            cVar.r = null;
                            cVar.s = d;
                            cVar.v = 1;
                            Object a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) dVar).a(badgeText, function2, cVar);
                            if (a != nm6Var) {
                                vVar = textColor;
                                vVar2 = backgroundColor;
                                paymentMethod2 = paymentMethod;
                                function22 = function2;
                                z = d;
                                obj = a;
                            }
                            return nm6Var;
                        }
                    }
                    vVar = textColor;
                    vVar2 = backgroundColor;
                    paymentMethod2 = paymentMethod;
                    function22 = function2;
                    z = d;
                    charSequence = null;
                    buttonAsset = paymentMethod2.getButtonAsset();
                    if (buttonAsset != null && (subtitleText = buttonAsset.getSubtitleText()) != null) {
                        if (!((Boolean) kVar.invoke()).booleanValue()) {
                            subtitleText = null;
                        }
                        if (subtitleText != null) {
                            cVar.j = null;
                            cVar.k = null;
                            cVar.l = id;
                            cVar.m = aVar;
                            cVar.n = title;
                            cVar.o = icon;
                            cVar.p = vVar;
                            cVar.q = vVar2;
                            cVar.r = charSequence;
                            cVar.s = z;
                            cVar.v = 2;
                            Object a2 = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) dVar).a(subtitleText, function22, cVar);
                            if (a2 != nm6Var) {
                                charSequence4 = charSequence;
                                obj = a2;
                                vVar5 = vVar;
                                yVar2 = icon;
                                str4 = title;
                                aVar3 = aVar;
                                str5 = id;
                                str3 = str5;
                                charSequence2 = charSequence4;
                                vVar3 = vVar5;
                                yVar = yVar2;
                                str2 = str4;
                                aVar2 = aVar3;
                                charSequence3 = (CharSequence) obj;
                                z2 = z;
                                vVar4 = vVar2;
                                return new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c(str3, z2, aVar2, str2, charSequence3, charSequence2, yVar, vVar3, vVar4);
                            }
                            return nm6Var;
                        }
                    }
                    charSequence2 = charSequence;
                    charSequence3 = null;
                    vVar3 = vVar;
                    yVar = icon;
                    str2 = title;
                    str3 = id;
                    aVar2 = aVar;
                    vVar4 = vVar2;
                    z2 = z;
                    return new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c(str3, z2, aVar2, str2, charSequence3, charSequence2, yVar, vVar3, vVar4);
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = cVar.s;
                    charSequence4 = cVar.r;
                    vVar2 = cVar.q;
                    vVar5 = cVar.p;
                    yVar2 = cVar.o;
                    str4 = cVar.n;
                    aVar3 = cVar.m;
                    str5 = cVar.l;
                    qgg.h0(obj);
                    str3 = str5;
                    charSequence2 = charSequence4;
                    vVar3 = vVar5;
                    yVar = yVar2;
                    str2 = str4;
                    aVar2 = aVar3;
                    charSequence3 = (CharSequence) obj;
                    z2 = z;
                    vVar4 = vVar2;
                    return new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c(str3, z2, aVar2, str2, charSequence3, charSequence2, yVar, vVar3, vVar4);
                }
                z = cVar.s;
                vVar2 = cVar.q;
                vVar = cVar.p;
                icon = cVar.o;
                title = cVar.n;
                aVar = cVar.m;
                id = cVar.l;
                function22 = cVar.k;
                paymentMethod2 = cVar.j;
                qgg.h0(obj);
                charSequence = (CharSequence) obj;
                buttonAsset = paymentMethod2.getButtonAsset();
                if (buttonAsset != null) {
                    if (!((Boolean) kVar.invoke()).booleanValue()) {
                    }
                    if (subtitleText != null) {
                    }
                }
                charSequence2 = charSequence;
                charSequence3 = null;
                vVar3 = vVar;
                yVar = icon;
                str2 = title;
                str3 = id;
                aVar2 = aVar;
                vVar4 = vVar2;
                z2 = z;
                return new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c(str3, z2, aVar2, str2, charSequence3, charSequence2, yVar, vVar3, vVar4);
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.t;
        nm6 nm6Var2 = nm6.a;
        i = cVar.v;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar2 = this.d;
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar2 = this.b;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        buttonAsset = paymentMethod2.getButtonAsset();
        if (buttonAsset != null) {
        }
        charSequence2 = charSequence;
        charSequence3 = null;
        vVar3 = vVar;
        yVar = icon;
        str2 = title;
        str3 = id;
        aVar2 = aVar;
        vVar4 = vVar2;
        z2 = z;
        return new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c(str3, z2, aVar2, str2, charSequence3, charSequence2, yVar, vVar3, vVar4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x013d -> B:11:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c8 -> B:27:0x00d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup, String str, Function2 function2, cg6 cg6Var) {
        d dVar;
        int i;
        String str2;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup2;
        Function2 function22;
        d dVar2;
        String str3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Function2 function23;
        ArrayList arrayList4;
        String str4;
        int i4;
        Iterator it2;
        int i5;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i6 = dVar.v;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.v = i6 - Integer.MIN_VALUE;
                Object obj = dVar.t;
                nm6 nm6Var = nm6.a;
                i = dVar.v;
                ArrayList arrayList5 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    String title = paymentMethodsGroup.getTitle();
                    List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods = paymentMethodsGroup.getPaymentMethods();
                    ArrayList arrayList6 = new ArrayList(v75.o(paymentMethods, 10));
                    str2 = title;
                    it = paymentMethods.iterator();
                    arrayList = arrayList6;
                    i2 = 0;
                    i3 = 0;
                    paymentMethodsGroup2 = paymentMethodsGroup;
                    function22 = function2;
                    dVar2 = dVar;
                    str3 = str;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    int i7 = dVar.s;
                    int i8 = dVar.r;
                    Collection collection = dVar.p;
                    String str5 = dVar.o;
                    Iterator it3 = dVar.n;
                    Collection collection2 = dVar.m;
                    Function2 function24 = dVar.l;
                    String str6 = dVar.k;
                    PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup3 = dVar.j;
                    qgg.h0(obj);
                    d dVar3 = dVar;
                    str3 = str6;
                    int i9 = i7;
                    function22 = function24;
                    Iterator it4 = it3;
                    String str7 = str5;
                    ArrayList arrayList7 = collection;
                    int i10 = i8;
                    ArrayList arrayList8 = collection2;
                    arrayList7.add((com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c) obj);
                    paymentMethodsGroup2 = paymentMethodsGroup3;
                    dVar2 = dVar3;
                    i2 = i9;
                    i3 = i10;
                    str2 = str7;
                    arrayList = arrayList8;
                    it = it4;
                    if (it.hasNext()) {
                        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (PlusPayCompositeOfferDetails.PaymentMethod) it.next();
                        dVar2.j = paymentMethodsGroup2;
                        dVar2.k = str3;
                        dVar2.l = function22;
                        ArrayList arrayList9 = arrayList;
                        dVar2.m = arrayList9;
                        dVar2.n = it;
                        dVar2.o = str2;
                        dVar2.p = arrayList9;
                        dVar2.r = i3;
                        dVar2.s = i2;
                        dVar2.v = 1;
                        Object c = c(paymentMethod, str3, function22, dVar2);
                        if (c != nm6Var) {
                            it4 = it;
                            str7 = str2;
                            arrayList7 = arrayList;
                            i10 = i3;
                            i9 = i2;
                            dVar3 = dVar2;
                            paymentMethodsGroup3 = paymentMethodsGroup2;
                            obj = c;
                            arrayList8 = arrayList7;
                            arrayList7.add((com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c) obj);
                            paymentMethodsGroup2 = paymentMethodsGroup3;
                            dVar2 = dVar3;
                            i2 = i9;
                            i3 = i10;
                            str2 = str7;
                            arrayList = arrayList8;
                            it = it4;
                            if (it.hasNext()) {
                                arrayList2 = arrayList;
                                List<PlusPayCompositeOfferDetails.PaymentPromo> paymentPromos = paymentMethodsGroup2.getPaymentPromos();
                                if (!((Boolean) this.d.invoke()).booleanValue()) {
                                    paymentPromos = null;
                                }
                                if (paymentPromos != null) {
                                    List<PlusPayCompositeOfferDetails.PaymentPromo> list = paymentPromos;
                                    arrayList3 = new ArrayList(v75.o(list, 10));
                                    function23 = function22;
                                    dVar = dVar2;
                                    arrayList4 = arrayList2;
                                    str4 = str2;
                                    i4 = 0;
                                    it2 = list.iterator();
                                    i5 = 0;
                                    if (it2.hasNext()) {
                                    }
                                }
                                if (arrayList5 == null) {
                                }
                                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.e(str2, arrayList2, arrayList5);
                            }
                        }
                        return nm6Var;
                    }
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = dVar.s;
                    int i11 = dVar.r;
                    Collection collection3 = dVar.q;
                    ?? r8 = (List) dVar.p;
                    str4 = dVar.o;
                    it2 = dVar.n;
                    Collection collection4 = dVar.m;
                    function23 = dVar.l;
                    qgg.h0(obj);
                    ArrayList arrayList10 = collection3;
                    ArrayList arrayList11 = r8;
                    arrayList10.add((com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f) obj);
                    i5 = i11;
                    arrayList3 = collection4;
                    arrayList4 = arrayList11;
                    if (it2.hasNext()) {
                        PlusPayCompositeOfferDetails.PaymentPromo paymentPromo = (PlusPayCompositeOfferDetails.PaymentPromo) it2.next();
                        dVar.j = null;
                        dVar.k = null;
                        dVar.l = function23;
                        ArrayList arrayList12 = arrayList3;
                        dVar.m = arrayList12;
                        dVar.n = it2;
                        dVar.o = str4;
                        dVar.p = arrayList4;
                        dVar.q = arrayList12;
                        dVar.r = i5;
                        dVar.s = i4;
                        dVar.v = 2;
                        Object f = f(paymentPromo, function23, dVar);
                        if (f != nm6Var) {
                            i11 = i5;
                            obj = f;
                            collection4 = arrayList3;
                            arrayList10 = arrayList3;
                            arrayList11 = arrayList4;
                            arrayList10.add((com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f) obj);
                            i5 = i11;
                            arrayList3 = collection4;
                            arrayList4 = arrayList11;
                            if (it2.hasNext()) {
                                arrayList5 = arrayList3;
                                arrayList2 = arrayList4;
                                str2 = str4;
                                if (arrayList5 == null) {
                                    arrayList5 = c5b.a;
                                }
                                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.e(str2, arrayList2, arrayList5);
                            }
                        }
                        return nm6Var;
                    }
                }
            }
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.t;
        nm6 nm6Var2 = nm6.a;
        i = dVar.v;
        ArrayList arrayList52 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e2 -> B:10:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, String str, Function2 function2, cg6 cg6Var) {
        e eVar;
        int i;
        int size;
        ArrayList arrayList;
        String str2;
        int i2;
        Iterator it;
        int i3;
        List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i4 = eVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.t = i4 - Integer.MIN_VALUE;
                Object obj = eVar.r;
                nm6 nm6Var = nm6.a;
                i = eVar.t;
                if (i != 0) {
                    qgg.h0(obj);
                    List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups = plusPayCompositeOfferDetails.getPaymentMethodsGroups();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = paymentMethodsGroups.iterator();
                    while (it2.hasNext()) {
                        z75.t(arrayList2, ((PlusPayCompositeOfferDetails.PaymentMethodsGroup) it2.next()).getPaymentMethods());
                    }
                    size = arrayList2.size();
                    if (size <= 1) {
                        return c5b.a;
                    }
                    if (str == null) {
                        PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) CollectionsKt.firstOrNull(plusPayCompositeOfferDetails.getPaymentMethodsGroups());
                        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (paymentMethodsGroup == null || (paymentMethods = paymentMethodsGroup.getPaymentMethods()) == null) ? null : (PlusPayCompositeOfferDetails.PaymentMethod) CollectionsKt.firstOrNull(paymentMethods);
                        str = paymentMethod != null ? paymentMethod.getId() : null;
                    }
                    List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups2 = plusPayCompositeOfferDetails.getPaymentMethodsGroups();
                    arrayList = new ArrayList(v75.o(paymentMethodsGroups2, 10));
                    str2 = str;
                    i2 = 0;
                    it = paymentMethodsGroups2.iterator();
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = eVar.q;
                    i2 = eVar.p;
                    int i5 = eVar.o;
                    Collection collection = eVar.n;
                    Iterator it3 = eVar.m;
                    Collection collection2 = eVar.l;
                    String str3 = eVar.k;
                    Function2 function22 = eVar.j;
                    qgg.h0(obj);
                    e eVar2 = eVar;
                    int i6 = i5;
                    function2 = function22;
                    String str4 = str3;
                    Iterator it4 = it3;
                    ArrayList arrayList3 = collection;
                    e eVar3 = eVar2;
                    ArrayList arrayList4 = collection2;
                    arrayList3.add((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.e) obj);
                    size = i6;
                    eVar = eVar3;
                    arrayList = arrayList4;
                    it = it4;
                    str2 = str4;
                    if (it.hasNext()) {
                        PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup2 = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) it.next();
                        eVar.j = function2;
                        eVar.k = str2;
                        ArrayList arrayList5 = arrayList;
                        eVar.l = arrayList5;
                        eVar.m = it;
                        eVar.n = arrayList5;
                        eVar.o = size;
                        eVar.p = i2;
                        eVar.q = i3;
                        eVar.t = 1;
                        Object d = d(paymentMethodsGroup2, str2, function2, eVar);
                        if (d == nm6Var) {
                            return nm6Var;
                        }
                        str4 = str2;
                        it4 = it;
                        arrayList3 = arrayList;
                        eVar3 = eVar;
                        i6 = size;
                        obj = d;
                        arrayList4 = arrayList3;
                        arrayList3.add((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.e) obj);
                        size = i6;
                        eVar = eVar3;
                        arrayList = arrayList4;
                        it = it4;
                        str2 = str4;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.r;
        nm6 nm6Var2 = nm6.a;
        i = eVar.t;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(PlusPayCompositeOfferDetails.PaymentPromo paymentPromo, Function2 function2, cg6 cg6Var) {
        f fVar;
        int i;
        String str;
        PlusPayRichText additionalTitle;
        CharSequence charSequence;
        String str2;
        com.yandex.plus.core.data.common.y yVar;
        CharSequence charSequence2;
        CharSequence charSequence3;
        PlusPayCompositeOfferDetails.PaymentPromo paymentPromo2;
        com.yandex.plus.core.data.common.y yVar2;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.q = i2 - Integer.MIN_VALUE;
                Object obj = fVar.o;
                nm6 nm6Var = nm6.a;
                i = fVar.q;
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    String paymentMethodId = paymentPromo.getPaymentMethodId();
                    PlusPayRichText benefitTitle = paymentPromo.getBenefitTitle();
                    fVar.j = paymentPromo;
                    fVar.k = function2;
                    fVar.l = paymentMethodId;
                    fVar.q = 1;
                    Object a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) dVar).a(benefitTitle, function2, fVar);
                    if (a != nm6Var) {
                        str = paymentMethodId;
                        obj = a;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yVar2 = fVar.n;
                    charSequence3 = fVar.m;
                    str2 = fVar.l;
                    paymentPromo2 = fVar.j;
                    qgg.h0(obj);
                    charSequence = (CharSequence) obj;
                    yVar = yVar2;
                    charSequence2 = charSequence3;
                    paymentPromo = paymentPromo2;
                    return new com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f(str2, charSequence2, charSequence, yVar, paymentPromo.getBackGroundColor());
                }
                String str3 = fVar.l;
                function2 = fVar.k;
                PlusPayCompositeOfferDetails.PaymentPromo paymentPromo3 = fVar.j;
                qgg.h0(obj);
                str = str3;
                paymentPromo = paymentPromo3;
                CharSequence charSequence4 = (CharSequence) obj;
                com.yandex.plus.core.data.common.y imageUrl = paymentPromo.getImageUrl();
                additionalTitle = paymentPromo.getAdditionalTitle();
                charSequence = null;
                if (additionalTitle != null) {
                    str2 = str;
                    yVar = imageUrl;
                    charSequence2 = charSequence4;
                    return new com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f(str2, charSequence2, charSequence, yVar, paymentPromo.getBackGroundColor());
                }
                fVar.j = paymentPromo;
                fVar.k = null;
                fVar.l = str;
                fVar.m = charSequence4;
                fVar.n = imageUrl;
                fVar.q = 2;
                Object a2 = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) dVar).a(additionalTitle, function2, fVar);
                if (a2 != nm6Var) {
                    obj = a2;
                    charSequence3 = charSequence4;
                    paymentPromo2 = paymentPromo;
                    str2 = str;
                    yVar2 = imageUrl;
                    charSequence = (CharSequence) obj;
                    yVar = yVar2;
                    charSequence2 = charSequence3;
                    paymentPromo = paymentPromo2;
                    return new com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f(str2, charSequence2, charSequence, yVar, paymentPromo.getBackGroundColor());
                }
                return nm6Var;
            }
        }
        fVar = new f(this, cg6Var);
        Object obj2 = fVar.o;
        nm6 nm6Var2 = nm6.a;
        i = fVar.q;
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar2 = this.b;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj2;
        com.yandex.plus.core.data.common.y imageUrl2 = paymentPromo.getImageUrl();
        additionalTitle = paymentPromo.getAdditionalTitle();
        charSequence = null;
        if (additionalTitle != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, Function2 function2, cg6 cg6Var) {
        g gVar;
        int i;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = gVar.k;
                nm6 nm6Var = nm6.a;
                i = gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    PlusPayRichText fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(plusPayMailingAdsAgreement.getAgreementText());
                    gVar.j = plusPayMailingAdsAgreement;
                    gVar.m = 1;
                    obj = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) this.b).a(fromLegalInfo, function2, gVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    plusPayMailingAdsAgreement = gVar.j;
                    qgg.h0(obj);
                }
                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a((CharSequence) obj, plusPayMailingAdsAgreement.isAgreementsChecked());
            }
        }
        gVar = new g(this, cg6Var);
        Object obj2 = gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gVar.m;
        if (i != 0) {
        }
        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a((CharSequence) obj2, plusPayMailingAdsAgreement.isAgreementsChecked());
    }
}
