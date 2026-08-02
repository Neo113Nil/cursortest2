package com.squareup.cash.cdf.moneybothome;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TapElement {
    public static final /* synthetic */ TapElement[] $VALUES;
    public static final TapElement PRIMARY_CTA;
    public static final TapElement SECONDARY_CTA;
    public static final TapElement WIDGET;

    static {
        TapElement tapElement = new TapElement("PRIMARY_CTA", 0);
        PRIMARY_CTA = tapElement;
        TapElement tapElement2 = new TapElement("WIDGET", 1);
        WIDGET = tapElement2;
        TapElement tapElement3 = new TapElement("SECONDARY_CTA", 2);
        SECONDARY_CTA = tapElement3;
        $VALUES = new TapElement[]{tapElement, tapElement2, tapElement3};
    }

    public static TapElement valueOf(String str) {
        return (TapElement) Enum.valueOf(TapElement.class, str);
    }

    public static TapElement[] values() {
        return (TapElement[]) $VALUES.clone();
    }
}
