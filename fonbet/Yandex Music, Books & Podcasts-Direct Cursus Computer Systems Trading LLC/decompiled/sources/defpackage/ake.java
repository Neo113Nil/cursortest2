package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class ake implements n3r {
    public final ikn a;
    public final Inflater b;
    public int c;
    public boolean d;

    public ake(ikn iknVar, Inflater inflater) {
        this.a = iknVar;
        this.b = inflater;
    }

    public final long a(hi3 hi3Var, long j) {
        Inflater inflater = this.b;
        hi3Var.getClass();
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.d) {
            xq0.q("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                xap K0 = hi3Var.K0(1);
                int min = (int) Math.min(j, 8192 - K0.c);
                boolean needsInput = inflater.needsInput();
                ikn iknVar = this.a;
                if (needsInput && !iknVar.a()) {
                    xap xapVar = iknVar.b.a;
                    xapVar.getClass();
                    int i = xapVar.c;
                    int i2 = xapVar.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(xapVar.a, i2, i3);
                }
                int inflate = inflater.inflate(K0.a, K0.c, min);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.c -= remaining;
                    iknVar.skip(remaining);
                }
                if (inflate > 0) {
                    K0.c += inflate;
                    long j2 = inflate;
                    hi3Var.b += j2;
                    return j2;
                }
                if (K0.b == K0.c) {
                    hi3Var.a = K0.a();
                    lbp.a(K0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        do {
            long a = a(hi3Var, j);
            if (a > 0) {
                return a;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.a());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.n3r
    public final vis i() {
        return this.a.a.i();
    }
}
