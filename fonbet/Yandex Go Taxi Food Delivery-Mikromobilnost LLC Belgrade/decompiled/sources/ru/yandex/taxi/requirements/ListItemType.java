package ru.yandex.taxi.requirements;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/requirements/ListItemType;", "", "USUAL", "TOGGLE", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ListItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ListItemType[] $VALUES;
    public static final ListItemType TOGGLE;
    public static final ListItemType USUAL;

    static {
        ListItemType listItemType = new ListItemType("USUAL", 0);
        USUAL = listItemType;
        ListItemType listItemType2 = new ListItemType("TOGGLE", 1);
        TOGGLE = listItemType2;
        ListItemType[] listItemTypeArr = {listItemType, listItemType2};
        $VALUES = listItemTypeArr;
        $ENTRIES = a.a(listItemTypeArr);
    }

    public static ListItemType valueOf(String str) {
        return (ListItemType) Enum.valueOf(ListItemType.class, str);
    }

    public static ListItemType[] values() {
        return (ListItemType[]) $VALUES.clone();
    }
}
