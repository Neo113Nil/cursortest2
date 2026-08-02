package com.squareup.cash.blockers.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LoadingAnimationDirection {
    public static final /* synthetic */ LoadingAnimationDirection[] $VALUES;
    public static final LoadingAnimationDirection BACKWARD;
    public static final LoadingAnimationDirection FORWARD;

    static {
        LoadingAnimationDirection loadingAnimationDirection = new LoadingAnimationDirection("FORWARD", 0);
        FORWARD = loadingAnimationDirection;
        LoadingAnimationDirection loadingAnimationDirection2 = new LoadingAnimationDirection("BACKWARD", 1);
        BACKWARD = loadingAnimationDirection2;
        $VALUES = new LoadingAnimationDirection[]{loadingAnimationDirection, loadingAnimationDirection2};
    }

    public static LoadingAnimationDirection valueOf(String str) {
        return (LoadingAnimationDirection) Enum.valueOf(LoadingAnimationDirection.class, str);
    }

    public static LoadingAnimationDirection[] values() {
        return (LoadingAnimationDirection[]) $VALUES.clone();
    }
}
