package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class x4e implements n3r {
    public final btc a;
    public boolean b;
    public final /* synthetic */ rd2 c;

    public x4e(rd2 rd2Var) {
        this.c = rd2Var;
        this.a = new btc(((ij3) rd2Var.e).i());
    }

    public final void a() {
        rd2 rd2Var = this.c;
        int i = rd2Var.b;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            dlh.d(rd2Var.b, "state: ");
            return;
        }
        btc btcVar = this.a;
        vis visVar = btcVar.e;
        btcVar.e = vis.d;
        visVar.a();
        visVar.b();
        rd2Var.b = 6;
    }

    @Override // defpackage.n3r
    public long e0(hi3 hi3Var, long j) {
        rd2 rd2Var = this.c;
        hi3Var.getClass();
        try {
            return ((ij3) rd2Var.e).e0(hi3Var, j);
        } catch (IOException e) {
            ((okn) rd2Var.d).k();
            a();
            throw e;
        }
    }

    @Override // defpackage.n3r
    public final vis i() {
        return this.a;
    }
}
