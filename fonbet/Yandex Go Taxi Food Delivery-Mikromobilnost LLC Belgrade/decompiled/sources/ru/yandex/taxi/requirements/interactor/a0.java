package ru.yandex.taxi.requirements.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e0 b;

    public a0(vpr vprVar, e0 e0Var) {
        this.a = vprVar;
        this.b = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementsInteractor$requirementsFlow$$inlined$map$2$2$1 requirementsInteractor$requirementsFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof RequirementsInteractor$requirementsFlow$$inlined$map$2$2$1) {
            requirementsInteractor$requirementsFlow$$inlined$map$2$2$1 = (RequirementsInteractor$requirementsFlow$$inlined$map$2$2$1) continuation;
            int i2 = requirementsInteractor$requirementsFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsInteractor$requirementsFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementsInteractor$requirementsFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsInteractor$requirementsFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    List list = this.b.d.a.x;
                    requirementsInteractor$requirementsFlow$$inlined$map$2$2$1.L$0 = null;
                    requirementsInteractor$requirementsFlow$$inlined$map$2$2$1.L$1 = null;
                    requirementsInteractor$requirementsFlow$$inlined$map$2$2$1.L$2 = null;
                    requirementsInteractor$requirementsFlow$$inlined$map$2$2$1.L$3 = null;
                    requirementsInteractor$requirementsFlow$$inlined$map$2$2$1.label = 1;
                    if (vprVar.emit(list, requirementsInteractor$requirementsFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        requirementsInteractor$requirementsFlow$$inlined$map$2$2$1 = new RequirementsInteractor$requirementsFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = requirementsInteractor$requirementsFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsInteractor$requirementsFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
