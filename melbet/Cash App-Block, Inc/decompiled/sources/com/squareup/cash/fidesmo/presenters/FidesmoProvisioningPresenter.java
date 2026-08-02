package com.squareup.cash.fidesmo.presenters;

import android.app.Activity;
import android.content.res.Resources;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FormattedResources;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.g6$$ExternalSyntheticLambda11;
import com.google.android.gms.internal.measurement.zzaag;
import com.google.android.gms.internal.mlkit_vision_common.zzlr;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionEligibilityRequested;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionFailed;
import com.squareup.cash.cdf.cashtagprovisioning.DeprovisionFailurePhase;
import com.squareup.cash.cdf.cashtagprovisioning.DeviceType;
import com.squareup.cash.cdf.cashtagprovisioning.EligibilityDecision;
import com.squareup.cash.cdf.cashtagprovisioning.ErrorSource;
import com.squareup.cash.cdf.cashtagprovisioning.FailurePhase;
import com.squareup.cash.cdf.cashtagprovisioning.NfcReconnectionOutcome;
import com.squareup.cash.cdf.cashtagprovisioning.NfcScanErrorType;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FlipMotorolaNfcAntennaY;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ProvisioningPostDisconnectStabilityCheck;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.api.FidesmoActivationData;
import com.squareup.cash.fidesmo.api.FidesmoAnimationDebugOverrides;
import com.squareup.cash.fidesmo.api.FidesmoCardEncryptionData;
import com.squareup.cash.fidesmo.api.FidesmoClient;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningData;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningError;
import com.squareup.cash.fidesmo.api.FidesmoServiceType;
import com.squareup.cash.fidesmo.api.FidesmoShutdownReason;
import com.squareup.cash.fidesmo.presenters.ActivationResult;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningErrorManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.screens.FidesmoProvisioningScreen;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.paymentpad.presenters.LitePaymentPadPresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction$CashTagProvisioning$EligibilityDenied;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$CashTagProvisioning$NfcScansHigh;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$CashTagProvisioning$NfcScansLow;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$CashTagProvisioning$NfcScansMedium;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$CashTagProvisioning$NfcScansSingle;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.CashAppTagKt;
import com.squareup.cash.wallet.data.RealCashAppTagManager;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.cash.taply.app.v1.Denied;
import com.squareup.protos.cash.taply.app.v1.DeviceMetadata;
import com.squareup.protos.cash.taply.app.v1.DeviceProvisioningStatus;
import com.squareup.protos.cash.taply.app.v1.EncryptedCardData;
import com.squareup.protos.cash.taply.app.v1.FidesmoEncryptionData;
import com.squareup.protos.cash.taply.app.v1.GetCustomerDetailsForDeprovisioningRequest;
import com.squareup.protos.cash.taply.app.v1.GetCustomerDetailsForDeprovisioningResponse;
import com.squareup.protos.cash.taply.app.v1.OnFidesmoProvisioningStartRequest;
import com.squareup.protos.cash.taply.app.v1.OnFidesmoProvisioningStartResponse;
import com.squareup.protos.cash.taply.app.v1.PaymentTokenDeviceProvisioningService;
import com.squareup.protos.cash.taply.app.v1.ProvisioningEligibility;
import com.squareup.protos.cash.taply.app.v1.ProvisioningEligibility$Decision$Denied;
import com.squareup.protos.cash.taply.app.v1.SuccessScreen;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.app.SubmitFidesmoProvisioningBlockerRequest;
import com.squareup.protos.franklin.common.ResponseContext;
import com.stripe.android.uicore.FocusManagerKtKt;
import com.stripe.android.uicore.elements.DropdownFieldUIKt;
import com.stripe.android.uicore.elements.FormLabelKt;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.HexExtensionsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public final class FidesmoProvisioningPresenter implements MoleculePresenter {
    public final FidesmoAnimationDebugOverrides animationDebugOverrides;
    public final FidesmoProvisioningScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealCashAppTagManager cashAppTagManager;
    public final FidesmoProvisioningErrorManager errorManager;
    public final FeatureFlagManager featureFlagManager;
    public final FidesmoClient fidesmoClient;
    public final FidesmoProvisioningFlowContext flowContext;
    public final AppService franklinAppService;
    public boolean isActivationRequestInFlight;
    public boolean isRetryAttempt;
    public boolean journeyEnded;
    public final UserJourney$Name journeyName;
    public boolean journeyStarted;
    public final Camera2Controller loggingHandler;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final PaymentTokenDeviceProvisioningService paymentTokenDeviceProvisioningService;
    public final RealRouter router;
    public int scanAttempts;
    public final AndroidStringManager stringManager;
    public final RealSupportNavigator supportNavigator;
    public final UserJourneyTracker userJourneyTracker;
    public final FidesmoViewModelMapper viewModelMapper;

    public interface ActivationPhase {

        public final class Activating implements ActivationPhase {
            public static final Activating INSTANCE = new Activating();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Activating);
            }

            public final int hashCode() {
                return -1262260439;
            }

            public final String toString() {
                return "Activating";
            }
        }

        public final class ActivationCompleted implements ActivationPhase {
            public final String deviceId;
            public final SuccessScreen successScreen;
            public final String tagThemeToken;

            public ActivationCompleted(SuccessScreen successScreen, String str, String str2) {
                str.getClass();
                this.successScreen = successScreen;
                this.deviceId = str;
                this.tagThemeToken = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActivationCompleted)) {
                    return false;
                }
                ActivationCompleted activationCompleted = (ActivationCompleted) obj;
                return Intrinsics.areEqual(this.successScreen, activationCompleted.successScreen) && Intrinsics.areEqual(this.deviceId, activationCompleted.deviceId) && Intrinsics.areEqual(this.tagThemeToken, activationCompleted.tagThemeToken);
            }

            public final int hashCode() {
                SuccessScreen successScreen = this.successScreen;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((successScreen == null ? 0 : successScreen.hashCode()) * 31, 31, this.deviceId);
                String str = this.tagThemeToken;
                return m + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ActivationCompleted(successScreen=");
                sb.append(this.successScreen);
                sb.append(", deviceId=");
                sb.append(this.deviceId);
                sb.append(", tagThemeToken=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tagThemeToken, ")");
            }
        }

        public final class Denied implements ActivationPhase {
            public final FidesmoProvisioningBlocker.ErrorUiConfig errorConfig;

            public Denied(FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig) {
                this.errorConfig = errorUiConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Denied) && Intrinsics.areEqual(this.errorConfig, ((Denied) obj).errorConfig);
            }

            public final int hashCode() {
                FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig = this.errorConfig;
                if (errorUiConfig == null) {
                    return 0;
                }
                return errorUiConfig.hashCode();
            }

            public final String toString() {
                return "Denied(errorConfig=" + this.errorConfig + ")";
            }
        }

        public final class Failed implements ActivationPhase {
            public final FidesmoProvisioningErrorManager.ActivationFailureReason reason;

            public Failed(FidesmoProvisioningErrorManager.ActivationFailureReason activationFailureReason) {
                this.reason = activationFailureReason;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && this.reason == ((Failed) obj).reason;
            }

            public final int hashCode() {
                return this.reason.hashCode();
            }

            public final String toString() {
                return "Failed(reason=" + this.reason + ")";
            }
        }
    }

    public interface ProvisioningResultSubmission {

        public final class Failed implements ProvisioningResultSubmission {
            public static final Failed INSTANCE = new Failed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Failed);
            }

            public final int hashCode() {
                return 1942163557;
            }

            public final String toString() {
                return "Failed";
            }
        }

        public final class InFlight implements ProvisioningResultSubmission {
            public static final InFlight INSTANCE = new InFlight();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InFlight);
            }

            public final int hashCode() {
                return 987586589;
            }

            public final String toString() {
                return "InFlight";
            }
        }

        public final class NotStarted implements ProvisioningResultSubmission {
            public static final NotStarted INSTANCE = new NotStarted();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NotStarted);
            }

            public final int hashCode() {
                return -450293162;
            }

            public final String toString() {
                return "NotStarted";
            }
        }

        public final class Succeeded implements ProvisioningResultSubmission {
            public final BlockersData blockersData;

            public Succeeded(BlockersData blockersData) {
                blockersData.getClass();
                this.blockersData = blockersData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Succeeded) && Intrinsics.areEqual(this.blockersData, ((Succeeded) obj).blockersData);
            }

            public final int hashCode() {
                return this.blockersData.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "Succeeded(blockersData=", ")");
            }
        }
    }

    public final class SuccessAnimationInputs {
        public final TagFormFactor formFactor;
        public final FidesmoScanningPulseShape pulseShape;

        public SuccessAnimationInputs(FidesmoScanningPulseShape fidesmoScanningPulseShape, TagFormFactor tagFormFactor) {
            fidesmoScanningPulseShape.getClass();
            this.pulseShape = fidesmoScanningPulseShape;
            this.formFactor = tagFormFactor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessAnimationInputs)) {
                return false;
            }
            SuccessAnimationInputs successAnimationInputs = (SuccessAnimationInputs) obj;
            return this.pulseShape == successAnimationInputs.pulseShape && this.formFactor == successAnimationInputs.formFactor;
        }

        public final int hashCode() {
            return this.formFactor.hashCode() + (this.pulseShape.hashCode() * 31);
        }

        public final String toString() {
            return "SuccessAnimationInputs(pulseShape=" + this.pulseShape + ", formFactor=" + this.formFactor + ")";
        }
    }

    public FidesmoProvisioningPresenter(FidesmoProvisioningScreen fidesmoProvisioningScreen, BetterNavigator.ScreenNavigator screenNavigator, PaymentTokenDeviceProvisioningService paymentTokenDeviceProvisioningService, FidesmoClient fidesmoClient, RealObservabilityManager realObservabilityManager, AndroidStringManager androidStringManager, AppService appService, RealRouter$Factory$Impl realRouter$Factory$Impl, RealSupportNavigator realSupportNavigator, RealCashAppTagManager realCashAppTagManager, BlockersDataNavigator blockersDataNavigator, FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext, UserJourneyTracker userJourneyTracker, FidesmoAnimationDebugOverrides fidesmoAnimationDebugOverrides, FeatureFlagManager featureFlagManager) {
        fidesmoProvisioningScreen.getClass();
        this.args = fidesmoProvisioningScreen;
        this.navigator = screenNavigator;
        this.paymentTokenDeviceProvisioningService = paymentTokenDeviceProvisioningService;
        this.fidesmoClient = fidesmoClient;
        this.observabilityManager = realObservabilityManager;
        this.stringManager = androidStringManager;
        this.franklinAppService = appService;
        this.supportNavigator = realSupportNavigator;
        this.cashAppTagManager = realCashAppTagManager;
        this.blockersDataNavigator = blockersDataNavigator;
        this.flowContext = fidesmoProvisioningFlowContext;
        this.userJourneyTracker = userJourneyTracker;
        this.animationDebugOverrides = fidesmoAnimationDebugOverrides;
        this.featureFlagManager = featureFlagManager;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        FidesmoProvisioningErrorManager fidesmoProvisioningErrorManager = new FidesmoProvisioningErrorManager(androidStringManager);
        this.errorManager = fidesmoProvisioningErrorManager;
        this.viewModelMapper = new FidesmoViewModelMapper(androidStringManager);
        UserJourney$Name userJourney$Name = UserJourney$Name.CASH_TAG_PROVISIONING;
        this.journeyName = userJourney$Name;
        this.loggingHandler = new Camera2Controller(fidesmoProvisioningFlowContext, fidesmoProvisioningErrorManager, userJourneyTracker, userJourney$Name, fidesmoProvisioningScreen.flowType, new EnumListAdapter$encode$1(1, this, FidesmoProvisioningPresenter.class, "recordErrorModel", "recordErrorModel(Lcom/squareup/cash/fidesmo/presenters/FidesmoProvisioningErrorManager$ErrorModel;)V", 0, 4), new EnumListAdapter$encode$1(1, this, FidesmoProvisioningPresenter.class, "endJourneyIfNeeded", "endJourneyIfNeeded(Lcom/squareup/cash/userjourneys/tracker/UserJourney$Outcome;)V", 0, 5));
    }

    public static final void access$models$advanceSyntheticProgressTargetByStep(MutableState mutableState, MutableState mutableState2) {
        int i = (Integer) mutableState.getValue();
        if (i == null) {
            i = 0;
        }
        mutableState.setValue(i);
        Integer num = (Integer) mutableState2.getValue();
        int intValue = (num != null ? num.intValue() : 0) + 10;
        if (intValue > 90) {
            intValue = 90;
        }
        mutableState2.setValue(Integer.valueOf(intValue));
    }

    public static final void access$models$shutdownFidesmo(Object obj, FidesmoProvisioningPresenter fidesmoProvisioningPresenter, Set set, Activity activity, FidesmoShutdownReason fidesmoShutdownReason) {
        boolean add;
        synchronized (obj) {
            add = set.add(activity);
        }
        if (add) {
            RealFidesmoClient realFidesmoClient = (RealFidesmoClient) fidesmoProvisioningPresenter.fidesmoClient;
            fidesmoShutdownReason.getClass();
            realFidesmoClient.shutdown(activity, null, fidesmoShutdownReason);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitProvisioningBlockerResult(FidesmoProvisioningPresenter fidesmoProvisioningPresenter, boolean z, String str, ContinuationImpl continuationImpl) {
        FidesmoProvisioningPresenter$submitProvisioningBlockerResult$1 fidesmoProvisioningPresenter$submitProvisioningBlockerResult$1;
        int i;
        Object obj;
        ResponseContext build;
        SubmitBlockerResponse.BlockerResponseContext.Dialog dialog;
        SubmitBlockerResponse.BlockerResponseContext.Dialog dialog2;
        FidesmoProvisioningScreen fidesmoProvisioningScreen = fidesmoProvisioningPresenter.args;
        if (continuationImpl instanceof FidesmoProvisioningPresenter$submitProvisioningBlockerResult$1) {
            fidesmoProvisioningPresenter$submitProvisioningBlockerResult$1 = (FidesmoProvisioningPresenter$submitProvisioningBlockerResult$1) continuationImpl;
            int i2 = fidesmoProvisioningPresenter$submitProvisioningBlockerResult$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fidesmoProvisioningPresenter$submitProvisioningBlockerResult$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = fidesmoProvisioningPresenter$submitProvisioningBlockerResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fidesmoProvisioningPresenter$submitProvisioningBlockerResult$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    BlockersData blockersData = fidesmoProvisioningScreen.blockersData;
                    String str2 = blockersData.blockerId;
                    if (str2 != null) {
                        AppService appService = fidesmoProvisioningPresenter.franklinAppService;
                        ClientScenario clientScenario = blockersData.clientScenario;
                        if (clientScenario == null) {
                            clientScenario = ClientScenario.PLASMA;
                        }
                        String str3 = blockersData.flowToken;
                        SubmitBlockerRequest.Request.Builder builder = new SubmitBlockerRequest.Request.Builder();
                        builder.blocker_descriptor_id = str2;
                        builder.request = new SubmitBlockerRequest$Request$Request$SubmitFidesmoProvisioningBlockerRequest(new SubmitFidesmoProvisioningBlockerRequest(null, z ? SubmitFidesmoProvisioningBlockerRequest.Result.TOKEN_ACTIVATION_REQUIRED : SubmitFidesmoProvisioningBlockerRequest.Result.SUCCESS, str, ByteString.EMPTY));
                        SubmitBlockerRequest submitBlockerRequest = new SubmitBlockerRequest(null, CollectionsKt__CollectionsJVMKt.listOf(builder.build()), 11);
                        fidesmoProvisioningPresenter$submitProvisioningBlockerResult$1.label = 1;
                        obj2 = appService.submitBlocker(clientScenario, str3, submitBlockerRequest, fidesmoProvisioningPresenter$submitProvisioningBlockerResult$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj2);
                obj = (ApiResult) obj2;
                if (!(obj instanceof ApiResult.Success)) {
                    SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) ((ApiResult.Success) obj).response;
                    SubmitBlockerResponse.AppResponseContext appResponseContext = submitBlockerResponse.app_response_context;
                    SubmitBlockerResponse.BlockerResponseContext blockerResponseContext = submitBlockerResponse.blocker_response_context;
                    SubmitBlockerResponse.FlowResponseContext flowResponseContext = submitBlockerResponse.flow_response_context;
                    if (appResponseContext == null && blockerResponseContext == null && flowResponseContext == null) {
                        build = null;
                    } else {
                        ResponseContext.Builder builder2 = new ResponseContext.Builder();
                        builder2.scenario_plan = flowResponseContext != null ? flowResponseContext.scenario_plan : null;
                        builder2.status_result = flowResponseContext != null ? flowResponseContext.status_result : null;
                        builder2.dialog_message = (blockerResponseContext == null || (dialog2 = blockerResponseContext.dialog) == null) ? null : dialog2.message;
                        builder2.sync_entities_data = appResponseContext != null ? appResponseContext.sync_entities_data : null;
                        builder2.profile = appResponseContext != null ? appResponseContext.profile : null;
                        builder2.dialog_title = (blockerResponseContext == null || (dialog = blockerResponseContext.dialog) == null) ? null : dialog.title;
                        build = builder2.build();
                    }
                    obj = Matcher$$ExternalSyntheticOutline0.m(build, build);
                } else if (!(obj instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (obj instanceof ApiResult.Success) {
                    BlockersData blockersData2 = fidesmoProvisioningScreen.blockersData;
                    ResponseContext responseContext = (ResponseContext) ((ApiResult.Success) obj).response;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    return blockersData2.updateFromResponseContext(responseContext, false);
                }
                return null;
            }
        }
        fidesmoProvisioningPresenter$submitProvisioningBlockerResult$1 = new FidesmoProvisioningPresenter$submitProvisioningBlockerResult$1(fidesmoProvisioningPresenter, continuationImpl);
        Object obj22 = fidesmoProvisioningPresenter$submitProvisioningBlockerResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fidesmoProvisioningPresenter$submitProvisioningBlockerResult$1.label;
        if (i != 0) {
        }
        obj = (ApiResult) obj22;
        if (!(obj instanceof ApiResult.Success)) {
        }
        if (obj instanceof ApiResult.Success) {
        }
        return null;
    }

    public static final DeviceType models$resolveFlowDeviceType(FidesmoProvisioningPresenter fidesmoProvisioningPresenter, MutableState mutableState) {
        TagThemeDefinition.TagFormFactor themeFormFactor;
        FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig = fidesmoProvisioningPresenter.args.blocker.pre_scan;
        String str = preScanUiConfig != null ? preScanUiConfig.tag_theme_token : null;
        TagFormFactor appTagFormFactor = (str == null || (themeFormFactor = FormLabelKt.toThemeFormFactor(str)) == null) ? null : FormattedResources.toAppTagFormFactor(themeFormFactor);
        if (appTagFormFactor == null) {
            List list = (List) mutableState.getValue();
            list.getClass();
            CashAppTag currentCashAppTagOrNull = CashAppTagKt.currentCashAppTagOrNull(list);
            appTagFormFactor = currentCashAppTagOrNull != null ? currentCashAppTagOrNull.formFactor : null;
        }
        if (appTagFormFactor != null) {
            return FormLabelKt.toCdfDeviceType(appTagFormFactor);
        }
        return null;
    }

    public final void endJourneyIfNeeded$1(UserJourney$Outcome userJourney$Outcome) {
        boolean z = this.journeyStarted;
        if (!z || this.journeyEnded) {
            return;
        }
        UserJourney$Name userJourney$Name = this.journeyName;
        UserJourneyTracker userJourneyTracker = this.userJourneyTracker;
        if (z) {
            int i = this.scanAttempts;
            zzaag zzaagVar = i == 0 ? null : i == 1 ? UserJourney$Tag$CashTagProvisioning$NfcScansSingle.INSTANCE : (2 > i || i >= 6) ? (6 > i || i >= 11) ? UserJourney$Tag$CashTagProvisioning$NfcScansHigh.INSTANCE : UserJourney$Tag$CashTagProvisioning$NfcScansMedium.INSTANCE : UserJourney$Tag$CashTagProvisioning$NfcScansLow.INSTANCE;
            if (zzaagVar != null) {
                ((RealUserJourneyTracker) userJourneyTracker).addTag(userJourney$Name, zzaagVar);
            }
        }
        ((RealUserJourneyTracker) userJourneyTracker).endJourney(userJourney$Name, userJourney$Outcome);
        this.journeyEnded = true;
    }

    public final void logSuccessfulReconnectionIfNeeded(FidesmoDeviceState fidesmoDeviceState) {
        if (Intrinsics.areEqual(fidesmoDeviceState, FidesmoDeviceState.Connected.INSTANCE) || (fidesmoDeviceState instanceof FidesmoDeviceState.CheckingStability) || Intrinsics.areEqual(fidesmoDeviceState, FidesmoDeviceState.PreparingDelivery.INSTANCE) || (fidesmoDeviceState instanceof FidesmoDeviceState.DeliveringService) || (fidesmoDeviceState instanceof FidesmoDeviceState.ServiceDelivered)) {
            this.flowContext.logNfcReconnectionResult(NfcReconnectionOutcome.SUCCESS);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ae  */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.lang.Object, kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r15v34 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        Object rememberedValue5;
        Object rememberedValue6;
        Object rememberedValue7;
        Object rememberedValue8;
        Object rememberedValue9;
        Object rememberedValue10;
        Object rememberedValue11;
        Object rememberedValue12;
        Object rememberedValue13;
        Object rememberedValue14;
        boolean changedInstance;
        NeverEqualPolicy neverEqualPolicy;
        Object obj;
        Activity activity;
        NeverEqualPolicy neverEqualPolicy2;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        ResolvedStarPlacement resolvedStarPlacement;
        MutableState mutableState4;
        MutableState mutableState5;
        Object obj2;
        FidesmoScanningPulseShape resolveScanningPulseShape;
        FidesmoFlowType fidesmoFlowType;
        FidesmoScanningPulseShape resolveScanningPulseShape2;
        TagFormFactor appTagFormFactor;
        boolean changedInstance2;
        FidesmoScanningPulseShape fidesmoScanningPulseShape;
        FeatureFlagManager featureFlagManager;
        FidesmoAnimationDebugOverrides fidesmoAnimationDebugOverrides;
        FidesmoFlowType fidesmoFlowType2;
        NeverEqualPolicy neverEqualPolicy3;
        Object obj3;
        Object obj4;
        boolean changedInstance3;
        TagFormFactor tagFormFactor;
        ?? r15;
        Object obj5;
        FidesmoServiceType fidesmoServiceType;
        MutableState mutableState6;
        Object obj6;
        Set set;
        boolean z;
        MutableState mutableState7;
        Activity activity2;
        MutableState mutableState8;
        String str2;
        ActivationPhase activationPhase;
        Activity activity3;
        ResolvedStarPlacement resolvedStarPlacement2;
        FidesmoDeviceState.ServiceDelivered serviceDelivered;
        MutableState mutableState9;
        boolean z2;
        SuccessAnimationInputs successAnimationInputs;
        GapComposer gapComposer;
        Continuation continuation;
        ScanningStarPlacement scanningStarPlacement;
        ActivationResult activationResult;
        Integer num;
        FidesmoProvisioningBlocker.PreScanUiConfig.HelpVideo helpVideo;
        Activity activity4;
        boolean z3;
        ResolvedStarPlacement resolvedStarPlacement3;
        NeverEqualPolicy neverEqualPolicy4;
        FidesmoProvisioningViewModel postInstructionsViewModel;
        FidesmoProvisioningViewModel fidesmoProvisioningViewModel;
        boolean changedInstance4;
        Object navHostKt$NavHost$33$1;
        ResolvedStarPlacement resolvedStarPlacement4;
        GapComposer gapComposer2;
        FidesmoProvisioningViewModel fidesmoProvisioningViewModel2;
        NeverEqualPolicy neverEqualPolicy5;
        boolean z4;
        Continuation continuation2;
        boolean changedInstance5;
        Object rememberedValue15;
        Integer num2;
        String str3;
        TagThemeDefinition.TagFormFactor themeFormFactor;
        FidesmoScanningPulseShape fidesmoScanningPulseShape2;
        TagThemeDefinition.TagFormFactor themeFormFactor2;
        String str4;
        FidesmoProvisioningPresenter fidesmoProvisioningPresenter = this;
        flow.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(-1525548322);
        Object rememberedValue16 = gapComposer3.rememberedValue();
        NeverEqualPolicy neverEqualPolicy6 = Composer.Companion.Empty;
        Object obj7 = rememberedValue16;
        if (rememberedValue16 == neverEqualPolicy6) {
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 allCashAppTags = fidesmoProvisioningPresenter.cashAppTagManager.getAllCashAppTags();
            gapComposer3.updateRememberedValue(allCashAppTags);
            obj7 = allCashAppTags;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) obj7, EmptyList.INSTANCE, null, gapComposer3, 48, 2);
        List list = (List) collectAsState.getValue();
        AndroidStringManager androidStringManager = fidesmoProvisioningPresenter.stringManager;
        String str5 = androidStringManager.get(R.string.fidesmo_tag_default_name);
        CashAppTag currentCashAppTagOrNull = CashAppTagKt.currentCashAppTagOrNull(list);
        if (currentCashAppTagOrNull != null && (str4 = currentCashAppTagOrNull.displayName) != null) {
            if (StringsKt.isBlank(str4)) {
                str4 = null;
            }
            if (str4 != null) {
                str = str4;
                rememberedValue = gapComposer3.rememberedValue();
                Object obj8 = rememberedValue;
                if (rememberedValue == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(null);
                    gapComposer3.updateRememberedValue(mutableStateOf$default);
                    obj8 = mutableStateOf$default;
                }
                MutableState mutableState10 = (MutableState) obj8;
                rememberedValue2 = gapComposer3.rememberedValue();
                Object obj9 = rememberedValue2;
                if (rememberedValue2 == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer3.updateRememberedValue(mutableStateOf$default2);
                    obj9 = mutableStateOf$default2;
                }
                MutableState mutableState11 = (MutableState) obj9;
                rememberedValue3 = gapComposer3.rememberedValue();
                Object obj10 = rememberedValue3;
                if (rememberedValue3 == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer3.updateRememberedValue(mutableStateOf$default3);
                    obj10 = mutableStateOf$default3;
                }
                MutableState mutableState12 = (MutableState) obj10;
                rememberedValue4 = gapComposer3.rememberedValue();
                ActivationPhase.Activating activating = ActivationPhase.Activating.INSTANCE;
                Object obj11 = rememberedValue4;
                if (rememberedValue4 == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(activating);
                    gapComposer3.updateRememberedValue(mutableStateOf$default4);
                    obj11 = mutableStateOf$default4;
                }
                MutableState mutableState13 = (MutableState) obj11;
                rememberedValue5 = gapComposer3.rememberedValue();
                Object obj12 = rememberedValue5;
                if (rememberedValue5 == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default5 = Updater.mutableStateOf$default(null);
                    gapComposer3.updateRememberedValue(mutableStateOf$default5);
                    obj12 = mutableStateOf$default5;
                }
                MutableState mutableState14 = (MutableState) obj12;
                rememberedValue6 = gapComposer3.rememberedValue();
                Object obj13 = rememberedValue6;
                if (rememberedValue6 == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default6 = Updater.mutableStateOf$default(ProvisioningResultSubmission.NotStarted.INSTANCE);
                    gapComposer3.updateRememberedValue(mutableStateOf$default6);
                    obj13 = mutableStateOf$default6;
                }
                MutableState mutableState15 = (MutableState) obj13;
                rememberedValue7 = gapComposer3.rememberedValue();
                Object obj14 = rememberedValue7;
                if (rememberedValue7 == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default7 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer3.updateRememberedValue(mutableStateOf$default7);
                    obj14 = mutableStateOf$default7;
                }
                MutableState mutableState16 = (MutableState) obj14;
                rememberedValue8 = gapComposer3.rememberedValue();
                Object obj15 = rememberedValue8;
                if (rememberedValue8 == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default8 = Updater.mutableStateOf$default(null);
                    gapComposer3.updateRememberedValue(mutableStateOf$default8);
                    obj15 = mutableStateOf$default8;
                }
                MutableState mutableState17 = (MutableState) obj15;
                rememberedValue9 = gapComposer3.rememberedValue();
                Object obj16 = rememberedValue9;
                if (rememberedValue9 == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default9 = Updater.mutableStateOf$default(null);
                    gapComposer3.updateRememberedValue(mutableStateOf$default9);
                    obj16 = mutableStateOf$default9;
                }
                MutableState mutableState18 = (MutableState) obj16;
                rememberedValue10 = gapComposer3.rememberedValue();
                Object obj17 = rememberedValue10;
                if (rememberedValue10 == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default10 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer3.updateRememberedValue(mutableStateOf$default10);
                    obj17 = mutableStateOf$default10;
                }
                MutableState mutableState19 = (MutableState) obj17;
                rememberedValue11 = gapComposer3.rememberedValue();
                Object obj18 = rememberedValue11;
                if (rememberedValue11 == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default11 = Updater.mutableStateOf$default(null);
                    gapComposer3.updateRememberedValue(mutableStateOf$default11);
                    obj18 = mutableStateOf$default11;
                }
                MutableState mutableState20 = (MutableState) obj18;
                rememberedValue12 = gapComposer3.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy6) {
                    rememberedValue12 = new Object();
                    gapComposer3.updateRememberedValue(rememberedValue12);
                }
                Object obj19 = rememberedValue12;
                rememberedValue13 = gapComposer3.rememberedValue();
                Object obj20 = rememberedValue13;
                if (rememberedValue13 == neverEqualPolicy6) {
                    Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
                    gapComposer3.updateRememberedValue(newSetFromMap);
                    obj20 = newSetFromMap;
                }
                Set set2 = (Set) obj20;
                rememberedValue14 = gapComposer3.rememberedValue();
                Object obj21 = rememberedValue14;
                if (rememberedValue14 == neverEqualPolicy6) {
                    ParcelableSnapshotMutableState mutableStateOf$default12 = Updater.mutableStateOf$default(FidesmoShutdownReason.STREAM_DISPOSED);
                    gapComposer3.updateRememberedValue(mutableStateOf$default12);
                    obj21 = mutableStateOf$default12;
                }
                MutableState mutableState21 = (MutableState) obj21;
                MutableState rememberUpdatedState = Updater.rememberUpdatedState((FidesmoShutdownReason) mutableState21.getValue(), gapComposer3);
                Unit unit = Unit.INSTANCE;
                changedInstance = gapComposer3.changedInstance(fidesmoProvisioningPresenter) | gapComposer3.changed(collectAsState);
                Object rememberedValue17 = gapComposer3.rememberedValue();
                if (!changedInstance || rememberedValue17 == neverEqualPolicy6) {
                    neverEqualPolicy = neverEqualPolicy6;
                    FidesmoProvisioningPresenter$models$1$1 fidesmoProvisioningPresenter$models$1$1 = new FidesmoProvisioningPresenter$models$1$1(fidesmoProvisioningPresenter, collectAsState, null);
                    gapComposer3.updateRememberedValue(fidesmoProvisioningPresenter$models$1$1);
                    obj = fidesmoProvisioningPresenter$models$1$1;
                } else {
                    neverEqualPolicy = neverEqualPolicy6;
                    obj = rememberedValue17;
                }
                Updater.LaunchedEffect(gapComposer3, unit, (Function2) obj);
                String str6 = str;
                NeverEqualPolicy neverEqualPolicy7 = neverEqualPolicy;
                Updater.LaunchedEffect(gapComposer3, flow, new FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, fidesmoProvisioningPresenter, mutableState10, mutableState12, collectAsState, mutableState11, mutableState13, mutableState14, mutableState15, mutableState16, mutableState17, mutableState18, mutableState19, mutableState20, mutableState21, obj19, set2));
                activity = (Activity) mutableState10.getValue();
                if (activity != null) {
                    gapComposer3.end(false);
                    return FidesmoProvisioningViewModel.Loading.INSTANCE;
                }
                boolean changed = gapComposer3.changed(activity);
                Object rememberedValue18 = gapComposer3.rememberedValue();
                FidesmoAnimationDebugOverrides fidesmoAnimationDebugOverrides2 = fidesmoProvisioningPresenter.animationDebugOverrides;
                FeatureFlagManager featureFlagManager2 = fidesmoProvisioningPresenter.featureFlagManager;
                if (changed) {
                    neverEqualPolicy2 = neverEqualPolicy7;
                } else {
                    neverEqualPolicy2 = neverEqualPolicy7;
                    if (rememberedValue18 != neverEqualPolicy2) {
                        mutableState = mutableState13;
                        mutableState2 = mutableState15;
                        mutableState3 = mutableState16;
                        mutableState4 = mutableState19;
                        mutableState5 = mutableState20;
                        obj2 = rememberedValue18;
                        ResolvedStarPlacement resolvedStarPlacement5 = (ResolvedStarPlacement) obj2;
                        ScanningStarPlacement scanningStarPlacement2 = resolvedStarPlacement5.placement;
                        FidesmoProvisioningScreen fidesmoProvisioningScreen = fidesmoProvisioningPresenter.args;
                        FidesmoProvisioningBlocker fidesmoProvisioningBlocker = fidesmoProvisioningScreen.blocker;
                        FidesmoFlowType fidesmoFlowType3 = fidesmoProvisioningScreen.flowType;
                        FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig = fidesmoProvisioningBlocker.pre_scan;
                        String str7 = preScanUiConfig == null ? preScanUiConfig.tag_theme_token : null;
                        TagFormFactor appTagFormFactor2 = (str7 != null || (themeFormFactor2 = FormLabelKt.toThemeFormFactor(str7)) == null) ? null : FormattedResources.toAppTagFormFactor(themeFormFactor2);
                        resolveScanningPulseShape = appTagFormFactor2 == null ? FormLabelKt.resolveScanningPulseShape(appTagFormFactor2) : null;
                        if (resolveScanningPulseShape != null) {
                            List list2 = (List) collectAsState.getValue();
                            list2.getClass();
                            fidesmoFlowType = fidesmoFlowType3;
                            CashAppTag currentCashAppTagOrNull2 = CashAppTagKt.currentCashAppTagOrNull(list2);
                            TagFormFactor tagFormFactor2 = currentCashAppTagOrNull2 != null ? currentCashAppTagOrNull2.formFactor : null;
                            if (tagFormFactor2 == null || (fidesmoScanningPulseShape2 = FormLabelKt.resolveScanningPulseShape(tagFormFactor2)) == null) {
                                fidesmoScanningPulseShape2 = FidesmoScanningPulseShape.STAR;
                            }
                            resolveScanningPulseShape = fidesmoScanningPulseShape2;
                        } else {
                            fidesmoFlowType = fidesmoFlowType3;
                        }
                        resolveScanningPulseShape2 = FocusManagerKtKt.resolveScanningPulseShape(fidesmoAnimationDebugOverrides2, resolveScanningPulseShape);
                        appTagFormFactor = (str7 != null || (themeFormFactor = FormLabelKt.toThemeFormFactor(str7)) == null) ? null : FormattedResources.toAppTagFormFactor(themeFormFactor);
                        if (appTagFormFactor == null) {
                            List list3 = (List) collectAsState.getValue();
                            list3.getClass();
                            CashAppTag currentCashAppTagOrNull3 = CashAppTagKt.currentCashAppTagOrNull(list3);
                            appTagFormFactor = currentCashAppTagOrNull3 != null ? currentCashAppTagOrNull3.formFactor : null;
                            if (appTagFormFactor == null) {
                                appTagFormFactor = TagFormFactor.WAND;
                            }
                        }
                        changedInstance2 = gapComposer3.changedInstance(obj19) | gapComposer3.changedInstance(set2) | gapComposer3.changedInstance(fidesmoProvisioningPresenter) | gapComposer3.changedInstance(activity) | gapComposer3.changed(rememberUpdatedState);
                        Object rememberedValue19 = gapComposer3.rememberedValue();
                        if (!changedInstance2 || rememberedValue19 == neverEqualPolicy2) {
                            fidesmoScanningPulseShape = resolveScanningPulseShape2;
                            featureFlagManager = featureFlagManager2;
                            fidesmoAnimationDebugOverrides = fidesmoAnimationDebugOverrides2;
                            fidesmoFlowType2 = fidesmoFlowType;
                            neverEqualPolicy3 = neverEqualPolicy2;
                            OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(activity, rememberUpdatedState, obj19, fidesmoProvisioningPresenter, set2, 20);
                            obj3 = obj19;
                            fidesmoProvisioningPresenter = fidesmoProvisioningPresenter;
                            gapComposer3.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                            obj4 = overlayKt$$ExternalSyntheticLambda3;
                        } else {
                            fidesmoScanningPulseShape = resolveScanningPulseShape2;
                            fidesmoAnimationDebugOverrides = fidesmoAnimationDebugOverrides2;
                            featureFlagManager = featureFlagManager2;
                            fidesmoFlowType2 = fidesmoFlowType;
                            neverEqualPolicy3 = neverEqualPolicy2;
                            obj3 = obj19;
                            obj4 = rememberedValue19;
                        }
                        Updater.DisposableEffect(activity, (Function1) obj4, gapComposer3);
                        Boolean bool = (Boolean) mutableState11.getValue();
                        bool.getClass();
                        changedInstance3 = gapComposer3.changedInstance(fidesmoProvisioningPresenter);
                        Object rememberedValue20 = gapComposer3.rememberedValue();
                        if (!changedInstance3 || rememberedValue20 == neverEqualPolicy3) {
                            tagFormFactor = appTagFormFactor;
                            r15 = 0;
                            CheckStatusPresenter.AnonymousClass1.C00611 c00611 = new CheckStatusPresenter.AnonymousClass1.C00611(fidesmoProvisioningPresenter, mutableState11, false ? 1 : 0, 6);
                            gapComposer3.updateRememberedValue(c00611);
                            obj5 = c00611;
                        } else {
                            tagFormFactor = appTagFormFactor;
                            r15 = 0;
                            obj5 = rememberedValue20;
                        }
                        Updater.LaunchedEffect(activity, bool, (Function2) obj5, gapComposer3);
                        if (((Boolean) mutableState11.getValue()).booleanValue()) {
                            FidesmoProvisioningBlocker.InstructionsUiConfig instructionsUiConfig = fidesmoProvisioningBlocker.instructions;
                            instructionsUiConfig.getClass();
                            String str8 = instructionsUiConfig.title;
                            str8.getClass();
                            ListUnordered listUnordered = instructionsUiConfig.items;
                            List<FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard> list4 = instructionsUiConfig.info_cards;
                            ArrayList arrayList = new ArrayList();
                            for (FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard infoCard : list4) {
                                String str9 = infoCard.title;
                                FidesmoProvisioningViewModel.PreScanInstructions.InfoCard infoCard2 = str9 == null ? r15 : new FidesmoProvisioningViewModel.PreScanInstructions.InfoCard(infoCard.image_url, str9, infoCard.body);
                                if (infoCard2 != null) {
                                    arrayList.add(infoCard2);
                                }
                            }
                            String str10 = instructionsUiConfig.button_text;
                            str10.getClass();
                            String str11 = instructionsUiConfig.button_pre_scroll_text;
                            FidesmoProvisioningBlocker.InstructionsUiConfig.Media media = instructionsUiConfig.media;
                            if (media != null) {
                                FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl imageUrl = media instanceof FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl ? (FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl) media : r15;
                                str3 = imageUrl != null ? imageUrl.getValue() : r15;
                            } else {
                                str3 = r15;
                            }
                            FidesmoProvisioningViewModel.PreScanInstructions preScanInstructions = new FidesmoProvisioningViewModel.PreScanInstructions(str8, listUnordered, arrayList, str10, str11, str3, instructionsUiConfig.disclosure_text);
                            gapComposer3.end(false);
                            return preScanInstructions;
                        }
                        boolean changedInstance6 = gapComposer3.changedInstance(fidesmoProvisioningPresenter) | gapComposer3.changedInstance(scanningStarPlacement2) | gapComposer3.changedInstance(resolvedStarPlacement5);
                        Object rememberedValue21 = gapComposer3.rememberedValue();
                        Object obj22 = rememberedValue21;
                        if (changedInstance6 || rememberedValue21 == neverEqualPolicy3) {
                            FidesmoProvisioningPresenter$models$6$1 fidesmoProvisioningPresenter$models$6$1 = new FidesmoProvisioningPresenter$models$6$1(fidesmoProvisioningPresenter, scanningStarPlacement2, resolvedStarPlacement5, (Continuation) r15);
                            gapComposer3.updateRememberedValue(fidesmoProvisioningPresenter$models$6$1);
                            obj22 = fidesmoProvisioningPresenter$models$6$1;
                        }
                        Updater.LaunchedEffect(gapComposer3, resolvedStarPlacement5, (Function2) obj22);
                        boolean changed2 = gapComposer3.changed(activity);
                        Object rememberedValue22 = gapComposer3.rememberedValue();
                        FidesmoClient fidesmoClient = fidesmoProvisioningPresenter.fidesmoClient;
                        Object obj23 = rememberedValue22;
                        if (changed2 || rememberedValue22 == neverEqualPolicy3) {
                            int ordinal = fidesmoProvisioningScreen.flowType.ordinal();
                            if (ordinal == 0) {
                                fidesmoServiceType = FidesmoServiceType.INSTALL;
                            } else {
                                if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return r15;
                                }
                                fidesmoServiceType = FidesmoServiceType.UNINSTALL;
                            }
                            ReadonlyStateFlow observeDeviceState = ((RealFidesmoClient) fidesmoClient).observeDeviceState(activity, fidesmoServiceType);
                            gapComposer3.updateRememberedValue(observeDeviceState);
                            obj23 = observeDeviceState;
                        }
                        StateFlow stateFlow = (StateFlow) obj23;
                        MutableState collectAsState2 = Updater.collectAsState(stateFlow, r15, gapComposer3, 1);
                        boolean z5 = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ProvisioningPostDisconnectStabilityCheck.INSTANCE)).enabled() && !((Boolean) mutableState4.getValue()).booleanValue() && ((((FidesmoDeviceState) collectAsState2.getValue()) instanceof FidesmoDeviceState.Disconnected) || (((FidesmoDeviceState) collectAsState2.getValue()) instanceof FidesmoDeviceState.Connected) || (((FidesmoDeviceState) collectAsState2.getValue()) instanceof FidesmoDeviceState.CheckingStability));
                        Integer num3 = (Integer) mutableState18.getValue();
                        Object obj24 = obj3;
                        Boolean bool2 = (Boolean) mutableState4.getValue();
                        bool2.getClass();
                        Boolean valueOf = Boolean.valueOf(z5);
                        boolean changed3 = gapComposer3.changed(z5);
                        Object rememberedValue23 = gapComposer3.rememberedValue();
                        if (changed3 || rememberedValue23 == neverEqualPolicy3) {
                            rememberedValue23 = new FidesmoProvisioningPresenter$models$7$1(z5, mutableState18, mutableState17, mutableState4, (Continuation) null, 0);
                            gapComposer3.updateRememberedValue(rememberedValue23);
                        }
                        Updater.LaunchedEffect(num3, bool2, valueOf, (Function2) rememberedValue23, gapComposer3);
                        FidesmoDeviceState fidesmoDeviceState = (FidesmoDeviceState) collectAsState2.getValue();
                        boolean changed4 = gapComposer3.changed(collectAsState2);
                        Object rememberedValue24 = gapComposer3.rememberedValue();
                        if (changed4 || rememberedValue24 == neverEqualPolicy3) {
                            MutableState mutableState22 = mutableState4;
                            rememberedValue24 = new LitePaymentPadPresenter$models$1$1(collectAsState2, mutableState5, mutableState17, mutableState18, mutableState22, null, 2);
                            mutableState6 = collectAsState2;
                            mutableState4 = mutableState22;
                            gapComposer3.updateRememberedValue(rememberedValue24);
                        } else {
                            mutableState6 = collectAsState2;
                        }
                        Updater.LaunchedEffect(gapComposer3, fidesmoDeviceState, (Function2) rememberedValue24);
                        String str12 = str6;
                        boolean changedInstance7 = gapComposer3.changedInstance(stateFlow) | gapComposer3.changedInstance(fidesmoProvisioningPresenter) | gapComposer3.changedInstance(activity) | gapComposer3.changed(str12);
                        Object rememberedValue25 = gapComposer3.rememberedValue();
                        if (changedInstance7 || rememberedValue25 == neverEqualPolicy3) {
                            obj6 = obj24;
                            set = set2;
                            z = true;
                            mutableState7 = mutableState;
                            RealIdvPresenter$models$1$1 realIdvPresenter$models$1$1 = new RealIdvPresenter$models$1$1(stateFlow, mutableState7, fidesmoProvisioningPresenter, activity, str12, (Continuation) null, 29);
                            activity2 = activity;
                            str12 = str12;
                            gapComposer3.updateRememberedValue(realIdvPresenter$models$1$1);
                            rememberedValue25 = realIdvPresenter$models$1$1;
                        } else {
                            activity2 = activity;
                            mutableState7 = mutableState;
                            obj6 = obj24;
                            set = set2;
                            z = true;
                        }
                        Updater.LaunchedEffect(gapComposer3, activity2, (Function2) rememberedValue25);
                        if (((FidesmoDeviceState) mutableState6.getValue()) instanceof FidesmoDeviceState.ServiceDelivered) {
                            FidesmoDeviceState fidesmoDeviceState2 = (FidesmoDeviceState) mutableState6.getValue();
                            fidesmoDeviceState2.getClass();
                            mutableState14.setValue((FidesmoDeviceState.ServiceDelivered) fidesmoDeviceState2);
                        }
                        boolean changed5 = gapComposer3.changed(mutableState6) | gapComposer3.changedInstance(fidesmoProvisioningPresenter) | gapComposer3.changed(str12);
                        Object rememberedValue26 = gapComposer3.rememberedValue();
                        if (changed5 || rememberedValue26 == neverEqualPolicy3) {
                            MutableState mutableState23 = mutableState6;
                            RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1 = new RealFidesmoClient$observeDeviceState$1(mutableState23, mutableState7, fidesmoProvisioningPresenter, str12, null, 21);
                            mutableState8 = mutableState23;
                            str2 = str12;
                            gapComposer3.updateRememberedValue(realFidesmoClient$observeDeviceState$1);
                            rememberedValue26 = realFidesmoClient$observeDeviceState$1;
                        } else {
                            mutableState8 = mutableState6;
                            str2 = str12;
                        }
                        Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue26);
                        FidesmoDeviceState.ServiceDelivered serviceDelivered2 = (FidesmoDeviceState.ServiceDelivered) mutableState14.getValue();
                        ActivationPhase activationPhase2 = (ActivationPhase) mutableState7.getValue();
                        boolean changedInstance8 = gapComposer3.changedInstance(fidesmoProvisioningPresenter);
                        Object rememberedValue27 = gapComposer3.rememberedValue();
                        if (changedInstance8 || rememberedValue27 == neverEqualPolicy3) {
                            activationPhase = activationPhase2;
                            FidesmoProvisioningPresenter fidesmoProvisioningPresenter2 = fidesmoProvisioningPresenter;
                            MutableState mutableState24 = mutableState7;
                            activity3 = activity2;
                            resolvedStarPlacement2 = resolvedStarPlacement5;
                            serviceDelivered = serviceDelivered2;
                            MutableState mutableState25 = mutableState2;
                            RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$1 = new RealBlockersHelper$skipBlocker$1(fidesmoProvisioningPresenter2, mutableState14, mutableState24, mutableState25, mutableState3, null, 28);
                            fidesmoProvisioningPresenter = fidesmoProvisioningPresenter2;
                            mutableState9 = mutableState14;
                            mutableState7 = mutableState24;
                            mutableState2 = mutableState25;
                            gapComposer3.updateRememberedValue(realBlockersHelper$skipBlocker$1);
                            rememberedValue27 = realBlockersHelper$skipBlocker$1;
                        } else {
                            activationPhase = activationPhase2;
                            mutableState9 = mutableState14;
                            activity3 = activity2;
                            resolvedStarPlacement2 = resolvedStarPlacement5;
                            serviceDelivered = serviceDelivered2;
                        }
                        Updater.LaunchedEffect(serviceDelivered, activationPhase, (Function2) rememberedValue27, gapComposer3);
                        Integer num4 = (Integer) mutableState17.getValue();
                        if (num4 == null) {
                            FidesmoDeviceState fidesmoDeviceState3 = (FidesmoDeviceState) mutableState8.getValue();
                            z2 = false;
                            Integer num5 = 0;
                            if ((!(((ActivationPhase) mutableState7.getValue()) instanceof ActivationPhase.ActivationCompleted) || !Intrinsics.areEqual(fidesmoDeviceState3, FidesmoDeviceState.Connected.INSTANCE)) && !Intrinsics.areEqual(fidesmoDeviceState3, FidesmoDeviceState.PreparingDelivery.INSTANCE) && !(fidesmoDeviceState3 instanceof FidesmoDeviceState.DeliveringService) && !(fidesmoDeviceState3 instanceof FidesmoDeviceState.ServiceDelivered)) {
                                num5 = null;
                            }
                            num4 = num5;
                        } else {
                            z2 = false;
                        }
                        boolean z6 = (((Boolean) mutableState4.getValue()).booleanValue() && (num2 = (Integer) mutableState17.getValue()) != null && num2.intValue() == 100) ? z : z2;
                        boolean changed6 = gapComposer3.changed((ActivationPhase) mutableState7.getValue());
                        Object rememberedValue28 = gapComposer3.rememberedValue();
                        if (changed6 || rememberedValue28 == neverEqualPolicy3) {
                            if (((ActivationPhase) mutableState7.getValue()) instanceof ActivationPhase.ActivationCompleted) {
                                ActivationPhase activationPhase3 = (ActivationPhase) mutableState7.getValue();
                                activationPhase3.getClass();
                                TagFormFactor resolveSuccessFormFactor = FormLabelKt.resolveSuccessFormFactor(activationPhase3);
                                FidesmoScanningPulseShape resolveScanningPulseShape3 = resolveSuccessFormFactor != null ? FormLabelKt.resolveScanningPulseShape(resolveSuccessFormFactor) : null;
                                if (resolveScanningPulseShape3 == null) {
                                    resolveScanningPulseShape3 = fidesmoScanningPulseShape;
                                }
                                FidesmoScanningPulseShape resolveScanningPulseShape4 = FocusManagerKtKt.resolveScanningPulseShape(fidesmoAnimationDebugOverrides, resolveScanningPulseShape3);
                                TagFormFactor resolveSuccessFormFactor2 = FormLabelKt.resolveSuccessFormFactor((ActivationPhase) mutableState7.getValue());
                                if (resolveSuccessFormFactor2 == null) {
                                    resolveSuccessFormFactor2 = tagFormFactor;
                                }
                                successAnimationInputs = new SuccessAnimationInputs(resolveScanningPulseShape4, resolveSuccessFormFactor2);
                            } else {
                                successAnimationInputs = new SuccessAnimationInputs(fidesmoScanningPulseShape, tagFormFactor);
                            }
                            rememberedValue28 = successAnimationInputs;
                            gapComposer3.updateRememberedValue(rememberedValue28);
                        }
                        SuccessAnimationInputs successAnimationInputs2 = (SuccessAnimationInputs) rememberedValue28;
                        ProvisioningResultSubmission provisioningResultSubmission = (ProvisioningResultSubmission) mutableState2.getValue();
                        FidesmoFlowType fidesmoFlowType4 = fidesmoFlowType2;
                        if (fidesmoFlowType4 == FidesmoFlowType.PROVISION && (!(provisioningResultSubmission instanceof ProvisioningResultSubmission.Succeeded) || ((ProvisioningResultSubmission.Succeeded) provisioningResultSubmission).blockersData.getNextBlockerId() != null)) {
                            z = z2;
                        }
                        ActivationPhase activationPhase4 = (ActivationPhase) mutableState7.getValue();
                        boolean z7 = fidesmoProvisioningPresenter.isActivationRequestInFlight;
                        FidesmoDeviceState fidesmoDeviceState4 = (FidesmoDeviceState.ServiceDelivered) mutableState9.getValue();
                        if (fidesmoDeviceState4 == null) {
                            fidesmoDeviceState4 = (FidesmoDeviceState) mutableState8.getValue();
                        }
                        FidesmoDeviceState fidesmoDeviceState5 = fidesmoDeviceState4;
                        FidesmoScanningPulseShape fidesmoScanningPulseShape3 = successAnimationInputs2.pulseShape;
                        TagFormFactor tagFormFactor3 = successAnimationInputs2.formFactor;
                        boolean booleanValue = ((Boolean) mutableState4.getValue()).booleanValue();
                        boolean booleanValue2 = ((Boolean) mutableState12.getValue()).booleanValue();
                        Integer num6 = num4;
                        boolean areEqual = Intrinsics.areEqual(activationPhase4, activating);
                        FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = fidesmoProvisioningPresenter.flowContext;
                        if (areEqual && z7) {
                            if (Intrinsics.areEqual(fidesmoDeviceState5, FidesmoDeviceState.Disconnected.INSTANCE)) {
                                fidesmoProvisioningFlowContext.logNfcConnectionLost();
                            } else {
                                fidesmoProvisioningPresenter.logSuccessfulReconnectionIfNeeded(fidesmoDeviceState5);
                            }
                        }
                        boolean z8 = activationPhase4 instanceof ActivationPhase.ActivationCompleted;
                        if (z8) {
                            fidesmoProvisioningPresenter.logSuccessfulReconnectionIfNeeded(fidesmoDeviceState5);
                        }
                        boolean areEqual2 = Intrinsics.areEqual(fidesmoDeviceState5, FidesmoDeviceState.NfcUnavailable.INSTANCE);
                        FidesmoProvisioningErrorManager fidesmoProvisioningErrorManager = fidesmoProvisioningPresenter.errorManager;
                        if (areEqual2) {
                            FidesmoProvisioningErrorManager.ErrorModel nfcUnavailable = fidesmoProvisioningErrorManager.nfcUnavailable(str2);
                            NfcScanErrorType nfcScanErrorType = NfcScanErrorType.HARDWARE;
                            fidesmoProvisioningFlowContext.logNfcScanFailed();
                            fidesmoProvisioningPresenter.recordErrorModel$1(nfcUnavailable);
                            ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                            fidesmoProvisioningViewModel = nfcUnavailable.viewModel;
                        } else {
                            boolean z9 = z6;
                            if (Intrinsics.areEqual(fidesmoDeviceState5, FidesmoDeviceState.NfcDisabled.INSTANCE)) {
                                FidesmoProvisioningErrorManager.ErrorModel nfcDisabled = fidesmoProvisioningErrorManager.nfcDisabled(str2, booleanValue2);
                                NfcScanErrorType nfcScanErrorType2 = NfcScanErrorType.HARDWARE;
                                fidesmoProvisioningFlowContext.logNfcScanFailed();
                                fidesmoProvisioningPresenter.recordErrorModel$1(nfcDisabled);
                                ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                                fidesmoProvisioningViewModel = nfcDisabled.viewModel;
                            } else if (fidesmoDeviceState5 instanceof FidesmoDeviceState.Error) {
                                FidesmoProvisioningErrorManager.ErrorModel deviceError = fidesmoProvisioningErrorManager.deviceError((FidesmoDeviceState.Error) fidesmoDeviceState5, z8, fidesmoFlowType4, str2);
                                NfcScanErrorType nfcScanErrorType3 = NfcScanErrorType.HARDWARE;
                                fidesmoProvisioningFlowContext.logNfcScanFailed();
                                fidesmoProvisioningPresenter.recordErrorModel$1(deviceError);
                                ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                                fidesmoProvisioningViewModel = deviceError.viewModel;
                            } else {
                                boolean z10 = activationPhase4 instanceof ActivationPhase.Denied;
                                if (z10) {
                                    fidesmoProvisioningViewModel = fidesmoProvisioningErrorManager.activationDenied(((ActivationPhase.Denied) activationPhase4).errorConfig, str2).viewModel;
                                } else {
                                    boolean z11 = activationPhase4 instanceof ActivationPhase.Failed;
                                    if (!z11) {
                                        ActivationPhase.ActivationCompleted activationCompleted = z8 ? (ActivationPhase.ActivationCompleted) activationPhase4 : null;
                                        if ((activationCompleted != null ? activationCompleted.successScreen : null) == null || (!(booleanValue || (fidesmoDeviceState5 instanceof FidesmoDeviceState.ServiceDelivered)) || (z9 && z))) {
                                            gapComposer = gapComposer3;
                                            NeverEqualPolicy neverEqualPolicy8 = neverEqualPolicy3;
                                            String str13 = str2;
                                            continuation = null;
                                            ResolvedStarPlacement resolvedStarPlacement6 = resolvedStarPlacement2;
                                            scanningStarPlacement = scanningStarPlacement2;
                                            if (Intrinsics.areEqual(activationPhase4, activating)) {
                                                activationResult = ActivationResult.Activating.INSTANCE;
                                            } else if (z8) {
                                                activationResult = new ActivationResult.Completed(((ActivationPhase.ActivationCompleted) activationPhase4).successScreen);
                                            } else if (z10) {
                                                activationResult = new ActivationResult.Denied(((ActivationPhase.Denied) activationPhase4).errorConfig);
                                            } else {
                                                if (!z11) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                activationResult = ActivationResult.Failed.INSTANCE;
                                            }
                                            FidesmoFlowType fidesmoFlowType5 = fidesmoProvisioningScreen.flowType;
                                            FidesmoProvisioningBlocker.ScanningUiConfig scanningUiConfig = fidesmoProvisioningBlocker.scanning;
                                            FidesmoProvisioningBlocker.SuccessUiConfig successUiConfig = fidesmoProvisioningBlocker.success;
                                            FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig2 = fidesmoProvisioningBlocker.pre_scan;
                                            if (preScanUiConfig2 != null) {
                                                helpVideo = preScanUiConfig2.help_video;
                                                num = num6;
                                            } else {
                                                num = num6;
                                                helpVideo = null;
                                            }
                                            Integer num7 = num;
                                            activity4 = activity3;
                                            z3 = false;
                                            ActivationResult activationResult2 = activationResult;
                                            resolvedStarPlacement3 = resolvedStarPlacement6;
                                            neverEqualPolicy4 = neverEqualPolicy8;
                                            postInstructionsViewModel = fidesmoProvisioningPresenter.viewModelMapper.postInstructionsViewModel(activationResult2, fidesmoDeviceState5, fidesmoFlowType5, scanningUiConfig, successUiConfig, str13, scanningStarPlacement, fidesmoScanningPulseShape3, tagFormFactor3, booleanValue2, helpVideo);
                                            if ((postInstructionsViewModel instanceof FidesmoProvisioningViewModel.Scanning.InProgress) && num7 != null) {
                                                postInstructionsViewModel = FidesmoProvisioningViewModel.Scanning.InProgress.copy$default((FidesmoProvisioningViewModel.Scanning.InProgress) postInstructionsViewModel, num7);
                                            }
                                        } else {
                                            String str14 = androidStringManager.get(R.string.fidesmo_provisioning_finishing_title);
                                            activity4 = activity3;
                                            z3 = false;
                                            continuation = null;
                                            gapComposer = gapComposer3;
                                            resolvedStarPlacement3 = resolvedStarPlacement2;
                                            postInstructionsViewModel = new FidesmoProvisioningViewModel.Scanning.InProgress(str14, null, null, num6, 1, 1, str2, scanningStarPlacement2, fidesmoScanningPulseShape3);
                                            scanningStarPlacement = scanningStarPlacement2;
                                            neverEqualPolicy4 = neverEqualPolicy3;
                                        }
                                        FidesmoDeviceState fidesmoDeviceState6 = (FidesmoDeviceState) mutableState8.getValue();
                                        Object obj25 = obj6;
                                        Set set3 = set;
                                        changedInstance4 = gapComposer.changedInstance(postInstructionsViewModel) | gapComposer.changedInstance(obj25) | gapComposer.changedInstance(set3) | gapComposer.changedInstance(fidesmoProvisioningPresenter) | gapComposer.changedInstance(activity4);
                                        Object rememberedValue29 = gapComposer.rememberedValue();
                                        if (!changedInstance4 || rememberedValue29 == neverEqualPolicy4) {
                                            resolvedStarPlacement4 = resolvedStarPlacement3;
                                            gapComposer2 = gapComposer;
                                            fidesmoProvisioningViewModel2 = postInstructionsViewModel;
                                            neverEqualPolicy5 = neverEqualPolicy4;
                                            z4 = z3;
                                            continuation2 = continuation;
                                            FidesmoProvisioningPresenter fidesmoProvisioningPresenter3 = fidesmoProvisioningPresenter;
                                            navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(fidesmoProvisioningViewModel2, activity4, mutableState21, obj25, fidesmoProvisioningPresenter3, set3, (Continuation) null, 8);
                                            fidesmoProvisioningPresenter = fidesmoProvisioningPresenter3;
                                            gapComposer2.updateRememberedValue(navHostKt$NavHost$33$1);
                                        } else {
                                            resolvedStarPlacement4 = resolvedStarPlacement3;
                                            navHostKt$NavHost$33$1 = rememberedValue29;
                                            gapComposer2 = gapComposer;
                                            neverEqualPolicy5 = neverEqualPolicy4;
                                            z4 = z3;
                                            fidesmoProvisioningViewModel2 = postInstructionsViewModel;
                                            continuation2 = continuation;
                                        }
                                        Updater.LaunchedEffect(fidesmoProvisioningViewModel2, fidesmoDeviceState6, (Function2) navHostKt$NavHost$33$1, gapComposer2);
                                        if (!(fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Activating) || (fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Scanning)) {
                                            gapComposer2.startReplaceGroup(1753445606);
                                            changedInstance5 = gapComposer2.changedInstance(scanningStarPlacement) | gapComposer2.changedInstance(fidesmoProvisioningPresenter) | gapComposer2.changedInstance(resolvedStarPlacement4);
                                            rememberedValue15 = gapComposer2.rememberedValue();
                                            if (!changedInstance5 || rememberedValue15 == neverEqualPolicy5) {
                                                rememberedValue15 = new FidesmoProvisioningPresenter$models$6$1(scanningStarPlacement, fidesmoProvisioningPresenter, resolvedStarPlacement4, continuation2);
                                                gapComposer2.updateRememberedValue(rememberedValue15);
                                            }
                                            Updater.LaunchedEffect(gapComposer2, resolvedStarPlacement4, (Function2) rememberedValue15);
                                            gapComposer2.end(z4);
                                        } else {
                                            gapComposer2.startReplaceGroup(1753843460);
                                            gapComposer2.end(z4);
                                        }
                                        gapComposer2.end(z4);
                                        return fidesmoProvisioningViewModel2;
                                    }
                                    FidesmoProvisioningErrorManager.ActivationFailureReason activationFailureReason = ((ActivationPhase.Failed) activationPhase4).reason;
                                    fidesmoProvisioningViewModel = fidesmoProvisioningErrorManager.activationFailed(fidesmoFlowType4, activationFailureReason == FidesmoProvisioningErrorManager.ActivationFailureReason.NOTHING_TO_DEPROVISION ? null : fidesmoProvisioningBlocker.error, activationFailureReason, str2).viewModel;
                                }
                            }
                        }
                        postInstructionsViewModel = fidesmoProvisioningViewModel;
                        gapComposer = gapComposer3;
                        neverEqualPolicy4 = neverEqualPolicy3;
                        scanningStarPlacement = scanningStarPlacement2;
                        activity4 = activity3;
                        z3 = false;
                        continuation = null;
                        resolvedStarPlacement3 = resolvedStarPlacement2;
                        FidesmoDeviceState fidesmoDeviceState62 = (FidesmoDeviceState) mutableState8.getValue();
                        Object obj252 = obj6;
                        Set set32 = set;
                        changedInstance4 = gapComposer.changedInstance(postInstructionsViewModel) | gapComposer.changedInstance(obj252) | gapComposer.changedInstance(set32) | gapComposer.changedInstance(fidesmoProvisioningPresenter) | gapComposer.changedInstance(activity4);
                        Object rememberedValue292 = gapComposer.rememberedValue();
                        if (changedInstance4) {
                        }
                        resolvedStarPlacement4 = resolvedStarPlacement3;
                        gapComposer2 = gapComposer;
                        fidesmoProvisioningViewModel2 = postInstructionsViewModel;
                        neverEqualPolicy5 = neverEqualPolicy4;
                        z4 = z3;
                        continuation2 = continuation;
                        FidesmoProvisioningPresenter fidesmoProvisioningPresenter32 = fidesmoProvisioningPresenter;
                        navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(fidesmoProvisioningViewModel2, activity4, mutableState21, obj252, fidesmoProvisioningPresenter32, set32, (Continuation) null, 8);
                        fidesmoProvisioningPresenter = fidesmoProvisioningPresenter32;
                        gapComposer2.updateRememberedValue(navHostKt$NavHost$33$1);
                        Updater.LaunchedEffect(fidesmoProvisioningViewModel2, fidesmoDeviceState62, (Function2) navHostKt$NavHost$33$1, gapComposer2);
                        if (fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Activating) {
                        }
                        gapComposer2.startReplaceGroup(1753445606);
                        changedInstance5 = gapComposer2.changedInstance(scanningStarPlacement) | gapComposer2.changedInstance(fidesmoProvisioningPresenter) | gapComposer2.changedInstance(resolvedStarPlacement4);
                        rememberedValue15 = gapComposer2.rememberedValue();
                        if (!changedInstance5) {
                        }
                        rememberedValue15 = new FidesmoProvisioningPresenter$models$6$1(scanningStarPlacement, fidesmoProvisioningPresenter, resolvedStarPlacement4, continuation2);
                        gapComposer2.updateRememberedValue(rememberedValue15);
                        Updater.LaunchedEffect(gapComposer2, resolvedStarPlacement4, (Function2) rememberedValue15);
                        gapComposer2.end(z4);
                        gapComposer2.end(z4);
                        return fidesmoProvisioningViewModel2;
                    }
                }
                Resources resources = activity.getResources();
                DisplayMetrics displayMetrics = resources != null ? resources.getDisplayMetrics() : null;
                mutableState = mutableState13;
                NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
                mutableState2 = mutableState15;
                mutableState3 = mutableState16;
                boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager2).peekCurrentValue(LaunchDarklyFeatureFlags$FlipMotorolaNfcAntennaY.INSTANCE)).enabled();
                if (displayMetrics != null) {
                    String str15 = Build.MODEL;
                    resolvedStarPlacement = FidesmoStarPlacementResolverKt.resolveScanningStarPlacement$default(displayMetrics, defaultAdapter, enabled, 8);
                    mutableState4 = mutableState19;
                    mutableState5 = mutableState20;
                } else {
                    mutableState4 = mutableState19;
                    mutableState5 = mutableState20;
                    resolvedStarPlacement = new ResolvedStarPlacement(ScanningStarPlacement.Unknown.INSTANCE, StarPlacementSource.DISPLAY_METRICS_UNAVAILABLE);
                }
                ResolvedStarPlacement applyLocationOverride = FocusManagerKtKt.applyLocationOverride(fidesmoAnimationDebugOverrides2, FocusManagerKtKt.applyAmplitudeStarLocationVariant(resolvedStarPlacement, featureFlagManager2, new g6$$ExternalSyntheticLambda11(displayMetrics, defaultAdapter, enabled, 6)));
                gapComposer3.updateRememberedValue(applyLocationOverride);
                obj2 = applyLocationOverride;
                ResolvedStarPlacement resolvedStarPlacement52 = (ResolvedStarPlacement) obj2;
                ScanningStarPlacement scanningStarPlacement22 = resolvedStarPlacement52.placement;
                FidesmoProvisioningScreen fidesmoProvisioningScreen2 = fidesmoProvisioningPresenter.args;
                FidesmoProvisioningBlocker fidesmoProvisioningBlocker2 = fidesmoProvisioningScreen2.blocker;
                FidesmoFlowType fidesmoFlowType32 = fidesmoProvisioningScreen2.flowType;
                FidesmoProvisioningBlocker.PreScanUiConfig preScanUiConfig3 = fidesmoProvisioningBlocker2.pre_scan;
                if (preScanUiConfig3 == null) {
                }
                if (str7 != null) {
                }
                if (appTagFormFactor2 == null) {
                }
                if (resolveScanningPulseShape != null) {
                }
                resolveScanningPulseShape2 = FocusManagerKtKt.resolveScanningPulseShape(fidesmoAnimationDebugOverrides2, resolveScanningPulseShape);
                if (str7 != null) {
                }
                if (appTagFormFactor == null) {
                }
                changedInstance2 = gapComposer3.changedInstance(obj19) | gapComposer3.changedInstance(set2) | gapComposer3.changedInstance(fidesmoProvisioningPresenter) | gapComposer3.changedInstance(activity) | gapComposer3.changed(rememberUpdatedState);
                Object rememberedValue192 = gapComposer3.rememberedValue();
                if (changedInstance2) {
                }
                fidesmoScanningPulseShape = resolveScanningPulseShape2;
                featureFlagManager = featureFlagManager2;
                fidesmoAnimationDebugOverrides = fidesmoAnimationDebugOverrides2;
                fidesmoFlowType2 = fidesmoFlowType;
                neverEqualPolicy3 = neverEqualPolicy2;
                OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda32 = new OverlayKt$$ExternalSyntheticLambda3(activity, rememberUpdatedState, obj19, fidesmoProvisioningPresenter, set2, 20);
                obj3 = obj19;
                fidesmoProvisioningPresenter = fidesmoProvisioningPresenter;
                gapComposer3.updateRememberedValue(overlayKt$$ExternalSyntheticLambda32);
                obj4 = overlayKt$$ExternalSyntheticLambda32;
                Updater.DisposableEffect(activity, (Function1) obj4, gapComposer3);
                Boolean bool3 = (Boolean) mutableState11.getValue();
                bool3.getClass();
                changedInstance3 = gapComposer3.changedInstance(fidesmoProvisioningPresenter);
                Object rememberedValue202 = gapComposer3.rememberedValue();
                if (changedInstance3) {
                }
                tagFormFactor = appTagFormFactor;
                r15 = 0;
                CheckStatusPresenter.AnonymousClass1.C00611 c006112 = new CheckStatusPresenter.AnonymousClass1.C00611(fidesmoProvisioningPresenter, mutableState11, false ? 1 : 0, 6);
                gapComposer3.updateRememberedValue(c006112);
                obj5 = c006112;
                Updater.LaunchedEffect(activity, bool3, (Function2) obj5, gapComposer3);
                if (((Boolean) mutableState11.getValue()).booleanValue()) {
                }
            }
        }
        str = str5;
        rememberedValue = gapComposer3.rememberedValue();
        Object obj82 = rememberedValue;
        if (rememberedValue == neverEqualPolicy6) {
        }
        MutableState mutableState102 = (MutableState) obj82;
        rememberedValue2 = gapComposer3.rememberedValue();
        Object obj92 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy6) {
        }
        MutableState mutableState112 = (MutableState) obj92;
        rememberedValue3 = gapComposer3.rememberedValue();
        Object obj102 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy6) {
        }
        MutableState mutableState122 = (MutableState) obj102;
        rememberedValue4 = gapComposer3.rememberedValue();
        ActivationPhase.Activating activating2 = ActivationPhase.Activating.INSTANCE;
        Object obj112 = rememberedValue4;
        if (rememberedValue4 == neverEqualPolicy6) {
        }
        MutableState mutableState132 = (MutableState) obj112;
        rememberedValue5 = gapComposer3.rememberedValue();
        Object obj122 = rememberedValue5;
        if (rememberedValue5 == neverEqualPolicy6) {
        }
        MutableState mutableState142 = (MutableState) obj122;
        rememberedValue6 = gapComposer3.rememberedValue();
        Object obj132 = rememberedValue6;
        if (rememberedValue6 == neverEqualPolicy6) {
        }
        MutableState mutableState152 = (MutableState) obj132;
        rememberedValue7 = gapComposer3.rememberedValue();
        Object obj142 = rememberedValue7;
        if (rememberedValue7 == neverEqualPolicy6) {
        }
        MutableState mutableState162 = (MutableState) obj142;
        rememberedValue8 = gapComposer3.rememberedValue();
        Object obj152 = rememberedValue8;
        if (rememberedValue8 == neverEqualPolicy6) {
        }
        MutableState mutableState172 = (MutableState) obj152;
        rememberedValue9 = gapComposer3.rememberedValue();
        Object obj162 = rememberedValue9;
        if (rememberedValue9 == neverEqualPolicy6) {
        }
        MutableState mutableState182 = (MutableState) obj162;
        rememberedValue10 = gapComposer3.rememberedValue();
        Object obj172 = rememberedValue10;
        if (rememberedValue10 == neverEqualPolicy6) {
        }
        MutableState mutableState192 = (MutableState) obj172;
        rememberedValue11 = gapComposer3.rememberedValue();
        Object obj182 = rememberedValue11;
        if (rememberedValue11 == neverEqualPolicy6) {
        }
        MutableState mutableState202 = (MutableState) obj182;
        rememberedValue12 = gapComposer3.rememberedValue();
        if (rememberedValue12 == neverEqualPolicy6) {
        }
        Object obj192 = rememberedValue12;
        rememberedValue13 = gapComposer3.rememberedValue();
        Object obj202 = rememberedValue13;
        if (rememberedValue13 == neverEqualPolicy6) {
        }
        Set set22 = (Set) obj202;
        rememberedValue14 = gapComposer3.rememberedValue();
        Object obj212 = rememberedValue14;
        if (rememberedValue14 == neverEqualPolicy6) {
        }
        MutableState mutableState212 = (MutableState) obj212;
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState((FidesmoShutdownReason) mutableState212.getValue(), gapComposer3);
        Unit unit2 = Unit.INSTANCE;
        changedInstance = gapComposer3.changedInstance(fidesmoProvisioningPresenter) | gapComposer3.changed(collectAsState);
        Object rememberedValue172 = gapComposer3.rememberedValue();
        if (changedInstance) {
        }
        neverEqualPolicy = neverEqualPolicy6;
        FidesmoProvisioningPresenter$models$1$1 fidesmoProvisioningPresenter$models$1$12 = new FidesmoProvisioningPresenter$models$1$1(fidesmoProvisioningPresenter, collectAsState, null);
        gapComposer3.updateRememberedValue(fidesmoProvisioningPresenter$models$1$12);
        obj = fidesmoProvisioningPresenter$models$1$12;
        Updater.LaunchedEffect(gapComposer3, unit2, (Function2) obj);
        String str62 = str;
        NeverEqualPolicy neverEqualPolicy72 = neverEqualPolicy;
        Updater.LaunchedEffect(gapComposer3, flow, new FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, fidesmoProvisioningPresenter, mutableState102, mutableState122, collectAsState, mutableState112, mutableState132, mutableState142, mutableState152, mutableState162, mutableState172, mutableState182, mutableState192, mutableState202, mutableState212, obj192, set22));
        activity = (Activity) mutableState102.getValue();
        if (activity != null) {
        }
    }

    public final void recordErrorModel$1(FidesmoProvisioningErrorManager.ErrorModel errorModel) {
        FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = this.flowContext;
        Analytics analytics = fidesmoProvisioningFlowContext.analytics;
        FidesmoProvisioningErrorManager.JourneySignal journeySignal = errorModel.journeySignal;
        boolean z = journeySignal instanceof FidesmoProvisioningErrorManager.JourneySignal.Friction;
        UserJourney$Name userJourney$Name = this.journeyName;
        UserJourneyTracker userJourneyTracker = this.userJourneyTracker;
        if (z) {
            ((RealUserJourneyTracker) userJourneyTracker).addFrictionSignal(userJourney$Name, UserJourney$Friction$CashTagProvisioning$EligibilityDenied.INSTANCE);
        } else if (journeySignal instanceof FidesmoProvisioningErrorManager.JourneySignal.Frustration) {
            ((RealUserJourneyTracker) userJourneyTracker).addFrustrationSignal(userJourney$Name, ((FidesmoProvisioningErrorManager.JourneySignal.Frustration) journeySignal).signal);
        } else if (journeySignal != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        FidesmoProvisioningError fidesmoProvisioningError = errorModel.provisioningError;
        FailurePhase failurePhase = errorModel.provisioningFailurePhase;
        DeprovisionFailurePhase deprovisionFailurePhase = errorModel.deprovisionFailurePhase;
        FidesmoProvisioningScreen fidesmoProvisioningScreen = this.args;
        if (fidesmoProvisioningError != null) {
            int ordinal = fidesmoProvisioningScreen.flowType.ordinal();
            if (ordinal == 0) {
                failurePhase.getClass();
                fidesmoProvisioningFlowContext.lastFidesmoMessageId = fidesmoProvisioningError.getSdkMessageId();
                String sdkAppId = fidesmoProvisioningError.getSdkAppId();
                if (sdkAppId != null) {
                    fidesmoProvisioningFlowContext.fidesmoAppId = sdkAppId;
                }
                String sdkServiceId = fidesmoProvisioningError.getSdkServiceId();
                if (sdkServiceId != null) {
                    fidesmoProvisioningFlowContext.fidesmoServiceId = sdkServiceId;
                }
                if (!fidesmoProvisioningFlowContext.completionLogged && !fidesmoProvisioningFlowContext.failureLogged) {
                    if (fidesmoProvisioningFlowContext.waitingForReconnection) {
                        fidesmoProvisioningFlowContext.logNfcReconnectionResult(NfcReconnectionOutcome.ABORTED);
                    }
                    fidesmoProvisioningFlowContext.failureLogged = true;
                    String str = fidesmoProvisioningFlowContext.flowToken;
                    ErrorSource access$toProtoErrorSource = DropdownFieldUIKt.access$toProtoErrorSource(fidesmoProvisioningError.getCdfErrorSource());
                    String cdfShortName = fidesmoProvisioningError.getCdfShortName();
                    String sdkMessageText = fidesmoProvisioningError.getSdkMessageText();
                    if (sdkMessageText == null) {
                        sdkMessageText = fidesmoProvisioningError.getCdfShortName();
                    }
                    String str2 = sdkMessageText;
                    Integer num = fidesmoProvisioningFlowContext.currentProgressPercentage;
                    Integer num2 = fidesmoProvisioningFlowContext.currentStepNumber;
                    Integer num3 = fidesmoProvisioningFlowContext.currentTotalSteps;
                    long millisecondsSince = fidesmoProvisioningFlowContext.millisecondsSince(fidesmoProvisioningFlowContext.flowStartTime);
                    String cdfShortName2 = fidesmoProvisioningError.getCdfShortName();
                    String sdkMessageText2 = fidesmoProvisioningError.getSdkMessageText();
                    if (sdkMessageText2 == null) {
                        sdkMessageText2 = fidesmoProvisioningError.getFidesmoMessage();
                    }
                    String journeyToken = fidesmoProvisioningFlowContext.getJourneyToken();
                    String str3 = fidesmoProvisioningFlowContext.tagCIN;
                    boolean isRetryable = fidesmoProvisioningError.isRetryable();
                    String str4 = fidesmoProvisioningFlowContext.lastFidesmoMessageId;
                    String str5 = fidesmoProvisioningFlowContext.fidesmoAppId;
                    String str6 = fidesmoProvisioningFlowContext.fidesmoServiceId;
                    Boolean bool = fidesmoProvisioningFlowContext.useExternalEncryption;
                    String str7 = fidesmoProvisioningFlowContext.tagThemeToken;
                    analytics.track(new CashTagProvisioningProvisionFailed(str, failurePhase, access$toProtoErrorSource, cdfShortName, str2, num, num2, num3, Long.valueOf(millisecondsSince), cdfShortName2, sdkMessageText2, str5, str6, bool, journeyToken, str3, str4, Boolean.valueOf(isRetryable), str7), null);
                }
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                fidesmoProvisioningFlowContext.logDeprovisionFailed(deprovisionFailurePhase, fidesmoProvisioningError);
            }
        } else {
            ProvisioningErrorType provisioningErrorType = errorModel.errorType;
            String str8 = errorModel.fidesmoErrorMessage;
            int ordinal2 = fidesmoProvisioningScreen.flowType.ordinal();
            if (ordinal2 == 0) {
                failurePhase.getClass();
                provisioningErrorType.getClass();
                String str9 = provisioningErrorType.value;
                if (!fidesmoProvisioningFlowContext.completionLogged && !fidesmoProvisioningFlowContext.failureLogged) {
                    if (fidesmoProvisioningFlowContext.waitingForReconnection) {
                        fidesmoProvisioningFlowContext.logNfcReconnectionResult(NfcReconnectionOutcome.ABORTED);
                    }
                    fidesmoProvisioningFlowContext.failureLogged = true;
                    String str10 = fidesmoProvisioningFlowContext.flowToken;
                    ErrorSource errorSource = provisioningErrorType.source;
                    Integer num4 = fidesmoProvisioningFlowContext.currentProgressPercentage;
                    Integer num5 = fidesmoProvisioningFlowContext.currentStepNumber;
                    Integer num6 = fidesmoProvisioningFlowContext.currentTotalSteps;
                    long millisecondsSince2 = fidesmoProvisioningFlowContext.millisecondsSince(fidesmoProvisioningFlowContext.flowStartTime);
                    String journeyToken2 = fidesmoProvisioningFlowContext.getJourneyToken();
                    String str11 = fidesmoProvisioningFlowContext.tagCIN;
                    String str12 = fidesmoProvisioningFlowContext.lastFidesmoMessageId;
                    analytics.track(new CashTagProvisioningProvisionFailed(str10, failurePhase, errorSource, str9, str8, num4, num5, num6, Long.valueOf(millisecondsSince2), str9, str8, fidesmoProvisioningFlowContext.fidesmoAppId, fidesmoProvisioningFlowContext.fidesmoServiceId, fidesmoProvisioningFlowContext.useExternalEncryption, journeyToken2, str11, str12, null, fidesmoProvisioningFlowContext.tagThemeToken), null);
                }
            } else {
                if (ordinal2 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                FidesmoProvisioningFlowContext.logDeprovisionFailed$default(fidesmoProvisioningFlowContext, deprovisionFailurePhase, provisioningErrorType, str8);
            }
        }
        endJourneyIfNeeded$1(UserJourney$Outcome.Failed.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startDeprovisioningFlow$1(FidesmoActivationData fidesmoActivationData, String str, ContinuationImpl continuationImpl) {
        FidesmoProvisioningPresenter$startDeprovisioningFlow$1 fidesmoProvisioningPresenter$startDeprovisioningFlow$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof FidesmoProvisioningPresenter$startDeprovisioningFlow$1) {
            fidesmoProvisioningPresenter$startDeprovisioningFlow$1 = (FidesmoProvisioningPresenter$startDeprovisioningFlow$1) continuationImpl;
            int i2 = fidesmoProvisioningPresenter$startDeprovisioningFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fidesmoProvisioningPresenter$startDeprovisioningFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = fidesmoProvisioningPresenter$startDeprovisioningFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fidesmoProvisioningPresenter$startDeprovisioningFlow$1.label;
                FidesmoProvisioningScreen fidesmoProvisioningScreen = this.args;
                FidesmoProvisioningErrorManager fidesmoProvisioningErrorManager = this.errorManager;
                FidesmoClient fidesmoClient = this.fidesmoClient;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (fidesmoActivationData.installedAppsCount == 0) {
                        FidesmoFlowType fidesmoFlowType = fidesmoProvisioningScreen.flowType;
                        FidesmoProvisioningErrorManager.ActivationFailureReason activationFailureReason = FidesmoProvisioningErrorManager.ActivationFailureReason.NOTHING_TO_DEPROVISION;
                        recordErrorModel$1(fidesmoProvisioningErrorManager.activationFailed(fidesmoFlowType, null, activationFailureReason, str));
                        ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                        return new ActivationPhase.Failed(activationFailureReason);
                    }
                    ((RealFidesmoClient) fidesmoClient).setProvisioningData(null);
                    GetCustomerDetailsForDeprovisioningRequest getCustomerDetailsForDeprovisioningRequest = new GetCustomerDetailsForDeprovisioningRequest();
                    fidesmoProvisioningPresenter$startDeprovisioningFlow$1.L$0 = fidesmoActivationData;
                    fidesmoProvisioningPresenter$startDeprovisioningFlow$1.L$1 = str;
                    fidesmoProvisioningPresenter$startDeprovisioningFlow$1.label = 1;
                    obj = this.paymentTokenDeviceProvisioningService.getCustomerDetailsForDeprovisioning(getCustomerDetailsForDeprovisioningRequest, fidesmoProvisioningPresenter$startDeprovisioningFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = fidesmoProvisioningPresenter$startDeprovisioningFlow$1.L$1;
                    fidesmoActivationData = fidesmoProvisioningPresenter$startDeprovisioningFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    FidesmoFlowType fidesmoFlowType2 = fidesmoProvisioningScreen.flowType;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig = fidesmoProvisioningScreen.blocker.error;
                    FidesmoProvisioningErrorManager.ActivationFailureReason activationFailureReason2 = FidesmoProvisioningErrorManager.ActivationFailureReason.REQUEST_FAILED;
                    recordErrorModel$1(fidesmoProvisioningErrorManager.activationFailed(fidesmoFlowType2, errorUiConfig, activationFailureReason2, str));
                    ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                    return new ActivationPhase.Failed(activationFailureReason2);
                }
                ((RealFidesmoClient) fidesmoClient).setProvisioningData(new FidesmoProvisioningData(fidesmoActivationData.fidesmoId, null, ((GetCustomerDetailsForDeprovisioningResponse) ((ApiResult.Success) apiResult).response).customer_token_hash_email));
                FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = this.flowContext;
                fidesmoProvisioningFlowContext.fidesmoAppId = null;
                fidesmoProvisioningFlowContext.fidesmoServiceId = null;
                fidesmoProvisioningFlowContext.useExternalEncryption = Boolean.FALSE;
                AndroidStringManager androidStringManager = this.stringManager;
                return new ActivationPhase.ActivationCompleted(new SuccessScreen(androidStringManager.get(R.string.fidesmo_deprovisioning_success_highlighted_title), androidStringManager.get(R.string.fidesmo_deprovisioning_success_standard_title), androidStringManager.get(R.string.fidesmo_deprovisioning_success_button), null, EmptyList.INSTANCE, null, ByteString.EMPTY), fidesmoActivationData.fidesmoId, null);
            }
        }
        fidesmoProvisioningPresenter$startDeprovisioningFlow$1 = new FidesmoProvisioningPresenter$startDeprovisioningFlow$1(this, continuationImpl);
        Object obj2 = fidesmoProvisioningPresenter$startDeprovisioningFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fidesmoProvisioningPresenter$startDeprovisioningFlow$1.label;
        FidesmoProvisioningScreen fidesmoProvisioningScreen2 = this.args;
        FidesmoProvisioningErrorManager fidesmoProvisioningErrorManager2 = this.errorManager;
        FidesmoClient fidesmoClient2 = this.fidesmoClient;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startProvisioningFlow(FidesmoActivationData fidesmoActivationData, String str, ContinuationImpl continuationImpl) {
        FidesmoProvisioningPresenter$startProvisioningFlow$1 fidesmoProvisioningPresenter$startProvisioningFlow$1;
        int i;
        String str2;
        boolean z;
        Denied denied;
        AndroidClock androidClock;
        FidesmoProvisioningData fidesmoProvisioningData;
        zzlr zzlrVar;
        Allowed access$getAllowed;
        zzlr zzlrVar2;
        Allowed access$getAllowed2;
        DeviceMetadata deviceMetadata;
        zzlr zzlrVar3;
        Allowed access$getAllowed3;
        zzlr zzlrVar4;
        Allowed access$getAllowed4;
        FidesmoCardEncryptionData fidesmoCardEncryptionData;
        zzlr zzlrVar5;
        FidesmoActivationData fidesmoActivationData2 = fidesmoActivationData;
        FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = this.flowContext;
        AndroidClock androidClock2 = fidesmoProvisioningFlowContext.clock;
        if (continuationImpl instanceof FidesmoProvisioningPresenter$startProvisioningFlow$1) {
            fidesmoProvisioningPresenter$startProvisioningFlow$1 = (FidesmoProvisioningPresenter$startProvisioningFlow$1) continuationImpl;
            int i2 = fidesmoProvisioningPresenter$startProvisioningFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fidesmoProvisioningPresenter$startProvisioningFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = fidesmoProvisioningPresenter$startProvisioningFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fidesmoProvisioningPresenter$startProvisioningFlow$1.label;
                RealObservabilityManager realObservabilityManager = this.observabilityManager;
                FidesmoClient fidesmoClient = this.fidesmoClient;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((RealFidesmoClient) fidesmoClient).setProvisioningData(null);
                    realObservabilityManager.logEvent("fidesmo_provisioning_activation_started", MapsKt__MapsJVMKt.mapOf(new Pair("is_provisioned", Boolean.valueOf(fidesmoActivationData2.isProvisioned))));
                    if (fidesmoProvisioningFlowContext.flowType == FidesmoFlowType.PROVISION) {
                        fidesmoProvisioningFlowContext.eligibilityRequestStartTime = Long.valueOf(androidClock2.millis());
                        fidesmoProvisioningFlowContext.analytics.track(new CashTagProvisioningProvisionEligibilityRequested(fidesmoProvisioningFlowContext.flowToken, fidesmoProvisioningFlowContext.getJourneyToken(), fidesmoProvisioningFlowContext.tagCIN, fidesmoProvisioningFlowContext.tagThemeToken), null);
                    }
                    String str3 = fidesmoActivationData2.fidesmoId;
                    byte[] bArr = fidesmoActivationData2.certificate;
                    FidesmoEncryptionData fidesmoEncryptionData = bArr != null ? new FidesmoEncryptionData(HexExtensionsKt.toHexString$default(bArr), ByteString.EMPTY) : null;
                    Boolean valueOf = Boolean.valueOf(fidesmoActivationData2.isProvisioned);
                    ByteString byteString = ByteString.EMPTY;
                    OnFidesmoProvisioningStartRequest onFidesmoProvisioningStartRequest = new OnFidesmoProvisioningStartRequest(str3, fidesmoEncryptionData, new DeviceProvisioningStatus(valueOf, byteString), null, byteString);
                    fidesmoProvisioningPresenter$startProvisioningFlow$1.L$0 = fidesmoActivationData2;
                    str2 = str;
                    fidesmoProvisioningPresenter$startProvisioningFlow$1.L$1 = str2;
                    fidesmoProvisioningPresenter$startProvisioningFlow$1.label = 1;
                    obj = this.paymentTokenDeviceProvisioningService.onFidesmoProvisioningStart(onFidesmoProvisioningStartRequest, fidesmoProvisioningPresenter$startProvisioningFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = fidesmoProvisioningPresenter$startProvisioningFlow$1.L$1;
                    FidesmoActivationData fidesmoActivationData3 = fidesmoProvisioningPresenter$startProvisioningFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str2 = str4;
                    fidesmoActivationData2 = fidesmoActivationData3;
                }
                ApiResult apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Success;
                FidesmoProvisioningScreen fidesmoProvisioningScreen = this.args;
                FidesmoProvisioningErrorManager fidesmoProvisioningErrorManager = this.errorManager;
                if (z) {
                    String simpleName = Reflection.factory.getOrCreateKotlinClass(apiResult.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "unknown";
                    }
                    realObservabilityManager.logEvent("fidesmo_provisioning_activation_failed", MapsKt__MapsJVMKt.mapOf(new Pair("result_type", simpleName)));
                    fidesmoProvisioningFlowContext.logEligibilityResult(EligibilityDecision.UNSET, "request_failed");
                    FidesmoFlowType fidesmoFlowType = fidesmoProvisioningScreen.flowType;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig = fidesmoProvisioningScreen.blocker.error;
                    FidesmoProvisioningErrorManager.ActivationFailureReason activationFailureReason = FidesmoProvisioningErrorManager.ActivationFailureReason.REQUEST_FAILED;
                    recordErrorModel$1(fidesmoProvisioningErrorManager.activationFailed(fidesmoFlowType, errorUiConfig, activationFailureReason, str2));
                    ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                    return new ActivationPhase.Failed(activationFailureReason);
                }
                OnFidesmoProvisioningStartResponse onFidesmoProvisioningStartResponse = (OnFidesmoProvisioningStartResponse) ((ApiResult.Success) apiResult).response;
                ProvisioningEligibility provisioningEligibility = onFidesmoProvisioningStartResponse.provisioning_eligibility;
                if (provisioningEligibility != null && (zzlrVar5 = provisioningEligibility.decision) != null) {
                    ProvisioningEligibility$Decision$Denied provisioningEligibility$Decision$Denied = zzlrVar5 instanceof ProvisioningEligibility$Decision$Denied ? (ProvisioningEligibility$Decision$Denied) zzlrVar5 : null;
                    if (provisioningEligibility$Decision$Denied != null) {
                        denied = provisioningEligibility$Decision$Denied.value;
                        if (denied == null) {
                            FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig2 = denied.error_ui_config;
                            realObservabilityManager.logEvent("fidesmo_provisioning_activation_denied", MapsKt__MapsJVMKt.mapOf(new Pair("has_error_config", Boolean.valueOf(errorUiConfig2 != null))));
                            fidesmoProvisioningFlowContext.logEligibilityResult(EligibilityDecision.DENIED, "backend_denied");
                            recordErrorModel$1(fidesmoProvisioningErrorManager.activationDenied(errorUiConfig2, str2));
                            ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                            return new ActivationPhase.Denied(errorUiConfig2);
                        }
                        String str5 = fidesmoActivationData2.fidesmoId;
                        if (provisioningEligibility == null || (zzlrVar4 = provisioningEligibility.decision) == null || (access$getAllowed4 = FidesmoProvisioningPresenterKt.access$getAllowed(zzlrVar4)) == null) {
                            androidClock = androidClock2;
                            fidesmoProvisioningData = null;
                        } else {
                            EncryptedCardData encryptedCardData = access$getAllowed4.card_encryption_data;
                            if (encryptedCardData != null) {
                                androidClock = androidClock2;
                                fidesmoCardEncryptionData = new FidesmoCardEncryptionData(encryptedCardData.encrypted_ephemeral_key, encryptedCardData.encrypted_card_info);
                            } else {
                                androidClock = androidClock2;
                                fidesmoCardEncryptionData = null;
                            }
                            fidesmoProvisioningData = new FidesmoProvisioningData(str5, fidesmoCardEncryptionData, access$getAllowed4.customer_token_hash_email);
                        }
                        if (fidesmoProvisioningData == null) {
                            realObservabilityManager.logEvent("fidesmo_provisioning_activation_failed", MapsKt__MapsJVMKt.mapOf(new Pair("result_type", "missing_provisioning_data")));
                            FidesmoFlowType fidesmoFlowType2 = fidesmoProvisioningScreen.flowType;
                            FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig3 = fidesmoProvisioningScreen.blocker.error;
                            FidesmoProvisioningErrorManager.ActivationFailureReason activationFailureReason2 = FidesmoProvisioningErrorManager.ActivationFailureReason.MISSING_PROVISIONING_DATA;
                            recordErrorModel$1(fidesmoProvisioningErrorManager.activationFailed(fidesmoFlowType2, errorUiConfig3, activationFailureReason2, str2));
                            ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                            return new ActivationPhase.Failed(activationFailureReason2);
                        }
                        ((RealFidesmoClient) fidesmoClient).setProvisioningData(fidesmoProvisioningData);
                        boolean z2 = fidesmoProvisioningData.cardEncryptionData != null;
                        fidesmoProvisioningFlowContext.fidesmoAppId = null;
                        fidesmoProvisioningFlowContext.fidesmoServiceId = null;
                        fidesmoProvisioningFlowContext.useExternalEncryption = Boolean.valueOf(z2);
                        ProvisioningEligibility provisioningEligibility2 = onFidesmoProvisioningStartResponse.provisioning_eligibility;
                        realObservabilityManager.logEvent("fidesmo_provisioning_activation_succeeded", MapsKt__MapsJVMKt.mapOf(new Pair("has_success_screen", Boolean.valueOf(((provisioningEligibility2 == null || (zzlrVar3 = provisioningEligibility2.decision) == null || (access$getAllowed3 = FidesmoProvisioningPresenterKt.access$getAllowed(zzlrVar3)) == null) ? null : access$getAllowed3.success_screen) != null))));
                        ProvisioningEligibility provisioningEligibility3 = onFidesmoProvisioningStartResponse.provisioning_eligibility;
                        String str6 = (provisioningEligibility3 == null || (zzlrVar2 = provisioningEligibility3.decision) == null || (access$getAllowed2 = FidesmoProvisioningPresenterKt.access$getAllowed(zzlrVar2)) == null || (deviceMetadata = access$getAllowed2.device_metadata) == null) ? null : deviceMetadata.tag_theme_token;
                        if (str6 != null) {
                            fidesmoProvisioningFlowContext.tagThemeToken = str6;
                        }
                        fidesmoProvisioningFlowContext.logEligibilityResult(EligibilityDecision.ALLOWED, null);
                        fidesmoProvisioningFlowContext.lastStepTime = Long.valueOf(androidClock.millis());
                        ProvisioningEligibility provisioningEligibility4 = onFidesmoProvisioningStartResponse.provisioning_eligibility;
                        return new ActivationPhase.ActivationCompleted((provisioningEligibility4 == null || (zzlrVar = provisioningEligibility4.decision) == null || (access$getAllowed = FidesmoProvisioningPresenterKt.access$getAllowed(zzlrVar)) == null) ? null : access$getAllowed.success_screen, fidesmoActivationData2.fidesmoId, str6);
                    }
                }
                denied = null;
                if (denied == null) {
                }
            }
        }
        fidesmoProvisioningPresenter$startProvisioningFlow$1 = new FidesmoProvisioningPresenter$startProvisioningFlow$1(this, continuationImpl);
        Object obj2 = fidesmoProvisioningPresenter$startProvisioningFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fidesmoProvisioningPresenter$startProvisioningFlow$1.label;
        RealObservabilityManager realObservabilityManager2 = this.observabilityManager;
        FidesmoClient fidesmoClient2 = this.fidesmoClient;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z = apiResult2 instanceof ApiResult.Success;
        FidesmoProvisioningScreen fidesmoProvisioningScreen2 = this.args;
        FidesmoProvisioningErrorManager fidesmoProvisioningErrorManager2 = this.errorManager;
        if (z) {
        }
    }
}
