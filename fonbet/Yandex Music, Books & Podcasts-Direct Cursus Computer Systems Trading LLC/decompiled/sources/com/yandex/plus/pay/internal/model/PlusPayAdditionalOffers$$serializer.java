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
import defpackage.tkr;
import defpackage.tq5;
import defpackage.vx7;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayAdditionalOffers.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayAdditionalOffers$$serializer implements p3d {

    @NotNull
    public static final PlusPayAdditionalOffers$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayAdditionalOffers$$serializer plusPayAdditionalOffers$$serializer = new PlusPayAdditionalOffers$$serializer();
        INSTANCE = plusPayAdditionalOffers$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers", plusPayAdditionalOffers$$serializer, 5);
        j5mVar.k("eventSessionId", false);
        j5mVar.k("title", false);
        j5mVar.k("offers", false);
        j5mVar.k("passedUpsaleSteps", false);
        j5mVar.k("offerSwitchToggle", false);
        descriptor = j5mVar;
    }

    private PlusPayAdditionalOffers$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayAdditionalOffers.$childSerializers;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, arfVarArr[2].getValue(), arfVarArr[3].getValue(), ff7.C(PlusPayOfferSwitchToggle$$serializer.INSTANCE)};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayAdditionalOffers deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        String str;
        String str2;
        List list;
        List list2;
        PlusPayOfferSwitchToggle plusPayOfferSwitchToggle;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayAdditionalOffers.$childSerializers;
        String str3 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            List list3 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            list2 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            plusPayOfferSwitchToggle = (PlusPayOfferSwitchToggle) c.n(mhpVar, 4, PlusPayOfferSwitchToggle$$serializer.INSTANCE, null);
            i = 31;
            list = list3;
            str2 = g2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            List list4 = null;
            List list5 = null;
            PlusPayOfferSwitchToggle plusPayOfferSwitchToggle2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    list4 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list4);
                    i2 |= 4;
                } else if (w == 3) {
                    list5 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list5);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    plusPayOfferSwitchToggle2 = (PlusPayOfferSwitchToggle) c.n(mhpVar, 4, PlusPayOfferSwitchToggle$$serializer.INSTANCE, plusPayOfferSwitchToggle2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            list = list4;
            list2 = list5;
            plusPayOfferSwitchToggle = plusPayOfferSwitchToggle2;
        }
        c.b(mhpVar);
        return new PlusPayAdditionalOffers(i, str, str2, list, list2, plusPayOfferSwitchToggle, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayAdditionalOffers value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayAdditionalOffers.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
