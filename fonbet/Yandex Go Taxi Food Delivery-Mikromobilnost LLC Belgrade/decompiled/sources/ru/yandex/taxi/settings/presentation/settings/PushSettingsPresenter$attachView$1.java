package ru.yandex.taxi.settings.presentation.settings;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qtc0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.presentation.settings.PushSettingsPresenter$attachView$1", f = "PushSettingsPresenter.kt", l = {157}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PushSettingsPresenter$attachView$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushSettingsPresenter$attachView$1(Continuation continuation, a aVar) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PushSettingsPresenter$attachView$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PushSettingsPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr b = this.this$0.x.b();
            a aVar = this.this$0;
            o oVar = new o(b, new PushSettingsPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(null, aVar));
            qtc0 qtc0Var = new qtc0(16, aVar);
            this.L$0 = null;
            this.label = 1;
            if (oVar.collect(qtc0Var, this) == coroutineSingletons) {
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
