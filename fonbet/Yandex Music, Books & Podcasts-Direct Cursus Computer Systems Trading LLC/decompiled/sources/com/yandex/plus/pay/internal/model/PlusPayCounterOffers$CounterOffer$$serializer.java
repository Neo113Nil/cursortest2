package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.core.data.common.w;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$$serializer;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayCounterOffers.CounterOffer.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers$CounterOffer;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers$CounterOffer;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers$CounterOffer;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayCounterOffers$CounterOffer$$serializer implements p3d {

    @NotNull
    public static final PlusPayCounterOffers$CounterOffer$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayCounterOffers$CounterOffer$$serializer plusPayCounterOffers$CounterOffer$$serializer = new PlusPayCounterOffers$CounterOffer$$serializer();
        INSTANCE = plusPayCounterOffers$CounterOffer$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayCounterOffers.CounterOffer", plusPayCounterOffers$CounterOffer$$serializer, 6);
        j5mVar.k("offer", false);
        j5mVar.k("title", false);
        j5mVar.k("benefits", false);
        j5mVar.k("buttonText", false);
        j5mVar.k("additionalButtonText", false);
        j5mVar.k("icon", false);
        descriptor = j5mVar;
    }

    private PlusPayCounterOffers$CounterOffer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayCounterOffers.CounterOffer.$childSerializers;
        tkr tkrVar = tkr.a;
        return new t9f[]{PlusPayCompositeOffers$Offer$$serializer.INSTANCE, PlusPayRichText$$serializer.INSTANCE, arfVarArr[2].getValue(), tkrVar, ff7.C(tkrVar), w.a};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayCounterOffers.CounterOffer deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        PlusPayCompositeOffers.Offer offer;
        PlusPayRichText plusPayRichText;
        List list;
        String str;
        String str2;
        y yVar;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayCounterOffers.CounterOffer.$childSerializers;
        int i2 = 5;
        boolean z = false;
        PlusPayCompositeOffers.Offer offer2 = null;
        if (c.m()) {
            PlusPayCompositeOffers.Offer offer3 = (PlusPayCompositeOffers.Offer) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, null);
            PlusPayRichText plusPayRichText2 = (PlusPayRichText) c.z(mhpVar, 1, PlusPayRichText$$serializer.INSTANCE, null);
            List list2 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            String g = c.g(mhpVar, 3);
            String str3 = (String) c.n(mhpVar, 4, tkr.a, null);
            list = list2;
            offer = offer3;
            yVar = (y) c.z(mhpVar, 5, w.a, null);
            str = g;
            str2 = str3;
            i = 63;
            plusPayRichText = plusPayRichText2;
        } else {
            boolean z2 = true;
            int i3 = 0;
            PlusPayRichText plusPayRichText3 = null;
            List list3 = null;
            String str4 = null;
            String str5 = null;
            y yVar2 = null;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = z;
                        i2 = 5;
                    case 0:
                        offer2 = (PlusPayCompositeOffers.Offer) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, offer2);
                        i3 |= 1;
                        z = false;
                        i2 = 5;
                    case 1:
                        plusPayRichText3 = (PlusPayRichText) c.z(mhpVar, 1, PlusPayRichText$$serializer.INSTANCE, plusPayRichText3);
                        i3 |= 2;
                        z = false;
                    case 2:
                        list3 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list3);
                        i3 |= 4;
                        z = false;
                    case 3:
                        str4 = c.g(mhpVar, 3);
                        i3 |= 8;
                        z = false;
                    case 4:
                        str5 = (String) c.n(mhpVar, 4, tkr.a, str5);
                        i3 |= 16;
                        z = false;
                    case 5:
                        yVar2 = (y) c.z(mhpVar, i2, w.a, yVar2);
                        i3 |= 32;
                        z = false;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            offer = offer2;
            plusPayRichText = plusPayRichText3;
            list = list3;
            str = str4;
            str2 = str5;
            yVar = yVar2;
        }
        c.b(mhpVar);
        return new PlusPayCounterOffers.CounterOffer(i, offer, plusPayRichText, list, str, str2, yVar, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayCounterOffers.CounterOffer value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayCounterOffers.CounterOffer.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
