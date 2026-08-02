package com.squareup.cash.cdf.recipient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ExperienceType {
    public static final /* synthetic */ ExperienceType[] $VALUES;
    public static final ExperienceType BOTTOM_SHEET;
    public static final ExperienceType LEGACY;

    static {
        ExperienceType experienceType = new ExperienceType("LEGACY", 0);
        LEGACY = experienceType;
        ExperienceType experienceType2 = new ExperienceType("BOTTOM_SHEET", 1);
        BOTTOM_SHEET = experienceType2;
        $VALUES = new ExperienceType[]{experienceType, experienceType2};
    }

    public static ExperienceType valueOf(String str) {
        return (ExperienceType) Enum.valueOf(ExperienceType.class, str);
    }

    public static ExperienceType[] values() {
        return (ExperienceType[]) $VALUES.clone();
    }
}
