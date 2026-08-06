package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* loaded from: classes.dex */
public final class Q2 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R2 f4949a;

    public Q2(R2 r2) {
        this.f4949a = r2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f4949a.f4977b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f4949a.getClass();
        BatteryInfo a2 = R2.a(intent);
        this.f4949a.f4977b = a2;
        if (chargeType != a2.chargeType) {
            this.f4949a.f4976a.execute(new P2(this, a2));
        }
    }
}
