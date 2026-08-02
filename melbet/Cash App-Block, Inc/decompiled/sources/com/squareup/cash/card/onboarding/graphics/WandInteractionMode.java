package com.squareup.cash.card.onboarding.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class WandInteractionMode {
    public static final /* synthetic */ WandInteractionMode[] $VALUES;
    public static final WandInteractionMode DragSpringBack;
    public static final WandInteractionMode None;
    public static final WandInteractionMode YawFlick;

    static {
        WandInteractionMode wandInteractionMode = new WandInteractionMode("None", 0);
        None = wandInteractionMode;
        WandInteractionMode wandInteractionMode2 = new WandInteractionMode("YawFlick", 1);
        YawFlick = wandInteractionMode2;
        WandInteractionMode wandInteractionMode3 = new WandInteractionMode("DragSpringBack", 2);
        DragSpringBack = wandInteractionMode3;
        $VALUES = new WandInteractionMode[]{wandInteractionMode, wandInteractionMode2, wandInteractionMode3};
    }

    public static WandInteractionMode valueOf(String str) {
        return (WandInteractionMode) Enum.valueOf(WandInteractionMode.class, str);
    }

    public static WandInteractionMode[] values() {
        return (WandInteractionMode[]) $VALUES.clone();
    }
}
