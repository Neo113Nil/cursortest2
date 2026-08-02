package ru.yandex.taxi.masstransit.overlay.onmap;

import defpackage.a3v;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.bt00;
import defpackage.bvf0;
import defpackage.ck40;
import defpackage.dk40;
import defpackage.dz00;
import defpackage.ek40;
import defpackage.fk40;
import defpackage.g92;
import defpackage.gh00;
import defpackage.hj40;
import defpackage.ik40;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mz30;
import defpackage.sk91;
import defpackage.su30;
import defpackage.tje;
import defpackage.tk40;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uj30;
import defpackage.w511;
import defpackage.xj30;
import defpackage.y540;
import defpackage.zj30;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.experiment.d0;

/* loaded from: classes6.dex */
public final class h extends ad5 {
    public final mz30 A;
    public final ru.yandex.taxi.masstransit.mapper.g B;
    public final tt2 C;
    public final a3v D;
    public final zj30 E;
    public final dz00 F;
    public final bt00 G;
    public final d0 H;
    public final ah00 I;
    public final xj30 J;
    public final ru.yandex.taxi.masstransit.domain.f K;
    public final i L;
    public final r0 M;
    public final r0 N;
    public final uj30 x;
    public final tk40 y;
    public final su30 z;

    public h(uj30 uj30Var, tk40 tk40Var, su30 su30Var, mz30 mz30Var, ru.yandex.taxi.masstransit.mapper.g gVar, tt2 tt2Var, a3v a3vVar, zj30 zj30Var, dz00 dz00Var, bt00 bt00Var, d0 d0Var, ah00 ah00Var, xj30 xj30Var, ru.yandex.taxi.masstransit.domain.f fVar, i iVar) {
        super(ik40.class);
        this.x = uj30Var;
        this.y = tk40Var;
        this.z = su30Var;
        this.A = mz30Var;
        this.B = gVar;
        this.C = tt2Var;
        this.D = a3vVar;
        this.E = zj30Var;
        this.F = dz00Var;
        this.G = bt00Var;
        this.H = d0Var;
        this.I = ah00Var;
        this.J = xj30Var;
        this.K = fVar;
        this.L = iVar;
        this.M = bvf0.c(Boolean.FALSE);
        this.N = bvf0.c(ck40.a);
    }

    public static final void Kg(h hVar, fk40 fk40Var) {
        r0 r0Var = hVar.M;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        i iVar = hVar.L;
        iVar.c();
        if (jl40.l(fk40Var, ck40.a)) {
            tje.N(hVar.Jg(), null, null, new MtViewOnMapOverlayPresenter$handleMode$1(null, hVar), 3);
        } else if (fk40Var instanceof dk40) {
            y540 y540Var = ((dk40) fk40Var).a;
            tpr d = com.yandex.go.coroutines.b.d(hVar.A.b, new MtViewOnMapOverlayPresenter$selectedVehicleFlowWithInitial$$inlined$start$1(y540Var.c, null));
            tse Jg = hVar.Jg();
            hj40 hj40Var = y540Var.a;
            iVar.b((ike) Jg, d, new g92(2, hj40Var != null ? hj40Var.d : null));
        } else {
            if (!(fk40Var instanceof ek40)) {
                w511.b();
                return;
            }
            tje.N(hVar.Jg(), null, null, new MtViewOnMapOverlayPresenter$focusOnStop$1(((ek40) fk40Var).a, hVar, null), 3);
        }
        hVar.Lg(((gh00) hVar.I).j(), fk40Var);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((ru.yandex.taxi.map_common.style.source.e) this.G).c(3, "");
        this.D.a0(this);
    }

    public final void Lg(float f, fk40 fk40Var) {
        if (sk91.a(this.z)) {
            return;
        }
        ik40 ik40Var = (ik40) Dg();
        boolean z = true;
        if (jl40.l(fk40Var, ck40.a) || (fk40Var instanceof ek40)) {
            if (f < 12.9f) {
                z = false;
            }
        } else if (!(fk40Var instanceof dk40)) {
            w511.b();
            return;
        }
        ik40Var.kf(z);
    }
}
