package com.anythink.core.common.v;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.common.c.h;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.u;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import o2.C4783a;
import o2.C4784b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {

    /* renamed from: K, reason: collision with root package name */
    private static String f16790K = null;

    /* renamed from: L, reason: collision with root package name */
    private static String f16791L = null;

    /* renamed from: M, reason: collision with root package name */
    private static String f16792M = null;

    /* renamed from: N, reason: collision with root package name */
    private static String f16793N = null;

    /* renamed from: O, reason: collision with root package name */
    private static String f16794O = null;

    /* renamed from: P, reason: collision with root package name */
    private static String f16795P = null;

    /* renamed from: Q, reason: collision with root package name */
    private static String f16796Q = null;

    /* renamed from: R, reason: collision with root package name */
    private static String f16797R = null;

    /* renamed from: S, reason: collision with root package name */
    private static String f16798S = null;

    /* renamed from: T, reason: collision with root package name */
    private static String f16799T = null;

    /* renamed from: U, reason: collision with root package name */
    private static String f16800U = null;

    /* renamed from: V, reason: collision with root package name */
    private static String f16801V = null;

    /* renamed from: W, reason: collision with root package name */
    private static String f16802W = null;

    /* renamed from: X, reason: collision with root package name */
    private static String f16803X = null;
    private static String Y = null;

    /* renamed from: Z, reason: collision with root package name */
    private static String f16804Z = null;

    /* renamed from: a, reason: collision with root package name */
    public static String f16805a = null;
    private static String aa = null;
    private static String ab = null;
    private static String ac = null;
    private static String ad = null;
    private static String af = null;
    private static String ag = null;
    private static PackageInfo ah = null;
    private static BatteryManager al = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f16806b = null;

    /* renamed from: d, reason: collision with root package name */
    static String f16808d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String f16809e = "unknown";

    /* renamed from: f, reason: collision with root package name */
    private static final String f16810f = "m";

    /* renamed from: g, reason: collision with root package name */
    private static String f16811g;

    /* renamed from: h, reason: collision with root package name */
    private static String f16812h;

    /* renamed from: k, reason: collision with root package name */
    private static String f16814k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f16815l;

    /* renamed from: m, reason: collision with root package name */
    private static int f16816m;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f16817n;

    /* renamed from: o, reason: collision with root package name */
    private static String f16818o;

    /* renamed from: p, reason: collision with root package name */
    private static PackageInfo f16819p;
    private static final JSONObject i = new JSONObject();

    /* renamed from: j, reason: collision with root package name */
    private static String f16813j = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f16807c = "";

    /* renamed from: q, reason: collision with root package name */
    private static volatile String f16820q = null;

    /* renamed from: r, reason: collision with root package name */
    private static final Object f16821r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static volatile String f16822s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f16823t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile String f16824u = null;

    /* renamed from: v, reason: collision with root package name */
    private static String f16825v = "";

    /* renamed from: w, reason: collision with root package name */
    private static String f16826w = "";

    /* renamed from: x, reason: collision with root package name */
    private static String f16827x = "";

    /* renamed from: y, reason: collision with root package name */
    private static String f16828y = "";

    /* renamed from: z, reason: collision with root package name */
    private static int f16829z = 0;

    /* renamed from: A, reason: collision with root package name */
    private static String f16781A = "";

    /* renamed from: B, reason: collision with root package name */
    private static String f16782B = "";

    /* renamed from: C, reason: collision with root package name */
    private static String f16783C = null;

    /* renamed from: D, reason: collision with root package name */
    private static Object f16784D = new Object();

    /* renamed from: E, reason: collision with root package name */
    private static String f16785E = "";

    /* renamed from: F, reason: collision with root package name */
    private static String f16786F = "";

    /* renamed from: G, reason: collision with root package name */
    private static int f16787G = -1;

    /* renamed from: H, reason: collision with root package name */
    private static int f16788H = -1;

    /* renamed from: I, reason: collision with root package name */
    private static int f16789I = -1;
    private static int J = -1;
    private static String ae = "";
    private static int ai = -999;
    private static int aj = -1;
    private static double ak = 0.0d;
    private static int am = -1;
    private static volatile String an = null;
    private static volatile String ao = null;
    private static final Object ap = new Object();
    private static final Object aq = new Object();

    /* renamed from: com.anythink.core.common.v.m$1, reason: invalid class name */
    public class AnonymousClass1 implements h.a {
        @Override // com.anythink.core.common.c.h.a
        public final void a(PackageInfo packageInfo) {
            synchronized (m.f16784D) {
                if (packageInfo != null) {
                    try {
                        String unused = m.f16783C = packageInfo.versionName;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: com.anythink.core.common.v.m$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16832a;

        public AnonymousClass3(Context context) {
            this.f16832a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebView webView = new WebView(this.f16832a);
            p.a(webView);
            String unused = m.f16822s = webView.getSettings().getUserAgentString();
        }
    }

    private m() {
    }

    public static String A(Context context) {
        return k("battery") ? "" : v.f(context);
    }

    public static String B() {
        if (N()) {
            return "";
        }
        if (f16803X == null) {
            try {
                f16803X = Build.VERSION.INCREMENTAL;
            } catch (Throwable unused) {
                f16803X = "";
            }
        }
        String str = f16803X;
        if (str == null) {
            f16803X = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return f16803X;
    }

    public static String C() {
        if (N()) {
            return "";
        }
        if (Y == null) {
            try {
                Y = Build.SERIAL;
            } catch (Throwable unused) {
                Y = "";
            }
        }
        String str = Y;
        if (str == null) {
            Y = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return Y;
    }

    public static String D() {
        if (N()) {
            return "";
        }
        if (f16804Z == null) {
            try {
                f16804Z = Build.DISPLAY;
            } catch (Throwable unused) {
                f16804Z = "";
            }
        }
        String str = f16804Z;
        if (str == null) {
            f16804Z = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return f16804Z;
    }

    public static String E() {
        if (N()) {
            return "";
        }
        if (aa == null) {
            try {
                aa = "1";
            } catch (Throwable unused) {
                aa = "";
            }
        }
        return aa;
    }

    public static String F() {
        if (N()) {
            return "";
        }
        if (ab == null) {
            try {
                ab = Build.BOARD;
            } catch (Throwable unused) {
                ab = "";
            }
        }
        String str = ab;
        if (str == null) {
            ab = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return ab;
    }

    private static String G(Context context) {
        String d2;
        if (context == null) {
            return "";
        }
        try {
            d2 = d(context);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(d2)) {
            return "";
        }
        if (TextUtils.isEmpty(f16808d)) {
            f16808d = o.b(d2);
        }
        return f16808d;
    }

    private static int H(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return -1;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || !q.a("android.permission.ACCESS_NETWORK_STATE", context) || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            if (activeNetworkInfo.getType() == 1) {
                return -2;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return -1;
            }
            return telephonyManager.getNetworkType();
        } catch (Throwable unused) {
        }
        return -1;
    }

    private static void I(Context context) {
        com.anythink.core.common.d.t.b();
        synchronized (f16784D) {
            try {
                if (f16783C == null) {
                    String str = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                    f16783C = str;
                    if (str == null) {
                        f16783C = "";
                    }
                }
            } catch (Throwable unused) {
                f16783C = "";
            }
        }
    }

    private static int L() {
        return Build.VERSION.SDK_INT;
    }

    private static void M() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.anythink.core.common.c.a(j.t.f12558a, "hw_ver"));
        arrayList.add(new com.anythink.core.common.c.a(j.t.f12559b, "hw_hms_ver"));
        arrayList.add(new com.anythink.core.common.c.a(j.t.f12565h, "mi_global_ver"));
        com.anythink.core.common.c.b.a().a(arrayList);
    }

    private static boolean N() {
        Context g4 = com.anythink.core.common.d.t.b().g();
        return !com.anythink.core.common.d.v.a(g4).b() || J(g4) || com.anythink.core.common.d.t.b().c("device_minor_data_deny");
    }

    private static void O() {
    }

    private static void P() {
    }

    private static int a(int i6) {
        if (i6 == 20) {
            return 16;
        }
        switch (i6) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 1;
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
                return 13;
            default:
                return -1;
        }
    }

    public static String b(Context context) {
        if (com.anythink.core.common.d.t.b().c("mcc")) {
            return "";
        }
        if (context == null) {
            com.anythink.core.common.d.t.b().g();
        }
        try {
            return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : f16785E;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context) {
        if (com.anythink.core.common.d.t.b().c("mnc")) {
            return "";
        }
        if (context == null) {
            com.anythink.core.common.d.t.b().g();
        }
        try {
            return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : f16786F;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(Context context) {
        if (com.anythink.core.common.d.t.b().c("android_id") || !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
            return "";
        }
        if (f16820q != null) {
            return f16820q;
        }
        com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
        if (c9 != null) {
            if (context == null) {
                context = com.anythink.core.common.d.t.b().g();
            }
            synchronized (f16821r) {
                try {
                    if (f16820q != null) {
                        return f16820q;
                    }
                    String c10 = af.c(context, u.b.f12847a, u.a.f12827f, "");
                    f16820q = c10;
                    if (TextUtils.isEmpty(c10)) {
                        f16820q = c9.getAid(context);
                        if (!TextUtils.isEmpty(f16820q)) {
                            af.b(context, u.b.f12847a, u.a.f12827f, f16820q);
                        }
                    }
                    if (f16820q == null) {
                        f16820q = "";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16820q;
    }

    public static String e(Context context) {
        if (com.anythink.core.common.d.t.b().c("language")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            if (!TextUtils.isEmpty(f16781A)) {
                return f16781A;
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            f16781A = language;
            return language;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String i(Context context) {
        if (com.anythink.core.common.d.t.b().c("app_vn")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        try {
            if (!TextUtils.isEmpty(f16828y)) {
                return f16828y;
            }
            String str = B(context).versionName;
            f16828y = str;
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int j(Context context) {
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int k(Context context) {
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static String l(Context context) {
        if (com.anythink.core.common.d.t.b().c("screen")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            return j(context) + "*" + k(context);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String m(Context context) {
        if (com.anythink.core.common.d.t.b().c("package_name")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        try {
            if (!TextUtils.isEmpty(f16827x)) {
                return f16827x;
            }
            String str = B(context).packageName;
            f16827x = str;
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String n(Context context) {
        if (com.anythink.core.common.d.t.b().c("it_src")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        try {
            if (!TextUtils.isEmpty(f16805a)) {
                return f16805a;
            }
            String installerPackageName = context.getPackageManager().getInstallerPackageName(m(context));
            f16805a = installerPackageName;
            return installerPackageName;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String o(Context context) {
        if (com.anythink.core.common.d.t.b().c("network_type")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            if (context == null) {
                return "-1";
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    return "-1";
                }
                if (q.a("android.permission.ACCESS_NETWORK_STATE", context)) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        return "-1";
                    }
                    int i6 = 1;
                    if (activeNetworkInfo.getType() == 1) {
                        return "-2";
                    }
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager == null) {
                            return "-3";
                        }
                        int networkType = telephonyManager.getNetworkType();
                        StringBuilder sb = new StringBuilder();
                        if (networkType != 20) {
                            switch (networkType) {
                                case 1:
                                case 2:
                                case 4:
                                case 7:
                                case 11:
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                case 8:
                                case 9:
                                case 10:
                                case 12:
                                case 14:
                                case 15:
                                    i6 = 3;
                                    break;
                                case 13:
                                    i6 = 13;
                                    break;
                                default:
                                    i6 = -1;
                                    break;
                            }
                        } else {
                            i6 = 16;
                        }
                        sb.append(i6);
                        return sb.toString();
                    } catch (Throwable unused) {
                    }
                }
                return "-3";
            } catch (Throwable unused2) {
                return "-1";
            }
        } catch (Exception unused3) {
            return "";
        }
    }

    public static String p(Context context) {
        synchronized (f16784D) {
            try {
                String str = f16783C;
                if (str != null) {
                    if (str == null) {
                        f16783C = "";
                    }
                    return f16783C;
                }
                com.anythink.core.common.d.t.b();
                try {
                    String str2 = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                    f16783C = str2;
                    if (str2 == null) {
                        f16783C = "";
                    }
                    return f16783C;
                } catch (Exception unused) {
                    f16783C = "";
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String q(Context context) {
        if (TextUtils.isEmpty(f16806b)) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            f16806b = String.valueOf(displayMetrics.density);
        }
        return f16806b;
    }

    public static void r(Context context) {
        try {
            f16822s = WebSettings.getDefaultUserAgent(context);
            af.b(context, u.b.f12847a, u.a.f12837q, f16822s);
            af.b(context, u.b.f12847a, u.a.f12838r, Build.VERSION.RELEASE);
        } catch (Throwable unused) {
        }
    }

    public static synchronized void s(Context context) {
        synchronized (m.class) {
            try {
                if (TextUtils.isEmpty(com.anythink.core.common.d.t.b().B())) {
                    com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
                    String uniqueId = c9 != null ? c9.getUniqueId(context) : "";
                    if (TextUtils.isEmpty(uniqueId)) {
                        uniqueId = t(context);
                    }
                    if (TextUtils.isEmpty(uniqueId) || Pattern.matches("^[0-]+$", uniqueId)) {
                        uniqueId = o();
                    }
                    if (TextUtils.isEmpty(uniqueId)) {
                        uniqueId = d(context);
                    }
                    if (TextUtils.isEmpty(uniqueId)) {
                        uniqueId = UUID.randomUUID().toString();
                    }
                    com.anythink.core.common.d.t.b().l(o.a(uniqueId));
                    com.anythink.core.common.u.e.a("", "3", "", String.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized String t(final Context context) {
        synchronized (m.class) {
            if (com.anythink.core.common.d.t.b().c("gaid")) {
                return "";
            }
            String f3 = f();
            if (!TextUtils.isEmpty(f3)) {
                return f3;
            }
            final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
            final String[] strArr = new String[1];
            newFixedThreadPool.submit(new Runnable() { // from class: com.anythink.core.common.v.m.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        try {
                            Object invoke = C4784b.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                            strArr[0] = (String) C4783a.class.getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
                        } catch (Throwable unused) {
                            strArr[0] = new com.anythink.core.common.d.e().a(context).a();
                        }
                    } catch (Exception unused2) {
                    }
                    if (!TextUtils.isEmpty(strArr[0]) && !m.i(strArr[0])) {
                        m.a(strArr[0]);
                    }
                    try {
                        synchronized (newFixedThreadPool) {
                            newFixedThreadPool.notifyAll();
                        }
                    } catch (Throwable unused3) {
                    }
                }
            });
            try {
                synchronized (newFixedThreadPool) {
                    newFixedThreadPool.wait(com.anythink.basead.exoplayer.i.a.f7883f);
                }
                newFixedThreadPool.shutdown();
                String str = strArr[0];
                return str != null ? str : "";
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public static int u(Context context) {
        if (f16787G == -1) {
            f16787G = q.a(context, com.anythink.expressad.foundation.g.a.bG) ? 1 : 0;
        }
        return f16787G;
    }

    public static String v(Context context) {
        return k("isagent") ? "" : v.a(context);
    }

    public static String w(Context context) {
        return J(context) ? "" : v.c(context);
    }

    public static String x(Context context) {
        if (f16792M == null) {
            synchronized (v.class) {
                try {
                    if (f16792M == null) {
                        f16792M = v.d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16792M;
    }

    public static String y(Context context) {
        if (f16793N == null) {
            synchronized (v.class) {
                try {
                    if (f16793N == null) {
                        f16793N = v.e(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16793N;
    }

    public static String z(Context context) {
        return v.b(context);
    }

    private static boolean J(Context context) {
        return !com.anythink.core.d.d.a(context).b(com.anythink.core.common.d.t.b().p()).aB();
    }

    private static PackageInfo K(Context context) {
        if (ah == null) {
            try {
                ah = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            } catch (Throwable unused) {
            }
        }
        return ah;
    }

    public static void a(Context context) {
        try {
            d();
            m(context);
            i(context);
            h(context);
            f(context);
            a();
            b();
            d(context);
            f();
            e(context);
            c();
            I(context);
            C(context);
            D(context);
            E(context);
            F(context);
            if (q.a("android.permission.READ_PHONE_STATE", context)) {
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (q.b(simOperator) && simOperator.length() > 3) {
                    f16785E = simOperator.substring(0, 3);
                    f16786F = simOperator.substring(3, simOperator.length());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.anythink.core.common.c.a(j.t.f12558a, "hw_ver"));
            arrayList.add(new com.anythink.core.common.c.a(j.t.f12559b, "hw_hms_ver"));
            arrayList.add(new com.anythink.core.common.c.a(j.t.f12565h, "mi_global_ver"));
            com.anythink.core.common.c.b.a().a(arrayList);
            q();
            r();
            x(context);
            y(context);
            s();
            t();
            u();
            v();
            w();
            x();
            y();
            z();
            A();
            B();
            C();
            D();
            E();
            F();
        } catch (Exception unused) {
        }
    }

    public static int f(Context context) {
        if (com.anythink.core.common.d.t.b().c("orient")) {
            return 0;
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        return context.getResources().getConfiguration().orientation == 2 ? 2 : 1;
    }

    public static boolean g(Context context) {
        return f(context) == 2;
    }

    public static String h(Context context) {
        if (com.anythink.core.common.d.t.b().c("app_vc")) {
            return "";
        }
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        if (f16829z != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f16829z);
            return sb.toString();
        }
        try {
            f16829z = B(context).versionCode;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f16829z);
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String z() {
        if (N()) {
            return "";
        }
        if (f16801V == null) {
            try {
                f16801V = Build.HOST;
            } catch (Throwable unused) {
                f16801V = "";
            }
        }
        String str = f16801V;
        if (str == null) {
            f16801V = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return f16801V;
    }

    public static JSONObject g() {
        try {
            return new JSONObject(f16813j);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static String A() {
        if (N()) {
            return "";
        }
        if (f16802W == null) {
            try {
                f16802W = Build.VERSION.CODENAME;
            } catch (Throwable unused) {
                f16802W = "";
            }
        }
        String str = f16802W;
        if (str == null) {
            f16802W = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return f16802W;
    }

    public static String j() {
        if (f16824u != null) {
            return f16824u;
        }
        if (com.anythink.core.common.d.t.b().c(com.anythink.core.common.m.e.bw)) {
            return "";
        }
        if (f16824u == null) {
            synchronized (f16823t) {
                if (f16824u == null) {
                    try {
                        f16824u = System.getProperty("http.agent");
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (f16824u == null) {
            f16824u = "";
        }
        return f16824u;
    }

    public static String k() {
        if (!TextUtils.isEmpty(f16807c)) {
            return f16807c;
        }
        String O8 = com.anythink.core.common.d.t.b().O();
        if (!TextUtils.isEmpty(O8)) {
            f16807c = O8;
            return O8;
        }
        String O9 = com.anythink.core.common.d.t.b().O();
        if (TextUtils.isEmpty(O9)) {
            try {
                Class.forName("com.unity3d.player.UnityPlayer");
                O9 = "2";
            } catch (Throwable unused) {
                O9 = "1";
            }
            try {
                Class.forName("org.cocos2dx.lib.Cocos2dxActivity");
                Class.forName("org.cocos2dx.lib.Cocos2dxJavascriptJavaBridge");
                O9 = "4";
            } catch (Throwable unused2) {
            }
            try {
                Class.forName("com.facebook.react.ReactActivity");
                O9 = "5";
            } catch (Throwable unused3) {
            }
            try {
                Class.forName("io.flutter.embedding.android.FlutterActivity");
                O9 = "6";
            } catch (Throwable unused4) {
            }
        }
        f16807c = O9;
        return O9;
    }

    public static String u() {
        if (N()) {
            return "";
        }
        if (TextUtils.isEmpty(f16796Q)) {
            try {
                f16796Q = Build.TAGS;
            } catch (Throwable unused) {
            }
        }
        String str = f16796Q;
        if (str == null) {
            f16796Q = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return f16796Q;
    }

    public static String v() {
        if (N()) {
            return "";
        }
        if (f16797R == null) {
            try {
                f16797R = Build.USER;
            } catch (Throwable unused) {
                f16797R = "";
            }
        }
        String str = f16797R;
        if (str == null) {
            f16797R = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return f16797R;
    }

    public static String w() {
        if (N()) {
            return "";
        }
        if (f16798S == null) {
            try {
                f16798S = Build.RADIO;
            } catch (Throwable unused) {
                f16798S = "";
            }
        }
        String str = f16798S;
        if (str == null) {
            f16798S = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return f16798S;
    }

    public static String b() {
        if (com.anythink.core.common.d.t.b().c("brand")) {
            return "";
        }
        try {
            return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : Build.BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c() {
        if (com.anythink.core.common.d.t.b().c("timezone")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            try {
                if (TextUtils.isEmpty(f16782B)) {
                    String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                    f16782B = displayName;
                    return displayName;
                }
            } catch (Throwable unused) {
            }
            return f16782B;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static int l() {
        if (f16788H == -1) {
            try {
                Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
                Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
                f16788H = 1;
            } catch (Throwable unused) {
                f16788H = 0;
            }
        }
        return f16788H;
    }

    public static String r() {
        if (k("isroot")) {
            return "";
        }
        if (f16791L == null) {
            synchronized (v.class) {
                try {
                    if (f16791L == null) {
                        f16791L = v.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16791L;
    }

    public static double E(Context context) {
        if (k("battery")) {
            return 0.0d;
        }
        double d2 = ak;
        if (d2 != 0.0d) {
            return d2;
        }
        if (al == null) {
            al = (BatteryManager) context.getSystemService("batterymanager");
        }
        if (al != null) {
            double intProperty = r5.getIntProperty(4) / 100.0d;
            ak = intProperty;
            return intProperty;
        }
        return ak;
    }

    public static String f() {
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            if (f16812h == null) {
                f16812h = af.c(com.anythink.core.common.d.t.b().g(), u.b.f12847a, u.a.f12825d, "");
            }
            return f16812h;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String G() {
        return f16818o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
    
        if (com.anythink.core.common.v.m.an == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a9, code lost:
    
        com.anythink.core.common.v.m.an = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        return com.anythink.core.common.v.m.an;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (com.anythink.core.common.v.m.an == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b2, code lost:
    
        if (com.anythink.core.common.v.m.an != null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String H() {
        String str;
        try {
            if (com.anythink.core.common.d.t.b().c("ip_v4")) {
                str = "";
            } else if (an != null) {
                str = an;
                if (an != null) {
                    return str;
                }
            } else {
                if (!ATSDKGlobalSetting.enableGetDeviceInfoInBg) {
                    com.anythink.core.common.d.t.b();
                    if (!com.anythink.core.common.d.t.c(com.anythink.core.common.d.t.b().g())) {
                        str = an;
                        if (an != null) {
                            return str;
                        }
                    }
                }
                synchronized (ap) {
                    if (an != null) {
                        String str2 = an;
                        if (an == null) {
                            an = "";
                        }
                        return str2;
                    }
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                            if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                                String hostAddress = inetAddress.getHostAddress();
                                if (!TextUtils.isEmpty(hostAddress)) {
                                    an = hostAddress;
                                }
                            }
                        }
                    }
                    if (an == null) {
                        an = "";
                    }
                }
            }
            an = "";
            return str;
        } catch (Throwable unused) {
        }
    }

    public static synchronized String i() {
        synchronized (m.class) {
            if (!TextUtils.isEmpty(f16822s)) {
                return f16822s;
            }
            if (f16822s == null) {
                String c9 = af.c(com.anythink.core.common.d.t.b().g(), u.b.f12847a, u.a.f12837q, "");
                f16822s = c9;
                if (!TextUtils.isEmpty(c9)) {
                    return f16822s;
                }
            }
            return null;
        }
    }

    public static String m() {
        Object obj;
        String d2 = com.anythink.core.common.d.t.b().d();
        if (!TextUtils.isEmpty(d2)) {
            return d2;
        }
        try {
            Map<String, Object> m4 = com.anythink.core.common.d.t.b().m();
            if (m4 != null && (obj = m4.get(ATAdConst.KEY.WECHAT_APPID)) != null) {
                return obj.toString();
            }
        } catch (Throwable unused) {
        }
        com.anythink.core.d.b g4 = D.y.g(D.y.h());
        if (g4 != null) {
            return g4.aX();
        }
        return null;
    }

    public static int n() {
        int i6 = f16789I;
        if (i6 != -1) {
            return i6;
        }
        f16789I = 0;
        try {
            f16789I = ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable unused) {
        }
        return f16789I;
    }

    public static String q() {
        if (k("cpu")) {
            return "";
        }
        if (f16790K == null) {
            synchronized (v.class) {
                try {
                    if (f16790K == null) {
                        f16790K = v.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16790K;
    }

    public static String x() {
        if (N()) {
            return "";
        }
        if (f16799T == null) {
            try {
                f16799T = Build.BOOTLOADER;
            } catch (Throwable unused) {
                f16799T = "";
            }
        }
        String str = f16799T;
        if (str == null) {
            f16799T = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return f16799T;
    }

    public static String y() {
        if (N()) {
            return "";
        }
        if (f16800U == null) {
            try {
                f16800U = Build.HARDWARE;
            } catch (Throwable unused) {
                f16800U = "";
            }
        }
        String str = f16800U;
        if (str == null) {
            f16800U = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return f16800U;
    }

    public static String b(String str) {
        try {
            return i.getString(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static synchronized String h() {
        synchronized (m.class) {
            if (com.anythink.core.common.d.t.b().c("ua")) {
                return "";
            }
            try {
                if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                    return "";
                }
                String i6 = i();
                if (!TextUtils.isEmpty(i6)) {
                    return i6;
                }
                String str = Build.VERSION.RELEASE;
                String a9 = a();
                String str2 = Build.ID;
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(a9) && !TextUtils.isEmpty(str2)) {
                    return "Mozilla/5.0 (Linux; Android " + str + "; " + a9 + " Build/" + str2 + ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public static PackageInfo B(Context context) {
        if (f16819p == null) {
            try {
                f16819p = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Throwable unused) {
            }
        }
        return f16819p;
    }

    public static int C(Context context) {
        try {
        } catch (Throwable unused) {
            ai = -1;
        }
        if (!k("s_c") && !J(context)) {
            int i6 = ai;
            if (i6 != -999) {
                return i6;
            }
            if (q.a("android.permission.READ_PHONE_STATE", context)) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    if (telephonyManager.getSimState() == 5) {
                        ai = 2;
                    } else if (telephonyManager.getSimState() == 1) {
                        ai = 1;
                    } else {
                        ai = -1;
                    }
                } else {
                    ai = -1;
                }
            } else {
                ai = -1;
            }
            return ai;
        }
        return -1;
    }

    public static int D(Context context) {
        if (com.anythink.core.common.d.t.b().c("u_a")) {
            return -1;
        }
        int i6 = ai;
        if (i6 != -1) {
            return i6;
        }
        if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
            aj = 2;
        } else {
            aj = 1;
        }
        return aj;
    }

    public static int F(Context context) {
        if (com.anythink.core.common.d.t.b().c("d_s")) {
            return -1;
        }
        int i6 = am;
        if (i6 != -1) {
            return i6;
        }
        if (Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
            am = 2;
        } else {
            am = 1;
        }
        return am;
    }

    public static String e() {
        if (com.anythink.core.common.d.t.b().c("os_vn")) {
            return "";
        }
        if (TextUtils.isEmpty(f16825v)) {
            f16825v = Build.VERSION.RELEASE;
        }
        return f16825v;
    }

    public static PackageInfo b(Context context, String str) {
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
    
        if (com.anythink.core.common.v.m.ao == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a9, code lost:
    
        com.anythink.core.common.v.m.ao = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        return com.anythink.core.common.v.m.ao;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (com.anythink.core.common.v.m.ao == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b2, code lost:
    
        if (com.anythink.core.common.v.m.ao != null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String I() {
        String str;
        try {
            if (com.anythink.core.common.d.t.b().c("ip_v6")) {
                str = "";
            } else if (ao != null) {
                str = ao;
                if (ao != null) {
                    return str;
                }
            } else {
                if (!ATSDKGlobalSetting.enableGetDeviceInfoInBg) {
                    com.anythink.core.common.d.t.b();
                    if (!com.anythink.core.common.d.t.c(com.anythink.core.common.d.t.b().g())) {
                        str = ao;
                        if (ao != null) {
                            return str;
                        }
                    }
                }
                synchronized (aq) {
                    if (ao != null) {
                        String str2 = ao;
                        if (ao == null) {
                            ao = "";
                        }
                        return str2;
                    }
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                            if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet6Address)) {
                                String hostAddress = inetAddress.getHostAddress();
                                if (!TextUtils.isEmpty(hostAddress)) {
                                    ao = hostAddress;
                                }
                            }
                        }
                    }
                    if (ao == null) {
                        ao = "";
                    }
                }
            }
            ao = "";
            return str;
        } catch (Throwable unused) {
        }
    }

    public static int c(String str) {
        int i6 = J;
        if (i6 != -1) {
            return i6;
        }
        J = 0;
        try {
            J = ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", new Class[0]).invoke(d(str), new Object[0])).intValue();
        } catch (Throwable unused) {
        }
        return J;
    }

    public static String o() {
        if (com.anythink.core.common.d.t.b().c("amazon_id") || !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
            return "";
        }
        if (f16814k == null) {
            f16814k = af.c(com.anythink.core.common.d.t.b().g(), u.b.f12847a, u.a.f12826e, "");
        }
        if (TextUtils.isEmpty(f16814k) && !f16815l) {
            try {
                f16815l = true;
                String string = Settings.Secure.getString(com.anythink.core.common.d.t.b().g().getContentResolver(), "advertising_id");
                f16814k = string;
                if (!TextUtils.isEmpty(string)) {
                    af.b(com.anythink.core.common.d.t.b().g(), u.b.f12847a, u.a.f12826e, f16814k);
                } else {
                    f16814k = "";
                }
            } catch (Throwable unused) {
            }
        }
        return f16814k;
    }

    public static void e(String str) {
        f16818o = str;
    }

    public static /* synthetic */ boolean i(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    public static int p() {
        if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
            return -1;
        }
        if (f16816m <= 0 && !f16817n) {
            int i6 = 1;
            try {
                f16817n = true;
                if (Settings.Secure.getInt(com.anythink.core.common.d.t.b().g().getContentResolver(), "limit_ad_tracking") != 0) {
                    i6 = 2;
                }
                f16816m = i6;
            } catch (Throwable unused) {
                f16816m = -1;
            }
        }
        return f16816m;
    }

    private static boolean j(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    public static String t() {
        if (N()) {
            return "";
        }
        if (f16795P == null) {
            try {
                f16795P = Build.TYPE;
            } catch (Throwable unused) {
            }
        }
        String str = f16795P;
        if (str == null) {
            f16795P = "";
        } else if (f16809e.equals(str)) {
            return "";
        }
        return f16795P;
    }

    public static String s() {
        if (k(com.anythink.core.common.m.e.aO)) {
            return "";
        }
        if (f16794O == null) {
            f16794O = q.a() ? "1" : "0";
        }
        return f16794O;
    }

    public static String c(Context context, String str) {
        Signature[] signatureArr;
        Signature signature;
        if (com.anythink.core.common.d.t.b().c(str)) {
            return "";
        }
        if (!TextUtils.isEmpty(af)) {
            return af;
        }
        try {
            PackageInfo K7 = K(context);
            if (K7 != null && (signatureArr = K7.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
                byte[] digest = MessageDigest.getInstance(k.b("U0hBMQ==")).digest(signature.toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b9 : digest) {
                    sb.append(Integer.toHexString((b9 & 255) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                String substring = sb.substring(0, sb.length() - 1);
                af = substring;
                return substring;
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return "";
    }

    public static String d() {
        if (com.anythink.core.common.d.t.b().c("os_vc")) {
            return "";
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
                return "";
            }
            if (TextUtils.isEmpty(f16826w)) {
                f16826w = String.valueOf(Build.VERSION.SDK_INT);
            }
            return f16826w;
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean k(String str) {
        return com.anythink.core.common.d.t.b().c(str) || !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b();
    }

    public static Object d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, com.anythink.core.common.d.t.b().g(), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String d(Context context, String str) {
        Signature[] signatureArr;
        Signature signature;
        if (com.anythink.core.common.d.t.b().c(str)) {
            return "";
        }
        if (!TextUtils.isEmpty(ag)) {
            return ag;
        }
        try {
            PackageInfo K7 = K(context);
            if (K7 != null && (signatureArr = K7.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
                byte[] digest = MessageDigest.getInstance(k.b("TUQ1")).digest(signature.toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b9 : digest) {
                    sb.append(Integer.toHexString((b9 & 255) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                String substring = sb.substring(0, sb.length() - 1);
                ag = substring;
                return substring;
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return "";
    }

    public static String a() {
        if (com.anythink.core.common.d.t.b().c("model")) {
            return "";
        }
        try {
            return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(String str) {
        f16812h = str;
        af.b(com.anythink.core.common.d.t.b().g(), u.b.f12847a, u.a.f12825d, f16812h);
    }

    public static void a(final int i6, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.v.m.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (m.i) {
                    if (m.i.has(String.valueOf(i6))) {
                        return;
                    }
                    try {
                        m.i.put(String.valueOf(i6), str);
                        String unused = m.f16813j = m.i.toString();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }, 13);
    }

    public static String a(Context context, String str) {
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                StringBuilder sb = new StringBuilder();
                sb.append(packageInfo.versionCode);
                return sb.toString();
            } catch (Throwable unused) {
                return "";
            }
        }
        return "";
    }
}
