package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8493a = Long.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    private static final long f8494b = 8589934592L;

    /* renamed from: c, reason: collision with root package name */
    private long f8495c;

    /* renamed from: d, reason: collision with root package name */
    private long f8496d;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f8497e = com.anythink.basead.exoplayer.b.f6539b;

    public ac(long j9) {
        c(j9);
    }

    private long b() {
        return this.f8495c;
    }

    private synchronized void c(long j9) {
        C0544a.b(this.f8497e == com.anythink.basead.exoplayer.b.f6539b);
        this.f8495c = j9;
    }

    private void d() {
        this.f8497e = com.anythink.basead.exoplayer.b.f6539b;
    }

    private synchronized void e() {
        while (this.f8497e == com.anythink.basead.exoplayer.b.f6539b) {
            wait();
        }
    }

    public final long a() {
        if (this.f8495c == Long.MAX_VALUE) {
            return 0L;
        }
        return this.f8497e == com.anythink.basead.exoplayer.b.f6539b ? com.anythink.basead.exoplayer.b.f6539b : this.f8496d;
    }

    private static long d(long j9) {
        return (j9 * 1000000) / 90000;
    }

    public final long b(long j9) {
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        if (this.f8497e != com.anythink.basead.exoplayer.b.f6539b) {
            this.f8497e = j9;
        } else {
            long j10 = this.f8495c;
            if (j10 != Long.MAX_VALUE) {
                this.f8496d = j10 - j9;
            }
            synchronized (this) {
                this.f8497e = j9;
                notifyAll();
            }
        }
        return j9 + this.f8496d;
    }

    public final long a(long j9) {
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        if (this.f8497e != com.anythink.basead.exoplayer.b.f6539b) {
            long j10 = (this.f8497e * 90000) / 1000000;
            long j11 = (4294967296L + j10) / f8494b;
            long j12 = ((j11 - 1) * f8494b) + j9;
            long j13 = (j11 * f8494b) + j9;
            j9 = Math.abs(j12 - j10) < Math.abs(j13 - j10) ? j12 : j13;
        }
        return b((j9 * 1000000) / 90000);
    }

    private long c() {
        if (this.f8497e != com.anythink.basead.exoplayer.b.f6539b) {
            return this.f8497e + this.f8496d;
        }
        long j9 = this.f8495c;
        return j9 != Long.MAX_VALUE ? j9 : com.anythink.basead.exoplayer.b.f6539b;
    }

    private static long e(long j9) {
        return (j9 * 90000) / 1000000;
    }
}
