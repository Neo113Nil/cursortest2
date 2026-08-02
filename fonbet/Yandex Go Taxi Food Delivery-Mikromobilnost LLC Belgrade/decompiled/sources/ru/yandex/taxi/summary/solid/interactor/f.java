package ru.yandex.taxi.summary.solid.interactor;

import com.yandex.go.taxi.summary.shared.models.SmallSummaryConfigExperiment;
import defpackage.an8;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ an8 b;

    public f(vpr vprVar, an8 an8Var) {
        this.a = vprVar;
        this.b = an8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CommunicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1 communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CommunicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1) {
            communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1 = (CommunicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1) continuation;
            int i2 = communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SmallSummaryConfigExperiment smallSummaryConfigExperiment = (SmallSummaryConfigExperiment) obj;
                    CommunicationsPriorityInteractor$DataPriorityType communicationsPriorityInteractor$DataPriorityType = !smallSummaryConfigExperiment.b ? CommunicationsPriorityInteractor$DataPriorityType.HIDE_NOTIFICATION : smallSummaryConfigExperiment.c < ((Number) ((i3y) this.b.b).getValue()).floatValue() ? CommunicationsPriorityInteractor$DataPriorityType.ALL : smallSummaryConfigExperiment.d ? CommunicationsPriorityInteractor$DataPriorityType.HIDE_BUBBLES : CommunicationsPriorityInteractor$DataPriorityType.HIDE_NOTIFICATION;
                    communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1.L$0 = null;
                    communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1.L$1 = null;
                    communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1.L$2 = null;
                    communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1.L$3 = null;
                    communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(communicationsPriorityInteractor$DataPriorityType, communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1 = new CommunicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = communicationsPriorityInteractor$dataPriorityFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
