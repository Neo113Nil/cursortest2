package defpackage;

import com.yandex.go.slot.dto.SlotItemBodyPropertiesDto;
import com.yandex.go.slot.dto.SlotItemLineDto;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class x3j {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SlotItemBodyPropertiesDto.Align.values().length];
        try {
            iArr[SlotItemBodyPropertiesDto.Align.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotItemBodyPropertiesDto.Align.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotItemBodyPropertiesDto.Align.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SlotItemLineDto.Ellipsis.values().length];
        try {
            iArr2[SlotItemLineDto.Ellipsis.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SlotItemLineDto.Ellipsis.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
