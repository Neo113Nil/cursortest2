package ru.yandex.yx_platform_api;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.location.LocationManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.app.s0;
import androidx.core.location.j;
import androidx.lifecycle.y;
import defpackage.afo;
import defpackage.ap2;
import defpackage.ba20;
import defpackage.c9v;
import defpackage.ca20;
import defpackage.cjm0;
import defpackage.da20;
import defpackage.dp51;
import defpackage.e2a1;
import defpackage.ea20;
import defpackage.evu0;
import defpackage.f041;
import defpackage.hdu;
import defpackage.i3y;
import defpackage.j73;
import defpackage.jl40;
import defpackage.l40;
import defpackage.ljo;
import defpackage.mrj;
import defpackage.ny61;
import defpackage.nzc0;
import defpackage.o66;
import defpackage.oy80;
import defpackage.oz31;
import defpackage.qkf;
import defpackage.r30;
import defpackage.r3x0;
import defpackage.sls;
import defpackage.ssr;
import defpackage.t551;
import defpackage.tcs0;
import defpackage.tsr;
import defpackage.tt5;
import defpackage.ucs0;
import defpackage.usw;
import defpackage.vk00;
import defpackage.w511;
import defpackage.wn50;
import defpackage.wrr;
import defpackage.x920;
import defpackage.yp3;
import defpackage.ywj0;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.startup.StartupRequest;
import ru.yandex.yx_platform_api.d;

/* loaded from: classes7.dex */
public final class d implements tsr, ca20, r30, nzc0 {
    public afo A;
    public afo B;
    public afo C;
    public afo D;
    public afo E;
    public afo F;
    public afo G;
    public afo H;
    public afo I;
    public afo J;
    public afo K;
    public afo L;
    public afo M;
    public Context N;
    public Activity O;
    public final HashMap P = new HashMap();
    public float Q = -1.0f;
    public final i3y R;
    public final i3y S;
    public final i3y T;
    public final i3y U;
    public final i3y V;
    public final i3y W;
    public final i3y Z;
    public vk00 a;
    public final i3y a0;
    public ea20 b;
    public final i3y b0;
    public afo c;
    public final i3y c0;
    public final i3y d0;
    public final i3y e0;
    public final i3y f0;
    public final i3y g0;
    public final i3y h0;
    public final i3y i0;
    public final i3y j0;
    public final i3y k0;
    public final i3y l0;
    public final i3y m0;
    public afo w;
    public afo x;
    public afo y;
    public afo z;

    public d() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 11;
        this.R = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i2 = 2;
        this.S = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i3 = 3;
        this.T = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i4 = 4;
        this.U = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i5 = 5;
        this.V = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i5;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i6 = 6;
        this.W = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i6;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i7 = 7;
        this.Z = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i7;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i8 = 8;
        this.a0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i8;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i9 = 9;
        this.b0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i9;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i10 = 10;
        this.c0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i10;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i11 = 12;
        this.d0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i11;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i12 = 13;
        this.e0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i12;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i13 = 14;
        this.f0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i13;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i14 = 15;
        this.g0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i14;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i15 = 16;
        this.h0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i15;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        final int i16 = 17;
        this.i0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i16;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        this.j0 = kotlin.a.b(lazyThreadSafetyMode, new dp51(21));
        final int i17 = 0;
        this.k0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i17;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
        this.l0 = kotlin.a.b(lazyThreadSafetyMode, new dp51(20));
        final int i18 = 1;
        this.m0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ac61
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i18;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context = dVar.N;
                        Context context2 = context != null ? context : null;
                        yp3 yp3Var = new yp3();
                        yp3Var.b = new tp3(context2);
                        return yp3Var;
                    case 1:
                        Context context3 = dVar.N;
                        return new ucs0(context3 != null ? context3 : null, (TelephonyManager) dVar.b0.getValue(), (SubscriptionManager) dVar.c0.getValue());
                    case 2:
                        Context context4 = dVar.N;
                        return (AudioManager) (context4 != null ? context4 : null).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 3:
                        Context context5 = dVar.N;
                        return (DisplayManager) (context5 != null ? context5 : null).getSystemService("display");
                    case 4:
                        Context context6 = dVar.N;
                        return (LocationManager) (context6 != null ? context6 : null).getSystemService("location");
                    case 5:
                        Context context7 = dVar.N;
                        return (ActivityManager) (context7 != null ? context7 : null).getSystemService("activity");
                    case 6:
                        Context context8 = dVar.N;
                        return (KeyguardManager) (context8 != null ? context8 : null).getSystemService("keyguard");
                    case 7:
                        Context context9 = dVar.N;
                        return (NotificationManager) (context9 != null ? context9 : null).getSystemService("notification");
                    case 8:
                        Context context10 = dVar.N;
                        return new s0(context10 != null ? context10 : null);
                    case 9:
                        Context context11 = dVar.N;
                        return (TelephonyManager) (context11 != null ? context11 : null).getSystemService("phone");
                    case 10:
                        Context context12 = dVar.N;
                        if (context12 == null) {
                            context12 = null;
                        }
                        Object systemService = context12.getSystemService("telephony_subscription_service");
                        if (systemService instanceof SubscriptionManager) {
                            return (SubscriptionManager) systemService;
                        }
                        return null;
                    case 11:
                        Context context13 = dVar.N;
                        return (PowerManager) (context13 != null ? context13 : null).getSystemService("power");
                    case 12:
                        Context context14 = dVar.N;
                        return (ConnectivityManager) (context14 != null ? context14 : null).getSystemService("connectivity");
                    case 13:
                        Context context15 = dVar.N;
                        return (WifiManager) (context15 != null ? context15 : null).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
                    case 14:
                        Context context16 = dVar.N;
                        return (context16 != null ? context16 : null).getPackageManager();
                    case 15:
                        return new usw((TelephonyManager) dVar.b0.getValue(), (ConnectivityManager) dVar.d0.getValue(), (WifiManager) dVar.e0.getValue());
                    case 16:
                        Context context17 = dVar.N;
                        return new t551(context17 != null ? context17 : null);
                    default:
                        Context context18 = dVar.N;
                        return new o66(context18 != null ? context18 : null);
                }
            }
        });
    }

    public static void f(float f, Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            ny61.r("window is null");
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 || f == 0.0f) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.preferredRefreshRate = f;
            window.setAttributes(attributes);
            Log.i("preferred_refresh_rate", "set rate to: " + f);
            return;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        if (defaultDisplay == null) {
            ny61.r("display is null");
            return;
        }
        Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
        if (supportedModes.length < 1) {
            ny61.r("supported modes is empty");
            return;
        }
        float refreshRate = ((Display.Mode) j73.C(supportedModes)).getRefreshRate();
        float abs = Math.abs(refreshRate - f);
        int i = 0;
        while (i < supportedModes.length) {
            int i2 = i + 1;
            try {
                Display.Mode mode = supportedModes[i];
                float abs2 = Math.abs(mode.getRefreshRate() - f);
                if (abs2 < abs) {
                    refreshRate = mode.getRefreshRate();
                    i = i2;
                    abs = abs2;
                } else {
                    i = i2;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                w511.i(e.getMessage());
                return;
            }
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes2.preferredRefreshRate = refreshRate;
        window.setAttributes(attributes2);
        ArrayList arrayList = new ArrayList(supportedModes.length);
        for (Display.Mode mode2 : supportedModes) {
            arrayList.add(Float.valueOf(mode2.getRefreshRate()));
        }
        Log.i("preferred_refresh_rate", "supported refresh rates: ".concat(kotlin.collections.a.X(arrayList, null, null, null, null, 63)));
        Log.i("preferred_refresh_rate", "preferred: " + f + ", chosen: " + refreshRate);
    }

    public final void a(AppLifecycleSource appLifecycleSource) {
        boolean z;
        Context context = this.N;
        if (context == null) {
            context = null;
        }
        Boolean bool = ap2.c;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = context.getSharedPreferences("FlutterSharedPreferences", 0).getBoolean("flutter.attach_to_engine_lifecycle", false);
            ap2.c = Boolean.valueOf(z);
        }
        if ((z ? AppLifecycleSource.Engine : AppLifecycleSource.Activity) == appLifecycleSource) {
            y.A.y.a((ap2) this.j0.getValue());
        }
    }

    public final void b(AppLifecycleSource appLifecycleSource) {
        boolean z;
        Context context = this.N;
        if (context == null) {
            context = null;
        }
        Boolean bool = ap2.c;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = context.getSharedPreferences("FlutterSharedPreferences", 0).getBoolean("flutter.attach_to_engine_lifecycle", false);
            ap2.c = Boolean.valueOf(z);
        }
        if ((z ? AppLifecycleSource.Engine : AppLifecycleSource.Activity) == appLifecycleSource) {
            y.A.y.d((ap2) this.j0.getValue());
        }
    }

    public final AudioManager c() {
        return (AudioManager) this.S.getValue();
    }

    public final NotificationManager d() {
        return (NotificationManager) this.Z.getValue();
    }

    public final PowerManager e() {
        return (PowerManager) this.R.getValue();
    }

    @Override // defpackage.nzc0
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        boolean canUseFullScreenIntent;
        if (i != 33891 || i != 33891 || Build.VERSION.SDK_INT < 34 || this.a == null) {
            return false;
        }
        try {
            canUseFullScreenIntent = d().canUseFullScreenIntent();
            vk00 vk00Var = this.a;
            if (vk00Var != null) {
                vk00Var.a.success(Boolean.valueOf(canUseFullScreenIntent));
            }
        } catch (Exception e) {
            vk00 vk00Var2 = this.a;
            if (vk00Var2 != null) {
                vk00Var2.a.error("Some error occurred while requesting permission", e.toString(), null);
            }
        }
        this.a = null;
        return true;
    }

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        wrr wrrVar = (wrr) l40Var;
        this.O = (Activity) wrrVar.b;
        wrrVar.a(this);
        a(AppLifecycleSource.Activity);
        float f = this.Q;
        if (f == -1.0f) {
            return;
        }
        try {
            f(f, (Activity) ((wrr) l40Var).b);
        } catch (Throwable th) {
            Log.e("preferred_refresh_rate", th.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0197  */
    @Override // defpackage.tsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToEngine(ssr ssrVar) {
        Context context;
        Context context2;
        this.N = ssrVar.a;
        tt5 tt5Var = ssrVar.c;
        ea20 ea20Var = new ea20(tt5Var, "yx/platform_api");
        this.b = ea20Var;
        ea20Var.b(this);
        afo afoVar = new afo(tt5Var, "yx/platform_api/airplane/stream");
        this.c = afoVar;
        Context context3 = this.N;
        if (context3 == null) {
            context3 = null;
        }
        afoVar.a(new a(context3, 0));
        afo afoVar2 = new afo(tt5Var, "yx/platform_api/net_capability_validated");
        this.w = afoVar2;
        i3y i3yVar = this.d0;
        afoVar2.a(new wn50((ConnectivityManager) i3yVar.getValue()));
        afo afoVar3 = new afo(tt5Var, "yx/platform_api/wifi_enabled");
        this.x = afoVar3;
        Context context4 = this.N;
        if (context4 == null) {
            context4 = null;
        }
        afoVar3.a(new a(context4, 3));
        afo afoVar4 = new afo(tt5Var, "yx/platform_api/power_manager/power_save_mode_changes");
        this.B = afoVar4;
        Context context5 = this.N;
        if (context5 == null) {
            context5 = null;
        }
        afoVar4.a(new oy80(context5));
        afo afoVar5 = new afo(tt5Var, "yx/platform_api/location_manager/location_enabled_state_changes");
        this.C = afoVar5;
        Context context6 = this.N;
        if (context6 == null) {
            context6 = null;
        }
        afoVar5.a(new c9v(15, context6));
        afo afoVar6 = new afo(tt5Var, "yx/platform_api/lockscreen/events");
        this.D = afoVar6;
        Context context7 = this.N;
        if (context7 == null) {
            context7 = null;
        }
        afoVar6.a(new hdu(context7));
        afo afoVar7 = new afo(tt5Var, "yx/platform_api/screen/is_on");
        this.E = afoVar7;
        Context context8 = this.N;
        if (context8 == null) {
            context8 = null;
        }
        afoVar7.a(new cjm0(18, context8));
        afo afoVar8 = new afo(tt5Var, "yx/platform_api/notification_manager/interruption_filter");
        this.y = afoVar8;
        Context context9 = this.N;
        if (context9 == null) {
            context9 = null;
        }
        afoVar8.a(new a(context9, 1));
        afo afoVar9 = new afo(tt5Var, "yx/platform_api/audio_manager/ringer_mode");
        this.z = afoVar9;
        Context context10 = this.N;
        if (context10 == null) {
            context10 = null;
        }
        afoVar9.a(new a(context10, 2));
        afo afoVar10 = new afo(tt5Var, "yx/platform_api/audio_manager/volume_updates");
        this.A = afoVar10;
        Context context11 = this.N;
        if (context11 == null) {
            context11 = null;
        }
        afoVar10.a(new c(context11));
        afo afoVar11 = new afo(tt5Var, "yx/platform_api/audio_manager/bluetooth/audio_output_connections");
        this.F = afoVar11;
        afoVar11.a(new mrj(27, c()));
        i3y i3yVar2 = this.g0;
        usw uswVar = (usw) i3yVar2.getValue();
        TelephonyManager telephonyManager = uswVar.a;
        int i = Build.VERSION.SDK_INT;
        if (i != 30) {
            if (i > 30) {
                telephonyManager.registerTelephonyCallback((ExecutorService) uswVar.e.getValue(), (InternetConnectionManager$newTelephonyDisplayInfoListener$2$1) uswVar.g.getValue());
            }
            afo afoVar12 = new afo(tt5Var, "yx/platform_api/internet_connection/changes");
            this.G = afoVar12;
            context = this.N;
            if (context == null) {
                context = null;
            }
            afoVar12.a(new InternetConnectionStreamHandler(context, (usw) i3yVar2.getValue(), (ConnectivityManager) i3yVar.getValue()));
            afo afoVar13 = new afo(tt5Var, "yx/platform_api/internet_connection/vpnEvents");
            this.H = afoVar13;
            context2 = this.N;
            if (context2 == null) {
                context2 = null;
            }
            afoVar13.a(new f041(context2));
            ((t551) this.h0.getValue()).getClass();
            afo afoVar14 = new afo(tt5Var, "yx/platform_api/wifi_scan_availability/changes");
            this.I = afoVar14;
            Context context12 = this.N;
            afoVar14.a(new a(context12 != null ? context12 : null, 4));
            afo afoVar15 = new afo(tt5Var, "yx/platform_api/app_background_observer/changes");
            this.J = afoVar15;
            afoVar15.a((ap2) this.j0.getValue());
            afo afoVar16 = new afo(tt5Var, "yx/platform_api/auto_connection_detector");
            afoVar16.a((yp3) this.k0.getValue());
            this.K = afoVar16;
            afo afoVar17 = new afo(tt5Var, "yx/platform_api/volume_button/changes");
            this.L = afoVar17;
            afoVar17.a((oz31) this.l0.getValue());
            afo afoVar18 = new afo(tt5Var, "yx/platform_api/active_subscription_info_list");
            this.M = afoVar18;
            afoVar18.a(new tcs0((ucs0) this.m0.getValue()));
            ((o66) this.i0.getValue()).getClass();
            a(AppLifecycleSource.Engine);
        }
        telephonyManager.listen((InternetConnectionManager$oldTelephonyDisplayInfoListener$2$1) uswVar.f.getValue(), 1048576);
        afo afoVar122 = new afo(tt5Var, "yx/platform_api/internet_connection/changes");
        this.G = afoVar122;
        context = this.N;
        if (context == null) {
        }
        afoVar122.a(new InternetConnectionStreamHandler(context, (usw) i3yVar2.getValue(), (ConnectivityManager) i3yVar.getValue()));
        afo afoVar132 = new afo(tt5Var, "yx/platform_api/internet_connection/vpnEvents");
        this.H = afoVar132;
        context2 = this.N;
        if (context2 == null) {
        }
        afoVar132.a(new f041(context2));
        ((t551) this.h0.getValue()).getClass();
        afo afoVar142 = new afo(tt5Var, "yx/platform_api/wifi_scan_availability/changes");
        this.I = afoVar142;
        Context context122 = this.N;
        afoVar142.a(new a(context122 != null ? context122 : null, 4));
        afo afoVar152 = new afo(tt5Var, "yx/platform_api/app_background_observer/changes");
        this.J = afoVar152;
        afoVar152.a((ap2) this.j0.getValue());
        afo afoVar162 = new afo(tt5Var, "yx/platform_api/auto_connection_detector");
        afoVar162.a((yp3) this.k0.getValue());
        this.K = afoVar162;
        afo afoVar172 = new afo(tt5Var, "yx/platform_api/volume_button/changes");
        this.L = afoVar172;
        afoVar172.a((oz31) this.l0.getValue());
        afo afoVar182 = new afo(tt5Var, "yx/platform_api/active_subscription_info_list");
        this.M = afoVar182;
        afoVar182.a(new tcs0((ucs0) this.m0.getValue()));
        ((o66) this.i0.getValue()).getClass();
        a(AppLifecycleSource.Engine);
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        this.O = null;
        b(AppLifecycleSource.Activity);
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        b(AppLifecycleSource.Engine);
        ea20 ea20Var = this.b;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
        afo afoVar = this.c;
        if (afoVar == null) {
            afoVar = null;
        }
        afoVar.a(null);
        afo afoVar2 = this.w;
        if (afoVar2 == null) {
            afoVar2 = null;
        }
        afoVar2.a(null);
        afo afoVar3 = this.x;
        if (afoVar3 == null) {
            afoVar3 = null;
        }
        afoVar3.a(null);
        afo afoVar4 = this.B;
        if (afoVar4 == null) {
            afoVar4 = null;
        }
        afoVar4.a(null);
        afo afoVar5 = this.C;
        if (afoVar5 == null) {
            afoVar5 = null;
        }
        afoVar5.a(null);
        afo afoVar6 = this.D;
        if (afoVar6 == null) {
            afoVar6 = null;
        }
        afoVar6.a(null);
        afo afoVar7 = this.E;
        if (afoVar7 == null) {
            afoVar7 = null;
        }
        afoVar7.a(null);
        afo afoVar8 = this.y;
        if (afoVar8 == null) {
            afoVar8 = null;
        }
        afoVar8.a(null);
        afo afoVar9 = this.z;
        if (afoVar9 == null) {
            afoVar9 = null;
        }
        afoVar9.a(null);
        afo afoVar10 = this.F;
        if (afoVar10 == null) {
            afoVar10 = null;
        }
        afoVar10.a(null);
        afo afoVar11 = this.A;
        if (afoVar11 == null) {
            afoVar11 = null;
        }
        afoVar11.a(null);
        usw uswVar = (usw) this.g0.getValue();
        TelephonyManager telephonyManager = uswVar.a;
        i3y i3yVar = uswVar.g;
        int i = Build.VERSION.SDK_INT;
        if (i == 30) {
            try {
                telephonyManager.listen((InternetConnectionManager$oldTelephonyDisplayInfoListener$2$1) uswVar.f.getValue(), 0);
            } catch (Exception unused) {
            }
        } else if (i > 30) {
            if (((InternetConnectionManager$newTelephonyDisplayInfoListener$2$1) i3yVar.getValue()) != null) {
                telephonyManager.unregisterTelephonyCallback((InternetConnectionManager$newTelephonyDisplayInfoListener$2$1) i3yVar.getValue());
            }
            ((ExecutorService) uswVar.e.getValue()).shutdown();
        }
        afo afoVar12 = this.G;
        if (afoVar12 == null) {
            afoVar12 = null;
        }
        afoVar12.a(null);
        afo afoVar13 = this.H;
        if (afoVar13 == null) {
            afoVar13 = null;
        }
        afoVar13.a(null);
        ((t551) this.h0.getValue()).getClass();
        afo afoVar14 = this.I;
        if (afoVar14 == null) {
            afoVar14 = null;
        }
        afoVar14.a(null);
        ((o66) this.i0.getValue()).getClass();
        afo afoVar15 = this.F;
        if (afoVar15 == null) {
            afoVar15 = null;
        }
        afoVar15.a(null);
        afo afoVar16 = this.J;
        if (afoVar16 == null) {
            afoVar16 = null;
        }
        afoVar16.a(null);
        afo afoVar17 = this.K;
        if (afoVar17 == null) {
            afoVar17 = null;
        }
        afoVar17.a(null);
        afo afoVar18 = this.L;
        if (afoVar18 == null) {
            afoVar18 = null;
        }
        afoVar18.a(null);
        afo afoVar19 = this.M;
        if (afoVar19 == null) {
            afoVar19 = null;
        }
        afoVar19.a(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0527, code lost:
    
        if (android.provider.Settings.Global.getInt(r11.getContentResolver(), "wifi_scan_throttle_enabled") == 1) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x07d7, code lost:
    
        r11 = e().getBatteryDischargePrediction();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        boolean canUseFullScreenIntent;
        boolean canUseFullScreenIntent2;
        Window window;
        Window window2;
        Window window3;
        Window window4;
        boolean z;
        Duration batteryDischargePrediction;
        Boolean bool;
        Boolean bool2;
        List W;
        Object obj = x920Var.b;
        String str = x920Var.a;
        boolean z2 = false;
        r3 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        z2 = false;
        int G = evu0.G(str, '.', 0, 6);
        if (G < 0) {
            ((ba20) da20Var).notImplemented();
            return;
        }
        String substring = str.substring(0, G);
        String substring2 = str.substring(G + 1);
        Context context = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        r10 = null;
        Long l = null;
        switch (substring.hashCode()) {
            case -1790576086:
                if (substring.equals("Thread")) {
                    if (!jl40.l(substring2, "sleep")) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    } else {
                        Thread.sleep(((Number) obj).longValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                }
                break;
            case -1710029640:
                if (substring.equals("TelephonySubscriptionManager")) {
                    boolean l2 = jl40.l(substring2, "getDefaultDataSubscriptionId");
                    i3y i3yVar = this.m0;
                    if (l2) {
                        ((ucs0) i3yVar.getValue()).getClass();
                        ((ba20) da20Var).success(Integer.valueOf(SubscriptionManager.getDefaultDataSubscriptionId()));
                        return;
                    } else if (jl40.l(substring2, "activeSubscriptionInfoList")) {
                        ((ba20) da20Var).success(((ucs0) i3yVar.getValue()).a());
                        return;
                    } else {
                        ((ba20) da20Var).notImplemented();
                        return;
                    }
                }
                break;
            case -1678783089:
                if (substring.equals("Context")) {
                    if (jl40.l(substring2, "packageName")) {
                        Context context2 = this.N;
                        ((ba20) da20Var).success((context2 != null ? context2 : null).getPackageName());
                        return;
                    }
                    if (!jl40.l(substring2, "startLauncherActivity")) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    }
                    Activity activity = this.O;
                    if (activity != null) {
                        context = activity;
                    } else {
                        Context context3 = this.N;
                        if (context3 != null) {
                            context = context3;
                        }
                    }
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    if (launchIntentForPackage != null) {
                        Intent intent = new Intent();
                        intent.setComponent(launchIntentForPackage.getComponent());
                        if (!(context instanceof Activity)) {
                            intent.addFlags(SelfTester_JCP.IMITA);
                        }
                        try {
                            context.startActivity(intent);
                            z2 = true;
                        } catch (Exception unused) {
                        }
                    }
                    ((ba20) da20Var).success(Boolean.valueOf(z2));
                    return;
                }
                break;
            case -1591322833:
                if (substring.equals("Activity")) {
                    int hashCode = substring2.hashCode();
                    if (hashCode != -1985084278) {
                        if (hashCode != 507644611) {
                            if (hashCode == 1392170715 && substring2.equals("finishAffinity")) {
                                Activity activity2 = this.O;
                                if (activity2 != null) {
                                    activity2.finishAffinity();
                                }
                                ((ba20) da20Var).success(Boolean.valueOf(this.O != null));
                                return;
                            }
                        } else if (substring2.equals("setShowWhenLocked")) {
                            if (obj == null) {
                                ny61.g("Required value was null.");
                                return;
                            }
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            Activity activity3 = this.O;
                            if (activity3 != null) {
                                activity3.setShowWhenLocked(booleanValue);
                            }
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    } else if (substring2.equals("setTurnScreenOn")) {
                        if (obj == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        Activity activity4 = this.O;
                        if (activity4 != null) {
                            activity4.setTurnScreenOn(booleanValue2);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    ((ba20) da20Var).notImplemented();
                    return;
                }
                break;
            case -1165617118:
                if (substring.equals("NotificationManager")) {
                    int hashCode2 = substring2.hashCode();
                    i3y i3yVar2 = this.a0;
                    switch (hashCode2) {
                        case -260678592:
                            if (substring2.equals("requestNotificationFullScreenIntentPermission")) {
                                if (Build.VERSION.SDK_INT >= 34) {
                                    canUseFullScreenIntent = d().canUseFullScreenIntent();
                                    if (!canUseFullScreenIntent) {
                                        if (this.a != null) {
                                            ((ba20) da20Var).error("Some permission request already in progress", null, null);
                                            break;
                                        } else {
                                            Activity activity5 = this.O;
                                            if (activity5 == null) {
                                                ((ba20) da20Var).error("Some error occurred while requesting permission", null, null);
                                                break;
                                            } else {
                                                Context context4 = this.N;
                                                activity5.startActivityForResult(new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.parse("package:" + (context4 != null ? context4 : null).getPackageName())), 33891);
                                                this.a = new vk00((ba20) da20Var, this);
                                                break;
                                            }
                                        }
                                    }
                                }
                                ((ba20) da20Var).success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 730939723:
                            if (substring2.equals("getNotificationChannelLockscreenVisibility")) {
                                if (obj != null) {
                                    NotificationChannel notificationChannel = d().getNotificationChannel((String) obj);
                                    ((ba20) da20Var).success(Integer.valueOf(notificationChannel != null ? notificationChannel.getLockscreenVisibility() : -1000));
                                    break;
                                } else {
                                    ny61.g("Required value was null.");
                                    break;
                                }
                            }
                            break;
                        case 891942317:
                            if (substring2.equals("areNotificationsEnabled")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((s0) i3yVar2.getValue()).b.areNotificationsEnabled()));
                                break;
                            }
                            break;
                        case 1172127350:
                            if (substring2.equals("getNotificationChannelImportance")) {
                                if (obj != null) {
                                    NotificationChannel notificationChannel2 = d().getNotificationChannel((String) obj);
                                    ((ba20) da20Var).success(Integer.valueOf(notificationChannel2 != null ? notificationChannel2.getImportance() : -1000));
                                    break;
                                } else {
                                    ny61.g("Required value was null.");
                                    break;
                                }
                            }
                            break;
                        case 1469482304:
                            if (substring2.equals("getCurrentInterruptionFilter")) {
                                ((ba20) da20Var).success(Integer.valueOf(d().getCurrentInterruptionFilter()));
                                break;
                            }
                            break;
                        case 1827902058:
                            if (substring2.equals("getImportance")) {
                                ((ba20) da20Var).success(Integer.valueOf(((s0) i3yVar2.getValue()).b.getImportance()));
                                break;
                            }
                            break;
                        case 1856319810:
                            if (substring2.equals("areNotificationsPaused")) {
                                ((ba20) da20Var).success(Boolean.valueOf(d().areNotificationsPaused()));
                                break;
                            }
                            break;
                        case 1943457696:
                            if (substring2.equals("isNotificationFullScreenIntentPermissionGranted")) {
                                if (Build.VERSION.SDK_INT >= 34) {
                                    canUseFullScreenIntent2 = d().canUseFullScreenIntent();
                                    ((ba20) da20Var).success(Boolean.valueOf(canUseFullScreenIntent2));
                                    break;
                                } else {
                                    ((ba20) da20Var).success(Boolean.TRUE);
                                    break;
                                }
                            }
                            break;
                    }
                    return;
                }
                break;
            case -1079351368:
                if (substring.equals("Runtime")) {
                    if (jl40.l(substring2, "availableProcessors")) {
                        ((ba20) da20Var).success(Integer.valueOf(Runtime.getRuntime().availableProcessors()));
                        return;
                    }
                    if (!jl40.l(substring2, "exit")) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    } else {
                        if (obj == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        int intValue = ((Number) obj).intValue();
                        ((ba20) da20Var).success(null);
                        Runtime.getRuntime().exit(intValue);
                        return;
                    }
                }
                break;
            case -1072845520:
                if (substring.equals("Application")) {
                    if (!jl40.l(substring2, "restart")) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    }
                    Activity activity6 = this.O;
                    if (activity6 != null) {
                        Intent intent2 = new Intent(activity6, activity6.getClass());
                        RestartActivity.Companion.getClass();
                        ywj0.a(activity6, intent2);
                    } else {
                        ywj0 ywj0Var = RestartActivity.Companion;
                        Context context5 = this.N;
                        if (context5 == null) {
                            context5 = null;
                        }
                        ywj0Var.getClass();
                        ywj0.a(context5, new Intent[0]);
                    }
                    ((ba20) da20Var).success(null);
                    return;
                }
                break;
            case -978145923:
                if (substring.equals("WindowManager")) {
                    int hashCode3 = substring2.hashCode();
                    if (hashCode3 != -1998796132) {
                        if (hashCode3 != -1550558912) {
                            if (hashCode3 == 1664945920 && substring2.equals("resetBrightness")) {
                                Activity activity7 = this.O;
                                WindowManager.LayoutParams attributes = (activity7 == null || (window4 = activity7.getWindow()) == null) ? null : window4.getAttributes();
                                if (attributes != null) {
                                    attributes.screenBrightness = -1.0f;
                                }
                                Activity activity8 = this.O;
                                if (activity8 != null && (window3 = activity8.getWindow()) != null) {
                                    window3.setAttributes(attributes);
                                }
                                ((ba20) da20Var).success(null);
                                return;
                            }
                        } else if (substring2.equals("adjustBrightness")) {
                            Double d = (Double) x920Var.a("brightness");
                            Activity activity9 = this.O;
                            WindowManager.LayoutParams attributes2 = (activity9 == null || (window2 = activity9.getWindow()) == null) ? null : window2.getAttributes();
                            if (d != null) {
                                if (attributes2 != null) {
                                    attributes2.screenBrightness = (float) d.doubleValue();
                                }
                                Activity activity10 = this.O;
                                if (activity10 != null && (window = activity10.getWindow()) != null) {
                                    window.setAttributes(attributes2);
                                }
                            }
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    } else if (substring2.equals("setPreferredRefreshRate")) {
                        float doubleValue = (float) ((Number) x920Var.a("rateHz")).doubleValue();
                        if (doubleValue < 0.0f) {
                            ((ba20) da20Var).error("setPreferredRefreshRate", "rateHz < 0", null);
                            return;
                        }
                        Activity activity11 = this.O;
                        if (activity11 == null) {
                            this.Q = doubleValue;
                            ((ba20) da20Var).success(null);
                            return;
                        }
                        try {
                            f(doubleValue, activity11);
                            ((ba20) da20Var).success(null);
                            return;
                        } catch (Throwable th) {
                            ((ba20) da20Var).error("setPreferredRefreshRate", th.toString(), null);
                            return;
                        }
                    }
                    ((ba20) da20Var).notImplemented();
                    return;
                }
                break;
            case -900896164:
                if (substring.equals("WifiState")) {
                    ((ba20) da20Var).success(Integer.valueOf(((WifiManager) this.e0.getValue()).getWifiState()));
                    return;
                }
                break;
            case -753504030:
                if (substring.equals("SystemProperties")) {
                    if (jl40.l(substring2, "get")) {
                        if (obj != null) {
                            ((ba20) da20Var).success(r3x0.a((String) obj));
                            return;
                        } else {
                            ny61.g("Required value was null.");
                            return;
                        }
                    }
                    if (!jl40.l(substring2, "getBooleanOrNull")) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    } else if (obj != null) {
                        ((ba20) da20Var).success(r3x0.b((String) obj));
                        return;
                    } else {
                        ny61.g("Required value was null.");
                        return;
                    }
                }
                break;
            case -679455617:
                if (substring.equals("CustomRom")) {
                    switch (substring2.hashCode()) {
                        case -1180537466:
                            if (substring2.equals("isEmui")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((String) qkf.b.getValue()).length() > 0));
                                return;
                            }
                            break;
                        case -1180302982:
                            if (substring2.equals("isMiui")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((String) qkf.a.getValue()).length() > 0));
                                return;
                            }
                            break;
                        case 1197729:
                            if (substring2.equals("hasHuaweiMobileServices")) {
                                try {
                                    i3y i3yVar3 = qkf.a;
                                    Context context6 = this.N;
                                    try {
                                        (context6 != null ? context6 : null).getPackageManager().getApplicationInfo("com.huawei.hwid", 0);
                                        z8 = true;
                                    } catch (PackageManager.NameNotFoundException unused2) {
                                    }
                                    ((ba20) da20Var).success(Boolean.valueOf(z8));
                                    return;
                                } catch (Exception e) {
                                    ((ba20) da20Var).error("", "Can not check HuaweiMobileServices availability", e);
                                    return;
                                }
                            }
                            break;
                        case 249250935:
                            if (substring2.equals("isMagicUI")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((String) qkf.c.getValue()).length() > 0));
                                return;
                            }
                            break;
                        case 1264508218:
                            if (substring2.equals("isMiuiOptimizationEnabled")) {
                                i3y i3yVar4 = qkf.a;
                                Boolean b = r3x0.b("persist.sys.miui_optimization");
                                if (b != null) {
                                    z = b.booleanValue();
                                } else {
                                    Boolean b2 = r3x0.b("ro.miui.cts");
                                    z = !(b2 != null ? b2.booleanValue() : false);
                                }
                                ((ba20) da20Var).success(Boolean.valueOf(z));
                                return;
                            }
                            break;
                        case 1327582405:
                            if (substring2.equals("hasGooglePlayServices")) {
                                try {
                                    i3y i3yVar5 = qkf.a;
                                    Context context7 = this.N;
                                    try {
                                        (context7 != null ? context7 : null).getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        z7 = true;
                                    } catch (PackageManager.NameNotFoundException unused3) {
                                    }
                                    ((ba20) da20Var).success(Boolean.valueOf(z7));
                                    return;
                                } catch (Exception e2) {
                                    ((ba20) da20Var).error("", "Can not check GooglePlay availability", e2);
                                    return;
                                }
                            }
                            break;
                    }
                    ((ba20) da20Var).notImplemented();
                    return;
                }
                break;
            case -619171064:
                if (substring.equals("PowerManager")) {
                    int hashCode4 = substring2.hashCode();
                    HashMap hashMap = this.P;
                    switch (hashCode4) {
                        case -2075857386:
                            if (substring2.equals("releaseWakeLock")) {
                                if (obj == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) hashMap.remove((String) obj);
                                if (wakeLock != null) {
                                    wakeLock.release();
                                }
                                ((ba20) da20Var).success(Boolean.valueOf(wakeLock != null));
                                return;
                            }
                            break;
                        case -1757792297:
                            if (substring2.equals("isDeviceIdleMode")) {
                                ((ba20) da20Var).success(Boolean.valueOf(e().isDeviceIdleMode()));
                                return;
                            }
                            break;
                        case -1619204123:
                            if (substring2.equals("acquireWakeLock")) {
                                Object a = x920Var.a("levelAndFlags");
                                if (a == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                int intValue2 = ((Number) a).intValue();
                                Object a2 = x920Var.a("tag");
                                if (a2 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                String str2 = (String) a2;
                                if (hashMap.get(str2) == null) {
                                    PowerManager.WakeLock newWakeLock = e().newWakeLock(intValue2, str2);
                                    newWakeLock.setReferenceCounted(false);
                                    newWakeLock.acquire();
                                    hashMap.put(str2, newWakeLock);
                                    z6 = true;
                                }
                                ((ba20) da20Var).success(Boolean.valueOf(z6));
                                return;
                            }
                            break;
                        case -1135925350:
                            if (substring2.equals("getBatteryDischargePrediction")) {
                                if (Build.VERSION.SDK_INT >= 31 && batteryDischargePrediction != null) {
                                    l = Long.valueOf(batteryDischargePrediction.toMillis());
                                }
                                ((ba20) da20Var).success(l);
                                return;
                            }
                            break;
                        case 434072408:
                            if (substring2.equals("isInteractive")) {
                                ((ba20) da20Var).success(Boolean.valueOf(e().isInteractive()));
                                return;
                            }
                            break;
                        case 1453905883:
                            if (substring2.equals("isPowerSaveMode")) {
                                Context context8 = this.N;
                                ((ba20) da20Var).success(Boolean.valueOf(e2a1.d(context8 != null ? context8 : null, e())));
                                return;
                            }
                            break;
                        case 2079768210:
                            if (substring2.equals("isIgnoringBatteryOptimizations")) {
                                PowerManager e3 = e();
                                Context context9 = this.N;
                                ((ba20) da20Var).success(Boolean.valueOf(e3.isIgnoringBatteryOptimizations((context9 != null ? context9 : null).getPackageName())));
                                return;
                            }
                            break;
                    }
                    ((ba20) da20Var).notImplemented();
                    return;
                }
                break;
            case -586775785:
                if (substring.equals("AudioManager")) {
                    switch (substring2.hashCode()) {
                        case -1582239800:
                            if (substring2.equals("getStreamMaxVolume")) {
                                if (obj != null) {
                                    ((ba20) da20Var).success(Integer.valueOf(c().getStreamMaxVolume(((Number) obj).intValue())));
                                    return;
                                } else {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                            }
                            break;
                        case -809761226:
                            if (substring2.equals("getStreamMinVolume")) {
                                if (obj != null) {
                                    ((ba20) da20Var).success(Integer.valueOf(c().getStreamMinVolume(((Number) obj).intValue())));
                                    return;
                                } else {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                            }
                            break;
                        case 276698416:
                            if (substring2.equals("getStreamVolume")) {
                                if (obj != null) {
                                    ((ba20) da20Var).success(Integer.valueOf(c().getStreamVolume(((Number) obj).intValue())));
                                    return;
                                } else {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                            }
                            break;
                        case 623794710:
                            if (substring2.equals("getRingerMode")) {
                                ((ba20) da20Var).success(Integer.valueOf(c().getRingerMode()));
                                return;
                            }
                            break;
                        case 1187450940:
                            if (substring2.equals("setStreamVolume")) {
                                if (c().isVolumeFixed()) {
                                    ((ba20) da20Var).success(Boolean.FALSE);
                                    return;
                                }
                                Object a3 = x920Var.a("streamType");
                                if (a3 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                int intValue3 = ((Number) a3).intValue();
                                Object a4 = x920Var.a("index");
                                if (a4 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                int intValue4 = ((Number) a4).intValue();
                                Object a5 = x920Var.a("flags");
                                if (a5 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                try {
                                    c().setStreamVolume(intValue3, intValue4, ((Number) a5).intValue());
                                    ((ba20) da20Var).success(Boolean.TRUE);
                                    return;
                                } catch (Exception unused4) {
                                    ((ba20) da20Var).success(Boolean.FALSE);
                                    return;
                                }
                            }
                            break;
                        case 1319790945:
                            if (substring2.equals("isBluetoothAudioDeviceConnected")) {
                                for (AudioDeviceInfo audioDeviceInfo : c().getDevices(2)) {
                                    if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7) {
                                        z5 = true;
                                        ((ba20) da20Var).success(Boolean.valueOf(z5));
                                        return;
                                    }
                                }
                                ((ba20) da20Var).success(Boolean.valueOf(z5));
                                return;
                            }
                            break;
                        case 1397925922:
                            if (substring2.equals("setRingerMode")) {
                                if (c().isVolumeFixed()) {
                                    ((ba20) da20Var).success(Boolean.FALSE);
                                    return;
                                }
                                if (obj == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                try {
                                    c().setRingerMode(((Number) obj).intValue());
                                    ((ba20) da20Var).success(Boolean.TRUE);
                                    return;
                                } catch (Exception unused5) {
                                    ((ba20) da20Var).success(Boolean.FALSE);
                                    return;
                                }
                            }
                            break;
                        case 1986792688:
                            if (substring2.equals("isVolumeFixed")) {
                                ((ba20) da20Var).success(Boolean.valueOf(c().isVolumeFixed()));
                                return;
                            }
                            break;
                    }
                    ((ba20) da20Var).notImplemented();
                    return;
                }
                break;
            case -294086120:
                if (substring.equals("LocationManager")) {
                    boolean l3 = jl40.l(substring2, "isLocationEnabled");
                    i3y i3yVar6 = this.U;
                    if (l3) {
                        LocationManager locationManager = (LocationManager) i3yVar6.getValue();
                        WeakHashMap weakHashMap = j.a;
                        ((ba20) da20Var).success(Boolean.valueOf(locationManager.isLocationEnabled()));
                        return;
                    } else if (!jl40.l(substring2, "isProviderEnabled")) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    } else if (obj != null) {
                        ((ba20) da20Var).success(Boolean.valueOf(((LocationManager) i3yVar6.getValue()).isProviderEnabled((String) obj)));
                        return;
                    } else {
                        ny61.g("Required value was null.");
                        return;
                    }
                }
                break;
            case -284902963:
                if (substring.equals("WifiScanAvailability")) {
                    t551 t551Var = (t551) this.h0.getValue();
                    t551Var.getClass();
                    Context context10 = t551Var.a;
                    switch (substring2.hashCode()) {
                        case -1326500611:
                            if (substring2.equals("checkWifiScanThrottleEnabled")) {
                                int i = Build.VERSION.SDK_INT;
                                if (i <= 29) {
                                    try {
                                        break;
                                    } catch (Settings.SettingNotFoundException unused6) {
                                    }
                                } else {
                                    if (i >= 30) {
                                        z4 = ((WifiManager) context10.getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI)).isScanThrottleEnabled();
                                    }
                                    z4 = true;
                                }
                                ((ba20) da20Var).success(Boolean.valueOf(z4));
                                return;
                            }
                            break;
                        case 147019718:
                            if (substring2.equals("canUserDisableWifiScanThrottling")) {
                                if (((String) qkf.b.getValue()).length() <= 0 && ((String) qkf.c.getValue()).length() <= 0) {
                                    z3 = true;
                                }
                                ((ba20) da20Var).success(Boolean.valueOf(z3));
                                return;
                            }
                            break;
                        case 441860716:
                            if (substring2.equals("wifiEnabled")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((WifiManager) context10.getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI)).isWifiEnabled()));
                                return;
                            }
                            break;
                        case 1077972000:
                            if (substring2.equals("wifiScanAlwaysEnabled")) {
                                try {
                                    bool3 = Boolean.valueOf(1 == Settings.Global.getInt(context10.getContentResolver(), "wifi_scan_always_enabled"));
                                } catch (Settings.SettingNotFoundException unused7) {
                                }
                                ((ba20) da20Var).success(bool3);
                                return;
                            }
                            break;
                        case 1900432311:
                            if (substring2.equals("wifiScanAvailable")) {
                                if (((WifiManager) context10.getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI)).isWifiEnabled()) {
                                    bool = Boolean.TRUE;
                                } else {
                                    try {
                                        bool4 = Boolean.valueOf(1 == Settings.Global.getInt(context10.getContentResolver(), "wifi_scan_always_enabled"));
                                    } catch (Settings.SettingNotFoundException unused8) {
                                    }
                                    bool = bool4;
                                }
                                ((ba20) da20Var).success(bool);
                                return;
                            }
                            break;
                    }
                    ((ba20) da20Var).notImplemented();
                    return;
                }
                break;
            case -227343193:
                if (substring.equals("PackageManager")) {
                    if (!substring2.equals("versionName")) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    }
                    try {
                        ((ba20) da20Var).success(((PackageManager) this.f0.getValue()).getPackageInfo((String) obj, 0).versionName);
                        return;
                    } catch (PackageManager.NameNotFoundException e4) {
                        ((ba20) da20Var).error("packageNotFound", e4.getMessage(), ljo.b(e4));
                        return;
                    }
                }
                break;
            case -44521690:
                if (substring.equals("BluetoothScanAvailability")) {
                    o66 o66Var = (o66) this.i0.getValue();
                    o66Var.getClass();
                    Context context11 = o66Var.a;
                    int hashCode5 = substring2.hashCode();
                    if (hashCode5 != -1535771225) {
                        if (hashCode5 != -205807437) {
                            if (hashCode5 == 545757374 && substring2.equals("bluetoothScanAvailable")) {
                                BluetoothAdapter adapter = ((BluetoothManager) context11.getApplicationContext().getSystemService("bluetooth")).getAdapter();
                                if (adapter != null ? adapter.isEnabled() : false) {
                                    bool2 = Boolean.TRUE;
                                } else {
                                    try {
                                        bool6 = Boolean.valueOf(1 == Settings.Global.getInt(context11.getContentResolver(), "ble_scan_always_enabled"));
                                    } catch (Settings.SettingNotFoundException unused9) {
                                    }
                                    bool2 = bool6;
                                }
                                ((ba20) da20Var).success(bool2);
                                return;
                            }
                        } else if (substring2.equals("bluetoothEnabled")) {
                            BluetoothAdapter adapter2 = ((BluetoothManager) context11.getApplicationContext().getSystemService("bluetooth")).getAdapter();
                            ((ba20) da20Var).success(Boolean.valueOf(adapter2 != null ? adapter2.isEnabled() : false));
                            return;
                        }
                    } else if (substring2.equals("bluetoothScanAlwaysEnabled")) {
                        try {
                            bool5 = Boolean.valueOf(1 == Settings.Global.getInt(context11.getContentResolver(), "ble_scan_always_enabled"));
                        } catch (Settings.SettingNotFoundException unused10) {
                        }
                        ((ba20) da20Var).success(bool5);
                        return;
                    }
                    ((ba20) da20Var).notImplemented();
                    return;
                }
                break;
            case 5479941:
                if (substring.equals("AppBackgroundObserver")) {
                    if (substring2.equals("getStatus")) {
                        ((ba20) da20Var).success(((ap2) this.j0.getValue()).b);
                        return;
                    } else {
                        ((ba20) da20Var).notImplemented();
                        return;
                    }
                }
                break;
            case 64542286:
                if (substring.equals("Build")) {
                    if (substring2.equals("VERSION.SDK_INT")) {
                        ((ba20) da20Var).success(Integer.valueOf(Build.VERSION.SDK_INT));
                        return;
                    } else {
                        ((ba20) da20Var).notImplemented();
                        return;
                    }
                }
                break;
            case 268072199:
                if (substring.equals("KeyguardManager")) {
                    int hashCode6 = substring2.hashCode();
                    i3y i3yVar7 = this.W;
                    switch (hashCode6) {
                        case -1894869174:
                            if (substring2.equals("isDeviceLocked")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((KeyguardManager) i3yVar7.getValue()).isDeviceLocked()));
                                return;
                            }
                            break;
                        case -1768159807:
                            if (substring2.equals("requestDismissKeyguard")) {
                                Activity activity12 = this.O;
                                if (activity12 != null) {
                                    ((KeyguardManager) i3yVar7.getValue()).requestDismissKeyguard(activity12, new KeyguardDismissCallback(da20Var));
                                    return;
                                } else {
                                    ((ba20) da20Var).success(0);
                                    return;
                                }
                            }
                            break;
                        case -1703690313:
                            if (substring2.equals("isDeviceSecure")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((KeyguardManager) i3yVar7.getValue()).isDeviceSecure()));
                                return;
                            }
                            break;
                        case -88443366:
                            if (substring2.equals("isKeyguardLocked")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((KeyguardManager) i3yVar7.getValue()).isKeyguardLocked()));
                                return;
                            }
                            break;
                        case 102735495:
                            if (substring2.equals("isKeyguardSecure")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((KeyguardManager) i3yVar7.getValue()).isKeyguardSecure()));
                                return;
                            }
                            break;
                    }
                    ((ba20) da20Var).notImplemented();
                    return;
                }
                break;
            case 364031358:
                if (substring.equals("ActivityManager")) {
                    int hashCode7 = substring2.hashCode();
                    i3y i3yVar8 = this.V;
                    if (hashCode7 != -1914822541) {
                        if (hashCode7 != 150118762) {
                            if (hashCode7 == 1687020869 && substring2.equals("getMemoryInfo")) {
                                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                ((ActivityManager) i3yVar8.getValue()).getMemoryInfo(memoryInfo);
                                ((ba20) da20Var).success(kotlin.collections.b.i(new Pair("availMem", Long.valueOf(memoryInfo.availMem)), new Pair("lowMemory", Boolean.valueOf(memoryInfo.lowMemory)), new Pair("threshold", Long.valueOf(memoryInfo.threshold)), new Pair("totalMem", Long.valueOf(memoryInfo.totalMem))));
                                return;
                            }
                        } else if (substring2.equals("isLowRamDevice")) {
                            ((ba20) da20Var).success(Boolean.valueOf(((ActivityManager) i3yVar8.getValue()).isLowRamDevice()));
                            return;
                        }
                    } else if (substring2.equals("isBackgroundRestricted")) {
                        ((ba20) da20Var).success(Boolean.valueOf(((ActivityManager) i3yVar8.getValue()).isBackgroundRestricted()));
                        return;
                    }
                    ((ba20) da20Var).notImplemented();
                    return;
                }
                break;
            case 983466271:
                if (substring.equals("InternetConnection")) {
                    usw uswVar = (usw) this.g0.getValue();
                    uswVar.getClass();
                    if (substring2.equals(ACSPConstants.STATUS)) {
                        ((ba20) da20Var).success(uswVar.a(null));
                        return;
                    } else {
                        ((ba20) da20Var).notImplemented();
                        return;
                    }
                }
                break;
            case 1457282219:
                if (substring.equals("DisplayManager")) {
                    if (!substring2.equals("defaultDisplayState")) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    } else {
                        Display display = ((DisplayManager) this.T.getValue()).getDisplay(0);
                        ((ba20) da20Var).success(Integer.valueOf(display != null ? display.getState() : 0));
                        return;
                    }
                }
                break;
            case 1499275331:
                if (substring.equals("Settings")) {
                    int G2 = evu0.G(substring2, '.', 0, 6);
                    if (G2 < 0) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    }
                    String substring3 = substring2.substring(0, G2);
                    String substring4 = substring2.substring(G2 + 1);
                    if (substring3.equals("Global")) {
                        if (!substring4.equals("AIRPLANE_MODE_ON")) {
                            ((ba20) da20Var).notImplemented();
                            return;
                        } else {
                            Context context12 = this.N;
                            ((ba20) da20Var).success(Boolean.valueOf(Settings.Global.getInt((context12 != null ? context12 : null).getContentResolver(), "airplane_mode_on", 0) != 0));
                            return;
                        }
                    }
                    if (!substring3.equals("Secure")) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    } else if (!substring4.equals("lockScreenShowNotifications")) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    } else {
                        Context context13 = this.N;
                        ((ba20) da20Var).success(Boolean.valueOf(Settings.Secure.getInt((context13 != null ? context13 : null).getContentResolver(), "lock_screen_show_notifications", -1) > 0));
                        return;
                    }
                }
                break;
            case 1726533587:
                if (substring.equals("LocaleManager")) {
                    if (substring2.equals("setDefaultLocale")) {
                        W = evu0.W((String) obj, new String[]{"_"}, (r2 & 4) != 0 ? 0 : 2);
                        String str3 = (String) W.get(0);
                        String str4 = (String) kotlin.collections.a.S(1, W);
                        Locale.setDefault(new Locale(str3, str4 != null ? str4 : ""));
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    if (!substring2.equals("getDefaultLocale")) {
                        ((ba20) da20Var).notImplemented();
                        return;
                    }
                    Locale locale = Locale.getDefault();
                    StringBuffer stringBuffer = new StringBuffer(locale.getLanguage());
                    String country = locale.getCountry();
                    if (country.length() > 0) {
                        stringBuffer.append("_".concat(country));
                    }
                    ((ba20) da20Var).success(stringBuffer.toString());
                    return;
                }
                break;
        }
        ((ba20) da20Var).notImplemented();
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        onAttachedToActivity(l40Var);
    }
}
