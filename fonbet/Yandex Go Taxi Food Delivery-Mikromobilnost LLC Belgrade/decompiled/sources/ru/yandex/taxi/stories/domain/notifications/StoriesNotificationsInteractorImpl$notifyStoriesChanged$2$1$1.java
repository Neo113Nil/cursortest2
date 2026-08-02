package ru.yandex.taxi.stories.domain.notifications;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.api.dto.Story;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.domain.notifications.StoriesNotificationsInteractorImpl$notifyStoriesChanged$2$1$1", f = "StoriesNotificationsInteractorImpl.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoriesNotificationsInteractorImpl$notifyStoriesChanged$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Consumer<List<Story>> $listener;
    final /* synthetic */ String $screenName;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesNotificationsInteractorImpl$notifyStoriesChanged$2$1$1(Consumer consumer, a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$listener = consumer;
        this.this$0 = aVar;
        this.$screenName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoriesNotificationsInteractorImpl$notifyStoriesChanged$2$1$1(this.$listener, this.this$0, this.$screenName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoriesNotificationsInteractorImpl$notifyStoriesChanged$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Consumer consumer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Consumer<List<Story>> consumer2 = this.$listener;
            ru.yandex.taxi.stories.domain.provider.a aVar = this.this$0.a;
            String str = this.$screenName;
            this.L$0 = consumer2;
            this.label = 1;
            Object b = aVar.b(str, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = b;
            consumer = consumer2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            consumer = (Consumer) this.L$0;
            b.b(obj);
        }
        consumer.accept(obj);
        return zy11.a;
    }
}
