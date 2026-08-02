package defpackage;

import com.yandex.go.slot.dto.SlotItemSizeDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class v101 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SlotItemSizeDto.values().length];
        try {
            iArr[SlotItemSizeDto.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotItemSizeDto.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotItemSizeDto.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlotItemSizeDto.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
