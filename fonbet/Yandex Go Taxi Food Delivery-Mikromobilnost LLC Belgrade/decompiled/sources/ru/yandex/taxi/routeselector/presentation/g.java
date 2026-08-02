package ru.yandex.taxi.routeselector.presentation;

import defpackage.ab00;
import defpackage.e1c0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class g implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ l b;
    public final /* synthetic */ e1c0 c;

    public g(tpr[] tprVarArr, l lVar, e1c0 e1c0Var) {
        this.a = tprVarArr;
        this.b = lVar;
        this.c = e1c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1 routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1) {
            routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1 = (RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1) continuation;
            int i2 = routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 16);
                    RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3 routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3 = new RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3(null, this.b, this.c);
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1.L$0 = null;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1.L$1 = null;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1.L$2 = null;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, ab00Var, routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3, routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1 = new RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
