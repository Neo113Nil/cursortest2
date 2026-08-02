package ru.yandex.taxi.masstransit.stop.router;

import android.content.Context;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import defpackage.a140;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.b140;
import defpackage.byx;
import defpackage.c430;
import defpackage.cwa1;
import defpackage.cyx;
import defpackage.dt00;
import defpackage.dz00;
import defpackage.f3g;
import defpackage.ft20;
import defpackage.g240;
import defpackage.gh00;
import defpackage.h0z;
import defpackage.h3y;
import defpackage.i240;
import defpackage.jfl0;
import defpackage.jl00;
import defpackage.jsd;
import defpackage.k0i;
import defpackage.kyh0;
import defpackage.ls30;
import defpackage.m010;
import defpackage.m950;
import defpackage.mu5;
import defpackage.o501;
import defpackage.oe61;
import defpackage.pgd;
import defpackage.po21;
import defpackage.q501;
import defpackage.qx5;
import defpackage.rp60;
import defpackage.s440;
import defpackage.sy60;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tu30;
import defpackage.un0;
import defpackage.vz00;
import defpackage.w030;
import defpackage.w040;
import defpackage.wfd;
import defpackage.wu30;
import defpackage.x040;
import defpackage.xvf0;
import defpackage.y040;
import defpackage.y140;
import defpackage.y50;
import defpackage.yvf0;
import defpackage.z040;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.masstransit.stop.interactor.g;
import ru.yandex.taxi.masstransit.stop.interactor.h;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class b extends pgd {
    public final Context F;
    public final w030 G;
    public final ah00 H;
    public final g I;
    public final yvf0 J;
    public final h3y K;
    public final yvf0 L;
    public final h3y M;
    public final h3y N;
    public final h O;
    public final yvf0 P;
    public final m010 Q;
    public final s440 R;
    public final y50 S;
    public final ru.yandex.taxi.masstransit.stop.interactor.b T;
    public final ru.yandex.taxi.masstransit.stop.interactor.a U;
    public final vz00 V;
    public final mu5 W;

    public b(Context context, w030 w030Var, z040 z040Var, x040 x040Var, ah00 ah00Var, g gVar, h0z h0zVar, h3y h3yVar, jl00 jl00Var, h3y h3yVar2, h3y h3yVar3, h hVar, qx5 qx5Var, m010 m010Var, s440 s440Var, y50 y50Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = ah00Var;
        this.I = gVar;
        this.J = h0zVar;
        this.K = h3yVar;
        this.L = jl00Var;
        this.M = h3yVar2;
        this.N = h3yVar3;
        this.O = hVar;
        this.P = qx5Var;
        this.Q = m010Var;
        this.R = s440Var;
        this.S = y50Var;
        a140 a140Var = new a140();
        y040 y040Var = z040Var.a;
        ru.yandex.taxi.masstransit.stop.interactor.b bVar = new ru.yandex.taxi.masstransit.stop.interactor.b(a140Var, (atd0) y040Var.a.get(), (com.yandex.go.zone.interactors.b) y040Var.b.get(), (wu30) y040Var.c.get(), (tu30) y040Var.d.get(), (po21) y040Var.e.get(), (tt2) y040Var.f.get());
        this.T = bVar;
        w040 w040Var = x040Var.a;
        this.U = new ru.yandex.taxi.masstransit.stop.interactor.a(gVar, bVar, (Context) ((xvf0) w040Var.a).get(), (b140) ((xvf0) w040Var.b).get(), (oe61) ((xvf0) w040Var.c).get(), (dz00) ((xvf0) w040Var.d).get(), (tj60) ((xvf0) w040Var.e).get(), (i240) ((xvf0) w040Var.f).get(), (ah00) ((f3g) w040Var.g).get(), (ls30) ((dt00) w040Var.h).get());
        this.V = new vz00(this, 1);
        this.W = new mu5(new ft20(29, this));
    }

    public static final void U(b bVar, PointType pointType) {
        bVar.V(pointType);
        ((cyx) bVar.N.get()).b(new byx(Screen.DISCOVERY, new c430(Mode.MASSTRANSIT, (kotlinx.serialization.json.b) null, (un0) null)));
        y140 y140Var = (y140) bVar.x;
        if (y140Var != null) {
            ((gh00) bVar.H).C(cwa1.d(y140Var.a.b));
        }
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        y140 y140Var = (y140) obj;
        super.G(y140Var);
        ((gh00) this.H).C(cwa1.d(y140Var.a.b));
        ((rp60) this.M.get()).b(y140Var.a.a);
        this.Q.e.add(this.V);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((y140) obj);
        this.O.d.a.l(null);
        ((rp60) this.M.get()).b(null);
        this.I.i.a.l(null);
        this.Q.e.remove(this.V);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        r0 r0Var = this.T.a.a;
        jfl0 jfl0Var = new jfl0(null, null);
        r0Var.getClass();
        r0Var.m(null, jfl0Var);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        y140 y140Var = (y140) obj;
        tje.N(o(), null, null, new MtStopModalRouter$onLaunch$1(this, y140Var, null), 3);
        A((m950) this.P.get(), new g240(y140Var.a.b), sy60.Q2);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.W;
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
        return false;
    }

    public final void V(PointType pointType) {
        o501 o501Var = new o501(kyh0.address_search_modal_view_from, kyh0.address_search_modal_view_to, 14);
        A((m950) this.J.get(), new jsd(pointType, SourcePicker.FROM_TRANSPORT_DISCOVERY, false, new q501(o501Var, o501Var), ((wu30) this.K.get()).k(), "discovery_masstransit", null, HProv.ALG_TYPE_BLOCK), new k0i(this, 4));
        this.R.a = true;
    }
}
