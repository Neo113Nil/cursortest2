package ru.yandex.taxi.due_selector.impl.presentation.ui.picker;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/due_selector/impl/presentation/ui/picker/DuePickerStateInfo$PickerState", "", "Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/DuePickerStateInfo$PickerState;", "LOADING", "ERROR", "VALID_DATE", "INVALID_DATE", "UNAVAILABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DuePickerStateInfo$PickerState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DuePickerStateInfo$PickerState[] $VALUES;
    public static final DuePickerStateInfo$PickerState ERROR;
    public static final DuePickerStateInfo$PickerState INVALID_DATE;
    public static final DuePickerStateInfo$PickerState LOADING;
    public static final DuePickerStateInfo$PickerState UNAVAILABLE;
    public static final DuePickerStateInfo$PickerState VALID_DATE;

    static {
        DuePickerStateInfo$PickerState duePickerStateInfo$PickerState = new DuePickerStateInfo$PickerState("LOADING", 0);
        LOADING = duePickerStateInfo$PickerState;
        DuePickerStateInfo$PickerState duePickerStateInfo$PickerState2 = new DuePickerStateInfo$PickerState("ERROR", 1);
        ERROR = duePickerStateInfo$PickerState2;
        DuePickerStateInfo$PickerState duePickerStateInfo$PickerState3 = new DuePickerStateInfo$PickerState("VALID_DATE", 2);
        VALID_DATE = duePickerStateInfo$PickerState3;
        DuePickerStateInfo$PickerState duePickerStateInfo$PickerState4 = new DuePickerStateInfo$PickerState("INVALID_DATE", 3);
        INVALID_DATE = duePickerStateInfo$PickerState4;
        DuePickerStateInfo$PickerState duePickerStateInfo$PickerState5 = new DuePickerStateInfo$PickerState("UNAVAILABLE", 4);
        UNAVAILABLE = duePickerStateInfo$PickerState5;
        DuePickerStateInfo$PickerState[] duePickerStateInfo$PickerStateArr = {duePickerStateInfo$PickerState, duePickerStateInfo$PickerState2, duePickerStateInfo$PickerState3, duePickerStateInfo$PickerState4, duePickerStateInfo$PickerState5};
        $VALUES = duePickerStateInfo$PickerStateArr;
        $ENTRIES = kotlin.enums.a.a(duePickerStateInfo$PickerStateArr);
    }

    public static DuePickerStateInfo$PickerState valueOf(String str) {
        return (DuePickerStateInfo$PickerState) Enum.valueOf(DuePickerStateInfo$PickerState.class, str);
    }

    public static DuePickerStateInfo$PickerState[] values() {
        return (DuePickerStateInfo$PickerState[]) $VALUES.clone();
    }
}
