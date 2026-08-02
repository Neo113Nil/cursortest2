package com.squareup.cash.account.components.accountswitcher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AnimationPhase {
    public static final /* synthetic */ AnimationPhase[] $VALUES;
    public static final AnimationPhase FINISHED;
    public static final AnimationPhase FRAME_SEQUENCE;
    public static final AnimationPhase IDLE_BOUNCE;
    public static final AnimationPhase LOADING;
    public static final AnimationPhase SETTLING;

    static {
        AnimationPhase animationPhase = new AnimationPhase("LOADING", 0);
        LOADING = animationPhase;
        AnimationPhase animationPhase2 = new AnimationPhase("FRAME_SEQUENCE", 1);
        FRAME_SEQUENCE = animationPhase2;
        AnimationPhase animationPhase3 = new AnimationPhase("IDLE_BOUNCE", 2);
        IDLE_BOUNCE = animationPhase3;
        AnimationPhase animationPhase4 = new AnimationPhase("SETTLING", 3);
        SETTLING = animationPhase4;
        AnimationPhase animationPhase5 = new AnimationPhase("FINISHED", 4);
        FINISHED = animationPhase5;
        $VALUES = new AnimationPhase[]{animationPhase, animationPhase2, animationPhase3, animationPhase4, animationPhase5};
    }

    public static AnimationPhase valueOf(String str) {
        return (AnimationPhase) Enum.valueOf(AnimationPhase.class, str);
    }

    public static AnimationPhase[] values() {
        return (AnimationPhase[]) $VALUES.clone();
    }
}
