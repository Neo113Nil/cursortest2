package defpackage;

import android.content.Context;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import com.yandex.go.places.impl.ui.nearby.flex.NearbyFlexModalView;
import com.yandex.go.places.map.data.repositories.h;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes13.dex */
public final class rj50 extends m230 implements bgc0 {
    public final Context E;
    public final oj50 F;
    public final uj50 G;
    public final a3c0 H;
    public final w030 I;
    public final mg80 J;
    public final wbc0 K;
    public final n3h L;
    public final tse M;
    public final PlacesNavigationMode N;
    public final b O;
    public final g3h P;
    public final boolean Q;
    public zzs R;
    public final i3y S;

    public rj50(Context context, oj50 oj50Var, uj50 uj50Var, a3c0 a3c0Var, w030 w030Var, mg80 mg80Var, wbc0 wbc0Var, n3h n3hVar, tse tseVar, PlacesNavigationMode placesNavigationMode, b bVar, g3h g3hVar) {
        super(null);
        this.E = context;
        this.F = oj50Var;
        this.G = uj50Var;
        this.H = a3c0Var;
        this.I = w030Var;
        this.J = mg80Var;
        this.K = wbc0Var;
        this.L = n3hVar;
        this.M = tseVar;
        this.N = placesNavigationMode;
        this.O = bVar;
        this.P = g3hVar;
        this.Q = true;
        this.S = a.b(LazyThreadSafetyMode.NONE, new d240(19, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.J.b();
        this.K.b();
        this.H.detach();
        this.R = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        a3c0 a3c0Var = this.H;
        a3c0Var.z.Kg(new z65(a3c0Var));
        uo21 uo21Var = a3c0Var.y;
        if (uo21Var != null) {
            uo21Var.attach();
        }
        a3c0Var.x.hideBlockedZones();
        a3c0Var.c.b8(a3c0Var);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.I;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.Q;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        pj50 pj50Var = (pj50) obj;
        this.R = pj50Var.c;
        jsj jsjVar = new jsj(this.E);
        f3h a = this.P.a((qj50) this.S.getValue(), this.N);
        PlaceType placeType = pj50Var.b;
        zzs zzsVar = pj50Var.c;
        xl10 xl10Var = new xl10(this);
        s7c0 s7c0Var = pj50Var.a;
        i3h i3hVar = new i3h(this.E, this.M, this.L, DeeplinkSource.PLACES, a);
        st0 st0Var = this.G.a;
        tj50 tj50Var = new tj50((dac0) ((xvf0) st0Var.a).get(), (com.yandex.go.places.impl.domain.interactors.nearby.b) ((vm80) st0Var.B).get(), (tt2) ((xvf0) st0Var.b).get(), placeType, zzsVar, xl10Var, (q3v) ((xvf0) st0Var.c).get(), s7c0Var, jsjVar, (ah00) ((xvf0) st0Var.w).get(), (h) ((xvf0) st0Var.x).get(), (com.yandex.go.places.map.data.mappers.a) ((xvf0) st0Var.y).get(), (kj50) ((xvf0) st0Var.z).get(), i3hVar, (oep0) ((xvf0) st0Var.A).get(), (wbc0) ((xvf0) st0Var.C).get(), (k0b0) ((xvf0) st0Var.D).get());
        e100 e100Var = this.F.a;
        return new NearbyFlexModalView((Context) ((x4g) e100Var.b).get(), (c2x0) ((z4g) e100Var.c).get(), tj50Var, jsjVar, (yac0) ((xvf0) e100Var.w).get());
    }

    @Override // defpackage.bgc0
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.bgc0
    public final boolean c(Object obj) {
        return jl40.l(this.R, ((pj50) obj).c);
    }
}
