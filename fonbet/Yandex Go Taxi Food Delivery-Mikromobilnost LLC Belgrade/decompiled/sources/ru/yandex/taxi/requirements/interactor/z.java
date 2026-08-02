package ru.yandex.taxi.requirements.interactor;

import defpackage.mi31;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class z implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ mi31 b;

    public z(kotlinx.coroutines.flow.n nVar, mi31 mi31Var) {
        this.a = nVar;
        this.b = mi31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementsInteractor$requirementsFlow$$inlined$map$1$1 requirementsInteractor$requirementsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RequirementsInteractor$requirementsFlow$$inlined$map$1$1) {
            requirementsInteractor$requirementsFlow$$inlined$map$1$1 = (RequirementsInteractor$requirementsFlow$$inlined$map$1$1) continuation;
            int i2 = requirementsInteractor$requirementsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsInteractor$requirementsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementsInteractor$requirementsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsInteractor$requirementsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y yVar = new y(vprVar, this.b);
                    requirementsInteractor$requirementsFlow$$inlined$map$1$1.L$0 = null;
                    requirementsInteractor$requirementsFlow$$inlined$map$1$1.L$1 = null;
                    requirementsInteractor$requirementsFlow$$inlined$map$1$1.L$2 = null;
                    requirementsInteractor$requirementsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(yVar, requirementsInteractor$requirementsFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        requirementsInteractor$requirementsFlow$$inlined$map$1$1 = new RequirementsInteractor$requirementsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = requirementsInteractor$requirementsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsInteractor$requirementsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
