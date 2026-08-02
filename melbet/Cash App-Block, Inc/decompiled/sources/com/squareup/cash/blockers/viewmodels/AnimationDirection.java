package com.squareup.cash.blockers.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AnimationDirection {
    public static final /* synthetic */ AnimationDirection[] $VALUES;
    public static final AnimationDirection BACKWARD;
    public static final AnimationDirection FORWARD;

    static {
        AnimationDirection animationDirection = new AnimationDirection("FORWARD", 0);
        FORWARD = animationDirection;
        AnimationDirection animationDirection2 = new AnimationDirection("BACKWARD", 1);
        BACKWARD = animationDirection2;
        $VALUES = new AnimationDirection[]{animationDirection, animationDirection2};
    }

    public static AnimationDirection valueOf(String str) {
        return (AnimationDirection) Enum.valueOf(AnimationDirection.class, str);
    }

    public static AnimationDirection[] values() {
        return (AnimationDirection[]) $VALUES.clone();
    }
}
