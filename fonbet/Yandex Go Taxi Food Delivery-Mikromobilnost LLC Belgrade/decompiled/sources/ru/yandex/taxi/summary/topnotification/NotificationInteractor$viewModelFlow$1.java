package ru.yandex.taxi.summary.topnotification;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk60;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n"}, d2 = {"Lpk60;", "T", "notification", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.topnotification.NotificationInteractor$viewModelFlow$1", f = "NotificationInteractor.kt", l = {20}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NotificationInteractor$viewModelFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationInteractor$viewModelFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NotificationInteractor$viewModelFlow$1 notificationInteractor$viewModelFlow$1 = new NotificationInteractor$viewModelFlow$1(this.this$0, continuation);
        notificationInteractor$viewModelFlow$1.L$0 = obj;
        return notificationInteractor$viewModelFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationInteractor$viewModelFlow$1) create((pk60) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pk60 pk60Var = (pk60) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a a = this.this$0.a();
            this.L$0 = null;
            this.label = 1;
            if (a.g(pk60Var, this) == coroutineSingletons) {
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
