package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.fc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3218fc {

    /* renamed from: a, reason: collision with root package name */
    public static final C2950ac f31040a = new C2950ac(12);

    /* renamed from: b, reason: collision with root package name */
    public static final C2950ac f31041b = new C2950ac(13);

    /* renamed from: c, reason: collision with root package name */
    public static final C2950ac f31042c = new C2950ac(14);

    /* renamed from: d, reason: collision with root package name */
    public static final C2950ac f31043d = new C2950ac(15);

    /* renamed from: e, reason: collision with root package name */
    public static final C2950ac f31044e = new C2950ac(16);

    /* renamed from: f, reason: collision with root package name */
    public static final C2950ac f31045f = new C2950ac(17);

    /* renamed from: g, reason: collision with root package name */
    public static final C2710Ng f31046g = new C2710Ng();

    /* renamed from: h, reason: collision with root package name */
    public static final C2950ac f31047h = new C2950ac(25);
    public static final C2905Zb i = new C2905Zb();

    /* renamed from: j, reason: collision with root package name */
    public static final C3111dc f31048j = new C3111dc();

    /* renamed from: k, reason: collision with root package name */
    public static final C2950ac f31049k = new C2950ac(18);

    /* renamed from: l, reason: collision with root package name */
    public static final C2950ac f31050l = new C2950ac(19);

    /* renamed from: m, reason: collision with root package name */
    public static final C2950ac f31051m = new C2950ac(0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2950ac f31052n = new C2950ac(1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2950ac f31053o = new C2950ac(2);

    /* renamed from: p, reason: collision with root package name */
    public static final C2950ac f31054p = new C2950ac(3);

    /* renamed from: q, reason: collision with root package name */
    public static final C2950ac f31055q = new C2950ac(4);

    /* renamed from: r, reason: collision with root package name */
    public static final C2950ac f31056r = new C2950ac(5);

    /* renamed from: s, reason: collision with root package name */
    public static final C2950ac f31057s = new C2950ac(6);

    /* renamed from: t, reason: collision with root package name */
    public static final C2950ac f31058t = new C2950ac(7);

    /* renamed from: u, reason: collision with root package name */
    public static final C2950ac f31059u = new C2950ac(8);

    /* renamed from: v, reason: collision with root package name */
    public static final C2950ac f31060v = new C2950ac(9);

    /* renamed from: w, reason: collision with root package name */
    public static final C2950ac f31061w = new C2950ac(10);

    /* renamed from: x, reason: collision with root package name */
    public static final C2950ac f31062x = new C2950ac(11);

    public static P3.a a(InterfaceC4084vh interfaceC4084vh, String str) {
        String str2;
        Uri parse = Uri.parse(str);
        try {
            C3464k7 Q02 = interfaceC4084vh.Q0();
            C3236fu g02 = interfaceC4084vh.g0();
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.vd)).booleanValue() || g02 == null) {
                if (Q02 != null && Q02.a(parse)) {
                    parse = Q02.b(parse, interfaceC4084vh.getContext(), interfaceC4084vh.V(), interfaceC4084vh.j());
                }
            } else if (Q02 != null && Q02.a(parse)) {
                parse = g02.a(parse, interfaceC4084vh.getContext(), interfaceC4084vh.V(), interfaceC4084vh.j());
            }
        } catch (C3518l7 unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i4 = w2.z.f41712b;
            x2.i.f(concat);
        }
        HashMap hashMap = new HashMap();
        if (interfaceC4084vh.J() != null) {
            hashMap = interfaceC4084vh.J().f28432w0;
        }
        Context context = interfaceC4084vh.getContext();
        C4906k c4906k = C4906k.f40186C;
        if (c4906k.f40212y.a(context)) {
            C2641Jf c2641Jf = c4906k.f40212y;
            String d9 = c2641Jf.d(context);
            if (d9 == null) {
                str2 = parse.toString();
            } else {
                C3324ha c3324ha = AbstractC3592ma.f32886Q0;
                s2.r rVar = s2.r.f40506e;
                String str3 = (String) rVar.f40509c.a(c3324ha);
                String uri = parse.toString();
                C3324ha c3324ha2 = AbstractC3592ma.f32877P0;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue() && uri.contains(str3)) {
                    c2641Jf.h(context, "_ac", d9, C2641Jf.f((Map) hashMap.get("_ac")));
                    str2 = AbstractC3066cl.B(context, uri).replace(str3, d9);
                } else if (!TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid")) || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32868O0)).booleanValue()) {
                    str2 = uri;
                } else {
                    String uri2 = AbstractC3066cl.w(AbstractC3066cl.B(context, uri), "fbs_aeid", d9).toString();
                    c2641Jf.h(context, "_ac", d9, C2641Jf.f((Map) hashMap.get("_ac")));
                    str2 = uri2;
                }
            }
        } else {
            str2 = parse.toString();
        }
        long longValue = ((Long) AbstractC2721Oa.f27397e.r()).longValue();
        if (longValue <= 0 || longValue > 262180000) {
            return QC.c(str2);
        }
        ID s9 = ID.s(interfaceC4084vh.u0());
        L2 l22 = L2.f26822c;
        C3383ig c3383ig = AbstractC3436jg.f32062h;
        return QC.q(QC.u(QC.q(s9, Throwable.class, l22, c3383ig), new C3004bc(str2, 0), c3383ig), Throwable.class, new C3004bc(str2, 1), c3383ig);
    }

    public static void b(Map map, InterfaceC2579Fl interfaceC2579Fl) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.fc)).booleanValue() && map.containsKey(com.anythink.expressad.f.a.b.bI) && ((String) map.get(com.anythink.expressad.f.a.b.bI)).equals("1") && interfaceC2579Fl != null) {
            interfaceC2579Fl.D();
        }
    }
}
