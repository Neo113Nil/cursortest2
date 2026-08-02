package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.core.text.TextUtilsCompat;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.InitiatePasscodeResetRequest;
import com.squareup.protos.franklin.common.InitiatePasscodeResetResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.cash.ProtoDefaults;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class PasscodePresenter$models$2$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ ParcelableSnapshotMutableIntState $attempt$delegate;
    public final /* synthetic */ State $defaultTitle$delegate;
    public final /* synthetic */ MutableState $forgotPasscode$delegate;
    public final /* synthetic */ String $resetPasscodeFlowToken;
    public final /* synthetic */ MutableState $title$delegate;
    public int label;
    public final /* synthetic */ PasscodePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodePresenter$models$2$1(PasscodePresenter passcodePresenter, String str, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, State state, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = passcodePresenter;
        this.$resetPasscodeFlowToken = str;
        this.$attempt$delegate = parcelableSnapshotMutableIntState;
        this.$defaultTitle$delegate = state;
        this.$title$delegate = mutableState;
        this.$forgotPasscode$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PasscodePresenter$models$2$1(this.this$0, this.$resetPasscodeFlowToken, this.$attempt$delegate, this.$defaultTitle$delegate, this.$title$delegate, this.$forgotPasscode$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PasscodePresenter$models$2$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PasscodePresenter passcodePresenter = this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = passcodePresenter.navigator;
        BlockersScreens.PasscodeScreen passcodeScreen = passcodePresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = this.$resetPasscodeFlowToken;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$attempt$delegate;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
            AppService appService = passcodePresenter.appService;
            ClientScenario clientScenario = ClientScenario.RESET_PASSCODE;
            InitiatePasscodeResetRequest initiatePasscodeResetRequest = new InitiatePasscodeResetRequest();
            this.label = 1;
            obj = appService.initiatePasscodeReset(clientScenario, str, initiatePasscodeResetRequest, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        boolean z = apiResult instanceof ApiResult.Success;
        State state = this.$defaultTitle$delegate;
        MutableState mutableState = this.$title$delegate;
        if (z) {
            InitiatePasscodeResetResponse initiatePasscodeResetResponse = (InitiatePasscodeResetResponse) ((ApiResult.Success) apiResult).response;
            InitiatePasscodeResetResponse.Status status = initiatePasscodeResetResponse.status;
            if (status == null) {
                status = ProtoDefaults.INITIATE_PASSCODE_RESET_STATUS;
            }
            int ordinal = status.ordinal();
            if (ordinal == 1) {
                FlowStarter flowStarter = passcodePresenter.flowStarter;
                ClientScenario clientScenario2 = ClientScenario.RESET_PASSCODE;
                ResponseContext responseContext = initiatePasscodeResetResponse.response_context;
                responseContext.getClass();
                screenNavigator.goTo(((RealFlowStarter) flowStarter).startProfileBlockersFlow(clientScenario2, str, responseContext.scenario_plan, passcodeScreen));
            } else if (ordinal != 2) {
                Timber.Forest.e("Unknown response status: " + initiatePasscodeResetResponse.status, new Object[0], new IllegalStateException());
                mutableState.setValue((String) state.getValue());
            } else {
                BlockerFlowListener blockerFlowListener = passcodePresenter.blockerFlowAnalytics;
                BlockersData blockersData = passcodeScreen.blockersData;
                blockerFlowListener.onFlowCancelled(blockersData);
                screenNavigator.goTo(blockersData.exitScreen);
            }
        } else {
            if (!(apiResult instanceof ApiResult.Failure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            screenNavigator.goTo(new FailureMessageBlockerScreen(passcodeScreen.blockersData, TextUtilsCompat.errorMessaging(passcodePresenter.stringManager, (ApiResult.Failure) apiResult, null).message, null, 4));
            mutableState.setValue((String) state.getValue());
            NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
        }
        this.$forgotPasscode$delegate.setValue(null);
        return Unit.INSTANCE;
    }
}
