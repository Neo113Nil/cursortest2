package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class Dt {

    /* renamed from: a, reason: collision with root package name */
    public long f24485a;

    /* renamed from: b, reason: collision with root package name */
    public long f24486b;

    /* renamed from: c, reason: collision with root package name */
    public long f24487c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f24488d = new ThreadLocal();

    public Dt() {
        b(0L);
    }

    public final synchronized long a() {
        long j6 = this.f24485a;
        return (j6 == Long.MAX_VALUE || j6 == 9223372036854775806L) ? com.anythink.basead.exoplayer.b.f6382b : j6;
    }

    public final synchronized void b(long j6) {
        this.f24485a = j6;
        this.f24486b = j6 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f24487c = com.anythink.basead.exoplayer.b.f6382b;
    }

    public final synchronized long c(long j6) {
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        try {
            long j9 = this.f24487c;
            if (j9 != com.anythink.basead.exoplayer.b.f6382b) {
                long w6 = AbstractC3159eu.w(j9, 90000L, 1000000L, RoundingMode.DOWN);
                long j10 = (4294967296L + w6) / 8589934592L;
                long j11 = (((-1) + j10) * 8589934592L) + j6;
                long j12 = (j10 * 8589934592L) + j6;
                j6 = Math.abs(j11 - w6) < Math.abs(j12 - w6) ? j11 : j12;
            }
            return e(AbstractC3159eu.w(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d(long j6) {
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        try {
            long j9 = this.f24487c;
            if (j9 != com.anythink.basead.exoplayer.b.f6382b) {
                long w6 = AbstractC3159eu.w(j9, 90000L, 1000000L, RoundingMode.DOWN);
                long j10 = w6 / 8589934592L;
                long j11 = (j10 * 8589934592L) + j6;
                j6 = j11 >= w6 ? j11 : ((j10 + 1) * 8589934592L) + j6;
            }
            return e(AbstractC3159eu.w(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long e(long j6) {
        long j9;
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        try {
            synchronized (this) {
                if (!(this.f24486b != com.anythink.basead.exoplayer.b.f6382b)) {
                    long j10 = this.f24485a;
                    if (j10 == 9223372036854775806L) {
                        Long l9 = (Long) this.f24488d.get();
                        if (l9 == null) {
                            throw null;
                        }
                        j10 = l9.longValue();
                    }
                    this.f24486b = j10 - j6;
                    notifyAll();
                }
                this.f24487c = j6;
                j9 = j6 + this.f24486b;
            }
            return j9;
        } catch (Throwable th) {
            throw th;
        }
    }
}
