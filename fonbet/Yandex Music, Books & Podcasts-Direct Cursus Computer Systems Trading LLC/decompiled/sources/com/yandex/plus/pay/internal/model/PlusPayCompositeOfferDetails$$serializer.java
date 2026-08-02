package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo$$serializer;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.vx7;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayCompositeOfferDetails$$serializer implements p3d {

    @NotNull
    public static final PlusPayCompositeOfferDetails$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayCompositeOfferDetails$$serializer plusPayCompositeOfferDetails$$serializer = new PlusPayCompositeOfferDetails$$serializer();
        INSTANCE = plusPayCompositeOfferDetails$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails", plusPayCompositeOfferDetails$$serializer, 13);
        j5mVar.k("tariffDetails", false);
        j5mVar.k("optionOffersDetails", false);
        j5mVar.k("legalInfo", false);
        j5mVar.k("promoLegalInfo", false);
        j5mVar.k("paymentText", false);
        j5mVar.k("successScreen", false);
        j5mVar.k("invoicesDetails", false);
        j5mVar.k("isSilentInvoiceAvailable", false);
        j5mVar.k("mainPaymentMethod", false);
        j5mVar.k("posId", false);
        j5mVar.k("serviceToken", false);
        j5mVar.k("paymentMethodsGroups", false);
        j5mVar.k("additionalOffers", false);
        descriptor = j5mVar;
    }

    private PlusPayCompositeOfferDetails$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayCompositeOfferDetails.$childSerializers;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(PlusPayCompositeOfferDetails$TariffOfferDetails$$serializer.INSTANCE), arfVarArr[1].getValue(), ff7.C(PlusPayLegalInfo$$serializer.INSTANCE), ff7.C(PlusPayRichText$$serializer.INSTANCE), PlusPayCompositeOfferDetails$PaymentText$$serializer.INSTANCE, PlusPayCompositeOfferDetails$SuccessScreenDetails$$serializer.INSTANCE, arfVarArr[6].getValue(), ff7.C(oc3.a), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), arfVarArr[11].getValue(), PlusPayAdditionalOffers$$serializer.INSTANCE};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayCompositeOfferDetails deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        PlusPayCompositeOfferDetails.TariffOfferDetails tariffOfferDetails;
        List list;
        String str;
        String str2;
        List list2;
        PlusPayCompositeOfferDetails.PaymentText paymentText;
        String str3;
        PlusPayCompositeOfferDetails.SuccessScreenDetails successScreenDetails;
        PlusPayRichText plusPayRichText;
        Boolean bool;
        PlusPayLegalInfo plusPayLegalInfo;
        List list3;
        PlusPayAdditionalOffers plusPayAdditionalOffers;
        PlusPayCompositeOfferDetails.TariffOfferDetails tariffOfferDetails2;
        List list4;
        PlusPayCompositeOfferDetails.TariffOfferDetails tariffOfferDetails3;
        List list5;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayCompositeOfferDetails.$childSerializers;
        if (c.m()) {
            PlusPayCompositeOfferDetails.TariffOfferDetails tariffOfferDetails4 = (PlusPayCompositeOfferDetails.TariffOfferDetails) c.n(mhpVar, 0, PlusPayCompositeOfferDetails$TariffOfferDetails$$serializer.INSTANCE, null);
            List list6 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            PlusPayLegalInfo plusPayLegalInfo2 = (PlusPayLegalInfo) c.n(mhpVar, 2, PlusPayLegalInfo$$serializer.INSTANCE, null);
            PlusPayRichText plusPayRichText2 = (PlusPayRichText) c.n(mhpVar, 3, PlusPayRichText$$serializer.INSTANCE, null);
            PlusPayCompositeOfferDetails.PaymentText paymentText2 = (PlusPayCompositeOfferDetails.PaymentText) c.z(mhpVar, 4, PlusPayCompositeOfferDetails$PaymentText$$serializer.INSTANCE, null);
            PlusPayCompositeOfferDetails.SuccessScreenDetails successScreenDetails2 = (PlusPayCompositeOfferDetails.SuccessScreenDetails) c.z(mhpVar, 5, PlusPayCompositeOfferDetails$SuccessScreenDetails$$serializer.INSTANCE, null);
            List list7 = (List) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            Boolean bool2 = (Boolean) c.n(mhpVar, 7, oc3.a, null);
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 8, tkrVar, null);
            String str5 = (String) c.n(mhpVar, 9, tkrVar, null);
            String str6 = (String) c.n(mhpVar, 10, tkrVar, null);
            List list8 = (List) c.z(mhpVar, 11, (t9f) arfVarArr[11].getValue(), null);
            i = 8191;
            plusPayAdditionalOffers = (PlusPayAdditionalOffers) c.z(mhpVar, 12, PlusPayAdditionalOffers$$serializer.INSTANCE, null);
            tariffOfferDetails = tariffOfferDetails4;
            list3 = list6;
            str = str6;
            str3 = str5;
            bool = bool2;
            successScreenDetails = successScreenDetails2;
            plusPayRichText = plusPayRichText2;
            str2 = str4;
            paymentText = paymentText2;
            plusPayLegalInfo = plusPayLegalInfo2;
            list2 = list7;
            list = list8;
        } else {
            PlusPayAdditionalOffers plusPayAdditionalOffers2 = null;
            PlusPayCompositeOfferDetails.TariffOfferDetails tariffOfferDetails5 = null;
            List list9 = null;
            String str7 = null;
            String str8 = null;
            List list10 = null;
            PlusPayCompositeOfferDetails.PaymentText paymentText3 = null;
            String str9 = null;
            PlusPayCompositeOfferDetails.SuccessScreenDetails successScreenDetails3 = null;
            PlusPayRichText plusPayRichText3 = null;
            int i2 = 6;
            int i3 = 1;
            boolean z = true;
            i = 0;
            List list11 = null;
            Boolean bool3 = null;
            PlusPayLegalInfo plusPayLegalInfo3 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 6;
                        tariffOfferDetails5 = tariffOfferDetails5;
                        plusPayAdditionalOffers2 = plusPayAdditionalOffers2;
                        i3 = 1;
                    case 0:
                        i |= 1;
                        tariffOfferDetails5 = (PlusPayCompositeOfferDetails.TariffOfferDetails) c.n(mhpVar, 0, PlusPayCompositeOfferDetails$TariffOfferDetails$$serializer.INSTANCE, tariffOfferDetails5);
                        list11 = list11;
                        plusPayAdditionalOffers2 = plusPayAdditionalOffers2;
                        i3 = 1;
                        i2 = 6;
                    case 1:
                        PlusPayCompositeOfferDetails.TariffOfferDetails tariffOfferDetails6 = tariffOfferDetails5;
                        int i4 = i3;
                        list11 = (List) c.z(mhpVar, i4, (t9f) arfVarArr[i3].getValue(), list11);
                        i |= 2;
                        i3 = i4;
                        plusPayAdditionalOffers2 = plusPayAdditionalOffers2;
                        tariffOfferDetails5 = tariffOfferDetails6;
                        i2 = 6;
                    case 2:
                        tariffOfferDetails3 = tariffOfferDetails5;
                        list5 = list11;
                        plusPayLegalInfo3 = (PlusPayLegalInfo) c.n(mhpVar, 2, PlusPayLegalInfo$$serializer.INSTANCE, plusPayLegalInfo3);
                        i |= 4;
                        tariffOfferDetails5 = tariffOfferDetails3;
                        list11 = list5;
                        i2 = 6;
                    case 3:
                        tariffOfferDetails3 = tariffOfferDetails5;
                        list5 = list11;
                        plusPayRichText3 = (PlusPayRichText) c.n(mhpVar, 3, PlusPayRichText$$serializer.INSTANCE, plusPayRichText3);
                        i |= 8;
                        tariffOfferDetails5 = tariffOfferDetails3;
                        list11 = list5;
                        i2 = 6;
                    case 4:
                        tariffOfferDetails3 = tariffOfferDetails5;
                        list5 = list11;
                        paymentText3 = (PlusPayCompositeOfferDetails.PaymentText) c.z(mhpVar, 4, PlusPayCompositeOfferDetails$PaymentText$$serializer.INSTANCE, paymentText3);
                        i |= 16;
                        tariffOfferDetails5 = tariffOfferDetails3;
                        list11 = list5;
                        i2 = 6;
                    case 5:
                        tariffOfferDetails3 = tariffOfferDetails5;
                        list5 = list11;
                        successScreenDetails3 = (PlusPayCompositeOfferDetails.SuccessScreenDetails) c.z(mhpVar, 5, PlusPayCompositeOfferDetails$SuccessScreenDetails$$serializer.INSTANCE, successScreenDetails3);
                        i |= 32;
                        tariffOfferDetails5 = tariffOfferDetails3;
                        list11 = list5;
                        i2 = 6;
                    case 6:
                        tariffOfferDetails2 = tariffOfferDetails5;
                        list4 = list11;
                        list10 = (List) c.z(mhpVar, i2, (t9f) arfVarArr[i2].getValue(), list10);
                        i |= 64;
                        tariffOfferDetails5 = tariffOfferDetails2;
                        list11 = list4;
                    case 7:
                        tariffOfferDetails2 = tariffOfferDetails5;
                        list4 = list11;
                        bool3 = (Boolean) c.n(mhpVar, 7, oc3.a, bool3);
                        i |= 128;
                        tariffOfferDetails5 = tariffOfferDetails2;
                        list11 = list4;
                    case 8:
                        tariffOfferDetails2 = tariffOfferDetails5;
                        list4 = list11;
                        str8 = (String) c.n(mhpVar, 8, tkr.a, str8);
                        i |= 256;
                        tariffOfferDetails5 = tariffOfferDetails2;
                        list11 = list4;
                    case 9:
                        tariffOfferDetails2 = tariffOfferDetails5;
                        list4 = list11;
                        str9 = (String) c.n(mhpVar, 9, tkr.a, str9);
                        i |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        tariffOfferDetails5 = tariffOfferDetails2;
                        list11 = list4;
                    case 10:
                        tariffOfferDetails2 = tariffOfferDetails5;
                        list4 = list11;
                        str7 = (String) c.n(mhpVar, 10, tkr.a, str7);
                        i |= 1024;
                        tariffOfferDetails5 = tariffOfferDetails2;
                        list11 = list4;
                    case 11:
                        tariffOfferDetails2 = tariffOfferDetails5;
                        list4 = list11;
                        list9 = (List) c.z(mhpVar, 11, (t9f) arfVarArr[11].getValue(), list9);
                        i |= 2048;
                        tariffOfferDetails5 = tariffOfferDetails2;
                        list11 = list4;
                    case 12:
                        tariffOfferDetails2 = tariffOfferDetails5;
                        list4 = list11;
                        plusPayAdditionalOffers2 = (PlusPayAdditionalOffers) c.z(mhpVar, 12, PlusPayAdditionalOffers$$serializer.INSTANCE, plusPayAdditionalOffers2);
                        i |= 4096;
                        tariffOfferDetails5 = tariffOfferDetails2;
                        list11 = list4;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            tariffOfferDetails = tariffOfferDetails5;
            list = list9;
            str = str7;
            str2 = str8;
            list2 = list10;
            paymentText = paymentText3;
            str3 = str9;
            successScreenDetails = successScreenDetails3;
            plusPayRichText = plusPayRichText3;
            bool = bool3;
            plusPayLegalInfo = plusPayLegalInfo3;
            list3 = list11;
            plusPayAdditionalOffers = plusPayAdditionalOffers2;
        }
        int i5 = i;
        c.b(mhpVar);
        return new PlusPayCompositeOfferDetails(i5, tariffOfferDetails, list3, plusPayLegalInfo, plusPayRichText, paymentText, successScreenDetails, list2, bool, str2, str3, str, list, plusPayAdditionalOffers, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayCompositeOfferDetails value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayCompositeOfferDetails.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
