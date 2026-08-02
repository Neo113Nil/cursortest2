package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class lis {
    public final /* synthetic */ int a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;

    public lis(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new long[10];
                this.c = new Object[10];
                break;
            default:
                this.b = new long[10];
                this.c = new Object[10];
                break;
        }
    }

    public synchronized void a(long j, Object obj) {
        if (this.e > 0) {
            if (j <= this.b[((this.d + r0) - 1) % this.c.length]) {
                b();
            }
        }
        c();
        int i = this.d;
        int i2 = this.e;
        Object[] objArr = this.c;
        int length = (i + i2) % objArr.length;
        this.b[length] = j;
        objArr[length] = obj;
        this.e = i2 + 1;
    }

    public synchronized void b() {
        this.d = 0;
        this.e = 0;
        Arrays.fill(this.c, (Object) null);
    }

    public void c() {
        int length = this.c.length;
        if (this.e < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.d;
        int i3 = length - i2;
        System.arraycopy(this.b, i2, jArr, 0, i3);
        System.arraycopy(this.c, this.d, objArr, 0, i3);
        int i4 = this.d;
        if (i4 > 0) {
            System.arraycopy(this.b, 0, jArr, i3, i4);
            System.arraycopy(this.c, 0, objArr, i3, this.d);
        }
        this.b = jArr;
        this.c = objArr;
        this.d = 0;
    }

    public final Object d(long j, boolean z) {
        switch (this.a) {
            case 0:
                long j2 = Long.MAX_VALUE;
                Object obj = null;
                while (true) {
                    int i = this.e;
                    if (i > 0) {
                        long j3 = j - this.b[this.d];
                        if (j3 >= 0 || (!z && (-j3) < j2)) {
                            vnj.o(i > 0);
                            Object[] objArr = this.c;
                            int i2 = this.d;
                            Object obj2 = objArr[i2];
                            objArr[i2] = null;
                            this.d = (i2 + 1) % objArr.length;
                            this.e--;
                            obj = obj2;
                            j2 = j3;
                        }
                    }
                }
                return obj;
            default:
                Object obj3 = null;
                long j4 = Long.MAX_VALUE;
                while (this.e > 0) {
                    long j5 = j - this.b[this.d];
                    if (j5 >= 0 || (!z && (-j5) < j4)) {
                        obj3 = g();
                        j4 = j5;
                    }
                    return obj3;
                    break;
                }
                return obj3;
        }
    }

    public synchronized Object e() {
        return this.e == 0 ? null : g();
    }

    public synchronized Object f(long j) {
        return d(j, true);
    }

    public Object g() {
        vq1.A(this.e > 0);
        Object[] objArr = this.c;
        int i = this.d;
        Object obj = objArr[i];
        objArr[i] = null;
        this.d = (i + 1) % objArr.length;
        this.e--;
        return obj;
    }

    public synchronized int h() {
        return this.e;
    }
}
