package ru.yandex.taxi.communications.stepsinstructions.presenter;

import android.graphics.drawable.Drawable;
import defpackage.kbu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.stepsinstructions.presenter.StepsInstructionModalPresenter$attachView$2", f = "StepsInstructionModalPresenter.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class StepsInstructionModalPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ kbu0 $mvpView;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepsInstructionModalPresenter$attachView$2(a aVar, kbu0 kbu0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$mvpView = kbu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StepsInstructionModalPresenter$attachView$2(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StepsInstructionModalPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ru.yandex.taxi.design.utils.b bVar = this.this$0.C;
            this.label = 1;
            obj = bVar.g(24, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.$mvpView.d((Drawable) obj);
        return zy11.a;
    }
}
