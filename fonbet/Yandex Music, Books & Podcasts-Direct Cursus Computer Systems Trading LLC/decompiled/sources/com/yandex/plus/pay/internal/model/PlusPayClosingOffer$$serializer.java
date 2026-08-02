package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.core.data.common.w;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$$serializer;
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
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayClosingOffer.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayClosingOffer$$serializer implements p3d {

    @NotNull
    public static final PlusPayClosingOffer$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayClosingOffer$$serializer plusPayClosingOffer$$serializer = new PlusPayClosingOffer$$serializer();
        INSTANCE = plusPayClosingOffer$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayClosingOffer", plusPayClosingOffer$$serializer, 8);
        j5mVar.k("backgroundImage", false);
        j5mVar.k("titleText", false);
        j5mVar.k("subtitleText", false);
        j5mVar.k("offer", false);
        j5mVar.k("assets", false);
        j5mVar.k("acceptButtonText", false);
        j5mVar.k("rejectButtonText", false);
        j5mVar.k("footerText", false);
        descriptor = j5mVar;
    }

    private PlusPayClosingOffer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayClosingOffer.$childSerializers;
        PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
        tkr tkrVar = tkr.a;
        return new t9f[]{w.a, plusPayRichText$$serializer, ff7.C(plusPayRichText$$serializer), PlusPayCompositeOffers$Offer$$serializer.INSTANCE, arfVarArr[4].getValue(), tkrVar, tkrVar, ff7.C(plusPayRichText$$serializer)};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayClosingOffer deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        PlusPayRichText plusPayRichText;
        List list;
        y yVar;
        PlusPayRichText plusPayRichText2;
        PlusPayRichText plusPayRichText3;
        PlusPayCompositeOffers.Offer offer;
        String str;
        String str2;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayClosingOffer.$childSerializers;
        int i2 = 7;
        char c2 = 2;
        y yVar2 = null;
        if (c.m()) {
            y yVar3 = (y) c.z(mhpVar, 0, w.a, null);
            PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
            PlusPayRichText plusPayRichText4 = (PlusPayRichText) c.z(mhpVar, 1, plusPayRichText$$serializer, null);
            PlusPayRichText plusPayRichText5 = (PlusPayRichText) c.n(mhpVar, 2, plusPayRichText$$serializer, null);
            PlusPayCompositeOffers.Offer offer2 = (PlusPayCompositeOffers.Offer) c.z(mhpVar, 3, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, null);
            List list2 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            String g = c.g(mhpVar, 5);
            String g2 = c.g(mhpVar, 6);
            list = list2;
            yVar = yVar3;
            plusPayRichText = (PlusPayRichText) c.n(mhpVar, 7, plusPayRichText$$serializer, null);
            str2 = g2;
            str = g;
            offer = offer2;
            plusPayRichText3 = plusPayRichText5;
            i = 255;
            plusPayRichText2 = plusPayRichText4;
        } else {
            boolean z = true;
            int i3 = 0;
            PlusPayRichText plusPayRichText6 = null;
            List list3 = null;
            PlusPayRichText plusPayRichText7 = null;
            PlusPayRichText plusPayRichText8 = null;
            PlusPayCompositeOffers.Offer offer3 = null;
            String str3 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        yVar2 = (y) c.z(mhpVar, 0, w.a, yVar2);
                        i3 |= 1;
                        i2 = 7;
                        c2 = 2;
                    case 1:
                        plusPayRichText7 = (PlusPayRichText) c.z(mhpVar, 1, PlusPayRichText$$serializer.INSTANCE, plusPayRichText7);
                        i3 |= 2;
                        i2 = 7;
                        c2 = 2;
                    case 2:
                        plusPayRichText8 = (PlusPayRichText) c.n(mhpVar, 2, PlusPayRichText$$serializer.INSTANCE, plusPayRichText8);
                        i3 |= 4;
                        c2 = 2;
                        i2 = 7;
                    case 3:
                        offer3 = (PlusPayCompositeOffers.Offer) c.z(mhpVar, 3, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, offer3);
                        i3 |= 8;
                        c2 = 2;
                    case 4:
                        list3 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list3);
                        i3 |= 16;
                        c2 = 2;
                    case 5:
                        str3 = c.g(mhpVar, 5);
                        i3 |= 32;
                        c2 = 2;
                    case 6:
                        str4 = c.g(mhpVar, 6);
                        i3 |= 64;
                        c2 = 2;
                    case 7:
                        plusPayRichText6 = (PlusPayRichText) c.n(mhpVar, i2, PlusPayRichText$$serializer.INSTANCE, plusPayRichText6);
                        i3 |= 128;
                        c2 = 2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            plusPayRichText = plusPayRichText6;
            list = list3;
            yVar = yVar2;
            plusPayRichText2 = plusPayRichText7;
            plusPayRichText3 = plusPayRichText8;
            offer = offer3;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new PlusPayClosingOffer(i, yVar, plusPayRichText2, plusPayRichText3, offer, list, str, str2, plusPayRichText, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayClosingOffer value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayClosingOffer.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
