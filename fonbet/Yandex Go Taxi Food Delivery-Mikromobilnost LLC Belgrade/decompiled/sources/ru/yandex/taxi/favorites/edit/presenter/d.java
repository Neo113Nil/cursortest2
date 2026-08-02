package ru.yandex.taxi.favorites.edit.presenter;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import defpackage.ad5;
import defpackage.agp;
import defpackage.aip;
import defpackage.arv0;
import defpackage.bgf;
import defpackage.cgp;
import defpackage.d6z;
import defpackage.fgp;
import defpackage.ggp;
import defpackage.igp;
import defpackage.jgp;
import defpackage.k3u0;
import defpackage.kgp;
import defpackage.kip;
import defpackage.kj00;
import defpackage.lj00;
import defpackage.oep0;
import defpackage.oln;
import defpackage.p2y0;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.qmp;
import defpackage.rmn;
import defpackage.tfp;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ul51;
import defpackage.w040;
import defpackage.w511;
import defpackage.wip;
import defpackage.yvf0;
import defpackage.z9n;
import defpackage.zuj0;
import ru.yandex.taxi.favorites.edit.arguments.EditArguments;
import ru.yandex.taxi.favorites.edit.arguments.Existing;
import ru.yandex.taxi.favorites.edit.arguments.NewFavorite;
import ru.yandex.taxi.favorites.experiment.e;

/* loaded from: classes5.dex */
public final class d extends ad5 {
    public final arv0 A;
    public final ru.yandex.taxi.favorites.data.repo.a B;
    public final qmp C;
    public final ru.yandex.taxi.widget.c D;
    public final kip E;
    public final ru.yandex.taxi.map_common.image.a F;
    public final pwy0 G;
    public final wip H;
    public final yvf0 I;
    public final oep0 J;
    public final aip K;
    public final pav L;
    public k3u0 M;
    public final zuj0 x;
    public final w040 y;
    public final p2y0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zuj0 zuj0Var, w040 w040Var, p2y0 p2y0Var, arv0 arv0Var, ru.yandex.taxi.favorites.data.repo.a aVar, qmp qmpVar, ru.yandex.taxi.widget.c cVar, kip kipVar, ru.yandex.taxi.map_common.image.a aVar2, pwy0 pwy0Var, wip wipVar, z9n z9nVar, oep0 oep0Var, aip aipVar, pav pavVar) {
        super(cgp.class);
        k3u0 olnVar;
        kip kipVar2 = (kip) w040Var.f;
        e eVar = (e) w040Var.g;
        this.x = zuj0Var;
        this.y = w040Var;
        this.z = p2y0Var;
        this.A = arv0Var;
        this.B = aVar;
        this.C = qmpVar;
        this.D = cVar;
        this.E = kipVar;
        this.F = aVar2;
        this.G = pwy0Var;
        this.H = wipVar;
        this.I = z9nVar;
        this.J = oep0Var;
        this.K = aipVar;
        this.L = pavVar;
        EditArguments editArguments = (EditArguments) w040Var.b;
        if (editArguments instanceof NewFavorite) {
            NewFavorite newFavorite = (NewFavorite) editArguments;
            olnVar = new rmn(this, newFavorite.getAddress(), newFavorite.getIsPointAcquisitionTypeUserLocation(), (qmp) w040Var.c, (ru.yandex.taxi.favorites.data.repo.a) w040Var.d, (zuj0) w040Var.e, (tt2) w040Var.a, eVar, (bgf) w040Var.h, kipVar2);
        } else {
            if (!(editArguments instanceof Existing)) {
                w511.b();
                throw null;
            }
            olnVar = new oln(this, ((Existing) editArguments).getAddress(), (ru.yandex.taxi.favorites.data.repo.a) w040Var.d, (zuj0) w040Var.e, (qmp) w040Var.c, (tt2) w040Var.a, eVar, (bgf) w040Var.h, kipVar2);
        }
        this.M = olnVar;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.M.c();
    }

    public final kgp Kg() {
        ((ul51) this.C).getClass();
        FavoriteAddressDatumType datumType = this.M.a().getDatumType();
        if (datumType == FavoriteAddressDatumType.GEO_POINT) {
            return ggp.g;
        }
        if (datumType == FavoriteAddressDatumType.REGULAR) {
            return igp.g;
        }
        kip kipVar = this.E;
        if (!kipVar.a().b) {
            return jgp.g;
        }
        agp a = kipVar.a();
        String Y = d6z.Y(a, a.k);
        agp a2 = kipVar.a();
        return new fgp(!kipVar.a().d, !kipVar.a().e, Y, d6z.Y(a2, a2.l));
    }

    public final void Lg() {
        ((ul51) this.C).getClass();
        if (this.M.a().getDatumType() != FavoriteAddressDatumType.GEO_POINT) {
            ((cgp) Dg()).renderMapImage(kj00.a);
        } else {
            ((cgp) Dg()).renderMapImage(lj00.a);
            tje.N(Jg(), null, null, new FavoriteEditPresenter$loadMapImage$1(this, null), 3);
        }
    }

    public final void Mg() {
        FavoriteAddressDatumType datumType = this.M.a().getDatumType();
        int i = datumType == null ? -1 : tfp.a[datumType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                tje.N(Jg(), null, null, new FavoriteEditPresenter$renderRegularTypeHeader$1(this, null), 3);
            } else if (i == 2) {
                tje.N(Jg(), null, null, new FavoriteEditPresenter$renderGeoPointTypeHeader$1(this, null), 3);
            } else {
                w511.b();
            }
        }
    }

    public final void Ng(FavoriteAddress favoriteAddress) {
        this.M.c();
        w040 w040Var = this.y;
        oln olnVar = new oln(this, favoriteAddress, (ru.yandex.taxi.favorites.data.repo.a) w040Var.d, (zuj0) w040Var.e, (qmp) w040Var.c, (tt2) w040Var.a, (e) w040Var.g, (bgf) w040Var.h, (kip) w040Var.f);
        this.M = olnVar;
        olnVar.i();
        ((cgp) Dg()).render(this.M.d());
    }
}
