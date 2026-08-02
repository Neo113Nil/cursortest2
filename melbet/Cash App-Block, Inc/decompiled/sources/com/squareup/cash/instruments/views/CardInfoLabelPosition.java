package com.squareup.cash.instruments.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CardInfoLabelPosition {
    public static final /* synthetic */ CardInfoLabelPosition[] $VALUES;
    public static final CardInfoLabelPosition BOTTOM_LEFT;
    public static final CardInfoLabelPosition TOP_RIGHT;

    static {
        CardInfoLabelPosition cardInfoLabelPosition = new CardInfoLabelPosition("TOP_RIGHT", 0);
        TOP_RIGHT = cardInfoLabelPosition;
        CardInfoLabelPosition cardInfoLabelPosition2 = new CardInfoLabelPosition("BOTTOM_LEFT", 1);
        BOTTOM_LEFT = cardInfoLabelPosition2;
        $VALUES = new CardInfoLabelPosition[]{cardInfoLabelPosition, cardInfoLabelPosition2};
    }

    public static CardInfoLabelPosition valueOf(String str) {
        return (CardInfoLabelPosition) Enum.valueOf(CardInfoLabelPosition.class, str);
    }

    public static CardInfoLabelPosition[] values() {
        return (CardInfoLabelPosition[]) $VALUES.clone();
    }
}
