package com.squareup.cash.arcade.components.list;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ListUnorderedSize {
    public static final /* synthetic */ ListUnorderedSize[] $VALUES;
    public static final ListUnorderedSize Compact;
    public static final ListUnorderedSize Large;

    static {
        ListUnorderedSize listUnorderedSize = new ListUnorderedSize("Compact", 0);
        Compact = listUnorderedSize;
        ListUnorderedSize listUnorderedSize2 = new ListUnorderedSize("Large", 1);
        Large = listUnorderedSize2;
        $VALUES = new ListUnorderedSize[]{listUnorderedSize, listUnorderedSize2};
    }

    public static ListUnorderedSize valueOf(String str) {
        return (ListUnorderedSize) Enum.valueOf(ListUnorderedSize.class, str);
    }

    public static ListUnorderedSize[] values() {
        return (ListUnorderedSize[]) $VALUES.clone();
    }
}
