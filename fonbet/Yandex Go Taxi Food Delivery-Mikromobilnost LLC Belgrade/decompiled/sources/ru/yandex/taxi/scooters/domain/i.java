package ru.yandex.taxi.scooters.domain;

import defpackage.amn0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wno0;
import defpackage.yno0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;

    public i(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1 scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1;
        int i;
        amn0 amn0Var;
        wno0 wno0Var;
        if (continuation instanceof ScootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1) {
            scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1 = (ScootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1) continuation;
            int i2 = scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    yno0 yno0Var = (yno0) obj;
                    if (yno0Var == null || (wno0Var = yno0Var.a) == null) {
                        amn0Var = null;
                    } else {
                        String str = wno0Var.d;
                        amn0Var = new amn0(str == null ? null : str, wno0Var.b.toString(), String.valueOf(wno0Var.c), yno0Var, wno0Var.a);
                    }
                    scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1.L$0 = null;
                    scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1.L$1 = null;
                    scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1.L$2 = null;
                    scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1.L$3 = null;
                    scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(amn0Var, scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1 = new ScootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFinishCardPromoPlateInteractor$listenScootersFinishCardPromoPlate$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
