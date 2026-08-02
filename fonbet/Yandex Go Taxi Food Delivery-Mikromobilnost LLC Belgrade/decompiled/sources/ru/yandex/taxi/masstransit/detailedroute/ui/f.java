package ru.yandex.taxi.masstransit.detailedroute.ui;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.bvf0;
import defpackage.fay0;
import defpackage.g92;
import defpackage.mth;
import defpackage.ny61;
import defpackage.oov0;
import defpackage.pd01;
import defpackage.rw30;
import defpackage.su30;
import defpackage.tpr;
import defpackage.wr30;
import defpackage.yta1;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class f {
    public final ru.yandex.taxi.masstransit.domain.c a;
    public final ru.yandex.taxi.masstransit.mapper.a b;
    public final wr30 c;
    public final ru.yandex.taxi.masstransit.datasource.routing.a d;
    public final r0 e = bvf0.c(EmptySet.a);

    static {
        int i = ru.yandex.taxi.masstransit.domain.c.h;
    }

    public f(ru.yandex.taxi.masstransit.domain.c cVar, ru.yandex.taxi.masstransit.mapper.a aVar, wr30 wr30Var, ru.yandex.taxi.masstransit.datasource.routing.a aVar2) {
        this.a = cVar;
        this.b = aVar;
        this.c = wr30Var;
        this.d = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(f fVar, Pair pair, fay0 fay0Var, boolean z, ContinuationImpl continuationImpl) {
        RouteToTransportRouteItemMapperImpl$mapUiState$1 routeToTransportRouteItemMapperImpl$mapUiState$1;
        int i;
        fay0 fay0Var2;
        fVar.getClass();
        if (continuationImpl instanceof RouteToTransportRouteItemMapperImpl$mapUiState$1) {
            routeToTransportRouteItemMapperImpl$mapUiState$1 = (RouteToTransportRouteItemMapperImpl$mapUiState$1) continuationImpl;
            int i2 = routeToTransportRouteItemMapperImpl$mapUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeToTransportRouteItemMapperImpl$mapUiState$1.label = i2 - Integer.MIN_VALUE;
                RouteToTransportRouteItemMapperImpl$mapUiState$1 routeToTransportRouteItemMapperImpl$mapUiState$12 = routeToTransportRouteItemMapperImpl$mapUiState$1;
                Object obj = routeToTransportRouteItemMapperImpl$mapUiState$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeToTransportRouteItemMapperImpl$mapUiState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rw30 rw30Var = (rw30) pair.getFirst();
                    Set set = (Set) pair.getSecond();
                    ru.yandex.taxi.masstransit.mapper.a aVar = fVar.b;
                    pd01 pd01Var = rw30Var.f;
                    oov0 oov0Var = pd01Var.b;
                    ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar2 = rw30Var.h;
                    boolean z2 = pd01Var.a;
                    routeToTransportRouteItemMapperImpl$mapUiState$12.L$0 = null;
                    routeToTransportRouteItemMapperImpl$mapUiState$12.L$1 = fay0Var;
                    routeToTransportRouteItemMapperImpl$mapUiState$12.L$2 = null;
                    routeToTransportRouteItemMapperImpl$mapUiState$12.L$3 = null;
                    routeToTransportRouteItemMapperImpl$mapUiState$12.Z$0 = z;
                    routeToTransportRouteItemMapperImpl$mapUiState$12.label = 1;
                    obj = aVar.f(rw30Var, set, oov0Var, aVar2, z2, fay0Var, z, routeToTransportRouteItemMapperImpl$mapUiState$12);
                    if (obj != obj2) {
                        fay0Var2 = fay0Var;
                    }
                    return (Serializable) obj2;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fay0Var2 = (fay0) routeToTransportRouteItemMapperImpl$mapUiState$12.L$1;
                kotlin.b.b(obj);
                obj2 = yta1.e((List) obj, fay0Var2);
                return (Serializable) obj2;
            }
        }
        routeToTransportRouteItemMapperImpl$mapUiState$1 = new RouteToTransportRouteItemMapperImpl$mapUiState$1(fVar, continuationImpl);
        RouteToTransportRouteItemMapperImpl$mapUiState$1 routeToTransportRouteItemMapperImpl$mapUiState$122 = routeToTransportRouteItemMapperImpl$mapUiState$1;
        Object obj3 = routeToTransportRouteItemMapperImpl$mapUiState$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeToTransportRouteItemMapperImpl$mapUiState$122.label;
        if (i != 0) {
        }
        obj22 = yta1.e((List) obj3, fay0Var2);
        return (Serializable) obj22;
    }

    public final tpr b(Route route, List list, fay0 fay0Var, boolean z, boolean z2, long j) {
        su30 j2 = this.d.j(route, list, null, pd01.e, j);
        if (j2 == null) {
            return new g92(2, EmptyList.a);
        }
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.X(new mth(new j0(null, this.a.a(new g92(2, j2), z ? this.c.a() : new g92(2, ru.yandex.taxi.masstransit.geopayment.tickets.model.a.b)), new RouteToTransportRouteItemMapperImpl$updateLocalState$$inlined$withPreviousEmit$1(3, null)), 6), new RouteToTransportRouteItemMapperImpl$updateLocalState$$inlined$flatMapLatest$1(null, this)), new RouteToTransportRouteItemMapperImpl$map$2(this, fay0Var, z2, null)));
    }
}
