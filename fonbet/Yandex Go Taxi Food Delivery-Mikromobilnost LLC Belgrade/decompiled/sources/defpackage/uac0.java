package defpackage;

import com.yandex.go.places.experiments.tabbar.b;
import com.yandex.go.places.impl.domain.interactors.common.a;
import com.yandex.go.places.impl.domain.interactors.map.e;

/* loaded from: classes13.dex */
public final class uac0 extends ad5 {
    public final yac0 A;
    public final mg80 B;
    public final ah00 C;
    public final e D;
    public final b E;
    public final qac0 F;
    public final u050 G;
    public final com.yandex.go.places.experiments.flex.b H;
    public final il00 I;
    public pzt0 J;
    public boolean K;
    public final a x;
    public final com.yandex.go.places.impl.navigation.common.navigator.internal.b y;
    public final go80 z;

    public uac0(a aVar, com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar, go80 go80Var, yac0 yac0Var, mg80 mg80Var, ah00 ah00Var, e eVar, b bVar2, qac0 qac0Var, u050 u050Var, com.yandex.go.places.experiments.flex.b bVar3) {
        super(oac0.class);
        this.x = aVar;
        this.y = bVar;
        this.z = go80Var;
        this.A = yac0Var;
        this.B = mg80Var;
        this.C = ah00Var;
        this.D = eVar;
        this.E = bVar2;
        this.F = qac0Var;
        this.G = u050Var;
        this.H = bVar3;
        this.I = new il00();
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.J = null;
        Kg();
        ((oac0) Dg()).q9(false);
        this.K = false;
        ((gh00) this.C).I(false);
        super.Cg();
    }

    public final void Kg() {
        ((oac0) Dg()).deselectGeoObject();
    }
}
