package ru.yandex.taxi.search;

import defpackage.atd0;
import defpackage.e3o;
import defpackage.etj0;
import defpackage.f4v0;
import defpackage.g92;
import defpackage.i4v0;
import defpackage.itj0;
import defpackage.j51;
import defpackage.jsq0;
import defpackage.lu0;
import defpackage.mu0;
import defpackage.nu0;
import defpackage.pvn;
import defpackage.qpc;
import defpackage.rol0;
import defpackage.rwp0;
import defpackage.tpr;
import defpackage.urv0;
import defpackage.v7v0;
import defpackage.xr0;
import defpackage.y46;
import defpackage.yu21;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.domain.model.SuggestResult$SuggestAction;
import ru.yandex.taxi.persuggest.experiments.SuggestHeuristicsExperiment;
import ru.yandex.taxi.persuggest.source.h;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes6.dex */
public final class f implements j51 {
    public final h a;
    public final atd0 b;
    public final mu0 c;
    public final ru.yandex.taxi.persuggest.experiments.b d;
    public final y46 e;
    public final urv0 f;
    public final rwp0 g;
    public volatile List h = EmptyList.a;

    public f(h hVar, atd0 atd0Var, mu0 mu0Var, ru.yandex.taxi.persuggest.experiments.b bVar, y46 y46Var, urv0 urv0Var, rwp0 rwp0Var) {
        this.a = hVar;
        this.b = atd0Var;
        this.c = mu0Var;
        this.d = bVar;
        this.e = y46Var;
        this.f = urv0Var;
        this.g = rwp0Var;
    }

    public static final ArrayList f(f fVar) {
        jsq0 jsq0Var;
        rwp0 rwp0Var = fVar.g;
        ArrayList arrayList = rwp0Var.g;
        ru.yandex.taxi.persuggest.experiments.b bVar = fVar.d;
        if (bVar.b(rwp0Var.a) && ((SuggestHeuristicsExperiment) bVar.a().b()).b && (jsq0Var = ((SuggestHeuristicsExperiment) bVar.a().b()).c) != null && jsq0Var.contains(SuggestHeuristicsExperiment.Heuristic.RESULT_SEEN_FULLY) && !arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    public static final Integer g(f fVar) {
        jsq0 jsq0Var;
        rwp0 rwp0Var = fVar.g;
        int i = rwp0Var.f.get();
        ru.yandex.taxi.persuggest.experiments.b bVar = fVar.d;
        if (bVar.b(rwp0Var.a) && ((SuggestHeuristicsExperiment) bVar.a().b()).b && (jsq0Var = ((SuggestHeuristicsExperiment) bVar.a().b()).c) != null && jsq0Var.contains(SuggestHeuristicsExperiment.Heuristic.EVENT_NUMBER) && i != 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    public static final String h(f fVar) {
        boolean z;
        String str;
        rwp0 rwp0Var = fVar.g;
        synchronized (rwp0Var) {
            z = rwp0Var.i != null;
        }
        if (!z) {
            return rwp0Var.a();
        }
        synchronized (rwp0Var) {
            str = rwp0Var.i;
            if (str == null) {
                throw new IllegalStateException("searchSessionId is not generated. Call createAndGetSearchSessionId method before.");
            }
        }
        return str;
    }

    public static final Long i(f fVar) {
        jsq0 jsq0Var;
        ru.yandex.taxi.persuggest.experiments.b bVar = fVar.d;
        rwp0 rwp0Var = fVar.g;
        if (bVar.b(rwp0Var.a) && ((SuggestHeuristicsExperiment) bVar.a().b()).b && (jsq0Var = ((SuggestHeuristicsExperiment) bVar.a().b()).c) != null && jsq0Var.contains(SuggestHeuristicsExperiment.Heuristic.SESSION_TIME)) {
            return Long.valueOf((System.currentTimeMillis() - rwp0Var.e) / 1000);
        }
        return null;
    }

    public static final itj0 j(f fVar, f4v0 f4v0Var) {
        fVar.getClass();
        long nanoTime = System.nanoTime();
        fVar.h = f4v0Var.b;
        String str = f4v0Var.c;
        if (str == null) {
            str = "";
        }
        return new itj0(str, fVar.g.a, nanoTime, f4v0Var.b, f4v0Var.a, f4v0Var.d);
    }

    @Override // defpackage.j51
    public final tpr a(String str) {
        return new rol0(new PersonalAddressSearchInteractor$resolveWholeQuery$1(this, str, null));
    }

    @Override // defpackage.j51
    public final tpr b(String str) {
        return new rol0(new PersonalAddressSearchInteractor$resolvePartialQuery$1(this, str, null));
    }

    @Override // defpackage.j51
    public final tpr c(e3o e3oVar) {
        return new e(((i) this.b).f(e3oVar.d, e3oVar.a, RoutePointType.POINT_A, e3oVar.e), this);
    }

    @Override // defpackage.j51
    public final tpr d(String str, String str2) {
        return new rol0(new PersonalAddressSearchInteractor$resolveSelectedQuery$1(this, str, str2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    @Override // defpackage.j51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tpr e(int i, boolean z, boolean z2) {
        xr0 xr0Var;
        qpc qpcVar = (qpc) kotlin.collections.a.S(i, this.h);
        if (qpcVar == null) {
            return pvn.a;
        }
        if (!(qpcVar instanceof v7v0)) {
            return new g92(2, new etj0(qpcVar));
        }
        v7v0 v7v0Var = (v7v0) qpcVar;
        if (v7v0Var.j != SuggestResult$SuggestAction.SEARCH) {
            return new n(new rol0(new PersonalAddressSearchInteractor$resolveSelectedSuggest$1(this, qpcVar, null)), new PersonalAddressSearchInteractor$resolveSelectedSuggest$2(qpcVar, null));
        }
        mu0 mu0Var = this.c;
        if (mu0Var.a.a().b) {
            nu0 nu0Var = mu0Var.b;
            lu0 lu0Var = nu0Var.a;
            nu0Var.a = null;
            if (lu0Var != null) {
                xr0Var = new xr0(lu0Var.b, lu0Var.c, lu0Var.d, lu0Var.e, lu0Var.f, lu0Var.g);
                zzs zzsVar = v7v0Var.a;
                String str = v7v0Var.b;
                i4v0 i4v0Var = v7v0Var.F;
                String str2 = v7v0Var.t;
                yu21 yu21Var = v7v0Var.H;
                RoutePointType routePointType = this.g.a;
                if (z) {
                    if (routePointType == RoutePointType.POINT_A) {
                        routePointType = RoutePointType.SUGGEST_MENU_POINT_A;
                    }
                    if (routePointType == RoutePointType.POINT_B) {
                        routePointType = RoutePointType.SUGGEST_MENU_POINT_B;
                    }
                }
                return new e(((i) this.b).h(zzsVar, "addressCorrection", routePointType, str, i4v0Var, str2, yu21Var, GeoPointAcquisitionType.DEFAULT, xr0Var, PositionInitAction.SUGGEST, z2), this);
            }
        }
        xr0Var = null;
        zzs zzsVar2 = v7v0Var.a;
        String str3 = v7v0Var.b;
        i4v0 i4v0Var2 = v7v0Var.F;
        String str22 = v7v0Var.t;
        yu21 yu21Var2 = v7v0Var.H;
        RoutePointType routePointType2 = this.g.a;
        if (z) {
        }
        return new e(((i) this.b).h(zzsVar2, "addressCorrection", routePointType2, str3, i4v0Var2, str22, yu21Var2, GeoPointAcquisitionType.DEFAULT, xr0Var, PositionInitAction.SUGGEST, z2), this);
    }
}
