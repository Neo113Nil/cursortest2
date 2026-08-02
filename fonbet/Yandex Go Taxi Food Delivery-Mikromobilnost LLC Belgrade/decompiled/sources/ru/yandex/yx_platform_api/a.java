package ru.yandex.yx_platform_api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import defpackage.lq1;
import defpackage.luw;
import defpackage.xeo;
import defpackage.yeo;
import defpackage.zeo;

/* loaded from: classes7.dex */
public final class a implements zeo {
    public final /* synthetic */ int a;
    public final Context b;
    public final BroadcastReceiver c;

    public a(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context;
                this.c = new InterruptionFilterStreamHandler$InterruptionFilterReceiver();
                break;
            case 2:
                this.b = context;
                this.c = new RingerModeStreamHandler$RingerModeReceiver();
                break;
            case 3:
                this.b = context;
                this.c = new WifiEnabledStateHandler$WifiEnabledStateReceiver();
                break;
            case 4:
                this.b = context;
                this.c = new WifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver();
                break;
            default:
                this.b = context;
                this.c = new AirplaneStreamHandler$AirplaneModeReceiver();
                break;
        }
    }

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        int i = this.a;
        Context context = this.b;
        BroadcastReceiver broadcastReceiver = this.c;
        switch (i) {
            case 0:
                AirplaneStreamHandler$AirplaneModeReceiver airplaneStreamHandler$AirplaneModeReceiver = (AirplaneStreamHandler$AirplaneModeReceiver) broadcastReceiver;
                airplaneStreamHandler$AirplaneModeReceiver.setAirplaneModeChangedListener(null);
                context.unregisterReceiver(airplaneStreamHandler$AirplaneModeReceiver);
                break;
            case 1:
                InterruptionFilterStreamHandler$InterruptionFilterReceiver interruptionFilterStreamHandler$InterruptionFilterReceiver = (InterruptionFilterStreamHandler$InterruptionFilterReceiver) broadcastReceiver;
                interruptionFilterStreamHandler$InterruptionFilterReceiver.setInterruptionFilterChangedListener(null);
                context.unregisterReceiver(interruptionFilterStreamHandler$InterruptionFilterReceiver);
                break;
            case 2:
                RingerModeStreamHandler$RingerModeReceiver ringerModeStreamHandler$RingerModeReceiver = (RingerModeStreamHandler$RingerModeReceiver) broadcastReceiver;
                ringerModeStreamHandler$RingerModeReceiver.setRingerModeChangedListener(null);
                context.unregisterReceiver(ringerModeStreamHandler$RingerModeReceiver);
                break;
            case 3:
                WifiEnabledStateHandler$WifiEnabledStateReceiver wifiEnabledStateHandler$WifiEnabledStateReceiver = (WifiEnabledStateHandler$WifiEnabledStateReceiver) broadcastReceiver;
                wifiEnabledStateHandler$WifiEnabledStateReceiver.setWifiStateChangedListener(null);
                context.unregisterReceiver(wifiEnabledStateHandler$WifiEnabledStateReceiver);
                break;
            default:
                WifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver wifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver = (WifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver) broadcastReceiver;
                wifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver.setWifiScanAvailabilityChangedListener(null);
                context.unregisterReceiver(wifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver);
                break;
        }
    }

    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        int i = this.a;
        Context context = this.b;
        BroadcastReceiver broadcastReceiver = this.c;
        switch (i) {
            case 0:
                AirplaneStreamHandler$AirplaneModeReceiver airplaneStreamHandler$AirplaneModeReceiver = (AirplaneStreamHandler$AirplaneModeReceiver) broadcastReceiver;
                airplaneStreamHandler$AirplaneModeReceiver.setAirplaneModeChangedListener(new lq1((yeo) xeoVar));
                if (Build.VERSION.SDK_INT < 33) {
                    context.registerReceiver(airplaneStreamHandler$AirplaneModeReceiver, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
                    break;
                } else {
                    context.registerReceiver(airplaneStreamHandler$AirplaneModeReceiver, new IntentFilter("android.intent.action.AIRPLANE_MODE"), 4);
                    break;
                }
            case 1:
                InterruptionFilterStreamHandler$InterruptionFilterReceiver interruptionFilterStreamHandler$InterruptionFilterReceiver = (InterruptionFilterStreamHandler$InterruptionFilterReceiver) broadcastReceiver;
                interruptionFilterStreamHandler$InterruptionFilterReceiver.setInterruptionFilterChangedListener(new luw((yeo) xeoVar));
                if (Build.VERSION.SDK_INT < 33) {
                    context.registerReceiver(interruptionFilterStreamHandler$InterruptionFilterReceiver, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
                    break;
                } else {
                    context.registerReceiver(interruptionFilterStreamHandler$InterruptionFilterReceiver, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"), 4);
                    break;
                }
            case 2:
                RingerModeStreamHandler$RingerModeReceiver ringerModeStreamHandler$RingerModeReceiver = (RingerModeStreamHandler$RingerModeReceiver) broadcastReceiver;
                ringerModeStreamHandler$RingerModeReceiver.setRingerModeChangedListener(new lq1((yeo) xeoVar));
                if (Build.VERSION.SDK_INT < 33) {
                    context.registerReceiver(ringerModeStreamHandler$RingerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                    break;
                } else {
                    context.registerReceiver(ringerModeStreamHandler$RingerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"), 4);
                    break;
                }
            case 3:
                WifiEnabledStateHandler$WifiEnabledStateReceiver wifiEnabledStateHandler$WifiEnabledStateReceiver = (WifiEnabledStateHandler$WifiEnabledStateReceiver) broadcastReceiver;
                wifiEnabledStateHandler$WifiEnabledStateReceiver.setWifiStateChangedListener(new luw((yeo) xeoVar));
                IntentFilter intentFilter = new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED");
                if (Build.VERSION.SDK_INT < 33) {
                    context.registerReceiver(wifiEnabledStateHandler$WifiEnabledStateReceiver, intentFilter);
                    break;
                } else {
                    context.registerReceiver(wifiEnabledStateHandler$WifiEnabledStateReceiver, intentFilter, 4);
                    break;
                }
            default:
                WifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver wifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver = (WifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver) broadcastReceiver;
                wifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver.setWifiScanAvailabilityChangedListener(new lq1((yeo) xeoVar));
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    if (i2 < 33) {
                        context.registerReceiver(wifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver, new IntentFilter("android.net.wifi.action.WIFI_SCAN_AVAILABILITY_CHANGED"));
                        break;
                    } else {
                        context.registerReceiver(wifiScanAvailabilityStreamHandler$WifiScanAvailabilityReceiver, new IntentFilter("android.net.wifi.action.WIFI_SCAN_AVAILABILITY_CHANGED"), 4);
                        break;
                    }
                }
                break;
        }
    }
}
