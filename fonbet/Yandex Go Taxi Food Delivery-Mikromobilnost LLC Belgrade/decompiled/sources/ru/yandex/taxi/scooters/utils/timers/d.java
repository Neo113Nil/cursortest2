package ru.yandex.taxi.scooters.utils.timers;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ long b;

    public d(rol0 rol0Var, long j) {
        this.a = rol0Var;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1 scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1) {
            scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1 = (ScootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1) continuation;
            int i2 = scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1.L$0 = null;
                    scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1.L$1 = null;
                    scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1.L$2 = null;
                    scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1 = new ScootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
