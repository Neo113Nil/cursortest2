package com.squareup.cash.card.onboarding.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MiniCardEdition {
    public static final /* synthetic */ MiniCardEdition[] $VALUES;
    public static final MiniCardEdition FIRST_EDITION;
    public static final MiniCardEdition STANDARD;

    static {
        MiniCardEdition miniCardEdition = new MiniCardEdition("STANDARD", 0);
        STANDARD = miniCardEdition;
        MiniCardEdition miniCardEdition2 = new MiniCardEdition("FIRST_EDITION", 1);
        FIRST_EDITION = miniCardEdition2;
        $VALUES = new MiniCardEdition[]{miniCardEdition, miniCardEdition2};
    }

    public static MiniCardEdition valueOf(String str) {
        return (MiniCardEdition) Enum.valueOf(MiniCardEdition.class, str);
    }

    public static MiniCardEdition[] values() {
        return (MiniCardEdition[]) $VALUES.clone();
    }
}
