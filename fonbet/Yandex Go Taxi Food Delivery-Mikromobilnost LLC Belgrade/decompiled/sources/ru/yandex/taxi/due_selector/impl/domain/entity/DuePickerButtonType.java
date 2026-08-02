package ru.yandex.taxi.due_selector.impl.domain.entity;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/due_selector/impl/domain/entity/DuePickerButtonType;", "", "UNKNOWN", "ON_DEMAND_BUTTON", "SCHEDULED_ORDER_BUTTON", "UNAVAILABLE_BUTTON", "LOADING_BUTTON", "RETRY_BUTTON", "CLOSE_BUTTON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DuePickerButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DuePickerButtonType[] $VALUES;
    public static final DuePickerButtonType CLOSE_BUTTON;
    public static final DuePickerButtonType LOADING_BUTTON;
    public static final DuePickerButtonType ON_DEMAND_BUTTON;
    public static final DuePickerButtonType RETRY_BUTTON;
    public static final DuePickerButtonType SCHEDULED_ORDER_BUTTON;
    public static final DuePickerButtonType UNAVAILABLE_BUTTON;
    public static final DuePickerButtonType UNKNOWN;

    static {
        DuePickerButtonType duePickerButtonType = new DuePickerButtonType("UNKNOWN", 0);
        UNKNOWN = duePickerButtonType;
        DuePickerButtonType duePickerButtonType2 = new DuePickerButtonType("ON_DEMAND_BUTTON", 1);
        ON_DEMAND_BUTTON = duePickerButtonType2;
        DuePickerButtonType duePickerButtonType3 = new DuePickerButtonType("SCHEDULED_ORDER_BUTTON", 2);
        SCHEDULED_ORDER_BUTTON = duePickerButtonType3;
        DuePickerButtonType duePickerButtonType4 = new DuePickerButtonType("UNAVAILABLE_BUTTON", 3);
        UNAVAILABLE_BUTTON = duePickerButtonType4;
        DuePickerButtonType duePickerButtonType5 = new DuePickerButtonType("LOADING_BUTTON", 4);
        LOADING_BUTTON = duePickerButtonType5;
        DuePickerButtonType duePickerButtonType6 = new DuePickerButtonType("RETRY_BUTTON", 5);
        RETRY_BUTTON = duePickerButtonType6;
        DuePickerButtonType duePickerButtonType7 = new DuePickerButtonType("CLOSE_BUTTON", 6);
        CLOSE_BUTTON = duePickerButtonType7;
        DuePickerButtonType[] duePickerButtonTypeArr = {duePickerButtonType, duePickerButtonType2, duePickerButtonType3, duePickerButtonType4, duePickerButtonType5, duePickerButtonType6, duePickerButtonType7};
        $VALUES = duePickerButtonTypeArr;
        $ENTRIES = a.a(duePickerButtonTypeArr);
    }

    public static DuePickerButtonType valueOf(String str) {
        return (DuePickerButtonType) Enum.valueOf(DuePickerButtonType.class, str);
    }

    public static DuePickerButtonType[] values() {
        return (DuePickerButtonType[]) $VALUES.clone();
    }
}
