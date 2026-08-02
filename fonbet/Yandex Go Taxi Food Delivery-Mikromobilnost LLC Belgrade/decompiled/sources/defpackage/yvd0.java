package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class yvd0 {
    public int a;
    public long[] b = new long[2];

    public final void a(long j) {
        if (c(j)) {
            return;
        }
        int i = this.a;
        long[] jArr = this.b;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            this.b = jArr;
        }
        jArr[i] = j;
        if (i >= this.a) {
            this.a = i + 1;
        }
    }

    public final void b() {
        this.a = 0;
    }

    public final boolean c(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final long d(int i) {
        return this.b[i];
    }

    public final int e() {
        return this.a;
    }

    public final boolean f() {
        return this.a == 0;
    }

    public final void g(long j) {
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.b[i2]) {
                int i3 = this.a - 1;
                while (i2 < i3) {
                    long[] jArr = this.b;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.a--;
                return;
            }
            i2++;
        }
    }

    public final void h(int i) {
        int i2 = this.a;
        if (i < i2) {
            int i3 = i2 - 1;
            while (i < i3) {
                long[] jArr = this.b;
                int i4 = i + 1;
                jArr[i] = jArr[i4];
                i = i4;
            }
            this.a--;
        }
    }
}
