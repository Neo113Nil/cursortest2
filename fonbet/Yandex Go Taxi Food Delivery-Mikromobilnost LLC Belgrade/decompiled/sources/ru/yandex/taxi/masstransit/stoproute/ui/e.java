package ru.yandex.taxi.masstransit.stoproute.ui;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.x3l0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public e(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1 mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof MtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1) {
            mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1 = (MtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    x3l0 x3l0Var = (x3l0) obj;
                    if (x3l0Var == null) {
                        this.b.e(null);
                        x3l0Var = null;
                    }
                    if (x3l0Var != null) {
                        mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.L$0 = null;
                        mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.L$1 = null;
                        mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.L$2 = null;
                        mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.L$3 = null;
                        mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.L$4 = null;
                        mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(x3l0Var, mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1 = new MtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopRouteUiStateInteractor$initializeData$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
