package com.datadog.android.rum.internal.domain.battery;

import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.PowerManager;
import android.os.SystemClock;
import com.datadog.android.rum.internal.domain.InfoData;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.google.android.gms.internal.time.zzbq;
import com.squareup.util.Strings;
import java.util.concurrent.atomic.AtomicLong;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class DefaultBatteryInfoProvider implements InfoProvider {
    public final Context applicationContext;
    public volatile Float batteryLevel;
    public final int batteryLevelPollInterval;
    public final BatteryManager batteryManager;
    public final AtomicLong lastTimeBatteryLevelChecked;
    public volatile Boolean lowPowerMode;
    public final PowerManager powerManager;
    public final zzbq powerSaveModeReceiver;
    public final Strings timeProvider;

    public DefaultBatteryInfoProvider(Context context, Strings strings) {
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Object systemService2 = context.getSystemService("batterymanager");
        BatteryManager batteryManager = systemService2 instanceof BatteryManager ? (BatteryManager) systemService2 : null;
        context.getClass();
        strings.getClass();
        this.applicationContext = context;
        this.timeProvider = strings;
        this.powerManager = powerManager;
        this.batteryManager = batteryManager;
        this.batteryLevelPollInterval = 60000;
        this.lastTimeBatteryLevelChecked = new AtomicLong(Long.MIN_VALUE);
        zzbq zzbqVar = new zzbq(this, 4);
        this.powerSaveModeReceiver = zzbqVar;
        context.registerReceiver(zzbqVar, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public final void cleanup() {
        try {
            this.applicationContext.unregisterReceiver(this.powerSaveModeReceiver);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:3:0x0001, B:5:0x001a, B:7:0x0023, B:9:0x0030, B:13:0x0048, B:15:0x0052, B:19:0x005f, B:21:0x0063, B:23:0x0067, B:24:0x006f, B:25:0x0071), top: B:2:0x0001 }] */
    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InfoData getState() {
        BatteryInfo batteryInfo;
        Float f;
        synchronized (this) {
            try {
                this.timeProvider.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - this.batteryLevelPollInterval >= this.lastTimeBatteryLevelChecked.get()) {
                    this.lastTimeBatteryLevelChecked.set(elapsedRealtime);
                    BatteryManager batteryManager = this.batteryManager;
                    Integer valueOf = batteryManager != null ? Integer.valueOf(batteryManager.getIntProperty(4)) : null;
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        if (intValue != (this.applicationContext.getApplicationInfo().targetSdkVersion >= 28 ? PKIFailureInfo.systemUnavail : 0)) {
                            f = Float.valueOf(intValue / 100.0f);
                            if (f != null) {
                                this.batteryLevel = Float.valueOf(f.floatValue());
                            }
                        }
                    }
                    f = null;
                    if (f != null) {
                    }
                }
                if (this.lowPowerMode == null) {
                    PowerManager powerManager = this.powerManager;
                    this.lowPowerMode = powerManager != null ? Boolean.valueOf(powerManager.isPowerSaveMode()) : null;
                }
                batteryInfo = new BatteryInfo(this.batteryLevel, this.lowPowerMode);
            } catch (Throwable th) {
                throw th;
            }
        }
        return batteryInfo;
    }
}
