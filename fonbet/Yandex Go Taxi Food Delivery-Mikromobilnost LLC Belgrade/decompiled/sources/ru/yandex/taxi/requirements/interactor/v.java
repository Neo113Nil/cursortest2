package ru.yandex.taxi.requirements.interactor;

import defpackage.jmw0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class v implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ x b;
    public final /* synthetic */ jmw0 c;

    public v(vpr vprVar, x xVar, jmw0 jmw0Var) {
        this.a = vprVar;
        this.b = xVar;
        this.c = jmw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1 requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RequirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1) {
            requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1 = (RequirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1) continuation;
            int i2 = requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(!this.b.c(this.c).isEmpty());
                    requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1.L$0 = null;
                    requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1.L$1 = null;
                    requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1.L$2 = null;
                    requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1.L$3 = null;
                    requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1 = new RequirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
