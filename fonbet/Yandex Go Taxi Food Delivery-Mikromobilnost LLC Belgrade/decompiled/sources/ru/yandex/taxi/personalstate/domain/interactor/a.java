package ru.yandex.taxi.personalstate.domain.interactor;

import defpackage.cu;
import defpackage.jl40;
import defpackage.n6b0;
import defpackage.ny61;
import defpackage.o6b0;
import defpackage.p6b0;
import defpackage.q6b0;
import defpackage.s6b0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ActionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1 actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1;
        int i;
        cu cuVar;
        if (continuation instanceof ActionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1) {
            actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1 = (ActionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s6b0 s6b0Var = (s6b0) obj;
                    if (s6b0Var instanceof o6b0) {
                        cuVar = new cu(0);
                    } else if (s6b0Var instanceof p6b0) {
                        cuVar = ((p6b0) s6b0Var).b.g;
                    } else {
                        if (!jl40.l(s6b0Var, n6b0.a) && !(s6b0Var instanceof q6b0)) {
                            w511.b();
                            return null;
                        }
                        cuVar = null;
                    }
                    if (cuVar != null) {
                        actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(cuVar, actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1 = new ActionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = actionPersonalStateInteractorImpl$actionDataFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
