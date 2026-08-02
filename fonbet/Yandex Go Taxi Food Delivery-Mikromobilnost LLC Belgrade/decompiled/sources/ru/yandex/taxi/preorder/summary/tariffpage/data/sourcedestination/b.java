package ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination;

import defpackage.kb5;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ControlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1 controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ControlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1) {
            controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1 = (ControlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1) continuation;
            int i2 = controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mi31 mi31Var = (mi31) obj;
                    pex0 pex0Var = mi31Var.a;
                    kb5 kb5Var = new kb5(mi31Var.b, pex0Var.b, pex0Var.O, pex0Var.u0, pex0Var.K0, 32);
                    controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1.L$0 = null;
                    controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1.L$1 = null;
                    controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1.L$2 = null;
                    controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1.L$3 = null;
                    controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(kb5Var, controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1 = new ControlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = controlStateDelegate$tariffInfoFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
