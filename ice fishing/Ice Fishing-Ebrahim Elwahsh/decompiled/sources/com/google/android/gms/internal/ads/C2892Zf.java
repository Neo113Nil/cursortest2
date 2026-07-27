package com.google.android.gms.internal.ads;

import a.AbstractC0415a;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C4907p;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Zf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2892Zf {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29012a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final t2.E f29013b;

    /* renamed from: c, reason: collision with root package name */
    public final C2994bg f29014c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29015d;

    /* renamed from: e, reason: collision with root package name */
    public Context f29016e;

    /* renamed from: f, reason: collision with root package name */
    public C5107a f29017f;

    /* renamed from: g, reason: collision with root package name */
    public String f29018g;

    /* renamed from: h, reason: collision with root package name */
    public C4313b f29019h;
    public C3165eo i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f29020j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f29021k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f29022l;

    /* renamed from: m, reason: collision with root package name */
    public final C2875Yf f29023m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f29024n;

    /* renamed from: o, reason: collision with root package name */
    public J3.a f29025o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f29026p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f29027q;

    public C2892Zf() {
        t2.E e6 = new t2.E();
        this.f29013b = e6;
        this.f29014c = new C2994bg(C4907p.f40108g.f40114f, e6);
        this.f29015d = false;
        this.f29019h = null;
        this.i = null;
        this.f29020j = null;
        this.f29021k = new AtomicInteger(0);
        this.f29022l = new AtomicInteger(0);
        this.f29023m = new C2875Yf();
        this.f29024n = new Object();
        this.f29026p = new AtomicBoolean();
        this.f29027q = new AtomicBoolean(false);
    }

    public final C4313b a() {
        C4313b c4313b;
        synchronized (this.f29012a) {
            c4313b = this.f29019h;
        }
        return c4313b;
    }

    public final void b(Context context, C5107a c5107a, C3165eo c3165eo) {
        C4313b c4313b;
        synchronized (this.f29012a) {
            try {
                if (!this.f29015d) {
                    this.f29016e = context.getApplicationContext();
                    this.f29017f = c5107a;
                    p2.j.f39798C.f39807g.i(this.f29014c);
                    this.f29013b.k(this.f29016e);
                    C4287ze.b(this.f29016e, this.f29017f);
                    this.i = c3165eo;
                    C3151ea c3151ea = AbstractC3368ia.f31427E2;
                    q2.r rVar = q2.r.f40116e;
                    if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                        c4313b = new C4313b();
                    } else {
                        t2.C.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        c4313b = null;
                    }
                    this.f29019h = c4313b;
                    if (c4313b != null) {
                        AbstractC2720Pd.g(new C2858Xf(this).l(), "AppState.registerCsiReporter", AbstractC3212fg.f30745h);
                    }
                    Context context2 = this.f29016e;
                    if (S2.b.f()) {
                        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.C9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new Q0.h(this));
                            } catch (RuntimeException e6) {
                                int i = t2.C.f40822b;
                                u2.i.g("Failed to register network callback", e6);
                                this.f29026p.set(true);
                            }
                        }
                    }
                    this.f29015d = true;
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.rf)).booleanValue()) {
            return;
        }
        p2.j.f39798C.f39803c.E(context, c5107a.f41217n);
    }

    public final Resources c() {
        if (this.f29017f.f41220w) {
            return this.f29016e.getResources();
        }
        try {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.nc)).booleanValue()) {
                return AbstractC0415a.I(this.f29016e).f3436a.getResources();
            }
            AbstractC0415a.I(this.f29016e).f3436a.getResources();
            return null;
        } catch (u2.j e6) {
            int i = t2.C.f40822b;
            u2.i.g("Cannot load resource from dynamite apk or local jar", e6);
            return null;
        }
    }

    public final void d(String str, Throwable th) {
        C4287ze.b(this.f29016e, this.f29017f).e(str, th);
    }

    public final void e(String str, Throwable th) {
        C4287ze.b(this.f29016e, this.f29017f).f(th, str, ((Double) AbstractC2802Ua.f28040f.r()).floatValue());
    }

    public final void f(String str, Throwable th) {
        Context context = this.f29016e;
        C5107a c5107a = this.f29017f;
        synchronized (C4287ze.f35563E) {
            try {
                if (C4287ze.f35565G == null) {
                    C3151ea c3151ea = AbstractC3368ia.A8;
                    q2.r rVar = q2.r.f40116e;
                    if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                        if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.z8)).booleanValue()) {
                            C4287ze.f35565G = new C4287ze(context, c5107a);
                        }
                    }
                    C4287ze.f35565G = new C2837Wb(15);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C4287ze.f35565G.e(str, th);
    }

    public final t2.E g() {
        t2.E e6;
        synchronized (this.f29012a) {
            e6 = this.f29013b;
        }
        return e6;
    }

    public final J3.a h() {
        if (this.f29016e != null) {
            if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31495M3)).booleanValue()) {
                synchronized (this.f29024n) {
                    try {
                        J3.a aVar = this.f29025o;
                        if (aVar != null) {
                            return aVar;
                        }
                        J3.a b9 = AbstractC3212fg.f30738a.b(new CallableC3454k7(1, this));
                        this.f29025o = b9;
                        return b9;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return C3686oN.c(new ArrayList());
    }

    public final boolean i(Context context) {
        if (S2.b.f()) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.C9)).booleanValue()) {
                return this.f29026p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
