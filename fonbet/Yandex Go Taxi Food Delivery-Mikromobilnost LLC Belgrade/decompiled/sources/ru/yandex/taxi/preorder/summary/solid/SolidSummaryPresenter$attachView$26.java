package ru.yandex.taxi.preorder.summary.solid;

import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s6t0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.SolidSummaryPresenter$attachView$26", f = "SolidSummaryPresenter.kt", l = {1119}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryPresenter$attachView$26 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryPresenter$attachView$26(Continuation continuation, l lVar) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SolidSummaryPresenter$attachView$26(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SolidSummaryPresenter$attachView$26) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = new h(new f(new mth(((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.x).j.b(), 4)));
            l lVar = this.this$0;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(hVar, new SolidSummaryPresenter$attachView$26$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            s6t0 s6t0Var = new s6t0(lVar, 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(s6t0Var, this) == coroutineSingletons) {
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
