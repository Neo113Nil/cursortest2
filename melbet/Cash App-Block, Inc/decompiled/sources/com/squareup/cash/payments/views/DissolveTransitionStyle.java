package com.squareup.cash.payments.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DissolveTransitionStyle {
    public static final /* synthetic */ DissolveTransitionStyle[] $VALUES;
    public static final DissolveTransitionStyle FADE;
    public static final DissolveTransitionStyle WIPE;

    static {
        DissolveTransitionStyle dissolveTransitionStyle = new DissolveTransitionStyle("WIPE", 0);
        WIPE = dissolveTransitionStyle;
        DissolveTransitionStyle dissolveTransitionStyle2 = new DissolveTransitionStyle("FADE", 1);
        FADE = dissolveTransitionStyle2;
        $VALUES = new DissolveTransitionStyle[]{dissolveTransitionStyle, dissolveTransitionStyle2};
    }

    public static DissolveTransitionStyle valueOf(String str) {
        return (DissolveTransitionStyle) Enum.valueOf(DissolveTransitionStyle.class, str);
    }

    public static DissolveTransitionStyle[] values() {
        return (DissolveTransitionStyle[]) $VALUES.clone();
    }
}
