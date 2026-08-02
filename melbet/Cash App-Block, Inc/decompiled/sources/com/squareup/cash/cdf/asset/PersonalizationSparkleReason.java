package com.squareup.cash.cdf.asset;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PersonalizationSparkleReason {
    public static final /* synthetic */ PersonalizationSparkleReason[] $VALUES;
    public static final PersonalizationSparkleReason FIRST_IMPRESSION;
    public static final PersonalizationSparkleReason NOTE_TYPED;

    static {
        PersonalizationSparkleReason personalizationSparkleReason = new PersonalizationSparkleReason("FIRST_IMPRESSION", 0);
        FIRST_IMPRESSION = personalizationSparkleReason;
        PersonalizationSparkleReason personalizationSparkleReason2 = new PersonalizationSparkleReason("NOTE_TYPED", 1);
        NOTE_TYPED = personalizationSparkleReason2;
        $VALUES = new PersonalizationSparkleReason[]{personalizationSparkleReason, personalizationSparkleReason2};
    }

    public static PersonalizationSparkleReason valueOf(String str) {
        return (PersonalizationSparkleReason) Enum.valueOf(PersonalizationSparkleReason.class, str);
    }

    public static PersonalizationSparkleReason[] values() {
        return (PersonalizationSparkleReason[]) $VALUES.clone();
    }
}
