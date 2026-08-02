package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class s5e implements n3r {
    public final ij3 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public s5e(ij3 ij3Var) {
        ij3Var.getClass();
        this.a = ij3Var;
    }

    @Override // defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        int i;
        int readInt;
        hi3Var.getClass();
        do {
            int i2 = this.e;
            ij3 ij3Var = this.a;
            if (i2 == 0) {
                ij3Var.skip(this.f);
                this.f = 0;
                if ((this.c & 4) == 0) {
                    i = this.d;
                    int t = cvt.t(ij3Var);
                    this.e = t;
                    this.b = t;
                    int readByte = ij3Var.readByte() & 255;
                    this.c = ij3Var.readByte() & 255;
                    Logger logger = t5e.d;
                    if (logger.isLoggable(Level.FINE)) {
                        pn3 pn3Var = f5e.a;
                        logger.fine(f5e.a(true, this.d, this.b, readByte, this.c));
                    }
                    readInt = ij3Var.readInt() & Integer.MAX_VALUE;
                    this.d = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long e0 = ij3Var.e0(hi3Var, Math.min(j, i2));
                if (e0 != -1) {
                    this.e -= (int) e0;
                    return e0;
                }
            }
            return -1L;
        } while (readInt == i);
        kac.f("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // defpackage.n3r
    public final vis i() {
        return this.a.i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
