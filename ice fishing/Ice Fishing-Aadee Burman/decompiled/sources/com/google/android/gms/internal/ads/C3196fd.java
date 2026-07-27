package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import n0.C4749d;
import p2.C4826a;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.fd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3196fd implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30275a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30276b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30277c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30278d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f30279e;

    public /* synthetic */ C3196fd(C3045cn c3045cn, String str, C4221yf c4221yf, C4826a c4826a) {
        this.f30275a = 2;
        this.f30277c = c3045cn;
        this.f30276b = str;
        this.f30278d = c4221yf;
        this.f30279e = c4826a;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        N3.a k9;
        ND c9;
        switch (this.f30275a) {
            case 0:
                return b(obj);
            case 1:
                MotionEvent motionEvent = (MotionEvent) this.f30279e;
                C2692Ni c2692Ni = (C2692Ni) this.f30277c;
                c2692Ni.getClass();
                int intValue = ((Integer) obj).intValue();
                Uri.Builder builder = (Uri.Builder) this.f30278d;
                if (intValue != 1) {
                    builder.appendQueryParameter((String) q2.r.f40204e.f40207c.a(AbstractC3569ma.Eb), "10");
                    return QC.c(builder.toString());
                }
                Uri.Builder buildUpon = builder.build().buildUpon();
                C3301ha c3301ha = AbstractC3569ma.Fb;
                q2.r rVar = q2.r.f40204e;
                buildUpon.appendQueryParameter((String) rVar.f40207c.a(c3301ha), "1");
                C3301ha c3301ha2 = AbstractC3569ma.Eb;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
                buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2), "12");
                if (((String) this.f30276b).contains((CharSequence) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Gb))) {
                    buildUpon.authority((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Hb));
                }
                Uri build = buildUpon.build();
                C3263gq c3263gq = c2692Ni.f26513c;
                c3263gq.getClass();
                try {
                    C4749d c4749d = c3263gq.f30661a;
                    Objects.requireNonNull(c4749d);
                    k9 = c4749d.d(build, motionEvent);
                } catch (Exception e9) {
                    k9 = QC.k(e9);
                }
                return QC.t(ID.s(k9), new C4164xc(2, builder), c2692Ni.f26516f);
            case 2:
                C3045cn c3045cn = (C3045cn) this.f30277c;
                c3045cn.getClass();
                C2866Yb c2866Yb = C4835j.f39730C.f39736d;
                X2.b bVar = new X2.b(0, 0, 0);
                C5110a c5110a = c3045cn.f29584d;
                InterfaceC4061vh g4 = C2866Yb.g(bVar, c3045cn.f29581a, c3045cn.f29583c, c3045cn.f29586f, null, c3045cn.f29592m, c3045cn.f29595p, null, null, null, c3045cn.f29596q, "native-omid", c3045cn.f29585e, c5110a, false, false);
                Z8 z82 = new Z8(g4);
                g4.g0().f26159z = new C3657o7(20, z82);
                g4.loadData(Base64.encodeToString(((String) this.f30276b).getBytes(), 1), "text/html", "base64");
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.lf)).booleanValue()) {
                    C4221yf c4221yf = (C4221yf) this.f30278d;
                    if (c4221yf != null) {
                        g4.g0().f26144R = c4221yf;
                    }
                    g4.g0().f26142P = (C4826a) this.f30279e;
                }
                return z82;
            case 3:
                return QC.t(((InterfaceC2478Ap) this.f30278d).d((C2739Qe) this.f30279e), (BD) this.f30276b, (C3360ig) ((C4274ze) this.f30277c).f35360u);
            case 4:
                C2942ar c2942ar = (C2942ar) this.f30277c;
                Su g9 = Su.g(c2942ar.f29145j, 12);
                St st = (St) this.f30278d;
                g9.m(st.f27581E);
                g9.c();
                InterfaceC3317hq interfaceC3317hq = (InterfaceC3317hq) this.f30276b;
                Yt yt = (Yt) this.f30279e;
                N3.a s9 = QC.s(interfaceC3317hq.a(yt, st), st.f27598R, TimeUnit.MILLISECONDS, c2942ar.f29142f);
                c2942ar.f29144h.b(yt, st, s9, c2942ar.f29139c);
                AbstractC2772Sd.G(s9, c2942ar.f29146k, g9, false);
                return s9;
            case 5:
                C3054cw c3054cw = (C3054cw) this.f30277c;
                C4178xq c4178xq = (C4178xq) this.f30278d;
                C4274ze c4274ze = (C4274ze) this.f30279e;
                C3804qt c3804qt = (C3804qt) this.f30276b;
                C4020uu c4020uu = (C4020uu) obj;
                synchronized (c3054cw) {
                    try {
                        c3054cw.f29645b = true;
                        c4020uu.f34604a = (InterfaceC3633nk) ((C3694or) c4178xq.f35055u).f32954u;
                        if (c3054cw.f29644a) {
                            c9 = QC.c(new Au(c4020uu, c3804qt));
                        } else {
                            c4274ze.p(c3804qt.f33436g, c4020uu);
                            c9 = ND.f26473u;
                        }
                    } finally {
                    }
                }
                return c9;
            case 6:
                return ((Ly) ((Yx) this.f30277c).f28766b.f26895f.get()).d((Context) this.f30278d, (View) this.f30279e, (Activity) this.f30276b);
            default:
                return ((Ly) ((Yx) this.f30277c).f28766b.f26895f.get()).e((Context) this.f30278d, (String) this.f30276b, (View) this.f30279e);
        }
    }

    public N3.a b(Object obj) {
        C3467kg c3467kg = new C3467kg();
        C2835Wc f3 = ((g7.m) this.f30279e).f();
        u2.z.k("callJs > getEngine: Promise created");
        f3.p(new C2570Gf(this, f3, obj, c3467kg), new S0.c(f3, this, c3467kg));
        return c3467kg;
    }

    public C3196fd(g7.m mVar, String str, InterfaceC2982bd interfaceC2982bd, InterfaceC2928ad interfaceC2928ad) {
        this.f30275a = 0;
        this.f30279e = mVar;
        this.f30276b = str;
        this.f30278d = interfaceC2982bd;
        this.f30277c = interfaceC2928ad;
    }

    public /* synthetic */ C3196fd(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f30275a = i;
        this.f30277c = obj;
        this.f30278d = obj2;
        this.f30279e = obj3;
        this.f30276b = obj4;
    }

    public /* synthetic */ C3196fd(Object obj, Object obj2, String str, Object obj3, int i) {
        this.f30275a = i;
        this.f30277c = obj;
        this.f30278d = obj2;
        this.f30276b = str;
        this.f30279e = obj3;
    }
}
