package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class y5e implements Closeable {
    public static final Logger f = Logger.getLogger(f5e.class.getName());
    public final gj3 a;
    public final hi3 b;
    public int c;
    public boolean d;
    public final s4e e;

    public y5e(hkn hknVar) {
        hknVar.getClass();
        this.a = hknVar;
        hi3 hi3Var = new hi3();
        this.b = hi3Var;
        this.c = 16384;
        this.e = new s4e(hi3Var);
    }

    public final synchronized void D(int i, int i2, boolean z) {
        if (this.d) {
            throw new IOException("closed");
        }
        g(0, 8, 6, z ? 1 : 0);
        this.a.writeInt(i);
        this.a.writeInt(i2);
        this.a.flush();
    }

    public final synchronized void H(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        if (this.d) {
            throw new IOException("closed");
        }
        if (ouj.D(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        g(i, 4, 3, 0);
        this.a.writeInt(ouj.D(i2));
        this.a.flush();
    }

    public final synchronized void I(int i, long j) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        g(i, 4, 8, 0);
        this.a.writeInt((int) j);
        this.a.flush();
    }

    public final synchronized void a(app appVar) {
        try {
            appVar.getClass();
            if (this.d) {
                throw new IOException("closed");
            }
            int i = this.c;
            int i2 = appVar.a;
            if ((i2 & 32) != 0) {
                i = appVar.b[5];
            }
            this.c = i;
            if (((i2 & 2) != 0 ? appVar.b[1] : -1) != -1) {
                s4e s4eVar = this.e;
                int i3 = (i2 & 2) != 0 ? appVar.b[1] : -1;
                s4eVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = s4eVar.d;
                if (i4 != min) {
                    if (min < i4) {
                        s4eVar.b = Math.min(s4eVar.b, min);
                    }
                    s4eVar.c = true;
                    s4eVar.d = min;
                    int i5 = s4eVar.h;
                    if (min < i5) {
                        if (min == 0) {
                            wtd[] wtdVarArr = s4eVar.e;
                            uz0.l(0, wtdVarArr.length, null, wtdVarArr);
                            s4eVar.f = s4eVar.e.length - 1;
                            s4eVar.g = 0;
                            s4eVar.h = 0;
                        } else {
                            s4eVar.a(i5 - min);
                        }
                    }
                }
            }
            g(0, 0, 4, 1);
            this.a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z, int i, hi3 hi3Var, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        g(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            gj3 gj3Var = this.a;
            hi3Var.getClass();
            gj3Var.t0(hi3Var, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = true;
        this.a.close();
    }

    public final synchronized void flush() {
        if (this.d) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    public final void g(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f;
        if (logger.isLoggable(level)) {
            logger.fine(f5e.a(false, i, i2, i3, i4));
        }
        if (i2 > this.c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            xq0.o(k5r.i(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = cvt.a;
        gj3 gj3Var = this.a;
        gj3Var.getClass();
        gj3Var.writeByte((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        gj3Var.writeByte((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        gj3Var.writeByte(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        gj3Var.writeByte(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        gj3Var.writeByte(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        gj3Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void o(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        if (this.d) {
            throw new IOException("closed");
        }
        if (ouj.D(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        g(0, bArr.length + 8, 7, 0);
        this.a.writeInt(i);
        this.a.writeInt(ouj.D(i2));
        if (bArr.length != 0) {
            this.a.write(bArr);
        }
        this.a.flush();
    }

    public final synchronized void z(int i, ArrayList arrayList, boolean z) {
        if (this.d) {
            throw new IOException("closed");
        }
        this.e.d(arrayList);
        long j = this.b.b;
        long min = Math.min(this.c, j);
        int i2 = j == min ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        g(i, (int) min, 1, i2);
        this.a.t0(this.b, min);
        if (j > min) {
            long j2 = j - min;
            while (j2 > 0) {
                long min2 = Math.min(this.c, j2);
                j2 -= min2;
                g(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                this.a.t0(this.b, min2);
            }
        }
    }
}
