package ru.yandex.taxi.plus.sdk.counter;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.x1d0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ x1d0 b;

    public b(r0 r0Var, x1d0 x1d0Var) {
        this.a = r0Var;
        this.b = x1d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PlusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1 plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof PlusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1) {
            plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1 = (PlusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1) continuation;
            int i2 = plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1.L$0 = null;
                    plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1.L$1 = null;
                    plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1.L$2 = null;
                    plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1 = new PlusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
