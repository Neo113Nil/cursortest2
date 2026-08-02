package ru.yandex.taxi.masstransit.deeplink;

import defpackage.ae40;
import defpackage.h3y;
import defpackage.hh40;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.pj40;
import defpackage.v770;
import defpackage.y010;
import defpackage.z010;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleEntryPointSource;

/* loaded from: classes9.dex */
public final class c extends z010 {
    public final h3y b;
    public final h3y c;

    public c(h3y h3yVar, h3y h3yVar2) {
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (y010) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, y010 y010Var, ContinuationImpl continuationImpl) {
        MassTransitScheduleDeeplinkHandler$handleDeeplink$1 massTransitScheduleDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        if (continuationImpl instanceof MassTransitScheduleDeeplinkHandler$handleDeeplink$1) {
            massTransitScheduleDeeplinkHandler$handleDeeplink$1 = (MassTransitScheduleDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = massTransitScheduleDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                massTransitScheduleDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = massTransitScheduleDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = massTransitScheduleDeeplinkHandler$handleDeeplink$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.masstransit.trains.config.a aVar = (ru.yandex.taxi.masstransit.trains.config.a) this.c.get();
                    massTransitScheduleDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    massTransitScheduleDeeplinkHandler$handleDeeplink$1.L$1 = y010Var;
                    massTransitScheduleDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    massTransitScheduleDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    massTransitScheduleDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = aVar.c(massTransitScheduleDeeplinkHandler$handleDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y010Var = (y010) massTransitScheduleDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) massTransitScheduleDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Iterator<E> it = TransportRouteAnalytics$FlowOrigin.a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (jl40.l(((TransportRouteAnalytics$FlowOrigin) next).getEventValue(), y010Var.b())) {
                            obj2 = next;
                            break;
                        }
                    }
                    TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = (TransportRouteAnalytics$FlowOrigin) obj2;
                    if (transportRouteAnalytics$FlowOrigin == null) {
                        transportRouteAnalytics$FlowOrigin = TransportRouteAnalytics$FlowOrigin.Deeplink;
                    }
                    ((pep0) oep0Var).f(((ae40) this.b.get()).a(transportRouteAnalytics$FlowOrigin).a(), new hh40(y010Var.c(), y010Var.a(), new pj40(y010Var.e(), y010Var.d()), TransportRouteAnalytics$ScheduleEntryPointSource.Deeplink), hxx.a);
                }
                return zy11.a;
            }
        }
        massTransitScheduleDeeplinkHandler$handleDeeplink$1 = new MassTransitScheduleDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = massTransitScheduleDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = massTransitScheduleDeeplinkHandler$handleDeeplink$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
