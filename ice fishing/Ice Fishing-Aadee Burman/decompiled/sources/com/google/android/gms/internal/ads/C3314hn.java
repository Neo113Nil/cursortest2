package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p2.C4826a;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.hn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3314hn {

    /* renamed from: a, reason: collision with root package name */
    public final C3052cu f30930a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f30931b;

    /* renamed from: c, reason: collision with root package name */
    public final C2612In f30932c;

    /* renamed from: d, reason: collision with root package name */
    public final C4175xn f30933d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f30934e;

    /* renamed from: f, reason: collision with root package name */
    public final C3153eo f30935f;

    /* renamed from: g, reason: collision with root package name */
    public final C4237yv f30936g;

    /* renamed from: h, reason: collision with root package name */
    public final C2800Tp f30937h;
    public final C3311hk i;

    /* renamed from: j, reason: collision with root package name */
    public final C2993bo f30938j;

    /* renamed from: k, reason: collision with root package name */
    public final C3691oo f30939k;

    public C3314hn(C3052cu c3052cu, Executor executor, C2612In c2612In, Context context, C3153eo c3153eo, C4237yv c4237yv, C2800Tp c2800Tp, C4175xn c4175xn, C2993bo c2993bo, C3691oo c3691oo, C3311hk c3311hk) {
        this.f30930a = c3052cu;
        this.f30931b = executor;
        this.f30932c = c2612In;
        this.f30934e = context;
        this.f30935f = c3153eo;
        this.f30936g = c4237yv;
        this.f30937h = c2800Tp;
        this.f30933d = c4175xn;
        this.f30938j = c2993bo;
        this.f30939k = c3691oo;
        this.i = c3311hk;
    }

    public static final void b(InterfaceC4061vh interfaceC4061vh) {
        interfaceC4061vh.a1("/videoClicked", AbstractC3195fc.f30255d);
        C2657Lh g02 = interfaceC4061vh.g0();
        synchronized (g02.f26156w) {
            g02.f26137K = true;
        }
        interfaceC4061vh.a1("/getNativeAdViewSignals", AbstractC3195fc.f30264n);
        interfaceC4061vh.a1("/getNativeClickMeta", AbstractC3195fc.f30265o);
    }

    public final void a(InterfaceC4061vh interfaceC4061vh, C4826a c4826a, C4221yf c4221yf) {
        C3691oo c3691oo;
        b(interfaceC4061vh);
        interfaceC4061vh.a1("/video", AbstractC3195fc.f30258g);
        interfaceC4061vh.a1("/videoMeta", AbstractC3195fc.f30259h);
        interfaceC4061vh.a1("/precache", new C2927ac(26));
        interfaceC4061vh.a1("/delayPageLoaded", AbstractC3195fc.f30261k);
        interfaceC4061vh.a1("/instrument", AbstractC3195fc.i);
        interfaceC4061vh.a1("/log", AbstractC3195fc.f30254c);
        Object obj = null;
        interfaceC4061vh.a1("/click", new C3088dc(0, obj, obj));
        if (this.f30930a.f29621b != null) {
            C2657Lh g02 = interfaceC4061vh.g0();
            synchronized (g02.f26156w) {
                g02.f26139M = true;
            }
            interfaceC4061vh.a1("/open", new C3625nc(true != ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.lf)).booleanValue() ? null : c4826a, null, null, null, null, null, this.i));
        } else {
            C2657Lh g03 = interfaceC4061vh.g0();
            synchronized (g03.f26156w) {
                g03.f26139M = false;
            }
        }
        if (C4835j.f39730C.f39756y.a(interfaceC4061vh.getContext())) {
            HashMap hashMap = new HashMap();
            if (interfaceC4061vh.K() != null) {
                hashMap = interfaceC4061vh.K().f27649w0;
            }
            interfaceC4061vh.a1("/logScionEvent", new C3088dc(1, interfaceC4061vh.getContext(), hashMap));
        }
        C3301ha c3301ha = AbstractC3569ma.lf;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            interfaceC4061vh.g0().f26142P = c4826a;
            interfaceC4061vh.g0().f26144R = c4221yf;
        }
        if (!((Boolean) rVar.f40207c.a(AbstractC3569ma.H8)).booleanValue() || (c3691oo = this.f30939k) == null) {
            return;
        }
        interfaceC4061vh.a1("/onDeviceStorageEvent", new C2818Vb(3, c3691oo));
    }
}
