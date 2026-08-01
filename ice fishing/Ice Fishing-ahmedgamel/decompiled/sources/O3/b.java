package O3;

import I7.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.C2501Ce;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import d1.C4445c;
import g1.C4522b;
import g1.C4523c;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import l1.j;
import m.b1;
import p7.C4853a;
import s7.AbstractC4978a;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C4523c f2334a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4522b f2335b;

    public static String B(Map map) {
        String str;
        if (map == null || (str = (String) map.get("Content-Type")) == null) {
            return "ISO-8859-1";
        }
        String[] split = str.split(";", 0);
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=", 0);
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return "ISO-8859-1";
    }

    public static long C(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e9) {
            if ("0".equals(str) || "-1".equals(str)) {
                j.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", j.a("Unable to parse dateStr: %s, falling back to 0", str), e9);
            return 0L;
        }
    }

    public static int E(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Object G(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            v2.i.d("Unexpected exception.", th);
            C2501Ce.a(context).e("StrictModeUtil.runWithLaxStrictMode", th);
            return null;
        }
    }

    public static float a(float f3) {
        return f3 <= 0.04045f ? f3 / 12.92f : (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f3) {
        return f3 <= 0.0031308f ? f3 * 12.92f : (float) ((Math.pow(f3, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static void c(StringBuilder sb, Object obj, l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static C4853a h(Map attributes) {
        kotlin.jvm.internal.h.e(attributes, "attributes");
        C4853a c4853a = C4853a.f39800c;
        c4853a.getClass();
        C4445c c4445c = new C4445c();
        c4445c.g(c4853a.f39802b);
        String str = c4853a.f39801a;
        if (str == null) {
            str = null;
        }
        k6.e eVar = AbstractC4978a.f40491a;
        if (eVar != null && !eVar.f38686b.isEmpty()) {
            c4445c.f(eVar, "OneSignalDeviceSDK");
        }
        for (Map.Entry entry : attributes.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null && str3 != null) {
                c4445c.e(str2, str3);
            }
        }
        return C4853a.a(c4445c.d(), str);
    }

    public static void i(String str, String str2, Object obj) {
        String w6 = w(str);
        if (Log.isLoggable(w6, 3)) {
            Log.d(w6, String.format(str2, obj));
        }
    }

    public static boolean j(String current, String str) {
        kotlin.jvm.internal.h.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i = 0;
            int i6 = 0;
            int i9 = 0;
            while (true) {
                if (i < current.length()) {
                    char charAt = current.charAt(i);
                    int i10 = i9 + 1;
                    if (i9 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i6 - 1 == 0 && i9 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i6++;
                    }
                    i++;
                    i9 = i10;
                } else if (i6 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return kotlin.jvm.internal.h.a(Q7.j.q0(substring).toString(), str);
                }
            }
        }
        return false;
    }

    public static void k(String str, String str2, Exception exc) {
        String w6 = w(str);
        if (Log.isLoggable(w6, 6)) {
            Log.e(w6, str2, exc);
        }
    }

    public static int l(int i, int i6, float f3) {
        if (i == i6 || f3 <= 0.0f) {
            return i;
        }
        if (f3 >= 1.0f) {
            return i6;
        }
        float f9 = ((i >> 24) & p.f8473b) / 255.0f;
        float f10 = ((i >> 16) & p.f8473b) / 255.0f;
        float f11 = ((i >> 8) & p.f8473b) / 255.0f;
        float f12 = ((i6 >> 24) & p.f8473b) / 255.0f;
        float f13 = ((i6 >> 16) & p.f8473b) / 255.0f;
        float f14 = ((i6 >> 8) & p.f8473b) / 255.0f;
        float a9 = a(f10);
        float a10 = a(f11);
        float a11 = a((i & p.f8473b) / 255.0f);
        float a12 = a(f13);
        float a13 = a(f14);
        float a14 = a((i6 & p.f8473b) / 255.0f);
        float a15 = AbstractC4404f.a(f12, f9, f3, f9);
        float a16 = AbstractC4404f.a(a12, a9, f3, a9);
        float a17 = AbstractC4404f.a(a13, a10, f3, a10);
        float a18 = AbstractC4404f.a(a14, a11, f3, a11);
        float b9 = b(a16) * 255.0f;
        float b10 = b(a17) * 255.0f;
        return Math.round(b(a18) * 255.0f) | (Math.round(b9) << 16) | (Math.round(a15 * 255.0f) << 24) | (Math.round(b10) << 8);
    }

    public static ColorStateList m(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList c9;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c9 = E.e.c(context, resourceId)) == null) ? typedArray.getColorStateList(i) : c9;
    }

    public static ColorStateList n(Context context, j4.g gVar, int i) {
        int resourceId;
        ColorStateList c9;
        TypedArray typedArray = (TypedArray) gVar.f38405v;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c9 = E.e.c(context, resourceId)) == null) ? gVar.h(i) : c9;
    }

    public static Drawable o(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable e9;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (e9 = com.bumptech.glide.g.e(context, resourceId)) == null) ? typedArray.getDrawable(i) : e9;
    }

    public static String w(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static boolean y(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public abstract boolean A(float f3, float f9);

    public abstract boolean D(View view, float f3);

    public abstract void F(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i6);

    public N2.c d(Context context, Looper looper, b1 b1Var, Object obj, N2.i iVar, N2.j jVar) {
        return e(context, looper, b1Var, obj, iVar, jVar);
    }

    public N2.c e(Context context, Looper looper, b1 b1Var, Object obj, N2.i iVar, N2.j jVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract int f(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float g(int i);

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract int t(View view);

    public abstract int u(CoordinatorLayout coordinatorLayout);

    public abstract int v();

    public abstract boolean x(float f3);

    public abstract boolean z(View view);
}
