package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.npj0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c0 implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ npj0 c;

    public c0(kotlinx.coroutines.flow.r0 r0Var, boolean z, npj0 npj0Var) {
        this.a = r0Var;
        this.b = z;
        this.c = npj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1 requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1) {
            requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1 = (RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b0 b0Var = new b0(vprVar, this.b, this.c);
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(b0Var, requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1 = new RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
