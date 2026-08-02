package bo.app;

import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class w2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BrazeUser a;
    public final /* synthetic */ NotificationSubscriptionType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(BrazeUser brazeUser, NotificationSubscriptionType notificationSubscriptionType, Continuation continuation) {
        super(2, continuation);
        this.a = brazeUser;
        this.b = notificationSubscriptionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w2(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w2(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        String jsonKey;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        xgVar = this.a.userCache;
        NotificationSubscriptionType notificationSubscriptionType = this.b;
        synchronized (xgVar) {
            if (notificationSubscriptionType != null) {
                try {
                    jsonKey = notificationSubscriptionType.getJsonKey();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                jsonKey = null;
            }
            xgVar.c("email_subscribe", jsonKey);
        }
        return Unit.INSTANCE;
    }
}
