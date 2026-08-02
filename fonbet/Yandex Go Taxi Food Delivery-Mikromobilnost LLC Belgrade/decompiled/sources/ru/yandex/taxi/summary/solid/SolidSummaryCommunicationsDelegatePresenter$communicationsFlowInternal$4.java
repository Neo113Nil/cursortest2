package ru.yandex.taxi.summary.solid;

import defpackage.bsf0;
import defpackage.cvz0;
import defpackage.dvz0;
import defpackage.hbp0;
import defpackage.lev0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qd6;
import defpackage.rd6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llev0;", "communication", "Lzy11;", "<anonymous>", "(Llev0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4", f = "SolidSummaryCommunicationsDelegatePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4(Continuation continuation, p pVar) {
        super(2, continuation);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4 solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4 = new SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4(continuation, this.this$0);
        solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4.L$0 = obj;
        return solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4 solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4 = (SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4) create((lev0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bsf0 bsf0Var;
        lev0 lev0Var = (lev0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pzt0 pzt0Var = this.this$0.t;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        p pVar = this.this$0;
        rd6 rd6Var = lev0Var.c;
        pVar.getClass();
        qd6 qd6Var = rd6Var instanceof qd6 ? (qd6) rd6Var : null;
        if (qd6Var != null) {
            p pVar2 = this.this$0;
            qd6Var.g.invoke();
            pVar2.t = hbp0.e(pVar2.s, null, null, new SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4$1$1(qd6Var, null), 3);
        }
        p pVar3 = this.this$0;
        dvz0 dvz0Var = lev0Var.d;
        pVar3.getClass();
        cvz0 cvz0Var = dvz0Var instanceof cvz0 ? (cvz0) dvz0Var : null;
        if (cvz0Var != null && (bsf0Var = cvz0Var.f) != null) {
            bsf0Var.invoke();
        }
        return zy11.a;
    }
}
