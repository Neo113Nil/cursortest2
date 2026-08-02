package defpackage;

import android.content.Context;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2ModalView;
import com.yandex.go.places.impl.ui.organizations.v2.f;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes13.dex */
public final class yn80 extends m230 implements bgc0 {
    public final Context E;
    public final qn80 F;
    public final wn80 G;
    public final eo80 H;
    public final w030 I;
    public final mg80 J;
    public final wbc0 K;
    public final n3h L;
    public final tse M;
    public final PlacesNavigationMode N;
    public final b O;
    public final g3h P;
    public final cn80 Q;
    public final go80 R;
    public final y4g S;
    public final yac0 T;
    public final boolean U;
    public do80 V;
    public final i3y W;

    public yn80(Context context, qn80 qn80Var, wn80 wn80Var, eo80 eo80Var, w030 w030Var, mg80 mg80Var, wbc0 wbc0Var, n3h n3hVar, tse tseVar, PlacesNavigationMode placesNavigationMode, b bVar, g3h g3hVar, cn80 cn80Var, go80 go80Var, y4g y4gVar, yac0 yac0Var) {
        super(null);
        this.E = context;
        this.F = qn80Var;
        this.G = wn80Var;
        this.H = eo80Var;
        this.I = w030Var;
        this.J = mg80Var;
        this.K = wbc0Var;
        this.L = n3hVar;
        this.M = tseVar;
        this.N = placesNavigationMode;
        this.O = bVar;
        this.P = g3hVar;
        this.Q = cn80Var;
        this.R = go80Var;
        this.S = y4gVar;
        this.T = yac0Var;
        this.U = true;
        this.W = a.b(LazyThreadSafetyMode.NONE, new ak80(4, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.Q.a.l(null);
        this.J.b();
        this.K.b();
        do80 do80Var = this.V;
        if (do80Var != null) {
            do80Var.x.b();
            do80Var.Jg();
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        sn80 sn80Var = (sn80) obj;
        bn80 bn80Var = new bn80(sn80Var.b, sn80Var.c, sn80Var.d, sn80Var.e);
        r0 r0Var = this.Q.a;
        r0Var.getClass();
        r0Var.m(null, bn80Var);
        do80 a = this.H.a(sn80Var.h, PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATIONS_LIST_V2);
        a.attach();
        this.V = a;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.I;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.U;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        sn80 sn80Var = (sn80) obj;
        if (sn80Var.h) {
            this.R.a();
        }
        jsj jsjVar = new jsj(this.E);
        f3h a = this.P.a((xn80) this.W.getValue(), this.N);
        wac0 a2 = this.T.a(PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATIONS_LIST_V2);
        at20 at20Var = new at20();
        at20Var.b = this;
        s7c0 s7c0Var = sn80Var.a;
        i3h i3hVar = new i3h(this.E, this.M, this.L, DeeplinkSource.PLACES, a);
        ke8 ke8Var = this.G.a;
        f fVar = new f((dac0) ((xvf0) ke8Var.b).get(), (com.yandex.go.places.impl.domain.interactors.organizations.b) ((xvf0) ke8Var.c).get(), (tt2) ((xvf0) ke8Var.d).get(), at20Var, (q3v) ((xvf0) ke8Var.a).get(), s7c0Var, jsjVar, (h) ((xvf0) ke8Var.e).get(), (com.yandex.go.places.map.data.mappers.a) ((xvf0) ke8Var.f).get(), (c8c0) ((xvf0) ke8Var.g).get(), i3hVar, (oep0) ((xvf0) ke8Var.h).get(), (go80) ((xvf0) ke8Var.i).get(), (bo80) ((n3w) ke8Var.r).a, (com.yandex.go.places.searchbar.impl.domain.a) ((y4g) ke8Var.j).get(), (com.yandex.go.places.impl.domain.interactors.a) ((xvf0) ke8Var.k).get(), (com.yandex.go.places.models.data.mappers.a) ((xvf0) ke8Var.l).get(), (jio) ((xvf0) ke8Var.m).get(), (cn80) ((xvf0) ke8Var.n).get(), (wbc0) ((xvf0) ke8Var.o).get(), (k0b0) ((xvf0) ke8Var.p).get(), (ah00) ((xvf0) ke8Var.q).get());
        xv10 xv10Var = this.F.a;
        return new OrganizationsListV2ModalView((Context) ((x4g) xv10Var.a).get(), (c2x0) ((z4g) xv10Var.b).get(), fVar, a2, jsjVar, (jio) ((xvf0) xv10Var.c).get(), (cn80) ((xvf0) xv10Var.w).get(), (yac0) ((xvf0) xv10Var.x).get());
    }

    @Override // defpackage.bgc0
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.bgc0
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        return true;
    }
}
