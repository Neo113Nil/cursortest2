package defpackage;

import com.yandex.go.address.models.PlaceType;
import com.yandex.go.places.base.ui.modals.map.c;
import com.yandex.go.places.impl.domain.interactors.nearby.b;
import com.yandex.go.places.map.data.mappers.a;
import com.yandex.go.places.map.data.repositories.h;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes13.dex */
public final class tj50 extends c {
    public final dac0 D;
    public final b E;
    public final tt2 F;
    public final xl10 G;
    public final s7c0 H;
    public final jsj I;
    public final ah00 J;
    public final h K;
    public final a L;
    public final kj50 M;
    public final i3h N;
    public final oep0 O;
    public final wbc0 P;
    public boolean Q;
    public final com.yandex.go.places.impl.ui.nearby.flex.b R;
    public final com.yandex.go.places.impl.ui.nearby.flex.c S;
    public final i3y T;

    public tj50(dac0 dac0Var, b bVar, tt2 tt2Var, PlaceType placeType, zzs zzsVar, xl10 xl10Var, q3v q3vVar, s7c0 s7c0Var, jsj jsjVar, ah00 ah00Var, h hVar, a aVar, kj50 kj50Var, i3h i3hVar, oep0 oep0Var, wbc0 wbc0Var, k0b0 k0b0Var) {
        super(sj50.class, q3vVar, k0b0Var, ah00Var, true);
        this.D = dac0Var;
        this.E = bVar;
        this.F = tt2Var;
        this.G = xl10Var;
        this.H = s7c0Var;
        this.I = jsjVar;
        this.J = ah00Var;
        this.K = hVar;
        this.L = aVar;
        this.M = kj50Var;
        this.N = i3hVar;
        this.O = oep0Var;
        this.P = wbc0Var;
        this.Q = true;
        this.R = new com.yandex.go.places.impl.ui.nearby.flex.b(this);
        this.S = new com.yandex.go.places.impl.ui.nearby.flex.c(this, placeType, zzsVar);
        this.T = kotlin.a.b(LazyThreadSafetyMode.NONE, new d240(20, this));
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((c9c0) this.T.getValue()).i();
    }
}
