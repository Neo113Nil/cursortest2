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
import o2.C4828a;
import o2.C4829b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {

    /* renamed from: K, reason: collision with root package name */
    private static String f16948K = null;

    /* renamed from: L, reason: collision with root package name */
    private static String f16949L = null;

    /* renamed from: M, reason: collision with root package name */
    private static String f16950M = null;

    /* renamed from: N, reason: collision with root package name */
    private static String f16951N = null;

    /* renamed from: O, reason: collision with root package name */
    private static String f16952O = null;

    /* renamed from: P, reason: collision with root package name */
    private static String f16953P = null;

    /* renamed from: Q, reason: collision with root package name */
    private static String f16954Q = null;

    /* renamed from: R, reason: collision with root package name */
    private static String f16955R = null;

    /* renamed from: S, reason: collision with root package name */
    private static String f16956S = null;

    /* renamed from: T, reason: collision with root package name */
    private static String f16957T = null;

    /* renamed from: U, reason: collision with root package name */
    private static String f16958U = null;

    /* renamed from: V, reason: collision with root package name */
    private static String f16959V = null;

    /* renamed from: W, reason: collision with root package name */
    private static String f16960W = null;

    /* renamed from: X, reason: collision with root package name */
    private static String f16961X = null;
    private static String Y = null;

    /* renamed from: Z, reason: collision with root package name */
    private static String f16962Z = null;

    /* renamed from: a, reason: collision with root package name */
    public static String f16963a = null;
    private static String aa = null;
    private static String ab = null;
    private static String ac = null;
    private static String ad = null;
    private static String af = null;
    private static String ag = null;
    private static PackageInfo ah = null;
    private static BatteryManager al = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f16964b = null;

    /* renamed from: d, reason: collision with root package name */
    static String f16966d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String f16967e = "unknown";

    /* renamed from: f, reason: collision with root package name */
    private static final String f16968f = "m";

    /* renamed from: g, reason: collision with root package name */
    private static String f16969g;

    /* renamed from: h, reason: collision with root package name */
    private static String f16970h;

    /* renamed from: k, reason: collision with root package name */
    private static String f16972k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f16973l;

    /* renamed from: m, reason: collision with root package name */
    private static int f16974m;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f16975n;

    /* renamed from: o, reason: collision with root package name */
    private static String f16976o;

    /* renamed from: p, reason: collision with root package name */
    private static PackageInfo f16977p;
    private static final JSONObject i = new JSONObject();

    /* renamed from: j, reason: collision with root package name */
    private static String f16971j = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f16965c = "";

    /* renamed from: q, reason: collision with root package name */
    private static volatile String f16978q = null;

    /* renamed from: r, reason: collision with root package name */
    private static final Object f16979r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static volatile String f16980s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f16981t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile String f16982u = null;

    /* renamed from: v, reason: collision with root package name */
    private static String f16983v = "";

    /* renamed from: w, reason: collision with root package name */
    private static String f16984w = "";

    /* renamed from: x, reason: collision with root package name */
    private static String f16985x = "";

    /* renamed from: y, reason: collision with root package name */
    private static String f16986y = "";

    /* renamed from: z, reason: collision with root package name */
    private static int f16987z = 0;

    /* renamed from: A, reason: collision with root package name */
    private static String f16939A = "";

    /* renamed from: B, reason: collision with root package name */
    private static String f16940B = "";

    /* renamed from: C, reason: collision with root package name */
    private static String f16941C = null;

    /* renamed from: D, reason: collision with root package name */
    private static Object f16942D = new Object();

    /* renamed from: E, reason: collision with root package name */
    private static String f16943E = "";

    /* renamed from: F, reason: collision with root package name */
    private static String f16944F = "";

    /* renamed from: G, reason: collision with root package name */
    private static int f16945G = -1;

    /* renamed from: H, reason: collision with root package name */
    private static int f16946H = -1;

    /* renamed from: I, reason: collision with root package name */
    private static int f16947I = -1;
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
            synchronized (m.f16942D) {
                if (packageInfo != null) {
                    try {
                        String unused = m.f16941C = packageInfo.versionName;
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
        final /* synthetic */ Context f16990a;

        public AnonymousClass3(Context context) {
            this.f16990a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebView webView = new WebView(this.f16990a);
            p.a(webView);
            String unused = m.f16980s = webView.getSettings().getUserAgentString();
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
        if (f16961X == null) {
            try {
                f16961X = Build.VERSION.INCREMENTAL;
            } catch (Throwable unused) {
                f16961X = "";
            }
        }
        String str = f16961X;
        if (str == null) {
            f16961X = "";
        } else if (f16967e.equals(str)) {
            return "";
        }
        return f16961X;
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
        } else if (f16967e.equals(str)) {
            return "";
        }
        return Y;
    }

    public static String D() {
        if (N()) {
            return "";
        }
        if (f16962Z == null) {
            try {
                f16962Z = Build.DISPLAY;
            } catch (Throwable unused) {
                f16962Z = "";
            }
        }
        String str = f16962Z;
        if (str == null) {
            f16962Z = "";
        } else if (f16967e.equals(str)) {
            return "";
        }
        return f16962Z;
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
        } else if (f16967e.equals(str)) {
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
        if (TextUtils.isEmpty(f16966d)) {
            f16966d = o.b(d2);
        }
        return f16966d;
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
        synchronized (f16942D) {
            try {
                if (f16941C == null) {
                    String str = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                    f16941C = str;
                    if (str == null) {
                        f16941C = "";
                    }
                }
            } catch (Throwable unused) {
                f16941C = "";
            }
        }
    }

    private static int L() {
        return Build.VERSION.SDK_INT;
    }

    private static void M() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.anythink.core.common.c.a(j.t.f12715a, "hw_ver"));
        arrayList.add(new com.anythink.core.common.c.a(j.t.f12716b, "hw_hms_ver"));
        arrayList.add(new com.anythink.core.common.c.a(j.t.f12722h, "mi_global_ver"));
        com.anythink.core.common.c.b.a().a(arrayList);
    }

    private static boolean N() {
        Context g9 = com.anythink.core.common.d.t.b().g();
        return !com.anythink.core.common.d.v.a(g9).b() || J(g9) || com.anythink.core.common.d.t.b().c("device_minor_data_deny");
    }

    private static void O() {
    }

    private static void P() {
    }

    private static int a(int i4) {
        if (i4 == 20) {
            return 16;
        }
        switch (i4) {
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
            return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : f16943E;
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
            return !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() ? "" : f16944F;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(Context context) {
        if (com.anythink.core.common.d.t.b().c("android_id") || !com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
            return "";
        }
        if (f16978q != null) {
            return f16978q;
        }
        com.anythink.core.common.d.s c4 = com.anythink.core.common.d.t.b().c();
        if (c4 != null) {
            if (context == null) {
                context = com.anythink.core.common.d.t.b().g();
            }
            synchronized (f16979r) {
                try {
                    if (f16978q != null) {
                        return f16978q;
                    }
                    String c9 = af.c(context, u.b.f13004a, u.a.f12984f, "");
                    f16978q = c9;
                    if (TextUtils.isEmpty(c9)) {
                        f16978q = c4.getAid(context);
                        if (!TextUtils.isEmpty(f16978q)) {
                            af.b(context, u.b.f13004a, u.a.f12984f, f16978q);
                        }
                    }
                    if (f16978q == null) {
                        f16978q = "";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16978q;
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
            if (!TextUtils.isEmpty(f16939A)) {
                return f16939A;
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            f16939A = language;
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
            if (!TextUtils.isEmpty(f16986y)) {
                return f16986y;
            }
            String str = B(context).versionName;
            f16986y = str;
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
            if (!TextUtils.isEmpty(f16985x)) {
                return f16985x;
            }
            String str = B(context).packageName;
            f16985x = str;
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
            if (!TextUtils.isEmpty(f16963a)) {
                return f16963a;
            }
            String installerPackageName = context.getPackageManager().getInstallerPackageName(m(context));
            f16963a = installerPackageName;
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
                    int i4 = 1;
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
                                    i4 = 3;
                                    break;
                                case 13:
                                    i4 = 13;
                                    break;
                                default:
                                    i4 = -1;
                                    break;
                            }
                        } else {
                            i4 = 16;
                        }
                        sb.append(i4);
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
        synchronized (f16942D) {
            try {
                String str = f16941C;
                if (str != null) {
                    if (str == null) {
                        f16941C = "";
                    }
                    return f16941C;
                }
                com.anythink.core.common.d.t.b();
                try {
                    String str2 = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionName;
                    f16941C = str2;
                    if (str2 == null) {
                        f16941C = "";
                    }
                    return f16941C;
                } catch (Exception unused) {
                    f16941C = "";
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String q(Context context) {
        if (TextUtils.isEmpty(f16964b)) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            f16964b = String.valueOf(displayMetrics.density);
        }
        return f16964b;
    }

    public static void r(Context context) {
        try {
            f16980s = WebSettings.getDefaultUserAgent(context);
            af.b(context, u.b.f13004a, u.a.f12994q, f16980s);
            af.b(context, u.b.f13004a, u.a.f12995r, Build.VERSION.RELEASE);
        } catch (Throwable unused) {
        }
    }

    public static synchronized void s(Context context) {
        synchronized (m.class) {
            try {
                if (TextUtils.isEmpty(com.anythink.core.common.d.t.b().B())) {
                    com.anythink.core.common.d.s c4 = com.anythink.core.common.d.t.b().c();
                    String uniqueId = c4 != null ? c4.getUniqueId(context) : "";
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
            String f6 = f();
            if (!TextUtils.isEmpty(f6)) {
                return f6;
            }
            final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
            final String[] strArr = new String[1];
            newFixedThreadPool.submit(new Runnable() { // from class: com.anythink.core.common.v.m.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        try {
                            Object invoke = C4829b.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                            strArr[0] = (String) C4828a.class.getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
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
                    newFixedThreadPool.wait(com.anythink.basead.exoplayer.i.a.f8040f);
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
        if (f16945G == -1) {
            f16945G = q.a(context, com.anythink.expressad.foundation.g.a.bG) ? 1 : 0;
        }
        return f16945G;
    }

    public static String v(Context context) {
        return k("isagent") ? "" : v.a(context);
    }

    public static String w(Context context) {
        return J(context) ? "" : v.c(context);
    }

    public static String x(Context context) {
        if (f16950M == null) {
            synchronized (v.class) {
                try {
                    if (f16950M == null) {
                        f16950M = v.d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16950M;
    }

    public static String y(Context context) {
        if (f16951N == null) {
            synchronized (v.class) {
                try {
                    if (f16951N == null) {
                        f16951N = v.e(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16951N;
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
                    f16943E = simOperator.substring(0, 3);
                    f16944F = simOperator.substring(3, simOperator.length());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.anythink.core.common.c.a(j.t.f12715a, "hw_ver"));
            arrayList.add(new com.anythink.core.common.c.a(j.t.f12716b, "hw_hms_ver"));
            arrayList.add(new com.anythink.core.common.c.a(j.t.f12722h, "mi_global_ver"));
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
        if (f16987z != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f16987z);
            return sb.toString();
        }
        try {
            f16987z = B(context).versionCode;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f16987z);
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String z() {
        if (N()) {
            return "";
        }
        if (f16959V == null) {
            try {
                f16959V = Build.HOST;
            } catch (Throwable unused) {
                f16959V = "";
            }
        }
        String str = f16959V;
        if (str == null) {
            f16959V = "";
        } else if (f16967e.equals(str)) {
            return "";
        }
        return f16959V;
    }

    public static JSONObject g() {
        try {
            return new JSONObject(f16971j);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static String A() {
        if (N()) {
            return "";
        }
        if (f16960W == null) {
            try {
                f16960W = Build.VERSION.CODENAME;
            } catch (Throwable unused) {
                f16960W = "";
            }
        }
        String str = f16960W;
        if (str == null) {
            f16960W = "";
        } else if (f16967e.equals(str)) {
            return "";
        }
        return f16960W;
    }

    public static String j() {
        if (f16982u != null) {
            return f16982u;
        }
        if (com.anythink.core.common.d.t.b().c(com.anythink.core.common.m.e.bw)) {
            return "";
        }
        if (f16982u == null) {
            synchronized (f16981t) {
                if (f16982u == null) {
                    try {
                        f16982u = System.getProperty("http.agent");
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (f16982u == null) {
            f16982u = "";
        }
        return f16982u;
    }

    public static String k() {
        if (!TextUtils.isEmpty(f16965c)) {
            return f16965c;
        }
        String O8 = com.anythink.core.common.d.t.b().O();
        if (!TextUtils.isEmpty(O8)) {
            f16965c = O8;
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
        f16965c = O9;
        return O9;
    }

    public static String u() {
        if (N()) {
            return "";
        }
        if (TextUtils.isEmpty(f16954Q)) {
            try {
                f16954Q = Build.TAGS;
            } catch (Throwable unused) {
            }
        }
        String str = f16954Q;
        if (str == null) {
            f16954Q = "";
        } else if (f16967e.equals(str)) {
            return "";
        }
        return f16954Q;
    }

    public static String v() {
        if (N()) {
            return "";
        }
        if (f16955R == null) {
            try {
                f16955R = Build.USER;
            } catch (Throwable unused) {
                f16955R = "";
            }
        }
        String str = f16955R;
        if (str == null) {
            f16955R = "";
        } else if (f16967e.equals(str)) {
            return "";
        }
        return f16955R;
    }

    public static String w() {
        if (N()) {
            return "";
        }
        if (f16956S == null) {
            try {
                f16956S = Build.RADIO;
            } catch (Throwable unused) {
                f16956S = "";
            }
        }
        String str = f16956S;
        if (str == null) {
            f16956S = "";
        } else if (f16967e.equals(str)) {
            return "";
        }
        return f16956S;
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
                if (TextUtils.isEmpty(f16940B)) {
                    String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                    f16940B = displayName;
                    return displayName;
                }
            } catch (Throwable unused) {
            }
            return f16940B;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static int l() {
        if (f16946H == -1) {
            try {
                Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
                Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
                f16946H = 1;
            } catch (Throwable unused) {
                f16946H = 0;
            }
        }
        return f16946H;
    }

    public static String r() {
        if (k("isroot")) {
            return "";
        }
        if (f16949L == null) {
            synchronized (v.class) {
                try {
                    if (f16949L == null) {
                        f16949L = v.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16949L;
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
            if (f16970h == null) {
                f16970h = af.c(com.anythink.core.common.d.t.b().g(), u.b.f13004a, u.a.f12982d, "");
            }
            return f16970h;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String G() {
        return f16976o;
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
            if (!TextUtils.isEmpty(f16980s)) {
                return f16980s;
            }
            if (f16980s == null) {
                String c4 = af.c(com.anythink.core.common.d.t.b().g(), u.b.f13004a, u.a.f12994q, "");
                f16980s = c4;
                if (!TextUtils.isEmpty(c4)) {
                    return f16980s;
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
            Map<String, Object> m8 = com.anythink.core.common.d.t.b().m();
            if (m8 != null && (obj = m8.get(ATAdConst.KEY.WECHAT_APPID)) != null) {
                return obj.toString();
            }
        } catch (Throwable unused) {
        }
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        if (k6 != null) {
            return k6.aX();
        }
        return null;
    }

    public static int n() {
        int i4 = f16947I;
        if (i4 != -1) {
            return i4;
        }
        f16947I = 0;
        try {
            f16947I = ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable unused) {
        }
        return f16947I;
    }

    public static String q() {
        if (k("cpu")) {
            return "";
        }
        if (f16948K == null) {
            synchronized (v.class) {
                try {
                    if (f16948K == null) {
                        f16948K = v.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16948K;
    }

    public static String x() {
        if (N()) {
            return "";
        }
        if (f16957T == null) {
            try {
                f16957T = Build.BOOTLOADER;
            } catch (Throwable unused) {
                f16957T = "";
            }
        }
        String str = f16957T;
        if (str == null) {
            f16957T = "";
        } else if (f16967e.equals(str)) {
            return "";
        }
        return f16957T;
    }

    public static String y() {
        if (N()) {
            return "";
        }
        if (f16958U == null) {
            try {
                f16958U = Build.HARDWARE;
            } catch (Throwable unused) {
                f16958U = "";
            }
        }
        String str = f16958U;
        if (str == null) {
            f16958U = "";
        } else if (f16967e.equals(str)) {
            return "";
        }
        return f16958U;
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
                String i4 = i();
                if (!TextUtils.isEmpty(i4)) {
                    return i4;
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
        if (f16977p == null) {
            try {
                f16977p = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Throwable unused) {
            }
        }
        return f16977p;
    }

    public static int C(Context context) {
        try {
        } catch (Throwable unused) {
            ai = -1;
        }
        if (!k("s_c") && !J(context)) {
            int i4 = ai;
            if (i4 != -999) {
                return i4;
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
        int i4 = ai;
        if (i4 != -1) {
            return i4;
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
        int i4 = am;
        if (i4 != -1) {
            return i4;
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
        if (TextUtils.isEmpty(f16983v)) {
            f16983v = Build.VERSION.RELEASE;
        }
        return f16983v;
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
        int i4 = J;
        if (i4 != -1) {
            return i4;
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
        if (f16972k == null) {
            f16972k = af.c(com.anythink.core.common.d.t.b().g(), u.b.f13004a, u.a.f12983e, "");
        }
        if (TextUtils.isEmpty(f16972k) && !f16973l) {
            try {
                f16973l = true;
                String string = Settings.Secure.getString(com.anythink.core.common.d.t.b().g().getContentResolver(), "advertising_id");
                f16972k = string;
                if (!TextUtils.isEmpty(string)) {
                    af.b(com.anythink.core.common.d.t.b().g(), u.b.f13004a, u.a.f12983e, f16972k);
                } else {
                    f16972k = "";
                }
            } catch (Throwable unused) {
            }
        }
        return f16972k;
    }

    public static void e(String str) {
        f16976o = str;
    }

    public static /* synthetic */ boolean i(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    public static int p() {
        if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b()) {
            return -1;
        }
        if (f16974m <= 0 && !f16975n) {
            int i4 = 1;
            try {
                f16975n = true;
                if (Settings.Secure.getInt(com.anythink.core.common.d.t.b().g().getContentResolver(), "limit_ad_tracking") != 0) {
                    i4 = 2;
                }
                f16974m = i4;
            } catch (Throwable unused) {
                f16974m = -1;
            }
        }
        return f16974m;
    }

    private static boolean j(String str) {
        return Pattern.matches("^[0-]+$", str);
    }

    public static String t() {
        if (N()) {
            return "";
        }
        if (f16953P == null) {
            try {
                f16953P = Build.TYPE;
            } catch (Throwable unused) {
            }
        }
        String str = f16953P;
        if (str == null) {
            f16953P = "";
        } else if (f16967e.equals(str)) {
            return "";
        }
        return f16953P;
    }

    public static String s() {
        if (k(com.anythink.core.common.m.e.aO)) {
            return "";
        }
        if (f16952O == null) {
            f16952O = q.a() ? "1" : "0";
        }
        return f16952O;
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
            PackageInfo K8 = K(context);
            if (K8 != null && (signatureArr = K8.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
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
        } catch (Exception e6) {
            e6.printStackTrace();
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
            if (TextUtils.isEmpty(f16984w)) {
                f16984w = String.valueOf(Build.VERSION.SDK_INT);
            }
            return f16984w;
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
            PackageInfo K8 = K(context);
            if (K8 != null && (signatureArr = K8.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
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
        } catch (Exception e6) {
            e6.printStackTrace();
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
        f16970h = str;
        af.b(com.anythink.core.common.d.t.b().g(), u.b.f13004a, u.a.f12982d, f16970h);
    }

    public static void a(final int i4, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.v.m.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (m.i) {
                    if (m.i.has(String.valueOf(i4))) {
                        return;
                    }
                    try {
                        m.i.put(String.valueOf(i4), str);
                        String unused = m.f16971j = m.i.toString();
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
