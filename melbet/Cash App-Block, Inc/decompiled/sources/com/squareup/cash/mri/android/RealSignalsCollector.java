package com.squareup.cash.mri.android;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.provider.Settings;
import android.view.Display;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import com.squareup.util.android.AndroidAudioManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class RealSignalsCollector {
    public final Instrument$Adapter adbSignal;
    public final AndroidAudioManager audioManager;
    public final AndroidConnectivityManager connectivityManager;
    public final Context context;
    public final Instrument$Adapter debuggerSignal;
    public final Instrument$Adapter devModeSignal;
    public final Instrument$Adapter phoneCallSignal;
    public final Instrument$Adapter screenMirrorSignal;
    public final Instrument$Adapter vpnSignal;

    public RealSignalsCollector(Context context, AndroidConnectivityManager androidConnectivityManager, AndroidAudioManager androidAudioManager, RealExecutorServiceFactory realExecutorServiceFactory) {
        this.context = context;
        this.connectivityManager = androidConnectivityManager;
        this.audioManager = androidAudioManager;
        final int i = 0;
        this.devModeSignal = new Instrument$Adapter("dev-mode", realExecutorServiceFactory, new Function0(this) { // from class: com.squareup.cash.mri.android.RealSignalsCollector$$ExternalSyntheticLambda0
            public final /* synthetic */ RealSignalsCollector f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RealSignalsCollector realSignalsCollector = this.f$0;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(Settings.Global.getInt(realSignalsCollector.context.getContentResolver(), "development_settings_enabled") == 1);
                    case 1:
                        Object systemService = realSignalsCollector.context.getSystemService("display");
                        systemService.getClass();
                        Display[] displays = ((DisplayManager) systemService).getDisplays("android.hardware.display.category.PRESENTATION");
                        displays.getClass();
                        return Boolean.valueOf(!(displays.length == 0));
                    case 2:
                        ConnectivityManager connectivityManager = realSignalsCollector.connectivityManager.connectivityManager;
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        return Boolean.valueOf(networkCapabilities != null ? networkCapabilities.hasTransport(4) : false);
                    case 3:
                        return Boolean.valueOf(Settings.Global.getInt(realSignalsCollector.context.getContentResolver(), "adb_enabled", 0) == 1);
                    default:
                        int mode = realSignalsCollector.audioManager.audioManager.getMode();
                        if (mode != 2 && mode != 3) {
                            r1 = false;
                        }
                        return Boolean.valueOf(r1);
                }
            }
        });
        this.debuggerSignal = new Instrument$Adapter("debugger-connected", realExecutorServiceFactory, (Function0) new Moneys$$ExternalSyntheticLambda0(17));
        final int i2 = 1;
        this.screenMirrorSignal = new Instrument$Adapter("screen-mirrored", realExecutorServiceFactory, new Function0(this) { // from class: com.squareup.cash.mri.android.RealSignalsCollector$$ExternalSyntheticLambda0
            public final /* synthetic */ RealSignalsCollector f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RealSignalsCollector realSignalsCollector = this.f$0;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(Settings.Global.getInt(realSignalsCollector.context.getContentResolver(), "development_settings_enabled") == 1);
                    case 1:
                        Object systemService = realSignalsCollector.context.getSystemService("display");
                        systemService.getClass();
                        Display[] displays = ((DisplayManager) systemService).getDisplays("android.hardware.display.category.PRESENTATION");
                        displays.getClass();
                        return Boolean.valueOf(!(displays.length == 0));
                    case 2:
                        ConnectivityManager connectivityManager = realSignalsCollector.connectivityManager.connectivityManager;
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        return Boolean.valueOf(networkCapabilities != null ? networkCapabilities.hasTransport(4) : false);
                    case 3:
                        return Boolean.valueOf(Settings.Global.getInt(realSignalsCollector.context.getContentResolver(), "adb_enabled", 0) == 1);
                    default:
                        int mode = realSignalsCollector.audioManager.audioManager.getMode();
                        if (mode != 2 && mode != 3) {
                            r1 = false;
                        }
                        return Boolean.valueOf(r1);
                }
            }
        });
        final int i3 = 2;
        this.vpnSignal = new Instrument$Adapter("vpn-enabled", realExecutorServiceFactory, new Function0(this) { // from class: com.squareup.cash.mri.android.RealSignalsCollector$$ExternalSyntheticLambda0
            public final /* synthetic */ RealSignalsCollector f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RealSignalsCollector realSignalsCollector = this.f$0;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(Settings.Global.getInt(realSignalsCollector.context.getContentResolver(), "development_settings_enabled") == 1);
                    case 1:
                        Object systemService = realSignalsCollector.context.getSystemService("display");
                        systemService.getClass();
                        Display[] displays = ((DisplayManager) systemService).getDisplays("android.hardware.display.category.PRESENTATION");
                        displays.getClass();
                        return Boolean.valueOf(!(displays.length == 0));
                    case 2:
                        ConnectivityManager connectivityManager = realSignalsCollector.connectivityManager.connectivityManager;
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        return Boolean.valueOf(networkCapabilities != null ? networkCapabilities.hasTransport(4) : false);
                    case 3:
                        return Boolean.valueOf(Settings.Global.getInt(realSignalsCollector.context.getContentResolver(), "adb_enabled", 0) == 1);
                    default:
                        int mode = realSignalsCollector.audioManager.audioManager.getMode();
                        if (mode != 2 && mode != 3) {
                            r1 = false;
                        }
                        return Boolean.valueOf(r1);
                }
            }
        });
        final int i4 = 3;
        this.adbSignal = new Instrument$Adapter("adb-enabled", realExecutorServiceFactory, new Function0(this) { // from class: com.squareup.cash.mri.android.RealSignalsCollector$$ExternalSyntheticLambda0
            public final /* synthetic */ RealSignalsCollector f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                RealSignalsCollector realSignalsCollector = this.f$0;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(Settings.Global.getInt(realSignalsCollector.context.getContentResolver(), "development_settings_enabled") == 1);
                    case 1:
                        Object systemService = realSignalsCollector.context.getSystemService("display");
                        systemService.getClass();
                        Display[] displays = ((DisplayManager) systemService).getDisplays("android.hardware.display.category.PRESENTATION");
                        displays.getClass();
                        return Boolean.valueOf(!(displays.length == 0));
                    case 2:
                        ConnectivityManager connectivityManager = realSignalsCollector.connectivityManager.connectivityManager;
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        return Boolean.valueOf(networkCapabilities != null ? networkCapabilities.hasTransport(4) : false);
                    case 3:
                        return Boolean.valueOf(Settings.Global.getInt(realSignalsCollector.context.getContentResolver(), "adb_enabled", 0) == 1);
                    default:
                        int mode = realSignalsCollector.audioManager.audioManager.getMode();
                        if (mode != 2 && mode != 3) {
                            r1 = false;
                        }
                        return Boolean.valueOf(r1);
                }
            }
        });
        final int i5 = 4;
        this.phoneCallSignal = new Instrument$Adapter("phone-call-active", realExecutorServiceFactory, new Function0(this) { // from class: com.squareup.cash.mri.android.RealSignalsCollector$$ExternalSyntheticLambda0
            public final /* synthetic */ RealSignalsCollector f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                RealSignalsCollector realSignalsCollector = this.f$0;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(Settings.Global.getInt(realSignalsCollector.context.getContentResolver(), "development_settings_enabled") == 1);
                    case 1:
                        Object systemService = realSignalsCollector.context.getSystemService("display");
                        systemService.getClass();
                        Display[] displays = ((DisplayManager) systemService).getDisplays("android.hardware.display.category.PRESENTATION");
                        displays.getClass();
                        return Boolean.valueOf(!(displays.length == 0));
                    case 2:
                        ConnectivityManager connectivityManager = realSignalsCollector.connectivityManager.connectivityManager;
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        return Boolean.valueOf(networkCapabilities != null ? networkCapabilities.hasTransport(4) : false);
                    case 3:
                        return Boolean.valueOf(Settings.Global.getInt(realSignalsCollector.context.getContentResolver(), "adb_enabled", 0) == 1);
                    default:
                        int mode = realSignalsCollector.audioManager.audioManager.getMode();
                        if (mode != 2 && mode != 3) {
                            r1 = false;
                        }
                        return Boolean.valueOf(r1);
                }
            }
        });
    }
}
