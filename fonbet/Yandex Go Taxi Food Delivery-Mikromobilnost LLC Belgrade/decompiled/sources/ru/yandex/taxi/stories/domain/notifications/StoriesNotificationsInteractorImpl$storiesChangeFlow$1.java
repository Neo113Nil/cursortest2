package ru.yandex.taxi.stories.domain.notifications;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x5s0;
import defpackage.xlp0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly6f0;", "", "Lru/yandex/taxi/communications/api/dto/Story;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.domain.notifications.StoriesNotificationsInteractorImpl$storiesChangeFlow$1", f = "StoriesNotificationsInteractorImpl.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoriesNotificationsInteractorImpl$storiesChangeFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $screenName;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesNotificationsInteractorImpl$storiesChangeFlow$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$screenName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StoriesNotificationsInteractorImpl$storiesChangeFlow$1 storiesNotificationsInteractorImpl$storiesChangeFlow$1 = new StoriesNotificationsInteractorImpl$storiesChangeFlow$1(this.this$0, this.$screenName, continuation);
        storiesNotificationsInteractorImpl$storiesChangeFlow$1.L$0 = obj;
        return storiesNotificationsInteractorImpl$storiesChangeFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoriesNotificationsInteractorImpl$storiesChangeFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            x5s0 x5s0Var = new x5s0(7, y6f0Var);
            this.this$0.b.put(this.$screenName, x5s0Var);
            xlp0 xlp0Var = new xlp0(15, this.this$0, this.$screenName, x5s0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, xlp0Var, this) == coroutineSingletons) {
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
