package ru.yandex.taxi.preorder.source;

import defpackage.ab00;
import defpackage.cqe0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ cqe0 b;

    public c(tpr[] tprVarArr, cqe0 cqe0Var) {
        this.a = tprVarArr;
        this.b = cqe0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PreorderDrivingRouteProvider$initFlow$$inlined$combine$1$1 preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof PreorderDrivingRouteProvider$initFlow$$inlined$combine$1$1) {
            preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1 = (PreorderDrivingRouteProvider$initFlow$$inlined$combine$1$1) continuation;
            int i2 = preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 9);
                    PreorderDrivingRouteProvider$initFlow$$inlined$combine$1$3 preorderDrivingRouteProvider$initFlow$$inlined$combine$1$3 = new PreorderDrivingRouteProvider$initFlow$$inlined$combine$1$3(this.b, null);
                    preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1.L$0 = null;
                    preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1.L$1 = null;
                    preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1.L$2 = null;
                    preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, ab00Var, preorderDrivingRouteProvider$initFlow$$inlined$combine$1$3, preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1 = new PreorderDrivingRouteProvider$initFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preorderDrivingRouteProvider$initFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
