package com.squareup.cash.securityhub.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class EducationCardId {
    public static final /* synthetic */ EducationCardId[] $VALUES;
    public static final EducationCardId BUILT_IN_PROTECTIONS;
    public static final EducationCardId COMMON_SCAMS;
    public static final EducationCardId PREVENT_FRAUD;
    public static final EducationCardId SECURITY_FEATURES;
    public static final EducationCardId SPOT_SCAMS;

    static {
        EducationCardId educationCardId = new EducationCardId("BUILT_IN_PROTECTIONS", 0);
        BUILT_IN_PROTECTIONS = educationCardId;
        EducationCardId educationCardId2 = new EducationCardId("COMMON_SCAMS", 1);
        COMMON_SCAMS = educationCardId2;
        EducationCardId educationCardId3 = new EducationCardId("SPOT_SCAMS", 2);
        SPOT_SCAMS = educationCardId3;
        EducationCardId educationCardId4 = new EducationCardId("PREVENT_FRAUD", 3);
        PREVENT_FRAUD = educationCardId4;
        EducationCardId educationCardId5 = new EducationCardId("SECURITY_FEATURES", 4);
        SECURITY_FEATURES = educationCardId5;
        $VALUES = new EducationCardId[]{educationCardId, educationCardId2, educationCardId3, educationCardId4, educationCardId5};
    }

    public static EducationCardId valueOf(String str) {
        return (EducationCardId) Enum.valueOf(EducationCardId.class, str);
    }

    public static EducationCardId[] values() {
        return (EducationCardId[]) $VALUES.clone();
    }
}
