package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import ru.yandex.taxi.discovery.b;

/* loaded from: classes5.dex */
public final class si30 extends h55 {
    public final b D;
    public final ti30 E;
    public final wu30 F;
    public final yvf0 G;
    public e90 H;

    public si30(b bVar, ti30 ti30Var, wu30 wu30Var, yvf0 yvf0Var) {
        super(null);
        this.D = bVar;
        this.E = ti30Var;
        this.F = wu30Var;
        this.G = yvf0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        e90 e90Var = this.H;
        if (e90Var != null) {
            e90Var.f();
        }
        this.H = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        P();
    }

    public final void P() {
        byx byxVar = new byx(Screen.DISCOVERY, new c430(Mode.MASSTRANSIT, (kotlinx.serialization.json.b) null, (un0) null));
        m020 m020Var = new m020(20, this);
        ti30 ti30Var = this.E;
        ti30Var.d = m020Var;
        ti30Var.e = new wg30(1, this);
        this.H = this.D.b(new mwj("masstransit", "discovery_masstransit", byxVar, new sw80(ti30Var)), new wui(this, 28));
    }
}
