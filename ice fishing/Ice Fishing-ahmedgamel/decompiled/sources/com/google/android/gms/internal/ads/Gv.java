package com.google.android.gms.internal.ads;

import java.util.Random;

/* loaded from: classes2.dex */
public final class Gv {

    /* renamed from: a, reason: collision with root package name */
    public final long f25934a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25935b;

    /* renamed from: f, reason: collision with root package name */
    public final V2.a f25939f;

    /* renamed from: g, reason: collision with root package name */
    public final C3557lt f25940g;

    /* renamed from: h, reason: collision with root package name */
    public long f25941h;

    /* renamed from: d, reason: collision with root package name */
    public long f25937d = 5;

    /* renamed from: e, reason: collision with root package name */
    public long f25938e = 0;
    public final Random i = new Random();

    /* renamed from: c, reason: collision with root package name */
    public long f25936c = 0;

    public Gv(long j6, long j9, V2.a aVar, C3557lt c3557lt) {
        this.f25934a = j6;
        this.f25935b = j9;
        this.f25940g = c3557lt;
        this.f25939f = aVar;
        a();
    }

    public final synchronized void a() {
        this.f25941h = this.f25934a;
        this.f25936c = 0L;
        this.f25938e = 0L;
    }

    public final synchronized long b() {
        double d9;
        double d10;
        long j6;
        d9 = this.f25941h;
        d10 = 0.2d * d9;
        j6 = (long) (d9 + d10);
        return ((long) (d9 - d10)) + ((long) (this.i.nextDouble() * ((j6 - r0) + 1)));
    }

    public final synchronized void c() {
        long b9 = b();
        this.f25939f.getClass();
        this.f25938e = System.currentTimeMillis() + b9;
        double d9 = this.f25941h;
        long j6 = this.f25935b;
        this.f25941h = Math.min((long) (d9 + d9), j6);
        this.f25936c++;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32849M)).booleanValue()) {
            this.f25940g.y(System.currentTimeMillis(), this.f25936c, this.f25941h, this.f25937d, j6);
        }
    }

    public final synchronized boolean d() {
        if (((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32858N)).intValue() < 0) {
            return false;
        }
        if (this.f25936c > Math.max(this.f25937d, ((Integer) r1.f40509c.a(r0)).intValue())) {
            if (this.f25941h >= this.f25935b) {
                return true;
            }
        }
        return false;
    }
}
