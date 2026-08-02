package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.cw70;
import defpackage.f6v;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f6v b;

    public d0(vpr vprVar, f6v f6vVar) {
        this.a = vprVar;
        this.b = f6vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1 requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1) {
            requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1 = (RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1) continuation;
            int i2 = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f6v f6vVar = new f6v(this.b.a, (cw70) obj);
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1.L$0 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1.L$1 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1.L$2 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1.L$3 = null;
                    requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(f6vVar, requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1) == coroutineSingletons) {
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
        requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1 = new RequirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1(this, continuation);
        Object obj22 = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsOrderForOtherStateInteractor$orderForOtherStateFlow$lambda$0$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
