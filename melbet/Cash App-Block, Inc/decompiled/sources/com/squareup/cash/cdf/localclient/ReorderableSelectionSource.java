package com.squareup.cash.cdf.localclient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ReorderableSelectionSource {
    public static final /* synthetic */ ReorderableSelectionSource[] $VALUES;
    public static final ReorderableSelectionSource BRAND_PROFILE;
    public static final ReorderableSelectionSource LOCAL_HOME;

    static {
        ReorderableSelectionSource reorderableSelectionSource = new ReorderableSelectionSource("LOCAL_HOME", 0);
        LOCAL_HOME = reorderableSelectionSource;
        ReorderableSelectionSource reorderableSelectionSource2 = new ReorderableSelectionSource("BRAND_PROFILE", 1);
        BRAND_PROFILE = reorderableSelectionSource2;
        $VALUES = new ReorderableSelectionSource[]{reorderableSelectionSource, reorderableSelectionSource2};
    }

    public static ReorderableSelectionSource valueOf(String str) {
        return (ReorderableSelectionSource) Enum.valueOf(ReorderableSelectionSource.class, str);
    }

    public static ReorderableSelectionSource[] values() {
        return (ReorderableSelectionSource[]) $VALUES.clone();
    }
}
