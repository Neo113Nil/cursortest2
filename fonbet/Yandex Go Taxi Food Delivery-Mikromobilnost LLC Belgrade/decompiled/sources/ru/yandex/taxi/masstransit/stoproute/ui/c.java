package ru.yandex.taxi.masstransit.stoproute.ui;

import defpackage.k110;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1 mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1;
        int i;
        Map f;
        if (continuation instanceof MtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1) {
            mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1 = (MtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1) continuation;
            int i2 = mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    k110 k110Var = (k110) obj;
                    if (k110Var == null || (f = k110Var.b()) == null) {
                        f = kotlin.collections.b.f();
                    }
                    mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1.L$0 = null;
                    mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1.L$1 = null;
                    mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1.L$2 = null;
                    mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1.L$3 = null;
                    mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(f, mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1 = new MtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1(this, continuation);
        Object obj22 = mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopRouteUiStateInteractor$initializeData$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
