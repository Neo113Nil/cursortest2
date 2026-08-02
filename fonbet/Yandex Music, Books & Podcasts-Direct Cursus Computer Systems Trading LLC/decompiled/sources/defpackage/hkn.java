package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class hkn implements gj3 {
    public final jmq a;
    public final hi3 b;
    public boolean c;

    public hkn(jmq jmqVar) {
        jmqVar.getClass();
        this.a = jmqVar;
        this.b = new hi3();
    }

    @Override // defpackage.gj3
    public final gj3 M(String str) {
        str.getClass();
        if (this.c) {
            xq0.q("closed");
            return null;
        }
        this.b.S0(str);
        a();
        return this;
    }

    @Override // defpackage.gj3
    public final gj3 W(pn3 pn3Var) {
        pn3Var.getClass();
        if (this.c) {
            xq0.q("closed");
            return null;
        }
        this.b.L0(pn3Var);
        a();
        return this;
    }

    public final gj3 a() {
        if (this.c) {
            xq0.q("closed");
            return null;
        }
        hi3 hi3Var = this.b;
        long H = hi3Var.H();
        if (H > 0) {
            this.a.t0(hi3Var, H);
        }
        return this;
    }

    @Override // defpackage.gj3
    public final gj3 c0(long j) {
        if (this.c) {
            xq0.q("closed");
            return null;
        }
        this.b.N0(j);
        a();
        return this;
    }

    @Override // defpackage.jmq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        jmq jmqVar = this.a;
        if (this.c) {
            return;
        }
        try {
            hi3 hi3Var = this.b;
            long j = hi3Var.b;
            if (j > 0) {
                jmqVar.t0(hi3Var, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            jmqVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.gj3, defpackage.jmq, java.io.Flushable
    public final void flush() {
        if (this.c) {
            xq0.q("closed");
            return;
        }
        hi3 hi3Var = this.b;
        long j = hi3Var.b;
        jmq jmqVar = this.a;
        if (j > 0) {
            jmqVar.t0(hi3Var, j);
        }
        jmqVar.flush();
    }

    @Override // defpackage.gj3
    public final hi3 h() {
        return this.b;
    }

    @Override // defpackage.jmq
    public final vis i() {
        return this.a.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.gj3
    public final long o0(n3r n3rVar) {
        n3rVar.getClass();
        long j = 0;
        while (true) {
            long e0 = n3rVar.e0(this.b, 8192L);
            if (e0 == -1) {
                return j;
            }
            j += e0;
            a();
        }
    }

    @Override // defpackage.gj3
    public final gj3 r0(int i, byte[] bArr) {
        bArr.getClass();
        if (this.c) {
            xq0.q("closed");
            return null;
        }
        this.b.write(bArr, 0, i);
        a();
        return this;
    }

    @Override // defpackage.jmq
    public final void t0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        if (this.c) {
            xq0.q("closed");
        } else {
            this.b.t0(hi3Var, j);
            a();
        }
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.gj3
    public final gj3 v() {
        if (this.c) {
            xq0.q("closed");
            return null;
        }
        hi3 hi3Var = this.b;
        long j = hi3Var.b;
        if (j > 0) {
            this.a.t0(hi3Var, j);
        }
        return this;
    }

    @Override // defpackage.gj3
    public final gj3 w0(long j) {
        if (this.c) {
            xq0.q("closed");
            return null;
        }
        this.b.O0(j);
        a();
        return this;
    }

    @Override // defpackage.gj3
    public final gj3 write(byte[] bArr) {
        bArr.getClass();
        if (this.c) {
            xq0.q("closed");
            return null;
        }
        this.b.write(bArr, 0, bArr.length);
        a();
        return this;
    }

    @Override // defpackage.gj3
    public final gj3 writeByte(int i) {
        if (this.c) {
            xq0.q("closed");
            return null;
        }
        this.b.M0(i);
        a();
        return this;
    }

    @Override // defpackage.gj3
    public final gj3 writeInt(int i) {
        if (this.c) {
            xq0.q("closed");
            return null;
        }
        this.b.P0(i);
        a();
        return this;
    }

    @Override // defpackage.gj3
    public final gj3 writeShort(int i) {
        if (this.c) {
            xq0.q("closed");
            return null;
        }
        this.b.Q0(i);
        a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.c) {
            int write = this.b.write(byteBuffer);
            a();
            return write;
        }
        xq0.q("closed");
        return 0;
    }
}
