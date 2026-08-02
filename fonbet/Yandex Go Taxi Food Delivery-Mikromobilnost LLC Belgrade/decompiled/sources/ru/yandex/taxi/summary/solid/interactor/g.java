package ru.yandex.taxi.summary.solid.interactor;

import defpackage.an8;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class g implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ an8 b;

    public g(tpr tprVar, an8 an8Var) {
        this.a = tprVar;
        this.b = an8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CommunicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1 communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof CommunicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1) {
            communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1 = (CommunicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1) continuation;
            int i2 = communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b);
                    communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1.L$0 = null;
                    communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1.L$1 = null;
                    communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1.L$2 = null;
                    communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1 = new CommunicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
