package defpackage;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemBodyPropertiesDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemLineDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemSizeDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto$ButtonDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class y410 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[MasstransitSlotItemTrailDto$ButtonDto.Style.values().length];
        try {
            iArr[MasstransitSlotItemTrailDto$ButtonDto.Style.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MasstransitSlotItemTrailDto$ButtonDto.Style.OUTLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MasstransitSlotItemTrailDto$ButtonDto.Style.ACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[MasstransitSlotItemSizeDto.values().length];
        try {
            iArr2[MasstransitSlotItemSizeDto.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MasstransitSlotItemSizeDto.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MasstransitSlotItemSizeDto.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MasstransitSlotItemSizeDto.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[MasstransitSlotItemBodyPropertiesDto.Align.values().length];
        try {
            iArr3[MasstransitSlotItemBodyPropertiesDto.Align.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[MasstransitSlotItemBodyPropertiesDto.Align.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[MasstransitSlotItemBodyPropertiesDto.Align.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
        int[] iArr4 = new int[MasstransitSlotItemLineDto.Ellipsis.values().length];
        try {
            iArr4[MasstransitSlotItemLineDto.Ellipsis.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[MasstransitSlotItemLineDto.Ellipsis.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
