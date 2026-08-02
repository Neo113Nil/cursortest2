package ru.yandex.taxi.summary.solid.repository;

import defpackage.akt0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes6.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ f b;

    public c(tpr[] tprVarArr, f fVar) {
        this.a = tprVarArr;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1 summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1) {
            summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1 = (SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1) continuation;
            int i2 = summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    akt0 akt0Var = new akt0(tprVarArr, 1);
                    SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3 summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3 = new SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3(null, this.b);
                    summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1.L$0 = null;
                    summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1.L$1 = null;
                    summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1.L$2 = null;
                    summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, akt0Var, summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3, summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1 = new SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
