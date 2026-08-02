package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.ye11;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.SummaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$$inlined$flatMapLatest$1", f = "SummaryFinalSuggestRepeatRequestInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class SummaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$$inlined$flatMapLatest$1(Continuation continuation, c0 c0Var) {
        super(3, continuation);
        this.this$0 = c0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SummaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$$inlined$flatMapLatest$1 summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$$inlined$flatMapLatest$1 = new SummaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return summaryFinalSuggestRepeatRequestInteractor$tariffSuggestModeChangeFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = ((ye11) obj2).a;
            b0 b0Var = new b0(kotlinx.coroutines.flow.e.K(c0.b(this.this$0, str), c0.a(this.this$0, str)));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(b0Var, vprVar, this) == coroutineSingletons) {
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
