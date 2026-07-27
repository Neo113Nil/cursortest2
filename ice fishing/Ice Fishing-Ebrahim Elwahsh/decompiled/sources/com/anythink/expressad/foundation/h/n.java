package com.anythink.expressad.foundation.h;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19805a = "SameDiTool";

    /* renamed from: b, reason: collision with root package name */
    private static int f19806b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static int f19807c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static int f19808d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static String f19809e = "";

    /* renamed from: f, reason: collision with root package name */
    private static String f19810f = "";

    /* renamed from: g, reason: collision with root package name */
    private static String f19811g = "";

    /* renamed from: h, reason: collision with root package name */
    private static String f19812h = "";
    private static int i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static String f19813j = "";

    /* renamed from: k, reason: collision with root package name */
    private static String f19814k = "";

    /* renamed from: l, reason: collision with root package name */
    private static int f19815l = -1;

    /* renamed from: m, reason: collision with root package name */
    private static String f19816m = "";

    /* renamed from: n, reason: collision with root package name */
    private static int f19817n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static String f19818o = "";

    /* renamed from: p, reason: collision with root package name */
    private static int f19819p;

    /* renamed from: com.anythink.expressad.foundation.h.n$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f19821a;

        public AnonymousClass2(Context context) {
            this.f19821a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            ConnectivityManager connectivityManager;
            try {
                if (com.anythink.core.common.d.t.b().c("network_type")) {
                    return;
                }
                try {
                    if (com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() && (context = this.f19821a) != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null) {
                            int unused = n.f19808d = 0;
                            return;
                        }
                        if (activeNetworkInfo.getType() == 1) {
                            int unused2 = n.f19808d = 9;
                            return;
                        }
                        TelephonyManager telephonyManager = (TelephonyManager) this.f19821a.getSystemService("phone");
                        if (telephonyManager == null) {
                            int unused3 = n.f19808d = 0;
                        } else {
                            int unused4 = n.f19808d = n.a(telephonyManager.getNetworkType());
                        }
                    }
                } catch (Exception unused5) {
                }
            } catch (Throwable th) {
                th.getMessage();
                int unused6 = n.f19808d = 0;
            }
        }
    }

    private n() {
    }

    public static int a(int i4) {
        if (i4 == 20) {
            return 5;
        }
        switch (i4) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }

    public static int c(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    public static int d(Context context) {
        if (context == null) {
            return i;
        }
        int i4 = i;
        if (i4 != 0) {
            return i4;
        }
        try {
            int i9 = com.anythink.core.common.v.m.B(context).versionCode;
            i = i9;
            return i9;
        } catch (Exception e6) {
            e6.printStackTrace();
            return -1;
        }
    }

    public static String e(Context context) {
        if (context == null) {
            return f19812h;
        }
        try {
            if (!TextUtils.isEmpty(f19812h)) {
                return f19812h;
            }
            String str = com.anythink.core.common.v.m.B(context).versionName;
            f19812h = str;
            return str;
        } catch (Exception e6) {
            e6.printStackTrace();
            return "";
        }
    }

    public static int f(Context context) {
        if (com.anythink.core.common.d.t.b().c("screen")) {
            return 0;
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap h9 = h(context);
                return h9.get("width") == null ? displayMetrics.widthPixels : ((Integer) h9.get("width")).intValue();
            } catch (Exception e6) {
                e6.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    public static int g(Context context) {
        if (com.anythink.core.common.d.t.b().c("screen")) {
            return 0;
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap h9 = h(context);
                return h9.get("height") == null ? displayMetrics.heightPixels : ((Integer) h9.get("height")).intValue();
            } catch (Exception e6) {
                e6.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    public static HashMap h(Context context) {
        HashMap hashMap = new HashMap();
        if (context != null) {
            try {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
                hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
                return hashMap;
            } catch (Exception e6) {
                e6.getMessage();
            }
        }
        return hashMap;
    }

    public static String i(Context context) {
        if (context == null) {
            return f19811g;
        }
        try {
            if (!TextUtils.isEmpty(f19811g)) {
                return f19811g;
            }
            String str = com.anythink.core.common.v.m.B(context).packageName;
            f19811g = str;
            return str;
        } catch (Exception e6) {
            e6.printStackTrace();
            return "";
        }
    }

    public static int j() {
        return 0;
    }

    private static void k(Context context) {
        try {
            i(context);
            e(context);
            d(context);
            c(context);
            com.anythink.expressad.foundation.g.a.cb = v.a("android.permission.WRITE_EXTERNAL_STORAGE", context);
            com.anythink.expressad.foundation.g.a.ca = v.a("android.permission.ACCESS_NETWORK_STATE", context);
            l(context);
        } catch (Throwable unused) {
        }
    }

    private static int l(Context context) {
        if (context == null) {
            return f19817n;
        }
        if (f19817n == 0) {
            try {
                f19817n = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e6) {
                e6.getMessage();
            }
        }
        return f19817n;
    }

    private static void m(Context context) {
        try {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
            if (com.anythink.expressad.foundation.g.i.a.b().getActiveCount() <= 0) {
                com.anythink.expressad.foundation.g.i.a.b().execute(anonymousClass2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static boolean n(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null) {
            return false;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
        } catch (Exception e6) {
            e6.getMessage();
        }
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 6.0d;
    }

    private static String o() {
        return "";
    }

    private static long p() {
        Context g9 = com.anythink.core.common.d.t.b().g();
        if (g9 == null) {
            return 0L;
        }
        ActivityManager activityManager = (ActivityManager) g9.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    private static String q() {
        return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : Arrays.asList(Build.SUPPORTED_ABIS).toString();
    }

    private static String r() {
        return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : Build.CPU_ABI;
    }

    private static String s() {
        return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : Build.CPU_ABI2;
    }

    public static String a(Context context, int i4) {
        TelephonyManager telephonyManager;
        if (i4 != 0 && i4 != 9) {
            try {
                return (!com.anythink.expressad.foundation.g.a.ca || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return "";
    }

    public static int b() {
        Context g9;
        try {
            g9 = com.anythink.core.common.d.t.b().g();
        } catch (Throwable th) {
            th.getMessage();
            f19808d = 0;
            return 0;
        }
        if (com.anythink.core.common.d.t.b().c("network_type")) {
            return f19808d;
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return f19808d;
            }
            if (g9 == null) {
                return f19808d;
            }
            if (f19808d == -1) {
                f19808d = 0;
                return 0;
            }
            try {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(g9);
                if (com.anythink.expressad.foundation.g.i.a.b().getActiveCount() <= 0) {
                    com.anythink.expressad.foundation.g.i.a.b().execute(anonymousClass2);
                }
            } catch (Throwable th2) {
                th2.getMessage();
            }
            return f19808d;
        } catch (Exception unused) {
            return f19808d;
        }
        th.getMessage();
        f19808d = 0;
        return 0;
    }

    public static void j(final Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                d.a(context);
            } else {
                com.anythink.core.common.d.t.b().b(new Runnable() { // from class: com.anythink.expressad.foundation.h.n.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a(context);
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    public static String c() {
        if (com.anythink.core.common.d.t.b().c("model")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            return Build.MANUFACTURER + " " + Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    private static int m() {
        return f19815l;
    }

    public static String d() {
        if (com.anythink.core.common.d.t.b().c("os_vc")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            if (TextUtils.isEmpty(f19810f)) {
                f19810f = String.valueOf(e());
            }
            return f19810f;
        } catch (Exception unused) {
            return "";
        }
    }

    private static UUID l() {
        try {
            return UUID.randomUUID();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String f() {
        Context g9;
        long a9;
        long n9;
        String str;
        String str2;
        String str3 = "";
        try {
            g9 = com.anythink.core.common.d.t.b().g();
            a9 = m.a();
            n9 = n();
            str = "app_tki_" + a9 + "_" + n9 + "_";
            str2 = (String) x.b(g9, str, "");
            try {
            } catch (Exception e6) {
                e = e6;
                str3 = str2;
                e.printStackTrace();
                return str3;
            }
        } catch (Exception e9) {
            e = e9;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("1", "");
            jSONObject.put("2", String.valueOf(n9));
            jSONObject.put("3", String.valueOf(a9));
            jSONObject.put("4", "");
            jSONObject.put("5", "");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        str3 = a.a(jSONObject.toString());
        x.a(g9, str, str3);
        return str3;
    }

    public static int g() {
        if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
            return 0;
        }
        if (f19806b <= 0) {
            try {
                Context g9 = com.anythink.core.common.d.t.b().g();
                long longValue = ((Long) x.b(g9, "TotalRamSize", 0L)).longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - longValue > 1800000 || f19806b == -1) {
                    f19806b = Long.valueOf((n() / 1000) / 1000).intValue();
                    x.a(g9, "TotalRamSize", Long.valueOf(currentTimeMillis));
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return f19806b;
    }

    private static String a(String str, Context context) {
        try {
        } catch (Exception e6) {
            e6.getMessage();
        }
        if (!TextUtils.isEmpty(f19816m)) {
            return f19816m;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            f19816m = context.getPackageManager().getInstallerPackageName(str);
        }
        return f19816m;
    }

    public static int e() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e6) {
            e6.printStackTrace();
            return 0;
        }
    }

    public static String i() {
        String obj;
        if (TextUtils.isEmpty(f19818o)) {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                obj = "";
            } else {
                obj = Arrays.asList(Build.SUPPORTED_ABIS).toString();
            }
            f19818o = obj;
        }
        return f19818o;
    }

    public static int k() {
        try {
            if (!TextUtils.equals("1", com.anythink.core.common.v.m.w(com.anythink.core.common.d.t.b().g()))) {
                if (TextUtils.equals("1", com.anythink.core.common.v.m.v(com.anythink.core.common.d.t.b().g()))) {
                    f19819p = 2;
                } else {
                    f19819p = 0;
                }
            } else {
                f19819p = 1;
            }
        } catch (Exception e6) {
            f19819p = 0;
            e6.getMessage();
        }
        return f19819p;
    }

    public static int h() {
        try {
        } catch (Throwable th) {
            th.getMessage();
        }
        if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
            return 0;
        }
        Context g9 = com.anythink.core.common.d.t.b().g();
        long j9 = 0;
        long longValue = ((Long) x.b(g9, "FreeRamSize", 0L)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longValue > 1800000 || f19807c == -1) {
            Context g10 = com.anythink.core.common.d.t.b().g();
            if (g10 != null) {
                ActivityManager activityManager = (ActivityManager) g10.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                j9 = memoryInfo.availMem;
            }
            f19807c = Long.valueOf((j9 / 1000) / 1000).intValue();
            x.a(g9, "FreeRamSize", Long.valueOf(currentTimeMillis));
        }
        return f19807c;
    }

    private static long n() {
        Context g9 = com.anythink.core.common.d.t.b().g();
        if (g9 == null) {
            return 0L;
        }
        ActivityManager activityManager = (ActivityManager) g9.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
