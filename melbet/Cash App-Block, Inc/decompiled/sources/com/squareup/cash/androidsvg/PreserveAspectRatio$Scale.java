package com.squareup.cash.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PreserveAspectRatio$Scale {
    public static final /* synthetic */ PreserveAspectRatio$Scale[] $VALUES;
    public static final PreserveAspectRatio$Scale Meet;
    public static final PreserveAspectRatio$Scale Slice;

    static {
        PreserveAspectRatio$Scale preserveAspectRatio$Scale = new PreserveAspectRatio$Scale("Meet", 0);
        Meet = preserveAspectRatio$Scale;
        PreserveAspectRatio$Scale preserveAspectRatio$Scale2 = new PreserveAspectRatio$Scale("Slice", 1);
        Slice = preserveAspectRatio$Scale2;
        $VALUES = new PreserveAspectRatio$Scale[]{preserveAspectRatio$Scale, preserveAspectRatio$Scale2};
    }

    public static PreserveAspectRatio$Scale valueOf(String str) {
        return (PreserveAspectRatio$Scale) Enum.valueOf(PreserveAspectRatio$Scale.class, str);
    }

    public static PreserveAspectRatio$Scale[] values() {
        return (PreserveAspectRatio$Scale[]) $VALUES.clone();
    }
}
