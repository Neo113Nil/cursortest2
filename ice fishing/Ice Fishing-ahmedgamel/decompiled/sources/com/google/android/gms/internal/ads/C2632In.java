package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import r2.C4896a;
import r2.C4906k;
import s2.InterfaceC4919a;

/* renamed from: com.google.android.gms.internal.ads.In, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2632In {

    /* renamed from: a, reason: collision with root package name */
    public final C3925sk f26320a;

    /* renamed from: b, reason: collision with root package name */
    public final C2562El f26321b;

    /* renamed from: c, reason: collision with root package name */
    public final C2595Gk f26322c;

    /* renamed from: d, reason: collision with root package name */
    public final C2714Nk f26323d;

    /* renamed from: e, reason: collision with root package name */
    public final C2782Rk f26324e;

    /* renamed from: f, reason: collision with root package name */
    public final C3388il f26325f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f26326g;

    /* renamed from: h, reason: collision with root package name */
    public final C2545Dl f26327h;
    public final C2957aj i;

    /* renamed from: j, reason: collision with root package name */
    public final C4896a f26328j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2488Af f26329k;

    /* renamed from: l, reason: collision with root package name */
    public final C3464k7 f26330l;

    /* renamed from: m, reason: collision with root package name */
    public final C3173el f26331m;

    /* renamed from: n, reason: collision with root package name */
    public final C2821Tp f26332n;

    /* renamed from: o, reason: collision with root package name */
    public final C4260yv f26333o;

    /* renamed from: p, reason: collision with root package name */
    public final C3230fo f26334p;

    /* renamed from: q, reason: collision with root package name */
    public final C2712Ni f26335q;

    /* renamed from: r, reason: collision with root package name */
    public final C2700Mn f26336r;

    /* renamed from: s, reason: collision with root package name */
    public final C3768po f26337s;

    /* renamed from: t, reason: collision with root package name */
    public final C3548lk f26338t;

    /* renamed from: u, reason: collision with root package name */
    public final C3387ik f26339u;

    /* renamed from: v, reason: collision with root package name */
    public final C3334hk f26340v;

    public C2632In(C3925sk c3925sk, C2595Gk c2595Gk, C2714Nk c2714Nk, C2782Rk c2782Rk, C3388il c3388il, Executor executor, C2545Dl c2545Dl, C2957aj c2957aj, C4896a c4896a, InterfaceC2488Af interfaceC2488Af, C3464k7 c3464k7, C3173el c3173el, C2821Tp c2821Tp, C4260yv c4260yv, C3230fo c3230fo, C2562El c2562El, C2712Ni c2712Ni, C2700Mn c2700Mn, C3768po c3768po, C3548lk c3548lk, C3387ik c3387ik, C3334hk c3334hk) {
        this.f26320a = c3925sk;
        this.f26322c = c2595Gk;
        this.f26323d = c2714Nk;
        this.f26324e = c2782Rk;
        this.f26325f = c3388il;
        this.f26326g = executor;
        this.f26327h = c2545Dl;
        this.i = c2957aj;
        this.f26328j = c4896a;
        this.f26329k = interfaceC2488Af;
        this.f26330l = c3464k7;
        this.f26331m = c3173el;
        this.f26332n = c2821Tp;
        this.f26333o = c4260yv;
        this.f26334p = c3230fo;
        this.f26321b = c2562El;
        this.f26335q = c2712Ni;
        this.f26336r = c2700Mn;
        this.f26337s = c3768po;
        this.f26338t = c3548lk;
        this.f26339u = c3387ik;
        this.f26340v = c3334hk;
    }

    public static final C3490kg b(InterfaceC4084vh interfaceC4084vh, String str, String str2, C3069co c3069co, Vu vu) {
        C3324ha c3324ha = AbstractC3592ma.f32852M2;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c3069co, "rendering-webview-load-html-start");
        }
        C3490kg c3490kg = new C3490kg();
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.fa)).booleanValue()) {
            Su e9 = Su.e(interfaceC4084vh.getContext(), 112);
            e9.c();
            AbstractC2792Sd.G(c3490kg, vu, e9, false);
        }
        interfaceC4084vh.h0().f26956z = new S0.c(19, c3069co, c3490kg);
        interfaceC4084vh.B0(str, str2);
        return c3490kg;
    }

    public final void a(InterfaceC4084vh interfaceC4084vh, boolean z6, C3380ic c3380ic, C3069co c3069co) {
        InterfaceC3358i7 interfaceC3358i7;
        C3324ha c3324ha = AbstractC3592ma.f32852M2;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c3069co, "rendering-configure-webview-start");
        }
        interfaceC4084vh.h0().i(new InterfaceC4919a() { // from class: com.google.android.gms.internal.ads.Hn
            @Override // s2.InterfaceC4919a
            public final /* synthetic */ void onAdClicked() {
                C2632In.this.f26320a.onAdClicked();
            }
        }, this.f26323d, this.f26324e, new InterfaceC2873Xb() { // from class: com.google.android.gms.internal.ads.En
            @Override // com.google.android.gms.internal.ads.InterfaceC2873Xb
            public final /* synthetic */ void N(String str, String str2) {
                C2632In.this.f26325f.N(str, str2);
            }
        }, new C3874rn(2, this), z6, c3380ic, this.f26328j, new Qx(this), this.f26329k, this.f26332n, this.f26333o, this.f26334p, null, this.f26321b, null, null, null, this.f26335q, this.f26337s, this.f26338t, this.f26339u, this.f26340v);
        interfaceC4084vh.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.Fn
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C2632In c2632In = C2632In.this;
                c2632In.getClass();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.vb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    c2632In.f26336r.f27117a = motionEvent;
                }
                c2632In.f26328j.f40145b = true;
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        interfaceC4084vh.setOnClickListener(new ViewOnClickListenerC2891Yd(this));
        C3324ha c3324ha2 = AbstractC3592ma.f33171v3;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue() && (interfaceC3358i7 = this.f26330l.f32160b) != null) {
            interfaceC3358i7.g(interfaceC4084vh.V());
        }
        C2545Dl c2545Dl = this.f26327h;
        Executor executor = this.f26326g;
        c2545Dl.I1(interfaceC4084vh, executor);
        c2545Dl.I1(new C3229fn(interfaceC4084vh, 2), executor);
        c2545Dl.R1(interfaceC4084vh.V());
        interfaceC4084vh.Z0("/trackActiveViewUnit", new C3111dc(5, this, interfaceC4084vh));
        C2957aj c2957aj = this.i;
        c2957aj.getClass();
        c2957aj.f29856C = new WeakReference(interfaceC4084vh);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).booleanValue()) {
            com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c3069co, "rendering-configure-webview-end");
        }
    }
}
