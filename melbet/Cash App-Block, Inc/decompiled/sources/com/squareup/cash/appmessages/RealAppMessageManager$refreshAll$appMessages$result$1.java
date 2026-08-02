package com.squareup.cash.appmessages;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessagesRequest;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessagesV2Request;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealAppMessageManager$refreshAll$appMessages$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealAppMessageManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealAppMessageManager$refreshAll$appMessages$result$1(RealAppMessageManager realAppMessageManager, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = realAppMessageManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        RealAppMessageManager realAppMessageManager = this.this$0;
        switch (i) {
            case 0:
                return new RealAppMessageManager$refreshAll$appMessages$result$1(realAppMessageManager, continuation, 0);
            default:
                return new RealAppMessageManager$refreshAll$appMessages$result$1(realAppMessageManager, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((RealAppMessageManager$refreshAll$appMessages$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealAppMessageManager realAppMessageManager = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppMessageClientService appMessageClientService = realAppMessageManager.appService;
                GetAppMessagesV2Request getAppMessagesV2Request = new GetAppMessagesV2Request(ByteString.EMPTY);
                this.label = 1;
                Object appMessagesV2 = appMessageClientService.getAppMessagesV2(getAppMessagesV2Request, this);
                return appMessagesV2 == coroutineSingletons ? coroutineSingletons : appMessagesV2;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppMessageClientService appMessageClientService2 = realAppMessageManager.appService;
                GetAppMessagesRequest getAppMessagesRequest = new GetAppMessagesRequest();
                this.label = 1;
                Object appMessages = appMessageClientService2.getAppMessages(getAppMessagesRequest, this);
                return appMessages == coroutineSingletons2 ? coroutineSingletons2 : appMessages;
        }
    }
}
