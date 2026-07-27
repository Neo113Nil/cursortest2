package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p2.C4826a;
import p2.C4835j;
import q2.InterfaceC4870a;

/* renamed from: com.google.android.gms.internal.ads.Hn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2595Hn {

    /* renamed from: a, reason: collision with root package name */
    public final C3902sk f25356a;

    /* renamed from: b, reason: collision with root package name */
    public final C2525Dl f25357b;

    /* renamed from: c, reason: collision with root package name */
    public final C2575Gk f25358c;

    /* renamed from: d, reason: collision with root package name */
    public final C2694Nk f25359d;

    /* renamed from: e, reason: collision with root package name */
    public final C2762Rk f25360e;

    /* renamed from: f, reason: collision with root package name */
    public final C3365il f25361f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f25362g;

    /* renamed from: h, reason: collision with root package name */
    public final C2508Cl f25363h;
    public final C2934aj i;

    /* renamed from: j, reason: collision with root package name */
    public final C4826a f25364j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2468Af f25365k;

    /* renamed from: l, reason: collision with root package name */
    public final C3441k7 f25366l;

    /* renamed from: m, reason: collision with root package name */
    public final C3150el f25367m;

    /* renamed from: n, reason: collision with root package name */
    public final C2800Tp f25368n;

    /* renamed from: o, reason: collision with root package name */
    public final C4237yv f25369o;

    /* renamed from: p, reason: collision with root package name */
    public final C3153eo f25370p;

    /* renamed from: q, reason: collision with root package name */
    public final C2692Ni f25371q;

    /* renamed from: r, reason: collision with root package name */
    public final C2663Ln f25372r;

    /* renamed from: s, reason: collision with root package name */
    public final C3691oo f25373s;

    /* renamed from: t, reason: collision with root package name */
    public final C3525lk f25374t;

    /* renamed from: u, reason: collision with root package name */
    public final C3364ik f25375u;

    /* renamed from: v, reason: collision with root package name */
    public final C3311hk f25376v;

    public C2595Hn(C3902sk c3902sk, C2575Gk c2575Gk, C2694Nk c2694Nk, C2762Rk c2762Rk, C3365il c3365il, Executor executor, C2508Cl c2508Cl, C2934aj c2934aj, C4826a c4826a, InterfaceC2468Af interfaceC2468Af, C3441k7 c3441k7, C3150el c3150el, C2800Tp c2800Tp, C4237yv c4237yv, C3153eo c3153eo, C2525Dl c2525Dl, C2692Ni c2692Ni, C2663Ln c2663Ln, C3691oo c3691oo, C3525lk c3525lk, C3364ik c3364ik, C3311hk c3311hk) {
        this.f25356a = c3902sk;
        this.f25358c = c2575Gk;
        this.f25359d = c2694Nk;
        this.f25360e = c2762Rk;
        this.f25361f = c3365il;
        this.f25362g = executor;
        this.f25363h = c2508Cl;
        this.i = c2934aj;
        this.f25364j = c4826a;
        this.f25365k = interfaceC2468Af;
        this.f25366l = c3441k7;
        this.f25367m = c3150el;
        this.f25368n = c2800Tp;
        this.f25369o = c4237yv;
        this.f25370p = c3153eo;
        this.f25357b = c2525Dl;
        this.f25371q = c2692Ni;
        this.f25372r = c2663Ln;
        this.f25373s = c3691oo;
        this.f25374t = c3525lk;
        this.f25375u = c3364ik;
        this.f25376v = c3311hk;
    }

    public static final C3467kg b(InterfaceC4061vh interfaceC4061vh, String str, String str2, C2993bo c2993bo, Vu vu) {
        C3301ha c3301ha = AbstractC3569ma.f32073M2;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo, "rendering-webview-load-html-start");
        }
        C3467kg c3467kg = new C3467kg();
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.fa)).booleanValue()) {
            Su g4 = Su.g(interfaceC4061vh.getContext(), 112);
            g4.c();
            AbstractC2772Sd.G(c3467kg, vu, g4, false);
        }
        interfaceC4061vh.g0().f26159z = new S0.c(16, c2993bo, c3467kg);
        interfaceC4061vh.C0(str, str2);
        return c3467kg;
    }

    public final void a(InterfaceC4061vh interfaceC4061vh, boolean z3, C3357ic c3357ic, C2993bo c2993bo) {
        InterfaceC3335i7 interfaceC3335i7;
        C3301ha c3301ha = AbstractC3569ma.f32073M2;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo, "rendering-configure-webview-start");
        }
        interfaceC4061vh.g0().i(new InterfaceC4870a() { // from class: com.google.android.gms.internal.ads.Gn
            @Override // q2.InterfaceC4870a
            public final /* synthetic */ void onAdClicked() {
                C2595Hn.this.f25356a.onAdClicked();
            }
        }, this.f25359d, this.f25360e, new InterfaceC2850Xb() { // from class: com.google.android.gms.internal.ads.Dn
            @Override // com.google.android.gms.internal.ads.InterfaceC2850Xb
            public final /* synthetic */ void N(String str, String str2) {
                C2595Hn.this.f25361f.N(str, str2);
            }
        }, new C3798qn(2, this), z3, c3357ic, this.f25364j, new Qx(this), this.f25365k, this.f25368n, this.f25369o, this.f25370p, null, this.f25357b, null, null, null, this.f25371q, this.f25373s, this.f25374t, this.f25375u, this.f25376v);
        interfaceC4061vh.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.En
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C2595Hn c2595Hn = C2595Hn.this;
                c2595Hn.getClass();
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.vb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    c2595Hn.f25372r.f26171a = motionEvent;
                }
                c2595Hn.f25364j.f39690b = true;
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        interfaceC4061vh.setOnClickListener(new ViewOnClickListenerC2868Yd(this));
        C3301ha c3301ha2 = AbstractC3569ma.f32391v3;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue() && (interfaceC3335i7 = this.f25366l.f31381b) != null) {
            interfaceC3335i7.g(interfaceC4061vh.V());
        }
        C2508Cl c2508Cl = this.f25363h;
        Executor executor = this.f25362g;
        c2508Cl.H1(interfaceC4061vh, executor);
        c2508Cl.H1(new C3152en(interfaceC4061vh, 2), executor);
        c2508Cl.Q1(interfaceC4061vh.V());
        interfaceC4061vh.a1("/trackActiveViewUnit", new C3088dc(5, this, interfaceC4061vh));
        C2934aj c2934aj = this.i;
        c2934aj.getClass();
        c2934aj.f29081C = new WeakReference(interfaceC4061vh);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).booleanValue()) {
            com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo, "rendering-configure-webview-end");
        }
    }
}
