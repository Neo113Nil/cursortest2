package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class nug {
    public final /* synthetic */ int a;
    public int b;
    public long[] c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nug(int i, byte b) {
        this(32);
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                break;
        }
    }

    public final void a(long j) {
        switch (this.a) {
            case 0:
                int i = this.b;
                long[] jArr = this.c;
                if (i == jArr.length) {
                    this.c = Arrays.copyOf(jArr, i * 2);
                }
                long[] jArr2 = this.c;
                int i2 = this.b;
                this.b = i2 + 1;
                jArr2[i2] = j;
                break;
            default:
                if (!c(j)) {
                    int i3 = this.b;
                    long[] jArr3 = this.c;
                    if (i3 >= jArr3.length) {
                        jArr3 = Arrays.copyOf(jArr3, Math.max(i3 + 1, jArr3.length * 2));
                        this.c = jArr3;
                    }
                    jArr3[i3] = j;
                    if (i3 >= this.b) {
                        this.b = i3 + 1;
                        break;
                    }
                }
                break;
        }
    }

    public void b(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = this.c;
        if (length > jArr2.length) {
            this.c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.c, this.b, jArr.length);
        this.b = length;
    }

    public boolean c(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public long d(int i) {
        if (i >= 0 && i < this.b) {
            return this.c[i];
        }
        l1j.k(this.b, k5r.q(i, "Invalid index ", ", size is "));
        return 0L;
    }

    public void e(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.c[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public nug(int i) {
        this.a = 0;
        this.c = new long[i];
    }
}
