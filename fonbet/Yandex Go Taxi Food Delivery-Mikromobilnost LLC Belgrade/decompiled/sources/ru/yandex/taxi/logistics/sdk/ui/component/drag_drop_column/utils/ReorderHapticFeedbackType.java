package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/component/drag_drop_column/utils/ReorderHapticFeedbackType;", "", "START", "END", "MOVE", "sdk-ui-components"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReorderHapticFeedbackType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReorderHapticFeedbackType[] $VALUES;
    public static final ReorderHapticFeedbackType END;
    public static final ReorderHapticFeedbackType MOVE;
    public static final ReorderHapticFeedbackType START;

    static {
        ReorderHapticFeedbackType reorderHapticFeedbackType = new ReorderHapticFeedbackType("START", 0);
        START = reorderHapticFeedbackType;
        ReorderHapticFeedbackType reorderHapticFeedbackType2 = new ReorderHapticFeedbackType("END", 1);
        END = reorderHapticFeedbackType2;
        ReorderHapticFeedbackType reorderHapticFeedbackType3 = new ReorderHapticFeedbackType("MOVE", 2);
        MOVE = reorderHapticFeedbackType3;
        ReorderHapticFeedbackType[] reorderHapticFeedbackTypeArr = {reorderHapticFeedbackType, reorderHapticFeedbackType2, reorderHapticFeedbackType3};
        $VALUES = reorderHapticFeedbackTypeArr;
        $ENTRIES = kotlin.enums.a.a(reorderHapticFeedbackTypeArr);
    }

    public static ReorderHapticFeedbackType valueOf(String str) {
        return (ReorderHapticFeedbackType) Enum.valueOf(ReorderHapticFeedbackType.class, str);
    }

    public static ReorderHapticFeedbackType[] values() {
        return (ReorderHapticFeedbackType[]) $VALUES.clone();
    }
}
