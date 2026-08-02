package defpackage;

import android.content.Context;
import com.yandex.go.payments.paymentlist.details.PaymentMethodDetailsModalView;
import com.yandex.go.payments.paymentlist.details.c;
import com.yandex.go.payments.paymentlist.details.d;
import com.yandex.go.payments.paymentlist.domain.i;

/* loaded from: classes13.dex */
public final class z4a0 extends m230 {
    public final w030 E;
    public final g9a0 F;
    public final yvf0 G;
    public final msd0 H;
    public final i I;
    public final u4a0 J;
    public final w4a0 K;
    public final yvf0 L;

    public z4a0(w030 w030Var, g9a0 g9a0Var, x4 x4Var, msd0 msd0Var, i iVar, u4a0 u4a0Var, w4a0 w4a0Var, gb0 gb0Var) {
        super(null);
        this.E = w030Var;
        this.F = g9a0Var;
        this.G = x4Var;
        this.H = msd0Var;
        this.I = iVar;
        this.J = u4a0Var;
        this.K = w4a0Var;
        this.L = gb0Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        v4a0 v4a0Var = (v4a0) obj;
        lea0 lea0Var = v4a0Var.a;
        y4a0 y4a0Var = new y4a0(0, this, v4a0Var);
        zqj zqjVar = this.K.a;
        c cVar = new c((l9a0) zqjVar.a.get(), (i) zqjVar.b.get(), (d) zqjVar.c.get(), lea0Var, y4a0Var);
        h0t h0tVar = this.J.a;
        return new PaymentMethodDetailsModalView((Context) h0tVar.a.get(), (pav) h0tVar.b.get(), (g1a0) h0tVar.c.get(), cVar);
    }
}
