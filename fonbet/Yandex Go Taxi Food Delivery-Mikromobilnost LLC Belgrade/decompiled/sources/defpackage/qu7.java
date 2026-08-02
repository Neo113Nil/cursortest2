package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.cancel.by_driver.domain.a;

/* loaded from: classes14.dex */
public final class qu7 extends pgd {
    public final Context F;
    public final w030 G;
    public final c06 H;
    public final ra00 I;
    public final yvf0 J;
    public final a K;
    public final mu5 L;

    public qu7(Context context, w030 w030Var, c06 c06Var, ra00 ra00Var, yvf0 yvf0Var, com.yandex.go.taxi.order.provider.a aVar, n20 n20Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = c06Var;
        this.I = ra00Var;
        this.J = yvf0Var;
        this.K = new a(aVar, new hh5(15, this), n20Var);
        this.L = new mu5(new kv5(29, this));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.L;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
