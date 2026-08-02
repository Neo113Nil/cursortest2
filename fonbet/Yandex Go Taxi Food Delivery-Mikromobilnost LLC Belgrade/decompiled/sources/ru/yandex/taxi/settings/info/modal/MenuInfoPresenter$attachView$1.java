package ru.yandex.taxi.settings.info.modal;

import defpackage.bl10;
import defpackage.cl10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v41;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.info.modal.MenuInfoPresenter$attachView$1", f = "MenuInfoPresenter.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MenuInfoPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ bl10 $mvpView;
    int label;
    final /* synthetic */ cl10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuInfoPresenter$attachView$1(cl10 cl10Var, bl10 bl10Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cl10Var;
        this.$mvpView = bl10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MenuInfoPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MenuInfoPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            m0 a = this.this$0.z.a();
            v41 v41Var = new v41(8, this.$mvpView);
            this.label = 1;
            if (a.collect(v41Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
