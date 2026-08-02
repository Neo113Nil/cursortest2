package com.squareup.cash.mooncake.compose_ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class OnPressBehaviour {
    public static final /* synthetic */ OnPressBehaviour[] $VALUES;
    public static final PositionProvider Companion;
    public static final OnPressBehaviour NO_SCALING;
    public static final OnPressBehaviour SCALE_WHOLE_BUTTON;

    static {
        OnPressBehaviour onPressBehaviour = new OnPressBehaviour("NO_SCALING", 0);
        NO_SCALING = onPressBehaviour;
        OnPressBehaviour onPressBehaviour2 = new OnPressBehaviour("SCALE_WHOLE_BUTTON", 1);
        SCALE_WHOLE_BUTTON = onPressBehaviour2;
        $VALUES = new OnPressBehaviour[]{onPressBehaviour, onPressBehaviour2};
        Companion = new PositionProvider();
    }

    public static OnPressBehaviour valueOf(String str) {
        return (OnPressBehaviour) Enum.valueOf(OnPressBehaviour.class, str);
    }

    public static OnPressBehaviour[] values() {
        return (OnPressBehaviour[]) $VALUES.clone();
    }
}
