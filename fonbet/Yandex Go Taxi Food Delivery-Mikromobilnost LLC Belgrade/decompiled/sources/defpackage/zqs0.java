package defpackage;

import com.yandex.go.slot.api.ui.SlotItemButtonUiState$Properties$Form;
import com.yandex.go.slot.api.ui.SlotItemUiState$Size;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class zqs0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SlotItemUiState$Size.values().length];
        try {
            iArr[SlotItemUiState$Size.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotItemUiState$Size.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotItemUiState$Size.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlotItemUiState$Size.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[SlotItemButtonUiState$Properties$Form.values().length];
        try {
            iArr2[SlotItemButtonUiState$Properties$Form.SQUIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SlotItemButtonUiState$Properties$Form.CIRCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
