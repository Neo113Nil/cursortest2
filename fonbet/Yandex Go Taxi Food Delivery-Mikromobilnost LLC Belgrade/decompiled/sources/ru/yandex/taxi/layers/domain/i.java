package ru.yandex.taxi.layers.domain;

import defpackage.ny61;
import defpackage.o35;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class i implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ o35 b;

    public i(tpr tprVar, o35 o35Var) {
        this.a = tprVar;
        this.b = o35Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BaseLayersInteractor$listenToStateChanges$$inlined$filter$1$1 baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1;
        int i;
        if (continuation instanceof BaseLayersInteractor$listenToStateChanges$$inlined$filter$1$1) {
            baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1 = (BaseLayersInteractor$listenToStateChanges$$inlined$filter$1$1) continuation;
            int i2 = baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b);
                    baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1.L$0 = null;
                    baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1.L$1 = null;
                    baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1.L$2 = null;
                    baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(hVar, baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1) == coroutineSingletons) {
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
        baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1 = new BaseLayersInteractor$listenToStateChanges$$inlined$filter$1$1(this, continuation);
        Object obj2 = baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseLayersInteractor$listenToStateChanges$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
