package com.squareup.cash.arcade.components.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class InlineIconPosition {
    public static final /* synthetic */ InlineIconPosition[] $VALUES;
    public static final InlineIconPosition END;
    public static final InlineIconPosition START;

    static {
        InlineIconPosition inlineIconPosition = new InlineIconPosition("START", 0);
        START = inlineIconPosition;
        InlineIconPosition inlineIconPosition2 = new InlineIconPosition("END", 1);
        END = inlineIconPosition2;
        $VALUES = new InlineIconPosition[]{inlineIconPosition, inlineIconPosition2};
    }

    public static InlineIconPosition valueOf(String str) {
        return (InlineIconPosition) Enum.valueOf(InlineIconPosition.class, str);
    }

    public static InlineIconPosition[] values() {
        return (InlineIconPosition[]) $VALUES.clone();
    }
}
