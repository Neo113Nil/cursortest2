package kotlinx.coroutines.channels;

import defpackage.dq0;
import defpackage.dvw;
import defpackage.ioq0;
import defpackage.j18;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.q5z;
import defpackage.sb2;
import defpackage.seu;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes9.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(y6f0 y6f0Var, sls slsVar, Continuation continuation) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        int i;
        try {
            if (continuation instanceof ProduceKt$awaitClose$1) {
                produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) continuation;
                int i2 = produceKt$awaitClose$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    produceKt$awaitClose$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = produceKt$awaitClose$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = produceKt$awaitClose$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (produceKt$awaitClose$1.get_context().get(seu.C) != y6f0Var) {
                            ny61.r("awaitClose() can only be invoked from the producer context");
                            return null;
                        }
                        produceKt$awaitClose$1.L$0 = y6f0Var;
                        produceKt$awaitClose$1.L$1 = slsVar;
                        produceKt$awaitClose$1.I$0 = 0;
                        produceKt$awaitClose$1.label = 1;
                        j18 j18Var = new j18(1, dvw.b(produceKt$awaitClose$1));
                        j18Var.u();
                        ((x6f0) y6f0Var).y.B(new dq0(9, j18Var));
                        if (j18Var.s() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        slsVar = (sls) produceKt$awaitClose$1.L$1;
                        kotlin.b.b(obj);
                    }
                    slsVar.invoke();
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            slsVar.invoke();
            return zy11.a;
        } catch (Throwable th) {
            slsVar.invoke();
            throw th;
        }
        produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuation);
        Object obj2 = produceKt$awaitClose$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = produceKt$awaitClose$1.label;
    }

    public static x6f0 b(tse tseVar, int i, wls wlsVar, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        x6f0 x6f0Var = new x6f0(q5z.M(tseVar, EmptyCoroutineContext.a), sb2.a(i, bufferOverflow, null, 4));
        x6f0Var.m0(coroutineStart, x6f0Var, wlsVar);
        return x6f0Var;
    }

    public static final void c(ioq0 ioq0Var, Object obj) {
        Object d = ioq0Var.d(obj);
        if (d instanceof ni9) {
            Object obj2 = ((oi9) tje.Y(EmptyCoroutineContext.a, new ChannelsKt__ChannelsKt$trySendBlocking$2(ioq0Var, obj, null))).a;
        } else {
            ni9 ni9Var = oi9.b;
        }
    }
}
