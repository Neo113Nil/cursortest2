package com.squareup.cash.fidesmo.presenters;

import android.app.Activity;
import android.content.res.Resources;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzaag;
import com.squareup.cash.R;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.cdf.cashtagprovisioning.DeprovisionFailurePhase;
import com.squareup.cash.cdf.cashtagprovisioning.NfcScanErrorType;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ProvisioningPostDisconnectStabilityCheck;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.api.FidesmoActivationData;
import com.squareup.cash.fidesmo.api.FidesmoAnimationDebugOverrides;
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
import com.squareup.cash.fidesmo.screens.FidesmoDeprovisioningScreen;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.paymentpad.presenters.LitePaymentPadPresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.chat.presenters.ChatPresenter$models$$inlined$CollectEffect$1;
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
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.CashAppTagKt;
import com.squareup.cash.wallet.data.RealCashAppTagManager;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.cash.taply.app.v1.GetCustomerDetailsForDeprovisioningRequest;
import com.squareup.protos.cash.taply.app.v1.GetCustomerDetailsForDeprovisioningResponse;
import com.squareup.protos.cash.taply.app.v1.PaymentTokenDeviceProvisioningService;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import com.stripe.android.uicore.FocusManagerKtKt;
import com.stripe.android.uicore.elements.FormLabelKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public final class FidesmoDeprovisioningPresenter implements MoleculePresenter {
    public final FidesmoAnimationDebugOverrides animationDebugOverrides;
    public final FidesmoDeprovisioningScreen args;
    public final RealCashAppTagManager cashAppTagManager;
    public boolean deliveryCompletedLogged;
    public boolean deliveryStartedLogged;
    public final FidesmoProvisioningErrorManager errorManager;
    public final FeatureFlagManager featureFlagManager;
    public final FidesmoClient fidesmoClient;
    public final FidesmoProvisioningFlowContext flowContext;
    public boolean isRetryAttempt;
    public boolean journeyEnded;
    public final UserJourney$Name journeyName;
    public boolean journeyStarted;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final PaymentTokenDeviceProvisioningService paymentTokenDeviceProvisioningService;
    public final RealRouter router;
    public int scanAttempts;
    public final ArrayList stateHistory;
    public final AndroidStringManager stringManager;
    public final RealSupportNavigator supportNavigator;
    public final UserJourneyTracker userJourneyTracker;
    public final FidesmoViewModelMapper viewModelMapper;

    public interface DeprovisionPhase {

        public final class AwaitingTag implements DeprovisionPhase {
            public static final AwaitingTag INSTANCE = new AwaitingTag();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AwaitingTag);
            }

            public final int hashCode() {
                return 493191064;
            }

            public final String toString() {
                return "AwaitingTag";
            }
        }

        public final class Failed implements DeprovisionPhase {
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

        public final class FetchingResetInputs implements DeprovisionPhase {
            public static final FetchingResetInputs INSTANCE = new FetchingResetInputs();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof FetchingResetInputs);
            }

            public final int hashCode() {
                return -1532926854;
            }

            public final String toString() {
                return "FetchingResetInputs";
            }
        }

        public final class ResetSucceeded implements DeprovisionPhase {
            public static final ResetSucceeded INSTANCE = new ResetSucceeded();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ResetSucceeded);
            }

            public final int hashCode() {
                return -1217828056;
            }

            public final String toString() {
                return "ResetSucceeded";
            }
        }

        public final class Resetting implements DeprovisionPhase {
            public static final Resetting INSTANCE = new Resetting();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Resetting);
            }

            public final int hashCode() {
                return 1187485095;
            }

            public final String toString() {
                return "Resetting";
            }
        }
    }

    public FidesmoDeprovisioningPresenter(FidesmoDeprovisioningScreen fidesmoDeprovisioningScreen, BetterNavigator.ScreenNavigator screenNavigator, PaymentTokenDeviceProvisioningService paymentTokenDeviceProvisioningService, FidesmoClient fidesmoClient, RealObservabilityManager realObservabilityManager, AndroidStringManager androidStringManager, RealRouter$Factory$Impl realRouter$Factory$Impl, RealSupportNavigator realSupportNavigator, RealCashAppTagManager realCashAppTagManager, FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext, UserJourneyTracker userJourneyTracker, FidesmoAnimationDebugOverrides fidesmoAnimationDebugOverrides, FeatureFlagManager featureFlagManager) {
        fidesmoDeprovisioningScreen.getClass();
        this.args = fidesmoDeprovisioningScreen;
        this.navigator = screenNavigator;
        this.paymentTokenDeviceProvisioningService = paymentTokenDeviceProvisioningService;
        this.fidesmoClient = fidesmoClient;
        this.observabilityManager = realObservabilityManager;
        this.stringManager = androidStringManager;
        this.supportNavigator = realSupportNavigator;
        this.cashAppTagManager = realCashAppTagManager;
        this.flowContext = fidesmoProvisioningFlowContext;
        this.userJourneyTracker = userJourneyTracker;
        this.animationDebugOverrides = fidesmoAnimationDebugOverrides;
        this.featureFlagManager = featureFlagManager;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.errorManager = new FidesmoProvisioningErrorManager(androidStringManager);
        this.viewModelMapper = new FidesmoViewModelMapper(androidStringManager);
        this.journeyName = UserJourney$Name.CASH_TAG_PROVISIONING;
        this.stateHistory = new ArrayList();
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

    public static final void access$models$shutdownFidesmo(Object obj, FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter, Set set, Activity activity, FidesmoShutdownReason fidesmoShutdownReason) {
        boolean add;
        synchronized (obj) {
            add = set.add(activity);
        }
        if (add) {
            RealFidesmoClient realFidesmoClient = (RealFidesmoClient) fidesmoDeprovisioningPresenter.fidesmoClient;
            fidesmoShutdownReason.getClass();
            realFidesmoClient.shutdown(activity, null, fidesmoShutdownReason);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$startDeprovisioningFlow(FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter, FidesmoActivationData fidesmoActivationData, String str, ContinuationImpl continuationImpl) {
        FidesmoDeprovisioningPresenter$startDeprovisioningFlow$1 fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1;
        int i;
        ApiResult apiResult;
        FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = fidesmoDeprovisioningPresenter.flowContext;
        FidesmoProvisioningErrorManager fidesmoProvisioningErrorManager = fidesmoDeprovisioningPresenter.errorManager;
        FidesmoClient fidesmoClient = fidesmoDeprovisioningPresenter.fidesmoClient;
        if (continuationImpl instanceof FidesmoDeprovisioningPresenter$startDeprovisioningFlow$1) {
            fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1 = (FidesmoDeprovisioningPresenter$startDeprovisioningFlow$1) continuationImpl;
            int i2 = fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (fidesmoActivationData.installedAppsCount == 0) {
                        FidesmoFlowType fidesmoFlowType = FidesmoFlowType.DEPROVISION;
                        FidesmoProvisioningErrorManager.ActivationFailureReason activationFailureReason = FidesmoProvisioningErrorManager.ActivationFailureReason.NOTHING_TO_DEPROVISION;
                        fidesmoDeprovisioningPresenter.recordErrorModel(fidesmoProvisioningErrorManager.activationFailed(fidesmoFlowType, null, activationFailureReason, str));
                        ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                        return new DeprovisionPhase.Failed(activationFailureReason);
                    }
                    ((RealFidesmoClient) fidesmoClient).setProvisioningData(null);
                    PaymentTokenDeviceProvisioningService paymentTokenDeviceProvisioningService = fidesmoDeprovisioningPresenter.paymentTokenDeviceProvisioningService;
                    GetCustomerDetailsForDeprovisioningRequest getCustomerDetailsForDeprovisioningRequest = new GetCustomerDetailsForDeprovisioningRequest();
                    fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1.L$0 = fidesmoActivationData;
                    fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1.L$1 = str;
                    fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1.label = 1;
                    obj = paymentTokenDeviceProvisioningService.getCustomerDetailsForDeprovisioning(getCustomerDetailsForDeprovisioningRequest, fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1.L$1;
                    fidesmoActivationData = fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    FidesmoFlowType fidesmoFlowType2 = FidesmoFlowType.DEPROVISION;
                    FidesmoProvisioningBlocker.ErrorUiConfig errorUiConfig = fidesmoDeprovisioningPresenter.args.blocker.error;
                    FidesmoProvisioningErrorManager.ActivationFailureReason activationFailureReason2 = FidesmoProvisioningErrorManager.ActivationFailureReason.REQUEST_FAILED;
                    fidesmoDeprovisioningPresenter.recordErrorModel(fidesmoProvisioningErrorManager.activationFailed(fidesmoFlowType2, errorUiConfig, activationFailureReason2, str));
                    ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                    return new DeprovisionPhase.Failed(activationFailureReason2);
                }
                ((RealFidesmoClient) fidesmoClient).setProvisioningData(new FidesmoProvisioningData(fidesmoActivationData.fidesmoId, null, ((GetCustomerDetailsForDeprovisioningResponse) ((ApiResult.Success) apiResult).response).customer_token_hash_email));
                fidesmoProvisioningFlowContext.fidesmoAppId = null;
                fidesmoProvisioningFlowContext.fidesmoServiceId = null;
                fidesmoProvisioningFlowContext.useExternalEncryption = Boolean.FALSE;
                fidesmoProvisioningFlowContext.lastStepTime = Long.valueOf(fidesmoProvisioningFlowContext.clock.millis());
                return DeprovisionPhase.Resetting.INSTANCE;
            }
        }
        fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1 = new FidesmoDeprovisioningPresenter$startDeprovisioningFlow$1(fidesmoDeprovisioningPresenter, continuationImpl);
        Object obj2 = fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fidesmoDeprovisioningPresenter$startDeprovisioningFlow$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public final void endJourneyIfNeeded(UserJourney$Outcome.Completed completed) {
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
        ((RealUserJourneyTracker) userJourneyTracker).endJourney(userJourney$Name, completed);
        this.journeyEnded = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027c  */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r16v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.squareup.cash.fidesmo.api.FidesmoDeviceState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [com.squareup.protos.franklin.api.FidesmoProvisioningBlocker$InstructionsUiConfig$Media$ImageUrl] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
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
        boolean changedInstance;
        Object rememberedValue12;
        Object obj;
        Activity activity;
        Object obj2;
        MutableState mutableState;
        MutableState mutableState2;
        ResolvedStarPlacement resolvedStarPlacement;
        TagFormFactor tagFormFactor;
        boolean changedInstance2;
        Object overlayKt$$ExternalSyntheticLambda3;
        FeatureFlagManager featureFlagManager;
        Object obj3;
        Object obj4;
        Set set;
        boolean changedInstance3;
        Object rememberedValue13;
        Continuation continuation;
        boolean booleanValue;
        Object gLSceneScopeProvider$SceneScope$2$1$1;
        Activity activity2;
        ScanningStarPlacement scanningStarPlacement;
        ResolvedStarPlacement resolvedStarPlacement2;
        ?? r11;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        FidesmoClient fidesmoClient;
        Object realIdvPresenter$models$1$1;
        FidesmoDeprovisioningScreen fidesmoDeprovisioningScreen;
        MutableState mutableState6;
        Set set2;
        MutableState mutableState7;
        MutableState mutableState8;
        Activity activity3;
        Object realFidesmoClient$observeDeviceState$1;
        MutableState mutableState9;
        MutableState mutableState10;
        boolean z;
        Object obj5;
        Object obj6;
        boolean z2;
        FidesmoProvisioningViewModel postInstructionsViewModel;
        FidesmoProvisioningViewModel fidesmoProvisioningViewModel;
        boolean changedInstance4;
        Object rememberedValue14;
        ?? r16;
        String str2;
        FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter = this;
        flow.getClass();
        ?? r7 = (GapComposer) composer;
        r7.startReplaceGroup(1928524670);
        Object rememberedValue15 = r7.rememberedValue();
        Object obj7 = Composer.Companion.Empty;
        if (rememberedValue15 == obj7) {
            rememberedValue15 = fidesmoDeprovisioningPresenter.cashAppTagManager.getAllCashAppTags();
            r7.updateRememberedValue(rememberedValue15);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue15, EmptyList.INSTANCE, null, r7, 48, 2);
        List list = (List) collectAsState.getValue();
        AndroidStringManager androidStringManager = fidesmoDeprovisioningPresenter.stringManager;
        String str3 = androidStringManager.get(R.string.fidesmo_tag_default_name);
        CashAppTag currentCashAppTagOrNull = CashAppTagKt.currentCashAppTagOrNull(list);
        if (currentCashAppTagOrNull != null && (str2 = currentCashAppTagOrNull.displayName) != null) {
            if (StringsKt.isBlank(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                str = str2;
                rememberedValue = r7.rememberedValue();
                if (rememberedValue == obj7) {
                    rememberedValue = Updater.mutableStateOf$default(null);
                    r7.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState11 = (MutableState) rememberedValue;
                rememberedValue2 = r7.rememberedValue();
                if (rememberedValue2 == obj7) {
                    rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    r7.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState12 = (MutableState) rememberedValue2;
                rememberedValue3 = r7.rememberedValue();
                if (rememberedValue3 == obj7) {
                    rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                    r7.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState13 = (MutableState) rememberedValue3;
                rememberedValue4 = r7.rememberedValue();
                if (rememberedValue4 == obj7) {
                    rememberedValue4 = Updater.mutableStateOf$default(DeprovisionPhase.AwaitingTag.INSTANCE);
                    r7.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState14 = (MutableState) rememberedValue4;
                rememberedValue5 = r7.rememberedValue();
                if (rememberedValue5 == obj7) {
                    rememberedValue5 = Updater.mutableStateOf$default(null);
                    r7.updateRememberedValue(rememberedValue5);
                }
                MutableState mutableState15 = (MutableState) rememberedValue5;
                rememberedValue6 = r7.rememberedValue();
                if (rememberedValue6 == obj7) {
                    rememberedValue6 = Updater.mutableStateOf$default(null);
                    r7.updateRememberedValue(rememberedValue6);
                }
                MutableState mutableState16 = (MutableState) rememberedValue6;
                rememberedValue7 = r7.rememberedValue();
                if (rememberedValue7 == obj7) {
                    rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
                    r7.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState17 = (MutableState) rememberedValue7;
                rememberedValue8 = r7.rememberedValue();
                if (rememberedValue8 == obj7) {
                    rememberedValue8 = Updater.mutableStateOf$default(null);
                    r7.updateRememberedValue(rememberedValue8);
                }
                MutableState mutableState18 = (MutableState) rememberedValue8;
                rememberedValue9 = r7.rememberedValue();
                if (rememberedValue9 == obj7) {
                    rememberedValue9 = new Object();
                    r7.updateRememberedValue(rememberedValue9);
                }
                Object obj8 = rememberedValue9;
                rememberedValue10 = r7.rememberedValue();
                if (rememberedValue10 == obj7) {
                    rememberedValue10 = Collections.newSetFromMap(new WeakHashMap());
                    r7.updateRememberedValue(rememberedValue10);
                }
                Set set3 = (Set) rememberedValue10;
                rememberedValue11 = r7.rememberedValue();
                if (rememberedValue11 == obj7) {
                    rememberedValue11 = Updater.mutableStateOf$default(FidesmoShutdownReason.STREAM_DISPOSED);
                    r7.updateRememberedValue(rememberedValue11);
                }
                MutableState mutableState19 = (MutableState) rememberedValue11;
                MutableState rememberUpdatedState = Updater.rememberUpdatedState((FidesmoShutdownReason) mutableState19.getValue(), r7);
                Unit unit = Unit.INSTANCE;
                changedInstance = r7.changedInstance(fidesmoDeprovisioningPresenter) | r7.changed(collectAsState);
                rememberedValue12 = r7.rememberedValue();
                if (!changedInstance || rememberedValue12 == obj7) {
                    obj = obj7;
                    rememberedValue12 = new FidesmoDeprovisioningPresenter$models$1$1(fidesmoDeprovisioningPresenter, collectAsState, null);
                    r7.updateRememberedValue(rememberedValue12);
                } else {
                    obj = obj7;
                }
                Updater.LaunchedEffect((Composer) r7, unit, (Function2) rememberedValue12);
                Object obj9 = obj;
                String str4 = str;
                Updater.LaunchedEffect((Composer) r7, flow, new ChatPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, fidesmoDeprovisioningPresenter, mutableState11, mutableState13, mutableState12, mutableState14, mutableState15, mutableState16, mutableState17, mutableState18, collectAsState, mutableState19, obj8, set3));
                activity = (Activity) mutableState11.getValue();
                if (activity != null) {
                    r7.end(false);
                    return FidesmoProvisioningViewModel.Loading.INSTANCE;
                }
                boolean changed = r7.changed(activity);
                Object rememberedValue16 = r7.rememberedValue();
                FidesmoAnimationDebugOverrides fidesmoAnimationDebugOverrides = fidesmoDeprovisioningPresenter.animationDebugOverrides;
                FeatureFlagManager featureFlagManager2 = fidesmoDeprovisioningPresenter.featureFlagManager;
                if (changed) {
                    obj2 = obj9;
                } else {
                    obj2 = obj9;
                    if (rememberedValue16 != obj2) {
                        mutableState = mutableState13;
                        mutableState2 = mutableState18;
                        ResolvedStarPlacement resolvedStarPlacement3 = (ResolvedStarPlacement) rememberedValue16;
                        ScanningStarPlacement scanningStarPlacement2 = resolvedStarPlacement3.placement;
                        List list2 = (List) collectAsState.getValue();
                        list2.getClass();
                        CashAppTag currentCashAppTagOrNull2 = CashAppTagKt.currentCashAppTagOrNull(list2);
                        tagFormFactor = currentCashAppTagOrNull2 == null ? currentCashAppTagOrNull2.formFactor : null;
                        if (tagFormFactor != null || (r2 = FormLabelKt.resolveScanningPulseShape(tagFormFactor)) == null) {
                            FidesmoScanningPulseShape fidesmoScanningPulseShape = FidesmoScanningPulseShape.STAR;
                        }
                        FidesmoScanningPulseShape resolveScanningPulseShape = FocusManagerKtKt.resolveScanningPulseShape(fidesmoAnimationDebugOverrides, fidesmoScanningPulseShape);
                        changedInstance2 = r7.changedInstance(obj8) | r7.changedInstance(set3) | r7.changedInstance(fidesmoDeprovisioningPresenter) | r7.changedInstance(activity) | r7.changed(rememberUpdatedState);
                        Object rememberedValue17 = r7.rememberedValue();
                        if (!changedInstance2 || rememberedValue17 == obj2) {
                            featureFlagManager = featureFlagManager2;
                            obj3 = obj2;
                            overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(activity, rememberUpdatedState, obj8, fidesmoDeprovisioningPresenter, set3, 19);
                            obj4 = obj8;
                            fidesmoDeprovisioningPresenter = fidesmoDeprovisioningPresenter;
                            set = set3;
                            r7.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                        } else {
                            obj3 = obj2;
                            overlayKt$$ExternalSyntheticLambda3 = rememberedValue17;
                            set = set3;
                            obj4 = obj8;
                            featureFlagManager = featureFlagManager2;
                        }
                        Updater.DisposableEffect(activity, (Function1) overlayKt$$ExternalSyntheticLambda3, (Composer) r7);
                        Boolean bool = (Boolean) mutableState12.getValue();
                        bool.booleanValue();
                        changedInstance3 = r7.changedInstance(fidesmoDeprovisioningPresenter);
                        rememberedValue13 = r7.rememberedValue();
                        if (!changedInstance3 || rememberedValue13 == obj3) {
                            continuation = null;
                            rememberedValue13 = new CheckStatusPresenter.AnonymousClass1.C00611(fidesmoDeprovisioningPresenter, mutableState12, continuation, 5);
                            r7.updateRememberedValue(rememberedValue13);
                        } else {
                            continuation = null;
                        }
                        Updater.LaunchedEffect(activity, bool, (Function2) rememberedValue13, r7);
                        booleanValue = ((Boolean) mutableState12.getValue()).booleanValue();
                        FidesmoDeprovisioningScreen fidesmoDeprovisioningScreen2 = fidesmoDeprovisioningPresenter.args;
                        if (booleanValue) {
                            FidesmoProvisioningBlocker.InstructionsUiConfig instructionsUiConfig = fidesmoDeprovisioningScreen2.blocker.instructions;
                            instructionsUiConfig.getClass();
                            String str5 = instructionsUiConfig.title;
                            str5.getClass();
                            ListUnordered listUnordered = instructionsUiConfig.items;
                            List<FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard> list3 = instructionsUiConfig.info_cards;
                            ArrayList arrayList = new ArrayList();
                            for (FidesmoProvisioningBlocker.InstructionsUiConfig.InfoCard infoCard : list3) {
                                String str6 = infoCard.title;
                                Object infoCard2 = str6 == null ? continuation : new FidesmoProvisioningViewModel.PreScanInstructions.InfoCard(infoCard.image_url, str6, infoCard.body);
                                if (infoCard2 != null) {
                                    arrayList.add(infoCard2);
                                }
                            }
                            String str7 = instructionsUiConfig.button_text;
                            str7.getClass();
                            String str8 = instructionsUiConfig.button_pre_scroll_text;
                            FidesmoProvisioningBlocker.InstructionsUiConfig.Media media = instructionsUiConfig.media;
                            if (media != null) {
                                ?? r6 = media instanceof FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl ? (FidesmoProvisioningBlocker.InstructionsUiConfig.Media.ImageUrl) media : continuation;
                                r16 = r6 != 0 ? r6.getValue() : continuation;
                            } else {
                                r16 = continuation;
                            }
                            FidesmoProvisioningViewModel.PreScanInstructions preScanInstructions = new FidesmoProvisioningViewModel.PreScanInstructions(str5, listUnordered, arrayList, str7, str8, r16, instructionsUiConfig.disclosure_text);
                            r7.end(false);
                            return preScanInstructions;
                        }
                        boolean changedInstance5 = r7.changedInstance(fidesmoDeprovisioningPresenter) | r7.changedInstance(scanningStarPlacement2) | r7.changedInstance(resolvedStarPlacement3);
                        Object rememberedValue18 = r7.rememberedValue();
                        if (changedInstance5 || rememberedValue18 == obj3) {
                            Continuation continuation2 = continuation;
                            activity2 = activity;
                            FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter2 = fidesmoDeprovisioningPresenter;
                            gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1(fidesmoDeprovisioningPresenter2, scanningStarPlacement2, resolvedStarPlacement3, continuation2, 15);
                            scanningStarPlacement = scanningStarPlacement2;
                            resolvedStarPlacement2 = resolvedStarPlacement3;
                            r11 = continuation2;
                            fidesmoDeprovisioningPresenter = fidesmoDeprovisioningPresenter2;
                            r7.updateRememberedValue(gLSceneScopeProvider$SceneScope$2$1$1);
                        } else {
                            gLSceneScopeProvider$SceneScope$2$1$1 = rememberedValue18;
                            resolvedStarPlacement2 = resolvedStarPlacement3;
                            scanningStarPlacement = scanningStarPlacement2;
                            activity2 = activity;
                            r11 = continuation;
                        }
                        Updater.LaunchedEffect((Composer) r7, resolvedStarPlacement2, (Function2) gLSceneScopeProvider$SceneScope$2$1$1);
                        boolean changed2 = r7.changed(activity2);
                        Object rememberedValue19 = r7.rememberedValue();
                        FidesmoClient fidesmoClient2 = fidesmoDeprovisioningPresenter.fidesmoClient;
                        if (changed2 || rememberedValue19 == obj3) {
                            rememberedValue19 = ((RealFidesmoClient) fidesmoClient2).observeDeviceState(activity2, FidesmoServiceType.UNINSTALL);
                            r7.updateRememberedValue(rememberedValue19);
                        }
                        StateFlow stateFlow = (StateFlow) rememberedValue19;
                        boolean z3 = true;
                        MutableState collectAsState2 = Updater.collectAsState(stateFlow, r11, r7, 1);
                        if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ProvisioningPostDisconnectStabilityCheck.INSTANCE)).enabled() || ((Boolean) mutableState17.getValue()).booleanValue() || (!(((FidesmoDeviceState) collectAsState2.getValue()) instanceof FidesmoDeviceState.Disconnected) && !(((FidesmoDeviceState) collectAsState2.getValue()) instanceof FidesmoDeviceState.Connected) && !(((FidesmoDeviceState) collectAsState2.getValue()) instanceof FidesmoDeviceState.CheckingStability))) {
                            z3 = false;
                        }
                        Integer num = (Integer) mutableState16.getValue();
                        Boolean bool2 = (Boolean) mutableState17.getValue();
                        bool2.booleanValue();
                        Boolean valueOf = Boolean.valueOf(z3);
                        boolean changed3 = r7.changed(z3);
                        boolean z4 = z3;
                        Object rememberedValue20 = r7.rememberedValue();
                        if (changed3 || rememberedValue20 == obj3) {
                            rememberedValue20 = new FidesmoProvisioningPresenter$models$7$1(z4, mutableState16, mutableState15, mutableState17, (Continuation) null, 1);
                            r7.updateRememberedValue(rememberedValue20);
                        }
                        Updater.LaunchedEffect(num, bool2, valueOf, (Function2) rememberedValue20, r7);
                        FidesmoDeviceState fidesmoDeviceState = (FidesmoDeviceState) collectAsState2.getValue();
                        boolean changed4 = r7.changed(collectAsState2);
                        Object rememberedValue21 = r7.rememberedValue();
                        if (changed4 || rememberedValue21 == obj3) {
                            mutableState3 = collectAsState2;
                            rememberedValue21 = new LitePaymentPadPresenter$models$1$1(mutableState3, mutableState2, mutableState15, mutableState16, mutableState17, null, 1);
                            mutableState4 = mutableState15;
                            mutableState5 = mutableState17;
                            r7.updateRememberedValue(rememberedValue21);
                        } else {
                            mutableState3 = collectAsState2;
                            mutableState4 = mutableState15;
                            mutableState5 = mutableState17;
                        }
                        Updater.LaunchedEffect((Composer) r7, fidesmoDeviceState, (Function2) rememberedValue21);
                        Boolean bool3 = (Boolean) mutableState5.getValue();
                        bool3.getClass();
                        Integer num2 = (Integer) mutableState4.getValue();
                        Object rememberedValue22 = r7.rememberedValue();
                        if (rememberedValue22 == obj3) {
                            fidesmoClient = fidesmoClient2;
                            rememberedValue22 = new GLSceneScopeProvider$SceneScope$2$1$1(mutableState5, mutableState4, mutableState14, (Continuation) null);
                            r7.updateRememberedValue(rememberedValue22);
                        } else {
                            fidesmoClient = fidesmoClient2;
                        }
                        Updater.LaunchedEffect(bool3, num2, (Function2) rememberedValue22, r7);
                        String str9 = str4;
                        boolean changedInstance6 = r7.changedInstance(stateFlow) | r7.changedInstance(fidesmoDeprovisioningPresenter) | r7.changedInstance(activity2) | r7.changed(str9);
                        Object rememberedValue23 = r7.rememberedValue();
                        if (changedInstance6 || rememberedValue23 == obj3) {
                            fidesmoDeprovisioningScreen = fidesmoDeprovisioningScreen2;
                            mutableState6 = mutableState5;
                            Activity activity4 = activity2;
                            set2 = set;
                            mutableState7 = mutableState14;
                            mutableState8 = mutableState3;
                            realIdvPresenter$models$1$1 = new RealIdvPresenter$models$1$1(stateFlow, mutableState7, fidesmoDeprovisioningPresenter, activity4, str9, (Continuation) null, 28);
                            activity3 = activity4;
                            r7.updateRememberedValue(realIdvPresenter$models$1$1);
                        } else {
                            realIdvPresenter$models$1$1 = rememberedValue23;
                            mutableState6 = mutableState5;
                            fidesmoDeprovisioningScreen = fidesmoDeprovisioningScreen2;
                            activity3 = activity2;
                            mutableState7 = mutableState14;
                            mutableState8 = mutableState3;
                            set2 = set;
                        }
                        Updater.LaunchedEffect((Composer) r7, activity3, (Function2) realIdvPresenter$models$1$1);
                        boolean changed5 = r7.changed(mutableState8) | r7.changedInstance(fidesmoDeprovisioningPresenter) | r7.changed(str9);
                        Object rememberedValue24 = r7.rememberedValue();
                        if (changed5 || rememberedValue24 == obj3) {
                            mutableState9 = mutableState8;
                            realFidesmoClient$observeDeviceState$1 = new RealFidesmoClient$observeDeviceState$1(mutableState9, mutableState7, fidesmoDeprovisioningPresenter, str9, null, 20);
                            str9 = str9;
                            r7.updateRememberedValue(realFidesmoClient$observeDeviceState$1);
                        } else {
                            realFidesmoClient$observeDeviceState$1 = rememberedValue24;
                            mutableState9 = mutableState8;
                        }
                        Updater.LaunchedEffect((Composer) r7, unit, (Function2) realFidesmoClient$observeDeviceState$1);
                        Integer num3 = (Integer) mutableState4.getValue();
                        FidesmoDeviceState.Connected connected = FidesmoDeviceState.Connected.INSTANCE;
                        DeprovisionPhase.Resetting resetting = DeprovisionPhase.Resetting.INSTANCE;
                        FidesmoDeviceState.PreparingDelivery preparingDelivery = FidesmoDeviceState.PreparingDelivery.INSTANCE;
                        if (num3 == null) {
                            FidesmoDeviceState fidesmoDeviceState2 = (FidesmoDeviceState) mutableState9.getValue();
                            DeprovisionPhase deprovisionPhase = (DeprovisionPhase) mutableState7.getValue();
                            z = false;
                            Integer num4 = 0;
                            if (Intrinsics.areEqual(fidesmoDeviceState2, preparingDelivery)) {
                                mutableState10 = mutableState9;
                            } else {
                                mutableState10 = mutableState9;
                                if (!(fidesmoDeviceState2 instanceof FidesmoDeviceState.DeliveringService) && ((!Intrinsics.areEqual(deprovisionPhase, resetting) || !Intrinsics.areEqual(fidesmoDeviceState2, connected)) && (!Intrinsics.areEqual(deprovisionPhase, resetting) || !(fidesmoDeviceState2 instanceof FidesmoDeviceState.ServiceDelivered)))) {
                                    num4 = null;
                                }
                            }
                            num3 = num4;
                        } else {
                            mutableState10 = mutableState9;
                            z = false;
                        }
                        DeprovisionPhase deprovisionPhase2 = (DeprovisionPhase) mutableState7.getValue();
                        ?? r2 = (FidesmoDeviceState) mutableState10.getValue();
                        boolean booleanValue2 = ((Boolean) mutableState6.getValue()).booleanValue();
                        Boolean bool4 = (Boolean) mutableState.getValue();
                        Integer num5 = num3;
                        boolean booleanValue3 = bool4.booleanValue();
                        if (Intrinsics.areEqual(deprovisionPhase2, DeprovisionPhase.ResetSucceeded.INSTANCE)) {
                            fidesmoProvisioningViewModel = new FidesmoProvisioningViewModel.Success.Deprovisioned(androidStringManager.get(R.string.fidesmo_deprovisioning_success_highlighted_title), androidStringManager.get(R.string.fidesmo_deprovisioning_success_standard_title), androidStringManager.get(R.string.fidesmo_deprovisioning_success_button));
                        } else {
                            boolean areEqual = Intrinsics.areEqual((Object) r2, FidesmoDeviceState.NfcUnavailable.INSTANCE);
                            FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = fidesmoDeprovisioningPresenter.flowContext;
                            FidesmoProvisioningErrorManager fidesmoProvisioningErrorManager = fidesmoDeprovisioningPresenter.errorManager;
                            if (areEqual) {
                                FidesmoProvisioningErrorManager.ErrorModel nfcUnavailable = fidesmoProvisioningErrorManager.nfcUnavailable(str9);
                                NfcScanErrorType nfcScanErrorType = NfcScanErrorType.HARDWARE;
                                fidesmoProvisioningFlowContext.logNfcScanFailed();
                                fidesmoDeprovisioningPresenter.recordErrorModel(nfcUnavailable);
                                ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                                fidesmoProvisioningViewModel = nfcUnavailable.viewModel;
                            } else if (Intrinsics.areEqual((Object) r2, FidesmoDeviceState.NfcDisabled.INSTANCE)) {
                                FidesmoProvisioningErrorManager.ErrorModel nfcDisabled = fidesmoProvisioningErrorManager.nfcDisabled(str9, booleanValue3);
                                NfcScanErrorType nfcScanErrorType2 = NfcScanErrorType.HARDWARE;
                                fidesmoProvisioningFlowContext.logNfcScanFailed();
                                fidesmoDeprovisioningPresenter.recordErrorModel(nfcDisabled);
                                ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                                fidesmoProvisioningViewModel = nfcDisabled.viewModel;
                            } else if (r2 instanceof FidesmoDeviceState.Error) {
                                FidesmoProvisioningErrorManager.ErrorModel deviceError = fidesmoProvisioningErrorManager.deviceError((FidesmoDeviceState.Error) r2, Intrinsics.areEqual(deprovisionPhase2, resetting), FidesmoFlowType.DEPROVISION, str9);
                                NfcScanErrorType nfcScanErrorType3 = NfcScanErrorType.HARDWARE;
                                fidesmoProvisioningFlowContext.logNfcScanFailed();
                                fidesmoDeprovisioningPresenter.recordErrorModel(deviceError);
                                ((RealFidesmoClient) fidesmoClient).incrementActiveConnectionId();
                                fidesmoProvisioningViewModel = deviceError.viewModel;
                            } else if (r2 instanceof FidesmoDeviceState.ServiceDeliveryFailed) {
                                fidesmoProvisioningViewModel = fidesmoProvisioningErrorManager.serviceDeliveryFailed((FidesmoDeviceState.ServiceDeliveryFailed) r2, FidesmoFlowType.DEPROVISION, str9).viewModel;
                            } else {
                                if (!(deprovisionPhase2 instanceof DeprovisionPhase.Failed)) {
                                    if (Intrinsics.areEqual(deprovisionPhase2, resetting) && (booleanValue2 || (r2 instanceof FidesmoDeviceState.ServiceDelivered))) {
                                        z2 = z;
                                        String str10 = str9;
                                        obj5 = obj3;
                                        obj6 = obj4;
                                        postInstructionsViewModel = new FidesmoProvisioningViewModel.Scanning.InProgress(androidStringManager.get(R.string.fidesmo_deprovisioning_finishing_title), null, null, num5, 1, 1, str10, scanningStarPlacement, resolveScanningPulseShape);
                                    } else {
                                        String str11 = str9;
                                        obj5 = obj3;
                                        obj6 = obj4;
                                        z2 = z;
                                        postInstructionsViewModel = fidesmoDeprovisioningPresenter.viewModelMapper.postInstructionsViewModel(Intrinsics.areEqual(deprovisionPhase2, resetting) ? new ActivationResult.Completed(null) : ActivationResult.Activating.INSTANCE, (Intrinsics.areEqual(deprovisionPhase2, resetting) && Intrinsics.areEqual((Object) r2, connected)) ? preparingDelivery : r2, FidesmoFlowType.DEPROVISION, fidesmoDeprovisioningScreen.blocker.scanning, null, str11, scanningStarPlacement, resolveScanningPulseShape, TagFormFactor.WAND, booleanValue3, null);
                                        if ((postInstructionsViewModel instanceof FidesmoProvisioningViewModel.Scanning.InProgress) && num5 != null) {
                                            postInstructionsViewModel = FidesmoProvisioningViewModel.Scanning.InProgress.copy$default((FidesmoProvisioningViewModel.Scanning.InProgress) postInstructionsViewModel, num5);
                                        }
                                    }
                                    FidesmoDeviceState fidesmoDeviceState3 = (FidesmoDeviceState) mutableState10.getValue();
                                    changedInstance4 = r7.changedInstance(postInstructionsViewModel) | r7.changedInstance(obj6) | r7.changedInstance(set2) | r7.changedInstance(fidesmoDeprovisioningPresenter) | r7.changedInstance(activity3);
                                    rememberedValue14 = r7.rememberedValue();
                                    if (!changedInstance4 || rememberedValue14 == obj5) {
                                        NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(postInstructionsViewModel, activity3, mutableState19, obj6, fidesmoDeprovisioningPresenter, set2, (Continuation) null, 7);
                                        r7.updateRememberedValue(navHostKt$NavHost$33$1);
                                        rememberedValue14 = navHostKt$NavHost$33$1;
                                    }
                                    Updater.LaunchedEffect(postInstructionsViewModel, fidesmoDeviceState3, (Function2) rememberedValue14, r7);
                                    r7.end(z2);
                                    return postInstructionsViewModel;
                                }
                                FidesmoProvisioningErrorManager.ActivationFailureReason activationFailureReason = ((DeprovisionPhase.Failed) deprovisionPhase2).reason;
                                fidesmoProvisioningViewModel = fidesmoProvisioningErrorManager.activationFailed(FidesmoFlowType.DEPROVISION, activationFailureReason == FidesmoProvisioningErrorManager.ActivationFailureReason.NOTHING_TO_DEPROVISION ? null : fidesmoDeprovisioningScreen.blocker.error, activationFailureReason, str9).viewModel;
                            }
                        }
                        postInstructionsViewModel = fidesmoProvisioningViewModel;
                        obj5 = obj3;
                        obj6 = obj4;
                        z2 = z;
                        FidesmoDeviceState fidesmoDeviceState32 = (FidesmoDeviceState) mutableState10.getValue();
                        changedInstance4 = r7.changedInstance(postInstructionsViewModel) | r7.changedInstance(obj6) | r7.changedInstance(set2) | r7.changedInstance(fidesmoDeprovisioningPresenter) | r7.changedInstance(activity3);
                        rememberedValue14 = r7.rememberedValue();
                        if (!changedInstance4) {
                        }
                        NavHostKt$NavHost$33$1 navHostKt$NavHost$33$12 = new NavHostKt$NavHost$33$1(postInstructionsViewModel, activity3, mutableState19, obj6, fidesmoDeprovisioningPresenter, set2, (Continuation) null, 7);
                        r7.updateRememberedValue(navHostKt$NavHost$33$12);
                        rememberedValue14 = navHostKt$NavHost$33$12;
                        Updater.LaunchedEffect(postInstructionsViewModel, fidesmoDeviceState32, (Function2) rememberedValue14, r7);
                        r7.end(z2);
                        return postInstructionsViewModel;
                    }
                }
                Resources resources = activity.getResources();
                DisplayMetrics displayMetrics = resources != null ? resources.getDisplayMetrics() : null;
                NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
                if (displayMetrics != null) {
                    String str12 = Build.MODEL;
                    mutableState = mutableState13;
                    mutableState2 = mutableState18;
                    resolvedStarPlacement = FidesmoStarPlacementResolverKt.resolveScanningStarPlacement$default(displayMetrics, null, false, 24);
                } else {
                    mutableState = mutableState13;
                    mutableState2 = mutableState18;
                    resolvedStarPlacement = new ResolvedStarPlacement(ScanningStarPlacement.Unknown.INSTANCE, StarPlacementSource.DISPLAY_METRICS_UNAVAILABLE);
                }
                rememberedValue16 = FocusManagerKtKt.applyLocationOverride(fidesmoAnimationDebugOverrides, FocusManagerKtKt.applyAmplitudeStarLocationVariant(resolvedStarPlacement, featureFlagManager2, new GLSceneScope$$ExternalSyntheticLambda4(10, displayMetrics, defaultAdapter)));
                r7.updateRememberedValue(rememberedValue16);
                ResolvedStarPlacement resolvedStarPlacement32 = (ResolvedStarPlacement) rememberedValue16;
                ScanningStarPlacement scanningStarPlacement22 = resolvedStarPlacement32.placement;
                List list22 = (List) collectAsState.getValue();
                list22.getClass();
                CashAppTag currentCashAppTagOrNull22 = CashAppTagKt.currentCashAppTagOrNull(list22);
                if (currentCashAppTagOrNull22 == null) {
                }
                if (tagFormFactor != null) {
                }
                FidesmoScanningPulseShape fidesmoScanningPulseShape2 = FidesmoScanningPulseShape.STAR;
                FidesmoScanningPulseShape resolveScanningPulseShape2 = FocusManagerKtKt.resolveScanningPulseShape(fidesmoAnimationDebugOverrides, fidesmoScanningPulseShape2);
                changedInstance2 = r7.changedInstance(obj8) | r7.changedInstance(set3) | r7.changedInstance(fidesmoDeprovisioningPresenter) | r7.changedInstance(activity) | r7.changed(rememberUpdatedState);
                Object rememberedValue172 = r7.rememberedValue();
                if (changedInstance2) {
                }
                featureFlagManager = featureFlagManager2;
                obj3 = obj2;
                overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(activity, rememberUpdatedState, obj8, fidesmoDeprovisioningPresenter, set3, 19);
                obj4 = obj8;
                fidesmoDeprovisioningPresenter = fidesmoDeprovisioningPresenter;
                set = set3;
                r7.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                Updater.DisposableEffect(activity, (Function1) overlayKt$$ExternalSyntheticLambda3, (Composer) r7);
                Boolean bool5 = (Boolean) mutableState12.getValue();
                bool5.booleanValue();
                changedInstance3 = r7.changedInstance(fidesmoDeprovisioningPresenter);
                rememberedValue13 = r7.rememberedValue();
                if (changedInstance3) {
                }
                continuation = null;
                rememberedValue13 = new CheckStatusPresenter.AnonymousClass1.C00611(fidesmoDeprovisioningPresenter, mutableState12, continuation, 5);
                r7.updateRememberedValue(rememberedValue13);
                Updater.LaunchedEffect(activity, bool5, (Function2) rememberedValue13, r7);
                booleanValue = ((Boolean) mutableState12.getValue()).booleanValue();
                FidesmoDeprovisioningScreen fidesmoDeprovisioningScreen22 = fidesmoDeprovisioningPresenter.args;
                if (booleanValue) {
                }
            }
        }
        str = str3;
        rememberedValue = r7.rememberedValue();
        if (rememberedValue == obj7) {
        }
        MutableState mutableState112 = (MutableState) rememberedValue;
        rememberedValue2 = r7.rememberedValue();
        if (rememberedValue2 == obj7) {
        }
        MutableState mutableState122 = (MutableState) rememberedValue2;
        rememberedValue3 = r7.rememberedValue();
        if (rememberedValue3 == obj7) {
        }
        MutableState mutableState132 = (MutableState) rememberedValue3;
        rememberedValue4 = r7.rememberedValue();
        if (rememberedValue4 == obj7) {
        }
        MutableState mutableState142 = (MutableState) rememberedValue4;
        rememberedValue5 = r7.rememberedValue();
        if (rememberedValue5 == obj7) {
        }
        MutableState mutableState152 = (MutableState) rememberedValue5;
        rememberedValue6 = r7.rememberedValue();
        if (rememberedValue6 == obj7) {
        }
        MutableState mutableState162 = (MutableState) rememberedValue6;
        rememberedValue7 = r7.rememberedValue();
        if (rememberedValue7 == obj7) {
        }
        MutableState mutableState172 = (MutableState) rememberedValue7;
        rememberedValue8 = r7.rememberedValue();
        if (rememberedValue8 == obj7) {
        }
        MutableState mutableState182 = (MutableState) rememberedValue8;
        rememberedValue9 = r7.rememberedValue();
        if (rememberedValue9 == obj7) {
        }
        Object obj82 = rememberedValue9;
        rememberedValue10 = r7.rememberedValue();
        if (rememberedValue10 == obj7) {
        }
        Set set32 = (Set) rememberedValue10;
        rememberedValue11 = r7.rememberedValue();
        if (rememberedValue11 == obj7) {
        }
        MutableState mutableState192 = (MutableState) rememberedValue11;
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState((FidesmoShutdownReason) mutableState192.getValue(), r7);
        Unit unit2 = Unit.INSTANCE;
        changedInstance = r7.changedInstance(fidesmoDeprovisioningPresenter) | r7.changed(collectAsState);
        rememberedValue12 = r7.rememberedValue();
        if (changedInstance) {
        }
        obj = obj7;
        rememberedValue12 = new FidesmoDeprovisioningPresenter$models$1$1(fidesmoDeprovisioningPresenter, collectAsState, null);
        r7.updateRememberedValue(rememberedValue12);
        Updater.LaunchedEffect((Composer) r7, unit2, (Function2) rememberedValue12);
        Object obj92 = obj;
        String str42 = str;
        Updater.LaunchedEffect((Composer) r7, flow, new ChatPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, fidesmoDeprovisioningPresenter, mutableState112, mutableState132, mutableState122, mutableState142, mutableState152, mutableState162, mutableState172, mutableState182, collectAsState, mutableState192, obj82, set32));
        activity = (Activity) mutableState112.getValue();
        if (activity != null) {
        }
    }

    public final void recordErrorModel(FidesmoProvisioningErrorManager.ErrorModel errorModel) {
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
        DeprovisionFailurePhase deprovisionFailurePhase = errorModel.deprovisionFailurePhase;
        FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = this.flowContext;
        if (fidesmoProvisioningError != null) {
            fidesmoProvisioningFlowContext.logDeprovisionFailed(deprovisionFailurePhase, fidesmoProvisioningError);
        } else {
            FidesmoProvisioningFlowContext.logDeprovisionFailed$default(fidesmoProvisioningFlowContext, deprovisionFailurePhase, errorModel.errorType, errorModel.fidesmoErrorMessage);
        }
        endJourneyIfNeeded(UserJourney$Outcome.Failed.INSTANCE);
    }
}
