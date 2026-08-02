package defpackage;

import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Alignment;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Ellipsize;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class vqs0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SlotItemUiState$Body$Alignment.values().length];
        try {
            iArr[SlotItemUiState$Body$Alignment.END.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotItemUiState$Body$Alignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotItemUiState$Body$Alignment.START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SlotItemUiState$Body$Ellipsize.values().length];
        try {
            iArr2[SlotItemUiState$Body$Ellipsize.MIDDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SlotItemUiState$Body$Ellipsize.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SlotItemUiState$Body$Ellipsize.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
