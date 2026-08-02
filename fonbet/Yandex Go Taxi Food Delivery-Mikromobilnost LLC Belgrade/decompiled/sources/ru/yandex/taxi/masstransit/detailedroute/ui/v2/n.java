package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import defpackage.ny61;
import defpackage.rw30;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class n implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ rw30 b;

    public n(r0 r0Var, rw30 rw30Var) {
        this.a = r0Var;
        this.b = rw30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1 mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1) {
            mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1 = (MtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1) continuation;
            int i2 = mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar, this.b);
                    mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1.L$0 = null;
                    mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1.L$1 = null;
                    mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1.L$2 = null;
                    mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(mVar, mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1 = new MtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailedRouteUiStateInteractor$updateLocalState$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
