package ru.yandex.taxi.settings.main;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z500;
import defpackage.zww0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.main.NativeMenuPresenter$attachView$1", f = "NativeMenuPresenter.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NativeMenuPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ z500 $mvpView;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMenuPresenter$attachView$1(f fVar, z500 z500Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$mvpView = z500Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NativeMenuPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NativeMenuPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zww0 zww0Var = this.this$0.b0;
            this.label = 1;
            if (((com.yandex.go.preload.g) zww0Var).a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.Ng(this.$mvpView);
        return zy11.a;
    }
}
