package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public final class goj implements to4 {
    public final xhj a;
    public final Executor b;
    public final xhj c;
    public final ScheduledExecutorService d;
    public final wfl e;
    public final SSLSocketFactory f;
    public final m66 g;
    public final int h;
    public final boolean i;
    public final bu1 j;
    public final long k;
    public final int l;
    public final int m;
    public boolean n;

    public goj(xhj xhjVar, gao gaoVar, SSLSocketFactory sSLSocketFactory, m66 m66Var, int i, boolean z, long j, long j2, int i2, int i3, wfl wflVar) {
        this.a = xhjVar;
        this.b = (Executor) xhjVar.e();
        this.c = gaoVar;
        this.d = (ScheduledExecutorService) d8q.a((c8q) gaoVar.a);
        this.f = sSLSocketFactory;
        this.g = m66Var;
        this.h = i;
        this.i = z;
        this.j = new bu1(j);
        this.k = j2;
        this.l = i2;
        this.m = i3;
        o2g.O(wflVar, "transportTracerFactory");
        this.e = wflVar;
    }

    @Override // defpackage.to4
    public final u56 b0(SocketAddress socketAddress, so4 so4Var, nwe nweVar) {
        if (this.n) {
            xq0.q("The transport factory is closed.");
            return null;
        }
        bu1 bu1Var = this.j;
        long j = bu1Var.b.get();
        noj nojVar = new noj(this, (InetSocketAddress) socketAddress, so4Var.a, so4Var.b, so4Var.c, new dsd(18, new au1(bu1Var, j, 0)));
        if (this.i) {
            nojVar.G = true;
            nojVar.H = j;
            nojVar.I = this.k;
        }
        return nojVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.a.K(this.b);
        this.c.K(this.d);
    }
}
