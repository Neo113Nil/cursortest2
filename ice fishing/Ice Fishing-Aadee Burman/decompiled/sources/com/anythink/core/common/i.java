package com.anythink.core.common;

import D.y;
import android.text.TextUtils;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.ao;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile i f14226a;

    private i() {
    }

    private static String a(String str) {
        return str;
    }

    public static String b() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.f12458x : j.e.f12441f);
    }

    public static String c() {
        String str = l() ? j.e.f12459y : j.e.f12442g;
        com.anythink.core.d.b g4 = y.g(y.h());
        return (g4 == null || TextUtils.isEmpty(g4.aH())) ? com.anythink.core.common.g.c.a().a(str) : g4.aH();
    }

    public static String d() {
        ao D8 = y.h().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12430E : j.e.f12447m, com.anythink.core.common.m.b.g.i);
        return D8 != null ? a(D8.b(), a9) : a9;
    }

    public static String e() {
        ao D8 = y.h().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12431F : j.e.f12448n, com.anythink.core.common.m.b.g.f14524g);
        return D8 != null ? a(D8.d(), a9) : a9;
    }

    public static String f() {
        ao D8 = y.h().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12432G : j.e.f12449o, com.anythink.core.common.m.b.g.i);
        return D8 != null ? a(D8.a(), a9) : a9;
    }

    public static String g() {
        com.anythink.core.d.b g4 = y.g(y.h());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12433H : j.e.f12451q, com.anythink.core.common.m.b.g.f14524g);
        return g4 != null ? a(g4.A(), a9) : a9;
    }

    public static String h() {
        com.anythink.core.d.b g4 = y.g(y.h());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12427B : j.e.f12444j, com.anythink.core.common.m.b.g.f14524g);
        return g4 != null ? a(g4.am(), a9) : a9;
    }

    public static String i() {
        com.anythink.core.d.b g4 = y.g(y.h());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12426A : j.e.i, com.anythink.core.common.m.b.g.f14525h);
        return g4 != null ? a(g4.ar(), a9) : a9;
    }

    public static String j() {
        com.anythink.core.d.b g4 = y.g(y.h());
        if (g4 != null) {
            return a(g4.aj(), "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html");
        }
        com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
        String gdprUrl = c9 != null ? c9.getGdprUrl() : "";
        return !TextUtils.isEmpty(gdprUrl) ? gdprUrl : "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html";
    }

    public static String k() {
        return j.e.f12454t;
    }

    public static boolean l() {
        return com.anythink.core.common.d.t.b().L() && com.anythink.core.common.d.t.b().K();
    }

    public static String m() {
        com.anythink.core.d.b g4 = y.g(y.h());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12460z : j.e.f12443h, com.anythink.core.common.m.b.g.f14527k);
        return g4 != null ? a(g4.aG(), a9) : a9;
    }

    public static String n() {
        com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
        String cdnUrl = c9 != null ? c9.getCdnUrl() : "";
        if (TextUtils.isEmpty(cdnUrl)) {
            cdnUrl = "https://se.zxcvbnmpo.com/v2/open/ns";
        }
        com.anythink.core.d.b a9 = com.anythink.core.d.d.a();
        if (a9 == null) {
            return cdnUrl;
        }
        String ab = a9.ab();
        return !TextUtils.isEmpty(ab) ? ab.startsWith("http") ? ab.concat("/v2/open/ns") : com.anythink.core.common.v.q.a(cdnUrl, ab) : cdnUrl;
    }

    public static String o() {
        com.anythink.core.d.b a9 = com.anythink.core.d.d.a();
        com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
        String cdnTcpDm = (c9 == null || c9.getOsDmEntity() == null) ? "" : c9.getOsDmEntity().getCdnTcpDm();
        if (TextUtils.isEmpty(cdnTcpDm)) {
            cdnTcpDm = j.g.b.f12475c;
        }
        if (a9 != null) {
            String aN = a9.aN();
            if (!TextUtils.isEmpty(aN)) {
                return aN;
            }
        }
        return cdnTcpDm;
    }

    public static int p() {
        int aO;
        com.anythink.core.d.b g4 = y.g(y.h());
        return (g4 == null || (aO = g4.aO()) <= 0) ? j.g.b.f12473a : aO;
    }

    public static String q() {
        String str = l() ? j.e.f12435K : j.e.f12457w;
        com.anythink.core.d.b g4 = y.g(y.h());
        return (g4 == null || TextUtils.isEmpty(g4.aP())) ? com.anythink.core.common.g.c.a().a(str) : g4.aP();
    }

    private static String r() {
        return l() ? j.e.f12428C : j.e.f12445k;
    }

    private static String s() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.f12434I : j.e.f12452r);
    }

    private static String t() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.J : j.e.f12456v);
    }

    public static i a() {
        if (f14226a == null) {
            synchronized (i.class) {
                try {
                    if (f14226a == null) {
                        f14226a = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14226a;
    }

    public static String b(com.anythink.core.d.l lVar) {
        return lVar.M();
    }

    public static String a(com.anythink.core.d.l lVar, boolean z3) {
        if (z3) {
            String R8 = lVar.R();
            lVar.aH();
            if (!TextUtils.isEmpty(R8)) {
                return R8;
            }
        }
        ao D8 = y.h().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12429D : j.e.f12446l, com.anythink.core.common.m.b.g.i);
        return D8 != null ? a(D8.c(), a9) : a9;
    }

    public static String a(com.anythink.core.d.l lVar) {
        String N8 = lVar.N();
        return TextUtils.isEmpty(N8) ? "" : N8;
    }

    private static String a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }
}
