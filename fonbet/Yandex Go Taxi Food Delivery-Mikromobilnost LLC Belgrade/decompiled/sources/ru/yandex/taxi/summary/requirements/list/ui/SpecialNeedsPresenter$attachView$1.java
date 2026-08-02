package ru.yandex.taxi.summary.requirements.list.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qit0;
import defpackage.sot0;
import defpackage.tse;
import defpackage.vot0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.ui.SpecialNeedsPresenter$attachView$1", f = "SpecialNeedsPresenter.kt", l = {249}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SpecialNeedsPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ sot0 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ vot0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialNeedsPresenter$attachView$1(vot0 vot0Var, sot0 sot0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vot0Var;
        this.$mvpView = sot0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SpecialNeedsPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SpecialNeedsPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = new b(this.this$0.F.a(), this.this$0);
            sot0 sot0Var = this.$mvpView;
            o oVar = new o(bVar, new SpecialNeedsPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            qit0 qit0Var = new qit0(3, sot0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(qit0Var, this) == coroutineSingletons) {
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
