package com.anythink.core.common.v;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16849a = "CommonUtils";

    /* renamed from: b, reason: collision with root package name */
    private static char[] f16850b = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* renamed from: c, reason: collision with root package name */
    private static char[] f16851c = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* renamed from: d, reason: collision with root package name */
    private static char[] f16852d = {'.', 'X'};

    /* renamed from: e, reason: collision with root package name */
    private static int f16853e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f16854f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static int f16855g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static int f16856h = 3;
    private static int i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static int f16857j = 7;

    /* renamed from: k, reason: collision with root package name */
    private static int f16858k = 14;

    /* renamed from: l, reason: collision with root package name */
    private static int f16859l = 19;

    /* renamed from: m, reason: collision with root package name */
    private static int f16860m = 16;

    /* renamed from: n, reason: collision with root package name */
    private static int f16861n = 26;

    /* renamed from: o, reason: collision with root package name */
    private static int f16862o = 8;

    /* renamed from: p, reason: collision with root package name */
    private static int f16863p = 24;

    /* renamed from: q, reason: collision with root package name */
    private static int f16864q = 38;

    /* renamed from: r, reason: collision with root package name */
    private static int f16865r = 54;

    /* renamed from: s, reason: collision with root package name */
    private static char[] f16866s = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};

    /* renamed from: t, reason: collision with root package name */
    private static char[] f16867t = {'C', 'l', 'i', 'p', 'D', 'a', 't', 'a', 'C', 'l', 'i', 'p', 'b', 'o', 'a', 'r', 'd', 'M', 'a', 'n', 'a', 'g', 'e', 'r', 's', 'e', 't', 'P', 'r', 'i', 'm', 'a', 'r', 'y', 'C', 'l', 'i', 'p', 'g', 'e', 't', 'S', 'y', 's', 't', 'e', 'm', 'S', 'e', 'r', 'v', 'i', 'c', 'e'};

    /* renamed from: u, reason: collision with root package name */
    private static char[] f16868u = {'c', 'l', 'i', 'p', 'b', 'o', 'a', 'r', 'd'};

    /* renamed from: v, reason: collision with root package name */
    private static char[] f16869v = {'n', 'e', 'w', 'P', 'l', 'a', 'i', 'n', 'T', 'e', 'x', 't'};

    /* renamed from: w, reason: collision with root package name */
    private static final Pattern f16870w = Pattern.compile("(?i)((?:http|https|ftp|file)://|(?:inline|data|about|javascript):|(?:.*:.*@))(.*)");

    /* renamed from: x, reason: collision with root package name */
    private static Boolean f16871x = null;

    /* renamed from: com.anythink.core.common.v.q$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f16872a;

        public AnonymousClass1(View view) {
            this.f16872a = view;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i) {
            if ((i & 2) == 0) {
                q.a(this.f16872a);
            }
        }
    }

    public static <T extends String> boolean a(T t6) {
        return t6 == null || t6.length() == 0;
    }

    public static <T extends String> boolean b(T t6) {
        return t6 != null && t6.length() > 0;
    }

    private static int[] c(Context context, String str) {
        try {
            for (Field field : Class.forName(context.getPackageName() + ".R$styleable").getFields()) {
                if (field.getName().equals(str)) {
                    return (int[]) field.get(null);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    public static boolean d(String str) {
        return f16870w.matcher(str.toLowerCase()).matches();
    }

    public static String e(String str) {
        return TextUtils.isEmpty(str) ? str : str.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&amp;", "&").replaceAll("&quot;", "\"");
    }

    private static double f(Map<String, Object> map, String str) {
        return ((Double) a(map, str, Double.valueOf(0.0d))).doubleValue();
    }

    public static HashMap g(Context context) {
        HashMap hashMap = new HashMap();
        if (context != null) {
            try {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
                hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
                return hashMap;
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        return hashMap;
    }

    private static boolean h(Map<String, Object> map, String str) {
        return ((Boolean) a(map, str, Boolean.FALSE)).booleanValue();
    }

    public static float i(Context context) {
        if (context == null) {
            return 0.0f;
        }
        try {
            PackageInfo currentWebViewPackage = Build.VERSION.SDK_INT >= 26 ? WebView.getCurrentWebViewPackage() : context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            if (currentWebViewPackage == null || TextUtils.isEmpty(currentWebViewPackage.versionName)) {
                return 1.5f;
            }
            return currentWebViewPackage.versionName.equals("77.0.3865.92") ? 5.0f : 1.5f;
        } catch (Exception unused) {
            return 1.5f;
        }
    }

    public static boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int b(Context context, float f3) {
        float f9 = context.getResources().getDisplayMetrics().density;
        if (f9 <= 0.0f) {
            f9 = 1.0f;
        }
        return (int) ((f3 / f9) + 0.5f);
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
                HashMap g4 = g(context);
                return g4.get("height") == null ? displayMetrics.heightPixels : ((Integer) g4.get("height")).intValue();
            } catch (Exception e9) {
                e9.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    public static float h(Context context) {
        if (context != null) {
            try {
                float f3 = context.getResources().getDisplayMetrics().density;
                if (f3 == 0.0f) {
                    return 2.5f;
                }
                return f3;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return 2.5f;
    }

    private static int b(Context context, String str, String str2) {
        String str3 = context.getPackageName() + ".R";
        String g4 = AbstractC4404f.g(str, "_", str2);
        try {
            for (Class<?> cls : Class.forName(str3).getClasses()) {
                if (cls.getSimpleName().equals("styleable")) {
                    for (Field field : cls.getFields()) {
                        if (field.getName().equals(g4)) {
                            return ((Integer) field.get(null)).intValue();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return 0;
    }

    public static boolean d(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                if (activeNetworkInfo.getType() == 1) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int e(Context context) {
        if (com.anythink.core.common.d.t.b().c("screen")) {
            return 0;
        }
        try {
            if (!com.anythink.core.common.d.v.a(com.anythink.core.common.d.t.b().g()).b() || context == null) {
                return 0;
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                HashMap g4 = g(context);
                return g4.get("width") == null ? displayMetrics.widthPixels : ((Integer) g4.get("width")).intValue();
            } catch (Exception e9) {
                e9.printStackTrace();
                return 0;
            }
        } catch (Exception unused) {
        }
    }

    public static int a(Context context, float f3) {
        return (int) ((f3 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Map<String, Object> c(String str) {
        HashMap hashMap = new HashMap();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.opt(next));
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    private static long d(Map<String, Object> map, String str) {
        return b(map, str);
    }

    public static String f(String str) {
        try {
            if (!TextUtils.isEmpty(str) && URLUtil.isValidUrl(str)) {
                return new URL(str).getHost();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static int a(Context context, String str, String str2) {
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        if (context == null) {
            return -1;
        }
        String concat = "anythink_".concat(String.valueOf(str));
        String U3 = com.anythink.core.common.d.t.b().U();
        int identifier = TextUtils.isEmpty(U3) ? -1 : context.getResources().getIdentifier(concat, str2, U3);
        return identifier > 0 ? identifier : context.getResources().getIdentifier(concat, str2, context.getPackageName());
    }

    private static boolean g(Map<String, Object> map, String str) {
        return ((Boolean) a(map, str, Boolean.FALSE)).booleanValue();
    }

    private static double e(Map<String, Object> map, String str) {
        return ((Double) a(map, str, Double.valueOf(0.0d))).doubleValue();
    }

    public static boolean c(Context context) {
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    public static String[] a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            String[] strArr = new String[jSONArray.length()];
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                strArr[i6] = jSONArray.optString(i6);
            }
            return strArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private static int c(Map<String, Object> map, String str) {
        return a(map, str, 0);
    }

    private static void a(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(4870);
            decorView.setOnSystemUiVisibilityChangeListener(new AnonymousClass1(decorView));
        }
    }

    public static List<String> b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                String optString = jSONArray.optString(i6);
                if (optString != null) {
                    arrayList.add(optString);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(View view) {
        view.setSystemUiVisibility(4870);
    }

    public static boolean a() {
        try {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(Object[] objArr) {
        int length;
        if (objArr == null || objArr.length - 1 == -1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        while (true) {
            sb.append(String.valueOf(objArr[i6]));
            if (i6 == length) {
                return sb.toString();
            }
            sb.append(",");
            i6++;
        }
    }

    private static View.OnSystemUiVisibilityChangeListener b(View view) {
        return new AnonymousClass1(view);
    }

    public static int b(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        return dimensionPixelSize == 0 ? a(context, 32.0f) : dimensionPixelSize;
    }

    private static Object b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(a(f16853e))).getMethod(String.valueOf(a(f16855g)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(a(f16854f))).getMethod(String.valueOf(a(f16856h)), new Class[0]).invoke(context, new Object[0]), str, 8192);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z3;
        synchronized (q.class) {
            z3 = false;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (b(str, context) != null) {
                            z3 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return z3;
    }

    private static final char[] a(int i6) {
        StringBuilder sb;
        switch (i6) {
            case 0:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(f16850b, f16857j)));
                sb.append(f16852d[i]);
                sb.append(String.valueOf(Arrays.copyOfRange(f16850b, f16857j, f16858k)));
                sb.append(f16852d[i]);
                sb.append(String.valueOf(Arrays.copyOfRange(f16850b, f16858k, f16860m)));
                sb.append(f16852d[i]);
                sb.append(String.valueOf(f16866s));
                break;
            case 1:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(f16850b, f16857j)));
                sb.append(f16852d[i]);
                sb.append(String.valueOf(Arrays.copyOfRange(f16850b, f16857j, f16858k)));
                sb.append(f16852d[i]);
                sb.append(String.valueOf(Arrays.copyOfRange(f16850b, f16859l, f16861n)));
                break;
            case 2:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOfRange(f16850b, f16860m, f16859l)));
                sb.append(String.valueOf(f16851c));
                break;
            case 3:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOfRange(f16850b, f16860m, f16859l)));
                sb.append(String.valueOf(f16866s));
                break;
            case 4:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(f16850b, f16857j)));
                sb.append(f16852d[i]);
                sb.append(String.valueOf(Arrays.copyOfRange(f16850b, f16857j, f16858k)));
                sb.append(f16852d[i]);
                sb.append(String.valueOf(Arrays.copyOf(f16867t, f16862o)));
                break;
            case 5:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOf(f16850b, f16857j)));
                sb.append(f16852d[i]);
                sb.append(String.valueOf(Arrays.copyOfRange(f16850b, f16857j, f16858k)));
                sb.append(f16852d[i]);
                sb.append(String.valueOf(Arrays.copyOfRange(f16867t, f16862o, f16863p)));
                break;
            case 6:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOfRange(f16867t, f16863p, f16864q)));
                break;
            case 7:
                sb = new StringBuilder();
                sb.append(String.valueOf(f16869v));
                break;
            case 8:
                sb = new StringBuilder();
                sb.append(String.valueOf(f16868u));
                break;
            case 9:
                sb = new StringBuilder();
                sb.append(String.valueOf(Arrays.copyOfRange(f16867t, f16864q, f16865r)));
                break;
            default:
                sb = null;
                break;
        }
        return sb.toString().toCharArray();
    }

    public static boolean b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return context.getPackageManager().getPackageInfo(str, 256) != null;
    }

    public static long b(Map<String, Object> map, String str) {
        return ((Long) a(map, str, 0L)).longValue();
    }

    public static boolean b() {
        try {
            Boolean bool = f16871x;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean equals = Locale.getDefault().getLanguage().equals(new Locale(com.anythink.expressad.video.dynview.a.a.f21096S).getLanguage());
            f16871x = Boolean.valueOf(equals);
            return equals;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(Map<String, Object> map, String str) {
        return a(map, str, "");
    }

    public static String a(Map<String, Object> map, String str, String str2) {
        return (String) a(map, str, str2);
    }

    public static int a(Map<String, Object> map, String str, int i6) {
        return ((Integer) a(map, str, Integer.valueOf(i6))).intValue();
    }

    public static <T> T a(Map<String, Object> map, String str, T t6) {
        T t9;
        try {
            if (!TextUtils.isEmpty(str) && map != null && map.size() != 0 && (t9 = (T) map.get(str)) != null) {
                String obj = t9.toString();
                if (t6 instanceof String) {
                    t9 = (T) obj;
                } else if (t6 instanceof Integer) {
                    t9 = (T) Integer.valueOf(Integer.parseInt(obj));
                } else if (t6 instanceof Long) {
                    t9 = (T) Long.valueOf(Long.parseLong(obj));
                } else if (t6 instanceof Double) {
                    t9 = (T) Double.valueOf(Double.parseDouble(obj));
                } else if (t6 instanceof Float) {
                    t9 = (T) Float.valueOf(Float.parseFloat(obj));
                } else if (t6 instanceof Boolean) {
                    t9 = (T) Boolean.valueOf(Boolean.parseBoolean(obj));
                }
                Objects.toString(t9);
                Objects.toString(t6);
                return t9;
            }
            return t6;
        } catch (Throwable th) {
            th.getMessage();
            return t6;
        }
    }

    public static void a(Activity activity, int i6) {
        try {
            Activity.class.getMethod(k.b("c2V0UmVxdWVzdGVkT3JpZW50YXRpb24="), Integer.TYPE).invoke(activity, Integer.valueOf(i6));
        } catch (Throwable unused) {
        }
    }

    public static String a(String str, String str2) {
        try {
            String f3 = f(str);
            return !TextUtils.isEmpty(f3) ? str.replace(f3, str2) : str;
        } catch (Throwable unused) {
            return str;
        }
    }
}
