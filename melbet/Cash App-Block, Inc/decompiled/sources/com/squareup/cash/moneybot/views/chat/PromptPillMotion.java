package com.squareup.cash.moneybot.views.chat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class PromptPillMotion {
    public static final /* synthetic */ PromptPillMotion[] $VALUES;
    public static final PromptPillMotion Soft;
    public static final PromptPillMotion Steady;

    static {
        PromptPillMotion promptPillMotion = new PromptPillMotion("Soft", 0);
        Soft = promptPillMotion;
        PromptPillMotion promptPillMotion2 = new PromptPillMotion("Steady", 1);
        Steady = promptPillMotion2;
        $VALUES = new PromptPillMotion[]{promptPillMotion, promptPillMotion2};
    }

    public static PromptPillMotion valueOf(String str) {
        return (PromptPillMotion) Enum.valueOf(PromptPillMotion.class, str);
    }

    public static PromptPillMotion[] values() {
        return (PromptPillMotion[]) $VALUES.clone();
    }
}
