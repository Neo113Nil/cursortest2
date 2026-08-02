package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import defpackage.lm30;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class l implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ lm30 b;

    public l(kotlinx.coroutines.flow.internal.g gVar, lm30 lm30Var) {
        this.a = gVar;
        this.b = lm30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1 mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof MtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1) {
            mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1 = (MtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1) continuation;
            int i2 = mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar, this.b);
                    mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1.L$0 = null;
                    mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1.L$1 = null;
                    mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1.L$2 = null;
                    mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(kVar, mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1 = new MtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
