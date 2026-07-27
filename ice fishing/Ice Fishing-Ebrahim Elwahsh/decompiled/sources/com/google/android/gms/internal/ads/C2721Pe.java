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
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.Pe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2721Pe {

    /* renamed from: a, reason: collision with root package name */
    public int f26991a;

    /* renamed from: b, reason: collision with root package name */
    public int f26992b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26993c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26994d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26995e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26996f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26997g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26998h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f26999j;

    /* renamed from: k, reason: collision with root package name */
    public final float f27000k;

    /* renamed from: l, reason: collision with root package name */
    public final int f27001l;

    /* renamed from: m, reason: collision with root package name */
    public final int f27002m;

    /* renamed from: n, reason: collision with root package name */
    public final String f27003n;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)(1:35)|4|(1:6)(1:34)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af A[Catch: Exception -> 0x00d7, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d7, blocks: (B:12:0x00a1, B:14:0x00af), top: B:11:0x00a1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2721Pe(Context context) {
        ActivityInfo activityInfo;
        PackageInfo e6;
        String sb;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo e9;
        PackageManager packageManager = context.getPackageManager();
        AbstractC3368ia.a(context);
        b(context);
        c(context);
        d(context);
        Locale locale = Locale.getDefault();
        this.f26993c = e(packageManager, "geo:0,0?q=donuts") != null;
        this.f26994d = e(packageManager, "http://www.google.com") != null;
        this.f26995e = locale.getCountry();
        t2.G g9 = p2.j.f39798C.f39803c;
        u2.d dVar = C4907p.f40108g.f40109a;
        this.f26996f = u2.d.r();
        this.f26997g = S2.b.h(context);
        this.f26998h = S2.b.k(context);
        this.i = locale.getLanguage();
        ResolveInfo e10 = e(packageManager, "market://details?id=com.google.android.gms.ads");
        String str = null;
        if (e10 != null && (activityInfo = e10.activityInfo) != null) {
            try {
                e6 = U2.c.a(context).e(0, activityInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (e6 != null) {
                int i = e6.versionCode;
                String str2 = activityInfo.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(str2).length());
                sb2.append(i);
                sb2.append(com.anythink.core.common.d.j.f12535z);
                sb2.append(str2);
                sb = sb2.toString();
                this.f26999j = sb;
                e9 = U2.c.a(context).e(128, "com.android.vending");
                if (e9 != null) {
                    int i4 = e9.versionCode;
                    String str3 = e9.packageName;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 1 + String.valueOf(str3).length());
                    sb3.append(i4);
                    sb3.append(com.anythink.core.common.d.j.f12535z);
                    sb3.append(str3);
                    str = sb3.toString();
                }
                this.f27003n = str;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.f27000k = displayMetrics.density;
                    this.f27001l = displayMetrics.widthPixels;
                    this.f27002m = displayMetrics.heightPixels;
                }
                return;
            }
        }
        sb = null;
        this.f26999j = sb;
        e9 = U2.c.a(context).e(128, "com.android.vending");
        if (e9 != null) {
        }
        this.f27003n = str;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.f27000k = displayMetrics.density;
        this.f27001l = displayMetrics.widthPixels;
        this.f27002m = displayMetrics.heightPixels;
    }

    public static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), com.anythink.basead.exoplayer.b.aX);
        } catch (Throwable th) {
            p2.j.f39798C.f39808h.d("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final C2738Qe a() {
        return new C2738Qe(this.f26993c, this.f26994d, this.f26995e, this.f26996f, this.f26997g, this.f26998h, this.i, this.f26999j, this.f27003n, this.f26991a, this.f26992b, this.f27000k, this.f27001l, this.f27002m);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f8602b);
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                p2.j.f39798C.f39808h.d("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.O9)).booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        telephonyManager.getNetworkOperator();
        int i = 0;
        if (S2.b.g()) {
        }
        i = telephonyManager.getNetworkType();
        this.f26992b = i;
        telephonyManager.getPhoneType();
        this.f26991a = -2;
        t2.G g9 = p2.j.f39798C.f39803c;
        if (t2.G.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f26991a = activeNetworkInfo.getType();
                activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f26991a = -1;
            }
            connectivityManager.isActiveNetworkMetered();
        }
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (registerReceiver != null) {
            registerReceiver.getIntExtra("status", -1);
            registerReceiver.getIntExtra("level", -1);
            registerReceiver.getIntExtra("scale", -1);
        }
    }

    public C2721Pe(Context context, C2738Qe c2738Qe) {
        AbstractC3368ia.a(context);
        b(context);
        c(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        C3905sa.a(context);
        this.f26993c = c2738Qe.f27180a;
        this.f26994d = c2738Qe.f27181b;
        this.f26995e = c2738Qe.f27182c;
        this.f26996f = c2738Qe.f27183d;
        this.f26997g = c2738Qe.f27184e;
        this.f26998h = c2738Qe.f27185f;
        this.i = c2738Qe.f27186g;
        this.f26999j = c2738Qe.f27187h;
        this.f27003n = c2738Qe.i;
        this.f27000k = c2738Qe.f27190l;
        this.f27001l = c2738Qe.f27191m;
        this.f27002m = c2738Qe.f27192n;
    }
}
