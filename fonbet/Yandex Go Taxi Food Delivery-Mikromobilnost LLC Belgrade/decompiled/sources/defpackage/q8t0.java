package defpackage;

import android.content.Context;
import com.yandex.go.something_wrong_screen.domain.entities.SomethingWrongScreenEntryPoint;
import com.yandex.go.something_wrong_screen.ui.SomethingWrongScreenModalView;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.am.g;

/* loaded from: classes13.dex */
public final class q8t0 extends m230 {
    public final p8t0 E;
    public final w8t0 F;
    public final w030 G;
    public final h3y H;
    public final yvf0 I;
    public final oep0 J;
    public final g K;
    public final yu41 L;
    public final d130 M;
    public final boolean N;

    public q8t0(p8t0 p8t0Var, w8t0 w8t0Var, w030 w030Var, h3y h3yVar, y2s0 y2s0Var, oep0 oep0Var, g gVar, yu41 yu41Var, y030 y030Var) {
        super(null);
        this.E = p8t0Var;
        this.F = w8t0Var;
        this.G = w030Var;
        this.H = h3yVar;
        this.I = y2s0Var;
        this.J = oep0Var;
        this.K = gVar;
        this.L = yu41Var;
        this.M = y030Var.a(ContentContainer$ZOrder.IMPORTANT);
        this.N = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.M;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.N;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        SomethingWrongScreenEntryPoint somethingWrongScreenEntryPoint = (SomethingWrongScreenEntryPoint) obj;
        qgn0 qgn0Var = new qgn0(26, this);
        hwo0 hwo0Var = this.F.a;
        v8t0 v8t0Var = new v8t0(qgn0Var, somethingWrongScreenEntryPoint, (l8t0) ((sxn0) hwo0Var.b).get(), (g8t0) ((i5s0) hwo0Var.c).get(), (z9g) hwo0Var.w, (oep0) ((z9g) hwo0Var.x).get());
        hhs0 hhs0Var = this.E.a;
        return new SomethingWrongScreenModalView((Context) ((z9g) hhs0Var.b).get(), v8t0Var, (g8t0) ((i5s0) hhs0Var.c).get());
    }
}
