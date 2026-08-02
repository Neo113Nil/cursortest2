package com.squareup.cash.mooncake.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LoadingHelper$InDirection {
    public static final /* synthetic */ LoadingHelper$InDirection[] $VALUES;
    public static final LoadingHelper$InDirection BACKWARD;
    public static final LoadingHelper$InDirection FORWARD;

    static {
        LoadingHelper$InDirection loadingHelper$InDirection = new LoadingHelper$InDirection("FORWARD", 0);
        FORWARD = loadingHelper$InDirection;
        LoadingHelper$InDirection loadingHelper$InDirection2 = new LoadingHelper$InDirection("BACKWARD", 1);
        BACKWARD = loadingHelper$InDirection2;
        $VALUES = new LoadingHelper$InDirection[]{loadingHelper$InDirection, loadingHelper$InDirection2, new LoadingHelper$InDirection("IN_PLACE", 2)};
    }

    public static LoadingHelper$InDirection valueOf(String str) {
        return (LoadingHelper$InDirection) Enum.valueOf(LoadingHelper$InDirection.class, str);
    }

    public static LoadingHelper$InDirection[] values() {
        return (LoadingHelper$InDirection[]) $VALUES.clone();
    }
}
