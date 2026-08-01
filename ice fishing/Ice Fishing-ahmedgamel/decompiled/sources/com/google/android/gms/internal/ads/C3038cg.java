package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p2.C4835j;
import q2.C4900p;
import u2.C5069B;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.cg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3038cg {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29517a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C5069B f29518b;

    /* renamed from: c, reason: collision with root package name */
    public final C3199fg f29519c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29520d;

    /* renamed from: e, reason: collision with root package name */
    public Context f29521e;

    /* renamed from: f, reason: collision with root package name */
    public C5110a f29522f;

    /* renamed from: g, reason: collision with root package name */
    public String f29523g;

    /* renamed from: h, reason: collision with root package name */
    public C4300b f29524h;
    public C3153eo i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f29525j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f29526k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f29527l;

    /* renamed from: m, reason: collision with root package name */
    public final C2985bg f29528m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f29529n;

    /* renamed from: o, reason: collision with root package name */
    public N3.a f29530o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f29531p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f29532q;

    public C3038cg() {
        C5069B c5069b = new C5069B();
        this.f29518b = c5069b;
        this.f29519c = new C3199fg(C4900p.f40199g.f40205f, c5069b);
        this.f29520d = false;
        this.f29524h = null;
        this.i = null;
        this.f29525j = null;
        this.f29526k = new AtomicInteger(0);
        this.f29527l = new AtomicInteger(0);
        this.f29528m = new C2985bg();
        this.f29529n = new Object();
        this.f29531p = new AtomicBoolean();
        this.f29532q = new AtomicBoolean(false);
    }

    public final C4300b a() {
        C4300b c4300b;
        synchronized (this.f29517a) {
            c4300b = this.f29524h;
        }
        return c4300b;
    }

    public final void b(Context context, C5110a c5110a, C3153eo c3153eo) {
        C4300b c4300b;
        synchronized (this.f29517a) {
            try {
                if (!this.f29520d) {
                    this.f29521e = context.getApplicationContext();
                    this.f29522f = c5110a;
                    C4835j.f39733C.f39742g.i(this.f29519c);
                    this.f29518b.k(this.f29521e);
                    C2501Ce.b(this.f29521e, this.f29522f);
                    this.i = c3153eo;
                    C3301ha c3301ha = AbstractC3569ma.f32007E2;
                    q2.r rVar = q2.r.f40207e;
                    if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                        c4300b = new C4300b();
                    } else {
                        u2.z.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        c4300b = null;
                    }
                    this.f29524h = c4300b;
                    if (c4300b != null) {
                        MA.f(new C2931ag(this).l(), "AppState.registerCsiReporter", AbstractC3413jg.f31275h);
                    }
                    Context context2 = this.f29521e;
                    if (T2.b.f()) {
                        if (((Boolean) rVar.f40210c.a(AbstractC3569ma.C9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new Q0.h(this));
                            } catch (RuntimeException e9) {
                                int i = u2.z.f41322b;
                                v2.i.g("Failed to register network callback", e9);
                                this.f29531p.set(true);
                            }
                        }
                    }
                    this.f29520d = true;
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.xf)).booleanValue()) {
            return;
        }
        C4835j.f39733C.f39738c.E(context, c5110a.f41391n);
    }

    public final Resources c() {
        if (this.f29522f.f41394w) {
            return this.f29521e.getResources();
        }
        try {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.nc)).booleanValue()) {
                return com.bumptech.glide.f.D(this.f29521e).f3784a.getResources();
            }
            com.bumptech.glide.f.D(this.f29521e).f3784a.getResources();
            return null;
        } catch (v2.j e9) {
            int i = u2.z.f41322b;
            v2.i.g("Cannot load resource from dynamite apk or local jar", e9);
            return null;
        }
    }

    public final void d(String str, Throwable th) {
        C2501Ce.b(this.f29521e, this.f29522f).e(str, th);
    }

    public final void e(String str, Throwable th) {
        C2501Ce.b(this.f29521e, this.f29522f).f(th, str, ((Double) AbstractC2865Ya.f28688f.r()).floatValue());
    }

    public final void f(String str, Throwable th) {
        Context context = this.f29521e;
        C5110a c5110a = this.f29522f;
        synchronized (C2501Ce.f24164E) {
            try {
                if (C2501Ce.f24166G == null) {
                    C3301ha c3301ha = AbstractC3569ma.f31977A8;
                    q2.r rVar = q2.r.f40207e;
                    if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                        if (!((Boolean) rVar.f40210c.a(AbstractC3569ma.f32432z8)).booleanValue()) {
                            C2501Ce.f24166G = new C2501Ce(context, c5110a);
                        }
                    }
                    C2501Ce.f24166G = new C2866Yb(15);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C2501Ce.f24166G.e(str, th);
    }

    public final C5069B g() {
        C5069B c5069b;
        synchronized (this.f29517a) {
            c5069b = this.f29518b;
        }
        return c5069b;
    }

    public final N3.a h() {
        if (this.f29521e != null) {
            if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32074M3)).booleanValue()) {
                synchronized (this.f29529n) {
                    try {
                        N3.a aVar = this.f29530o;
                        if (aVar != null) {
                            return aVar;
                        }
                        N3.a b9 = AbstractC3413jg.f31268a.b(new CallableC3549m7(1, this));
                        this.f29530o = b9;
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
        if (T2.b.f()) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.C9)).booleanValue()) {
                return this.f29531p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
