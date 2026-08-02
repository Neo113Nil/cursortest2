package com.datadog.android.core.internal.system;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.receiver.ThreadSafeReceiver;
import com.datadog.android.core.internal.system.SystemInfo;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes4.dex */
public final class BroadcastReceiverSystemInfoProvider extends ThreadSafeReceiver implements SystemInfoProvider {
    public final InternalLogger internalLogger;
    public SystemInfo systemInfo;
    public static final Set batteryFullOrChargingStatus = ArraysKt___ArraysKt.toSet(new SystemInfo.BatteryStatus[]{SystemInfo.BatteryStatus.CHARGING, SystemInfo.BatteryStatus.FULL});
    public static final Set PLUGGED_IN_STATUS_VALUES = ArraysKt___ArraysKt.toSet(new Integer[]{1, 4, 2});

    public BroadcastReceiverSystemInfoProvider(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
        this.systemInfo = new SystemInfo();
    }

    @Override // com.datadog.android.core.internal.system.SystemInfoProvider
    public final SystemInfo getLatestSystemInfo() {
        return this.systemInfo;
    }

    public final void handleBatteryIntent(Intent intent) {
        boolean z = true;
        int intExtra = intent.getIntExtra("status", 1);
        int intExtra2 = intent.getIntExtra("level", -1);
        int intExtra3 = intent.getIntExtra("scale", 100);
        int intExtra4 = intent.getIntExtra("plugged", -1);
        SystemInfo.BatteryStatus batteryStatus = intExtra != 2 ? intExtra != 3 ? intExtra != 4 ? intExtra != 5 ? SystemInfo.BatteryStatus.UNKNOWN : SystemInfo.BatteryStatus.FULL : SystemInfo.BatteryStatus.NOT_CHARGING : SystemInfo.BatteryStatus.DISCHARGING : SystemInfo.BatteryStatus.CHARGING;
        boolean booleanExtra = intent.getBooleanExtra("present", true);
        int roundToInt = MathKt__MathJVMKt.roundToInt((intExtra2 * 100.0f) / intExtra3);
        if (!PLUGGED_IN_STATUS_VALUES.contains(Integer.valueOf(intExtra4)) && booleanExtra) {
            z = false;
        }
        this.systemInfo = SystemInfo.copy$default(this.systemInfo, batteryFullOrChargingStatus.contains(batteryStatus), roundToInt, false, z, 4);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        context.getClass();
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (RuntimeException e) {
                DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, target}), DefaultAndroidInfoProvider$timeZone$2.INSTANCE$1, e, 48);
                return;
            }
        } else {
            action = null;
        }
        if (Intrinsics.areEqual(action, "android.intent.action.BATTERY_CHANGED")) {
            handleBatteryIntent(intent);
        } else {
            if (!Intrinsics.areEqual(action, "android.os.action.POWER_SAVE_MODE_CHANGED")) {
                DBUtil.log$default(this.internalLogger, 2, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, target}), new DatadogInterceptor$intercept$1(action, 8), null, 56);
                return;
            }
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            this.systemInfo = SystemInfo.copy$default(this.systemInfo, false, 0, powerManager != null ? powerManager.isPowerSaveMode() : false, false, 11);
        }
    }

    @Override // com.datadog.android.core.internal.system.SystemInfoProvider
    public final void unregister(Context context) {
        if (this.isRegistered.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }
}
