package com.squareup.cash.mooncake.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LoadingHelper$Position {
    public static final /* synthetic */ LoadingHelper$Position[] $VALUES;
    public static final LoadingHelper$Position Center;
    public static final LoadingHelper$Position TopLeft;

    static {
        LoadingHelper$Position loadingHelper$Position = new LoadingHelper$Position("TopLeft", 0);
        TopLeft = loadingHelper$Position;
        LoadingHelper$Position loadingHelper$Position2 = new LoadingHelper$Position("Center", 1);
        Center = loadingHelper$Position2;
        $VALUES = new LoadingHelper$Position[]{loadingHelper$Position, loadingHelper$Position2};
    }

    public static LoadingHelper$Position valueOf(String str) {
        return (LoadingHelper$Position) Enum.valueOf(LoadingHelper$Position.class, str);
    }

    public static LoadingHelper$Position[] values() {
        return (LoadingHelper$Position[]) $VALUES.clone();
    }
}
