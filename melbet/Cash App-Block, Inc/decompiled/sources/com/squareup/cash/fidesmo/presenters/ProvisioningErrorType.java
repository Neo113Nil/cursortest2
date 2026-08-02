package com.squareup.cash.fidesmo.presenters;

import com.squareup.cash.cdf.cashtagprovisioning.ErrorSource;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DENIED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes8.dex */
public final class ProvisioningErrorType {
    public static final /* synthetic */ ProvisioningErrorType[] $VALUES;
    public static final ProvisioningErrorType ACTIVATION_FAILED;
    public static final ProvisioningErrorType APPLET_INSTALL_FAILED;
    public static final ProvisioningErrorType CARD_DETAILS_INVALID;
    public static final ProvisioningErrorType CARD_DIGITIZATION_DECLINED;
    public static final ProvisioningErrorType CARD_NOT_ELIGIBLE;
    public static final ProvisioningErrorType DENIED;
    public static final ProvisioningErrorType DEVICE_ERROR;
    public static final ProvisioningErrorType EMAIL_MISMATCH;
    public static final ProvisioningErrorType FIDESMO_SERVICE_UNAVAILABLE;
    public static final ProvisioningErrorType MISSING_DEVICE_INFO;
    public static final ProvisioningErrorType NFC_DISABLED;
    public static final ProvisioningErrorType NFC_UNAVAILABLE;
    public static final ProvisioningErrorType NOTHING_TO_DEPROVISION;
    public static final ProvisioningErrorType NOT_ENOUGH_MEMORY;
    public static final ProvisioningErrorType RISK_BLOCKED;
    public static final ProvisioningErrorType SDK_RETRY_LIMIT_EXCEEDED;
    public static final ProvisioningErrorType SERVER_REQUEST_FAILED;
    public static final ProvisioningErrorType SERVICE_DELIVERY_FAILED;
    public static final ProvisioningErrorType TAG_ALREADY_ACTIVATED;
    public static final ProvisioningErrorType WRONG_DEVICE;
    public final ErrorSource source;
    public final String value;

    static {
        ErrorSource errorSource = ErrorSource.SERVER;
        ProvisioningErrorType provisioningErrorType = new ProvisioningErrorType("DENIED", 0, "denied", errorSource);
        DENIED = provisioningErrorType;
        ProvisioningErrorType provisioningErrorType2 = new ProvisioningErrorType("SERVER_REQUEST_FAILED", 1, "server_request_failed", errorSource);
        SERVER_REQUEST_FAILED = provisioningErrorType2;
        ErrorSource errorSource2 = ErrorSource.CLIENT;
        ProvisioningErrorType provisioningErrorType3 = new ProvisioningErrorType("MISSING_DEVICE_INFO", 2, "missing_device_info", errorSource2);
        MISSING_DEVICE_INFO = provisioningErrorType3;
        ProvisioningErrorType provisioningErrorType4 = new ProvisioningErrorType("NFC_DISABLED", 3, "nfc_disabled", errorSource2);
        NFC_DISABLED = provisioningErrorType4;
        ProvisioningErrorType provisioningErrorType5 = new ProvisioningErrorType("NFC_UNAVAILABLE", 4, "nfc_unavailable", errorSource2);
        NFC_UNAVAILABLE = provisioningErrorType5;
        ErrorSource errorSource3 = ErrorSource.FIDESMO_SDK;
        ProvisioningErrorType provisioningErrorType6 = new ProvisioningErrorType("DEVICE_ERROR", 5, "device_error", errorSource3);
        DEVICE_ERROR = provisioningErrorType6;
        ProvisioningErrorType provisioningErrorType7 = new ProvisioningErrorType("SERVICE_DELIVERY_FAILED", 6, "service_delivery_failed", errorSource3);
        SERVICE_DELIVERY_FAILED = provisioningErrorType7;
        ProvisioningErrorType provisioningErrorType8 = new ProvisioningErrorType("EMAIL_MISMATCH", 7, "emailMismatch", errorSource3);
        EMAIL_MISMATCH = provisioningErrorType8;
        ProvisioningErrorType provisioningErrorType9 = new ProvisioningErrorType("WRONG_DEVICE", 8, "wrongDevice", errorSource3);
        WRONG_DEVICE = provisioningErrorType9;
        ProvisioningErrorType provisioningErrorType10 = new ProvisioningErrorType("CARD_DIGITIZATION_DECLINED", 9, "cardDigitizationDeclined", errorSource3);
        CARD_DIGITIZATION_DECLINED = provisioningErrorType10;
        ProvisioningErrorType provisioningErrorType11 = new ProvisioningErrorType("APPLET_INSTALL_FAILED", 10, "appletInstallFailed", errorSource3);
        APPLET_INSTALL_FAILED = provisioningErrorType11;
        ProvisioningErrorType provisioningErrorType12 = new ProvisioningErrorType("ACTIVATION_FAILED", 11, "activationFailed", errorSource3);
        ACTIVATION_FAILED = provisioningErrorType12;
        ProvisioningErrorType provisioningErrorType13 = new ProvisioningErrorType("CARD_NOT_ELIGIBLE", 12, "cardNotEligible", errorSource3);
        CARD_NOT_ELIGIBLE = provisioningErrorType13;
        ProvisioningErrorType provisioningErrorType14 = new ProvisioningErrorType("CARD_DETAILS_INVALID", 13, "cardDetailsInvalid", errorSource3);
        CARD_DETAILS_INVALID = provisioningErrorType14;
        ProvisioningErrorType provisioningErrorType15 = new ProvisioningErrorType("RISK_BLOCKED", 14, "riskBlocked", errorSource3);
        RISK_BLOCKED = provisioningErrorType15;
        ProvisioningErrorType provisioningErrorType16 = new ProvisioningErrorType("NOT_ENOUGH_MEMORY", 15, "notEnoughMemory", errorSource3);
        NOT_ENOUGH_MEMORY = provisioningErrorType16;
        ProvisioningErrorType provisioningErrorType17 = new ProvisioningErrorType("ELIGIBILITY_MISSING", 16, "eligibilityMissing", errorSource);
        ProvisioningErrorType provisioningErrorType18 = new ProvisioningErrorType("FIDESMO_SERVICE_UNAVAILABLE", 17, "fidesmoServiceUnavailable", errorSource3);
        FIDESMO_SERVICE_UNAVAILABLE = provisioningErrorType18;
        ProvisioningErrorType provisioningErrorType19 = new ProvisioningErrorType("SDK_RETRY_LIMIT_EXCEEDED", 18, "fidesmoTimeout", errorSource3);
        SDK_RETRY_LIMIT_EXCEEDED = provisioningErrorType19;
        ProvisioningErrorType provisioningErrorType20 = new ProvisioningErrorType("TAG_ALREADY_ACTIVATED", 19, "tag_already_activated", errorSource2);
        TAG_ALREADY_ACTIVATED = provisioningErrorType20;
        ProvisioningErrorType provisioningErrorType21 = new ProvisioningErrorType("POST_DETECTION_TIMEOUT", 20, "post_detection_timeout", errorSource3);
        ProvisioningErrorType provisioningErrorType22 = new ProvisioningErrorType("NOTHING_TO_DEPROVISION", 21, "nothing_to_deprovision", errorSource2);
        NOTHING_TO_DEPROVISION = provisioningErrorType22;
        $VALUES = new ProvisioningErrorType[]{provisioningErrorType, provisioningErrorType2, provisioningErrorType3, provisioningErrorType4, provisioningErrorType5, provisioningErrorType6, provisioningErrorType7, provisioningErrorType8, provisioningErrorType9, provisioningErrorType10, provisioningErrorType11, provisioningErrorType12, provisioningErrorType13, provisioningErrorType14, provisioningErrorType15, provisioningErrorType16, provisioningErrorType17, provisioningErrorType18, provisioningErrorType19, provisioningErrorType20, provisioningErrorType21, provisioningErrorType22};
    }

    public ProvisioningErrorType(String str, int i, String str2, ErrorSource errorSource) {
        this.value = str2;
        this.source = errorSource;
    }

    public static ProvisioningErrorType valueOf(String str) {
        return (ProvisioningErrorType) Enum.valueOf(ProvisioningErrorType.class, str);
    }

    public static ProvisioningErrorType[] values() {
        return (ProvisioningErrorType[]) $VALUES.clone();
    }
}
