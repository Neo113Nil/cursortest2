package com.squareup.cash.fidesmo.presenters;

import android.os.Build;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningDeprovisionCompleted;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningDeprovisionFailed;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningDeprovisionFlowDismissed;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningDeprovisionFlowStarted;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningDeprovisionNfcConnectionLost;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningDeprovisionNfcReconnectionResult;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningDeprovisionNfcScanCompleted;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningDeprovisionNfcScanFailed;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningDeprovisionNfcScanStarted;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningDeprovisionStepCompleted;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionCompleted;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionDeliveryStarted;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionEligibilityResult;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionFlowDismissed;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionFlowStarted;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionNfcConnectionLost;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionNfcReconnectionResult;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionNfcScanCompleted;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionNfcScanFailed;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionNfcScanStarted;
import com.squareup.cash.cdf.cashtagprovisioning.CashTagProvisioningProvisionStepCompleted;
import com.squareup.cash.cdf.cashtagprovisioning.DeprovisionFailurePhase;
import com.squareup.cash.cdf.cashtagprovisioning.DeviceType;
import com.squareup.cash.cdf.cashtagprovisioning.EligibilityDecision;
import com.squareup.cash.cdf.cashtagprovisioning.ErrorSource;
import com.squareup.cash.cdf.cashtagprovisioning.NfcReconnectionOutcome;
import com.squareup.cash.cdf.cashtagprovisioning.NfcScanErrorType;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningError;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.userjourneys.tracker.ActiveUserJourney;
import com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourneySignalProcessor;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.stripe.android.uicore.elements.DropdownFieldUIKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FidesmoProvisioningFlowContext {
    public final Analytics analytics;
    public boolean assignedLocationLogged;
    public final AndroidClock clock;
    public boolean completionLogged;
    public Integer currentProgressPercentage;
    public Integer currentStepNumber;
    public Integer currentTotalSteps;
    public boolean deliveryStartedLogged;
    public boolean dismissalLogged;
    public Long eligibilityRequestStartTime;
    public boolean failureLogged;
    public String fidesmoAppId;
    public String fidesmoServiceId;
    public Long flowStartTime;
    public int installedAppsCount;
    public String lastFidesmoMessageId;
    public Pair lastLoggedStep;
    public Long lastStepTime;
    public int reconnectionAttemptNumber;
    public Long reconnectionStartTime;
    public int scanAttemptNumber;
    public Long scanStartTime;
    public String tagCIN;
    public String tagThemeToken;
    public int totalStepsCompleted;
    public Boolean useExternalEncryption;
    public final UserJourneyTracker userJourneyTracker;
    public boolean waitingForReconnection;
    public String flowToken = Boxes$$ExternalSyntheticOutline1.m();
    public FidesmoFlowType flowType = FidesmoFlowType.PROVISION;
    public final LinkedHashSet completedStepNumbers = new LinkedHashSet();

    public FidesmoProvisioningFlowContext(Analytics analytics, AndroidClock androidClock, UserJourneyTracker userJourneyTracker) {
        this.analytics = analytics;
        this.clock = androidClock;
        this.userJourneyTracker = userJourneyTracker;
    }

    public static void logDeprovisionFailed$default(FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext, DeprovisionFailurePhase deprovisionFailurePhase, ProvisioningErrorType provisioningErrorType, String str) {
        deprovisionFailurePhase.getClass();
        provisioningErrorType.getClass();
        String str2 = provisioningErrorType.value;
        if (fidesmoProvisioningFlowContext.completionLogged || fidesmoProvisioningFlowContext.failureLogged) {
            return;
        }
        if (fidesmoProvisioningFlowContext.waitingForReconnection) {
            fidesmoProvisioningFlowContext.logNfcReconnectionResult(NfcReconnectionOutcome.ABORTED);
        }
        fidesmoProvisioningFlowContext.failureLogged = true;
        Analytics analytics = fidesmoProvisioningFlowContext.analytics;
        String str3 = fidesmoProvisioningFlowContext.flowToken;
        ErrorSource errorSource = provisioningErrorType.source;
        Integer num = fidesmoProvisioningFlowContext.currentStepNumber;
        Integer num2 = fidesmoProvisioningFlowContext.currentTotalSteps;
        long millisecondsSince = fidesmoProvisioningFlowContext.millisecondsSince(fidesmoProvisioningFlowContext.flowStartTime);
        String journeyToken = fidesmoProvisioningFlowContext.getJourneyToken();
        String str4 = fidesmoProvisioningFlowContext.tagCIN;
        String str5 = fidesmoProvisioningFlowContext.lastFidesmoMessageId;
        analytics.track(new CashTagProvisioningDeprovisionFailed(str3, deprovisionFailurePhase, errorSource, str2, str, num, num2, Long.valueOf(millisecondsSince), str2, str, fidesmoProvisioningFlowContext.fidesmoAppId, fidesmoProvisioningFlowContext.fidesmoServiceId, fidesmoProvisioningFlowContext.useExternalEncryption, journeyToken, str4, str5, null, fidesmoProvisioningFlowContext.tagThemeToken), null);
    }

    public final String getJourneyToken() {
        List activeUserJourneys;
        Object obj;
        UUID uuid;
        UserJourneyTracker userJourneyTracker = this.userJourneyTracker;
        if (userJourneyTracker != null && (activeUserJourneys = ((RealUserJourneySignalProcessor) ((UserJourneySignalProcessor) ((RealUserJourneyTracker) userJourneyTracker).signalProcessorProvider.getValue())).getActiveUserJourneys()) != null) {
            ListIterator listIterator = activeUserJourneys.listIterator(activeUserJourneys.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((ActiveUserJourney) obj).name == UserJourney$Name.CASH_TAG_PROVISIONING) {
                    break;
                }
            }
            ActiveUserJourney activeUserJourney = (ActiveUserJourney) obj;
            if (activeUserJourney != null && (uuid = activeUserJourney.id) != null) {
                return uuid.toString();
            }
        }
        return null;
    }

    public final void logCompleted() {
        if (this.completionLogged || this.failureLogged) {
            return;
        }
        this.completionLogged = true;
        int ordinal = this.flowType.ordinal();
        Analytics analytics = this.analytics;
        if (ordinal == 0) {
            String str = this.flowToken;
            analytics.track(new CashTagProvisioningProvisionCompleted(Integer.valueOf(this.totalStepsCompleted), Integer.valueOf(this.scanAttemptNumber), Long.valueOf(millisecondsSince(this.flowStartTime)), str, getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            String str2 = this.flowToken;
            analytics.track(new CashTagProvisioningDeprovisionCompleted(Integer.valueOf(this.scanAttemptNumber), Long.valueOf(millisecondsSince(this.flowStartTime)), str2, getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        }
    }

    public final void logDeliveryStarted() {
        if (this.flowType != FidesmoFlowType.PROVISION || this.deliveryStartedLogged) {
            return;
        }
        this.deliveryStartedLogged = true;
        this.analytics.track(new CashTagProvisioningProvisionDeliveryStarted(Integer.valueOf(this.installedAppsCount), this.flowToken, getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
    }

    public final void logDeprovisionFailed(DeprovisionFailurePhase deprovisionFailurePhase, FidesmoProvisioningError fidesmoProvisioningError) {
        deprovisionFailurePhase.getClass();
        fidesmoProvisioningError.getClass();
        this.lastFidesmoMessageId = fidesmoProvisioningError.getSdkMessageId();
        String sdkAppId = fidesmoProvisioningError.getSdkAppId();
        if (sdkAppId != null) {
            this.fidesmoAppId = sdkAppId;
        }
        String sdkServiceId = fidesmoProvisioningError.getSdkServiceId();
        if (sdkServiceId != null) {
            this.fidesmoServiceId = sdkServiceId;
        }
        if (this.completionLogged || this.failureLogged) {
            return;
        }
        if (this.waitingForReconnection) {
            logNfcReconnectionResult(NfcReconnectionOutcome.ABORTED);
        }
        this.failureLogged = true;
        String str = this.flowToken;
        ErrorSource access$toProtoErrorSource = DropdownFieldUIKt.access$toProtoErrorSource(fidesmoProvisioningError.getCdfErrorSource());
        String cdfShortName = fidesmoProvisioningError.getCdfShortName();
        String sdkMessageText = fidesmoProvisioningError.getSdkMessageText();
        if (sdkMessageText == null) {
            sdkMessageText = fidesmoProvisioningError.getCdfShortName();
        }
        String str2 = sdkMessageText;
        Integer num = this.currentStepNumber;
        Integer num2 = this.currentTotalSteps;
        long millisecondsSince = millisecondsSince(this.flowStartTime);
        String cdfShortName2 = fidesmoProvisioningError.getCdfShortName();
        String sdkMessageText2 = fidesmoProvisioningError.getSdkMessageText();
        if (sdkMessageText2 == null) {
            sdkMessageText2 = fidesmoProvisioningError.getFidesmoMessage();
        }
        String str3 = sdkMessageText2;
        String journeyToken = getJourneyToken();
        String str4 = this.tagCIN;
        boolean isRetryable = fidesmoProvisioningError.isRetryable();
        String str5 = this.lastFidesmoMessageId;
        this.analytics.track(new CashTagProvisioningDeprovisionFailed(str, deprovisionFailurePhase, access$toProtoErrorSource, cdfShortName, str2, num, num2, Long.valueOf(millisecondsSince), cdfShortName2, str3, this.fidesmoAppId, this.fidesmoServiceId, this.useExternalEncryption, journeyToken, str4, str5, Boolean.valueOf(isRetryable), this.tagThemeToken), null);
    }

    public final void logEligibilityResult(EligibilityDecision eligibilityDecision, String str) {
        if (this.flowType != FidesmoFlowType.PROVISION) {
            return;
        }
        this.analytics.track(new CashTagProvisioningProvisionEligibilityResult(this.flowToken, eligibilityDecision, str, Long.valueOf(millisecondsSince(this.eligibilityRequestStartTime)), getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
    }

    public final void logFlowDismissed() {
        if (this.completionLogged || this.failureLogged || this.dismissalLogged) {
            return;
        }
        this.dismissalLogged = true;
        if (this.waitingForReconnection) {
            logNfcReconnectionResult(NfcReconnectionOutcome.ABORTED);
        }
        int ordinal = this.flowType.ordinal();
        Analytics analytics = this.analytics;
        if (ordinal == 0) {
            analytics.track(new CashTagProvisioningProvisionFlowDismissed(this.flowToken, this.currentProgressPercentage, this.currentStepNumber, this.currentTotalSteps, Long.valueOf(millisecondsSince(this.flowStartTime)), Integer.valueOf(this.scanAttemptNumber), getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        } else if (ordinal == 1) {
            analytics.track(new CashTagProvisioningDeprovisionFlowDismissed(this.flowToken, this.currentProgressPercentage, this.currentStepNumber, this.currentTotalSteps, Long.valueOf(millisecondsSince(this.flowStartTime)), Integer.valueOf(this.scanAttemptNumber), getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    public final void logFlowStarted(FidesmoFlowType fidesmoFlowType, DeviceType deviceType, String str) {
        String str2 = Build.MODEL;
        fidesmoFlowType.getClass();
        this.flowType = fidesmoFlowType;
        this.flowToken = Boxes$$ExternalSyntheticOutline1.m();
        this.flowStartTime = Long.valueOf(this.clock.millis());
        this.scanAttemptNumber = 0;
        this.totalStepsCompleted = 0;
        this.completedStepNumbers.clear();
        this.scanStartTime = null;
        this.eligibilityRequestStartTime = null;
        this.lastStepTime = null;
        this.currentStepNumber = null;
        this.currentTotalSteps = null;
        this.currentProgressPercentage = null;
        this.lastLoggedStep = null;
        this.reconnectionAttemptNumber = 0;
        this.reconnectionStartTime = null;
        this.waitingForReconnection = false;
        this.installedAppsCount = 0;
        this.tagCIN = null;
        this.tagThemeToken = str;
        this.lastFidesmoMessageId = null;
        this.fidesmoAppId = null;
        this.fidesmoServiceId = null;
        this.useExternalEncryption = null;
        this.deliveryStartedLogged = false;
        this.completionLogged = false;
        this.failureLogged = false;
        this.dismissalLogged = false;
        this.assignedLocationLogged = false;
        int ordinal = fidesmoFlowType.ordinal();
        Analytics analytics = this.analytics;
        if (ordinal == 0) {
            analytics.track(new CashTagProvisioningProvisionFlowStarted(this.flowToken, deviceType, getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        } else if (ordinal == 1) {
            analytics.track(new CashTagProvisioningDeprovisionFlowStarted(this.flowToken, deviceType, getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    public final void logNfcConnectionLost() {
        if (this.waitingForReconnection || this.completionLogged || this.failureLogged) {
            return;
        }
        this.reconnectionAttemptNumber++;
        this.reconnectionStartTime = Long.valueOf(this.clock.millis());
        this.waitingForReconnection = true;
        int ordinal = this.flowType.ordinal();
        Analytics analytics = this.analytics;
        if (ordinal == 0) {
            analytics.track(new CashTagProvisioningProvisionNfcConnectionLost(this.flowToken, this.currentStepNumber, this.currentTotalSteps, this.currentProgressPercentage, Integer.valueOf(this.reconnectionAttemptNumber), getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        } else if (ordinal == 1) {
            analytics.track(new CashTagProvisioningDeprovisionNfcConnectionLost(this.flowToken, this.currentStepNumber, this.currentTotalSteps, Integer.valueOf(this.reconnectionAttemptNumber), getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    public final void logNfcReconnectionResult(NfcReconnectionOutcome nfcReconnectionOutcome) {
        if (this.waitingForReconnection) {
            long millisecondsSince = millisecondsSince(this.reconnectionStartTime);
            int ordinal = this.flowType.ordinal();
            Analytics analytics = this.analytics;
            if (ordinal == 0) {
                analytics.track(new CashTagProvisioningProvisionNfcReconnectionResult(this.flowToken, Integer.valueOf(this.reconnectionAttemptNumber), nfcReconnectionOutcome, Long.valueOf(millisecondsSince), getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                analytics.track(new CashTagProvisioningDeprovisionNfcReconnectionResult(this.flowToken, Integer.valueOf(this.reconnectionAttemptNumber), nfcReconnectionOutcome, Long.valueOf(millisecondsSince), getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
            }
            this.waitingForReconnection = false;
            this.reconnectionStartTime = null;
        }
    }

    public final void logNfcScanCompleted(int i, String str) {
        this.installedAppsCount = i;
        this.tagCIN = str;
        int ordinal = this.flowType.ordinal();
        Analytics analytics = this.analytics;
        if (ordinal == 0) {
            String str2 = this.flowToken;
            analytics.track(new CashTagProvisioningProvisionNfcScanCompleted(Integer.valueOf(i), Long.valueOf(millisecondsSince(this.scanStartTime)), str2, str, getJourneyToken(), this.tagThemeToken), null);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            String str3 = this.flowToken;
            analytics.track(new CashTagProvisioningDeprovisionNfcScanCompleted(Integer.valueOf(i), Long.valueOf(millisecondsSince(this.scanStartTime)), str3, str, getJourneyToken(), this.tagThemeToken), null);
        }
    }

    public final void logNfcScanFailed() {
        NfcScanErrorType nfcScanErrorType = NfcScanErrorType.HARDWARE;
        int ordinal = this.flowType.ordinal();
        Analytics analytics = this.analytics;
        if (ordinal == 0) {
            analytics.track(new CashTagProvisioningProvisionNfcScanFailed(Long.valueOf(millisecondsSince(this.scanStartTime)), this.flowToken, getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        } else if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            analytics.track(new CashTagProvisioningDeprovisionNfcScanFailed(Long.valueOf(millisecondsSince(this.scanStartTime)), this.flowToken, getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        }
    }

    public final void logNfcScanStarted() {
        this.scanAttemptNumber++;
        this.scanStartTime = Long.valueOf(this.clock.millis());
        this.waitingForReconnection = false;
        int ordinal = this.flowType.ordinal();
        Analytics analytics = this.analytics;
        if (ordinal == 0) {
            analytics.track(new CashTagProvisioningProvisionNfcScanStarted(Integer.valueOf(this.scanAttemptNumber), this.flowToken, getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        } else if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            analytics.track(new CashTagProvisioningDeprovisionNfcScanStarted(Integer.valueOf(this.scanAttemptNumber), this.flowToken, getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        }
    }

    public final void logStepCompleted(int i, int i2, int i3) {
        if (Intrinsics.areEqual(this.lastLoggedStep, new Pair(Integer.valueOf(i), Integer.valueOf(i2)))) {
            return;
        }
        Long l = this.lastStepTime;
        if (l == null) {
            l = this.flowStartTime;
        }
        long millisecondsSince = millisecondsSince(l);
        this.lastStepTime = Long.valueOf(this.clock.millis());
        this.lastLoggedStep = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        this.currentStepNumber = Integer.valueOf(i);
        this.currentTotalSteps = Integer.valueOf(i2);
        this.currentProgressPercentage = Integer.valueOf(i3);
        Integer valueOf = Integer.valueOf(i);
        LinkedHashSet linkedHashSet = this.completedStepNumbers;
        linkedHashSet.add(valueOf);
        this.totalStepsCompleted = linkedHashSet.size();
        int ordinal = this.flowType.ordinal();
        Analytics analytics = this.analytics;
        if (ordinal == 0) {
            analytics.track(new CashTagProvisioningProvisionStepCompleted(this.flowToken, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(millisecondsSince), Integer.valueOf(i3), getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        } else if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            analytics.track(new CashTagProvisioningDeprovisionStepCompleted(Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(millisecondsSince), this.flowToken, getJourneyToken(), this.tagCIN, this.tagThemeToken), null);
        }
    }

    public final long millisecondsSince(Long l) {
        if (l == null) {
            return 0L;
        }
        return this.clock.millis() - l.longValue();
    }
}
