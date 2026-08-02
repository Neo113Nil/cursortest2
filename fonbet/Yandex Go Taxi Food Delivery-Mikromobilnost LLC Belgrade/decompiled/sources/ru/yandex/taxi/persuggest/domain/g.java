package ru.yandex.taxi.persuggest.domain;

import defpackage.d2t;
import defpackage.d8;
import defpackage.e2t;
import defpackage.eci0;
import defpackage.gw00;
import defpackage.gwk0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.i4v0;
import defpackage.j2t;
import defpackage.jl40;
import defpackage.jtq0;
import defpackage.k4o;
import defpackage.o2s;
import defpackage.o9j0;
import defpackage.p820;
import defpackage.q9j0;
import defpackage.rol0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tpr;
import defpackage.u1t;
import defpackage.v1t;
import defpackage.v5v0;
import defpackage.w6r;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.t0;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes9.dex */
public final class g {
    public final v5v0 a;
    public final ru.yandex.taxi.persuggest.source.c b;
    public final e2t c;
    public final j2t d;
    public final jtq0 e;
    public final o2s f;
    public final w6r g;
    public final q9j0 h;
    public final hbp0 i;
    public final u1t j = new u1t();
    public final LinkedHashMap k;

    public g(hit hitVar, v5v0 v5v0Var, ru.yandex.taxi.persuggest.source.c cVar, e2t e2tVar, j2t j2tVar, jtq0 jtq0Var, o2s o2sVar, w6r w6rVar, q9j0 q9j0Var) {
        this.a = v5v0Var;
        this.b = cVar;
        this.c = e2tVar;
        this.d = j2tVar;
        this.e = jtq0Var;
        this.f = o2sVar;
        this.g = w6rVar;
        this.h = q9j0Var;
        this.i = hitVar.a;
        k4o b = RoutePointType.b();
        int d = gw00.d(tcc.n(b, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : b) {
            linkedHashMap.put(obj, gwk0.b());
        }
        this.k = linkedHashMap;
    }

    public static /* synthetic */ eci0 h(g gVar, d2t d2tVar, Float f, int i) {
        if ((i & 4) != 0) {
            f = null;
        }
        return gVar.g(d2tVar, null, f);
    }

    public static d l(g gVar, zzs zzsVar, RoutePointType routePointType, String str, String str2, String str3, PositionInitAction positionInitAction, Float f, Action action, ArrayList arrayList, String str4, int i) {
        ArrayList arrayList2 = (i & 256) != 0 ? null : arrayList;
        String str5 = (i & 512) != 0 ? null : str4;
        gVar.getClass();
        d2t d2tVar = new d2t(new o9j0(routePointType, zzsVar, null, false, false, null, str5, str3, null, positionInitAction, arrayList2, 828), new p820(zzsVar, str, str2, routePointType, gVar.e.d(), null, null, null, jl40.l(str, "auto") ? GeoPointAcquisitionType.USER_LOCATION : GeoPointAcquisitionType.DEFAULT, false, 3552));
        int i2 = v1t.a[action.ordinal()];
        eci0 h = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? h(gVar, d2tVar, f, 2) : gVar.f(new GeoSuggestInteractorImpl$updateAddressWithPhotoCoordinates$1(gVar, d2tVar, null), d2tVar, null) : gVar.c(d2tVar) : gVar.f(new GeoSuggestInteractorImpl$redirect$1(gVar, d2tVar, null), d2tVar, new d8(26, gVar)) : gVar.b(d2tVar, i4v0.j);
        gVar.a(h, d2tVar);
        return new d(h);
    }

    public final void a(tpr tprVar, d2t d2tVar) {
        this.j.a(d2tVar.b.d).g(new f(tprVar, d2tVar));
    }

    public final eci0 b(d2t d2tVar, i4v0 i4v0Var) {
        return f(new GeoSuggestInteractorImpl$finalize$1(this, d2tVar, i4v0Var, null), d2tVar, new d8(26, this));
    }

    public final eci0 c(d2t d2tVar) {
        return f(new GeoSuggestInteractorImpl$geomagnet$1(this, d2tVar, null), d2tVar, new d8(26, this));
    }

    public final kotlinx.coroutines.flow.internal.g d(RoutePointType routePointType) {
        return kotlinx.coroutines.flow.e.X(new t0(this.j.a(routePointType), new GeoSuggestInteractorImpl$listenToSuggest$1(this, routePointType, null)), new GeoSuggestInteractorImpl$listenToSuggest$$inlined$flatMapLatest$1(null, this));
    }

    public final kotlinx.coroutines.flow.internal.g e(RoutePointType routePointType) {
        return kotlinx.coroutines.flow.e.X(new t0(this.j.a(routePointType), new GeoSuggestInteractorImpl$listenToSuggestResult$1(this, routePointType, null)), new GeoSuggestInteractorImpl$listenToSuggestResult$$inlined$flatMapLatest$1(3, null));
    }

    public final eci0 f(tls tlsVar, d2t d2tVar, d8 d8Var) {
        return kotlinx.coroutines.flow.e.O(new rol0(new GeoSuggestInteractorImpl$mapResponseFlow$1(this, d2tVar, tlsVar, d8Var, null)), this.i, wsr0.a(xsr0.a, 3), 0);
    }

    public final eci0 g(d2t d2tVar, i4v0 i4v0Var, Float f) {
        return f(new GeoSuggestInteractorImpl$pinDrop$1(this, d2tVar, i4v0Var, f, null), d2tVar, new d8(26, this));
    }

    public final d i(zzs zzsVar, RoutePointType routePointType, String str, String str2, PositionInitAction positionInitAction) {
        d2t d2tVar = new d2t(new o9j0(routePointType, zzsVar, null, false, false, null, null, null, null, positionInitAction, null, 3068), new p820(zzsVar, str, str2, routePointType, this.e.d(), null, null, null, str.equals("auto") ? GeoPointAcquisitionType.USER_LOCATION : GeoPointAcquisitionType.DEFAULT, false, 3552));
        eci0 f = f(new GeoSuggestInteractorImpl$redirect$1(this, d2tVar, null), d2tVar, new d8(26, this));
        a(f, d2tVar);
        return new d(f);
    }

    public final d j(zzs zzsVar, boolean z, PositionInitAction positionInitAction, boolean z2) {
        RoutePointType routePointType = RoutePointType.POINT_A;
        d2t d2tVar = new d2t(new o9j0(routePointType, zzsVar, null, z, z2, null, null, "main", null, positionInitAction, null, 2916), new p820(zzsVar, "auto", "#none#", routePointType, this.e.d(), null, null, null, GeoPointAcquisitionType.USER_LOCATION, false, 3552));
        eci0 h = h(this, d2tVar, null, 2);
        a(h, d2tVar);
        return new d(h);
    }
}
