package com.squareup.cash.securityhub.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class RecoveryGuideRowId {
    public static final /* synthetic */ RecoveryGuideRowId[] $VALUES;
    public static final RecoveryGuideRowId BEWARE_OF_FUTURE_SCAMS;
    public static final RecoveryGuideRowId CHANGE_YOUR_PIN;
    public static final RecoveryGuideRowId CONTACT_YOUR_BANK;
    public static final RecoveryGuideRowId ENABLE_PASSKEYS;
    public static final RecoveryGuideRowId FILE_WITH_FBI;
    public static final RecoveryGuideRowId FILE_WITH_FTC;
    public static final RecoveryGuideRowId FREEZE_YOUR_CREDIT;
    public static final RecoveryGuideRowId PROTECT_YOUR_ACCOUNT;
    public static final RecoveryGuideRowId REPORT_AN_ISSUE;
    public static final RecoveryGuideRowId REPORT_TO_CASH_APP;
    public static final RecoveryGuideRowId REPORT_TO_LOCAL_POLICE;
    public static final RecoveryGuideRowId SECURE_YOUR_EMAIL;
    public static final RecoveryGuideRowId SIGN_OUT_EVERYWHERE;
    public static final RecoveryGuideRowId STOP_AND_DISCONNECT;
    public static final RecoveryGuideRowId TRY_TO_REVERSE_PAYMENT;

    static {
        RecoveryGuideRowId recoveryGuideRowId = new RecoveryGuideRowId("TRY_TO_REVERSE_PAYMENT", 0);
        TRY_TO_REVERSE_PAYMENT = recoveryGuideRowId;
        RecoveryGuideRowId recoveryGuideRowId2 = new RecoveryGuideRowId("STOP_AND_DISCONNECT", 1);
        STOP_AND_DISCONNECT = recoveryGuideRowId2;
        RecoveryGuideRowId recoveryGuideRowId3 = new RecoveryGuideRowId("BEWARE_OF_FUTURE_SCAMS", 2);
        BEWARE_OF_FUTURE_SCAMS = recoveryGuideRowId3;
        RecoveryGuideRowId recoveryGuideRowId4 = new RecoveryGuideRowId("PROTECT_YOUR_ACCOUNT", 3);
        PROTECT_YOUR_ACCOUNT = recoveryGuideRowId4;
        RecoveryGuideRowId recoveryGuideRowId5 = new RecoveryGuideRowId("SECURE_YOUR_EMAIL", 4);
        SECURE_YOUR_EMAIL = recoveryGuideRowId5;
        RecoveryGuideRowId recoveryGuideRowId6 = new RecoveryGuideRowId("CHANGE_YOUR_PIN", 5);
        CHANGE_YOUR_PIN = recoveryGuideRowId6;
        RecoveryGuideRowId recoveryGuideRowId7 = new RecoveryGuideRowId("SIGN_OUT_EVERYWHERE", 6);
        SIGN_OUT_EVERYWHERE = recoveryGuideRowId7;
        RecoveryGuideRowId recoveryGuideRowId8 = new RecoveryGuideRowId("ENABLE_PASSKEYS", 7);
        ENABLE_PASSKEYS = recoveryGuideRowId8;
        RecoveryGuideRowId recoveryGuideRowId9 = new RecoveryGuideRowId("FREEZE_YOUR_CREDIT", 8);
        FREEZE_YOUR_CREDIT = recoveryGuideRowId9;
        RecoveryGuideRowId recoveryGuideRowId10 = new RecoveryGuideRowId("REPORT_TO_CASH_APP", 9);
        REPORT_TO_CASH_APP = recoveryGuideRowId10;
        RecoveryGuideRowId recoveryGuideRowId11 = new RecoveryGuideRowId("CONTACT_YOUR_BANK", 10);
        CONTACT_YOUR_BANK = recoveryGuideRowId11;
        RecoveryGuideRowId recoveryGuideRowId12 = new RecoveryGuideRowId("REPORT_TO_LOCAL_POLICE", 11);
        REPORT_TO_LOCAL_POLICE = recoveryGuideRowId12;
        RecoveryGuideRowId recoveryGuideRowId13 = new RecoveryGuideRowId("FILE_WITH_FTC", 12);
        FILE_WITH_FTC = recoveryGuideRowId13;
        RecoveryGuideRowId recoveryGuideRowId14 = new RecoveryGuideRowId("FILE_WITH_FBI", 13);
        FILE_WITH_FBI = recoveryGuideRowId14;
        RecoveryGuideRowId recoveryGuideRowId15 = new RecoveryGuideRowId("REPORT_AN_ISSUE", 14);
        REPORT_AN_ISSUE = recoveryGuideRowId15;
        $VALUES = new RecoveryGuideRowId[]{recoveryGuideRowId, recoveryGuideRowId2, recoveryGuideRowId3, recoveryGuideRowId4, recoveryGuideRowId5, recoveryGuideRowId6, recoveryGuideRowId7, recoveryGuideRowId8, recoveryGuideRowId9, recoveryGuideRowId10, recoveryGuideRowId11, recoveryGuideRowId12, recoveryGuideRowId13, recoveryGuideRowId14, recoveryGuideRowId15};
    }

    public static RecoveryGuideRowId valueOf(String str) {
        return (RecoveryGuideRowId) Enum.valueOf(RecoveryGuideRowId.class, str);
    }

    public static RecoveryGuideRowId[] values() {
        return (RecoveryGuideRowId[]) $VALUES.clone();
    }
}
