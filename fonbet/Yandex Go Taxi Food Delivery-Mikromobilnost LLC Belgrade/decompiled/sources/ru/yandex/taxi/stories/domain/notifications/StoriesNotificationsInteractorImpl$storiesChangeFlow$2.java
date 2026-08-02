package ru.yandex.taxi.stories.domain.notifications;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lru/yandex/taxi/communications/api/dto/Story;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.domain.notifications.StoriesNotificationsInteractorImpl$storiesChangeFlow$2", f = "StoriesNotificationsInteractorImpl.kt", l = {39, 39}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoriesNotificationsInteractorImpl$storiesChangeFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $screenName;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesNotificationsInteractorImpl$storiesChangeFlow$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$screenName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StoriesNotificationsInteractorImpl$storiesChangeFlow$2 storiesNotificationsInteractorImpl$storiesChangeFlow$2 = new StoriesNotificationsInteractorImpl$storiesChangeFlow$2(this.this$0, this.$screenName, continuation);
        storiesNotificationsInteractorImpl$storiesChangeFlow$2.L$0 = obj;
        return storiesNotificationsInteractorImpl$storiesChangeFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoriesNotificationsInteractorImpl$storiesChangeFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r7 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ru.yandex.taxi.stories.domain.provider.a aVar = this.this$0.a;
            String str = this.$screenName;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            obj = aVar.b(str, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
