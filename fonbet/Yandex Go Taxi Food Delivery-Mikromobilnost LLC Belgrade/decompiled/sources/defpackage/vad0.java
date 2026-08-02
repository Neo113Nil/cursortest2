package defpackage;

import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$LegalInfo$Item$Type;
import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$StructureType;
import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$Vendor;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class vad0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[CompositeOfferDto$Vendor.values().length];
        try {
            iArr[CompositeOfferDto$Vendor.GOOGLE_PLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CompositeOfferDto$Vendor.NATIVE_YANDEX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CompositeOfferDto$Vendor.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[CompositeOfferDto$LegalInfo$Item$Type.values().length];
        try {
            iArr2[CompositeOfferDto$LegalInfo$Item$Type.LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CompositeOfferDto$LegalInfo$Item$Type.TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[CompositeOfferDto$StructureType.values().length];
        try {
            iArr3[CompositeOfferDto$StructureType.TARIFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[CompositeOfferDto$StructureType.OPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[CompositeOfferDto$StructureType.COMPOSITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
