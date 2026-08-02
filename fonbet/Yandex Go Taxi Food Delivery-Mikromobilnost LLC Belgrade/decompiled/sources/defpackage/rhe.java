package defpackage;

import androidx.compose.ui.node.s;

/* loaded from: classes12.dex */
public final class rhe implements oam, qy60 {
    public final ltr0 a;
    public final mtr0 b;
    public final dur0 c;
    public final eb2 w;

    public rhe(ltr0 ltr0Var, mtr0 mtr0Var, dur0 dur0Var) {
        this.a = ltr0Var;
        this.b = mtr0Var;
        this.c = dur0Var;
        eb2 eb2Var = new eb2();
        eb2Var.d();
        eb2Var.n(0);
        eb2Var.j(dur0Var.b);
        eb2Var.e(6);
        this.w = eb2Var;
    }

    @Override // defpackage.oam
    public final void d(c1y c1yVar) {
        this.c.a(((Number) ((m3u0) this.a.f.getValue()).getValue()).floatValue());
        i28 q = c1yVar.a.b.q();
        mtr0 mtr0Var = this.b;
        try {
            q.s(mtr0Var.e, cur0.a);
            c1yVar.a();
            zii0 zii0Var = mtr0Var.e;
            q.i(zii0Var.a, zii0Var.b, zii0Var.c, zii0Var.d, this.w);
        } finally {
            q.n();
        }
    }

    @Override // defpackage.qy60
    public final void g(s sVar) {
        this.b.a(sVar, this.c);
    }
}
