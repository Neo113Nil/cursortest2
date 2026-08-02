package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes5.dex */
public final class hob extends ysc {
    public final long b;
    public long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ evj g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hob(evj evjVar, n3r n3rVar, long j) {
        super(n3rVar);
        n3rVar.getClass();
        this.g = evjVar;
        this.b = j;
        this.d = true;
        if (j == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.e) {
            return iOException;
        }
        this.e = true;
        evj evjVar = this.g;
        if (iOException == null && this.d) {
            this.d = false;
            ((jib) evjVar.d).p((mkn) evjVar.c);
        }
        return evjVar.b(this.c, true, false, iOException);
    }

    @Override // defpackage.ysc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // defpackage.ysc, defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        if (this.f) {
            xq0.q("closed");
            return 0L;
        }
        try {
            long e0 = this.a.e0(hi3Var, j);
            if (this.d) {
                this.d = false;
                evj evjVar = this.g;
                ((jib) evjVar.d).p((mkn) evjVar.c);
            }
            if (e0 == -1) {
                a(null);
                return -1L;
            }
            long j2 = this.c + e0;
            long j3 = this.b;
            if (j3 == -1 || j2 <= j3) {
                this.c = j2;
                if (j2 == j3) {
                    a(null);
                }
                return e0;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw a(e);
        }
    }
}
