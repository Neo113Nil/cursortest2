package ru.yandex.taxi.due_selector.impl.domain.entity;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/due_selector/impl/domain/entity/DuePickerButtonPosition;", "", "LEADING_BUTTON", "TRAILING_BUTTON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DuePickerButtonPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DuePickerButtonPosition[] $VALUES;
    public static final DuePickerButtonPosition LEADING_BUTTON;
    public static final DuePickerButtonPosition TRAILING_BUTTON;

    static {
        DuePickerButtonPosition duePickerButtonPosition = new DuePickerButtonPosition("LEADING_BUTTON", 0);
        LEADING_BUTTON = duePickerButtonPosition;
        DuePickerButtonPosition duePickerButtonPosition2 = new DuePickerButtonPosition("TRAILING_BUTTON", 1);
        TRAILING_BUTTON = duePickerButtonPosition2;
        DuePickerButtonPosition[] duePickerButtonPositionArr = {duePickerButtonPosition, duePickerButtonPosition2};
        $VALUES = duePickerButtonPositionArr;
        $ENTRIES = a.a(duePickerButtonPositionArr);
    }

    public static DuePickerButtonPosition valueOf(String str) {
        return (DuePickerButtonPosition) Enum.valueOf(DuePickerButtonPosition.class, str);
    }

    public static DuePickerButtonPosition[] values() {
        return (DuePickerButtonPosition[]) $VALUES.clone();
    }
}
