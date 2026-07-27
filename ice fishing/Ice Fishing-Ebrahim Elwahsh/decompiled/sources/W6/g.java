package W6;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final double f3473a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3474b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f3475c;

    public g(double d2, double d3) {
        double d9 = d2 / 1.0E9d;
        this.f3473a = d9;
        long j9 = (long) (d3 / d9);
        this.f3474b = j9;
        this.f3475c = new AtomicLong(System.nanoTime() - j9);
    }

    public final boolean a(double d2) {
        AtomicLong atomicLong;
        long j9;
        long nanoTime;
        long j10;
        long j11 = (long) (d2 / this.f3473a);
        do {
            atomicLong = this.f3475c;
            j9 = atomicLong.get();
            nanoTime = System.nanoTime();
            long j12 = nanoTime - j9;
            long j13 = this.f3474b;
            if (j12 > j13) {
                j12 = j13;
            }
            j10 = j12 - j11;
            if (j10 < 0) {
                return false;
            }
        } while (!atomicLong.compareAndSet(j9, nanoTime - j10));
        return true;
    }
}
