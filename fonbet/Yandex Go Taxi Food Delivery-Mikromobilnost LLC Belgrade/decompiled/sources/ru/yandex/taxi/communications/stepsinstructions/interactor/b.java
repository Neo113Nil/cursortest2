package ru.yandex.taxi.communications.stepsinstructions.interactor;

import defpackage.jbu0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ jbu0 b;
    public final /* synthetic */ c c;

    public b(tpr tprVar, jbu0 jbu0Var, c cVar) {
        this.a = tprVar;
        this.b = jbu0Var;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        StepsInstructionsInteractor$stateFlow$$inlined$map$1$1 stepsInstructionsInteractor$stateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof StepsInstructionsInteractor$stateFlow$$inlined$map$1$1) {
            stepsInstructionsInteractor$stateFlow$$inlined$map$1$1 = (StepsInstructionsInteractor$stateFlow$$inlined$map$1$1) continuation;
            int i2 = stepsInstructionsInteractor$stateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stepsInstructionsInteractor$stateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stepsInstructionsInteractor$stateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stepsInstructionsInteractor$stateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$1.L$0 = null;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$1.L$1 = null;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$1.L$2 = null;
                    stepsInstructionsInteractor$stateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, stepsInstructionsInteractor$stateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        stepsInstructionsInteractor$stateFlow$$inlined$map$1$1 = new StepsInstructionsInteractor$stateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = stepsInstructionsInteractor$stateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stepsInstructionsInteractor$stateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
