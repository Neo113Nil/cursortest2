package com.zennvvarroo.pealkkk.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoredItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/zennvvarroo/pealkkk/data/model/ItemCategory;", "", "(Ljava/lang/String;I)V", "TOOLS", "KITCHEN", "ELECTRONICS", "DOCUMENTS", "CLEANING", "CLOTHING", "FOOD", "OFFICE", "OTHER", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItemCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ItemCategory[] $VALUES;
    public static final ItemCategory TOOLS = new ItemCategory("TOOLS", 0);
    public static final ItemCategory KITCHEN = new ItemCategory("KITCHEN", 1);
    public static final ItemCategory ELECTRONICS = new ItemCategory("ELECTRONICS", 2);
    public static final ItemCategory DOCUMENTS = new ItemCategory("DOCUMENTS", 3);
    public static final ItemCategory CLEANING = new ItemCategory("CLEANING", 4);
    public static final ItemCategory CLOTHING = new ItemCategory("CLOTHING", 5);
    public static final ItemCategory FOOD = new ItemCategory("FOOD", 6);
    public static final ItemCategory OFFICE = new ItemCategory("OFFICE", 7);
    public static final ItemCategory OTHER = new ItemCategory("OTHER", 8);

    private static final /* synthetic */ ItemCategory[] $values() {
        return new ItemCategory[]{TOOLS, KITCHEN, ELECTRONICS, DOCUMENTS, CLEANING, CLOTHING, FOOD, OFFICE, OTHER};
    }

    public static EnumEntries<ItemCategory> getEntries() {
        return $ENTRIES;
    }

    public static ItemCategory valueOf(String str) {
        return (ItemCategory) Enum.valueOf(ItemCategory.class, str);
    }

    public static ItemCategory[] values() {
        return (ItemCategory[]) $VALUES.clone();
    }

    static {
        ItemCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ItemCategory(String str, int i) {
    }
}
