package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class P2 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f4897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q2 f4898b;

    public P2(Q2 q2, BatteryInfo batteryInfo) {
        this.f4898b = q2;
        this.f4897a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        R2 r2 = this.f4898b.f4949a;
        ChargeType chargeType = this.f4897a.chargeType;
        ChargeType chargeType2 = R2.f4975d;
        synchronized (r2) {
            Iterator it = r2.f4978c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
