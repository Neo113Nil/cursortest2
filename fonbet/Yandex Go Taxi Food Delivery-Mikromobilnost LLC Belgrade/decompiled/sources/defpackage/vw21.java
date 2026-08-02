package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.ReorderHapticFeedbackType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class vw21 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Orientation.values().length];
        try {
            iArr[Orientation.Vertical.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Orientation.Horizontal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ReorderHapticFeedbackType.values().length];
        try {
            iArr2[ReorderHapticFeedbackType.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ReorderHapticFeedbackType.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ReorderHapticFeedbackType.MOVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
