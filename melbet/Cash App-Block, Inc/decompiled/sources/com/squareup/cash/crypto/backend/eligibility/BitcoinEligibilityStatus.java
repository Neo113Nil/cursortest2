package com.squareup.cash.crypto.backend.eligibility;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BitcoinEligibilityStatus {
    public static final /* synthetic */ BitcoinEligibilityStatus[] $VALUES;
    public static final BitcoinEligibilityStatus CAN_BE_ELIGIBLE;
    public static final BitcoinEligibilityStatus ELIGIBLE;
    public static final BitcoinEligibilityStatus INELIGIBLE;
    public static final BitcoinEligibilityStatus PENDING_APPROVAL;
    public static final BitcoinEligibilityStatus UNSPECIFIED;

    static {
        BitcoinEligibilityStatus bitcoinEligibilityStatus = new BitcoinEligibilityStatus("UNSPECIFIED", 0);
        UNSPECIFIED = bitcoinEligibilityStatus;
        BitcoinEligibilityStatus bitcoinEligibilityStatus2 = new BitcoinEligibilityStatus("PENDING_APPROVAL", 1);
        PENDING_APPROVAL = bitcoinEligibilityStatus2;
        BitcoinEligibilityStatus bitcoinEligibilityStatus3 = new BitcoinEligibilityStatus("CAN_BE_ELIGIBLE", 2);
        CAN_BE_ELIGIBLE = bitcoinEligibilityStatus3;
        BitcoinEligibilityStatus bitcoinEligibilityStatus4 = new BitcoinEligibilityStatus("ELIGIBLE", 3);
        ELIGIBLE = bitcoinEligibilityStatus4;
        BitcoinEligibilityStatus bitcoinEligibilityStatus5 = new BitcoinEligibilityStatus("INELIGIBLE", 4);
        INELIGIBLE = bitcoinEligibilityStatus5;
        $VALUES = new BitcoinEligibilityStatus[]{bitcoinEligibilityStatus, bitcoinEligibilityStatus2, bitcoinEligibilityStatus3, bitcoinEligibilityStatus4, bitcoinEligibilityStatus5};
    }

    public static BitcoinEligibilityStatus valueOf(String str) {
        return (BitcoinEligibilityStatus) Enum.valueOf(BitcoinEligibilityStatus.class, str);
    }

    public static BitcoinEligibilityStatus[] values() {
        return (BitcoinEligibilityStatus[]) $VALUES.clone();
    }
}
