package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$$serializer;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import defpackage.eg7;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayPresale.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayPresale;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayPresale;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayPresale;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayPresale$$serializer implements p3d {

    @NotNull
    public static final PlusPayPresale$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayPresale$$serializer plusPayPresale$$serializer = new PlusPayPresale$$serializer();
        INSTANCE = plusPayPresale$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayPresale", plusPayPresale$$serializer, 3);
        j5mVar.k("suggestedOffer", false);
        j5mVar.k("loadingDelayMillis", false);
        j5mVar.k("assets", false);
        descriptor = j5mVar;
    }

    private PlusPayPresale$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        return new t9f[]{PlusPayCompositeOffers$Offer$$serializer.INSTANCE, mvg.a, PlusPayPresale$Assets$$serializer.INSTANCE};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayPresale deserialize(@NotNull eg7 decoder) {
        PlusPayCompositeOffers.Offer offer;
        int i;
        long j;
        PlusPayPresale.Assets assets;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        if (c.m()) {
            offer = (PlusPayCompositeOffers.Offer) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, null);
            long q = c.q(mhpVar, 1);
            i = 7;
            assets = (PlusPayPresale.Assets) c.z(mhpVar, 2, PlusPayPresale$Assets$$serializer.INSTANCE, null);
            j = q;
        } else {
            long j2 = 0;
            boolean z = true;
            offer = null;
            PlusPayPresale.Assets assets2 = null;
            i = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    offer = (PlusPayCompositeOffers.Offer) c.z(mhpVar, 0, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, offer);
                    i |= 1;
                } else if (w == 1) {
                    j2 = c.q(mhpVar, 1);
                    i |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    assets2 = (PlusPayPresale.Assets) c.z(mhpVar, 2, PlusPayPresale$Assets$$serializer.INSTANCE, assets2);
                    i |= 4;
                }
            }
            j = j2;
            assets = assets2;
        }
        PlusPayCompositeOffers.Offer offer2 = offer;
        int i2 = i;
        c.b(mhpVar);
        return new PlusPayPresale(i2, offer2, j, assets, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayPresale value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayPresale.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
