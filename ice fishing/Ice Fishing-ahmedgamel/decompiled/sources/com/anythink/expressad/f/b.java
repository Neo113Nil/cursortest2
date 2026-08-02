package com.anythink.expressad.f;

import android.content.Context;
import android.text.TextUtils;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18440a = "b";

    /* renamed from: b, reason: collision with root package name */
    public static final int f18441b = 500;

    /* renamed from: c, reason: collision with root package name */
    public static final String f18442c = "anythink";

    /* renamed from: d, reason: collision with root package name */
    private static volatile b f18443d;

    /* renamed from: e, reason: collision with root package name */
    private static HashMap<String, c> f18444e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static a f18445f = null;

    private b() {
    }

    public static b a() {
        if (f18443d == null) {
            synchronized (b.class) {
                try {
                    if (f18443d == null) {
                        f18443d = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18443d;
    }

    public static a b() {
        if (f18445f == null) {
            f18445f = c();
        }
        return f18445f;
    }

    public static c c(String str, String str2) {
        c g4 = g(str, str2);
        if (g4 != null && g4.k() == 0) {
            g4.l();
        }
        return g4;
    }

    public static c d(String str, String str2) {
        return g(str, str2);
    }

    public static void e(String str, String str2) {
        com.anythink.expressad.foundation.a.a.a.a().a("ivreward_".concat(String.valueOf(str)), str2);
    }

    private static void f(String str, String str2) {
        com.anythink.expressad.foundation.a.a.a.a().a(str, str2);
        a b9 = a.b(str2);
        f18445f = b9;
        if (b9 != null) {
            b9.G();
        }
    }

    private static c g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.c().f();
        }
        String g4 = AbstractC4404f.g(str, "_", str2);
        if (f18444e.containsKey(g4)) {
            return f18444e.get(g4);
        }
        return null;
    }

    private static c d(String str) {
        c cVar = new c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        cVar.v();
        cVar.u();
        cVar.a(str);
        cVar.a(arrayList);
        cVar.b(arrayList2);
        cVar.p();
        cVar.r();
        cVar.q();
        cVar.o();
        cVar.n();
        cVar.j();
        cVar.l();
        cVar.c(100);
        cVar.d(0);
        cVar.h();
        cVar.e();
        cVar.c();
        cVar.w();
        cVar.x();
        return cVar;
    }

    public static String b(String str) {
        return com.anythink.expressad.foundation.a.a.a.a().a("ivreward_".concat(String.valueOf(str)));
    }

    public static void c(String str) {
        com.anythink.expressad.foundation.a.a.a.a().b("ivreward_".concat(String.valueOf(str)));
    }

    public static c b(String str, String str2) {
        c g4 = g(str, str2);
        return g4 == null ? new c() : g4;
    }

    public static a c() {
        a aVar = new a();
        aVar.A();
        aVar.B();
        aVar.x();
        aVar.y();
        aVar.v();
        aVar.t();
        aVar.m();
        aVar.a("anythink");
        aVar.j();
        aVar.p();
        aVar.o();
        aVar.r();
        aVar.e();
        aVar.d();
        aVar.f();
        aVar.g();
        aVar.h();
        aVar.i();
        aVar.c();
        aVar.d("");
        aVar.a(120);
        aVar.N();
        aVar.M();
        aVar.a(100);
        aVar.P();
        aVar.e(com.anythink.expressad.foundation.g.a.cL);
        aVar.d(com.anythink.expressad.foundation.g.a.cO);
        aVar.c(com.anythink.expressad.foundation.g.a.cN);
        aVar.a();
        aVar.f(com.anythink.expressad.foundation.g.a.cT);
        aVar.b(10);
        return aVar;
    }

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        return b().Q();
    }

    private static void a(Context context, String str) {
        try {
            Map<String, ?> all = context.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19095s, 0).getAll();
            for (String str2 : all.keySet()) {
                if (str2.startsWith(str + "_")) {
                    f18444e.put(str2, c.b((String) all.get(str2)));
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static c a(String str, String str2) {
        c c9 = c(str, str2);
        return c9 == null ? new c() : c9;
    }

    private static void a(String str, String str2, String str3) {
        String g4 = AbstractC4404f.g(str, "_", str2);
        com.anythink.expressad.foundation.a.a.a.a().a(g4, str3);
        f18444e.put(g4, c.b(str3));
    }
}
