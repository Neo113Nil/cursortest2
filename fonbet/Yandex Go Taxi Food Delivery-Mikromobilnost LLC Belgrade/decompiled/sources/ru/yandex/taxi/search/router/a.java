package ru.yandex.taxi.search.router;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.go.route.interactor.b;
import com.yandex.go.search.router.Origin;
import com.yandex.go.zone.repository.o;
import defpackage.byx;
import defpackage.c430;
import defpackage.cyx;
import defpackage.d01;
import defpackage.dds;
import defpackage.hnb0;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.lwk0;
import defpackage.un0;
import defpackage.xef;
import defpackage.ybf;
import defpackage.yef;
import defpackage.yfa;
import defpackage.yvf0;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.fragment.AddressMapPickerFragment;

/* loaded from: classes6.dex */
public final class a extends dds implements lwk0 {
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a F;
    public final o G;
    public final b H;
    public final cyx I;
    public final yvf0 J;
    public final hnb0 K;
    public final i3y L;
    public final yfa M;

    public a(com.yandex.go.mainscreen.superapp.impl.fragment.a aVar, o oVar, b bVar, cyx cyxVar, yvf0 yvf0Var, hnb0 hnb0Var) {
        super(null);
        this.F = aVar;
        this.G = oVar;
        this.H = bVar;
        this.I = cyxVar;
        this.J = yvf0Var;
        this.K = hnb0Var;
        this.L = kotlin.a.a(new ybf(3, this));
        this.M = new yfa(this);
    }

    @Override // defpackage.dds, defpackage.h55
    public final void G(Object obj) {
        super.G((yef) obj);
        e.H(o(), new jqr(e.c(((c) this.L.getValue()).M.a), new CurrentAddressPointOnMapFragmentRouterImpl$onAttach$1(this, null), 3));
        this.I.b(new byx(Screen.CHOOSE_A, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, (un0) null)));
    }

    @Override // defpackage.dds
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a P() {
        return this.F;
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        yef yefVar = (yef) obj;
        d01 d01Var = AddressMapPickerFragment.Companion;
        int i = yefVar.a;
        PointType pointType = PointType.SOURCE;
        Origin origin = yefVar.c;
        d01Var.getClass();
        AddressMapPickerFragment a = d01.a(i, pointType, "default", origin, true, true, true, true, true, true, true, false, true, false);
        a.setNavigator(this.M);
        a.updateInitialPoint(yefVar.b);
        a.setCallbackListener(new xef(this, a));
        return a;
    }
}
