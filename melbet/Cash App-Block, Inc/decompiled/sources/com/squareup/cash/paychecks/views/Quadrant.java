package com.squareup.cash.paychecks.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Quadrant {
    public static final /* synthetic */ Quadrant[] $VALUES;
    public static final Quadrant BOTTOM_LEFT;
    public static final Quadrant BOTTOM_RIGHT;
    public static final Quadrant TOP_LEFT;
    public static final Quadrant TOP_RIGHT;

    static {
        Quadrant quadrant = new Quadrant("TOP_LEFT", 0);
        TOP_LEFT = quadrant;
        Quadrant quadrant2 = new Quadrant("BOTTOM_LEFT", 1);
        BOTTOM_LEFT = quadrant2;
        Quadrant quadrant3 = new Quadrant("BOTTOM_RIGHT", 2);
        BOTTOM_RIGHT = quadrant3;
        Quadrant quadrant4 = new Quadrant("TOP_RIGHT", 3);
        TOP_RIGHT = quadrant4;
        $VALUES = new Quadrant[]{quadrant, quadrant2, quadrant3, quadrant4};
    }

    public static Quadrant valueOf(String str) {
        return (Quadrant) Enum.valueOf(Quadrant.class, str);
    }

    public static Quadrant[] values() {
        return (Quadrant[]) $VALUES.clone();
    }
}
