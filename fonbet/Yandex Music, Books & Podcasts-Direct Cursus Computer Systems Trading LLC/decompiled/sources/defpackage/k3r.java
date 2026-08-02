package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class k3r implements vx1 {
    public int b;
    public float c;
    public float d;
    public tx1 e;
    public tx1 f;
    public tx1 g;
    public tx1 h;
    public boolean i;
    public j3r j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // defpackage.vx1
    public final boolean b() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.vx1
    public final ByteBuffer c() {
        j3r j3rVar = this.j;
        if (j3rVar != null) {
            int i = j3rVar.b;
            vq1.A(j3rVar.m >= 0);
            int i2 = j3rVar.m * i * 2;
            if (i2 > 0) {
                if (this.k.capacity() < i2) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                vq1.A(j3rVar.m >= 0);
                int min = Math.min(shortBuffer.remaining() / i, j3rVar.m);
                int i3 = min * i;
                shortBuffer.put(j3rVar.l, 0, i3);
                int i4 = j3rVar.m - min;
                j3rVar.m = i4;
                short[] sArr = j3rVar.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.o += i2;
                this.k.limit(i2);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = vx1.a;
        return byteBuffer;
    }

    @Override // defpackage.vx1
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            j3r j3rVar = this.j;
            j3rVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = j3rVar.b;
            int i2 = remaining2 / i;
            short[] c = j3rVar.c(j3rVar.j, j3rVar.k, i2);
            j3rVar.j = c;
            asShortBuffer.get(c, j3rVar.k * i, ((i2 * i) * 2) / 2);
            j3rVar.k += i2;
            j3rVar.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // defpackage.vx1
    public final tx1 e(tx1 tx1Var) {
        if (tx1Var.c != 2) {
            throw new ux1(tx1Var);
        }
        int i = this.b;
        if (i == -1) {
            i = tx1Var.a;
        }
        this.e = tx1Var;
        tx1 tx1Var2 = new tx1(i, tx1Var.b, 2);
        this.f = tx1Var2;
        this.i = true;
        return tx1Var2;
    }

    @Override // defpackage.vx1
    public final void f() {
        j3r j3rVar = this.j;
        if (j3rVar != null) {
            int i = j3rVar.k;
            float f = j3rVar.c;
            float f2 = j3rVar.d;
            double d = f / f2;
            int i2 = j3rVar.m + ((int) (((((((i - r6) / d) + j3rVar.r) + j3rVar.w) + j3rVar.o) / (j3rVar.e * f2)) + 0.5d));
            j3rVar.w = 0.0d;
            short[] sArr = j3rVar.j;
            int i3 = j3rVar.h * 2;
            j3rVar.j = j3rVar.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = j3rVar.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                j3rVar.j[(i5 * i) + i4] = 0;
                i4++;
            }
            j3rVar.k = i3 + j3rVar.k;
            j3rVar.f();
            if (j3rVar.m > i2) {
                j3rVar.m = Math.max(i2, 0);
            }
            j3rVar.k = 0;
            j3rVar.r = 0;
            j3rVar.o = 0;
        }
        this.p = true;
    }

    @Override // defpackage.vx1
    public final void flush() {
        if (b()) {
            tx1 tx1Var = this.e;
            this.g = tx1Var;
            tx1 tx1Var2 = this.f;
            this.h = tx1Var2;
            if (this.i) {
                this.j = new j3r(this.c, this.d, tx1Var.a, tx1Var.b, tx1Var2.a);
            } else {
                j3r j3rVar = this.j;
                if (j3rVar != null) {
                    j3rVar.k = 0;
                    j3rVar.m = 0;
                    j3rVar.o = 0;
                    j3rVar.p = 0;
                    j3rVar.q = 0;
                    j3rVar.r = 0;
                    j3rVar.s = 0;
                    j3rVar.t = 0;
                    j3rVar.u = 0;
                    j3rVar.v = 0;
                    j3rVar.w = 0.0d;
                }
            }
        }
        this.m = vx1.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.vx1
    public final boolean g() {
        if (this.p) {
            j3r j3rVar = this.j;
            if (j3rVar != null) {
                vq1.A(j3rVar.m >= 0);
                if (j3rVar.m * j3rVar.b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.vx1
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        tx1 tx1Var = tx1.e;
        this.e = tx1Var;
        this.f = tx1Var;
        this.g = tx1Var;
        this.h = tx1Var;
        ByteBuffer byteBuffer = vx1.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
