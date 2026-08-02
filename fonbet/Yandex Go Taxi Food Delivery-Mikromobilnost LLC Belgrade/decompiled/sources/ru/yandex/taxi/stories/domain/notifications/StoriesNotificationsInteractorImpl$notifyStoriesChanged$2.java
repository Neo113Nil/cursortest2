package ru.yandex.taxi.stories.domain.notifications;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.domain.notifications.StoriesNotificationsInteractorImpl$notifyStoriesChanged$2", f = "StoriesNotificationsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoriesNotificationsInteractorImpl$notifyStoriesChanged$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesNotificationsInteractorImpl$notifyStoriesChanged$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StoriesNotificationsInteractorImpl$notifyStoriesChanged$2 storiesNotificationsInteractorImpl$notifyStoriesChanged$2 = new StoriesNotificationsInteractorImpl$notifyStoriesChanged$2(this.this$0, continuation);
        storiesNotificationsInteractorImpl$notifyStoriesChanged$2.L$0 = obj;
        return storiesNotificationsInteractorImpl$notifyStoriesChanged$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StoriesNotificationsInteractorImpl$notifyStoriesChanged$2 storiesNotificationsInteractorImpl$notifyStoriesChanged$2 = (StoriesNotificationsInteractorImpl$notifyStoriesChanged$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        storiesNotificationsInteractorImpl$notifyStoriesChanged$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        for (Map.Entry entry : aVar.b.entrySet()) {
            tje.N(tseVar, null, null, new StoriesNotificationsInteractorImpl$notifyStoriesChanged$2$1$1((Consumer) entry.getValue(), aVar, (String) entry.getKey(), null), 3);
        }
        return zy11.a;
    }
}
