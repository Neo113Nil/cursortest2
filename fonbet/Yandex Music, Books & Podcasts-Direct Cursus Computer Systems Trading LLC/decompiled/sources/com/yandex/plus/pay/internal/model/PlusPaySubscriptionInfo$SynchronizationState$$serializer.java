package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.internal.model.PlusPaySubscriptionInfo;
import defpackage.eg7;
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
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPaySubscriptionInfo.SynchronizationState.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPaySubscriptionInfo$SynchronizationState;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPaySubscriptionInfo$SynchronizationState;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPaySubscriptionInfo$SynchronizationState;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPaySubscriptionInfo$SynchronizationState$$serializer implements p3d {

    @NotNull
    public static final PlusPaySubscriptionInfo$SynchronizationState$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPaySubscriptionInfo$SynchronizationState$$serializer plusPaySubscriptionInfo$SynchronizationState$$serializer = new PlusPaySubscriptionInfo$SynchronizationState$$serializer();
        INSTANCE = plusPaySubscriptionInfo$SynchronizationState$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPaySubscriptionInfo.SynchronizationState", plusPaySubscriptionInfo$SynchronizationState$$serializer, 4);
        j5mVar.k("ottSubscriptionSync", false);
        j5mVar.k("featuresSync", false);
        j5mVar.k("familyRoleSync", false);
        j5mVar.k("totalSync", false);
        descriptor = j5mVar;
    }

    private PlusPaySubscriptionInfo$SynchronizationState$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        oc3 oc3Var = oc3.a;
        return new t9f[]{oc3Var, oc3Var, oc3Var, oc3Var};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPaySubscriptionInfo.SynchronizationState deserialize(@NotNull eg7 decoder) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        if (c.m()) {
            z = c.D(mhpVar, 0);
            boolean D = c.D(mhpVar, 1);
            boolean D2 = c.D(mhpVar, 2);
            z2 = c.D(mhpVar, 3);
            z3 = D2;
            z4 = D;
            i = 15;
        } else {
            boolean z5 = true;
            z = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i2 = 0;
            while (z5) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z5 = false;
                } else if (w == 0) {
                    z = c.D(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    z8 = c.D(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    z7 = c.D(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    z6 = c.D(mhpVar, 3);
                    i2 |= 8;
                }
            }
            z2 = z6;
            z3 = z7;
            z4 = z8;
            i = i2;
        }
        boolean z9 = z;
        c.b(mhpVar);
        return new PlusPaySubscriptionInfo.SynchronizationState(i, z9, z4, z3, z2, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPaySubscriptionInfo.SynchronizationState value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPaySubscriptionInfo.SynchronizationState.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
