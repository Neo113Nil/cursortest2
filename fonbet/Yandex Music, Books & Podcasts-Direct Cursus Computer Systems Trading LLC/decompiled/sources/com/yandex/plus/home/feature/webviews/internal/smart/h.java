package com.yandex.plus.home.feature.webviews.internal.smart;

import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.stories.k;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffersKt;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h0;
import defpackage.ezc;
import defpackage.v75;
import defpackage.xdr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class h extends ezc implements Function2 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                Function1 function1 = (Function1) obj2;
                collection.getClass();
                function1.getClass();
                ((t) ((u) this.receiver)).q(collection, function1);
                return Unit.a;
            case 1:
                com.yandex.plus.webview.core.resource.c cVar = (com.yandex.plus.webview.core.resource.c) obj2;
                ((com.yandex.plus.webview.core.d) obj).getClass();
                cVar.getClass();
                e eVar = (e) this.receiver;
                eVar.getClass();
                return Boolean.valueOf(eVar.K.g(cVar));
            case 2:
                Collection collection2 = (Collection) obj;
                Function1 function12 = (Function1) obj2;
                collection2.getClass();
                function12.getClass();
                ((t) ((u) this.receiver)).q(collection2, function12);
                return Unit.a;
            case 3:
                com.yandex.plus.webview.core.resource.c cVar2 = (com.yandex.plus.webview.core.resource.c) obj2;
                ((com.yandex.plus.webview.core.d) obj).getClass();
                cVar2.getClass();
                k kVar = (k) this.receiver;
                kVar.getClass();
                return Boolean.valueOf(kVar.B0.g(cVar2));
            case 4:
                String str2 = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                str2.getClass();
                h0 h0Var = (h0) this.receiver;
                h0Var.getClass();
                xdr xdrVar = h0Var.D;
                PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) xdrVar.getValue();
                if (plusPayCompositeOfferDetails != null) {
                    PlusPayAdditionalOffers additionalOffers = plusPayCompositeOfferDetails.getAdditionalOffers();
                    List<PlusPayAdditionalOffer> offers = additionalOffers.getOffers();
                    ArrayList arrayList2 = new ArrayList(v75.o(offers, 10));
                    for (PlusPayAdditionalOffer plusPayAdditionalOffer : offers) {
                        if (str2.equals(plusPayAdditionalOffer.getOffer().getOfferName())) {
                            str = str2;
                            arrayList = arrayList2;
                            plusPayAdditionalOffer = PlusPayAdditionalOffer.copy$default(plusPayAdditionalOffer, null, null, false, booleanValue, null, null, null, null, 247, null);
                        } else {
                            str = str2;
                            arrayList = arrayList2;
                        }
                        arrayList.add(plusPayAdditionalOffer);
                        arrayList2 = arrayList;
                        str2 = str;
                    }
                    PlusPayAdditionalOffers copy$default = PlusPayAdditionalOffers.copy$default(additionalOffers, null, null, arrayList2, null, null, 27, null);
                    xdrVar.l(PlusPayCompositeOfferDetails.copy$default(plusPayCompositeOfferDetails, null, null, null, null, null, null, null, null, null, null, null, null, copy$default, 4095, null));
                    h0Var.J(h0Var.l.a.a(), plusPayCompositeOfferDetails, PlusPayAdditionalOffersKt.toOfferDetailsConfiguration(copy$default));
                }
                return Unit.a;
            default:
                com.yandex.plus.webview.core.d dVar = (com.yandex.plus.webview.core.d) obj;
                com.yandex.plus.webview.core.resource.c cVar3 = (com.yandex.plus.webview.core.resource.c) obj2;
                dVar.getClass();
                cVar3.getClass();
                return Boolean.valueOf(((com.yandex.plus.webview.internal.redirect.a) this.receiver).a(dVar, cVar3));
        }
    }
}
