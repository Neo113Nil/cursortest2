package U2;

import C3.u;
import D6.b;
import D6.d;
import D6.l;
import M7.q;
import S0.p;
import U.j;
import a.AbstractC0415a;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b6.e;
import b6.f;
import b6.g;
import b6.h;
import b6.i;
import b6.k;
import g1.C4523c;
import g1.C4524d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public static Context f3276a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f3277b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4524d f3278c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile C4523c f3279d;

    public static g a(D6.b bVar) {
        String str = bVar.f708v;
        if (str != null) {
            return new f(2, str);
        }
        Long l9 = bVar.f710x;
        if (l9 != null) {
            return new k(l9.longValue());
        }
        Double d2 = bVar.f711y;
        if (d2 != null) {
            return new b6.j(d2.doubleValue());
        }
        Boolean bool = bVar.f709w;
        if (bool != null) {
            return new h(bool.booleanValue());
        }
        u8.h hVar = bVar.f707B;
        if (hVar != null) {
            byte[] k6 = hVar.k();
            return new i(Arrays.copyOf(k6, k6.length));
        }
        l lVar = bVar.f706A;
        if (lVar == null) {
            d dVar = bVar.f712z;
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized AnyValue type");
            }
            final int i = 1;
            return new f(1, Collections.unmodifiableList((List) dVar.f714v.stream().map(new Function() { // from class: t6.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    switch (i) {
                        case 0:
                            return U2.a.a(((D6.j) obj).f727w);
                        default:
                            return U2.a.a((b) obj);
                    }
                }
            }).collect(Collectors.toList())));
        }
        final int i4 = 0;
        Map map = (Map) lVar.f729v.stream().collect(Collectors.toMap(new G6.b(29), new Function() { // from class: t6.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i4) {
                    case 0:
                        return U2.a.a(((D6.j) obj).f727w);
                    default:
                        return U2.a.a((b) obj);
                }
            }
        }));
        Objects.requireNonNull(map, "value must not be null");
        b6.d[] dVarArr = (b6.d[]) map.entrySet().stream().map(new G6.b(19)).toArray(new e());
        Objects.requireNonNull(dVarArr, "value must not be null");
        ArrayList arrayList = new ArrayList(dVarArr.length);
        arrayList.addAll(Arrays.asList(dVarArr));
        return new f(0, Collections.unmodifiableList(arrayList));
    }

    public static int b(int i, int i4, int i9) {
        return i < i4 ? i4 : i > i9 ? i9 : i;
    }

    public static void c(String str, String str2, Object obj) {
        String j9 = j(str);
        if (Log.isLoggable(j9, 3)) {
            Log.d(j9, String.format(str2, obj));
        }
    }

    public static void d(String str, String str2, Exception exc) {
        String j9 = j(str);
        if (Log.isLoggable(j9, 6)) {
            Log.e(j9, str2, exc);
        }
    }

    public static final S0.j e(p pVar) {
        kotlin.jvm.internal.h.e(pVar, "<this>");
        return new S0.j(pVar.f2920a, pVar.f2938t);
    }

    public static int f(int i, View view) {
        Context context = view.getContext();
        TypedValue B8 = AbstractC0415a.B(view.getContext(), view.getClass().getCanonicalName(), i);
        int i4 = B8.resourceId;
        return i4 != 0 ? E.b.a(context, i4) : B8.data;
    }

    public static int g(Context context, int i, int i4) {
        Integer num;
        TypedValue z8 = AbstractC0415a.z(context, i);
        if (z8 != null) {
            int i9 = z8.resourceId;
            num = Integer.valueOf(i9 != 0 ? E.b.a(context, i9) : z8.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i4;
    }

    public static Set i() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static String j(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static boolean k(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = G.c.f1149a;
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
        double d3 = green / 255.0d;
        double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d9 = blue / 255.0d;
        double pow3 = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d10 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d10;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d10 / 100.0d > 0.5d;
    }

    public static synchronized boolean l(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f3276a;
            if (context2 != null && (bool = f3277b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f3277b = null;
            if (S2.b.f()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f3277b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f3277b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f3277b = Boolean.FALSE;
                }
            }
            f3276a = applicationContext;
            return f3277b.booleanValue();
        }
    }

    public static final boolean m(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            kotlin.jvm.internal.h.d(className, "getClassName(...)");
            if (q.I(className, "com.onesignal")) {
                return true;
            }
        }
        return false;
    }

    public static int n(int i, int i4, float f6) {
        return G.c.b(G.c.d(i4, Math.round(Color.alpha(i4) * f6)), i);
    }

    public static String o(Map map) {
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

    public static long p(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e6) {
            if ("0".equals(str) || "-1".equals(str)) {
                l1.j.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", l1.j.a("Unable to parse dateStr: %s, falling back to 0", str), e6);
            return 0L;
        }
    }

    public abstract void h(u uVar, float f6, float f9);

    public abstract void q();
}
