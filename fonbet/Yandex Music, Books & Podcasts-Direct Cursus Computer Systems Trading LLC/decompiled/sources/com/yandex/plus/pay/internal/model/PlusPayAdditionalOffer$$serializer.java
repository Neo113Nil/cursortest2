package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
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
import defpackage.tq5;
import defpackage.vx7;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayAdditionalOffer.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayAdditionalOffer$$serializer implements p3d {

    @NotNull
    public static final PlusPayAdditionalOffer$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayAdditionalOffer$$serializer plusPayAdditionalOffer$$serializer = new PlusPayAdditionalOffer$$serializer();
        INSTANCE = plusPayAdditionalOffer$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer", plusPayAdditionalOffer$$serializer, 8);
        j5mVar.k("offer", false);
        j5mVar.k("assets", false);
        j5mVar.k("isAvailable", false);
        j5mVar.k("isSelected", false);
        j5mVar.k("offersToReplace", false);
        j5mVar.k("upsaleStep", false);
        j5mVar.k("upsaleType", false);
        j5mVar.k("offerSwitchToggle", false);
        descriptor = j5mVar;
    }

    private PlusPayAdditionalOffer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayAdditionalOffer.$childSerializers;
        oc3 oc3Var = oc3.a;
        return new t9f[]{PlusPayAdditionalOffer$Offer$$serializer.INSTANCE, PlusPayAdditionalOffer$Assets$$serializer.INSTANCE, oc3Var, oc3Var, arfVarArr[4].getValue(), arfVarArr[5].getValue(), arfVarArr[6].getValue(), ff7.C(PlusPayOfferSwitchToggle$$serializer.INSTANCE)};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayAdditionalOffer deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        boolean z;
        PlusPayOfferSwitchToggle plusPayOfferSwitchToggle;
        PlusPayUpsaleType plusPayUpsaleType;
        PlusPayUpsaleStep plusPayUpsaleStep;
        List list;
        boolean z2;
        int i;
        PlusPayAdditionalOffer.Offer offer;
        PlusPayAdditionalOffer.Assets assets;
        int i2;
        int i3;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayAdditionalOffer.$childSerializers;
        int i4 = 7;
        int i5 = 6;
        int i6 = 4;
        if (c.m()) {
            PlusPayAdditionalOffer.Offer offer2 = (PlusPayAdditionalOffer.Offer) c.z(mhpVar, 0, PlusPayAdditionalOffer$Offer$$serializer.INSTANCE, null);
            PlusPayAdditionalOffer.Assets assets2 = (PlusPayAdditionalOffer.Assets) c.z(mhpVar, 1, PlusPayAdditionalOffer$Assets$$serializer.INSTANCE, null);
            boolean D = c.D(mhpVar, 2);
            boolean D2 = c.D(mhpVar, 3);
            List list2 = (List) c.z(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            PlusPayUpsaleStep plusPayUpsaleStep2 = (PlusPayUpsaleStep) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            plusPayUpsaleType = (PlusPayUpsaleType) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            offer = offer2;
            plusPayOfferSwitchToggle = (PlusPayOfferSwitchToggle) c.n(mhpVar, 7, PlusPayOfferSwitchToggle$$serializer.INSTANCE, null);
            z = D2;
            z2 = D;
            i = 255;
            plusPayUpsaleStep = plusPayUpsaleStep2;
            list = list2;
            assets = assets2;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i7 = 0;
            PlusPayOfferSwitchToggle plusPayOfferSwitchToggle2 = null;
            PlusPayUpsaleType plusPayUpsaleType2 = null;
            PlusPayUpsaleStep plusPayUpsaleStep3 = null;
            PlusPayAdditionalOffer.Offer offer3 = null;
            PlusPayAdditionalOffer.Assets assets3 = null;
            boolean z5 = false;
            List list3 = null;
            while (z3) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z3 = false;
                        i5 = 6;
                        i6 = 4;
                    case 0:
                        offer3 = (PlusPayAdditionalOffer.Offer) c.z(mhpVar, 0, PlusPayAdditionalOffer$Offer$$serializer.INSTANCE, offer3);
                        i7 |= 1;
                        i4 = 7;
                        i5 = 6;
                        i6 = 4;
                    case 1:
                        assets3 = (PlusPayAdditionalOffer.Assets) c.z(mhpVar, 1, PlusPayAdditionalOffer$Assets$$serializer.INSTANCE, assets3);
                        i7 |= 2;
                        i4 = 7;
                        i5 = 6;
                        i6 = 4;
                    case 2:
                        i7 |= 4;
                        i6 = i6;
                        z5 = c.D(mhpVar, 2);
                        i4 = 7;
                    case 3:
                        i3 = i6;
                        z4 = c.D(mhpVar, 3);
                        i7 |= 8;
                        i6 = i3;
                        i4 = 7;
                    case 4:
                        int i8 = i6;
                        i3 = i8;
                        list3 = (List) c.z(mhpVar, i3, (t9f) arfVarArr[i8].getValue(), list3);
                        i7 |= 16;
                        i6 = i3;
                        i4 = 7;
                    case 5:
                        i2 = i6;
                        plusPayUpsaleStep3 = (PlusPayUpsaleStep) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), plusPayUpsaleStep3);
                        i7 |= 32;
                        i6 = i2;
                    case 6:
                        i2 = i6;
                        plusPayUpsaleType2 = (PlusPayUpsaleType) c.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), plusPayUpsaleType2);
                        i7 |= 64;
                        i6 = i2;
                    case 7:
                        i2 = i6;
                        plusPayOfferSwitchToggle2 = (PlusPayOfferSwitchToggle) c.n(mhpVar, i4, PlusPayOfferSwitchToggle$$serializer.INSTANCE, plusPayOfferSwitchToggle2);
                        i7 |= 128;
                        i6 = i2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            z = z4;
            plusPayOfferSwitchToggle = plusPayOfferSwitchToggle2;
            plusPayUpsaleType = plusPayUpsaleType2;
            plusPayUpsaleStep = plusPayUpsaleStep3;
            list = list3;
            z2 = z5;
            i = i7;
            offer = offer3;
            assets = assets3;
        }
        c.b(mhpVar);
        return new PlusPayAdditionalOffer(i, offer, assets, z2, z, list, plusPayUpsaleStep, plusPayUpsaleType, plusPayOfferSwitchToggle, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayAdditionalOffer value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayAdditionalOffer.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
