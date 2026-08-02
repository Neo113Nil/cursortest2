package ru.yandex.taxi.summary.solid;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.rqv0;
import defpackage.sgx0;
import defpackage.tse;
import defpackage.vqv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.SolidSummaryCommunicationsDelegatePresenter$bubbleClick$2", f = "SolidSummaryCommunicationsDelegatePresenter.kt", l = {198}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryCommunicationsDelegatePresenter$bubbleClick$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryCommunicationsDelegatePresenter$bubbleClick$2(Continuation continuation, p pVar) {
        super(2, continuation);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SolidSummaryCommunicationsDelegatePresenter$bubbleClick$2(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SolidSummaryCommunicationsDelegatePresenter$bubbleClick$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sgx0 sgx0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.j).m();
            if (m != null && (sgx0Var = m.J0) != null) {
                vqv0 vqv0Var = this.this$0.r;
                rqv0 rqv0Var = new rqv0(sgx0Var, SummaryExpandReason.AUTO_REMOVE_ALT_CHOICE_BUBBLE_CLICK, null);
                this.L$0 = null;
                this.label = 1;
                if (vqv0Var.a.emit(rqv0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
