package defpackage;

import ru.yandex.taxi.due_selector.impl.presentation.ui.picker.DuePickerStateInfo$PickerState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class rwm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DuePickerStateInfo$PickerState.values().length];
        try {
            iArr[DuePickerStateInfo$PickerState.VALID_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DuePickerStateInfo$PickerState.INVALID_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
