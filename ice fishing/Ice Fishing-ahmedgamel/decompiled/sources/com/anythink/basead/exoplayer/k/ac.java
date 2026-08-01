package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8336a = Long.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    private static final long f8337b = 8589934592L;

    /* renamed from: c, reason: collision with root package name */
    private long f8338c;

    /* renamed from: d, reason: collision with root package name */
    private long f8339d;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f8340e = com.anythink.basead.exoplayer.b.f6382b;

    public ac(long j6) {
        c(j6);
    }

    private long b() {
        return this.f8338c;
    }

    private synchronized void c(long j6) {
        a.b(this.f8340e == com.anythink.basead.exoplayer.b.f6382b);
        this.f8338c = j6;
    }

    private void d() {
        this.f8340e = com.anythink.basead.exoplayer.b.f6382b;
    }

    private synchronized void e() {
        while (this.f8340e == com.anythink.basead.exoplayer.b.f6382b) {
            wait();
        }
    }

    public final long a() {
        if (this.f8338c == Long.MAX_VALUE) {
            return 0L;
        }
        return this.f8340e == com.anythink.basead.exoplayer.b.f6382b ? com.anythink.basead.exoplayer.b.f6382b : this.f8339d;
    }

    private static long d(long j6) {
        return (j6 * 1000000) / 90000;
    }

    public final long b(long j6) {
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        if (this.f8340e != com.anythink.basead.exoplayer.b.f6382b) {
            this.f8340e = j6;
        } else {
            long j9 = this.f8338c;
            if (j9 != Long.MAX_VALUE) {
                this.f8339d = j9 - j6;
            }
            synchronized (this) {
                this.f8340e = j6;
                notifyAll();
            }
        }
        return j6 + this.f8339d;
    }

    public final long a(long j6) {
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        if (this.f8340e != com.anythink.basead.exoplayer.b.f6382b) {
            long j9 = (this.f8340e * 90000) / 1000000;
            long j10 = (4294967296L + j9) / f8337b;
            long j11 = ((j10 - 1) * f8337b) + j6;
            long j12 = (j10 * f8337b) + j6;
            j6 = Math.abs(j11 - j9) < Math.abs(j12 - j9) ? j11 : j12;
        }
        return b((j6 * 1000000) / 90000);
    }

    private long c() {
        if (this.f8340e != com.anythink.basead.exoplayer.b.f6382b) {
            return this.f8340e + this.f8339d;
        }
        long j6 = this.f8338c;
        return j6 != Long.MAX_VALUE ? j6 : com.anythink.basead.exoplayer.b.f6382b;
    }

    private static long e(long j6) {
        return (j6 * 90000) / 1000000;
    }
}
