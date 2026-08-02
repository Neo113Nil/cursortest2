package com.braze.ui.inappmessage.utils;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
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
@DebugMetadata(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1", f = "BackgroundInAppMessagePreparer.kt", l = {42}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ IInAppMessage $inAppMessageToPrepare;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(IInAppMessage iInAppMessage, Continuation<? super BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1> continuation) {
        super(2, continuation);
        this.$inAppMessageToPrepare = iInAppMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0() {
        return "Cannot display the in-app message because the in-app message was null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$1() {
        return "Caught error while preparing in app message in background";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 = new BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(this.$inAppMessageToPrepare, continuation);
        backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.L$0 = obj;
        return backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IInAppMessage prepareInAppMessage;
        Object displayPreparedInAppMessage;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = BackgroundInAppMessagePreparer.INSTANCE;
                prepareInAppMessage = backgroundInAppMessagePreparer.prepareInAppMessage(this.$inAppMessageToPrepare);
                if (prepareInAppMessage == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(2), 6, (Object) null);
                } else {
                    this.L$0 = coroutineScope;
                    this.L$1 = null;
                    this.label = 1;
                    displayPreparedInAppMessage = backgroundInAppMessagePreparer.displayPreparedInAppMessage(prepareInAppMessage, this);
                    if (displayPreparedInAppMessage == coroutineSingletons) {
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
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(3), 4, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
