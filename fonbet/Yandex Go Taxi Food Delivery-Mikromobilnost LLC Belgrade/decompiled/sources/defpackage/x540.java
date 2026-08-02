package defpackage;

import android.content.Context;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;
import ru.yandex.taxi.masstransit.router.j;
import ru.yandex.taxi.masstransit.threadschedule.e;

/* loaded from: classes6.dex */
public final class x540 extends pgd {
    public final Context F;
    public final w030 G;
    public final ah00 H;
    public final e I;
    public final dc4 J;
    public final jt30 K;
    public final MtPurchaseMapper L;
    public final wr30 M;
    public final ls30 N;
    public final y50 O;
    public final b640 P;
    public final mu5 Q;

    public x540(Context context, w030 w030Var, ah00 ah00Var, e eVar, dc4 dc4Var, jt30 jt30Var, MtPurchaseMapper mtPurchaseMapper, wr30 wr30Var, ls30 ls30Var, y50 y50Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = ah00Var;
        this.I = eVar;
        this.J = dc4Var;
        this.K = jt30Var;
        this.L = mtPurchaseMapper;
        this.M = wr30Var;
        this.N = ls30Var;
        this.O = y50Var;
        this.P = new b640();
        this.Q = new mu5(new j(this, 0));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.Q;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final boolean T() {
        return true;
    }
}
