package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class uat extends dq2 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.dq2
    public final tx1 a(tx1 tx1Var) {
        int i = tx1Var.c;
        if (i != 2 && i != 4) {
            throw new ux1(tx1Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? tx1.e : tx1Var;
    }

    @Override // defpackage.dq2, defpackage.vx1
    public final ByteBuffer c() {
        int i;
        if (super.g() && (i = this.n) > 0) {
            k(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.c();
    }

    @Override // defpackage.vx1
    public final void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer k = k(length);
        int i3 = dvt.i(length, 0, this.n);
        k.put(this.m, 0, i3);
        int i4 = dvt.i(length - i3, 0, i2);
        byteBuffer.limit(byteBuffer.position() + i4);
        k.put(byteBuffer);
        byteBuffer.limit(limit);
        int i5 = i2 - i4;
        int i6 = this.n - i3;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i3, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        k.flip();
    }

    @Override // defpackage.dq2, defpackage.vx1
    public final boolean g() {
        return super.g() && this.n == 0;
    }

    @Override // defpackage.dq2
    public final void h() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.dq2
    public final void i() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.dq2
    public final void j() {
        this.m = dvt.c;
    }
}
