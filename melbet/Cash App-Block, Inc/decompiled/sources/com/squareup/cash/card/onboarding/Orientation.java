package com.squareup.cash.card.onboarding;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Orientation {
    public static final /* synthetic */ Orientation[] $VALUES;
    public static final Orientation LANDSCAPE_LEFT;
    public static final Orientation LANDSCAPE_RIGHT;
    public static final Orientation PORTRAIT;

    static {
        Orientation orientation = new Orientation("PORTRAIT", 0);
        PORTRAIT = orientation;
        Orientation orientation2 = new Orientation("LANDSCAPE_LEFT", 1);
        LANDSCAPE_LEFT = orientation2;
        Orientation orientation3 = new Orientation("LANDSCAPE_RIGHT", 2);
        LANDSCAPE_RIGHT = orientation3;
        $VALUES = new Orientation[]{orientation, orientation2, orientation3};
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) $VALUES.clone();
    }
}
