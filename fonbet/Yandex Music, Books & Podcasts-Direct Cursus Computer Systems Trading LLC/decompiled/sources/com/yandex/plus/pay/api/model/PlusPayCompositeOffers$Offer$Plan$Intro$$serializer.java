package com.yandex.plus.pay.api.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.cqe;
import defpackage.eg7;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/api/model/PlusPayCompositeOffers.Offer.Plan.Intro.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayCompositeOffers$Offer$Plan$Intro$$serializer implements p3d {

    @NotNull
    public static final PlusPayCompositeOffers$Offer$Plan$Intro$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayCompositeOffers$Offer$Plan$Intro$$serializer plusPayCompositeOffers$Offer$Plan$Intro$$serializer = new PlusPayCompositeOffers$Offer$Plan$Intro$$serializer();
        INSTANCE = plusPayCompositeOffers$Offer$Plan$Intro$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer.Plan.Intro", plusPayCompositeOffers$Offer$Plan$Intro$$serializer, 3);
        j5mVar.k("period", false);
        j5mVar.k("price", false);
        j5mVar.k("repetitionCount", false);
        descriptor = j5mVar;
    }

    private PlusPayCompositeOffers$Offer$Plan$Intro$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, PlusPayPrice$$serializer.INSTANCE, cqe.a};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayCompositeOffers.Offer.Plan.Intro deserialize(@NotNull eg7 decoder) {
        int i;
        int i2;
        String str;
        PlusPayPrice plusPayPrice;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            PlusPayPrice plusPayPrice2 = (PlusPayPrice) c.z(mhpVar, 1, PlusPayPrice$$serializer.INSTANCE, null);
            str = g;
            i = c.k(mhpVar, 2);
            plusPayPrice = plusPayPrice2;
            i2 = 7;
        } else {
            boolean z = true;
            int i3 = 0;
            String str2 = null;
            PlusPayPrice plusPayPrice3 = null;
            int i4 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i4 |= 1;
                } else if (w == 1) {
                    plusPayPrice3 = (PlusPayPrice) c.z(mhpVar, 1, PlusPayPrice$$serializer.INSTANCE, plusPayPrice3);
                    i4 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    i3 = c.k(mhpVar, 2);
                    i4 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            str = str2;
            plusPayPrice = plusPayPrice3;
        }
        c.b(mhpVar);
        return new PlusPayCompositeOffers.Offer.Plan.Intro(i2, str, plusPayPrice, i, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayCompositeOffers.Offer.Plan.Intro value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayCompositeOffers.Offer.Plan.Intro.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
