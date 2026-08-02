package com.squareup.cash.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class PreserveAspectRatio$Alignment {
    public static final /* synthetic */ PreserveAspectRatio$Alignment[] $VALUES;
    public static final PreserveAspectRatio$Alignment None;
    public static final PreserveAspectRatio$Alignment XMaxYMax;
    public static final PreserveAspectRatio$Alignment XMaxYMid;
    public static final PreserveAspectRatio$Alignment XMaxYMin;
    public static final PreserveAspectRatio$Alignment XMidYMax;
    public static final PreserveAspectRatio$Alignment XMidYMid;
    public static final PreserveAspectRatio$Alignment XMidYMin;
    public static final PreserveAspectRatio$Alignment XMinYMax;
    public static final PreserveAspectRatio$Alignment XMinYMid;
    public static final PreserveAspectRatio$Alignment XMinYMin;

    static {
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment = new PreserveAspectRatio$Alignment("None", 0);
        None = preserveAspectRatio$Alignment;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment2 = new PreserveAspectRatio$Alignment("XMinYMin", 1);
        XMinYMin = preserveAspectRatio$Alignment2;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment3 = new PreserveAspectRatio$Alignment("XMidYMin", 2);
        XMidYMin = preserveAspectRatio$Alignment3;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment4 = new PreserveAspectRatio$Alignment("XMaxYMin", 3);
        XMaxYMin = preserveAspectRatio$Alignment4;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment5 = new PreserveAspectRatio$Alignment("XMinYMid", 4);
        XMinYMid = preserveAspectRatio$Alignment5;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment6 = new PreserveAspectRatio$Alignment("XMidYMid", 5);
        XMidYMid = preserveAspectRatio$Alignment6;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment7 = new PreserveAspectRatio$Alignment("XMaxYMid", 6);
        XMaxYMid = preserveAspectRatio$Alignment7;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment8 = new PreserveAspectRatio$Alignment("XMinYMax", 7);
        XMinYMax = preserveAspectRatio$Alignment8;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment9 = new PreserveAspectRatio$Alignment("XMidYMax", 8);
        XMidYMax = preserveAspectRatio$Alignment9;
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment10 = new PreserveAspectRatio$Alignment("XMaxYMax", 9);
        XMaxYMax = preserveAspectRatio$Alignment10;
        $VALUES = new PreserveAspectRatio$Alignment[]{preserveAspectRatio$Alignment, preserveAspectRatio$Alignment2, preserveAspectRatio$Alignment3, preserveAspectRatio$Alignment4, preserveAspectRatio$Alignment5, preserveAspectRatio$Alignment6, preserveAspectRatio$Alignment7, preserveAspectRatio$Alignment8, preserveAspectRatio$Alignment9, preserveAspectRatio$Alignment10};
    }

    public static PreserveAspectRatio$Alignment valueOf(String str) {
        return (PreserveAspectRatio$Alignment) Enum.valueOf(PreserveAspectRatio$Alignment.class, str);
    }

    public static PreserveAspectRatio$Alignment[] values() {
        return (PreserveAspectRatio$Alignment[]) $VALUES.clone();
    }
}
