package com.yandex.plus.pay.ui.common.internal.error.content;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.b6e;
import defpackage.fob;
import defpackage.g4f;
import defpackage.hlr;
import defpackage.hrg;
import defpackage.su4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String b;
        String d;
        String str = null;
        switch (this.a) {
            case 0:
                j jVar = (j) obj;
                jVar.getClass();
                jVar.d(R.string.PlusPay_Error_NotEnoughFunds_Title);
                jVar.c(R.string.PlusPay_Error_NotEnoughFunds_Subtitle);
                jVar.g.add(e.b);
                jVar.a("GP005");
                return Unit.a;
            case 1:
                j jVar2 = (j) obj;
                jVar2.getClass();
                jVar2.d(R.string.PlusPay_Error_Connection_Title);
                jVar2.c(R.string.PlusPay_Error_Connection_Subtitle);
                jVar2.g.add(e.b);
                jVar2.a("F520");
                return Unit.a;
            case 2:
                j jVar3 = (j) obj;
                jVar3.getClass();
                d.d(jVar3);
                jVar3.a("GP004");
                return Unit.a;
            case 3:
                j jVar4 = (j) obj;
                jVar4.getClass();
                jVar4.d(R.string.PlusPay_Error_Blacklisted_Title);
                jVar4.c(R.string.PlusPay_Error_Blacklisted_Subtitle);
                jVar4.g.add(e.c);
                jVar4.a("P005");
                return Unit.a;
            case 4:
                com.yandex.plus.pay.log.api.a aVar = (com.yandex.plus.pay.log.api.a) obj;
                aVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.b.name());
                sb.append(", ");
                sb.append(aVar.c);
                sb.append(": ");
                sb.append(aVar.d);
                Throwable th = aVar.e;
                if (th != null && (b = fob.b(th)) != null) {
                    str = StringUtil.LF.concat(b);
                }
                sb.append(str);
                return sb.toString();
            case 5:
                com.yandex.plus.pay.ui.core.debug.internal.domain.form.c cVar = (com.yandex.plus.pay.ui.core.debug.internal.domain.form.c) obj;
                cVar.getClass();
                StringBuilder sb2 = new StringBuilder("window.postMessage(");
                if (cVar instanceof com.yandex.plus.pay.ui.core.debug.internal.domain.form.b) {
                    d = hlr.d("\n                    '" + ((com.yandex.plus.pay.ui.core.debug.internal.domain.form.b) cVar).b + "'\n                ");
                } else {
                    if (!(cVar instanceof com.yandex.plus.pay.ui.core.debug.internal.domain.form.a)) {
                        b6e.s();
                        return null;
                    }
                    StringBuilder sb3 = new StringBuilder("\n                    {\n                        format: 'dataUrl', \n                        dataUrl: '");
                    com.yandex.plus.pay.ui.core.debug.internal.domain.form.a aVar2 = (com.yandex.plus.pay.ui.core.debug.internal.domain.form.a) cVar;
                    sb3.append(aVar2.b);
                    sb3.append("',\n                        name: '");
                    sb3.append(aVar2.c);
                    sb3.append("'\n                    }\n                ");
                    d = hlr.d(sb3.toString());
                }
                return su4.o(sb2, hlr.d("\n            {\n                message: 'set-question-value',\n                slug: '" + cVar.a() + "',\n                value: " + d + "\n            }\n        "), ");");
            case 6:
                return hrg.q("PlusPayUIComponentHolder with instanceId=", (String) obj, " is not initialized, to initialize call PlusPayUI.getProvider(...)");
            case 7:
                ((Boolean) obj).booleanValue();
                return Unit.a;
            case 8:
                ((Boolean) obj).booleanValue();
                return Unit.a;
            case 9:
                PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) obj;
                paymentMethodsGroup.getClass();
                return paymentMethodsGroup.getPaymentMethods();
            case 10:
                return hrg.q("PlusTarifficatorMobileComponent with instanceId=", (String) obj, " is not initialized");
            case 11:
                return hrg.q("PlusTarifficatorMobileBduiComponent with instanceId=", (String) obj, " is not initialized");
            case 12:
                g4f g4fVar = (g4f) obj;
                g4fVar.getClass();
                g4fVar.c = true;
                g4fVar.e = true;
                return Unit.a;
            case 13:
                g4f g4fVar2 = (g4f) obj;
                g4fVar2.getClass();
                g4fVar2.c = true;
                g4fVar2.e = true;
                return Unit.a;
            case 14:
                g4f g4fVar3 = (g4f) obj;
                g4fVar3.getClass();
                g4fVar3.c = true;
                g4fVar3.e = true;
                return Unit.a;
            case 15:
                PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup2 = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) obj;
                paymentMethodsGroup2.getClass();
                return paymentMethodsGroup2.getPaymentMethods();
            case 16:
                PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup3 = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) obj;
                paymentMethodsGroup3.getClass();
                return paymentMethodsGroup3.getPaymentMethods();
            case 17:
                PlusPayAdditionalOffer plusPayAdditionalOffer = (PlusPayAdditionalOffer) obj;
                plusPayAdditionalOffer.getClass();
                return Boolean.valueOf(plusPayAdditionalOffer.isSelected());
            case 18:
                PlusPayAdditionalOffer plusPayAdditionalOffer2 = (PlusPayAdditionalOffer) obj;
                plusPayAdditionalOffer2.getClass();
                return plusPayAdditionalOffer2.getOffersToReplace();
            case 19:
                return hrg.q("YbWebComponentHolder with instanceId=", (String) obj, " is not initialized");
            default:
                ((com.yandex.plus.webview.core.g) obj).getClass();
                return Unit.a;
        }
    }

    public /* synthetic */ b(int i) {
        this.a = i;
    }
}
