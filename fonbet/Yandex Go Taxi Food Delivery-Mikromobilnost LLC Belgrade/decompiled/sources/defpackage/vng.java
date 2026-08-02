package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import com.squareup.wire.internal.MathMethodsKt;
import com.yandex.div.core.expression.variables.b;
import com.yandex.div2.b3;
import com.yandex.div2.c3;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.time.Instant;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;
import ru.yandex.taxi.logistics.sdk.o;

/* loaded from: classes.dex */
public abstract class vng {
    public static final Object[] a = new Object[0];
    public static final abl0 b = new abl0(17);
    public static final yk c = new yk(11);
    public static final tig0 d = new tig0(new yk(28), new abl0(17));
    public static volatile s59 e;

    public static final mo21 A(ep21 ep21Var) {
        cp21 cp21Var = ep21Var instanceof cp21 ? (cp21) ep21Var : null;
        if (cp21Var != null) {
            return cp21Var.a;
        }
        return null;
    }

    public static final zm20 B(zm20 zm20Var) {
        String str = zm20Var.b;
        if (!evu0.J(str)) {
            if (str.equals("mob")) {
                zm20Var = new zm20("default", str);
            }
            if (!evu0.J(zm20Var.a)) {
                return zm20Var;
            }
        }
        return null;
    }

    public static ArrayList C(JSONArray jSONArray, eg90 eg90Var) {
        List list;
        u2l u2lVar = new u2l(eg90Var);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("variables", jSONArray);
        wls wlsVar = c3.b;
        wls a2 = b3.a();
        kbs kbsVar = pdx.a;
        JSONArray optJSONArray = jSONObject.optJSONArray("variables");
        if (optJSONArray == null) {
            throw fg90.h("variables", jSONObject);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            list = Collections.EMPTY_LIST;
            try {
                List list2 = list;
            } catch (ClassCastException unused) {
                eg90Var.a(fg90.m(jSONObject, "variables", list));
            }
        } else {
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
                    optJSONObject = null;
                }
                if (optJSONObject != null) {
                    try {
                        Object invoke = a2.invoke(u2lVar, optJSONObject);
                        if (invoke != null) {
                            try {
                                kbs kbsVar2 = pdx.a;
                                arrayList.add(invoke);
                            } catch (ClassCastException unused2) {
                                eg90Var.a(fg90.l(optJSONArray, "variables", i, invoke));
                            }
                        }
                    } catch (ClassCastException unused3) {
                        eg90Var.a(fg90.l(optJSONArray, "variables", i, optJSONObject));
                    } catch (Exception e2) {
                        eg90Var.a(fg90.e(optJSONArray, "variables", i, optJSONObject, e2));
                    }
                }
            }
            list = arrayList;
        }
        qvo qvoVar = rvo.a;
        tvo y = bvf0.y(qvoVar);
        rtf0 bVar = y != null ? new b(y, new nxk(2)) : qtf0.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c231 h0 = tje.h0((c3) it.next(), qvoVar, bVar, eg90Var);
            if (h0 != null) {
                arrayList2.add(h0);
            }
        }
        return arrayList2;
    }

    public static final JSONObject D(JSONObject jSONObject, qhl0 qhl0Var) {
        String str;
        JSONObject put = jSONObject.put("metricaUuid", qhl0Var.b).put("deviceId", qhl0Var.c);
        Long l = qhl0Var.d;
        if (l == null || (str = l.toString()) == null) {
            str = "";
        }
        return put.put("passportUid", str).put("androidSdk", Build.VERSION.SDK_INT).put("device", Build.MODEL);
    }

    public static final void E(View view, pey peyVar) {
        view.setTag(m8h0.view_tree_lifecycle_owner, peyVar);
    }

    public static int F(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int G(Object obj) {
        return F(obj == null ? 0 : obj.hashCode());
    }

    public static final v0w H(InputStream inputStream) {
        return new v0w(inputStream, new ydz0());
    }

    public static final long I() {
        s59 s59Var = e;
        return s59Var != null ? ((o) s59Var.a).h.d() : System.currentTimeMillis();
    }

    public static final Object[] J(Collection collection) {
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    public static final Object[] K(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final List L(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(a.P(list)) : EmptyList.a;
    }

    public static final Map M(Map map) {
        int size = map.size();
        if (size == 0) {
            return kotlin.collections.b.f();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) a.O(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final Map N(JSONObject jSONObject, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                linkedHashMap.put(next, opt != null ? q(opt) : null);
            }
            return linkedHashMap;
        } catch (Throwable th) {
            Throwable a2 = Result.a(new Result.Failure(th));
            if (a2 != null) {
                x4c.g("Error while converting JSONObject to map", a2, null, null, 12);
            }
            return kotlin.collections.b.f();
        }
    }

    public static final int O(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final RectF P(y66 y66Var, sls slsVar) {
        float floatValue = ((Number) y66Var.c.c()).floatValue();
        float floatValue2 = ((Number) y66Var.c.f()).floatValue();
        Pair pair = y66Var.e;
        RectF rectF = new RectF(floatValue, floatValue2, ((Number) pair.c()).floatValue(), ((Number) pair.f()).floatValue());
        int i = lzo.a[y66Var.b.ordinal()];
        if (i == 1) {
            return rectF;
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        long j = ((ior) slsVar.invoke()).a;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-intBitsToFloat, -intBitsToFloat2);
        return rectF2;
    }

    public static void Q(int i, int i2) {
        String e2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                e2 = xqa1.e("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ny61.g(oyr.i(i2, "negative size: "));
                    return;
                }
                e2 = xqa1.e("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(e2);
        }
    }

    public static void R(int i, int i2) {
        if (i < 0 || i > i2) {
            ny61.m(T(i, i2, "index"));
        }
    }

    public static void S(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? T(i, i3, "start index") : (i2 < 0 || i2 > i3) ? T(i2, i3, "end index") : xqa1.e("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String T(int i, int i2, String str) {
        if (i < 0) {
            return xqa1.e("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return xqa1.e("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ny61.g(oyr.i(i2, "negative size: "));
        return null;
    }

    public static iwi a() {
        return new iwi(1.0f, 1.0f);
    }

    public static final zm20 b(String str, ol20 ol20Var) {
        return new zm20(str, ol20Var.a);
    }

    public static final String c(AndroidLocationProviderType androidLocationProviderType) {
        int i = t9z.a[androidLocationProviderType.ordinal()];
        if (i == 1) {
            return "gps";
        }
        if (i == 2) {
            return "network";
        }
        if (i == 3) {
            return "passive";
        }
        if (i == 4) {
            return GplLibraryWrapper.FUSED_PROVIDER;
        }
        w511.b();
        return null;
    }

    public static final mcz d(p9z p9zVar) {
        int i;
        long j;
        e3n e3nVar = p9zVar.b;
        long e2 = e3nVar != null ? e3n.e(e3nVar.a) : Long.MAX_VALUE;
        d6z.q(e2, "intervalMillis");
        float f = (float) p9zVar.d;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(Float.MAX_VALUE);
        if (f < 0.0f) {
            ny61.g(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", "minUpdateDistanceMeters", valueOf, valueOf2));
            return null;
        }
        if (f > Float.MAX_VALUE) {
            ny61.g(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", "minUpdateDistanceMeters", valueOf, valueOf2));
            return null;
        }
        int i2 = t9z.b[p9zVar.e.ordinal()];
        boolean z = true;
        if (i2 == 1) {
            i = 100;
        } else if (i2 == 2) {
            i = 102;
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            i = 104;
        }
        boolean z2 = i == 104 || i == 102 || i == 100;
        Object[] objArr = {Integer.valueOf(i)};
        if (!z2) {
            throw new IllegalArgumentException(String.format("quality must be a defined QUALITY constant, not %d", objArr));
        }
        e3n e3nVar2 = p9zVar.b;
        e3n e3nVar3 = p9zVar.c;
        if (e3nVar2 == null) {
            e3nVar3 = new e3n(e3nVar3 != null ? e3nVar3.a : na2.k);
        }
        if (e3nVar3 != null) {
            j = e3n.e(e3nVar3.a);
            d6z.q(j, "minUpdateIntervalMillis");
        } else {
            j = -1;
        }
        if (e2 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED && j == -1) {
            z = false;
        }
        d6z.y("passive location requests must have an explicit minimum update interval", z);
        return new mcz(e2, i, Math.min(j, e2), f);
    }

    public static final String e(mo21 mo21Var) {
        return mo21Var.a + ";" + mo21Var.b;
    }

    public static final int f(long j, long[] jArr) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void g(ViewGroup viewGroup, ArrayList arrayList) {
        Pair pair;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() != 0) {
                pair = new Pair(null, Boolean.TRUE);
            } else {
                int importantForAccessibility = childAt.getImportantForAccessibility();
                if (importantForAccessibility == 0 || importantForAccessibility == 1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(childAt);
                    wh whVar = new wh(obtain);
                    childAt.onInitializeAccessibilityNodeInfo(obtain);
                    if (obtain.isClickable() || !obtain.isEnabled()) {
                        pair = new Pair(null, Boolean.TRUE);
                    } else {
                        CharSequence contentDescription = obtain.getContentDescription();
                        pair = !TextUtils.isEmpty(contentDescription) ? new Pair(contentDescription, Boolean.TRUE) : new Pair(whVar.g(), Boolean.FALSE);
                    }
                } else {
                    pair = new Pair(null, Boolean.TRUE);
                }
            }
            CharSequence charSequence = (CharSequence) pair.getFirst();
            boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
            if (charSequence != null && charSequence.length() != 0) {
                arrayList.add(charSequence);
            }
            if (!booleanValue && (childAt instanceof ViewGroup)) {
                g((ViewGroup) childAt, arrayList);
            }
        }
    }

    public static /* synthetic */ List h(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        g(viewGroup, arrayList);
        return arrayList;
    }

    public static final zm20 i(lq20 lq20Var) {
        String str;
        String str2 = lq20Var.a;
        String str3 = "default";
        if (!jl40.l(str2, "mob") && (str = lq20Var.i) != null) {
            str3 = str;
        }
        return new zm20(str3, str2);
    }

    public static JSONArray j(JSONArray jSONArray, int i) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object opt = jSONArray.opt(i2);
            if (opt instanceof JSONObject) {
                if (i != 0) {
                    opt = k((JSONObject) opt, i - 1);
                    jSONArray2.put(opt);
                }
                opt = "...";
                jSONArray2.put(opt);
            } else {
                if (opt instanceof JSONArray) {
                    if (i != 0) {
                        opt = j((JSONArray) opt, i - 1);
                    }
                    opt = "...";
                }
                jSONArray2.put(opt);
            }
        }
        return jSONArray2;
    }

    public static JSONObject k(JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                if (i != 0) {
                    opt = k((JSONObject) opt, i - 1);
                    jSONObject2.put(next, opt);
                }
                opt = "...";
                jSONObject2.put(next, opt);
            } else {
                if (opt instanceof JSONArray) {
                    if (i != 0) {
                        opt = j((JSONArray) opt, i - 1);
                    }
                    opt = "...";
                }
                jSONObject2.put(next, opt);
            }
        }
        return jSONObject2;
    }

    public static final b2k l(tpr tprVar, tls tlsVar, wls wlsVar) {
        if (tprVar instanceof b2k) {
            b2k b2kVar = (b2k) tprVar;
            if (b2kVar.b == tlsVar && b2kVar.c == wlsVar) {
                return b2kVar;
            }
        }
        return new b2k(tprVar, tlsVar, wlsVar);
    }

    public static Instant m(int i, long j) {
        long j2 = i;
        long j3 = j2 / MathMethodsKt.NANOS_PER_SECOND;
        if ((j2 ^ MathMethodsKt.NANOS_PER_SECOND) < 0 && j3 * MathMethodsKt.NANOS_PER_SECOND != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            return j > 0 ? Instant.b : Instant.a;
        }
        if (j4 < -31557014167219200L) {
            return Instant.a;
        }
        if (j4 > 31556889864403199L) {
            return Instant.b;
        }
        long j5 = j2 % MathMethodsKt.NANOS_PER_SECOND;
        return new Instant(j4, (int) (j5 + ((((j5 ^ MathMethodsKt.NANOS_PER_SECOND) & ((-j5) | j5)) >> 63) & MathMethodsKt.NANOS_PER_SECOND)));
    }

    public static HashMap n(zzs zzsVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("lat", Double.valueOf(zzsVar.a));
        hashMap.put("lon", Double.valueOf(zzsVar.b));
        int i = zzsVar.c;
        if (i > 0) {
            hashMap.put("acc", Integer.valueOf(i));
        }
        return hashMap;
    }

    public static final pey o(View view) {
        while (view != null) {
            Object tag = view.getTag(m8h0.view_tree_lifecycle_owner);
            pey peyVar = tag instanceof pey ? (pey) tag : null;
            if (peyVar != null) {
                return peyVar;
            }
            Object p = qke.p(view);
            view = p instanceof View ? (View) p : null;
        }
        return null;
    }

    public static final int p(int i, Context context) {
        return eob1.b(context.getTheme(), i).data;
    }

    public static final Object q(Object obj) {
        if (obj instanceof JSONObject) {
            return N((JSONObject) obj, kotlin.collections.b.f());
        }
        if (!(obj instanceof JSONArray)) {
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            arrayList.add(opt != null ? q(opt) : null);
        }
        return arrayList;
    }

    public static final float r(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Rect bounds2;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            point.x = bounds.width();
            bounds2 = currentWindowMetrics.getBounds();
            point.y = bounds2.height();
        } else {
            windowManager.getDefaultDisplay().getRealSize(point);
        }
        float hypot = (float) Math.hypot(point.x / context.getResources().getDisplayMetrics().xdpi, point.y / context.getResources().getDisplayMetrics().ydpi);
        Float valueOf = Float.valueOf(hypot);
        if (Math.abs(hypot) > Float.MAX_VALUE) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return 0.0f;
    }

    public static final int s(int i, Context context) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static Drawable t(int i, Context context) {
        return kuj0.c().d(i, context);
    }

    public static Object u(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return nu6.b(bundle, cls, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList v(Bundle bundle, Class cls, String str) {
        return Build.VERSION.SDK_INT >= 34 ? nu6.d(bundle, cls, str) : bundle.getParcelableArrayList(str);
    }

    public static Serializable w(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return nu6.f(bundle, cls, str);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    public static final String x(Context context) {
        Object failure;
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
                failure = packageInfo.versionName;
            } else {
                failure = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str = (String) failure;
        return str == null ? "" : str;
    }

    public static final boolean y(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final void z(Context context, String str, tls tlsVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(SelfTester_JCP.IMITA);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            tlsVar.invoke(e2);
        }
    }
}
