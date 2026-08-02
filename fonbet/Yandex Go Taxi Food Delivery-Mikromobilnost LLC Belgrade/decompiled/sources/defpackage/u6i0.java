package defpackage;

import java.util.Random;

/* loaded from: classes15.dex */
public final class u6i0 {
    public final long a;
    public final long b;
    public final Random c = new Random();
    public final long d;
    public int e;
    public final int f;

    public u6i0(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.d = 2 * j;
        this.f = (int) (Math.log(j2 / j) / z6e.a);
    }

    public final long a() {
        long abs = Math.abs(this.c.nextLong()) % this.d;
        int i = this.e;
        int i2 = this.f;
        int min = Math.min(i2, i);
        long j = this.a;
        if (min != 0) {
            j = min == i2 ? this.b + abs : (j * (1 << min)) + abs;
        }
        this.e++;
        return j;
    }
}
