package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes5.dex */
public final class gob extends xsc {
    public final long b;
    public boolean c;
    public long d;
    public boolean e;
    public final /* synthetic */ evj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gob(evj evjVar, jmq jmqVar, long j) {
        super(jmqVar);
        jmqVar.getClass();
        this.f = evjVar;
        this.b = j;
    }

    public final IOException a(IOException iOException) {
        if (this.c) {
            return iOException;
        }
        this.c = true;
        return this.f.b(this.d, false, true, iOException);
    }

    @Override // defpackage.xsc, defpackage.jmq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        long j = this.b;
        if (j != -1 && this.d != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // defpackage.xsc, defpackage.jmq, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // defpackage.xsc, defpackage.jmq
    public final void t0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        if (this.e) {
            xq0.q("closed");
            return;
        }
        long j2 = this.b;
        if (j2 != -1 && this.d + j > j2) {
            StringBuilder l = tlm.l(j2, "expected ", " bytes but received ");
            l.append(this.d + j);
            throw new ProtocolException(l.toString());
        }
        try {
            this.a.t0(hi3Var, j);
            this.d += j;
        } catch (IOException e) {
            throw a(e);
        }
    }
}
