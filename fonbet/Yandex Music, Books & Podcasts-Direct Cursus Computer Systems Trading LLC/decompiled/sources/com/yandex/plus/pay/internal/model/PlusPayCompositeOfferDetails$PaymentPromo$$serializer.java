package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.data.common.w;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.vx7;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails.PaymentPromo.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentPromo;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentPromo;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentPromo;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayCompositeOfferDetails$PaymentPromo$$serializer implements p3d {

    @NotNull
    public static final PlusPayCompositeOfferDetails$PaymentPromo$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayCompositeOfferDetails$PaymentPromo$$serializer plusPayCompositeOfferDetails$PaymentPromo$$serializer = new PlusPayCompositeOfferDetails$PaymentPromo$$serializer();
        INSTANCE = plusPayCompositeOfferDetails$PaymentPromo$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails.PaymentPromo", plusPayCompositeOfferDetails$PaymentPromo$$serializer, 5);
        j5mVar.k("benefitTitle", false);
        j5mVar.k("additionalTitle", false);
        j5mVar.k("imageUrl", false);
        j5mVar.k("backGroundColor", false);
        j5mVar.k("paymentMethodId", false);
        descriptor = j5mVar;
    }

    private PlusPayCompositeOfferDetails$PaymentPromo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayCompositeOfferDetails.PaymentPromo.$childSerializers;
        PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
        return new t9f[]{plusPayRichText$$serializer, ff7.C(plusPayRichText$$serializer), ff7.C(w.a), arfVarArr[3].getValue(), ff7.C(tkr.a)};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayCompositeOfferDetails.PaymentPromo deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        PlusPayRichText plusPayRichText;
        PlusPayRichText plusPayRichText2;
        y yVar;
        v vVar;
        String str;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayCompositeOfferDetails.PaymentPromo.$childSerializers;
        PlusPayRichText plusPayRichText3 = null;
        if (c.m()) {
            PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
            PlusPayRichText plusPayRichText4 = (PlusPayRichText) c.z(mhpVar, 0, plusPayRichText$$serializer, null);
            PlusPayRichText plusPayRichText5 = (PlusPayRichText) c.n(mhpVar, 1, plusPayRichText$$serializer, null);
            y yVar2 = (y) c.n(mhpVar, 2, w.a, null);
            vVar = (v) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            plusPayRichText2 = plusPayRichText5;
            str = (String) c.n(mhpVar, 4, tkr.a, null);
            yVar = yVar2;
            i = 31;
            plusPayRichText = plusPayRichText4;
        } else {
            boolean z = true;
            int i2 = 0;
            PlusPayRichText plusPayRichText6 = null;
            y yVar3 = null;
            v vVar2 = null;
            String str2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    plusPayRichText3 = (PlusPayRichText) c.z(mhpVar, 0, PlusPayRichText$$serializer.INSTANCE, plusPayRichText3);
                    i2 |= 1;
                } else if (w == 1) {
                    plusPayRichText6 = (PlusPayRichText) c.n(mhpVar, 1, PlusPayRichText$$serializer.INSTANCE, plusPayRichText6);
                    i2 |= 2;
                } else if (w == 2) {
                    yVar3 = (y) c.n(mhpVar, 2, w.a, yVar3);
                    i2 |= 4;
                } else if (w == 3) {
                    vVar2 = (v) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), vVar2);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str2 = (String) c.n(mhpVar, 4, tkr.a, str2);
                    i2 |= 16;
                }
            }
            i = i2;
            plusPayRichText = plusPayRichText3;
            plusPayRichText2 = plusPayRichText6;
            yVar = yVar3;
            vVar = vVar2;
            str = str2;
        }
        c.b(mhpVar);
        return new PlusPayCompositeOfferDetails.PaymentPromo(i, plusPayRichText, plusPayRichText2, yVar, vVar, str, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayCompositeOfferDetails.PaymentPromo value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayCompositeOfferDetails.PaymentPromo.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
