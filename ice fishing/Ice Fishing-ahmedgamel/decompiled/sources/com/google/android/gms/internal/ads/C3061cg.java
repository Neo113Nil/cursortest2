package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import r2.C4906k;
import s2.C4949p;
import w2.C5140B;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.cg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3061cg {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30302a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C5140B f30303b;

    /* renamed from: c, reason: collision with root package name */
    public final C3222fg f30304c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30305d;

    /* renamed from: e, reason: collision with root package name */
    public Context f30306e;

    /* renamed from: f, reason: collision with root package name */
    public C5189a f30307f;

    /* renamed from: g, reason: collision with root package name */
    public String f30308g;

    /* renamed from: h, reason: collision with root package name */
    public C4323b f30309h;
    public C3230fo i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f30310j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f30311k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f30312l;

    /* renamed from: m, reason: collision with root package name */
    public final C3008bg f30313m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f30314n;

    /* renamed from: o, reason: collision with root package name */
    public P3.a f30315o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f30316p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f30317q;

    public C3061cg() {
        C5140B c5140b = new C5140B();
        this.f30303b = c5140b;
        this.f30304c = new C3222fg(C4949p.f40498g.f40504f, c5140b);
        this.f30305d = false;
        this.f30309h = null;
        this.i = null;
        this.f30310j = null;
        this.f30311k = new AtomicInteger(0);
        this.f30312l = new AtomicInteger(0);
        this.f30313m = new C3008bg();
        this.f30314n = new Object();
        this.f30316p = new AtomicBoolean();
        this.f30317q = new AtomicBoolean(false);
    }

    public final C4323b a() {
        C4323b c4323b;
        synchronized (this.f30302a) {
            c4323b = this.f30309h;
        }
        return c4323b;
    }

    public final void b(Context context, C5189a c5189a, C3230fo c3230fo) {
        C4323b c4323b;
        synchronized (this.f30302a) {
            try {
                if (!this.f30305d) {
                    this.f30306e = context.getApplicationContext();
                    this.f30307f = c5189a;
                    C4906k.f40186C.f40195g.i(this.f30304c);
                    this.f30303b.k(this.f30306e);
                    C2521Ce.b(this.f30306e, this.f30307f);
                    this.i = c3230fo;
                    C3324ha c3324ha = AbstractC3592ma.f32788E2;
                    s2.r rVar = s2.r.f40506e;
                    if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                        c4323b = new C4323b();
                    } else {
                        w2.z.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        c4323b = null;
                    }
                    this.f30309h = c4323b;
                    if (c4323b != null) {
                        MA.f(new C2954ag(this).l(), "AppState.registerCsiReporter", AbstractC3436jg.f32062h);
                    }
                    Context context2 = this.f30306e;
                    if (V2.b.f()) {
                        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.C9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new Q0.h(this));
                            } catch (RuntimeException e9) {
                                int i = w2.z.f41712b;
                                x2.i.g("Failed to register network callback", e9);
                                this.f30316p.set(true);
                            }
                        }
                    }
                    this.f30305d = true;
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.xf)).booleanValue()) {
            return;
        }
        C4906k.f40186C.f40191c.E(context, c5189a.f41845n);
    }

    public final Resources c() {
        if (this.f30307f.f41848w) {
            return this.f30306e.getResources();
        }
        try {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.nc)).booleanValue()) {
                return com.bumptech.glide.e.y(this.f30306e).f4132a.getResources();
            }
            com.bumptech.glide.e.y(this.f30306e).f4132a.getResources();
            return null;
        } catch (x2.j e9) {
            int i = w2.z.f41712b;
            x2.i.g("Cannot load resource from dynamite apk or local jar", e9);
            return null;
        }
    }

    public final void d(String str, Throwable th) {
        C2521Ce.b(this.f30306e, this.f30307f).e(str, th);
    }

    public final void e(String str, Throwable th) {
        C2521Ce.b(this.f30306e, this.f30307f).f(th, str, ((Double) AbstractC2888Ya.f29463f.r()).floatValue());
    }

    public final void f(String str, Throwable th) {
        Context context = this.f30306e;
        C5189a c5189a = this.f30307f;
        synchronized (C2521Ce.f24899E) {
            try {
                if (C2521Ce.f24901G == null) {
                    C3324ha c3324ha = AbstractC3592ma.f32758A8;
                    s2.r rVar = s2.r.f40506e;
                    if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                        if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.f33212z8)).booleanValue()) {
                            C2521Ce.f24901G = new C2521Ce(context, c5189a);
                        }
                    }
                    C2521Ce.f24901G = new C2889Yb(15);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C2521Ce.f24901G.e(str, th);
    }

    public final C5140B g() {
        C5140B c5140b;
        synchronized (this.f30302a) {
            c5140b = this.f30303b;
        }
        return c5140b;
    }

    public final P3.a h() {
        if (this.f30306e != null) {
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32853M3)).booleanValue()) {
                synchronized (this.f30314n) {
                    try {
                        P3.a aVar = this.f30315o;
                        if (aVar != null) {
                            return aVar;
                        }
                        P3.a b9 = AbstractC3436jg.f32055a.b(new CallableC3572m7(1, this));
                        this.f30315o = b9;
                        return b9;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return QC.c(new ArrayList());
    }

    public final boolean i(Context context) {
        if (V2.b.f()) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.C9)).booleanValue()) {
                return this.f30316p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
