package ru.yandex.taxi.summary.solid.interactor;

import defpackage.kb5;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ kb5 b;

    public e(kb5 kb5Var, tpr tprVar) {
        this.a = tprVar;
        this.b = kb5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BubblesDataInteractor$bubblesFlow$$inlined$map$1$1 bubblesDataInteractor$bubblesFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof BubblesDataInteractor$bubblesFlow$$inlined$map$1$1) {
            bubblesDataInteractor$bubblesFlow$$inlined$map$1$1 = (BubblesDataInteractor$bubblesFlow$$inlined$map$1$1) continuation;
            int i2 = bubblesDataInteractor$bubblesFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bubblesDataInteractor$bubblesFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bubblesDataInteractor$bubblesFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bubblesDataInteractor$bubblesFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    bubblesDataInteractor$bubblesFlow$$inlined$map$1$1.L$0 = null;
                    bubblesDataInteractor$bubblesFlow$$inlined$map$1$1.L$1 = null;
                    bubblesDataInteractor$bubblesFlow$$inlined$map$1$1.L$2 = null;
                    bubblesDataInteractor$bubblesFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, bubblesDataInteractor$bubblesFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        bubblesDataInteractor$bubblesFlow$$inlined$map$1$1 = new BubblesDataInteractor$bubblesFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = bubblesDataInteractor$bubblesFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bubblesDataInteractor$bubblesFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
