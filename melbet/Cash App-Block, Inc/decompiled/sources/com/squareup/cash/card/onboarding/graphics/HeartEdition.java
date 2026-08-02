package com.squareup.cash.card.onboarding.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HeartEdition {
    public static final /* synthetic */ HeartEdition[] $VALUES;
    public static final HeartEdition FIRST_EDITION;
    public static final HeartEdition STANDARD;

    static {
        HeartEdition heartEdition = new HeartEdition("STANDARD", 0);
        STANDARD = heartEdition;
        HeartEdition heartEdition2 = new HeartEdition("FIRST_EDITION", 1);
        FIRST_EDITION = heartEdition2;
        $VALUES = new HeartEdition[]{heartEdition, heartEdition2};
    }

    public static HeartEdition valueOf(String str) {
        return (HeartEdition) Enum.valueOf(HeartEdition.class, str);
    }

    public static HeartEdition[] values() {
        return (HeartEdition[]) $VALUES.clone();
    }
}
