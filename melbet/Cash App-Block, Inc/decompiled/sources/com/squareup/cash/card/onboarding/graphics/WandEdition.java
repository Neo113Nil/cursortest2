package com.squareup.cash.card.onboarding.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class WandEdition {
    public static final /* synthetic */ WandEdition[] $VALUES;
    public static final WandEdition FIRST_EDITION;
    public static final WandEdition STANDARD;

    static {
        WandEdition wandEdition = new WandEdition("STANDARD", 0);
        STANDARD = wandEdition;
        WandEdition wandEdition2 = new WandEdition("FIRST_EDITION", 1);
        FIRST_EDITION = wandEdition2;
        $VALUES = new WandEdition[]{wandEdition, wandEdition2};
    }

    public static WandEdition valueOf(String str) {
        return (WandEdition) Enum.valueOf(WandEdition.class, str);
    }

    public static WandEdition[] values() {
        return (WandEdition[]) $VALUES.clone();
    }
}
