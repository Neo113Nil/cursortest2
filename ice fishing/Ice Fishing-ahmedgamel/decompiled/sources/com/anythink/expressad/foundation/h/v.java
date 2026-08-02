package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.anythink.expressad.foundation.d.d;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v extends g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20504a = "SameTools";

    /* renamed from: b, reason: collision with root package name */
    static List<String> f20505b;

    /* renamed from: c, reason: collision with root package name */
    private static char[] f20506c = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* renamed from: d, reason: collision with root package name */
    private static char[] f20507d = {'.', 'X'};

    /* renamed from: e, reason: collision with root package name */
    private static int f20508e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f20509f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static int f20510g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static int f20511h = 3;
    private static int i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static int f20512j = 7;

    /* renamed from: k, reason: collision with root package name */
    private static int f20513k = 14;

    /* renamed from: l, reason: collision with root package name */
    private static int f20514l = 19;

    /* renamed from: m, reason: collision with root package name */
    private static int f20515m = 16;

    /* renamed from: n, reason: collision with root package name */
    private static int f20516n = 26;

    /* renamed from: o, reason: collision with root package name */
    private static int f20517o = 1;

    public static int a(int i4) {
        if ((i4 > 100 && i4 < 199) || i4 == 2) {
            return 1;
        }
        if ((i4 <= 200 || i4 >= 299) && i4 != 4) {
            return (i4 <= 500 || i4 >= 599) ? -1 : 5;
        }
        return 2;
    }

    public static boolean b(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public static float c(Context context) {
        if (context != null) {
            try {
                float f2 = context.getResources().getDisplayMetrics().density;
                if (f2 == 0.0f) {
                    return 2.5f;
                }
                return f2;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return 2.5f;
    }

    public static int d(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0;
        }
    }

    public static int e(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return l(context).heightPixels;
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0;
        }
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return l(context).widthPixels;
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0;
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0;
        }
    }

    private static <T extends String> boolean h(T t6) {
        return t6 != null && t6.length() > 0;
    }

    public static int i(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID) != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID));
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return 0;
    }

    public static int j(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            PackageInfo currentWebViewPackage = Build.VERSION.SDK_INT >= 26 ? WebView.getCurrentWebViewPackage() : context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.foundation.b.a.c().f();
            com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
            if (b9 == null) {
                com.anythink.expressad.f.b.a();
                b9 = com.anythink.expressad.f.b.c();
            }
            if (currentWebViewPackage == null || TextUtils.isEmpty(currentWebViewPackage.versionName) || !currentWebViewPackage.versionName.equals("77.0.3865.92")) {
                return b9.O();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static boolean k(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            boolean z6 = com.anythink.expressad.a.f18405a;
            return false;
        }
    }

    private static DisplayMetrics l(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    public static <T extends String> boolean a(T t6) {
        return t6 == null || t6.length() == 0;
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0;
        }
    }

    private static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    public static String c(String str) {
        try {
            if (y.b(str)) {
                return URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bR);
            }
            return "";
        } catch (Throwable th) {
            th.getMessage();
            return "";
        }
    }

    private static <T> boolean a(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x0049
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L4f
            if (r4 == 0) goto L4b
            java.lang.String r0 = "dyview"
            java.lang.String r0 = r4.getQueryParameter(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L4f
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L4f
            if (r2 == 0) goto L24
            java.lang.String r0 = "view"
            java.lang.String r0 = r4.getQueryParameter(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L4f
            goto L24
        L21:
            r4 = move-exception
            r0 = r1
            goto L4c
        L24:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L4f
            r3 = 1
            if (r2 != 0) goto L37
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L4f
            goto L31
        L30:
            r0 = -1
        L31:
            int r0 = r0 % 2
            if (r0 != 0) goto L37
            r0 = r3
            goto L38
        L37:
            r0 = r1
        L38:
            java.lang.String r2 = "natmp"
            java.lang.String r4 = r4.getQueryParameter(r2)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L49
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L49
            if (r4 != 0) goto L45
            goto L46
        L45:
            r3 = r0
        L46:
            return r3
        L47:
            r4 = move-exception
            goto L4c
        L49:
            r1 = r0
            goto L4f
        L4b:
            return r1
        L4c:
            r4.getMessage()     // Catch: java.lang.Throwable -> L49
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.h.v.e(java.lang.String):boolean");
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(com.anythink.expressad.a.ac);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter.equals("0");
                }
            }
            return false;
        } catch (Exception e9) {
            e9.getMessage();
            return false;
        }
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter("dyview");
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = parse.getQueryParameter(com.anythink.expressad.a.f18383C);
                }
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        return Integer.parseInt(queryParameter);
                    } catch (Exception unused) {
                    }
                }
            }
            return -1;
        } catch (Exception e9) {
            e9.getMessage();
            return -1;
        }
    }

    public static int a(Context context, float f2) {
        float f9 = 2.5f;
        if (context != null) {
            try {
                float f10 = context.getResources().getDisplayMetrics().density;
                if (f10 != 0.0f) {
                    f9 = f10;
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return (int) ((f2 / f9) + 0.5f);
    }

    public static int b(Context context, float f2) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f2 * resources.getDisplayMetrics().density) + 0.5f);
    }

    private static boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(com.anythink.expressad.a.f18389I);
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (queryParameter.equals("1")) {
                        return true;
                    }
                }
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
        return false;
    }

    public static int a() {
        int i4 = f20517o;
        f20517o = i4 + 1;
        return i4;
    }

    public static double b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0d;
            }
            return Double.parseDouble(str);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0.0d;
        }
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(com.anythink.expressad.a.f18381A);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter.equals("1");
                }
            }
            return false;
        } catch (Exception e9) {
            e9.getMessage();
            return false;
        }
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    private static int j(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(com.anythink.expressad.a.f18388H);
                if (TextUtils.isEmpty(queryParameter)) {
                    return 0;
                }
                return Integer.parseInt(queryParameter);
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
        return 0;
    }

    public static boolean a(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            try {
                return dVar.O() == 1;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return false;
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static synchronized int b(Context context, String str) {
        int i4;
        synchronized (v.class) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        i4 = b(str, context) != null ? 1 : 0;
                    } catch (Exception unused) {
                        i4 = 3;
                    }
                }
            }
            if (context == null) {
                i4 = 5;
            } else {
                i4 = TextUtils.isEmpty(str) ? 2 : 4;
            }
        }
        return i4;
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        try {
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return 0;
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static double a(Double d9) {
        try {
            String format = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d9);
            if (y.b(format)) {
                return Double.parseDouble(format);
            }
            return 0.0d;
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0.0d;
        }
    }

    private static Object b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(b(f20508e))).getMethod(String.valueOf(b(f20510g)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(b(f20509f))).getMethod(String.valueOf(b(f20511h)), new Class[0]).invoke(context, new Object[0]), str, 8192);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final char[] b(int i4) {
        StringBuilder sb;
        if (i4 == 0) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(u.f20493b, f20512j)));
            sb.append(f20507d[i]);
            sb.append(String.valueOf(Arrays.copyOfRange(u.f20493b, f20512j, f20513k)));
            sb.append(f20507d[i]);
            sb.append(String.valueOf(Arrays.copyOfRange(u.f20493b, f20513k, f20515m)));
            sb.append(f20507d[i]);
            sb.append(String.valueOf(t.f20484c));
        } else if (i4 == 1) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(u.f20493b, f20512j)));
            sb.append(f20507d[i]);
            sb.append(String.valueOf(Arrays.copyOfRange(u.f20493b, f20512j, f20513k)));
            sb.append(f20507d[i]);
            sb.append(String.valueOf(Arrays.copyOfRange(u.f20493b, f20514l, f20516n)));
        } else if (i4 == 2) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(u.f20493b, f20515m, f20514l)));
            sb.append(String.valueOf(f20506c));
        } else if (i4 != 3) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(u.f20493b, f20515m, f20514l)));
            sb.append(String.valueOf(t.f20484c));
        }
        return sb.toString().toCharArray();
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setSystemUiVisibility(4102);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static List<String> a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        String optString = jSONArray.optString(i4);
                        if (y.b(optString)) {
                            arrayList.add(optString);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return null;
    }

    public static int b(String str, String str2) {
        return a(str, str2, 0);
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z6;
        synchronized (v.class) {
            z6 = false;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (b(str, context) != null) {
                            z6 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return z6;
    }

    public static String b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("device");
                if (jSONObject2 != null) {
                    if (jSONObject2.has(str2)) {
                        if (str3.equals("0")) {
                            jSONObject2.remove(str2);
                        } else {
                            jSONObject2.put(str2, str3);
                        }
                    } else if (!str3.equals("0")) {
                        jSONObject2.put(str2, str3);
                    }
                    return jSONObject.toString();
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        return str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x0025
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    private static synchronized java.lang.String a(java.lang.String r2, android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.anythink.expressad.foundation.h.v> r0 = com.anythink.expressad.foundation.h.v.class
            monitor-enter(r0)
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.util.Set r2 = r2.getQueryParameterNames()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            if (r2 == 0) goto L1d
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            if (r2 <= 0) goto L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            goto L2c
        L1b:
            r2 = move-exception
            goto L46
        L1d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.lang.String r1 = "?rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            goto L2c
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b
        L2c:
            java.lang.Object r3 = b(r4, r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            if (r3 == 0) goto L37
            r3 = 1
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            goto L40
        L37:
            r3 = 2
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            goto L40
        L3c:
            r3 = 0
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b
        L40:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return r2
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.h.v.a(java.lang.String, android.content.Context, java.lang.String):java.lang.String");
    }

    private static String b(com.anythink.expressad.foundation.d.d dVar) {
        d.a w3;
        String str = "";
        if (dVar != null) {
            try {
                str = dVar.h();
            } catch (Exception e9) {
                e9.getMessage();
                return str;
            }
        }
        if (TextUtils.isEmpty(str) && dVar != null && (w3 = dVar.w()) != null) {
            str = w3.b();
        }
        if (TextUtils.isEmpty(str)) {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.foundation.b.a.c().f();
            com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
            if (b9 != null) {
                return b9.J();
            }
        }
        return str;
    }

    public static synchronized String a(Context context, String str, String str2) {
        String sb;
        synchronized (v.class) {
            StringBuilder sb2 = new StringBuilder(str2);
            try {
                sb2.append(a(str2, context, str));
            } catch (Exception unused) {
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public static boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            try {
                try {
                    Uri parse = Uri.parse(str2);
                    if (parse != null) {
                        if (!TextUtils.isEmpty(parse.getQueryParameter(str))) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e9) {
                    e9.getMessage();
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean b(List list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    private static <T> boolean b(T[] tArr) {
        return (tArr == null || tArr.length == 0) ? false : true;
    }

    public static int a(String str, String str2, int i4) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    String queryParameter = parse.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        return (int) Math.round(Double.valueOf(String.valueOf(queryParameter)).doubleValue());
                    }
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        return i4;
    }

    public static String a(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                HashMap hashMap = new HashMap();
                hashMap.put(str2, str3);
                return a(str, hashMap);
            }
            return str;
        } catch (Exception e9) {
            e9.getMessage();
            return str;
        }
    }

    private static String a(String str, Map<String, String> map) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    String value = entry.getValue();
                    if (str.contains(entry.getKey())) {
                        if (value.equals("0")) {
                            sb = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", ""));
                        } else {
                            sb = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", entry.getKey() + entry.getValue()));
                        }
                    } else if (!value.equals("0")) {
                        sb.append(entry.getKey() + entry.getValue());
                    }
                }
            }
            return sb.toString();
        } catch (Exception e9) {
            e9.getMessage();
            return str;
        }
    }

    public static final void a(ImageView imageView, com.anythink.expressad.foundation.d.d dVar, final Context context, boolean z6) {
        if (imageView == null || dVar == null) {
            return;
        }
        boolean z9 = dVar.a() == 0;
        if (!z6 && z9) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e9) {
                e9.getMessage();
                return;
            }
        }
        final String b9 = b(dVar);
        if (TextUtils.isEmpty(b9)) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e10) {
                e10.getMessage();
                return;
            }
        }
        try {
            imageView.setVisibility(0);
        } catch (Exception e11) {
            e11.getMessage();
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.h.v.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    com.anythink.core.common.v.y.a(context, b9);
                } catch (Exception e12) {
                    e12.getMessage();
                }
            }
        });
    }
}
