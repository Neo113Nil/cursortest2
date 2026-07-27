package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;
import p2.C4835j;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.Se, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2773Se {

    /* renamed from: a, reason: collision with root package name */
    public int f27510a;

    /* renamed from: b, reason: collision with root package name */
    public int f27511b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27512c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27513d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27514e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27515f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27516g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27517h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f27518j;

    /* renamed from: k, reason: collision with root package name */
    public final float f27519k;

    /* renamed from: l, reason: collision with root package name */
    public final int f27520l;

    /* renamed from: m, reason: collision with root package name */
    public final int f27521m;

    /* renamed from: n, reason: collision with root package name */
    public final String f27522n;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)(1:35)|4|(1:6)(1:34)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af A[Catch: Exception -> 0x00d7, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d7, blocks: (B:12:0x00a1, B:14:0x00af), top: B:11:0x00a1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2773Se(Context context) {
        ActivityInfo activityInfo;
        PackageInfo c9;
        String sb;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo c10;
        PackageManager packageManager = context.getPackageManager();
        AbstractC3569ma.a(context);
        b(context);
        c(context);
        d(context);
        Locale locale = Locale.getDefault();
        this.f27512c = e(packageManager, "geo:0,0?q=donuts") != null;
        this.f27513d = e(packageManager, "http://www.google.com") != null;
        this.f27514e = locale.getCountry();
        u2.D d2 = C4835j.f39730C.f39735c;
        v2.d dVar = C4900p.f40196g.f40197a;
        this.f27515f = v2.d.s();
        this.f27516g = T2.b.h(context);
        this.f27517h = T2.b.k(context);
        this.i = locale.getLanguage();
        ResolveInfo e9 = e(packageManager, "market://details?id=com.google.android.gms.ads");
        String str = null;
        if (e9 != null && (activityInfo = e9.activityInfo) != null) {
            try {
                c9 = V2.c.a(context).c(0, activityInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (c9 != null) {
                int i = c9.versionCode;
                String str2 = activityInfo.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(str2).length());
                sb2.append(i);
                sb2.append(com.anythink.core.common.d.j.f12378z);
                sb2.append(str2);
                sb = sb2.toString();
                this.f27518j = sb;
                c10 = V2.c.a(context).c(128, "com.android.vending");
                if (c10 != null) {
                    int i6 = c10.versionCode;
                    String str3 = c10.packageName;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i6).length() + 1 + String.valueOf(str3).length());
                    sb3.append(i6);
                    sb3.append(com.anythink.core.common.d.j.f12378z);
                    sb3.append(str3);
                    str = sb3.toString();
                }
                this.f27522n = str;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.f27519k = displayMetrics.density;
                    this.f27520l = displayMetrics.widthPixels;
                    this.f27521m = displayMetrics.heightPixels;
                }
                return;
            }
        }
        sb = null;
        this.f27518j = sb;
        c10 = V2.c.a(context).c(128, "com.android.vending");
        if (c10 != null) {
        }
        this.f27522n = str;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.f27519k = displayMetrics.density;
        this.f27520l = displayMetrics.widthPixels;
        this.f27521m = displayMetrics.heightPixels;
    }

    public static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), com.anythink.basead.exoplayer.b.aX);
        } catch (Throwable th) {
            C4835j.f39730C.f39740h.d("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final C2789Te a() {
        return new C2789Te(this.f27512c, this.f27513d, this.f27514e, this.f27515f, this.f27516g, this.f27517h, this.i, this.f27518j, this.f27522n, this.f27510a, this.f27511b, this.f27519k, this.f27520l, this.f27521m);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f8445b);
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                C4835j.f39730C.f39740h.d("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (((java.lang.Boolean) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.O9)).booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        telephonyManager.getNetworkOperator();
        int i = 0;
        if (T2.b.g()) {
        }
        i = telephonyManager.getNetworkType();
        this.f27511b = i;
        telephonyManager.getPhoneType();
        this.f27510a = -2;
        u2.D d2 = C4835j.f39730C.f39735c;
        if (u2.D.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f27510a = activeNetworkInfo.getType();
                activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f27510a = -1;
            }
            connectivityManager.isActiveNetworkMetered();
        }
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (registerReceiver != null) {
            registerReceiver.getIntExtra("status", -1);
            registerReceiver.getIntExtra("level", -1);
            registerReceiver.getIntExtra("scale", -1);
        }
    }

    public C2773Se(Context context, C2789Te c2789Te) {
        AbstractC3569ma.a(context);
        b(context);
        c(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        C4108wa.a(context);
        this.f27512c = c2789Te.f27746a;
        this.f27513d = c2789Te.f27747b;
        this.f27514e = c2789Te.f27748c;
        this.f27515f = c2789Te.f27749d;
        this.f27516g = c2789Te.f27750e;
        this.f27517h = c2789Te.f27751f;
        this.i = c2789Te.f27752g;
        this.f27518j = c2789Te.f27753h;
        this.f27522n = c2789Te.i;
        this.f27519k = c2789Te.f27756l;
        this.f27520l = c2789Te.f27757m;
        this.f27521m = c2789Te.f27758n;
    }
}
