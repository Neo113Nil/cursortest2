package com.braze.ui.inappmessage.utils;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.plaid.internal.EnumC0170g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2", f = "BackgroundInAppMessagePreparer.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ IInAppMessage $inAppMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(IInAppMessage iInAppMessage, Continuation<? super BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2> continuation) {
        super(2, continuation);
        this.$inAppMessage = iInAppMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0() {
        return "Displaying in-app message.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(this.$inAppMessage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) BackgroundInAppMessagePreparer.INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(i2), 7, (Object) null);
            BrazeInAppMessageManager companion = BrazeInAppMessageManager.INSTANCE.getInstance();
            IInAppMessage iInAppMessage = this.$inAppMessage;
            this.label = 1;
            if (companion.displayInAppMessage(iInAppMessage, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
