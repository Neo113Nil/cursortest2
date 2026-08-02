package defpackage;

import com.yandex.go.design.compose.slot.SlotSize;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class t8y {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SlotSize.values().length];
        try {
            iArr[SlotSize.L.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotSize.M.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotSize.S.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlotSize.XS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
