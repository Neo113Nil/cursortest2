package com.squareup.cash.common.composeui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ProgressMeter$ZeroBehavior {
    public static final /* synthetic */ ProgressMeter$ZeroBehavior[] $VALUES;
    public static final ProgressMeter$ZeroBehavior HIDDEN;
    public static final ProgressMeter$ZeroBehavior MINIMUM_PROGRESS;

    static {
        ProgressMeter$ZeroBehavior progressMeter$ZeroBehavior = new ProgressMeter$ZeroBehavior("MINIMUM_PROGRESS", 0);
        MINIMUM_PROGRESS = progressMeter$ZeroBehavior;
        ProgressMeter$ZeroBehavior progressMeter$ZeroBehavior2 = new ProgressMeter$ZeroBehavior("HIDDEN", 1);
        HIDDEN = progressMeter$ZeroBehavior2;
        $VALUES = new ProgressMeter$ZeroBehavior[]{progressMeter$ZeroBehavior, progressMeter$ZeroBehavior2};
    }

    public static ProgressMeter$ZeroBehavior valueOf(String str) {
        return (ProgressMeter$ZeroBehavior) Enum.valueOf(ProgressMeter$ZeroBehavior.class, str);
    }

    public static ProgressMeter$ZeroBehavior[] values() {
        return (ProgressMeter$ZeroBehavior[]) $VALUES.clone();
    }
}
