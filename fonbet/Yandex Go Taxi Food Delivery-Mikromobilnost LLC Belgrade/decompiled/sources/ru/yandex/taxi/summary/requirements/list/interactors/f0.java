package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.f6v;
import defpackage.mi31;
import defpackage.npj0;
import defpackage.ny61;
import defpackage.vfx0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class f0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ npj0 b;

    public f0(vpr vprVar, npj0 npj0Var) {
        this.a = vprVar;
        this.b = npj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1 requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RequirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1) {
            requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1 = (RequirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1) continuation;
            int i2 = requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(!r6.a.A);
                    this.b.e.getClass();
                    f6v b = ru.yandex.taxi.requirements.utils.c.b(valueOf, vfx0.a((mi31) obj));
                    requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1.L$0 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1.L$1 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1.L$2 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1.L$3 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b, requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1 = new RequirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsOrderForOtherStateInteractor$orderForOtherVisibleFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
