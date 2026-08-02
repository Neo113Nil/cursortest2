package ru.yandex.taxi.preorder.summary.selector.ui.interactor;

import defpackage.ha2;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e implements tpr {
    public final /* synthetic */ ha2 a;
    public final /* synthetic */ f b;

    public e(ha2 ha2Var, f fVar) {
        this.a = ha2Var;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SelectorInteractor$selectorFlow$$inlined$map$2$1 selectorInteractor$selectorFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof SelectorInteractor$selectorFlow$$inlined$map$2$1) {
            selectorInteractor$selectorFlow$$inlined$map$2$1 = (SelectorInteractor$selectorFlow$$inlined$map$2$1) continuation;
            int i2 = selectorInteractor$selectorFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorInteractor$selectorFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectorInteractor$selectorFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorInteractor$selectorFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    selectorInteractor$selectorFlow$$inlined$map$2$1.L$0 = null;
                    selectorInteractor$selectorFlow$$inlined$map$2$1.L$1 = null;
                    selectorInteractor$selectorFlow$$inlined$map$2$1.L$2 = null;
                    selectorInteractor$selectorFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(dVar, selectorInteractor$selectorFlow$$inlined$map$2$1) == coroutineSingletons) {
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
        selectorInteractor$selectorFlow$$inlined$map$2$1 = new SelectorInteractor$selectorFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = selectorInteractor$selectorFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorInteractor$selectorFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
