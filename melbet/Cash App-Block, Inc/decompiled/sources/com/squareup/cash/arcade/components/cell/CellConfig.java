package com.squareup.cash.arcade.components.cell;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CellConfig {
    public static final /* synthetic */ CellConfig[] $VALUES;
    public static final CellConfig LargeIcon;
    public static final CellConfig SmallOrNoIcon;

    static {
        CellConfig cellConfig = new CellConfig("SmallOrNoIcon", 0);
        SmallOrNoIcon = cellConfig;
        CellConfig cellConfig2 = new CellConfig("LargeIcon", 1);
        LargeIcon = cellConfig2;
        $VALUES = new CellConfig[]{cellConfig, cellConfig2};
    }

    public static CellConfig valueOf(String str) {
        return (CellConfig) Enum.valueOf(CellConfig.class, str);
    }

    public static CellConfig[] values() {
        return (CellConfig[]) $VALUES.clone();
    }
}
