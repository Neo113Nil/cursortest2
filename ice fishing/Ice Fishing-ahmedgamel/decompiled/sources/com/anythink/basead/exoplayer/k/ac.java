package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final long f9122a = Long.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    private static final long f9123b = 8589934592L;

    /* renamed from: c, reason: collision with root package name */
    private long f9124c;

    /* renamed from: d, reason: collision with root package name */
    private long f9125d;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f9126e = com.anythink.basead.exoplayer.b.f7168b;

    public ac(long j6) {
        c(j6);
    }

    private long b() {
        return this.f9124c;
    }

    private synchronized void c(long j6) {
        a.b(this.f9126e == com.anythink.basead.exoplayer.b.f7168b);
        this.f9124c = j6;
    }

    private void d() {
        this.f9126e = com.anythink.basead.exoplayer.b.f7168b;
    }

    private synchronized void e() {
        while (this.f9126e == com.anythink.basead.exoplayer.b.f7168b) {
            wait();
        }
    }

    public final long a() {
        if (this.f9124c == Long.MAX_VALUE) {
            return 0L;
        }
        return this.f9126e == com.anythink.basead.exoplayer.b.f7168b ? com.anythink.basead.exoplayer.b.f7168b : this.f9125d;
    }

    private static long d(long j6) {
        return (j6 * 1000000) / 90000;
    }

    public final long b(long j6) {
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        if (this.f9126e != com.anythink.basead.exoplayer.b.f7168b) {
            this.f9126e = j6;
        } else {
            long j9 = this.f9124c;
            if (j9 != Long.MAX_VALUE) {
                this.f9125d = j9 - j6;
            }
            synchronized (this) {
                this.f9126e = j6;
                notifyAll();
            }
        }
        return j6 + this.f9125d;
    }

    public final long a(long j6) {
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        if (this.f9126e != com.anythink.basead.exoplayer.b.f7168b) {
            long j9 = (this.f9126e * 90000) / 1000000;
            long j10 = (4294967296L + j9) / f9123b;
            long j11 = ((j10 - 1) * f9123b) + j6;
            long j12 = (j10 * f9123b) + j6;
            j6 = Math.abs(j11 - j9) < Math.abs(j12 - j9) ? j11 : j12;
        }
        return b((j6 * 1000000) / 90000);
    }

    private long c() {
        if (this.f9126e != com.anythink.basead.exoplayer.b.f7168b) {
            return this.f9126e + this.f9125d;
        }
        long j6 = this.f9124c;
        return j6 != Long.MAX_VALUE ? j6 : com.anythink.basead.exoplayer.b.f7168b;
    }

    private static long e(long j6) {
        return (j6 * 90000) / 1000000;
    }
}
