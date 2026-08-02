package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: classes5.dex */
public final class vu7 implements jmq {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final Object c;
    public final Object d;

    public vu7(rd2 rd2Var) {
        this.d = rd2Var;
        this.c = new btc(((gj3) rd2Var.f).i());
    }

    public void a(boolean z) {
        xap K0;
        int deflate;
        Deflater deflater = (Deflater) this.d;
        hkn hknVar = (hkn) this.c;
        hi3 hi3Var = hknVar.b;
        while (true) {
            K0 = hi3Var.K0(1);
            byte[] bArr = K0.a;
            int i = K0.c;
            if (z) {
                try {
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                deflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (deflate > 0) {
                K0.c += deflate;
                hi3Var.b += deflate;
                hknVar.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (K0.b == K0.c) {
            hi3Var.a = K0.a();
            lbp.a(K0);
        }
    }

    @Override // defpackage.jmq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                Deflater deflater = (Deflater) this.d;
                if (this.b) {
                    return;
                }
                try {
                    deflater.finish();
                    a(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((hkn) this.c).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.b = true;
                if (th != null) {
                    throw th;
                }
                return;
            default:
                rd2 rd2Var = (rd2) this.d;
                if (this.b) {
                    return;
                }
                this.b = true;
                btc btcVar = (btc) this.c;
                vis visVar = btcVar.e;
                btcVar.e = vis.d;
                visVar.a();
                visVar.b();
                rd2Var.b = 3;
                return;
        }
    }

    @Override // defpackage.jmq, java.io.Flushable
    public final void flush() {
        switch (this.a) {
            case 0:
                a(true);
                ((hkn) this.c).flush();
                break;
            default:
                if (!this.b) {
                    ((gj3) ((rd2) this.d).f).flush();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jmq
    public final vis i() {
        switch (this.a) {
            case 0:
                return ((hkn) this.c).a.i();
            default:
                return (btc) this.c;
        }
    }

    @Override // defpackage.jmq
    public final void t0(hi3 hi3Var, long j) {
        switch (this.a) {
            case 0:
                hi3Var.getClass();
                ox6.A(hi3Var.b, 0L, j);
                long j2 = j;
                while (j2 > 0) {
                    xap xapVar = hi3Var.a;
                    xapVar.getClass();
                    int min = (int) Math.min(j2, xapVar.c - xapVar.b);
                    ((Deflater) this.d).setInput(xapVar.a, xapVar.b, min);
                    a(false);
                    long j3 = min;
                    hi3Var.b -= j3;
                    int i = xapVar.b + min;
                    xapVar.b = i;
                    if (i == xapVar.c) {
                        hi3Var.a = xapVar.a();
                        lbp.a(xapVar);
                    }
                    j2 -= j3;
                }
                break;
            default:
                hi3Var.getClass();
                if (!this.b) {
                    cvt.c(hi3Var.b, 0L, j);
                    ((gj3) ((rd2) this.d).f).t0(hi3Var, j);
                    break;
                } else {
                    xq0.q("closed");
                    break;
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "DeflaterSink(" + ((hkn) this.c) + ')';
            default:
                return super.toString();
        }
    }

    public vu7(hi3 hi3Var, Deflater deflater) {
        this.c = new hkn(hi3Var);
        this.d = deflater;
    }
}
