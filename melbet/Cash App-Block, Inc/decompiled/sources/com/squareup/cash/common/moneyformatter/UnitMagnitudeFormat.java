package com.squareup.cash.common.moneyformatter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class UnitMagnitudeFormat {
    public static final /* synthetic */ UnitMagnitudeFormat[] $VALUES;
    public static final UnitMagnitudeFormat ABBREVIATED;

    static {
        UnitMagnitudeFormat unitMagnitudeFormat = new UnitMagnitudeFormat("ABBREVIATED", 0);
        ABBREVIATED = unitMagnitudeFormat;
        $VALUES = new UnitMagnitudeFormat[]{unitMagnitudeFormat, new UnitMagnitudeFormat("FULL", 1)};
    }

    public static UnitMagnitudeFormat valueOf(String str) {
        return (UnitMagnitudeFormat) Enum.valueOf(UnitMagnitudeFormat.class, str);
    }

    public static UnitMagnitudeFormat[] values() {
        return (UnitMagnitudeFormat[]) $VALUES.clone();
    }
}
