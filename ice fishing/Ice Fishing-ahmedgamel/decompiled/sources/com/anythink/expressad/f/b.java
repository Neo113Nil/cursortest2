package com.anythink.expressad.f;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19227a = "b";

    /* renamed from: b, reason: collision with root package name */
    public static final int f19228b = 500;

    /* renamed from: c, reason: collision with root package name */
    public static final String f19229c = "anythink";

    /* renamed from: d, reason: collision with root package name */
    private static volatile b f19230d;

    /* renamed from: e, reason: collision with root package name */
    private static HashMap<String, c> f19231e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static a f19232f = null;

    private b() {
    }

    public static b a() {
        if (f19230d == null) {
            synchronized (b.class) {
                try {
                    if (f19230d == null) {
                        f19230d = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19230d;
    }

    public static a b() {
        if (f19232f == null) {
            f19232f = c();
        }
        return f19232f;
    }

    public static c c(String str, String str2) {
        c g9 = g(str, str2);
        if (g9 != null && g9.k() == 0) {
            g9.l();
        }
        return g9;
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
        f19232f = b9;
        if (b9 != null) {
            b9.G();
        }
    }

    private static c g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.c().f();
        }
        String h3 = Wv.h(str, "_", str2);
        if (f19231e.containsKey(h3)) {
            return f19231e.get(h3);
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
        c g9 = g(str, str2);
        return g9 == null ? new c() : g9;
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
            Map<String, ?> all = context.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19882s, 0).getAll();
            for (String str2 : all.keySet()) {
                if (str2.startsWith(str + "_")) {
                    f19231e.put(str2, c.b((String) all.get(str2)));
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
        String h3 = Wv.h(str, "_", str2);
        com.anythink.expressad.foundation.a.a.a.a().a(h3, str3);
        f19231e.put(h3, c.b(str3));
    }
}
