package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.ao;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile i f15012a;

    private i() {
    }

    private static String a(String str) {
        return str;
    }

    public static String b() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.f13244x : j.e.f13227f);
    }

    public static String c() {
        String str = l() ? j.e.f13245y : j.e.f13228g;
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        return (k9 == null || TextUtils.isEmpty(k9.aH())) ? com.anythink.core.common.g.c.a().a(str) : k9.aH();
    }

    public static String d() {
        ao D8 = com.IceFishing.LiveIceFishing.k.l().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f13216E : j.e.f13233m, com.anythink.core.common.m.b.g.i);
        return D8 != null ? a(D8.b(), a9) : a9;
    }

    public static String e() {
        ao D8 = com.IceFishing.LiveIceFishing.k.l().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f13217F : j.e.f13234n, com.anythink.core.common.m.b.g.f15310g);
        return D8 != null ? a(D8.d(), a9) : a9;
    }

    public static String f() {
        ao D8 = com.IceFishing.LiveIceFishing.k.l().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f13218G : j.e.f13235o, com.anythink.core.common.m.b.g.i);
        return D8 != null ? a(D8.a(), a9) : a9;
    }

    public static String g() {
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f13219H : j.e.f13237q, com.anythink.core.common.m.b.g.f15310g);
        return k9 != null ? a(k9.A(), a9) : a9;
    }

    public static String h() {
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f13213B : j.e.f13230j, com.anythink.core.common.m.b.g.f15310g);
        return k9 != null ? a(k9.am(), a9) : a9;
    }

    public static String i() {
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f13212A : j.e.i, com.anythink.core.common.m.b.g.f15311h);
        return k9 != null ? a(k9.ar(), a9) : a9;
    }

    public static String j() {
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        if (k9 != null) {
            return a(k9.aj(), "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html");
        }
        com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
        String gdprUrl = c9 != null ? c9.getGdprUrl() : "";
        return !TextUtils.isEmpty(gdprUrl) ? gdprUrl : "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html";
    }

    public static String k() {
        return j.e.f13240t;
    }

    public static boolean l() {
        return com.anythink.core.common.d.t.b().L() && com.anythink.core.common.d.t.b().K();
    }

    public static String m() {
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f13246z : j.e.f13229h, com.anythink.core.common.m.b.g.f15313k);
        return k9 != null ? a(k9.aG(), a9) : a9;
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
            cdnTcpDm = j.g.b.f13261c;
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
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        return (k9 == null || (aO = k9.aO()) <= 0) ? j.g.b.f13259a : aO;
    }

    public static String q() {
        String str = l() ? j.e.f13221K : j.e.f13243w;
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        return (k9 == null || TextUtils.isEmpty(k9.aP())) ? com.anythink.core.common.g.c.a().a(str) : k9.aP();
    }

    private static String r() {
        return l() ? j.e.f13214C : j.e.f13231k;
    }

    private static String s() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.f13220I : j.e.f13238r);
    }

    private static String t() {
        return com.anythink.core.common.g.c.a().a(l() ? j.e.J : j.e.f13242v);
    }

    public static i a() {
        if (f15012a == null) {
            synchronized (i.class) {
                try {
                    if (f15012a == null) {
                        f15012a = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15012a;
    }

    public static String b(com.anythink.core.d.l lVar) {
        return lVar.M();
    }

    public static String a(com.anythink.core.d.l lVar, boolean z6) {
        if (z6) {
            String R8 = lVar.R();
            lVar.aH();
            if (!TextUtils.isEmpty(R8)) {
                return R8;
            }
        }
        ao D8 = com.IceFishing.LiveIceFishing.k.l().b(com.anythink.core.common.d.t.b().p()).D();
        String a9 = com.anythink.core.common.g.c.a().a(l() ? j.e.f13215D : j.e.f13232l, com.anythink.core.common.m.b.g.i);
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
