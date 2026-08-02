package com.squareup.cash.arcade.components.input;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class SelectionCardStyle {
    public static final /* synthetic */ SelectionCardStyle[] $VALUES = {new SelectionCardStyle("RADIO", 0), new SelectionCardStyle("CHECKBOX", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    SelectionCardStyle EF5;

    public static SelectionCardStyle valueOf(String str) {
        return (SelectionCardStyle) Enum.valueOf(SelectionCardStyle.class, str);
    }

    public static SelectionCardStyle[] values() {
        return (SelectionCardStyle[]) $VALUES.clone();
    }
}
