package ru.yandex.taxi.preorder.summary.solid.sourcedestination;

import defpackage.apv0;
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
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.sourcedestination.SummarySourceDestinationViewHolderDelegate$observeData$7", f = "SummarySourceDestinationViewHolderDelegate.kt", l = {371}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummarySourceDestinationViewHolderDelegate$observeData$7 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ cpv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySourceDestinationViewHolderDelegate$observeData$7(cpv0 cpv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cpv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummarySourceDestinationViewHolderDelegate$observeData$7(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummarySourceDestinationViewHolderDelegate$observeData$7) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr a = this.this$0.g.a();
            cpv0 cpv0Var = this.this$0;
            o oVar = new o(a, new SummarySourceDestinationViewHolderDelegate$observeData$7$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            apv0 apv0Var = new apv0(cpv0Var, 4);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(apv0Var, this) == coroutineSingletons) {
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
