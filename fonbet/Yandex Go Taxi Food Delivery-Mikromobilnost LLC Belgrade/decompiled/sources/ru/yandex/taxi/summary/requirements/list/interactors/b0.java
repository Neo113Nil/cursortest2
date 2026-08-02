package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.avj0;
import defpackage.cw70;
import defpackage.kyh0;
import defpackage.npj0;
import defpackage.ny61;
import defpackage.pv70;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ npj0 c;

    public b0(vpr vprVar, boolean z, npj0 npj0Var) {
        this.a = vprVar;
        this.b = z;
        this.c = npj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1 requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        cw70 cw70Var;
        if (continuation instanceof RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1) {
            requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1 = (RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1.label;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pv70 pv70Var = (pv70) obj;
                    npj0 npj0Var = this.c;
                    boolean z = this.b;
                    if (z && pv70Var != null) {
                        cw70Var = new cw70(((avj0) npj0Var.c).h(kyh0.order_for_other_requirement_label), pv70Var.a());
                    } else if (z) {
                        cw70Var = new cw70(((avj0) npj0Var.c).h(kyh0.order_for_other_requirement_label), 2);
                    } else {
                        cw70Var = new cw70(str, 3);
                    }
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(cw70Var, requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1 = new RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$2$1.label;
        String str2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
