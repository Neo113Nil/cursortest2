package com.squareup.cash.arcade.components.list;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ListUnorderedProminence {
    public static final /* synthetic */ ListUnorderedProminence[] $VALUES;
    public static final ListUnorderedProminence Standard;
    public static final ListUnorderedProminence Subtle;

    static {
        ListUnorderedProminence listUnorderedProminence = new ListUnorderedProminence("Standard", 0);
        Standard = listUnorderedProminence;
        ListUnorderedProminence listUnorderedProminence2 = new ListUnorderedProminence("Subtle", 1);
        Subtle = listUnorderedProminence2;
        $VALUES = new ListUnorderedProminence[]{listUnorderedProminence, listUnorderedProminence2};
    }

    public static ListUnorderedProminence valueOf(String str) {
        return (ListUnorderedProminence) Enum.valueOf(ListUnorderedProminence.class, str);
    }

    public static ListUnorderedProminence[] values() {
        return (ListUnorderedProminence[]) $VALUES.clone();
    }
}
