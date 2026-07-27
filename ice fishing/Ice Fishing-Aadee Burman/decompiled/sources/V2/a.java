package V2;

import F.g;
import I7.p;
import L3.F;
import R3.h;
import R3.i;
import R3.j;
import R3.k;
import R3.r;
import S7.AbstractC0383a;
import X2.e;
import a.AbstractC0422a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C3601n5;
import d6.C4453a;
import d6.d;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import u7.v;
import v7.C5135p;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f3270a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f3271b;

    public a() {
        new ConcurrentHashMap();
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static long b(long j6) {
        if (j6 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j6 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j6;
    }

    public static byte[] c(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static void h(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (h hVar : (Set) it2.next()) {
                        for (j jVar : hVar.f2732a.f2716c) {
                            if (jVar.f2739c == 0) {
                                Set<h> set = (Set) hashMap.get(new i(jVar.f2737a, jVar.f2738b == 2));
                                if (set != null) {
                                    for (h hVar2 : set) {
                                        hVar.f2733b.add(hVar2);
                                        hVar2.f2734c.add(hVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    h hVar3 = (h) it4.next();
                    if (hVar3.f2734c.isEmpty()) {
                        hashSet2.add(hVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    h hVar4 = (h) hashSet2.iterator().next();
                    hashSet2.remove(hVar4);
                    i++;
                    Iterator it5 = hVar4.f2733b.iterator();
                    while (it5.hasNext()) {
                        h hVar5 = (h) it5.next();
                        hVar5.f2734c.remove(hVar4);
                        if (hVar5.f2734c.isEmpty()) {
                            hashSet2.add(hVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    h hVar6 = (h) it6.next();
                    if (!hVar6.f2734c.isEmpty() && !hVar6.f2733b.isEmpty()) {
                        arrayList2.add(hVar6.f2732a);
                    }
                }
                throw new k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            R3.b bVar = (R3.b) it.next();
            h hVar7 = new h(bVar);
            for (r rVar : bVar.f2715b) {
                boolean z3 = bVar.f2718e == 0;
                i iVar = new i(rVar, !z3);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(iVar);
                if (!set2.isEmpty() && z3) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + com.anythink.core.common.d.j.f12378z);
                }
                set2.add(hVar7);
            }
        }
    }

    public static final boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static InvocationHandler j() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e9) {
                throw new RuntimeException(e9);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static int l(int i, View view) {
        Context context = view.getContext();
        TypedValue r9 = F.r(view.getContext(), view.getClass().getCanonicalName(), i);
        int i6 = r9.resourceId;
        return i6 != 0 ? E.b.a(context, i6) : r9.data;
    }

    public static int m(Context context, int i, int i6) {
        Integer num;
        TypedValue p9 = F.p(context, i);
        if (p9 != null) {
            int i9 = p9.resourceId;
            num = Integer.valueOf(i9 != 0 ? E.b.a(context, i9) : p9.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i6;
    }

    public static ColorStateList n(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !j1.h.p(drawable)) {
            return null;
        }
        colorStateList = j1.h.d(drawable).getColorStateList();
        return colorStateList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List o(String str, List list) {
        kotlin.jvm.internal.h.e(list, "list");
        boolean z3 = list instanceof d;
        List list2 = list;
        if (z3) {
            list2 = ((d) list).f37077u;
        }
        if (list2 == C5135p.f41439n || (list2 instanceof C4453a)) {
            return list2;
        }
        C4453a c4453a = new C4453a(list2);
        if (c4453a.contains(null)) {
            throw new IllegalArgumentException(str.concat(".contains(null)").toString());
        }
        return c4453a;
    }

    public static boolean p(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = G.c.f1003a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = red / 255.0d;
        double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d9 = green / 255.0d;
        double pow2 = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        double d10 = blue / 255.0d;
        double pow3 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d11 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d11;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d11 / 100.0d > 0.5d;
    }

    public static synchronized boolean q(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f3270a;
            if (context2 != null && (bool = f3271b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f3271b = null;
            if (T2.b.f()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f3271b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f3271b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f3271b = Boolean.FALSE;
                }
            }
            f3270a = applicationContext;
            return f3271b.booleanValue();
        }
    }

    public static int r(int i, int i6, float f3) {
        return G.c.b(G.c.d(i6, Math.round(Color.alpha(i6) * f3)), i);
    }

    public static Typeface s(Configuration configuration, Typeface typeface) {
        int i;
        int i6;
        int weight;
        int i9;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i6 = configuration.fontWeightAdjustment;
        if (i6 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i9 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, AbstractC0422a.h(i9 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static final String t(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        StringBuilder sb = new StringBuilder(value.length());
        for (int i = 0; i < value.length(); i++) {
            char charAt = value.charAt(i);
            if (Q7.j.V(",[]{}\\", charAt)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static void u(p pVar, AbstractC0383a abstractC0383a, AbstractC0383a abstractC0383a2) {
        try {
            X7.a.h(v.f41350a, A8.b.l(A8.b.f(pVar, abstractC0383a, abstractC0383a2)));
        } catch (Throwable th) {
            abstractC0383a2.resumeWith(com.bumptech.glide.d.f(th));
            throw th;
        }
    }

    public static N7.a v(N7.c cVar, int i) {
        kotlin.jvm.internal.h.e(cVar, "<this>");
        boolean z3 = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z3) {
            if (cVar.f2019v <= 0) {
                i = -i;
            }
            return new N7.a(cVar.f2017n, cVar.f2018u, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static byte[] w(C3601n5 c3601n5) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i6 = 0;
            while (i6 < min2) {
                int read = c3601n5.read(bArr, i6, min2 - i6);
                if (read == -1) {
                    return c(arrayDeque, i);
                }
                i6 += read;
                i += read;
            }
            long j6 = min * (min < 4096 ? 4 : 2);
            min = j6 > 2147483647L ? Integer.MAX_VALUE : j6 < -2147483648L ? Integer.MIN_VALUE : (int) j6;
        }
        if (c3601n5.read() == -1) {
            return c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static N7.c x(int i, int i6) {
        if (i6 > Integer.MIN_VALUE) {
            return new N7.c(i, i6 - 1, 1);
        }
        N7.c cVar = N7.c.f2024w;
        return N7.c.f2024w;
    }

    public abstract Typeface d(Context context, g gVar, Resources resources, int i);

    public abstract Typeface e(Context context, L.h[] hVarArr, int i);

    public Typeface f(Context context, InputStream inputStream) {
        File I8 = e.I(context);
        if (I8 == null) {
            return null;
        }
        try {
            if (e.C(I8, inputStream)) {
                return Typeface.createFromFile(I8.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            I8.delete();
        }
    }

    public Typeface g(Context context, Resources resources, int i, String str, int i6) {
        File I8 = e.I(context);
        if (I8 == null) {
            return null;
        }
        try {
            if (e.B(I8, resources, i)) {
                return Typeface.createFromFile(I8.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            I8.delete();
        }
    }

    public L.h k(L.h[] hVarArr, int i) {
        int i6 = (i & 1) == 0 ? 400 : com.anythink.core.common.m.a.f14401n;
        boolean z3 = (i & 2) != 0;
        L.h hVar = null;
        int i9 = Integer.MAX_VALUE;
        for (L.h hVar2 : hVarArr) {
            int abs = (Math.abs(hVar2.f1600c - i6) * 2) + (hVar2.f1601d == z3 ? 0 : 1);
            if (hVar == null || i9 > abs) {
                hVar = hVar2;
                i9 = abs;
            }
        }
        return hVar;
    }
}
