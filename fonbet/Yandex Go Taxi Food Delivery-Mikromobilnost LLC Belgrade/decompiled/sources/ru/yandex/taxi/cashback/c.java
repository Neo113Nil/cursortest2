package ru.yandex.taxi.cashback;

import defpackage.m49;
import defpackage.n49;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ n49 b;

    public c(tpr[] tprVarArr, n49 n49Var) {
        this.a = tprVarArr;
        this.b = n49Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CashbackTeaserController$onExperimentChanged$$inlined$combine$1$1 cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1;
        int i;
        if (continuation instanceof CashbackTeaserController$onExperimentChanged$$inlined$combine$1$1) {
            cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1 = (CashbackTeaserController$onExperimentChanged$$inlined$combine$1$1) continuation;
            int i2 = cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    m49 m49Var = new m49(tprVarArr, 0);
                    CashbackTeaserController$onExperimentChanged$$inlined$combine$1$3 cashbackTeaserController$onExperimentChanged$$inlined$combine$1$3 = new CashbackTeaserController$onExperimentChanged$$inlined$combine$1$3(null, this.b);
                    cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1.L$0 = null;
                    cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1.L$1 = null;
                    cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1.L$2 = null;
                    cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, m49Var, cashbackTeaserController$onExperimentChanged$$inlined$combine$1$3, cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1 = new CashbackTeaserController$onExperimentChanged$$inlined$combine$1$1(this, continuation);
        Object obj2 = cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackTeaserController$onExperimentChanged$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
