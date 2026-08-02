package defpackage;

import com.yandex.go.due.data.api.dto.ScheduledOrderButton;
import ru.yandex.taxi.due_selector.impl.domain.entity.DuePickerButtonPosition;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class tvm {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DuePickerButtonPosition.values().length];
        try {
            iArr[DuePickerButtonPosition.LEADING_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DuePickerButtonPosition.TRAILING_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ScheduledOrderButton.ButtonType.values().length];
        try {
            iArr2[ScheduledOrderButton.ButtonType.CONFIRM_PREORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ScheduledOrderButton.ButtonType.RIDE_NOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScheduledOrderButton.ButtonType.PREORDER_UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
