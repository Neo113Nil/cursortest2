package com.braze.push;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.braze.push.NotificationTrampolineActivity$onResume$7", f = "NotificationTrampolineActivity.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class NotificationTrampolineActivity$onResume$7 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NotificationTrampolineActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationTrampolineActivity$onResume$7(NotificationTrampolineActivity notificationTrampolineActivity, Continuation<? super NotificationTrampolineActivity$onResume$7> continuation) {
        super(1, continuation);
        this.this$0 = notificationTrampolineActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0() {
        return "Delay complete. Finishing Notification trampoline activity now";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NotificationTrampolineActivity$onResume$7(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((NotificationTrampolineActivity$onResume$7) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.this$0, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(1), 6, (Object) null);
        this.this$0.finish();
        return Unit.INSTANCE;
    }
}
