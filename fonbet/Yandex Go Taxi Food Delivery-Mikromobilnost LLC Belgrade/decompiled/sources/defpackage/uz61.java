package defpackage;

import java.nio.ByteBuffer;
import yads.xj;

/* loaded from: classes7.dex */
public final class uz61 extends xm61 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = rf71.f;
    public int n;
    public long o;

    @Override // defpackage.lv81
    public final void a(ByteBuffer byteBuffer) {
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
        ByteBuffer c = c(length);
        int i3 = this.n;
        int i4 = rf71.a;
        int max = Math.max(0, Math.min(length, i3));
        c.put(this.m, 0, max);
        int max2 = Math.max(0, Math.min(length - max, i2));
        byteBuffer.limit(byteBuffer.position() + max2);
        c.put(byteBuffer);
        byteBuffer.limit(limit);
        int i5 = i2 - max2;
        int i6 = this.n - max;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, max, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        c.flip();
    }

    @Override // defpackage.xm61, defpackage.lv81
    public final boolean c() {
        return super.c() && this.n == 0;
    }

    @Override // defpackage.xm61
    public final mp81 d(mp81 mp81Var) {
        if (mp81Var.c != 2) {
            throw new xj(mp81Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? mp81.e : mp81Var;
    }

    @Override // defpackage.xm61
    public final void e() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.xm61
    public final void f() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.xm61
    public final void g() {
        this.m = rf71.f;
    }

    @Override // defpackage.xm61, defpackage.lv81
    public final ByteBuffer a() {
        int i;
        if (super.c() && (i = this.n) > 0) {
            c(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        ByteBuffer byteBuffer = this.g;
        this.g = lv81.a;
        return byteBuffer;
    }
}
