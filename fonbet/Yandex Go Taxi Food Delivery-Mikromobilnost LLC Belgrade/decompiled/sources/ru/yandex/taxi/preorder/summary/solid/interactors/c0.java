package ru.yandex.taxi.preorder.summary.solid.interactors;

import com.yandex.go.address.models.Address;
import defpackage.atd0;
import defpackage.jqr;
import defpackage.kfv0;
import defpackage.mdh;
import defpackage.pg9;
import defpackage.pvn;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zzs;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final class c0 {
    public final tse a;
    public final pg9 b;
    public final com.yandex.go.route.interactor.b c;
    public final atd0 d;
    public final tt2 e;
    public volatile Address f;
    public volatile Address g;

    public c0(tse tseVar, pg9 pg9Var, com.yandex.go.route.interactor.b bVar, atd0 atd0Var, tt2 tt2Var) {
        this.a = tseVar;
        this.b = pg9Var;
        this.c = bVar;
        this.d = atd0Var;
        this.e = tt2Var;
    }

    public static final tpr a(c0 c0Var, String str) {
        zzs B;
        kfv0 kfv0Var;
        Address b = c0Var.c.c().b();
        if (c0Var.g == null && str != null) {
            c0Var.g = b;
            kfv0Var = new kfv0(b != null ? b.B() : null, false);
        } else if (str != null) {
            kfv0Var = new kfv0(b != null ? b.B() : null, false);
        } else {
            Address address = c0Var.g;
            if (address == null || (B = address.B()) == null) {
                B = b != null ? b.B() : null;
            }
            kfv0Var = new kfv0(B, true);
        }
        zzs zzsVar = kfv0Var.a;
        if (zzsVar == null) {
            return pvn.a;
        }
        ru.yandex.taxi.search.suggest.i iVar = (ru.yandex.taxi.search.suggest.i) c0Var.d;
        return new jqr(iVar.s(iVar.e.i(zzsVar, RoutePointType.POINT_B, "auto", iVar.b.m(), PositionInitAction.SUMMARY_TARIFF_CHANGE)), new SummaryFinalSuggestRepeatRequestInteractor$requestFinalSuggestForDestinationPoint$1(kfv0Var, c0Var, null), 3);
    }

    public static final tpr b(c0 c0Var, String str) {
        zzs B;
        kfv0 kfv0Var;
        Address h = c0Var.c.c().h();
        if (c0Var.f == null && str != null) {
            c0Var.f = h;
            kfv0Var = new kfv0(h != null ? h.B() : null, false);
        } else if (str != null) {
            kfv0Var = new kfv0(h != null ? h.B() : null, false);
        } else {
            Address address = c0Var.f;
            if (address == null || (B = address.B()) == null) {
                B = h != null ? h.B() : null;
            }
            kfv0Var = new kfv0(B, true);
        }
        zzs zzsVar = kfv0Var.a;
        if (zzsVar == null) {
            return pvn.a;
        }
        ru.yandex.taxi.search.suggest.i iVar = (ru.yandex.taxi.search.suggest.i) c0Var.d;
        return new jqr(iVar.s(iVar.e.i(zzsVar, RoutePointType.POINT_A, "auto", iVar.b.m(), PositionInitAction.SUMMARY_TARIFF_CHANGE)), new SummaryFinalSuggestRepeatRequestInteractor$requestFinalSuggestForSourcePoint$1(kfv0Var, c0Var, null), 3);
    }

    public final void c() {
        if (this.f != null) {
            tse tseVar = this.a;
            this.e.getClass();
            sjh sjhVar = uyj.a;
            tje.N(tseVar, mdh.b, null, new SummaryFinalSuggestRepeatRequestInteractor$detach$1(null, this), 2);
        }
        if (this.g != null) {
            tse tseVar2 = this.a;
            this.e.getClass();
            sjh sjhVar2 = uyj.a;
            tje.N(tseVar2, mdh.b, null, new SummaryFinalSuggestRepeatRequestInteractor$detach$2(null, this), 2);
        }
    }

    public final tpr d() {
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(this.b.a, new SummaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$$inlined$flatMapLatest$1(null, this));
        this.e.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(X, mdh.b);
    }
}
