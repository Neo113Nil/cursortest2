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
import r2.C4906k;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.Se, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2793Se {

    /* renamed from: a, reason: collision with root package name */
    public int f28302a;

    /* renamed from: b, reason: collision with root package name */
    public int f28303b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28304c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28305d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28306e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28307f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28308g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28309h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f28310j;

    /* renamed from: k, reason: collision with root package name */
    public final float f28311k;

    /* renamed from: l, reason: collision with root package name */
    public final int f28312l;

    /* renamed from: m, reason: collision with root package name */
    public final int f28313m;

    /* renamed from: n, reason: collision with root package name */
    public final String f28314n;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)(1:35)|4|(1:6)(1:34)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af A[Catch: Exception -> 0x00d7, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d7, blocks: (B:12:0x00a1, B:14:0x00af), top: B:11:0x00a1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2793Se(Context context) {
        ActivityInfo activityInfo;
        PackageInfo g9;
        String sb;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo g10;
        PackageManager packageManager = context.getPackageManager();
        AbstractC3592ma.a(context);
        b(context);
        c(context);
        d(context);
        Locale locale = Locale.getDefault();
        this.f28304c = e(packageManager, "geo:0,0?q=donuts") != null;
        this.f28305d = e(packageManager, "http://www.google.com") != null;
        this.f28306e = locale.getCountry();
        w2.D d9 = C4906k.f40186C.f40191c;
        x2.d dVar = C4949p.f40498g.f40499a;
        this.f28307f = x2.d.s();
        this.f28308g = V2.b.h(context);
        this.f28309h = V2.b.k(context);
        this.i = locale.getLanguage();
        ResolveInfo e9 = e(packageManager, "market://details?id=com.google.android.gms.ads");
        String str = null;
        if (e9 != null && (activityInfo = e9.activityInfo) != null) {
            try {
                g9 = X2.b.a(context).g(0, activityInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (g9 != null) {
                int i = g9.versionCode;
                String str2 = activityInfo.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(str2).length());
                sb2.append(i);
                sb2.append(com.anythink.core.common.d.j.f13164z);
                sb2.append(str2);
                sb = sb2.toString();
                this.f28310j = sb;
                g10 = X2.b.a(context).g(128, "com.android.vending");
                if (g10 != null) {
                    int i4 = g10.versionCode;
                    String str3 = g10.packageName;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 1 + String.valueOf(str3).length());
                    sb3.append(i4);
                    sb3.append(com.anythink.core.common.d.j.f13164z);
                    sb3.append(str3);
                    str = sb3.toString();
                }
                this.f28314n = str;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.f28311k = displayMetrics.density;
                    this.f28312l = displayMetrics.widthPixels;
                    this.f28313m = displayMetrics.heightPixels;
                }
                return;
            }
        }
        sb = null;
        this.f28310j = sb;
        g10 = X2.b.a(context).g(128, "com.android.vending");
        if (g10 != null) {
        }
        this.f28314n = str;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.f28311k = displayMetrics.density;
        this.f28312l = displayMetrics.widthPixels;
        this.f28313m = displayMetrics.heightPixels;
    }

    public static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), com.anythink.basead.exoplayer.b.aX);
        } catch (Throwable th) {
            C4906k.f40186C.f40196h.d("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final C2810Te a() {
        return new C2810Te(this.f28304c, this.f28305d, this.f28306e, this.f28307f, this.f28308g, this.f28309h, this.i, this.f28310j, this.f28314n, this.f28302a, this.f28303b, this.f28311k, this.f28312l, this.f28313m);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f9231b);
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                C4906k.f40186C.f40196h.d("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.O9)).booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        telephonyManager.getNetworkOperator();
        int i = 0;
        if (V2.b.g()) {
        }
        i = telephonyManager.getNetworkType();
        this.f28303b = i;
        telephonyManager.getPhoneType();
        this.f28302a = -2;
        w2.D d9 = C4906k.f40186C.f40191c;
        if (w2.D.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f28302a = activeNetworkInfo.getType();
                activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f28302a = -1;
            }
            connectivityManager.isActiveNetworkMetered();
        }
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (registerReceiver != null) {
            registerReceiver.getIntExtra("status", -1);
            registerReceiver.getIntExtra("level", -1);
            registerReceiver.getIntExtra("scale", -1);
        }
    }

    public C2793Se(Context context, C2810Te c2810Te) {
        AbstractC3592ma.a(context);
        b(context);
        c(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        C4131wa.a(context);
        this.f28304c = c2810Te.f28533a;
        this.f28305d = c2810Te.f28534b;
        this.f28306e = c2810Te.f28535c;
        this.f28307f = c2810Te.f28536d;
        this.f28308g = c2810Te.f28537e;
        this.f28309h = c2810Te.f28538f;
        this.i = c2810Te.f28539g;
        this.f28310j = c2810Te.f28540h;
        this.f28314n = c2810Te.i;
        this.f28311k = c2810Te.f28543l;
        this.f28312l = c2810Te.f28544m;
        this.f28313m = c2810Te.f28545n;
    }
}
