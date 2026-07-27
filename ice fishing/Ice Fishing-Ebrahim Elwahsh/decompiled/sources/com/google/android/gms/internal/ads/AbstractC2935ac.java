package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ac, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2935ac {

    /* renamed from: a, reason: collision with root package name */
    public static final C2820Vb f29210a = new C2820Vb(12);

    /* renamed from: b, reason: collision with root package name */
    public static final C2820Vb f29211b = new C2820Vb(13);

    /* renamed from: c, reason: collision with root package name */
    public static final C2820Vb f29212c = new C2820Vb(14);

    /* renamed from: d, reason: collision with root package name */
    public static final C2820Vb f29213d = new C2820Vb(15);

    /* renamed from: e, reason: collision with root package name */
    public static final C2820Vb f29214e = new C2820Vb(16);

    /* renamed from: f, reason: collision with root package name */
    public static final C2820Vb f29215f = new C2820Vb(17);

    /* renamed from: g, reason: collision with root package name */
    public static final C2621Jg f29216g = new C2621Jg();

    /* renamed from: h, reason: collision with root package name */
    public static final C2820Vb f29217h = new C2820Vb(25);
    public static final C2803Ub i = new C2803Ub();

    /* renamed from: j, reason: collision with root package name */
    public static final C2871Yb f29218j = new C2871Yb();

    /* renamed from: k, reason: collision with root package name */
    public static final C2820Vb f29219k = new C2820Vb(18);

    /* renamed from: l, reason: collision with root package name */
    public static final C2820Vb f29220l = new C2820Vb(19);

    /* renamed from: m, reason: collision with root package name */
    public static final C2820Vb f29221m = new C2820Vb(0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2820Vb f29222n = new C2820Vb(1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2820Vb f29223o = new C2820Vb(2);

    /* renamed from: p, reason: collision with root package name */
    public static final C2820Vb f29224p = new C2820Vb(3);

    /* renamed from: q, reason: collision with root package name */
    public static final C2820Vb f29225q = new C2820Vb(4);

    /* renamed from: r, reason: collision with root package name */
    public static final C2820Vb f29226r = new C2820Vb(5);

    /* renamed from: s, reason: collision with root package name */
    public static final C2820Vb f29227s = new C2820Vb(6);

    /* renamed from: t, reason: collision with root package name */
    public static final C2820Vb f29228t = new C2820Vb(7);

    /* renamed from: u, reason: collision with root package name */
    public static final C2820Vb f29229u = new C2820Vb(8);

    /* renamed from: v, reason: collision with root package name */
    public static final C2820Vb f29230v = new C2820Vb(9);

    /* renamed from: w, reason: collision with root package name */
    public static final C2820Vb f29231w = new C2820Vb(10);

    /* renamed from: x, reason: collision with root package name */
    public static final C2820Vb f29232x = new C2820Vb(11);

    public static J3.a a(InterfaceC3858rh interfaceC3858rh, String str) {
        String str2;
        Uri parse = Uri.parse(str);
        try {
            C3348i7 S02 = interfaceC3858rh.S0();
            C3280gu W02 = interfaceC3858rh.W0();
            if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.vd)).booleanValue() || W02 == null) {
                if (S02 != null && S02.a(parse)) {
                    parse = S02.b(parse, interfaceC3858rh.getContext(), interfaceC3858rh.b0(), interfaceC3858rh.h());
                }
            } else if (S02 != null && S02.a(parse)) {
                parse = W02.a(parse, interfaceC3858rh.getContext(), interfaceC3858rh.b0(), interfaceC3858rh.h());
            }
        } catch (C3400j7 unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i4 = t2.C.f40822b;
            u2.i.f(concat);
        }
        HashMap hashMap = new HashMap();
        if (interfaceC3858rh.J() != null) {
            hashMap = interfaceC3858rh.J().f28182w0;
        }
        Context context = interfaceC3858rh.getContext();
        p2.j jVar = p2.j.f39798C;
        if (jVar.f39824y.a(context)) {
            C2569Gf c2569Gf = jVar.f39824y;
            String d2 = c2569Gf.d(context);
            if (d2 == null) {
                str2 = parse.toString();
            } else {
                C3151ea c3151ea = AbstractC3368ia.f31527Q0;
                q2.r rVar = q2.r.f40116e;
                String str3 = (String) rVar.f40119c.a(c3151ea);
                String uri = parse.toString();
                C3151ea c3151ea2 = AbstractC3368ia.f31519P0;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue() && uri.contains(str3)) {
                    c2569Gf.h(context, "_ac", d2, C2569Gf.f((Map) hashMap.get("_ac")));
                    str2 = AbstractC3035cL.B(context, uri).replace(str3, d2);
                } else if (!TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid")) || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31510O0)).booleanValue()) {
                    str2 = uri;
                } else {
                    String uri2 = AbstractC3035cL.w(AbstractC3035cL.B(context, uri), "fbs_aeid", d2).toString();
                    c2569Gf.h(context, "_ac", d2, C2569Gf.f((Map) hashMap.get("_ac")));
                    str2 = uri2;
                }
            }
        } else {
            str2 = parse.toString();
        }
        long longValue = ((Long) AbstractC2615Ja.f25774e.r()).longValue();
        if (longValue <= 0 || longValue > 254730000) {
            return C3686oN.c(str2);
        }
        JD s3 = JD.s(interfaceC3858rh.s0());
        J2 j22 = J2.f25692c;
        C3157eg c3157eg = AbstractC3212fg.f30745h;
        return C3686oN.u(C3686oN.A(C3686oN.u(s3, Throwable.class, j22, c3157eg), new C2854Xb(str2, 0), c3157eg), Throwable.class, new C2854Xb(str2, 1), c3157eg);
    }

    public static void b(Map map, InterfaceC2524Dl interfaceC2524Dl) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.fc)).booleanValue() && map.containsKey(com.anythink.expressad.f.a.b.bI) && ((String) map.get(com.anythink.expressad.f.a.b.bI)).equals("1") && interfaceC2524Dl != null) {
            interfaceC2524Dl.C();
        }
    }
}
