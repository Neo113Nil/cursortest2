package com.squareup.cash.securityhub.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class RecoveryGuideSectionId {
    public static final /* synthetic */ RecoveryGuideSectionId[] $VALUES;
    public static final RecoveryGuideSectionId GET_SUPPORT;
    public static final RecoveryGuideSectionId NEXT_STEPS;
    public static final RecoveryGuideSectionId PROTECT_YOURSELF;
    public static final RecoveryGuideSectionId REPORT;

    static {
        RecoveryGuideSectionId recoveryGuideSectionId = new RecoveryGuideSectionId("NEXT_STEPS", 0);
        NEXT_STEPS = recoveryGuideSectionId;
        RecoveryGuideSectionId recoveryGuideSectionId2 = new RecoveryGuideSectionId("REPORT", 1);
        REPORT = recoveryGuideSectionId2;
        RecoveryGuideSectionId recoveryGuideSectionId3 = new RecoveryGuideSectionId("PROTECT_YOURSELF", 2);
        PROTECT_YOURSELF = recoveryGuideSectionId3;
        RecoveryGuideSectionId recoveryGuideSectionId4 = new RecoveryGuideSectionId("GET_SUPPORT", 3);
        GET_SUPPORT = recoveryGuideSectionId4;
        $VALUES = new RecoveryGuideSectionId[]{recoveryGuideSectionId, recoveryGuideSectionId2, recoveryGuideSectionId3, recoveryGuideSectionId4};
    }

    public static RecoveryGuideSectionId valueOf(String str) {
        return (RecoveryGuideSectionId) Enum.valueOf(RecoveryGuideSectionId.class, str);
    }

    public static RecoveryGuideSectionId[] values() {
        return (RecoveryGuideSectionId[]) $VALUES.clone();
    }
}
