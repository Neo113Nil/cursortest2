package com.squareup.cash.common.composeui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ProgressMeter$CompletionBehavior {
    public static final /* synthetic */ ProgressMeter$CompletionBehavior[] $VALUES;
    public static final ProgressMeter$CompletionBehavior NONE;
    public static final ProgressMeter$CompletionBehavior SOLID_BACKGROUND;

    static {
        ProgressMeter$CompletionBehavior progressMeter$CompletionBehavior = new ProgressMeter$CompletionBehavior("SOLID_BACKGROUND", 0);
        SOLID_BACKGROUND = progressMeter$CompletionBehavior;
        ProgressMeter$CompletionBehavior progressMeter$CompletionBehavior2 = new ProgressMeter$CompletionBehavior("NONE", 1);
        NONE = progressMeter$CompletionBehavior2;
        $VALUES = new ProgressMeter$CompletionBehavior[]{progressMeter$CompletionBehavior, progressMeter$CompletionBehavior2};
    }

    public static ProgressMeter$CompletionBehavior valueOf(String str) {
        return (ProgressMeter$CompletionBehavior) Enum.valueOf(ProgressMeter$CompletionBehavior.class, str);
    }

    public static ProgressMeter$CompletionBehavior[] values() {
        return (ProgressMeter$CompletionBehavior[]) $VALUES.clone();
    }
}
