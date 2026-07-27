package com.bumptech.glide;

import D.y;
import O.g0;
import O7.AbstractC0399y;
import O7.C0391p;
import T7.s;
import a.AbstractC0415a;
import a8.L;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.anythink.core.common.n.b.A;
import com.google.android.gms.internal.ads.CL;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import k.C4616d;
import kotlin.jvm.internal.u;
import m.c1;
import t0.AbstractC5019C;
import t0.AbstractC5051n;
import t0.C5029M;
import w7.EnumC5179a;
import x7.AbstractC5217a;

/* loaded from: classes.dex */
public abstract class g implements Z7.b, Z7.a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f23546a = true;

    public static void C(int i, int i4, int i9) {
        if (i < 0 || i4 > i9) {
            StringBuilder h9 = AbstractC5051n.h(i, i4, "startIndex: ", ", endIndex: ", ", size: ");
            h9.append(i9);
            throw new IndexOutOfBoundsException(h9.toString());
        }
        if (i > i4) {
            throw new IllegalArgumentException(AbstractC5051n.c(i, i4, "startIndex: ", " > endIndex: "));
        }
    }

    public static void D(int i, int i4, int i9) {
        if (i < 0 || i4 > i9) {
            StringBuilder h9 = AbstractC5051n.h(i, i4, "fromIndex: ", ", toIndex: ", ", size: ");
            h9.append(i9);
            throw new IndexOutOfBoundsException(h9.toString());
        }
        if (i > i4) {
            throw new IllegalArgumentException(AbstractC5051n.c(i, i4, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int E(C5029M c5029m, androidx.emoji2.text.g gVar, View view, View view2, AbstractC5019C abstractC5019C, boolean z8) {
        if (abstractC5019C.v() == 0 || c5029m.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z8) {
            return Math.abs(AbstractC5019C.H(view) - AbstractC5019C.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int F(C5029M c5029m, androidx.emoji2.text.g gVar, View view, View view2, AbstractC5019C abstractC5019C, boolean z8, boolean z9) {
        if (abstractC5019C.v() == 0 || c5029m.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z9 ? Math.max(0, (c5029m.b() - Math.max(AbstractC5019C.H(view), AbstractC5019C.H(view2))) - 1) : Math.max(0, Math.min(AbstractC5019C.H(view), AbstractC5019C.H(view2)));
        if (z8) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC5019C.H(view) - AbstractC5019C.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int G(C5029M c5029m, androidx.emoji2.text.g gVar, View view, View view2, AbstractC5019C abstractC5019C, boolean z8) {
        if (abstractC5019C.v() == 0 || c5029m.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z8) {
            return c5029m.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC5019C.H(view) - AbstractC5019C.H(view2)) + 1)) * c5029m.b());
    }

    public static boolean J(String current, String str) {
        kotlin.jvm.internal.h.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i = 0;
            int i4 = 0;
            int i9 = 0;
            while (true) {
                if (i < current.length()) {
                    char charAt = current.charAt(i);
                    int i10 = i9 + 1;
                    if (i9 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i4 - 1 == 0 && i9 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i4++;
                    }
                    i++;
                    i9 = i10;
                } else if (i4 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return kotlin.jvm.internal.h.a(M7.j.h0(substring).toString(), str);
                }
            }
        }
        return false;
    }

    public static boolean K() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            K3.g.c();
            K3.g c4 = K3.g.c();
            c4.a();
            Context context = c4.f1623a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static int L(int i, int i4, float f6) {
        if (i == i4 || f6 <= 0.0f) {
            return i;
        }
        if (f6 >= 1.0f) {
            return i4;
        }
        float f9 = ((i >> 24) & com.anythink.basead.exoplayer.k.p.f8630b) / 255.0f;
        float f10 = ((i >> 16) & com.anythink.basead.exoplayer.k.p.f8630b) / 255.0f;
        float f11 = ((i >> 8) & com.anythink.basead.exoplayer.k.p.f8630b) / 255.0f;
        float f12 = ((i4 >> 24) & com.anythink.basead.exoplayer.k.p.f8630b) / 255.0f;
        float f13 = ((i4 >> 16) & com.anythink.basead.exoplayer.k.p.f8630b) / 255.0f;
        float f14 = ((i4 >> 8) & com.anythink.basead.exoplayer.k.p.f8630b) / 255.0f;
        float y6 = y(f10);
        float y8 = y(f11);
        float y9 = y((i & com.anythink.basead.exoplayer.k.p.f8630b) / 255.0f);
        float y10 = y(f13);
        float y11 = y(f14);
        float y12 = y((i4 & com.anythink.basead.exoplayer.k.p.f8630b) / 255.0f);
        float a9 = CL.a(f12, f9, f6, f9);
        float a10 = CL.a(y10, y6, f6, y6);
        float a11 = CL.a(y11, y8, f6, y8);
        float a12 = CL.a(y12, y9, f6, y9);
        float z8 = z(a10) * 255.0f;
        float z9 = z(a11) * 255.0f;
        return Math.round(z(a12) * 255.0f) | (Math.round(z8) << 16) | (Math.round(a9 * 255.0f) << 24) | (Math.round(z9) << 8);
    }

    public static Drawable M(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f23546a) {
                return O(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e6) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e6;
            }
            return E.a.b(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f23546a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = F.o.f927a;
        return F.j.a(resources, i, theme);
    }

    public static final int N(int i, int i4, int i9) {
        if (i9 > 0) {
            if (i < i4) {
                int i10 = i4 % i9;
                if (i10 < 0) {
                    i10 += i9;
                }
                int i11 = i % i9;
                if (i11 < 0) {
                    i11 += i9;
                }
                int i12 = (i10 - i11) % i9;
                if (i12 < 0) {
                    i12 += i9;
                }
                return i4 - i12;
            }
        } else {
            if (i9 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i4) {
                int i13 = -i9;
                int i14 = i % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i4 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i16 + i4;
            }
        }
        return i4;
    }

    public static Drawable O(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C4616d c4616d = new C4616d(context);
            c4616d.f38609b = theme;
            c4616d.a(theme.getResources().getConfiguration());
            context = c4616d;
        }
        return f.h(context, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void P(Intent intent) {
        long parseLong;
        if (T(intent)) {
            Q("_nr", intent.getExtras());
        }
        int i = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : K()) {
            W1.e eVar = (W1.e) FirebaseMessaging.f36353l.get();
            if (eVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            g4.d dVar = null;
            r4 = null;
            String str = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    i = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        i = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                    }
                }
                int i4 = i;
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        K3.g c4 = K3.g.c();
                        try {
                            Object obj2 = Z3.c.f4255m;
                            string = (String) AbstractC0415a.e(((Z3.c) c4.b(Z3.d.class)).c());
                        } catch (InterruptedException e6) {
                            e = e6;
                            throw new RuntimeException(e);
                        }
                    } catch (InterruptedException | ExecutionException e9) {
                        e = e9;
                    }
                }
                String str2 = string;
                K3.g c9 = K3.g.c();
                c9.a();
                String packageName = c9.f1623a.getPackageName();
                g4.b bVar = I0.j.u(extras) ? g4.b.DISPLAY_NOTIFICATION : g4.b.DATA_MESSAGE;
                String string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString("message_id");
                }
                String str3 = string2 != null ? string2 : "";
                String string3 = extras.getString("from");
                if (string3 != null && string3.startsWith("/topics/")) {
                    str = string3;
                }
                String str4 = str != null ? str : "";
                String string4 = extras.getString("collapse_key");
                String str5 = string4 != null ? string4 : "";
                String string5 = extras.getString("google.c.a.m_l");
                String str6 = string5 != null ? string5 : "";
                String string6 = extras.getString("google.c.a.c_l");
                String str7 = string6 != null ? string6 : "";
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e10) {
                        Log.w("FirebaseMessaging", "error parsing project number", e10);
                    }
                    dVar = new g4.d(parseLong > 0 ? parseLong : 0L, str3, str2, bVar, packageName, str5, i4, str4, str6, str7);
                }
                K3.g c10 = K3.g.c();
                c10.a();
                K3.i iVar = c10.f1625c;
                String str8 = iVar.f1640e;
                if (str8 != null) {
                    try {
                        parseLong = Long.parseLong(str8);
                    } catch (NumberFormatException e11) {
                        Log.w("FirebaseMessaging", "error parsing sender ID", e11);
                    }
                    dVar = new g4.d(parseLong > 0 ? parseLong : 0L, str3, str2, bVar, packageName, str5, i4, str4, str6, str7);
                }
                c10.a();
                String str9 = iVar.f1637b;
                if (str9.startsWith("1:")) {
                    String[] split = str9.split(":");
                    if (split.length >= 2) {
                        String str10 = split[1];
                        if (!str10.isEmpty()) {
                            try {
                                parseLong = Long.parseLong(str10);
                            } catch (NumberFormatException e12) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e12);
                            }
                        }
                    }
                    parseLong = 0;
                } else {
                    try {
                        parseLong = Long.parseLong(str9);
                    } catch (NumberFormatException e13) {
                        Log.w("FirebaseMessaging", "error parsing app ID", e13);
                    }
                }
                dVar = new g4.d(parseLong > 0 ? parseLong : 0L, str3, str2, bVar, packageName, str5, i4, str4, str6, str7);
            }
            if (dVar == null) {
                return;
            }
            try {
                W1.b bVar2 = new W1.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                W1.c cVar = new W1.c("proto");
                A a9 = new A(10);
                Z1.n nVar = (Z1.n) eVar;
                Set set = nVar.f4234a;
                if (!set.contains(cVar)) {
                    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
                }
                new Y2.e(nVar.f4235b, cVar, a9, nVar.f4236c).J(new W1.a(new g4.e(dVar), bVar2));
            } catch (RuntimeException e14) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e14);
            }
        }
    }

    public static void Q(String str, Bundle bundle) {
        try {
            K3.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e6) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e6);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e9) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e9);
                }
            }
            String str2 = I0.j.u(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            if (K3.g.c().b(L3.a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void R(Window window, boolean z8) {
        if (Build.VERSION.SDK_INT >= 30) {
            g0.a(window, z8);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z8 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void S(Drawable drawable, int i) {
        H.a.g(drawable, i);
    }

    public static boolean T(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final Object U(s sVar, s sVar2, E7.p pVar) {
        Object c0391p;
        Object K8;
        try {
            if (pVar instanceof AbstractC5217a) {
                u.b(2, pVar);
                c0391p = pVar.invoke(sVar2, sVar);
            } else {
                c0391p = w8.a.m(pVar, sVar2, sVar);
            }
        } catch (Throwable th) {
            c0391p = new C0391p(th, false);
        }
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        if (c0391p == enumC5179a || (K8 = sVar.K(c0391p)) == AbstractC0399y.f2647e) {
            return enumC5179a;
        }
        if (K8 instanceof C0391p) {
            throw ((C0391p) K8).f2619a;
        }
        return AbstractC0399y.w(K8);
    }

    public static void V(int i, int i4) {
        String D8;
        if (i < 0 || i >= i4) {
            if (i < 0) {
                D8 = h.D("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(y.j(i4, "negative size: ", new StringBuilder(String.valueOf(i4).length() + 15)));
                }
                D8 = h.D("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(D8);
        }
    }

    public static void W(int i, int i4, int i9) {
        if (i < 0 || i4 < i || i4 > i9) {
            throw new IndexOutOfBoundsException((i < 0 || i > i9) ? X(i, i9, "start index") : (i4 < 0 || i4 > i9) ? X(i4, i9, "end index") : h.D("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    public static String X(int i, int i4, String str) {
        if (i < 0) {
            return h.D("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return h.D("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(y.j(i4, "negative size: ", new StringBuilder(String.valueOf(i4).length() + 15)));
    }

    public static float y(float f6) {
        return f6 <= 0.04045f ? f6 / 12.92f : (float) Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float z(float f6) {
        return f6 <= 0.0031308f ? f6 * 12.92f : (float) ((Math.pow(f6, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public M2.c A(Context context, Looper looper, c1 c1Var, Object obj, M2.i iVar, M2.j jVar) {
        return B(context, looper, c1Var, obj, iVar, jVar);
    }

    public M2.c B(Context context, Looper looper, c1 c1Var, Object obj, M2.i iVar, M2.j jVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public Object H(X7.a deserializer) {
        kotlin.jvm.internal.h.e(deserializer, "deserializer");
        return deserializer.b(this);
    }

    public void I() {
        throw new X7.c(kotlin.jvm.internal.s.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // Z7.a
    public char a(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return e();
    }

    @Override // Z7.a
    public byte b(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return u();
    }

    @Override // Z7.b
    public boolean c() {
        I();
        throw null;
    }

    @Override // Z7.a
    public short d(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return v();
    }

    @Override // Z7.b
    public char e() {
        I();
        throw null;
    }

    @Override // Z7.a
    public float f(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return w();
    }

    @Override // Z7.a
    public double g(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return x();
    }

    @Override // Z7.b
    public abstract int h();

    public Object i(Y7.e descriptor, int i, X7.a deserializer, Object obj) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        kotlin.jvm.internal.h.e(deserializer, "deserializer");
        return H(deserializer);
    }

    @Override // Z7.b
    public String j() {
        I();
        throw null;
    }

    @Override // Z7.a
    public boolean k(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return c();
    }

    @Override // Z7.a
    public long l(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return m();
    }

    @Override // Z7.b
    public abstract long m();

    @Override // Z7.b
    public boolean n() {
        return true;
    }

    public void p(Y7.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
    }

    @Override // Z7.b
    public Z7.b q(Y7.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return this;
    }

    @Override // Z7.a
    public Z7.b r(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return q(descriptor.i(i));
    }

    @Override // Z7.b
    public Z7.a s(Y7.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return this;
    }

    @Override // Z7.a
    public int t(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return h();
    }

    @Override // Z7.b
    public abstract byte u();

    @Override // Z7.b
    public abstract short v();

    @Override // Z7.b
    public float w() {
        I();
        throw null;
    }

    @Override // Z7.b
    public double x() {
        I();
        throw null;
    }
}
