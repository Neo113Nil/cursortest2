package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class c5e implements n3r {
    public final ikn a;
    public int b;
    public byte c;
    public int d;
    public int e;
    public short f;

    public c5e(ikn iknVar) {
        this.a = iknVar;
    }

    @Override // defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        int i;
        int readInt;
        do {
            int i2 = this.e;
            ikn iknVar = this.a;
            if (i2 == 0) {
                iknVar.skip(this.f);
                this.f = (short) 0;
                if ((this.c & 4) == 0) {
                    i = this.d;
                    int a = g5e.a(iknVar);
                    this.e = a;
                    this.b = a;
                    byte readByte = (byte) (iknVar.readByte() & 255);
                    this.c = (byte) (iknVar.readByte() & 255);
                    Logger logger = g5e.a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(d5e.a(true, this.d, this.b, readByte, this.c));
                    }
                    readInt = iknVar.readInt() & Integer.MAX_VALUE;
                    this.d = readInt;
                    if (readByte != 9) {
                        g5e.c("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                }
            } else {
                long e0 = iknVar.e0(hi3Var, Math.min(j, i2));
                if (e0 != -1) {
                    this.e -= (int) e0;
                    return e0;
                }
            }
            return -1L;
        } while (readInt == i);
        g5e.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // defpackage.n3r
    public final vis i() {
        return this.a.a.i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
