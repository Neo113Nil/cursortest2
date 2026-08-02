package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* loaded from: classes5.dex */
public final class zjn extends w8 {
    public int a;
    public final int b;
    public final byte[] c;
    public int d = -1;

    public zjn(byte[] bArr, int i, int i2) {
        o2g.J("offset must be >= 0", i >= 0);
        o2g.J("length must be >= 0", i2 >= 0);
        int i3 = i2 + i;
        o2g.J("offset + length exceeds array boundary", i3 <= bArr.length);
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.w8
    public final void D(ByteBuffer byteBuffer) {
        o2g.O(byteBuffer, "dest");
        int remaining = byteBuffer.remaining();
        a(remaining);
        byteBuffer.put(this.c, this.a, remaining);
        this.a += remaining;
    }

    @Override // defpackage.w8
    public final void H(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.w8
    public final int I() {
        a(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & 255;
    }

    @Override // defpackage.w8
    public final int N() {
        return this.b - this.a;
    }

    @Override // defpackage.w8
    public final void P(int i) {
        a(i);
        this.a += i;
    }

    @Override // defpackage.w8
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.w8
    public final w8 o(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new zjn(this.c, i2, i);
    }

    @Override // defpackage.w8
    public final void reset() {
        int i = this.d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.w8
    public final void z(OutputStream outputStream, int i) {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }
}
