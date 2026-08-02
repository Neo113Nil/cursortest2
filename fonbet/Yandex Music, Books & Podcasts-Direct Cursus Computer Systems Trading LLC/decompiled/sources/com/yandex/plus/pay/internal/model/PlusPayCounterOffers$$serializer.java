package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
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
import defpackage.tq5;
import defpackage.vx7;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayCounterOffers.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayCounterOffers$$serializer implements p3d {

    @NotNull
    public static final PlusPayCounterOffers$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayCounterOffers$$serializer plusPayCounterOffers$$serializer = new PlusPayCounterOffers$$serializer();
        INSTANCE = plusPayCounterOffers$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayCounterOffers", plusPayCounterOffers$$serializer, 5);
        j5mVar.k("title", false);
        j5mVar.k("subtitle", false);
        j5mVar.k("offers", false);
        j5mVar.k("alternativeActionText", false);
        j5mVar.k("supportText", false);
        descriptor = j5mVar;
    }

    private PlusPayCounterOffers$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayCounterOffers.$childSerializers;
        PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
        return new t9f[]{ff7.C(plusPayRichText$$serializer), ff7.C(plusPayRichText$$serializer), arfVarArr[2].getValue(), ff7.C(plusPayRichText$$serializer), ff7.C(plusPayRichText$$serializer)};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayCounterOffers deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        PlusPayRichText plusPayRichText;
        PlusPayRichText plusPayRichText2;
        List list;
        PlusPayRichText plusPayRichText3;
        PlusPayRichText plusPayRichText4;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayCounterOffers.$childSerializers;
        PlusPayRichText plusPayRichText5 = null;
        if (c.m()) {
            PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
            PlusPayRichText plusPayRichText6 = (PlusPayRichText) c.n(mhpVar, 0, plusPayRichText$$serializer, null);
            PlusPayRichText plusPayRichText7 = (PlusPayRichText) c.n(mhpVar, 1, plusPayRichText$$serializer, null);
            List list2 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            PlusPayRichText plusPayRichText8 = (PlusPayRichText) c.n(mhpVar, 3, plusPayRichText$$serializer, null);
            list = list2;
            plusPayRichText4 = (PlusPayRichText) c.n(mhpVar, 4, plusPayRichText$$serializer, null);
            plusPayRichText3 = plusPayRichText8;
            i = 31;
            plusPayRichText2 = plusPayRichText7;
            plusPayRichText = plusPayRichText6;
        } else {
            boolean z = true;
            int i2 = 0;
            PlusPayRichText plusPayRichText9 = null;
            List list3 = null;
            PlusPayRichText plusPayRichText10 = null;
            PlusPayRichText plusPayRichText11 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    plusPayRichText5 = (PlusPayRichText) c.n(mhpVar, 0, PlusPayRichText$$serializer.INSTANCE, plusPayRichText5);
                    i2 |= 1;
                } else if (w == 1) {
                    plusPayRichText9 = (PlusPayRichText) c.n(mhpVar, 1, PlusPayRichText$$serializer.INSTANCE, plusPayRichText9);
                    i2 |= 2;
                } else if (w == 2) {
                    list3 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list3);
                    i2 |= 4;
                } else if (w == 3) {
                    plusPayRichText10 = (PlusPayRichText) c.n(mhpVar, 3, PlusPayRichText$$serializer.INSTANCE, plusPayRichText10);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    plusPayRichText11 = (PlusPayRichText) c.n(mhpVar, 4, PlusPayRichText$$serializer.INSTANCE, plusPayRichText11);
                    i2 |= 16;
                }
            }
            i = i2;
            plusPayRichText = plusPayRichText5;
            plusPayRichText2 = plusPayRichText9;
            list = list3;
            plusPayRichText3 = plusPayRichText10;
            plusPayRichText4 = plusPayRichText11;
        }
        c.b(mhpVar);
        return new PlusPayCounterOffers(i, plusPayRichText, plusPayRichText2, list, plusPayRichText3, plusPayRichText4, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayCounterOffers value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayCounterOffers.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
