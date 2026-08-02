package ru.yandex.taxi.preorder.summary.selector.ui.interactor;

import defpackage.ik31;
import defpackage.ny61;
import defpackage.qlq0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SelectorInteractor$selectorFlow$$inlined$map$2$2$1 selectorInteractor$selectorFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof SelectorInteractor$selectorFlow$$inlined$map$2$2$1) {
            selectorInteractor$selectorFlow$$inlined$map$2$2$1 = (SelectorInteractor$selectorFlow$$inlined$map$2$2$1) continuation;
            int i2 = selectorInteractor$selectorFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorInteractor$selectorFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = selectorInteractor$selectorFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorInteractor$selectorFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ik31 ik31Var = (ik31) obj;
                    qlq0 qlq0Var = new qlq0(((ru.yandex.taxi.preorder.summary.selector.model.vertical.a) this.b.d.get()).b(ik31Var, true), ik31Var.c);
                    selectorInteractor$selectorFlow$$inlined$map$2$2$1.L$0 = null;
                    selectorInteractor$selectorFlow$$inlined$map$2$2$1.L$1 = null;
                    selectorInteractor$selectorFlow$$inlined$map$2$2$1.L$2 = null;
                    selectorInteractor$selectorFlow$$inlined$map$2$2$1.L$3 = null;
                    selectorInteractor$selectorFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(qlq0Var, selectorInteractor$selectorFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        selectorInteractor$selectorFlow$$inlined$map$2$2$1 = new SelectorInteractor$selectorFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = selectorInteractor$selectorFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorInteractor$selectorFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
