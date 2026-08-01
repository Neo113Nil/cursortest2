package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.HashMap;
import p2.C4835j;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.dg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3092dg {

    /* renamed from: h, reason: collision with root package name */
    public final String f29798h;
    public final C5069B i;

    /* renamed from: a, reason: collision with root package name */
    public long f29791a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f29792b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f29793c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f29794d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f29795e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f29796f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final Object f29797g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public int f29799j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f29800k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f29801l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f29802m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f29803n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f29804o = new HashMap();

    public C3092dg(String str, C5069B c5069b) {
        this.f29798h = str;
        this.i = c5069b;
    }

    public final void a(q2.c1 c1Var, long j6) {
        long j9;
        long j10;
        Bundle bundle;
        int i;
        synchronized (this.f29796f) {
            try {
                C5069B c5069b = this.i;
                c5069b.i();
                synchronized (c5069b.f41209a) {
                    j9 = c5069b.f41222o;
                }
                C4835j.f39733C.f39745k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f29792b == -1) {
                    if (currentTimeMillis - j9 > ((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f31989C1)).longValue()) {
                        this.f29794d = -1;
                    } else {
                        c5069b.i();
                        synchronized (c5069b.f41209a) {
                            i = c5069b.f41224q;
                        }
                        this.f29794d = i;
                    }
                    this.f29792b = j6;
                    this.f29791a = j6;
                } else {
                    this.f29791a = j6;
                }
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32402w4)).booleanValue() || (bundle = c1Var.f40120v) == null || bundle.getInt("gw", 2) != 1) {
                    this.f29793c++;
                    int i6 = this.f29794d + 1;
                    this.f29794d = i6;
                    if (i6 == 0) {
                        this.f29795e = 0L;
                        c5069b.o(currentTimeMillis);
                    } else {
                        c5069b.i();
                        synchronized (c5069b.f41209a) {
                            j10 = c5069b.f41223p;
                        }
                        this.f29795e = currentTimeMillis - j10;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (((Boolean) AbstractC2833Wa.f28355a.r()).booleanValue()) {
            synchronized (this.f29796f) {
                this.f29793c--;
                this.f29794d--;
            }
        }
    }
}
