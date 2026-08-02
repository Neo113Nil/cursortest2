package com.squareup.cash.blockers.presenters;

import androidx.compose.ui.node.PointerInputModifierNodeKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.InitiatePasscodeResetRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class SetPinPresenter$forgotPasscode$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $resetPasscodeFlowToken;
    public int label;
    public final /* synthetic */ SetPinPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetPinPresenter$forgotPasscode$result$1(SetPinPresenter setPinPresenter, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = setPinPresenter;
        this.$resetPasscodeFlowToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$resetPasscodeFlowToken;
        SetPinPresenter setPinPresenter = this.this$0;
        switch (i) {
            case 0:
                return new SetPinPresenter$forgotPasscode$result$1(setPinPresenter, str, continuation, 0);
            default:
                return new SetPinPresenter$forgotPasscode$result$1(setPinPresenter, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((SetPinPresenter$forgotPasscode$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$resetPasscodeFlowToken;
        SetPinPresenter setPinPresenter = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
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
                Analytics analytics = setPinPresenter.analytics;
                BlockersData blockersData = setPinPresenter.screen.blockersData;
                AndroidStringManager androidStringManager = setPinPresenter.stringManager;
                MoveBitcoinViewKt$$ExternalSyntheticLambda3 moveBitcoinViewKt$$ExternalSyntheticLambda3 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(27);
                SetPinPresenter$forgotPasscode$result$1 setPinPresenter$forgotPasscode$result$1 = new SetPinPresenter$forgotPasscode$result$1(setPinPresenter, str, continuation, i2);
                this.label = 1;
                Object trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData, analytics, androidStringManager, this, moveBitcoinViewKt$$ExternalSyntheticLambda3, setPinPresenter$forgotPasscode$result$1);
                return trackBlockerSubmissionAnalytics$default == coroutineSingletons ? coroutineSingletons : trackBlockerSubmissionAnalytics$default;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService = setPinPresenter.appService;
                ClientScenario clientScenario = ClientScenario.RESET_PASSCODE;
                InitiatePasscodeResetRequest initiatePasscodeResetRequest = new InitiatePasscodeResetRequest();
                this.label = 1;
                Object initiatePasscodeReset = appService.initiatePasscodeReset(clientScenario, str, initiatePasscodeResetRequest, this);
                return initiatePasscodeReset == coroutineSingletons2 ? coroutineSingletons2 : initiatePasscodeReset;
        }
    }
}
