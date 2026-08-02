package ru.yandex.taxi.summary.solid.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.x8;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s b;

    public q(vpr vprVar, s sVar) {
        this.a = vprVar;
        this.b = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1 requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RequirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1) {
            requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1 = (RequirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1) continuation;
            int i2 = requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = ((x8) this.b.c).d;
                    requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1.L$0 = null;
                    requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1.L$1 = null;
                    requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1.L$2 = null;
                    requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1.L$3 = null;
                    requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1 = new RequirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsBadgeInteractor$requirementsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
