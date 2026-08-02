package ru.yandex.taxi.masstransit.stoproute.router;

import android.content.Context;
import defpackage.ah00;
import defpackage.b4l0;
import defpackage.d240;
import defpackage.d340;
import defpackage.dc4;
import defpackage.f340;
import defpackage.gh00;
import defpackage.i340;
import defpackage.i3y;
import defpackage.j340;
import defpackage.m010;
import defpackage.m340;
import defpackage.m950;
import defpackage.mu5;
import defpackage.oe61;
import defpackage.pgd;
import defpackage.qx5;
import defpackage.sy60;
import defpackage.tje;
import defpackage.vz00;
import defpackage.w030;
import defpackage.wfd;
import defpackage.xl10;
import defpackage.y50;
import defpackage.yvf0;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.stoproute.interactor.p;
import ru.yandex.taxi.masstransit.stoproute.ui.g;

/* loaded from: classes6.dex */
public final class b extends pgd {
    public final Context F;
    public final w030 G;
    public final yvf0 H;
    public final f340 I;
    public final m340 J;
    public final oe61 K;
    public final dc4 L;
    public final ah00 M;
    public final m010 N;
    public final y50 O;
    public final vz00 P;
    public final xl10 Q;
    public final i3y R;
    public final mu5 S;

    public b(Context context, w030 w030Var, qx5 qx5Var, f340 f340Var, m340 m340Var, oe61 oe61Var, dc4 dc4Var, ah00 ah00Var, m010 m010Var, y50 y50Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = qx5Var;
        this.I = f340Var;
        this.J = m340Var;
        this.K = oe61Var;
        this.L = dc4Var;
        this.M = ah00Var;
        this.N = m010Var;
        this.O = y50Var;
        this.P = new vz00(this, 2);
        this.Q = new xl10(this);
        this.R = kotlin.a.a(new d240(3, this));
        this.S = new mu5(new i340(this, 0));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((j340) obj);
        this.N.e.add(this.P);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((j340) obj);
        this.N.e.remove(this.P);
        p pVar = ((g) this.R.getValue()).g;
        pVar.g.c();
        ((gh00) pVar.a).u(pVar.h);
        r0 r0Var = this.I.a;
        r0Var.getClass();
        r0Var.m(null, EmptyList.a);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        j340 j340Var = (j340) obj;
        A((m950) this.H.get(), new d340(j340Var.b, j340Var.a instanceof b4l0), sy60.Q2);
        tje.N(o(), null, null, new MtStopRouteRouter$onLaunch$1(this, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.S;
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
}
