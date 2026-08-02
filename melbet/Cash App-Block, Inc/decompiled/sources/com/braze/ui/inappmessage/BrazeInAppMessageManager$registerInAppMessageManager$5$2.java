package com.braze.ui.inappmessage;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.models.inappmessage.IInAppMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager$registerInAppMessageManager$5$2", f = "BrazeInAppMessageManager.kt", l = {256}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class BrazeInAppMessageManager$registerInAppMessageManager$5$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ IInAppMessage $it;
    int label;
    final /* synthetic */ BrazeInAppMessageManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeInAppMessageManager$registerInAppMessageManager$5$2(BrazeInAppMessageManager brazeInAppMessageManager, IInAppMessage iInAppMessage, Continuation<? super BrazeInAppMessageManager$registerInAppMessageManager$5$2> continuation) {
        super(2, continuation);
        this.this$0 = brazeInAppMessageManager;
        this.$it = iInAppMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BrazeInAppMessageManager$registerInAppMessageManager$5$2(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BrazeInAppMessageManager$registerInAppMessageManager$5$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            BrazeInAppMessageManager brazeInAppMessageManager = this.this$0;
            IInAppMessage iInAppMessage = this.$it;
            this.label = 1;
            if (brazeInAppMessageManager.displayInAppMessage(iInAppMessage, true, this) == coroutineSingletons) {
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
