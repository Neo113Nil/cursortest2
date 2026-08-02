package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.ny61;
import defpackage.ooe;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s b;

    public o(vpr vprVar, s sVar) {
        this.a = vprVar;
        this.b = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CopterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1 copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1;
        int i;
        if (continuation instanceof CopterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1) {
            copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1 = (CopterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1) continuation;
            int i2 = copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = (pex0) obj;
                    ((ooe) this.b.b).getClass();
                    if ((pex0Var != null ? pex0Var.u0 : null) == TariffOrderFlow.COPTER_CITY_TOUR_FLOW) {
                        copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1.L$0 = null;
                        copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1.L$1 = null;
                        copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1.L$2 = null;
                        copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1.L$3 = null;
                        copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1.label = 1;
                        if (this.a.emit(obj, copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1) == coroutineSingletons) {
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
        copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1 = new CopterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1(this, continuation);
        Object obj22 = copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = copterCityTourDestinationInteractor$handleCityTourSelection$$inlined$filter$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
