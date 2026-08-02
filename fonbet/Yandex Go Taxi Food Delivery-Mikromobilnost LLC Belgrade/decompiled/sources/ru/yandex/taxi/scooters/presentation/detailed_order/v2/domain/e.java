package ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes6.dex */
public final class e implements tpr {
    public final /* synthetic */ m0 a;

    public e(m0 m0Var) {
        this.a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1 scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1) {
            scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1 = (ScootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1) continuation;
            int i2 = scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar);
                    scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1.L$0 = null;
                    scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1.L$1 = null;
                    scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1.L$2 = null;
                    scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1 = new ScootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOrderPromoPlateInteractor$listenOrderPromoPlate$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
