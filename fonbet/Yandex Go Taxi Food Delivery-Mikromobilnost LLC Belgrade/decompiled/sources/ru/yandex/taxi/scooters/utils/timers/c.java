package ru.yandex.taxi.scooters.utils.timers;

import defpackage.e3n;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ long b;

    public c(vpr vprVar, long j) {
        this.a = vprVar;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1 scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1) {
            scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1 = (ScootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1) continuation;
            int i2 = scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    long longValue = ((Number) obj).longValue();
                    o430 o430Var = e3n.b;
                    Long l = new Long(e3n.e(kp50.V(longValue, DurationUnit.SECONDS)) + this.b);
                    scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1.L$0 = null;
                    scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1.L$1 = null;
                    scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1.L$2 = null;
                    scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1.L$3 = null;
                    scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1 = new ScootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCountUpTimer$listenTimeFlowMs$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
