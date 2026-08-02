package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class jzh implements Closeable {
    public koj a;
    public int b;
    public final qgr c;
    public final xiu d;
    public nq4 e;
    public byte[] f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public nr5 k;
    public nr5 l;
    public long m;
    public boolean n;
    public int o;
    public int p;
    public boolean q;
    public volatile boolean r;

    public jzh(koj kojVar, int i, qgr qgrVar, xiu xiuVar) {
        e3s e3sVar = e3s.b;
        this.h = 1;
        this.i = 5;
        this.l = new nr5();
        this.n = false;
        this.o = -1;
        this.q = false;
        this.r = false;
        this.a = kojVar;
        this.e = e3sVar;
        this.b = i;
        this.c = qgrVar;
        o2g.O(xiuVar, "transportTracer");
        this.d = xiuVar;
    }

    public final void a() {
        if (this.n) {
            return;
        }
        boolean z = true;
        this.n = true;
        while (!this.r && this.m > 0 && o()) {
            try {
                int D = ouj.D(this.h);
                if (D == 0) {
                    g();
                } else {
                    if (D != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid state: ");
                        int i = this.h;
                        sb.append(i != 1 ? i != 2 ? "null" : "BODY" : "HEADER");
                        throw new AssertionError(sb.toString());
                    }
                    b();
                    this.m--;
                }
            } catch (Throwable th) {
                this.n = false;
                throw th;
            }
        }
        if (this.r) {
            close();
            this.n = false;
            return;
        }
        if (this.q) {
            if (this.l.c != 0) {
                z = false;
            }
            if (z) {
                close();
            }
        }
        this.n = false;
    }

    public final void b() {
        Object obj;
        int i = this.o;
        long j = this.p;
        qgr qgrVar = this.c;
        for (qo4 qo4Var : qgrVar.a) {
            qo4Var.d(i, j, -1L);
        }
        this.p = 0;
        if (this.j) {
            nq4 nq4Var = this.e;
            if (nq4Var == e3s.b) {
                throw sgr.n.i("Can't decode compressed gRPC message as compression not configured").b();
            }
            try {
                nr5 nr5Var = this.k;
                zjn zjnVar = akn.a;
                yjn yjnVar = new yjn();
                o2g.O(nr5Var, "buffer");
                yjnVar.a = nr5Var;
                obj = new izh(nq4Var.r(yjnVar), this.b, qgrVar);
            } catch (IOException e) {
                b6e.q(e);
                return;
            }
        } else {
            qgrVar.a(this.k.c);
            nr5 nr5Var2 = this.k;
            zjn zjnVar2 = akn.a;
            yjn yjnVar2 = new yjn();
            o2g.O(nr5Var2, "buffer");
            yjnVar2.a = nr5Var2;
            obj = yjnVar2;
        }
        this.k.getClass();
        this.k = null;
        koj kojVar = this.a;
        g8c g8cVar = new g8c();
        g8cVar.a = obj;
        kojVar.j.t(g8cVar);
        this.h = 1;
        this.i = 5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (isClosed()) {
            return;
        }
        nr5 nr5Var = this.k;
        boolean z = nr5Var != null && nr5Var.c > 0;
        try {
            nr5 nr5Var2 = this.l;
            if (nr5Var2 != null) {
                nr5Var2.close();
            }
            nr5 nr5Var3 = this.k;
            if (nr5Var3 != null) {
                nr5Var3.close();
            }
            this.l = null;
            this.k = null;
            koj kojVar = this.a;
            no4 no4Var = no4.a;
            boolean z2 = kojVar.n;
            noj nojVar = kojVar.F;
            int i = kojVar.J;
            if (z2) {
                nojVar.i(i, null, no4Var, false, null, null);
            } else {
                nojVar.i(i, null, no4Var, false, afb.CANCEL, null);
            }
            o2g.U("status should have been reported on deframer closed", kojVar.o);
            kojVar.l = true;
            if (kojVar.p && z) {
                kojVar.m(sgr.n.i("Encountered end-of-stream mid-frame"), true, new s2i());
            }
            t5 t5Var = kojVar.m;
            if (t5Var != null) {
                t5Var.run();
                kojVar.m = null;
            }
        } catch (Throwable th) {
            this.l = null;
            this.k = null;
            throw th;
        }
    }

    public final void g() {
        int I = this.k.I();
        if ((I & 254) != 0) {
            throw sgr.n.i("gRPC frame header malformed: reserved bits not zero").b();
        }
        this.j = (I & 1) != 0;
        nr5 nr5Var = this.k;
        nr5Var.a(4);
        int I2 = nr5Var.I() | (nr5Var.I() << 24) | (nr5Var.I() << 16) | (nr5Var.I() << 8);
        this.i = I2;
        if (I2 < 0 || I2 > this.b) {
            sgr sgrVar = sgr.l;
            Locale locale = Locale.US;
            throw sgrVar.i("gRPC message exceeds maximum size " + this.b + ": " + I2).b();
        }
        int i = this.o + 1;
        this.o = i;
        for (qo4 qo4Var : this.c.a) {
            qo4Var.c(i);
        }
        xiu xiuVar = this.d;
        ((uug) xiuVar.c).i();
        ((hs4) xiuVar.b).x();
        this.h = 2;
    }

    public final boolean isClosed() {
        return this.l == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r8.h == 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r0.b(r3);
        r8.p += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r8.h == 2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        qgr qgrVar = this.c;
        int i = 0;
        r2 = false;
        r2 = false;
        boolean z = false;
        try {
            if (this.k == null) {
                this.k = new nr5();
            }
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.i - this.k.c;
                    if (i3 <= 0) {
                        z = true;
                        if (i2 > 0) {
                            this.a.c(i2);
                        }
                        return true;
                    }
                    int i4 = this.l.c;
                    if (i4 != 0) {
                        int min = Math.min(i3, i4);
                        i2 += min;
                        this.k.Q(this.l.o(min));
                    } else if (i2 > 0) {
                        this.a.c(i2);
                    }
                } catch (Throwable th) {
                    int i5 = i2;
                    th = th;
                    i = i5;
                    if (i > 0) {
                        this.a.c(i);
                        if (this.h == 2) {
                            qgrVar.b(i);
                            this.p += i;
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
