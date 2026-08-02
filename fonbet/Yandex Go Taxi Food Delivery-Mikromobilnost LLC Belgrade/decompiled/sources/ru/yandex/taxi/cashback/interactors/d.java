package ru.yandex.taxi.cashback.interactors;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;

    public d(r0 r0Var) {
        this.a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PlusModeInteractor$getPlusMode$$inlined$map$2$1 plusModeInteractor$getPlusMode$$inlined$map$2$1;
        int i;
        if (continuation instanceof PlusModeInteractor$getPlusMode$$inlined$map$2$1) {
            plusModeInteractor$getPlusMode$$inlined$map$2$1 = (PlusModeInteractor$getPlusMode$$inlined$map$2$1) continuation;
            int i2 = plusModeInteractor$getPlusMode$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusModeInteractor$getPlusMode$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusModeInteractor$getPlusMode$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusModeInteractor$getPlusMode$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    plusModeInteractor$getPlusMode$$inlined$map$2$1.L$0 = null;
                    plusModeInteractor$getPlusMode$$inlined$map$2$1.L$1 = null;
                    plusModeInteractor$getPlusMode$$inlined$map$2$1.L$2 = null;
                    plusModeInteractor$getPlusMode$$inlined$map$2$1.label = 1;
                    if (this.a.collect(cVar, plusModeInteractor$getPlusMode$$inlined$map$2$1) == coroutineSingletons) {
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
        plusModeInteractor$getPlusMode$$inlined$map$2$1 = new PlusModeInteractor$getPlusMode$$inlined$map$2$1(this, continuation);
        Object obj2 = plusModeInteractor$getPlusMode$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusModeInteractor$getPlusMode$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
