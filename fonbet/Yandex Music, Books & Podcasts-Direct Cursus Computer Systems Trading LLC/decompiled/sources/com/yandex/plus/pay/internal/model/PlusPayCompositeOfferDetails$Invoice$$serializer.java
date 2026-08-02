package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.api.model.PlusPayPrice$$serializer;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.vx7;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails.Invoice.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$Invoice;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$Invoice;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$Invoice;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayCompositeOfferDetails$Invoice$$serializer implements p3d {

    @NotNull
    public static final PlusPayCompositeOfferDetails$Invoice$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayCompositeOfferDetails$Invoice$$serializer plusPayCompositeOfferDetails$Invoice$$serializer = new PlusPayCompositeOfferDetails$Invoice$$serializer();
        INSTANCE = plusPayCompositeOfferDetails$Invoice$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails.Invoice", plusPayCompositeOfferDetails$Invoice$$serializer, 3);
        j5mVar.k("timestamp", false);
        j5mVar.k("price", false);
        j5mVar.k("maxPoints", false);
        descriptor = j5mVar;
    }

    private PlusPayCompositeOfferDetails$Invoice$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        PlusPayPrice$$serializer plusPayPrice$$serializer = PlusPayPrice$$serializer.INSTANCE;
        return new t9f[]{mvg.a, plusPayPrice$$serializer, ff7.C(plusPayPrice$$serializer)};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayCompositeOfferDetails.Invoice deserialize(@NotNull eg7 decoder) {
        int i;
        PlusPayPrice plusPayPrice;
        PlusPayPrice plusPayPrice2;
        long j;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        PlusPayPrice plusPayPrice3 = null;
        if (c.m()) {
            long q = c.q(mhpVar, 0);
            PlusPayPrice$$serializer plusPayPrice$$serializer = PlusPayPrice$$serializer.INSTANCE;
            PlusPayPrice plusPayPrice4 = (PlusPayPrice) c.z(mhpVar, 1, plusPayPrice$$serializer, null);
            plusPayPrice2 = (PlusPayPrice) c.n(mhpVar, 2, plusPayPrice$$serializer, null);
            i = 7;
            plusPayPrice = plusPayPrice4;
            j = q;
        } else {
            boolean z = true;
            int i2 = 0;
            long j2 = 0;
            PlusPayPrice plusPayPrice5 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    j2 = c.q(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    plusPayPrice3 = (PlusPayPrice) c.z(mhpVar, 1, PlusPayPrice$$serializer.INSTANCE, plusPayPrice3);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    plusPayPrice5 = (PlusPayPrice) c.n(mhpVar, 2, PlusPayPrice$$serializer.INSTANCE, plusPayPrice5);
                    i2 |= 4;
                }
            }
            i = i2;
            plusPayPrice = plusPayPrice3;
            plusPayPrice2 = plusPayPrice5;
            j = j2;
        }
        c.b(mhpVar);
        return new PlusPayCompositeOfferDetails.Invoice(i, j, plusPayPrice, plusPayPrice2, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayCompositeOfferDetails.Invoice value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayCompositeOfferDetails.Invoice.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
