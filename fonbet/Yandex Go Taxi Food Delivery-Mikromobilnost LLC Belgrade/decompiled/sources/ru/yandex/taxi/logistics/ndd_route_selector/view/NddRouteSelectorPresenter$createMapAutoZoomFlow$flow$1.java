package ru.yandex.taxi.logistics.ndd_route_selector.view;

import defpackage.dms;
import defpackage.mvg;
import defpackage.ndi;
import defpackage.ny61;
import defpackage.uc4;
import defpackage.xi50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Luc4;", "optimalBbox", "", "mapTouched", "walkRouteShow", "Lndi;", "deliveryMapAutozoomExperiment", "Lxi50;", "<anonymous>", "(Luc4;ZZLndi;)Lxi50;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorPresenter$createMapAutoZoomFlow$flow$1", f = "NddRouteSelectorPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NddRouteSelectorPresenter$createMapAutoZoomFlow$flow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        NddRouteSelectorPresenter$createMapAutoZoomFlow$flow$1 nddRouteSelectorPresenter$createMapAutoZoomFlow$flow$1 = new NddRouteSelectorPresenter$createMapAutoZoomFlow$flow$1(5, (Continuation) obj5);
        nddRouteSelectorPresenter$createMapAutoZoomFlow$flow$1.L$0 = (uc4) obj;
        nddRouteSelectorPresenter$createMapAutoZoomFlow$flow$1.Z$0 = booleanValue;
        nddRouteSelectorPresenter$createMapAutoZoomFlow$flow$1.Z$1 = booleanValue2;
        nddRouteSelectorPresenter$createMapAutoZoomFlow$flow$1.L$1 = (ndi) obj4;
        return nddRouteSelectorPresenter$createMapAutoZoomFlow$flow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uc4 uc4Var = (uc4) this.L$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        ndi ndiVar = (ndi) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new xi50(uc4Var, z, z2, ndiVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
