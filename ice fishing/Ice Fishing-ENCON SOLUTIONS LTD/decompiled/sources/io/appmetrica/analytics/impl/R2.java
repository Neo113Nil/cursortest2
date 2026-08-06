package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class R2 implements ChargeTypeProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final ChargeType f4975d = ChargeType.UNKNOWN;

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f4976a;

    /* renamed from: b, reason: collision with root package name */
    public volatile BatteryInfo f4977b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4978c = new ArrayList();

    public R2(ICommonExecutor iCommonExecutor, O2 o2) {
        Q2 q2 = new Q2(this);
        this.f4976a = iCommonExecutor;
        this.f4977b = a(o2.a(q2));
    }

    public static BatteryInfo a(Intent intent) {
        ChargeType chargeType = f4975d;
        Integer num = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                num = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            chargeType = ChargeType.NONE;
            if (intExtra3 == 1) {
                chargeType = ChargeType.AC;
            } else if (intExtra3 == 2) {
                chargeType = ChargeType.USB;
            } else if (intExtra3 == 4) {
                chargeType = ChargeType.WIRELESS;
            }
        }
        return new BatteryInfo(num, chargeType);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final Integer getBatteryLevel() {
        BatteryInfo batteryInfo = this.f4977b;
        if (batteryInfo == null) {
            return null;
        }
        return batteryInfo.batteryLevel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final ChargeType getChargeType() {
        BatteryInfo batteryInfo = this.f4977b;
        return batteryInfo == null ? ChargeType.UNKNOWN : batteryInfo.chargeType;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final synchronized void registerChargeTypeListener(ChargeTypeChangeListener chargeTypeChangeListener) {
        this.f4978c.add(chargeTypeChangeListener);
        chargeTypeChangeListener.onChargeTypeChanged(getChargeType());
    }
}
