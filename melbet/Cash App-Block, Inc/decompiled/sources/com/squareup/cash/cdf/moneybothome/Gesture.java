package com.squareup.cash.cdf.moneybothome;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Gesture {
    public static final /* synthetic */ Gesture[] $VALUES;
    public static final Gesture SWIPE;
    public static final Gesture TAP;

    static {
        Gesture gesture = new Gesture("TAP", 0);
        TAP = gesture;
        Gesture gesture2 = new Gesture("SWIPE", 1);
        SWIPE = gesture2;
        $VALUES = new Gesture[]{gesture, gesture2};
    }

    public static Gesture valueOf(String str) {
        return (Gesture) Enum.valueOf(Gesture.class, str);
    }

    public static Gesture[] values() {
        return (Gesture[]) $VALUES.clone();
    }
}
