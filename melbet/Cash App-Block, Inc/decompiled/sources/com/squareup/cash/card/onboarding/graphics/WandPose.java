package com.squareup.cash.card.onboarding.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class WandPose {
    public static final /* synthetic */ WandPose[] $VALUES;
    public static final WandPose Active;
    public static final WandPose Float;
    public static final WandPose Inactive;
    public static final WandPose Lean;
    public static final WandPose Locked;
    public static final WandPose Review;
    public static final WandPose Still;

    static {
        WandPose wandPose = new WandPose("Float", 0);
        Float = wandPose;
        WandPose wandPose2 = new WandPose("Still", 1);
        Still = wandPose2;
        WandPose wandPose3 = new WandPose("Active", 2);
        Active = wandPose3;
        WandPose wandPose4 = new WandPose("Twirl", 3);
        WandPose wandPose5 = new WandPose("Locked", 4);
        Locked = wandPose5;
        WandPose wandPose6 = new WandPose("Lean", 5);
        Lean = wandPose6;
        WandPose wandPose7 = new WandPose("Review", 6);
        Review = wandPose7;
        WandPose wandPose8 = new WandPose("Inactive", 7);
        Inactive = wandPose8;
        $VALUES = new WandPose[]{wandPose, wandPose2, wandPose3, wandPose4, wandPose5, wandPose6, wandPose7, wandPose8};
    }

    public static WandPose valueOf(String str) {
        return (WandPose) Enum.valueOf(WandPose.class, str);
    }

    public static WandPose[] values() {
        return (WandPose[]) $VALUES.clone();
    }
}
