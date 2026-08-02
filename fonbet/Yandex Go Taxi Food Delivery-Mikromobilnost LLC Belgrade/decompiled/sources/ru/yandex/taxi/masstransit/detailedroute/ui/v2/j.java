package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import defpackage.lm30;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class j implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ lm30 b;
    public final /* synthetic */ o c;

    public j(tpr tprVar, lm30 lm30Var, o oVar) {
        this.a = tprVar;
        this.b = lm30Var;
        this.c = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1 mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1) {
            mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1 = (MtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1) continuation;
            int i2 = mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = new i(vprVar, this.b, this.c);
                    mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1.L$0 = null;
                    mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1.L$1 = null;
                    mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1.L$2 = null;
                    mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(iVar, mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1 = new MtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailedRouteUiStateInteractor$paymentButtonContainerFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
