package ru.yandex.taxi.requirements.interactor;

import defpackage.jmw0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class w implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ x b;
    public final /* synthetic */ jmw0 c;

    public w(kotlinx.coroutines.flow.n nVar, x xVar, jmw0 jmw0Var) {
        this.a = nVar;
        this.b = xVar;
        this.c = jmw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1 requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RequirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1) {
            requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1 = (RequirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1) continuation;
            int i2 = requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    v vVar = new v(vprVar, this.b, this.c);
                    requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1.L$0 = null;
                    requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1.L$1 = null;
                    requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1.L$2 = null;
                    requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(vVar, requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1 = new RequirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementOptionSelectedInteractor$hasSelectedOptionsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
