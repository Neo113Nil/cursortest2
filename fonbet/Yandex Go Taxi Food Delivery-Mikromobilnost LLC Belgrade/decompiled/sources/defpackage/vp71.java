package defpackage;

import android.net.Uri;
import android.os.Looper;

/* loaded from: classes7.dex */
public final class vp71 extends qv81 {
    public final op81 P;
    public final d981 Q;
    public final u571 R;
    public final gp51 S;
    public final c981 T;
    public final ll81 U;
    public final int V;
    public boolean W;
    public long X;
    public boolean Y;
    public boolean Z;
    public mr81 a0;

    public vp71(op81 op81Var, u571 u571Var, gp51 gp51Var, r281 r281Var, ll81 ll81Var, int i) {
        d981 d981Var = op81Var.b;
        d981Var.getClass();
        this.Q = d981Var;
        this.P = op81Var;
        this.R = u571Var;
        this.S = gp51Var;
        this.T = r281Var;
        this.U = ll81Var;
        this.V = i;
        this.W = true;
        this.X = -9223372036854775807L;
    }

    @Override // defpackage.qv81
    public final ra71 a(v281 v281Var, xi71 xi71Var, long j) {
        u871 a = this.R.a();
        mr81 mr81Var = this.a0;
        if (mr81Var != null) {
            a.S(mr81Var);
        }
        d981 d981Var = this.Q;
        Uri uri = d981Var.a;
        if (this.g == null) {
            ny61.k();
            return null;
        }
        return new ng71(uri, a, new vi71((ej71) this.S.b), this.T, new cw71(this.d.c, 0, v281Var), this.U, new sc81(this.c.c, 0, v281Var, 0L), this, xi71Var, d981Var.c, this.V);
    }

    @Override // defpackage.qv81
    public final op81 c() {
        return this.P;
    }

    @Override // defpackage.qv81
    public final void d() {
    }

    @Override // defpackage.qv81
    public final void e() {
        this.T.getClass();
    }

    @Override // defpackage.qv81
    public final void a(mr81 mr81Var) {
        this.a0 = mr81Var;
        this.T.getClass();
        Looper.myLooper().getClass();
        if (this.g != null) {
            yn81 pq81Var = new pq81(this.X, this.Y, this.Z, this.P);
            if (this.W) {
                pq81Var = new oj71(pq81Var);
            }
            a(pq81Var);
            return;
        }
        ny61.k();
    }

    @Override // defpackage.qv81
    public final void a(ra71 ra71Var) {
        ng71 ng71Var = (ng71) ra71Var;
        if (ng71Var.O) {
            for (ed81 ed81Var : ng71Var.L) {
                ed81Var.g();
                ed81Var.r();
            }
        }
        ng71Var.D.d(ng71Var);
        ng71Var.I.removeCallbacksAndMessages(null);
        ng71Var.J = null;
        ng71Var.g0 = true;
    }
}
