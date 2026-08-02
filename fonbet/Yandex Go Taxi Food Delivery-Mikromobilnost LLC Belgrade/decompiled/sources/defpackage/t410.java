package defpackage;

import com.yandex.go.masstransit.sdk.core.design.slot.ui.MasstransitSlotItemUiState$Size;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class t410 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MasstransitSlotItemUiState$Size.values().length];
        try {
            iArr[MasstransitSlotItemUiState$Size.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MasstransitSlotItemUiState$Size.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MasstransitSlotItemUiState$Size.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MasstransitSlotItemUiState$Size.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
