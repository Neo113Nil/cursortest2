package a7;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final double f4362a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4363b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f4364c;

    public g(double d2, double d9) {
        double d10 = d2 / 1.0E9d;
        this.f4362a = d10;
        long j6 = (long) (d9 / d10);
        this.f4363b = j6;
        this.f4364c = new AtomicLong(System.nanoTime() - j6);
    }

    public final boolean a(double d2) {
        AtomicLong atomicLong;
        long j6;
        long nanoTime;
        long j9;
        long j10 = (long) (d2 / this.f4362a);
        do {
            atomicLong = this.f4364c;
            j6 = atomicLong.get();
            nanoTime = System.nanoTime();
            long j11 = nanoTime - j6;
            long j12 = this.f4363b;
            if (j11 > j12) {
                j11 = j12;
            }
            j9 = j11 - j10;
            if (j9 < 0) {
                return false;
            }
        } while (!atomicLong.compareAndSet(j6, nanoTime - j9));
        return true;
    }
}
