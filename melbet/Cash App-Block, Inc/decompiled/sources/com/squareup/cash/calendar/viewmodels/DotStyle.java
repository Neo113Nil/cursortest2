package com.squareup.cash.calendar.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DotStyle {
    public static final /* synthetic */ DotStyle[] $VALUES;
    public static final DotStyle DISABLED;
    public static final DotStyle NONE;
    public static final DotStyle STANDARD;

    static {
        DotStyle dotStyle = new DotStyle("NONE", 0);
        NONE = dotStyle;
        DotStyle dotStyle2 = new DotStyle("STANDARD", 1);
        STANDARD = dotStyle2;
        DotStyle dotStyle3 = new DotStyle("DISABLED", 2);
        DISABLED = dotStyle3;
        $VALUES = new DotStyle[]{dotStyle, dotStyle2, dotStyle3};
    }

    public static DotStyle valueOf(String str) {
        return (DotStyle) Enum.valueOf(DotStyle.class, str);
    }

    public static DotStyle[] values() {
        return (DotStyle[]) $VALUES.clone();
    }
}
