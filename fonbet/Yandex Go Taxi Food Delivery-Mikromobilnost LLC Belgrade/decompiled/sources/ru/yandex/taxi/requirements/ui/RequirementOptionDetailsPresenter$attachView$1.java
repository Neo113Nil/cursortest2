package ru.yandex.taxi.requirements.ui;

import defpackage.gjj0;
import defpackage.hjj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9g0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.ui.RequirementOptionDetailsPresenter$attachView$1", f = "RequirementOptionDetailsPresenter.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementOptionDetailsPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ gjj0 $mvpView;
    int label;
    final /* synthetic */ hjj0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementOptionDetailsPresenter$attachView$1(hjj0 hjj0Var, gjj0 gjj0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hjj0Var;
        this.$mvpView = gjj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementOptionDetailsPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementOptionDetailsPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            hjj0 hjj0Var = this.this$0;
            r0 r0Var = hjj0Var.A;
            p9g0 p9g0Var = new p9g0(1, this.$mvpView, hjj0Var);
            this.label = 1;
            if (r0Var.collect(p9g0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ny61.A();
        return null;
    }
}
