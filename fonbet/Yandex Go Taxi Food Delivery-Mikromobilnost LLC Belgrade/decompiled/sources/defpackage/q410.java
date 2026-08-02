package defpackage;

import com.yandex.go.masstransit.sdk.core.design.slot.ui.MasstransitSlotItemUiState$Body$Alignment;
import com.yandex.go.masstransit.sdk.core.design.slot.ui.MasstransitSlotItemUiState$Body$Ellipsize;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class q410 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[MasstransitSlotItemUiState$Body$Alignment.values().length];
        try {
            iArr[MasstransitSlotItemUiState$Body$Alignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MasstransitSlotItemUiState$Body$Alignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MasstransitSlotItemUiState$Body$Alignment.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[MasstransitSlotItemUiState$Body$Ellipsize.values().length];
        try {
            iArr2[MasstransitSlotItemUiState$Body$Ellipsize.MIDDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MasstransitSlotItemUiState$Body$Ellipsize.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MasstransitSlotItemUiState$Body$Ellipsize.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
