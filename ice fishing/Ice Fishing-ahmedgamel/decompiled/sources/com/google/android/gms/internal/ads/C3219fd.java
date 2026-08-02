package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import n0.C4763d;
import r2.C4896a;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.fd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3219fd implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31063a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31064b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31065c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f31066d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f31067e;

    public /* synthetic */ C3219fd(C3122dn c3122dn, String str, C4244yf c4244yf, C4896a c4896a) {
        this.f31063a = 2;
        this.f31065c = c3122dn;
        this.f31064b = str;
        this.f31066d = c4244yf;
        this.f31067e = c4896a;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final P3.a a(Object obj) {
        P3.a k9;
        ND c9;
        switch (this.f31063a) {
            case 0:
                return b(obj);
            case 1:
                MotionEvent motionEvent = (MotionEvent) this.f31067e;
                C2712Ni c2712Ni = (C2712Ni) this.f31065c;
                c2712Ni.getClass();
                int intValue = ((Integer) obj).intValue();
                Uri.Builder builder = (Uri.Builder) this.f31066d;
                if (intValue != 1) {
                    builder.appendQueryParameter((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.Eb), "10");
                    return QC.c(builder.toString());
                }
                Uri.Builder buildUpon = builder.build().buildUpon();
                C3324ha c3324ha = AbstractC3592ma.Fb;
                s2.r rVar = s2.r.f40506e;
                buildUpon.appendQueryParameter((String) rVar.f40509c.a(c3324ha), "1");
                C3324ha c3324ha2 = AbstractC3592ma.Eb;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2), "12");
                if (((String) this.f31064b).contains((CharSequence) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Gb))) {
                    buildUpon.authority((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Hb));
                }
                Uri build = buildUpon.build();
                C3286gq c3286gq = c2712Ni.f27296c;
                c3286gq.getClass();
                try {
                    C4763d c4763d = c3286gq.f31430a;
                    Objects.requireNonNull(c4763d);
                    k9 = c4763d.d(build, motionEvent);
                } catch (Exception e9) {
                    k9 = QC.k(e9);
                }
                return QC.t(ID.s(k9), new C4187xc(2, builder), c2712Ni.f27299f);
            case 2:
                C3122dn c3122dn = (C3122dn) this.f31065c;
                c3122dn.getClass();
                C2889Yb c2889Yb = C4906k.f40186C.f40192d;
                A3.r rVar2 = new A3.r(0, 0, 0);
                C5189a c5189a = c3122dn.f30621d;
                InterfaceC4084vh g9 = C2889Yb.g(rVar2, c3122dn.f30618a, c3122dn.f30620c, c3122dn.f30623f, null, c3122dn.f30629m, c3122dn.f30632p, null, null, null, c3122dn.f30633q, "native-omid", c3122dn.f30622e, c5189a, false, false);
                Z8 z82 = new Z8(g9);
                g9.h0().f26956z = new C3680o7(20, z82);
                g9.loadData(Base64.encodeToString(((String) this.f31064b).getBytes(), 1), "text/html", "base64");
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.lf)).booleanValue()) {
                    C4244yf c4244yf = (C4244yf) this.f31066d;
                    if (c4244yf != null) {
                        g9.h0().f26941R = c4244yf;
                    }
                    g9.h0().f26939P = (C4896a) this.f31067e;
                }
                return z82;
            case 3:
                return QC.t(((InterfaceC2498Ap) this.f31066d).d((C2759Qe) this.f31067e), (BD) this.f31064b, (C3383ig) ((C4297ze) this.f31065c).f36133u);
            case 4:
                C2965ar c2965ar = (C2965ar) this.f31065c;
                Su e10 = Su.e(c2965ar.f29930j, 12);
                St st = (St) this.f31066d;
                e10.m(st.f28364E);
                e10.c();
                InterfaceC3340hq interfaceC3340hq = (InterfaceC3340hq) this.f31064b;
                Yt yt = (Yt) this.f31067e;
                P3.a s9 = QC.s(interfaceC3340hq.a(yt, st), st.f28381R, TimeUnit.MILLISECONDS, c2965ar.f29927f);
                c2965ar.f29929h.b(yt, st, s9, c2965ar.f29924c);
                AbstractC2792Sd.G(s9, c2965ar.f29931k, e10, false);
                return s9;
            case 5:
                C3130dw c3130dw = (C3130dw) this.f31065c;
                C4201xq c4201xq = (C4201xq) this.f31066d;
                C4297ze c4297ze = (C4297ze) this.f31067e;
                C3827qt c3827qt = (C3827qt) this.f31064b;
                C4043uu c4043uu = (C4043uu) obj;
                synchronized (c3130dw) {
                    try {
                        c3130dw.f30650b = true;
                        c4043uu.f35367a = (InterfaceC3656nk) ((C3717or) c4201xq.f35841u).f33740u;
                        if (c3130dw.f30649a) {
                            c9 = QC.c(new Au(c4043uu, c3827qt));
                        } else {
                            c4297ze.p(c3827qt.f34203g, c4043uu);
                            c9 = ND.f27257u;
                        }
                    } finally {
                    }
                }
                return c9;
            case 6:
                return ((Ly) ((Yx) this.f31065c).f29546b.f27682f.get()).d((Context) this.f31066d, (View) this.f31067e, (Activity) this.f31064b);
            default:
                return ((Ly) ((Yx) this.f31065c).f29546b.f27682f.get()).e((Context) this.f31066d, (String) this.f31064b, (View) this.f31067e);
        }
    }

    public P3.a b(Object obj) {
        C3490kg c3490kg = new C3490kg();
        C2858Wc f2 = ((g7.m) this.f31067e).f();
        w2.z.k("callJs > getEngine: Promise created");
        f2.p(new C2590Gf(this, f2, obj, c3490kg), new S0.c(f2, this, c3490kg));
        return c3490kg;
    }

    public C3219fd(g7.m mVar, String str, InterfaceC3005bd interfaceC3005bd, InterfaceC2951ad interfaceC2951ad) {
        this.f31063a = 0;
        this.f31067e = mVar;
        this.f31064b = str;
        this.f31066d = interfaceC3005bd;
        this.f31065c = interfaceC2951ad;
    }

    public /* synthetic */ C3219fd(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f31063a = i;
        this.f31065c = obj;
        this.f31066d = obj2;
        this.f31067e = obj3;
        this.f31064b = obj4;
    }

    public /* synthetic */ C3219fd(Object obj, Object obj2, String str, Object obj3, int i) {
        this.f31063a = i;
        this.f31065c = obj;
        this.f31066d = obj2;
        this.f31064b = str;
        this.f31067e = obj3;
    }
}
