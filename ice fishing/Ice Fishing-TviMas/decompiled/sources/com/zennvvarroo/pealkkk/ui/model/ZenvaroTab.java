package com.zennvvarroo.pealkkk.ui.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppUiState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/zennvvarroo/pealkkk/ui/model/ZenvaroTab;", "", "(Ljava/lang/String;I)V", "OVERVIEW", "AREAS", "SHELVES", "ITEMS", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZenvaroTab {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ZenvaroTab[] $VALUES;
    public static final ZenvaroTab OVERVIEW = new ZenvaroTab("OVERVIEW", 0);
    public static final ZenvaroTab AREAS = new ZenvaroTab("AREAS", 1);
    public static final ZenvaroTab SHELVES = new ZenvaroTab("SHELVES", 2);
    public static final ZenvaroTab ITEMS = new ZenvaroTab("ITEMS", 3);

    private static final /* synthetic */ ZenvaroTab[] $values() {
        return new ZenvaroTab[]{OVERVIEW, AREAS, SHELVES, ITEMS};
    }

    public static EnumEntries<ZenvaroTab> getEntries() {
        return $ENTRIES;
    }

    public static ZenvaroTab valueOf(String str) {
        return (ZenvaroTab) Enum.valueOf(ZenvaroTab.class, str);
    }

    public static ZenvaroTab[] values() {
        return (ZenvaroTab[]) $VALUES.clone();
    }

    static {
        ZenvaroTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ZenvaroTab(String str, int i) {
    }
}
