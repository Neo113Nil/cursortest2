package ru.yandex.taxi.scooters.presentation.arbitrary_destination.domain;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.arm0;
import defpackage.bym0;
import defpackage.huo0;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.po21;
import defpackage.w33;
import defpackage.wha1;
import defpackage.x33;
import defpackage.zzs;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;

/* loaded from: classes6.dex */
public final class a {
    public final po21 a;
    public final huo0 b;
    public final bym0 c;

    public a(po21 po21Var, huo0 huo0Var, bym0 bym0Var) {
        this.a = po21Var;
        this.b = huo0Var;
        this.c = bym0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|(1:19)|16|17))|30|6|7|(0)(0)|12|(1:14)|19|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, zzs zzsVar, w33 w33Var, ContinuationImpl continuationImpl) {
        ScootersArbitraryDestinationRouteInteractor$getScootersRoute$1 scootersArbitraryDestinationRouteInteractor$getScootersRoute$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ScootersArbitraryDestinationRouteInteractor$getScootersRoute$1) {
            scootersArbitraryDestinationRouteInteractor$getScootersRoute$1 = (ScootersArbitraryDestinationRouteInteractor$getScootersRoute$1) continuationImpl;
            int i2 = scootersArbitraryDestinationRouteInteractor$getScootersRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersArbitraryDestinationRouteInteractor$getScootersRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersArbitraryDestinationRouteInteractor$getScootersRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersArbitraryDestinationRouteInteractor$getScootersRoute$1.label;
                if (i != 0) {
                    b.b(obj);
                    huo0 huo0Var = aVar.b;
                    zzs zzsVar2 = w33Var.a;
                    scootersArbitraryDestinationRouteInteractor$getScootersRoute$1.L$0 = null;
                    scootersArbitraryDestinationRouteInteractor$getScootersRoute$1.L$1 = w33Var;
                    scootersArbitraryDestinationRouteInteractor$getScootersRoute$1.label = 1;
                    ru.yandex.taxi.scootersroute.a aVar2 = (ru.yandex.taxi.scootersroute.a) huo0Var;
                    obj = aVar2.b(zzsVar, zzsVar2, aVar2.c, scootersArbitraryDestinationRouteInteractor$getScootersRoute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w33Var = (w33) scootersArbitraryDestinationRouteInteractor$getScootersRoute$1.L$1;
                    b.b(obj);
                }
                Route route = wha1.g((List) obj);
                return new x33(w33Var, (route != null || nzs.a(route) >= 30.0d) ? route : null);
            }
        }
        scootersArbitraryDestinationRouteInteractor$getScootersRoute$1 = new ScootersArbitraryDestinationRouteInteractor$getScootersRoute$1(aVar, continuationImpl);
        Object obj2 = scootersArbitraryDestinationRouteInteractor$getScootersRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersArbitraryDestinationRouteInteractor$getScootersRoute$1.label;
        if (i != 0) {
        }
        Route route2 = wha1.g((List) obj2);
        return new x33(w33Var, (route2 != null || nzs.a(route2) >= 30.0d) ? route2 : null);
    }

    public final jqr b() {
        return new jqr(e.I(new m0(e.s(new n(((ru.yandex.taxi.preorder.source.userposition.e) this.a).n(), new ScootersArbitraryDestinationRouteInteractor$listenUserLocation$1(this, null)), new arm0(1)), new ru.yandex.taxi.scooters.presentation.arbitrary_destination.data.b(this.c.b), new ScootersArbitraryDestinationRouteInteractor$listenRouteState$1(3, null)), new ScootersArbitraryDestinationRouteInteractor$listenRouteState$2(this, null)), new ScootersArbitraryDestinationRouteInteractor$listenRouteState$3(this, null), 3);
    }
}
