package ru.yandex.taxi.summary.solid;

import defpackage.ab00;
import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ gci0 b;
    public final /* synthetic */ p c;

    public k(tpr[] tprVarArr, gci0 gci0Var, p pVar) {
        this.a = tprVarArr;
        this.b = gci0Var;
        this.c = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1 solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1;
        int i;
        if (continuation instanceof SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1) {
            solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1 = (SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1) continuation;
            int i2 = solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 26);
                    SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3 solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3 = new SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3(null, this.b, this.c);
                    solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1.L$0 = null;
                    solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1.L$1 = null;
                    solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1.L$2 = null;
                    solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, ab00Var, solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3, solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1 = new SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1(this, continuation);
        Object obj2 = solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
