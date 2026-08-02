package com.squareup.cash.marketing.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ArrowOrientation {
    public static final /* synthetic */ ArrowOrientation[] $VALUES;
    public static final ArrowOrientation Down;
    public static final ArrowOrientation Up;

    static {
        ArrowOrientation arrowOrientation = new ArrowOrientation("Up", 0);
        Up = arrowOrientation;
        ArrowOrientation arrowOrientation2 = new ArrowOrientation("Down", 1);
        Down = arrowOrientation2;
        $VALUES = new ArrowOrientation[]{arrowOrientation, arrowOrientation2};
    }

    public static ArrowOrientation valueOf(String str) {
        return (ArrowOrientation) Enum.valueOf(ArrowOrientation.class, str);
    }

    public static ArrowOrientation[] values() {
        return (ArrowOrientation[]) $VALUES.clone();
    }
}
