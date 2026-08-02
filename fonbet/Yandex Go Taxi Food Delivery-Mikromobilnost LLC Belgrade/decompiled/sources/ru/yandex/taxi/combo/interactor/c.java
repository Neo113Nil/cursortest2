package ru.yandex.taxi.combo.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class c implements tpr {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ f b;

    public c(m0 m0Var, f fVar) {
        this.a = m0Var;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TravelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1 travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1;
        int i;
        if (continuation instanceof TravelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1) {
            travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1 = (TravelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1) continuation;
            int i2 = travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1.L$0 = null;
                    travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1.L$1 = null;
                    travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1.L$2 = null;
                    travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1) == coroutineSingletons) {
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
        travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1 = new TravelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1(this, continuation);
        Object obj2 = travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
