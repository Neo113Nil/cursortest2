package com.google.android.gms.internal.ads;

import java.util.Random;

/* loaded from: classes2.dex */
public final class Gv {

    /* renamed from: a, reason: collision with root package name */
    public final long f25162a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25163b;

    /* renamed from: f, reason: collision with root package name */
    public final T2.a f25167f;

    /* renamed from: g, reason: collision with root package name */
    public final C3534lt f25168g;

    /* renamed from: h, reason: collision with root package name */
    public long f25169h;

    /* renamed from: d, reason: collision with root package name */
    public long f25165d = 5;

    /* renamed from: e, reason: collision with root package name */
    public long f25166e = 0;
    public final Random i = new Random();

    /* renamed from: c, reason: collision with root package name */
    public long f25164c = 0;

    public Gv(long j6, long j9, T2.a aVar, C3534lt c3534lt) {
        this.f25162a = j6;
        this.f25163b = j9;
        this.f25168g = c3534lt;
        this.f25167f = aVar;
        a();
    }

    public final synchronized void a() {
        this.f25169h = this.f25162a;
        this.f25164c = 0L;
        this.f25166e = 0L;
    }

    public final synchronized long b() {
        double d2;
        double d9;
        long j6;
        d2 = this.f25169h;
        d9 = 0.2d * d2;
        j6 = (long) (d2 + d9);
        return ((long) (d2 - d9)) + ((long) (this.i.nextDouble() * ((j6 - r0) + 1)));
    }

    public final synchronized void c() {
        long b9 = b();
        this.f25167f.getClass();
        this.f25166e = System.currentTimeMillis() + b9;
        double d2 = this.f25169h;
        long j6 = this.f25163b;
        this.f25169h = Math.min((long) (d2 + d2), j6);
        this.f25164c++;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32070M)).booleanValue()) {
            this.f25168g.y(System.currentTimeMillis(), this.f25164c, this.f25169h, this.f25165d, j6);
        }
    }

    public final synchronized boolean d() {
        if (((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32079N)).intValue() < 0) {
            return false;
        }
        if (this.f25164c > Math.max(this.f25165d, ((Integer) r1.f40210c.a(r0)).intValue())) {
            if (this.f25169h >= this.f25163b) {
                return true;
            }
        }
        return false;
    }
}
