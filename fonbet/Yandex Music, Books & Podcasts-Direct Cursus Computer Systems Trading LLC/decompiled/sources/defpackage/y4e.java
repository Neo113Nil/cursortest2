package defpackage;

/* loaded from: classes5.dex */
public final class y4e implements jmq {
    public final btc a;
    public boolean b;
    public final /* synthetic */ rd2 c;

    public y4e(rd2 rd2Var) {
        this.c = rd2Var;
        this.a = new btc(((gj3) rd2Var.f).i());
    }

    @Override // defpackage.jmq, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((gj3) this.c.f).M("0\r\n\r\n");
        btc btcVar = this.a;
        vis visVar = btcVar.e;
        btcVar.e = vis.d;
        visVar.a();
        visVar.b();
        this.c.b = 3;
    }

    @Override // defpackage.jmq, java.io.Flushable
    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        ((gj3) this.c.f).flush();
    }

    @Override // defpackage.jmq
    public final vis i() {
        return this.a;
    }

    @Override // defpackage.jmq
    public final void t0(hi3 hi3Var, long j) {
        gj3 gj3Var = (gj3) this.c.f;
        hi3Var.getClass();
        if (this.b) {
            xq0.q("closed");
        } else {
            if (j == 0) {
                return;
            }
            gj3Var.w0(j);
            gj3Var.M("\r\n");
            gj3Var.t0(hi3Var, j);
            gj3Var.M("\r\n");
        }
    }
}
