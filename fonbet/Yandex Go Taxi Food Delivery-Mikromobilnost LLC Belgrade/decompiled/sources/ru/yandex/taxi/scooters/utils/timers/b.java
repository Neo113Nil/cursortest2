package ru.yandex.taxi.scooters.utils.timers;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.t;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ t a;
    public final /* synthetic */ long b;

    public b(t tVar, long j) {
        this.a = tVar;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1 scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1) {
            scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1 = (ScootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1) continuation;
            int i2 = scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1.L$0 = null;
                    scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1.L$1 = null;
                    scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1.L$2 = null;
                    scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1 = new ScootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCountDownTimer$listenTimeFlowMs$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
