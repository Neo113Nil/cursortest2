package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.math.BigInteger;
import java.util.HashSet;
import p2.C4835j;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.fg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3199fg implements B8 {

    /* renamed from: u, reason: collision with root package name */
    public final C5069B f30281u;

    /* renamed from: v, reason: collision with root package name */
    public final S0.c f30282v;

    /* renamed from: w, reason: collision with root package name */
    public final C3092dg f30283w;

    /* renamed from: n, reason: collision with root package name */
    public final Object f30280n = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f30284x = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final HashSet f30285y = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public boolean f30286z = false;

    public C3199fg(String str, C5069B c5069b) {
        this.f30283w = new C3092dg(str, c5069b);
        this.f30281u = c5069b;
        S0.c cVar = new S0.c(12, false);
        cVar.f2775u = BigInteger.ONE;
        cVar.f2776v = "0";
        this.f30282v = cVar;
    }

    public final void a(C2870Yf c2870Yf) {
        synchronized (this.f30280n) {
            this.f30284x.add(c2870Yf);
        }
    }

    @Override // com.google.android.gms.internal.ads.B8
    public final void e0(boolean z3) {
        long j6;
        int i;
        C4835j.f39733C.f39745k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (z3) {
            C5069B c5069b = this.f30281u;
            c5069b.i();
            synchronized (c5069b.f41209a) {
                j6 = c5069b.f41222o;
            }
            if (currentTimeMillis - j6 > ((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f31989C1)).longValue()) {
                this.f30283w.f29794d = -1;
            } else {
                C3092dg c3092dg = this.f30283w;
                c5069b.i();
                synchronized (c5069b.f41209a) {
                    i = c5069b.f41224q;
                }
                c3092dg.f29794d = i;
            }
            this.f30286z = true;
            return;
        }
        C5069B c5069b2 = this.f30281u;
        c5069b2.i();
        synchronized (c5069b2.f41209a) {
            try {
                if (c5069b2.f41222o != currentTimeMillis) {
                    c5069b2.f41222o = currentTimeMillis;
                    SharedPreferences.Editor editor = c5069b2.f41215g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", currentTimeMillis);
                        c5069b2.f41215g.apply();
                    }
                    c5069b2.j();
                }
            } finally {
            }
        }
        int i6 = this.f30283w.f29794d;
        c5069b2.i();
        synchronized (c5069b2.f41209a) {
            try {
                if (c5069b2.f41224q == i6) {
                    return;
                }
                c5069b2.f41224q = i6;
                SharedPreferences.Editor editor2 = c5069b2.f41215g;
                if (editor2 != null) {
                    editor2.putInt("request_in_session_count", i6);
                    c5069b2.f41215g.apply();
                }
                c5069b2.j();
            } finally {
            }
        }
    }
}
