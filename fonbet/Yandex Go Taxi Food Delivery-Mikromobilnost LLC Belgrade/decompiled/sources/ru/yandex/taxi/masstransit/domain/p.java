package ru.yandex.taxi.masstransit.domain;

import defpackage.mq30;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class p implements tpr {
    public final /* synthetic */ n a;
    public final /* synthetic */ mq30 b;

    public p(n nVar, mq30 mq30Var) {
        this.a = nVar;
        this.b = mq30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1 mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1) {
            mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1 = (MtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1) continuation;
            int i2 = mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(vprVar, this.b);
                    mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1.L$0 = null;
                    mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1.L$1 = null;
                    mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1.L$2 = null;
                    mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(oVar, mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1 = new MtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtObjectsOverMapInteractorImpl$transportMapObjectsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
