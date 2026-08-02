package ru.yandex.taxi.masstransit.deeplink;

import defpackage.a110;
import defpackage.ae40;
import defpackage.b110;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.v770;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;

/* loaded from: classes9.dex */
public final class d extends b110 {
    public final h3y b;
    public final h3y c;

    public d(h3y h3yVar, h3y h3yVar2) {
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (a110) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, a110 a110Var, ContinuationImpl continuationImpl) {
        MassTransitStationSearchDeeplinkHandler$handleDeeplink$1 massTransitStationSearchDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        if (continuationImpl instanceof MassTransitStationSearchDeeplinkHandler$handleDeeplink$1) {
            massTransitStationSearchDeeplinkHandler$handleDeeplink$1 = (MassTransitStationSearchDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = massTransitStationSearchDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                massTransitStationSearchDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = massTransitStationSearchDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = massTransitStationSearchDeeplinkHandler$handleDeeplink$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.masstransit.trains.config.a aVar = (ru.yandex.taxi.masstransit.trains.config.a) this.c.get();
                    massTransitStationSearchDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    massTransitStationSearchDeeplinkHandler$handleDeeplink$1.L$1 = a110Var;
                    massTransitStationSearchDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    massTransitStationSearchDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    massTransitStationSearchDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = aVar.c(massTransitStationSearchDeeplinkHandler$handleDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a110Var = (a110) massTransitStationSearchDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) massTransitStationSearchDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Iterator<E> it = TransportRouteAnalytics$FlowOrigin.a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (jl40.l(((TransportRouteAnalytics$FlowOrigin) next).getEventValue(), a110Var.a())) {
                            obj2 = next;
                            break;
                        }
                    }
                    TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = (TransportRouteAnalytics$FlowOrigin) obj2;
                    if (transportRouteAnalytics$FlowOrigin == null) {
                        transportRouteAnalytics$FlowOrigin = TransportRouteAnalytics$FlowOrigin.Deeplink;
                    }
                    oep0.b(oep0Var, ((ae40) this.b.get()).a(transportRouteAnalytics$FlowOrigin).b());
                }
                return zy11.a;
            }
        }
        massTransitStationSearchDeeplinkHandler$handleDeeplink$1 = new MassTransitStationSearchDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = massTransitStationSearchDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = massTransitStationSearchDeeplinkHandler$handleDeeplink$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
