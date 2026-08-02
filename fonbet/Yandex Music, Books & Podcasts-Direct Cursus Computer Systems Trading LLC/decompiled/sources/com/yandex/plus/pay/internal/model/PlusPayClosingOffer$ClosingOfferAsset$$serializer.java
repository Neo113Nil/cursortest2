package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.core.data.common.w;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.vx7;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayClosingOffer.ClosingOfferAsset.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayClosingOffer$ClosingOfferAsset$$serializer implements p3d {

    @NotNull
    public static final PlusPayClosingOffer$ClosingOfferAsset$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayClosingOffer$ClosingOfferAsset$$serializer plusPayClosingOffer$ClosingOfferAsset$$serializer = new PlusPayClosingOffer$ClosingOfferAsset$$serializer();
        INSTANCE = plusPayClosingOffer$ClosingOfferAsset$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayClosingOffer.ClosingOfferAsset", plusPayClosingOffer$ClosingOfferAsset$$serializer, 4);
        j5mVar.k("titleText", false);
        j5mVar.k("icon", false);
        j5mVar.k("buttonText", false);
        j5mVar.k("buttonAdditionalText", false);
        descriptor = j5mVar;
    }

    private PlusPayClosingOffer$ClosingOfferAsset$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
        return new t9f[]{plusPayRichText$$serializer, w.a, plusPayRichText$$serializer, ff7.C(plusPayRichText$$serializer)};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayClosingOffer.ClosingOfferAsset deserialize(@NotNull eg7 decoder) {
        int i;
        PlusPayRichText plusPayRichText;
        y yVar;
        PlusPayRichText plusPayRichText2;
        PlusPayRichText plusPayRichText3;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        PlusPayRichText plusPayRichText4 = null;
        if (c.m()) {
            PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
            PlusPayRichText plusPayRichText5 = (PlusPayRichText) c.z(mhpVar, 0, plusPayRichText$$serializer, null);
            y yVar2 = (y) c.z(mhpVar, 1, w.a, null);
            PlusPayRichText plusPayRichText6 = (PlusPayRichText) c.z(mhpVar, 2, plusPayRichText$$serializer, null);
            plusPayRichText3 = (PlusPayRichText) c.n(mhpVar, 3, plusPayRichText$$serializer, null);
            i = 15;
            plusPayRichText2 = plusPayRichText6;
            yVar = yVar2;
            plusPayRichText = plusPayRichText5;
        } else {
            boolean z = true;
            int i2 = 0;
            y yVar3 = null;
            PlusPayRichText plusPayRichText7 = null;
            PlusPayRichText plusPayRichText8 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    plusPayRichText4 = (PlusPayRichText) c.z(mhpVar, 0, PlusPayRichText$$serializer.INSTANCE, plusPayRichText4);
                    i2 |= 1;
                } else if (w == 1) {
                    yVar3 = (y) c.z(mhpVar, 1, w.a, yVar3);
                    i2 |= 2;
                } else if (w == 2) {
                    plusPayRichText7 = (PlusPayRichText) c.z(mhpVar, 2, PlusPayRichText$$serializer.INSTANCE, plusPayRichText7);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    plusPayRichText8 = (PlusPayRichText) c.n(mhpVar, 3, PlusPayRichText$$serializer.INSTANCE, plusPayRichText8);
                    i2 |= 8;
                }
            }
            i = i2;
            plusPayRichText = plusPayRichText4;
            yVar = yVar3;
            plusPayRichText2 = plusPayRichText7;
            plusPayRichText3 = plusPayRichText8;
        }
        c.b(mhpVar);
        return new PlusPayClosingOffer.ClosingOfferAsset(i, plusPayRichText, yVar, plusPayRichText2, plusPayRichText3, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayClosingOffer.ClosingOfferAsset value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayClosingOffer.ClosingOfferAsset.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
