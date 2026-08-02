package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayWebPaymentWidgetTimeoutParams$$serializer implements p3d {

    @NotNull
    public static final PlusPayWebPaymentWidgetTimeoutParams$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayWebPaymentWidgetTimeoutParams$$serializer plusPayWebPaymentWidgetTimeoutParams$$serializer = new PlusPayWebPaymentWidgetTimeoutParams$$serializer();
        INSTANCE = plusPayWebPaymentWidgetTimeoutParams$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayWebPaymentWidgetTimeoutParams", plusPayWebPaymentWidgetTimeoutParams$$serializer, 2);
        j5mVar.k("loadMessageTimeoutMillis", false);
        j5mVar.k("startMessageTimeoutMillis", false);
        descriptor = j5mVar;
    }

    private PlusPayWebPaymentWidgetTimeoutParams$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        mvg mvgVar = mvg.a;
        return new t9f[]{ff7.C(mvgVar), ff7.C(mvgVar)};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayWebPaymentWidgetTimeoutParams deserialize(@NotNull eg7 decoder) {
        Long l;
        int i;
        Long l2;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        if (c.m()) {
            mvg mvgVar = mvg.a;
            l2 = (Long) c.n(mhpVar, 0, mvgVar, null);
            l = (Long) c.n(mhpVar, 1, mvgVar, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            l = null;
            Long l3 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    l3 = (Long) c.n(mhpVar, 0, mvg.a, l3);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    l = (Long) c.n(mhpVar, 1, mvg.a, l);
                    i2 |= 2;
                }
            }
            i = i2;
            l2 = l3;
        }
        c.b(mhpVar);
        return new PlusPayWebPaymentWidgetTimeoutParams(i, l2, l, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayWebPaymentWidgetTimeoutParams value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayWebPaymentWidgetTimeoutParams.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
