package ru.yandex.taxi.preorder.summary.solid.sourcedestination;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.bpv0;
import defpackage.cpv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.sourcedestination.SummarySourceDestinationViewHolderDelegate$observeData$3", f = "SummarySourceDestinationViewHolderDelegate.kt", l = {376}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummarySourceDestinationViewHolderDelegate$observeData$3 extends SuspendLambda implements wls {
    final /* synthetic */ b $viewHolder;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ cpv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySourceDestinationViewHolderDelegate$observeData$3(cpv0 cpv0Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cpv0Var;
        this.$viewHolder = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummarySourceDestinationViewHolderDelegate$observeData$3(this.this$0, this.$viewHolder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummarySourceDestinationViewHolderDelegate$observeData$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            cpv0 cpv0Var = this.this$0;
            tpr d = ((ru.yandex.taxi.styling.f) cpv0Var.c).d(new f(((k) cpv0Var.i).j.b()));
            b bVar = this.$viewHolder;
            o oVar = new o(d, new SummarySourceDestinationViewHolderDelegate$observeData$3$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            bpv0 bpv0Var = new bpv0(bVar, 0);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(bpv0Var, this) == coroutineSingletons) {
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
