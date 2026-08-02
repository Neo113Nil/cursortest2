package com.squareup.cash.billssubscriptions.viewmodels.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class MerchantLinkingStatus {
    public static final /* synthetic */ MerchantLinkingStatus[] $VALUES;
    public static final MerchantLinkingStatus LINKED;
    public static final MerchantLinkingStatus NOT_LINKED;

    static {
        MerchantLinkingStatus merchantLinkingStatus = new MerchantLinkingStatus("NOT_LINKED", 0);
        NOT_LINKED = merchantLinkingStatus;
        MerchantLinkingStatus merchantLinkingStatus2 = new MerchantLinkingStatus("PENDING", 1);
        MerchantLinkingStatus merchantLinkingStatus3 = new MerchantLinkingStatus("LINKED", 2);
        LINKED = merchantLinkingStatus3;
        $VALUES = new MerchantLinkingStatus[]{merchantLinkingStatus, merchantLinkingStatus2, merchantLinkingStatus3, new MerchantLinkingStatus("FAILED", 3)};
    }

    public static MerchantLinkingStatus valueOf(String str) {
        return (MerchantLinkingStatus) Enum.valueOf(MerchantLinkingStatus.class, str);
    }

    public static MerchantLinkingStatus[] values() {
        return (MerchantLinkingStatus[]) $VALUES.clone();
    }
}
