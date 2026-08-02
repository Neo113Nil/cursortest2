package ru.yandex.taxi.summary.solid;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qd6;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4$1$1", f = "SolidSummaryCommunicationsDelegatePresenter.kt", l = {279}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ qd6 $this_apply;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4$1$1(qd6 qd6Var, Continuation continuation) {
        super(2, continuation);
        this.$this_apply = qd6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4$1$1(this.$this_apply, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.$this_apply.i;
            this.label = 1;
            if (kotlinx.coroutines.a.j(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$this_apply.h.invoke();
        return zy11.a;
    }
}
