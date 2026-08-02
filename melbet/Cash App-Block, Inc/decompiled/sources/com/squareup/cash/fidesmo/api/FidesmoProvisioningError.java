package com.squareup.cash.fidesmo.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes6.dex */
public interface FidesmoProvisioningError {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class ActivationDataUnavailable implements FidesmoProvisioningError {
        public static final ActivationDataUnavailable INSTANCE = new ActivationDataUnavailable();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SDK;
        public static final String cdfShortName = "activationDataUnavailable";
        public static final String fidesmoMessage = "Unable to read activation data from tag";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActivationDataUnavailable);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 1573106095;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return true;
        }

        public final String toString() {
            return "ActivationDataUnavailable";
        }
    }

    public final class ActivationFailed implements FidesmoProvisioningError {
        public static final ActivationFailed INSTANCE = new ActivationFailed();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
        public static final String cdfShortName = "activationFailed";
        public static final String fidesmoMessage = "Activation failed";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActivationFailed);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 996031156;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return true;
        }

        public final String toString() {
            return "ActivationFailed";
        }
    }

    public final class AppletInstallFailed implements FidesmoProvisioningError {
        public static final AppletInstallFailed INSTANCE = new AppletInstallFailed();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
        public static final String cdfShortName = "appletInstallFailed";
        public static final String fidesmoMessage = "Applet installation failed";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AppletInstallFailed);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 2134387229;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return true;
        }

        public final String toString() {
            return "AppletInstallFailed";
        }
    }

    public final class CardDetailsInvalid implements FidesmoProvisioningError {
        public static final CardDetailsInvalid INSTANCE = new CardDetailsInvalid();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
        public static final String cdfShortName = "cardDetailsInvalid";
        public static final String fidesmoMessage = "Card details are invalid";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardDetailsInvalid);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return -1450964474;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "CardDetailsInvalid";
        }
    }

    public final class CardDigitizationDeclined implements FidesmoProvisioningError {
        public static final CardDigitizationDeclined INSTANCE = new CardDigitizationDeclined();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
        public static final String cdfShortName = "cardDigitizationDeclined";
        public static final String fidesmoMessage = "Card digitization temporarily declined";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardDigitizationDeclined);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return -1554186282;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return true;
        }

        public final String toString() {
            return "CardDigitizationDeclined";
        }
    }

    public final class CardNotEligible implements FidesmoProvisioningError {
        public static final CardNotEligible INSTANCE = new CardNotEligible();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
        public static final String cdfShortName = "cardNotEligible";
        public static final String fidesmoMessage = "Card not eligible for provisioning";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardNotEligible);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 1098762937;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "CardNotEligible";
        }
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final List APPLET_FAILURE_SUFFIXES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"InstallationFailed", "LoadFailed", "PersoFailed"});

        public static FidesmoProvisioningError fromDeliveryStatusId(String str) {
            if (str.equals("FidesmoPay.statuses.serviceUnavailable")) {
                return FidesmoServiceUnavailable.INSTANCE;
            }
            if (!str.equals("FidesmoPay.statuses.timeoutFailure") && !str.equals("FidesmoPay.statuses.error.DeliveryFailed")) {
                if (!str.equals("FidesmoPay.statuses.wrongEmail") && !str.equals("FidesmoPay.statuses.emailNotProvided")) {
                    if (!str.equals("FidesmoPay.statuses.cardNotEligible") && !str.equals("FidesmoPay.statuses.cardNotEligibleForScheme") && !str.equals("FidesmoPay.statuses.oemNotEligible")) {
                        if (str.equals("FidesmoPay.statuses.digitizationDeclined")) {
                            return CardDigitizationDeclined.INSTANCE;
                        }
                        if (!str.equals("FidesmoPay.statuses.cardDetailsInvalid") && !str.equals("FidesmoPay.statuses.invalidCard") && !str.equals("FidesmoPay.statuses.cardInfoNotProvided") && !str.equals("FidesmoPay.statuses.cardDetailsDecryptionError")) {
                            if (str.equals("FidesmoPay.statuses.useDebitCardInsteadOfCreditCard")) {
                                return CardNotEligible.INSTANCE;
                            }
                            if (!str.equals("FidesmoPay.statuses.incorrectCvcWithNoRetry") && !str.equals("FidesmoPay.statuses.incorrectCvc")) {
                                if (!str.equals("FidesmoPay.statuses.wrongDevice") && !str.equals("FidesmoPay.statuses.deviceRequirementsDontMatch")) {
                                    if (str.equals("FidesmoPay.statuses.error.NotEnoughMemory")) {
                                        return NotEnoughMemory.INSTANCE;
                                    }
                                    List list = APPLET_FAILURE_SUFFIXES;
                                    if (!(list instanceof Collection) || !list.isEmpty()) {
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            if (StringsKt__StringsJVMKt.endsWith(str, (String) it.next(), false)) {
                                                return AppletInstallFailed.INSTANCE;
                                            }
                                        }
                                    }
                                    if (str.equals("FidesmoPay.statuses.activationFailed")) {
                                        return ActivationFailed.INSTANCE;
                                    }
                                    if (str.equals("FidesmoPay.statuses.wrongAuthMethodChosen")) {
                                        return YellowPathSuccess.INSTANCE;
                                    }
                                    if (!str.equals("FidesmoPay.statuses.provisioningCountExceeded") && !str.equals("FidesmoPay.statuses.referenceDataNotFound") && !str.equals("FidesmoPay.statuses.tokenAlreadyPersonalized")) {
                                        if (!str.equals("FidesmoPay.statuses.paymentCardAlreadyConnected") && !str.equals("FidesmoPay.statuses.uninstallCancelled") && str.equals("FidesmoPay.statuses.managementTokenNotFound")) {
                                            return new GenericDeliveryFailed(str);
                                        }
                                        return new GenericDeliveryFailed(str);
                                    }
                                    return CardNotEligible.INSTANCE;
                                }
                                return WrongDevice.INSTANCE;
                            }
                            return RiskBlocked.INSTANCE;
                        }
                        return CardDetailsInvalid.INSTANCE;
                    }
                    return CardNotEligible.INSTANCE;
                }
                return EmailMismatch.INSTANCE;
            }
            return new GenericDeliveryFailed(str);
        }
    }

    public final class ConnectionUnstable implements FidesmoProvisioningError {
        public static final ConnectionUnstable INSTANCE = new ConnectionUnstable();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SDK;
        public static final String cdfShortName = "connectionUnstable";
        public static final String fidesmoMessage = "NFC connection is unstable";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectionUnstable);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 1516248467;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return true;
        }

        public final String toString() {
            return "ConnectionUnstable";
        }
    }

    public final class DeviceInfoUnavailable implements FidesmoProvisioningError {
        public static final DeviceInfoUnavailable INSTANCE = new DeviceInfoUnavailable();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SDK;
        public static final String cdfShortName = "deviceInfoUnavailable";
        public static final String fidesmoMessage = "Unable to read device info from tag";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceInfoUnavailable);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 890664043;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return true;
        }

        public final String toString() {
            return "DeviceInfoUnavailable";
        }
    }

    public final class EligibilityDenied implements FidesmoProvisioningError {
        public static final EligibilityDenied INSTANCE = new EligibilityDenied();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.SERVER;
        public static final String cdfShortName = "eligibilityDenied";
        public static final String fidesmoMessage = "Provisioning denied by server";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EligibilityDenied);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 1894876135;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "EligibilityDenied";
        }
    }

    public final class EmailMismatch implements FidesmoProvisioningError {
        public static final EmailMismatch INSTANCE = new EmailMismatch();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
        public static final String cdfShortName = "emailMismatch";
        public static final String fidesmoMessage = "Email does not match";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EmailMismatch);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return -593018007;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "EmailMismatch";
        }
    }

    public final class FidesmoServiceUnavailable implements FidesmoProvisioningError {
        public static final FidesmoServiceUnavailable INSTANCE = new FidesmoServiceUnavailable();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
        public static final String cdfShortName = "fidesmoServiceUnavailable";
        public static final String fidesmoMessage = "Fidesmo service temporarily unavailable";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FidesmoServiceUnavailable);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 771547627;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return true;
        }

        public final String toString() {
            return "FidesmoServiceUnavailable";
        }
    }

    public final class MissingEncryptedData implements FidesmoProvisioningError {
        public static final MissingEncryptedData INSTANCE = new MissingEncryptedData();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.CLIENT;
        public static final String cdfShortName = "missingEncryptedData";
        public static final String fidesmoMessage = "Missing encrypted card data";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MissingEncryptedData);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return -1270228727;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "MissingEncryptedData";
        }
    }

    public final class MissingEphemeralKey implements FidesmoProvisioningError {
        public static final MissingEphemeralKey INSTANCE = new MissingEphemeralKey();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.CLIENT;
        public static final String cdfShortName = "missingEphemeralKey";
        public static final String fidesmoMessage = "Missing ephemeral key";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MissingEphemeralKey);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 334656167;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "MissingEphemeralKey";
        }
    }

    public final class NoServiceAvailable implements FidesmoProvisioningError {
        public static final NoServiceAvailable INSTANCE = new NoServiceAvailable();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SDK;
        public static final String cdfShortName = "noServiceAvailable";
        public static final String fidesmoMessage = "No matching service found for this device";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoServiceAvailable);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 997770486;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "NoServiceAvailable";
        }
    }

    public final class NotEnoughMemory implements FidesmoProvisioningError {
        public static final NotEnoughMemory INSTANCE = new NotEnoughMemory();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
        public static final String cdfShortName = "notEnoughMemory";
        public static final String fidesmoMessage = "Not enough memory on wearable";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotEnoughMemory);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 1607949091;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "NotEnoughMemory";
        }
    }

    public final class RiskBlocked implements FidesmoProvisioningError {
        public static final RiskBlocked INSTANCE = new RiskBlocked();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
        public static final String cdfShortName = "riskBlocked";
        public static final String fidesmoMessage = "CVC verification failed - retries exhausted";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RiskBlocked);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 784884156;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "RiskBlocked";
        }
    }

    public final class SdkRetryLimitExceeded implements FidesmoProvisioningError {
        public static final SdkRetryLimitExceeded INSTANCE = new SdkRetryLimitExceeded();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SDK;
        public static final String cdfShortName = "sdkRetryLimitExceeded";
        public static final String fidesmoMessage = "Fidesmo SDK retry limit exceeded";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SdkRetryLimitExceeded);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 438174495;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return true;
        }

        public final String toString() {
            return "SdkRetryLimitExceeded";
        }
    }

    public final class ServiceLookupFailed implements FidesmoProvisioningError {
        public static final ServiceLookupFailed INSTANCE = new ServiceLookupFailed();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SDK;
        public static final String cdfShortName = "serviceLookupFailed";
        public static final String fidesmoMessage = "Service lookup failed";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ServiceLookupFailed);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return -1735224245;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "ServiceLookupFailed";
        }
    }

    public final class TagAlreadyActivated implements FidesmoProvisioningError {
        public static final TagAlreadyActivated INSTANCE = new TagAlreadyActivated();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.CLIENT;
        public static final String cdfShortName = "tagAlreadyActivated";
        public static final String fidesmoMessage = "Tag is already activated";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TagAlreadyActivated);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return -1458837838;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "TagAlreadyActivated";
        }
    }

    public final class WithSdkContext implements FidesmoProvisioningError {
        public final FidesmoProvisioningError classified;
        public final String sdkAppId;
        public final String sdkMessageId;
        public final String sdkMessageText;
        public final String sdkServiceId;

        public WithSdkContext(FidesmoProvisioningError fidesmoProvisioningError, String str, String str2, String str3, String str4) {
            this.classified = fidesmoProvisioningError;
            this.sdkMessageId = str;
            this.sdkMessageText = str2;
            this.sdkAppId = str3;
            this.sdkServiceId = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithSdkContext)) {
                return false;
            }
            WithSdkContext withSdkContext = (WithSdkContext) obj;
            return this.classified.equals(withSdkContext.classified) && Intrinsics.areEqual(this.sdkMessageId, withSdkContext.sdkMessageId) && Intrinsics.areEqual(this.sdkMessageText, withSdkContext.sdkMessageText) && Intrinsics.areEqual(this.sdkAppId, withSdkContext.sdkAppId) && Intrinsics.areEqual(this.sdkServiceId, withSdkContext.sdkServiceId);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfErrorMessage() {
            return this.classified.getCdfErrorMessage();
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return this.classified.getCdfErrorSource();
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return this.classified.getCdfShortName();
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return this.classified.getFidesmoMessage();
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getSdkAppId() {
            return this.sdkAppId;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getSdkMessageId() {
            return this.sdkMessageId;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getSdkMessageText() {
            return this.sdkMessageText;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getSdkServiceId() {
            return this.sdkServiceId;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final FidesmoProvisioningError getUnwrapped() {
            return this.classified.getUnwrapped();
        }

        public final int hashCode() {
            int hashCode = this.classified.hashCode() * 31;
            String str = this.sdkMessageId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sdkMessageText;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sdkAppId;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkServiceId;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isGenericRetryable() {
            return this.classified.isGenericRetryable();
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return this.classified.isRetryable();
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isYellowPath() {
            return this.classified.isYellowPath();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WithSdkContext(classified=");
            sb.append(this.classified);
            sb.append(", sdkMessageId=");
            sb.append(this.sdkMessageId);
            sb.append(", sdkMessageText=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.sdkMessageText, ", sdkAppId=", this.sdkAppId, ", sdkServiceId=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.sdkServiceId, ")");
        }
    }

    public final class WrongDevice implements FidesmoProvisioningError {
        public static final WrongDevice INSTANCE = new WrongDevice();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
        public static final String cdfShortName = "wrongDevice";
        public static final String fidesmoMessage = "Wrong device connected";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WrongDevice);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return -186184702;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        public final String toString() {
            return "WrongDevice";
        }
    }

    public final class YellowPathSuccess implements FidesmoProvisioningError {
        public static final YellowPathSuccess INSTANCE = new YellowPathSuccess();
        public static final CdfErrorSource cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
        public static final String cdfShortName = "yellowPathSuccess";
        public static final String fidesmoMessage = "Activation deferred (yellow path)";
        public static final boolean isYellowPath = true;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof YellowPathSuccess);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return fidesmoMessage;
        }

        public final int hashCode() {
            return 855275881;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return false;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isYellowPath() {
            return isYellowPath;
        }

        public final String toString() {
            return "YellowPathSuccess";
        }
    }

    default String getCdfErrorMessage() {
        return Boxes$$ExternalSyntheticOutline1.m(getCdfErrorSource().messagePrefix, "(", getCdfShortName(), ")");
    }

    CdfErrorSource getCdfErrorSource();

    String getCdfShortName();

    String getFidesmoMessage();

    default String getSdkAppId() {
        return null;
    }

    default String getSdkMessageId() {
        return null;
    }

    default String getSdkMessageText() {
        return null;
    }

    default String getSdkServiceId() {
        return null;
    }

    default FidesmoProvisioningError getUnwrapped() {
        return this instanceof WithSdkContext ? ((WithSdkContext) this).classified : this;
    }

    default boolean isGenericRetryable() {
        getUnwrapped();
        return false;
    }

    boolean isRetryable();

    default boolean isYellowPath() {
        return false;
    }

    public final class GenericDeliveryFailed implements FidesmoProvisioningError {
        public final CdfErrorSource cdfErrorSource;
        public final String cdfShortName;
        public final String fidesmoMessage;
        public final boolean isRetryable;
        public final String statusId;

        public GenericDeliveryFailed(String str) {
            this.statusId = str;
            this.isRetryable = true;
            this.cdfErrorSource = CdfErrorSource.FIDESMO_SERVER;
            this.cdfShortName = "genericDeliveryFailed";
            this.fidesmoMessage = "Service delivery failed".concat(str != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(" (", str, ")") : "");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenericDeliveryFailed) && Intrinsics.areEqual(this.statusId, ((GenericDeliveryFailed) obj).statusId);
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final CdfErrorSource getCdfErrorSource() {
            return this.cdfErrorSource;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getCdfShortName() {
            return this.cdfShortName;
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final String getFidesmoMessage() {
            return this.fidesmoMessage;
        }

        public final int hashCode() {
            String str = this.statusId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // com.squareup.cash.fidesmo.api.FidesmoProvisioningError
        public final boolean isRetryable() {
            return this.isRetryable;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GenericDeliveryFailed(statusId=", this.statusId, ")");
        }

        public /* synthetic */ GenericDeliveryFailed() {
            this(null);
        }
    }
}
