package defpackage;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class apj extends w8 {
    public final hi3 a;

    public apj(hi3 hi3Var) {
        this.a = hi3Var;
    }

    @Override // defpackage.w8
    public final void D(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.w8
    public final void H(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int read = this.a.read(bArr, i, i2);
            if (read == -1) {
                e7o.o(dfi.c(i2, "EOF trying to read ", " bytes"));
                return;
            } else {
                i2 -= read;
                i += read;
            }
        }
    }

    @Override // defpackage.w8
    public final int I() {
        try {
            return this.a.readByte() & 255;
        } catch (EOFException e) {
            e7o.o(e.getMessage());
            return 0;
        }
    }

    @Override // defpackage.w8
    public final int N() {
        return (int) this.a.b;
    }

    @Override // defpackage.w8
    public final void P(int i) {
        try {
            this.a.skip(i);
        } catch (EOFException e) {
            e7o.o(e.getMessage());
        }
    }

    @Override // defpackage.w8, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }

    @Override // defpackage.w8
    public final w8 o(int i) {
        hi3 hi3Var = new hi3();
        hi3Var.t0(this.a, i);
        return new apj(hi3Var);
    }

    @Override // defpackage.w8
    public final void z(OutputStream outputStream, int i) {
        long j = i;
        outputStream.getClass();
        hi3 hi3Var = this.a;
        ox6.A(hi3Var.b, 0L, j);
        xap xapVar = hi3Var.a;
        while (j > 0) {
            xapVar.getClass();
            int min = (int) Math.min(j, xapVar.c - xapVar.b);
            outputStream.write(xapVar.a, xapVar.b, min);
            int i2 = xapVar.b + min;
            xapVar.b = i2;
            long j2 = min;
            hi3Var.b -= j2;
            j -= j2;
            if (i2 == xapVar.c) {
                xap a = xapVar.a();
                hi3Var.a = a;
                lbp.a(xapVar);
                xapVar = a;
            }
        }
    }
}
