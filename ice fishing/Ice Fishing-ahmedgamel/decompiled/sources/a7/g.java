package a7;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final double f4330a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4331b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f4332c;

    public g(double d9, double d10) {
        double d11 = d9 / 1.0E9d;
        this.f4330a = d11;
        long j6 = (long) (d10 / d11);
        this.f4331b = j6;
        this.f4332c = new AtomicLong(System.nanoTime() - j6);
    }

    public final boolean a(double d9) {
        AtomicLong atomicLong;
        long j6;
        long nanoTime;
        long j9;
        long j10 = (long) (d9 / this.f4330a);
        do {
            atomicLong = this.f4332c;
            j6 = atomicLong.get();
            nanoTime = System.nanoTime();
            long j11 = nanoTime - j6;
            long j12 = this.f4331b;
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
