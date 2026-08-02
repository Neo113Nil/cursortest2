package L3;

import O.L;
import O.X;
import X.C0410c;
import X.C0412e;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import b0.C0512b;
import com.google.android.gms.internal.ads.AbstractC3070dB;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.InterfaceC3123eB;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3461ka;
import com.google.android.gms.internal.ads.St;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import javax.net.ssl.SSLContext;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import q2.C4900p;
import x3.C5196a;

/* loaded from: classes2.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static g f1679a;

    public static boolean A(Context context, St st) {
        AbstractC3070dB abstractC3070dB;
        if (!st.f27594N) {
            return false;
        }
        C3301ha c3301ha = AbstractC3569ma.h9;
        q2.r rVar = q2.r.f40207e;
        boolean booleanValue = ((Boolean) rVar.f40210c.a(c3301ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        if (booleanValue) {
            return ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.k9)).booleanValue();
        }
        String str = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.i9);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        com.bumptech.glide.manager.p d2 = com.bumptech.glide.manager.p.d(new PA(';'));
        Iterator j6 = ((InterfaceC3123eB) d2.f23471w).j(d2, str);
        do {
            abstractC3070dB = (AbstractC3070dB) j6;
            if (!abstractC3070dB.hasNext()) {
                return false;
            }
        } while (!((String) abstractC3070dB.next()).equals(packageName));
        return true;
    }

    public static JSONObject B(Context context) {
        JSONObject jSONObject = new JSONObject();
        u2.D d2 = C4835j.f39733C.f39738c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i = displayMetrics.widthPixels;
            C4900p c4900p = C4900p.f40199g;
            jSONObject.put("width", c4900p.f40200a.h(context, i));
            jSONObject.put("height", c4900p.f40200a.h(context, displayMetrics.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams C() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.j9)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject D(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        int i = rect.right - rect.left;
        C4900p c4900p = C4900p.f40199g;
        jSONObject.put("width", c4900p.f40200a.h(context, i));
        int i6 = rect.bottom - rect.top;
        v2.d dVar = c4900p.f40200a;
        jSONObject.put("height", dVar.h(context, i6));
        jSONObject.put("x", dVar.h(context, rect.left));
        jSONObject.put("y", dVar.h(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int E(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, X.v vVar, B7.c cVar) {
        C0410c c0410c;
        int i;
        List list2;
        kotlin.jvm.internal.r rVar;
        Iterator it;
        Throwable th;
        if (cVar instanceof C0410c) {
            c0410c = (C0410c) cVar;
            int i6 = c0410c.f3497w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0410c.f3497w = i6 - Integer.MIN_VALUE;
                Object obj = c0410c.f3496v;
                Object obj2 = A7.a.f58n;
                i = c0410c.f3497w;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    ArrayList arrayList = new ArrayList();
                    C0412e c0412e = new C0412e(list, arrayList, null);
                    c0410c.f3494n = arrayList;
                    c0410c.f3497w = 1;
                    if (vVar.a(c0412e, c0410c) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0410c.f3495u;
                        rVar = (kotlin.jvm.internal.r) c0410c.f3494n;
                        try {
                            com.bumptech.glide.d.k(obj);
                        } catch (Throwable th2) {
                            Object obj3 = rVar.f38717n;
                            if (obj3 == null) {
                                rVar.f38717n = th2;
                            } else {
                                X2.e.y((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            I7.l lVar = (I7.l) it.next();
                            c0410c.f3494n = rVar;
                            c0410c.f3495u = it;
                            c0410c.f3497w = 2;
                            if (lVar.invoke(c0410c) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) rVar.f38717n;
                        if (th == null) {
                            return u7.v.f41353a;
                        }
                        throw th;
                    }
                    list2 = (List) c0410c.f3494n;
                    com.bumptech.glide.d.k(obj);
                }
                rVar = new kotlin.jvm.internal.r();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) rVar.f38717n;
                if (th == null) {
                }
            }
        }
        c0410c = new C0410c(cVar);
        Object obj4 = c0410c.f3496v;
        Object obj22 = A7.a.f58n;
        i = c0410c.f3497w;
        if (i != 0) {
        }
        rVar = new kotlin.jvm.internal.r();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) rVar.f38717n;
        if (th == null) {
        }
    }

    public static t.k b(S7.B b9) {
        return com.bumptech.glide.g.f(new H3.l(14, b9));
    }

    public static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b9)));
        }
        return sb.toString();
    }

    public static void d(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void g(int i) {
        if (2 > i || i >= 37) {
            StringBuilder i6 = AbstractC4404f.i(i, "radix ", " was not in valid range ");
            i6.append(new N7.c(2, 36, 1));
            throw new IllegalArgumentException(i6.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] h(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static e7.e i(Map extraHttpHeaders, String appId, String apiBaseUrl, boolean z3) {
        Duration ofSeconds;
        long nanos;
        S6.f fVar;
        SSLContext sSLContext;
        kotlin.jvm.internal.h.e(extraHttpHeaders, "extraHttpHeaders");
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(apiBaseUrl, "apiBaseUrl");
        String endpoint = apiBaseUrl + "sdk/log?app_id=" + appId;
        kotlin.jvm.internal.h.e(endpoint, "endpoint");
        M6.g gVar = new M6.g();
        HashMap hashMap = gVar.f1890e;
        hashMap.put("User-Agent", "OTel-OTLP-Exporter-Java/1.55.0");
        for (Map.Entry entry : extraHttpHeaders.entrySet()) {
            hashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        try {
            URI uri = new URI(endpoint);
            if (uri.getScheme() == null || !(uri.getScheme().equals("http") || uri.getScheme().equals("https"))) {
                throw new IllegalArgumentException("Invalid endpoint, must start with http:// or https://: " + uri);
            }
            gVar.f1887b = uri.toString();
            ofSeconds = Duration.ofSeconds(10L);
            Objects.requireNonNull(ofSeconds, "timeout");
            nanos = ofSeconds.toNanos();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            Objects.requireNonNull(timeUnit, "unit");
            k6.d.a("timeout must be non-negative", nanos >= 0);
            gVar.f1888c = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
            M6.d dVar = new M6.d(gVar);
            boolean startsWith = gVar.f1887b.startsWith("http://");
            HashMap hashMap2 = new HashMap();
            Iterator it = ServiceLoader.load(S6.f.class, (ClassLoader) gVar.f1895k.f903u).iterator();
            while (it.hasNext()) {
                S6.f fVar2 = (S6.f) it.next();
                hashMap2.put(fVar2.getClass().getName(), fVar2);
            }
            if (hashMap2.isEmpty()) {
                throw new IllegalStateException("No HttpSenderProvider found on classpath. Please add dependency on opentelemetry-exporter-sender-okhttp or opentelemetry-exporter-sender-jdk");
            }
            int size = hashMap2.size();
            Logger logger = M6.g.f1885l;
            if (size == 1) {
                fVar = (S6.f) hashMap2.values().stream().findFirst().get();
            } else {
                String b9 = k6.d.b("io.opentelemetry.exporter.internal.http.HttpSenderProvider", "");
                if (b9.isEmpty()) {
                    logger.log(Level.WARNING, "Multiple HttpSenderProvider found. Please include only one, or specify preference setting io.opentelemetry.exporter.internal.http.HttpSenderProvider to the FQCN of the preferred provider.");
                    fVar = (S6.f) hashMap2.values().stream().findFirst().get();
                } else {
                    if (!hashMap2.containsKey(b9)) {
                        throw new IllegalStateException("No HttpSenderProvider matched configured io.opentelemetry.exporter.internal.http.HttpSenderProvider: ".concat(b9));
                    }
                    fVar = (S6.f) hashMap2.get(b9);
                }
            }
            String str = gVar.f1887b;
            long j6 = gVar.f1888c;
            a4.e eVar = gVar.f1892g;
            if (startsWith) {
                sSLContext = null;
            } else {
                eVar.getClass();
                try {
                    SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                    sSLContext2.init(null, null, null);
                    sSLContext = sSLContext2;
                } catch (KeyManagementException | NoSuchAlgorithmException e9) {
                    throw new IllegalArgumentException(e9);
                }
            }
            if (!startsWith) {
                eVar.getClass();
            }
            if (str == null) {
                throw new NullPointerException("Null endpoint");
            }
            fVar.getClass();
            S6.e eVar2 = new S6.e(str, j6, gVar.f1889d, dVar, gVar.f1893h, sSLContext);
            logger.log(Level.FINE, "Using HttpSender: ".concat(S6.e.class.getName()));
            R6.b bVar = new R6.b(gVar, new M6.b(new a7.k(gVar.f1886a), eVar2, gVar.i, gVar.f1894j, gVar.f1887b));
            return z3 ? new H5.b(bVar) : bVar;
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Invalid endpoint, must be a URL: ".concat(endpoint), e10);
        }
    }

    public static A8.b j(int i) {
        return i != 0 ? i != 1 ? new E3.i() : new E3.d() : new E3.i();
    }

    public static final boolean k(char c9, char c10, boolean z3) {
        if (c9 == c10) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c9);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static i8.p l(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        Z2.e a9 = i8.p.f38167b.a(0, str);
        if (a9 == null) {
            throw new IllegalArgumentException(u1.h.b('\"', "No subtype found for: \"", str));
        }
        if (((Q7.f) a9.f4172w) == null) {
            a9.f4172w = new Q7.f(a9);
        }
        Q7.f fVar = (Q7.f) a9.f4172w;
        kotlin.jvm.internal.h.b(fVar);
        String str2 = (String) fVar.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
        if (((Q7.f) a9.f4172w) == null) {
            a9.f4172w = new Q7.f(a9);
        }
        Q7.f fVar2 = (Q7.f) a9.f4172w;
        kotlin.jvm.internal.h.b(fVar2);
        String lowerCase2 = ((String) fVar2.get(2)).toLowerCase(locale);
        kotlin.jvm.internal.h.d(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = (Matcher) a9.f4170u;
        int i = V2.a.x(matcher.start(), matcher.end()).f2018u;
        while (true) {
            int i6 = i + 1;
            if (i6 >= str.length()) {
                return new i8.p(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            Z2.e a10 = i8.p.f38168c.a(i6, str);
            if (a10 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(i6);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            Q7.h hVar = (Q7.h) a10.f4171v;
            Q7.e c9 = hVar.c(1);
            String str3 = c9 != null ? c9.f2679a : null;
            Matcher matcher2 = (Matcher) a10.f4170u;
            if (str3 == null) {
                i = V2.a.x(matcher2.start(), matcher2.end()).f2018u;
            } else {
                Q7.e c10 = hVar.c(2);
                String str4 = c10 != null ? c10.f2679a : null;
                if (str4 == null) {
                    Q7.e c11 = hVar.c(3);
                    kotlin.jvm.internal.h.b(c11);
                    str4 = c11.f2679a;
                } else if (Q7.j.m0('\'', str4) && str4.length() > 0 && k(str4.charAt(Q7.j.X(str4)), '\'', false) && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                    kotlin.jvm.internal.h.d(str4, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i = V2.a.x(matcher2.start(), matcher2.end()).f2018u;
            }
        }
    }

    public static final int m(Cursor c9, String str) {
        String str2;
        kotlin.jvm.internal.h.e(c9, "c");
        int columnIndex = c9.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c9.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = c9.getColumnNames();
                    kotlin.jvm.internal.h.d(columnNames, "columnNames");
                    String concat = com.anythink.core.common.d.j.f12378z.concat(str);
                    String b9 = u1.h.b('`', com.anythink.core.common.d.j.f12378z, str);
                    int length = columnNames.length;
                    int i = 0;
                    int i6 = 0;
                    while (i6 < length) {
                        String str3 = columnNames[i6];
                        int i9 = i + 1;
                        if (str3.length() >= str.length() + 2 && (Q7.q.K(str3, concat) || (str3.charAt(0) == '`' && Q7.q.K(str3, b9)))) {
                            columnIndex = i;
                            break;
                        }
                        i6++;
                        i = i9;
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c9.getColumnNames();
            kotlin.jvm.internal.h.d(columnNames2, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i10 = 0;
            for (String str4 : columnNames2) {
                i10++;
                if (i10 > 1) {
                    sb.append((CharSequence) ", ");
                }
                O3.b.c(sb, str4, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
        } catch (Exception e9) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e9);
            str2 = com.anythink.core.common.v.m.f16809e;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static final boolean n(char c9) {
        return Character.isWhitespace(c9) || Character.isSpaceChar(c9);
    }

    public static C0512b o(MappedByteBuffer mappedByteBuffer) {
        long j6;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i6 = 0;
        while (true) {
            if (i6 >= i) {
                j6 = -1;
                break;
            }
            int i9 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j6 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i9) {
                break;
            }
            i6++;
        }
        if (j6 != -1) {
            duplicate.position(duplicate.position() + ((int) (j6 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j9 = duplicate.getInt() & 4294967295L;
            for (int i10 = 0; i10 < j9; i10++) {
                int i11 = duplicate.getInt();
                long j10 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i11 || 1701669481 == i11) {
                    duplicate.position((int) (j10 + j6));
                    C0512b c0512b = new C0512b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c0512b.f2045w = duplicate;
                    c0512b.f2042n = position;
                    int i12 = position - duplicate.getInt(position);
                    c0512b.f2043u = i12;
                    c0512b.f2044v = ((ByteBuffer) c0512b.f2045w).getShort(i12);
                    return c0512b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static TypedValue p(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean q(Context context, int i, boolean z3) {
        TypedValue p9 = p(context, i);
        return (p9 == null || p9.type != 18) ? z3 : p9.data != 0;
    }

    public static TypedValue r(Context context, String str, int i) {
        TypedValue p9 = p(context, i);
        if (p9 != null) {
            return p9;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static void s(View view, E3.g gVar) {
        C5196a c5196a = gVar.f766n.f737b;
        if (c5196a == null || !c5196a.f41769a) {
            return;
        }
        float f3 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = X.f2054a;
            f3 += L.i((View) parent);
        }
        E3.f fVar = gVar.f766n;
        if (fVar.f746l != f3) {
            fVar.f746l = f3;
            gVar.m();
        }
    }

    public static synchronized E t(Context context, Intent intent) {
        g gVar;
        synchronized (F.class) {
            try {
                if (f1679a == null) {
                    g gVar2 = new g(context.getApplicationContext(), intent);
                    gVar2.f1695d = new BinderC0320f(gVar2);
                    gVar2.f1693b.f1746e.add(gVar2);
                    f1679a = gVar2;
                }
                gVar = f1679a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static boolean u(int i) {
        C3301ha c3301ha = AbstractC3569ma.f32336p4;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            return ((Boolean) rVar.f40210c.a(AbstractC3569ma.f32346q4)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:3|4|5|(5:8|9|10|11|6)|66|67|68|69|(1:71)(1:74)|72|14|(7:58|59|17|18|19|20|(10:22|(8:26|27|(2:29|(1:31)(1:49))(1:50)|32|33|(3:42|43|(1:45))|35|(2:37|38))|51|27|(0)(0)|32|33|(0)|35|(0))(10:52|(8:54|27|(0)(0)|32|33|(0)|35|(0))|51|27|(0)(0)|32|33|(0)|35|(0)))|16|17|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
    
        r3 = u2.z.f41322b;
        v2.i.d("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0153 A[Catch: JSONException -> 0x014c, TRY_LEAVE, TryCatch #6 {JSONException -> 0x014c, blocks: (B:19:0x011b, B:31:0x0148, B:49:0x014e, B:50:0x0153), top: B:18:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject v(Context context, View view) {
        int i;
        ViewParent parent;
        String str;
        int hashCode;
        int i6;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view != null) {
            int i9 = 1;
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int[] iArr2 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i = i9;
                    try {
                        iArr2[0] = Math.min(viewGroup.getMeasuredWidth(), iArr2[0]);
                        iArr2[i] = Math.min(viewGroup.getMeasuredHeight(), iArr2[i]);
                        parent2 = parent2.getParent();
                        i9 = i;
                    } catch (Exception unused) {
                        int i10 = u2.z.f41322b;
                        v2.i.f("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                        }
                        str = "";
                        hashCode = str.hashCode();
                        if (hashCode == -2066603854) {
                        }
                    }
                }
                i = i9;
                JSONObject jSONObject3 = new JSONObject();
                int measuredWidth = view.getMeasuredWidth();
                C4900p c4900p = C4900p.f40199g;
                v2.d dVar = c4900p.f40200a;
                v2.d dVar2 = c4900p.f40200a;
                jSONObject3.put("width", dVar.h(context, measuredWidth));
                jSONObject3.put("height", dVar2.h(context, view.getMeasuredHeight()));
                jSONObject3.put("x", dVar2.h(context, iArr[0]));
                jSONObject3.put("y", dVar2.h(context, iArr[i]));
                jSONObject3.put("maximum_visible_width", dVar2.h(context, iArr2[0]));
                jSONObject3.put("maximum_visible_height", dVar2.h(context, iArr2[i]));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put("frame", jSONObject3);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = D(context, rect);
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("width", 0);
                    jSONObject4.put("height", 0);
                    jSONObject4.put("x", dVar2.h(context, iArr[0]));
                    jSONObject4.put("y", dVar2.h(context, iArr[i]));
                    jSONObject4.put("relative_to", "window");
                    jSONObject = jSONObject4;
                }
                jSONObject2.put("visible_bounds", jSONObject);
            } catch (Exception unused2) {
                i = i9;
            }
            parent = view.getParent();
            if (parent != null) {
                try {
                    str = (String) parent.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent, new Object[0]);
                } catch (IllegalAccessException e9) {
                    e = e9;
                    int i11 = u2.z.f41322b;
                    v2.i.d("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (NoSuchMethodException unused3) {
                } catch (SecurityException e10) {
                    e = e10;
                    int i112 = u2.z.f41322b;
                    v2.i.d("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (InvocationTargetException e11) {
                    e = e11;
                    int i1122 = u2.z.f41322b;
                    v2.i.d("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                }
                hashCode = str.hashCode();
                if (hashCode == -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        i6 = i;
                        if (i6 != 0) {
                            jSONObject2.put("native_template_type", i);
                        } else if (i6 != i) {
                            jSONObject2.put("native_template_type", 0);
                        } else {
                            jSONObject2.put("native_template_type", 2);
                        }
                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.c9)).booleanValue()) {
                            try {
                                if (view.getLayoutParams() != null) {
                                    jSONObject2.put("view_width_layout_type", E(r0.width) - 1);
                                    jSONObject2.put("view_height_layout_type", E(r0.height) - 1);
                                }
                            } catch (Exception unused4) {
                                u2.z.k("Unable to get native ad view layout types");
                            }
                        }
                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.g9)).booleanValue()) {
                            try {
                                jSONObject2.put("alpha", view.getAlpha());
                            } catch (JSONException e12) {
                                int i12 = u2.z.f41322b;
                                v2.i.d("Could not log container view alpha signal to JSON", e12);
                            }
                        }
                    }
                    i6 = -1;
                    if (i6 != 0) {
                    }
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.c9)).booleanValue()) {
                    }
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.g9)).booleanValue()) {
                    }
                } else {
                    if (str.equals("small_template")) {
                        i6 = 0;
                        if (i6 != 0) {
                        }
                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.c9)).booleanValue()) {
                        }
                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.g9)).booleanValue()) {
                        }
                    }
                    i6 = -1;
                    if (i6 != 0) {
                    }
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.c9)).booleanValue()) {
                    }
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.g9)).booleanValue()) {
                    }
                }
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode == -2066603854) {
            }
        }
        return jSONObject2;
    }

    public static JSONObject w(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                C3301ha c3301ha = AbstractC3569ma.Y8;
                q2.r rVar = q2.r.f40207e;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2 = rVar.f40210c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).booleanValue()) {
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.Z8)).booleanValue()) {
                        u2.D d2 = C4835j.f39733C.f39738c;
                        jSONObject.put("contained_in_scroll_view", u2.D.a(view) != 0);
                    }
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.a9)).booleanValue()) {
                        u2.D d9 = C4835j.f39733C.f39738c;
                        jSONObject.put("scroll_view_type", u2.D.a(view));
                        return jSONObject;
                    }
                } else {
                    u2.D d10 = C4835j.f39733C.f39738c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject x(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                u2.D d2 = C4835j.f39733C.f39738c;
                jSONObject.put("can_show_on_lock_screen", u2.D.K(view));
                boolean z3 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z3 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z3);
                return jSONObject;
            } catch (JSONException unused) {
                int i = u2.z.f41322b;
                v2.i.f("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject y(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        int[] iArr;
        JSONObject jSONObject;
        ViewGroup.LayoutParams layoutParams;
        String str2 = "ad_view";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            C4900p c4900p = C4900p.f40199g;
                            v2.d dVar = c4900p.f40200a;
                            v2.d dVar2 = c4900p.f40200a;
                            jSONObject4.put("width", dVar.h(context, measuredWidth));
                            jSONObject4.put("height", dVar2.h(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", dVar2.h(context, iArr3[0] - iArr[0]));
                            jSONObject4.put("y", dVar2.h(context, iArr3[1] - iArr[1]));
                            jSONObject4.put("relative_to", str2);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = D(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", dVar2.h(context, iArr3[0] - iArr[0]));
                                jSONObject.put("y", dVar2.h(context, iArr3[1] - iArr[1]));
                                jSONObject.put("relative_to", str2);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                C3301ha c3301ha = AbstractC3569ma.b9;
                                q2.r rVar = q2.r.f40207e;
                                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
                                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2 = rVar.f40210c;
                                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.c9)).booleanValue() && (layoutParams = view2.getLayoutParams()) != null) {
                                    jSONObject3.put("view_width_layout_type", E(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", E(layoutParams.height) - 1);
                                }
                                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.f9)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str2;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put(com.anythink.basead.exoplayer.k.o.f8446c, textView.getText());
                                } catch (JSONException unused) {
                                    int i6 = u2.z.f41322b;
                                    v2.i.f("Unable to get asset views information");
                                    it = it2;
                                    str2 = str;
                                    iArr2 = iArr;
                                    i = 2;
                                }
                            } else {
                                str = str2;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.g9)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str2;
                        }
                    } catch (JSONException unused3) {
                        str = str2;
                        iArr = iArr2;
                    }
                    it = it2;
                    str2 = str;
                    iArr2 = iArr;
                    i = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject z(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e9) {
            e = e9;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                int i = point2.x;
                C4900p c4900p = C4900p.f40199g;
                jSONObject3.put("x", c4900p.f40200a.h(context, i));
                jSONObject3.put("y", c4900p.f40200a.h(context, point2.y));
                jSONObject3.put("start_x", c4900p.f40200a.h(context, point.x));
                jSONObject3.put("start_y", c4900p.f40200a.h(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e10) {
                int i6 = u2.z.f41322b;
                v2.i.d("Error occurred while putting signals into JSON object.", e10);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            jSONObject2 = jSONObject;
            int i9 = u2.z.f41322b;
            v2.i.d("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }
}
