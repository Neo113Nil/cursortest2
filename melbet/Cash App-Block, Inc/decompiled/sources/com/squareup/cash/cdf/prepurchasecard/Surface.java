package com.squareup.cash.cdf.prepurchasecard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Surface {
    public static final /* synthetic */ Surface[] $VALUES;
    public static final Surface AFTERPAY_APPLET;
    public static final Surface CARD_TAB;

    static {
        Surface surface = new Surface("CARD_TAB", 0);
        CARD_TAB = surface;
        Surface surface2 = new Surface("AFTERPAY_APPLET", 1);
        AFTERPAY_APPLET = surface2;
        $VALUES = new Surface[]{surface, surface2};
    }

    public static Surface valueOf(String str) {
        return (Surface) Enum.valueOf(Surface.class, str);
    }

    public static Surface[] values() {
        return (Surface[]) $VALUES.clone();
    }
}
