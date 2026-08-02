package defpackage;

import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class cgq extends dq2 {
    public int n;
    public boolean o;
    public int p;
    public long q;
    public byte[] s;
    public byte[] v;
    public int r = 0;
    public int t = 0;
    public int u = 0;
    public final long l = 100000;
    public final float i = 0.2f;
    public final long m = 2000000;
    public final int k = 10;
    public final short j = 1024;

    public cgq() {
        byte[] bArr = dvt.c;
        this.s = bArr;
        this.v = bArr;
    }

    @Override // defpackage.dq2
    public final tx1 a(tx1 tx1Var) {
        if (tx1Var.c == 2) {
            return tx1Var.a == -1 ? tx1.e : tx1Var;
        }
        throw new ux1(tx1Var);
    }

    @Override // defpackage.dq2, defpackage.vx1
    public final boolean b() {
        return super.b() && this.o;
    }

    @Override // defpackage.vx1
    public final void d(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.p;
            short s = this.j;
            if (i == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s) {
                        int i2 = this.n;
                        position = hrg.B(limit3, i2, i2, i2);
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i != 1) {
                    e7o.n();
                    return;
                }
                vq1.A(this.t < this.s.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s) {
                        int i3 = this.n;
                        limit = (position2 / i3) * i3;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i4 = this.t;
                int i5 = this.u;
                int i6 = i4 + i5;
                byte[] bArr = this.s;
                if (i6 < bArr.length) {
                    i4 = bArr.length;
                } else {
                    i6 = i5 - (bArr.length - i4);
                }
                int i7 = i4 - i6;
                boolean z = limit < limit4;
                int min = Math.min(position3, i7);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.s, i6, min);
                int i8 = this.u + min;
                this.u = i8;
                vq1.A(i8 <= this.s.length);
                boolean z2 = z && position3 < i7;
                m(z2);
                if (z2) {
                    this.p = 0;
                    this.r = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // defpackage.dq2
    public final void h() {
        if (b()) {
            int i = this.b.b * 2;
            this.n = i;
            int i2 = ((((int) ((this.l * r0.a) / 1000000)) / 2) / i) * i * 2;
            if (this.s.length != i2) {
                this.s = new byte[i2];
                this.v = new byte[i2];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override // defpackage.dq2
    public final void i() {
        if (this.u > 0) {
            m(true);
            this.r = 0;
        }
    }

    @Override // defpackage.dq2
    public final void j() {
        this.o = false;
        byte[] bArr = dvt.c;
        this.s = bArr;
        this.v = bArr;
    }

    public final int l(int i) {
        int length = ((((int) ((this.m * this.b.a) / 1000000)) - this.r) * this.n) - (this.s.length / 2);
        vq1.A(length >= 0);
        int min = (int) Math.min((i * this.i) + 0.5f, length);
        int i2 = this.n;
        return (min / i2) * i2;
    }

    public final void m(boolean z) {
        int length;
        int l;
        int i = this.u;
        byte[] bArr = this.s;
        if (i == bArr.length || z) {
            if (this.r == 0) {
                if (z) {
                    n(i, 3);
                    length = i;
                } else {
                    vq1.A(i >= bArr.length / 2);
                    length = this.s.length / 2;
                    n(length, 0);
                }
                l = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int l2 = l(length2) + (this.s.length / 2);
                n(l2, 2);
                l = l2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                l = l(length);
                n(l, 1);
            }
            vq1.z("bytesConsumed is not aligned to frame size: %s" + length, length % this.n == 0);
            vq1.A(i >= l);
            this.u -= length;
            int i2 = this.t + length;
            this.t = i2;
            this.t = i2 % this.s.length;
            this.r = (l / this.n) + this.r;
            this.q += (length - l) / r2;
        }
    }

    public final void n(int i, int i2) {
        if (i == 0) {
            return;
        }
        vq1.v(this.u >= i);
        int i3 = this.t;
        if (i2 == 2) {
            int i4 = this.u;
            int i5 = i3 + i4;
            byte[] bArr = this.s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                byte[] bArr2 = this.v;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, bArr2, 0, i6);
                    System.arraycopy(this.s, 0, this.v, i6, length);
                }
            }
        } else {
            int i7 = i3 + i;
            byte[] bArr3 = this.s;
            int length2 = bArr3.length;
            byte[] bArr4 = this.v;
            if (i7 <= length2) {
                System.arraycopy(bArr3, i3, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i3;
                System.arraycopy(bArr3, i3, bArr4, 0, length3);
                System.arraycopy(this.s, 0, this.v, length3, i - length3);
            }
        }
        vq1.u("sizeToOutput is not aligned to frame size: " + i, i % this.n == 0);
        vq1.A(this.t < this.s.length);
        byte[] bArr5 = this.v;
        vq1.u("byteOutput size is not aligned to frame size " + i, i % this.n == 0);
        if (i2 != 3) {
            for (int i8 = 0; i8 < i; i8 += 2) {
                int i9 = i8 + 1;
                int i10 = (bArr5[i9] << 8) | (bArr5[i8] & 255);
                int i11 = this.k;
                if (i2 == 0) {
                    i11 = ((((i8 * 1000) / (i - 1)) * (i11 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i11 += (((i8 * 1000) * (100 - i11)) / (i - 1)) / 1000;
                }
                int i12 = (i10 * i11) / 100;
                if (i12 >= 32767) {
                    bArr5[i8] = -1;
                    bArr5[i9] = Byte.MAX_VALUE;
                } else if (i12 <= -32768) {
                    bArr5[i8] = 0;
                    bArr5[i9] = Byte.MIN_VALUE;
                } else {
                    bArr5[i8] = (byte) (i12 & KotlinVersion.MAX_COMPONENT_VALUE);
                    bArr5[i9] = (byte) (i12 >> 8);
                }
            }
        }
        k(i).put(bArr5, 0, i).flip();
    }
}
