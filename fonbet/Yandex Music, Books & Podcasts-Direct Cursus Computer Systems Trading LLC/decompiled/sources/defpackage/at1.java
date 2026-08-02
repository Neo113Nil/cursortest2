package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class at1 implements Closeable {
    public final e5e a;
    public final /* synthetic */ ct1 b;

    public at1(ct1 ct1Var, e5e e5eVar) {
        this.b = ct1Var;
        this.a = e5eVar;
    }

    public final void D(iqe iqeVar) {
        e5e e5eVar = this.a;
        synchronized (e5eVar) {
            try {
                if (e5eVar.e) {
                    throw new IOException("closed");
                }
                int i = 0;
                e5eVar.a(0, Integer.bitCount(iqeVar.b) * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (iqeVar.a(i)) {
                        e5eVar.a.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                        e5eVar.a.writeInt(iqeVar.a[i]);
                    }
                    i++;
                }
                e5eVar.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void H(int i, long j) {
        e5e e5eVar = this.a;
        synchronized (e5eVar) {
            if (e5eVar.e) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j);
            }
            e5eVar.a(i, 4, (byte) 8, (byte) 0);
            e5eVar.a.writeInt((int) j);
            e5eVar.a.flush();
        }
    }

    public final void a(iqe iqeVar) {
        this.b.l++;
        e5e e5eVar = this.a;
        synchronized (e5eVar) {
            if (e5eVar.e) {
                throw new IOException("closed");
            }
            int i = e5eVar.d;
            if ((iqeVar.b & 32) != 0) {
                i = iqeVar.a[5];
            }
            e5eVar.d = i;
            e5eVar.a(0, 0, (byte) 4, (byte) 1);
            e5eVar.a.flush();
        }
    }

    public final void b() {
        e5e e5eVar = this.a;
        synchronized (e5eVar) {
            try {
                if (e5eVar.e) {
                    throw new IOException("closed");
                }
                Logger logger = g5e.a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + g5e.b.e());
                }
                e5eVar.a.write(g5e.b.t());
                e5eVar.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final void flush() {
        e5e e5eVar = this.a;
        synchronized (e5eVar) {
            if (e5eVar.e) {
                throw new IOException("closed");
            }
            e5eVar.a.flush();
        }
    }

    public final void g(afb afbVar, byte[] bArr) {
        e5e e5eVar = this.a;
        synchronized (e5eVar) {
            try {
                if (e5eVar.e) {
                    throw new IOException("closed");
                }
                if (afbVar.a == -1) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                e5eVar.a(0, bArr.length + 8, (byte) 7, (byte) 0);
                e5eVar.a.writeInt(0);
                e5eVar.a.writeInt(afbVar.a);
                if (bArr.length > 0) {
                    e5eVar.a.write(bArr);
                }
                e5eVar.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(int i, int i2, boolean z) {
        if (z) {
            this.b.l++;
        }
        e5e e5eVar = this.a;
        synchronized (e5eVar) {
            if (e5eVar.e) {
                throw new IOException("closed");
            }
            e5eVar.a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            e5eVar.a.writeInt(i);
            e5eVar.a.writeInt(i2);
            e5eVar.a.flush();
        }
    }

    public final void z(int i, afb afbVar) {
        this.b.l++;
        e5e e5eVar = this.a;
        synchronized (e5eVar) {
            if (e5eVar.e) {
                throw new IOException("closed");
            }
            if (afbVar.a == -1) {
                throw new IllegalArgumentException();
            }
            e5eVar.a(i, 4, (byte) 3, (byte) 0);
            e5eVar.a.writeInt(afbVar.a);
            e5eVar.a.flush();
        }
    }
}
