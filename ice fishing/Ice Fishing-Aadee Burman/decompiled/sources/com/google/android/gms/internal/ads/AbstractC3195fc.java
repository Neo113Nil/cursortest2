package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.fc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3195fc {

    /* renamed from: a, reason: collision with root package name */
    public static final C2927ac f30252a = new C2927ac(12);

    /* renamed from: b, reason: collision with root package name */
    public static final C2927ac f30253b = new C2927ac(13);

    /* renamed from: c, reason: collision with root package name */
    public static final C2927ac f30254c = new C2927ac(14);

    /* renamed from: d, reason: collision with root package name */
    public static final C2927ac f30255d = new C2927ac(15);

    /* renamed from: e, reason: collision with root package name */
    public static final C2927ac f30256e = new C2927ac(16);

    /* renamed from: f, reason: collision with root package name */
    public static final C2927ac f30257f = new C2927ac(17);

    /* renamed from: g, reason: collision with root package name */
    public static final C2690Ng f30258g = new C2690Ng();

    /* renamed from: h, reason: collision with root package name */
    public static final C2927ac f30259h = new C2927ac(25);
    public static final C2882Zb i = new C2882Zb();

    /* renamed from: j, reason: collision with root package name */
    public static final C3088dc f30260j = new C3088dc();

    /* renamed from: k, reason: collision with root package name */
    public static final C2927ac f30261k = new C2927ac(18);

    /* renamed from: l, reason: collision with root package name */
    public static final C2927ac f30262l = new C2927ac(19);

    /* renamed from: m, reason: collision with root package name */
    public static final C2927ac f30263m = new C2927ac(0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2927ac f30264n = new C2927ac(1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2927ac f30265o = new C2927ac(2);

    /* renamed from: p, reason: collision with root package name */
    public static final C2927ac f30266p = new C2927ac(3);

    /* renamed from: q, reason: collision with root package name */
    public static final C2927ac f30267q = new C2927ac(4);

    /* renamed from: r, reason: collision with root package name */
    public static final C2927ac f30268r = new C2927ac(5);

    /* renamed from: s, reason: collision with root package name */
    public static final C2927ac f30269s = new C2927ac(6);

    /* renamed from: t, reason: collision with root package name */
    public static final C2927ac f30270t = new C2927ac(7);

    /* renamed from: u, reason: collision with root package name */
    public static final C2927ac f30271u = new C2927ac(8);

    /* renamed from: v, reason: collision with root package name */
    public static final C2927ac f30272v = new C2927ac(9);

    /* renamed from: w, reason: collision with root package name */
    public static final C2927ac f30273w = new C2927ac(10);

    /* renamed from: x, reason: collision with root package name */
    public static final C2927ac f30274x = new C2927ac(11);

    public static N3.a a(InterfaceC4061vh interfaceC4061vh, String str) {
        String str2;
        Uri parse = Uri.parse(str);
        try {
            C3441k7 R02 = interfaceC4061vh.R0();
            C3213fu f02 = interfaceC4061vh.f0();
            if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.vd)).booleanValue() || f02 == null) {
                if (R02 != null && R02.a(parse)) {
                    parse = R02.b(parse, interfaceC4061vh.getContext(), interfaceC4061vh.V(), interfaceC4061vh.j());
                }
            } else if (R02 != null && R02.a(parse)) {
                parse = f02.a(parse, interfaceC4061vh.getContext(), interfaceC4061vh.V(), interfaceC4061vh.j());
            }
        } catch (C3495l7 unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i6 = u2.z.f41319b;
            v2.i.f(concat);
        }
        HashMap hashMap = new HashMap();
        if (interfaceC4061vh.K() != null) {
            hashMap = interfaceC4061vh.K().f27649w0;
        }
        Context context = interfaceC4061vh.getContext();
        C4835j c4835j = C4835j.f39730C;
        if (c4835j.f39756y.a(context)) {
            C2621Jf c2621Jf = c4835j.f39756y;
            String d2 = c2621Jf.d(context);
            if (d2 == null) {
                str2 = parse.toString();
            } else {
                C3301ha c3301ha = AbstractC3569ma.f32106Q0;
                q2.r rVar = q2.r.f40204e;
                String str3 = (String) rVar.f40207c.a(c3301ha);
                String uri = parse.toString();
                C3301ha c3301ha2 = AbstractC3569ma.f32098P0;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue() && uri.contains(str3)) {
                    c2621Jf.h(context, "_ac", d2, C2621Jf.f((Map) hashMap.get("_ac")));
                    str2 = AbstractC3043cl.B(context, uri).replace(str3, d2);
                } else if (!TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid")) || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32089O0)).booleanValue()) {
                    str2 = uri;
                } else {
                    String uri2 = AbstractC3043cl.w(AbstractC3043cl.B(context, uri), "fbs_aeid", d2).toString();
                    c2621Jf.h(context, "_ac", d2, C2621Jf.f((Map) hashMap.get("_ac")));
                    str2 = uri2;
                }
            }
        } else {
            str2 = parse.toString();
        }
        long longValue = ((Long) AbstractC2701Oa.f26621e.r()).longValue();
        if (longValue <= 0 || longValue > 262180000) {
            return QC.c(str2);
        }
        ID s9 = ID.s(interfaceC4061vh.v0());
        L2 l22 = L2.f26022c;
        C3360ig c3360ig = AbstractC3413jg.f31275h;
        return QC.q(QC.u(QC.q(s9, Throwable.class, l22, c3360ig), new C2981bc(str2, 0), c3360ig), Throwable.class, new C2981bc(str2, 1), c3360ig);
    }

    public static void b(Map map, InterfaceC2542El interfaceC2542El) {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.fc)).booleanValue() && map.containsKey(com.anythink.expressad.f.a.b.bI) && ((String) map.get(com.anythink.expressad.f.a.b.bI)).equals("1") && interfaceC2542El != null) {
            interfaceC2542El.J();
        }
    }
}
