package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.ao;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile i f14383a;

    private i() {
    }

    private static String a(String str) {
        return str;
    }

    public static String b() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.f12615x : j.e.f12598f);
    }

    public static String c() {
        String str = l() ? j.e.f12616y : j.e.f12599g;
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        return (k6 == null || TextUtils.isEmpty(k6.aH())) ? com.anythink.core.common.g.c.a().a(str) : k6.aH();
    }

    public static String d() {
        ao D8 = com.anythink.basead.b.c.i.l().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12587E : j.e.f12604m, com.anythink.core.common.m.b.g.i);
        return D8 != null ? a(D8.b(), a9) : a9;
    }

    public static String e() {
        ao D8 = com.anythink.basead.b.c.i.l().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12588F : j.e.f12605n, com.anythink.core.common.m.b.g.f14681g);
        return D8 != null ? a(D8.d(), a9) : a9;
    }

    public static String f() {
        ao D8 = com.anythink.basead.b.c.i.l().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12589G : j.e.f12606o, com.anythink.core.common.m.b.g.i);
        return D8 != null ? a(D8.a(), a9) : a9;
    }

    public static String g() {
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12590H : j.e.f12608q, com.anythink.core.common.m.b.g.f14681g);
        return k6 != null ? a(k6.A(), a9) : a9;
    }

    public static String h() {
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12584B : j.e.f12601j, com.anythink.core.common.m.b.g.f14681g);
        return k6 != null ? a(k6.am(), a9) : a9;
    }

    public static String i() {
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12583A : j.e.i, com.anythink.core.common.m.b.g.f14682h);
        return k6 != null ? a(k6.ar(), a9) : a9;
    }

    public static String j() {
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        if (k6 != null) {
            return a(k6.aj(), "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html");
        }
        com.anythink.core.common.d.s c4 = com.anythink.core.common.d.t.b().c();
        String gdprUrl = c4 != null ? c4.getGdprUrl() : "";
        return !TextUtils.isEmpty(gdprUrl) ? gdprUrl : "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html";
    }

    public static String k() {
        return j.e.f12611t;
    }

    public static boolean l() {
        return com.anythink.core.common.d.t.b().L() && com.anythink.core.common.d.t.b().K();
    }

    public static String m() {
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12617z : j.e.f12600h, com.anythink.core.common.m.b.g.f14684k);
        return k6 != null ? a(k6.aG(), a9) : a9;
    }

    public static String n() {
        com.anythink.core.common.d.s c4 = com.anythink.core.common.d.t.b().c();
        String cdnUrl = c4 != null ? c4.getCdnUrl() : "";
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
        com.anythink.core.common.d.s c4 = com.anythink.core.common.d.t.b().c();
        String cdnTcpDm = (c4 == null || c4.getOsDmEntity() == null) ? "" : c4.getOsDmEntity().getCdnTcpDm();
        if (TextUtils.isEmpty(cdnTcpDm)) {
            cdnTcpDm = j.g.b.f12632c;
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
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        return (k6 == null || (aO = k6.aO()) <= 0) ? j.g.b.f12630a : aO;
    }

    public static String q() {
        String str = l() ? j.e.f12592K : j.e.f12614w;
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
        return (k6 == null || TextUtils.isEmpty(k6.aP())) ? com.anythink.core.common.g.c.a().a(str) : k6.aP();
    }

    private static String r() {
        return l() ? j.e.f12585C : j.e.f12602k;
    }

    private static String s() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.f12591I : j.e.f12609r);
    }

    private static String t() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.J : j.e.f12613v);
    }

    public static i a() {
        if (f14383a == null) {
            synchronized (i.class) {
                try {
                    if (f14383a == null) {
                        f14383a = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14383a;
    }

    public static String b(com.anythink.core.d.l lVar) {
        return lVar.M();
    }

    public static String a(com.anythink.core.d.l lVar, boolean z8) {
        if (z8) {
            String R8 = lVar.R();
            lVar.aH();
            if (!TextUtils.isEmpty(R8)) {
                return R8;
            }
        }
        ao D8 = com.anythink.basead.b.c.i.l().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f12586D : j.e.f12603l, com.anythink.core.common.m.b.g.i);
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
