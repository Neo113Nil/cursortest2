package x2;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC2888Ya;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2655Kc;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import n2.C4768c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s2.r;
import w.AbstractC5128c;
import y2.AbstractC5205a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final c3.e f41852b = new c3.e(Looper.getMainLooper(), 1);

    /* renamed from: c, reason: collision with root package name */
    public static final String f41853c = m2.j.class.getName();

    /* renamed from: d, reason: collision with root package name */
    public static final String f41854d = AbstractC5205a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    public static final String f41855e = C4768c.class.getName();

    /* renamed from: f, reason: collision with root package name */
    public static final String f41856f = C2655Kc.class.getName();

    /* renamed from: g, reason: collision with root package name */
    public static final String f41857g = m2.e.class.getName();

    /* renamed from: a, reason: collision with root package name */
    public float f41858a = -1.0f;

    public static final void a(Context context, String str, Bundle bundle, c cVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            O2.f.f2270b.getClass();
            int a9 = O2.f.a(context);
            str = AbstractC5128c.e(a9, ".262180000", new StringBuilder(String.valueOf(a9).length() + 10));
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str2 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str2, bundle.getString(str2));
        }
        cVar.b(appendQueryParameter.toString());
    }

    public static final int b(Context context, int i) {
        return r(context.getResources().getDisplayMetrics(), i);
    }

    public static final String c(Context context) {
        AbstractC3592ma.a(context);
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || s()) {
            string = "emulator";
        }
        return d(string, "MD5");
    }

    public static String d(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static ActivityManager.MemoryInfo i(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            i.f("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    public static String j(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Bundle bundle = X2.b.a(context).f(128, context.getPackageName()).metaData;
            if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                return bundle.getString("com.google.unity.ads.UNITY_VERSION");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static m2.h k(Context context, int i, int i4) {
        int q8 = q(context, i4);
        if (q8 == -1) {
            return m2.h.f39379o;
        }
        return new m2.h(i, Math.max(Math.min(i > 655 ? Math.round((i / 728.0f) * 90.0f) : i > 632 ? 81 : i > 526 ? Math.round((i / 468.0f) * 60.0f) : i > 432 ? 68 : Math.round((i / 320.0f) * 50.0f), Math.min(90, Math.round(q8 * 0.15f))), 50));
    }

    public static boolean p(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) AbstractC2888Ya.f29461d.r());
    }

    public static int q(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i4 = configuration.orientation;
        if (i == 0) {
            i = i4;
        }
        return i == i4 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static final int r(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    public static final boolean s() {
        boolean booleanValue = ((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Oc)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return booleanValue && Build.HARDWARE.contains("ranchu");
    }

    public final JSONArray e(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f(jSONArray, it.next());
        }
        return jSONArray;
    }

    public final void f(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(n((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(l((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(e((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(o((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    public final void g(JSONObject jSONObject, String str, Object obj) {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f33158u)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, n((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, l((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), e((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, e(Arrays.asList((Object[]) obj)));
            return;
        }
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i < length) {
                    numArr2[i] = Integer.valueOf(iArr[i]);
                    i++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, o(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i < length2) {
                    dArr3[i] = Double.valueOf(dArr2[i]);
                    i++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, o(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i < length3) {
                    lArr2[i] = Long.valueOf(jArr[i]);
                    i++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, o(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new Boolean[0];
        } else {
            int length4 = zArr.length;
            Boolean[] boolArr2 = new Boolean[length4];
            while (i < length4) {
                boolArr2[i] = Boolean.valueOf(zArr[i]);
                i++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, o(boolArr));
    }

    public final int h(Context context, int i) {
        if (this.f41858a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f41858a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f41858a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i / this.f41858a);
    }

    public final JSONObject l(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                g(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e9) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e9.getMessage())));
        }
    }

    public final JSONObject m(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return n(bundle);
            } catch (JSONException e9) {
                i.d("Error converting Bundle to JSON", e9);
            }
        }
        return jSONObject;
    }

    public final JSONObject n(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            g(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONArray o(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            f(jSONArray, obj);
        }
        return jSONArray;
    }
}
