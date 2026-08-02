package ru.yandex.taxi.multiorder;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;

    public d(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MultiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1 multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MultiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1) {
            multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1 = (MultiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1) continuation;
            int i2 = multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1.L$0 = null;
                    multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1.L$1 = null;
                    multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1.L$2 = null;
                    multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1 = new MultiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiOrderCountInteractorImpl$countWithoutCurrentOrderFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
