package ru.yandex.taxi.search.address.view;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.search.model.DecideLaterConfig;
import defpackage.apf;
import defpackage.aye0;
import defpackage.cag;
import defpackage.ciw;
import defpackage.ddf;
import defpackage.dqe0;
import defpackage.dsd;
import defpackage.fh4;
import defpackage.fjd;
import defpackage.gjd;
import defpackage.h0j;
import defpackage.hc;
import defpackage.icv0;
import defpackage.jj3;
import defpackage.kpi0;
import defpackage.kzi;
import defpackage.lmw;
import defpackage.lvq0;
import defpackage.m3o;
import defpackage.m61;
import defpackage.oep0;
import defpackage.p1b;
import defpackage.r51;
import defpackage.tjt0;
import defpackage.ujt0;
import defpackage.uub1;
import defpackage.w030;
import defpackage.wch0;
import defpackage.wsd0;
import defpackage.wub1;
import defpackage.xsd0;
import defpackage.y9y0;
import defpackage.yvf0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.common_models.net.map_object.j;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;

/* loaded from: classes10.dex */
public final class a implements xsd0 {
    public final w030 a;
    public final dsd b;
    public final tjt0 c;
    public final lmw d;
    public final jj3 e;
    public final dqe0 f;
    public final kpi0 g;
    public final icv0 h;
    public final y9y0 i;
    public final ciw j;
    public final yvf0 k;
    public final oep0 l;

    public a(w030 w030Var, dsd dsdVar, tjt0 tjt0Var, lmw lmwVar, zuj0 zuj0Var, jj3 jj3Var, dqe0 dqe0Var, kpi0 kpi0Var, icv0 icv0Var, y9y0 y9y0Var, ciw ciwVar, yvf0 yvf0Var, oep0 oep0Var) {
        this.a = w030Var;
        this.b = dsdVar;
        this.c = tjt0Var;
        this.d = lmwVar;
        this.e = jj3Var;
        this.f = dqe0Var;
        this.g = kpi0Var;
        this.h = icv0Var;
        this.i = y9y0Var;
        this.j = ciwVar;
        this.k = yvf0Var;
        this.l = oep0Var;
    }

    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        j jVar = (j) wsd0Var.getAction();
        hc hcVar = new hc(11, this, jVar);
        String str = jVar.b;
        String str2 = jVar.a;
        String str3 = jVar.c;
        int i = 0;
        ujt0 ujt0Var = new ujt0(false);
        ddf ddfVar = new ddf(RoutePointType.POINT_A);
        SourcePicker sourcePicker = SourcePicker.NONE;
        DecideLaterConfig decideLaterConfig = DecideLaterConfig.a;
        r51 r51Var = new r51(sourcePicker, decideLaterConfig);
        m3o m3oVar = m3o.b;
        y9y0 y9y0Var = this.i;
        cag c = fh4.c(r51Var, ddfVar, m3oVar, this.c.a, new aye0(20, y9y0Var), ujt0Var);
        lmw lmwVar = this.d;
        lmwVar.getClass();
        lvq0 lvq0Var = new lvq0(str, str2, str3, false, false);
        apf a = uub1.a(new p1b(c, wub1.e(new r51(sourcePicker, decideLaterConfig), new ddf(RoutePointType.POINT_B), new h0j(kzi.a, lmwVar.b.b() == Screen.MAIN_V4 ? "superapp_main" : "pickup_location", true), m3oVar, lmwVar.d, lmwVar.c, lvq0Var)), this.b.a, y9y0Var);
        CompositeAddressSearchView.Companion.getClass();
        fjd a2 = gjd.a(a);
        a2.c(wch0.addresses_picker);
        a2.b();
        a2.e(PointType.DESTINATION);
        a2.f(new m61(i, hcVar));
        a2.d();
        CompositeAddressSearchModalView.Companion.getClass();
        CompositeAddressSearchModalView.a a3 = b.a();
        ModalViewOrigin modalViewOrigin = ModalViewOrigin.HOME;
        this.a.s(b.b(a2, a3), true);
        return zy11.a;
    }
}
