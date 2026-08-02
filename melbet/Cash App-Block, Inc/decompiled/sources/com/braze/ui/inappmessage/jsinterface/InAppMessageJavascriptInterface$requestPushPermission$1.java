package com.braze.ui.inappmessage.jsinterface;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1", f = "InAppMessageJavascriptInterface.kt", l = {52}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class InAppMessageJavascriptInterface$requestPushPermission$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InAppMessageJavascriptInterface this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1", f = "InAppMessageJavascriptInterface.kt", l = {55}, m = "invokeSuspend", v = 1)
    /* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Waiting for IAM to be fully closed before requesting push prompt";
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new InAppMessageJavascriptInterface$requestPushPermission$1$$ExternalSyntheticLambda0(i2), 6, (Object) null);
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            while (BrazeInAppMessageManager.INSTANCE.getInstance().isCurrentlyDisplayingInAppMessage()) {
                this.L$0 = null;
                this.label = 1;
                if (JobKt.delay(25L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageJavascriptInterface$requestPushPermission$1(InAppMessageJavascriptInterface inAppMessageJavascriptInterface, Continuation<? super InAppMessageJavascriptInterface$requestPushPermission$1> continuation) {
        super(1, continuation);
        this.this$0 = inAppMessageJavascriptInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0() {
        return "Requesting push prompt from Braze bridge html interface";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InAppMessageJavascriptInterface$requestPushPermission$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((InAppMessageJavascriptInterface$requestPushPermission$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (this.this$0.getWasCloseMessageCalled()) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (JobKt.withTimeout(2500L, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.this$0, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new InAppMessageJavascriptInterface$requestPushPermission$1$$ExternalSyntheticLambda0(0), 6, (Object) null);
        PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.INSTANCE.getInstance().getActivity());
        return Unit.INSTANCE;
    }
}
