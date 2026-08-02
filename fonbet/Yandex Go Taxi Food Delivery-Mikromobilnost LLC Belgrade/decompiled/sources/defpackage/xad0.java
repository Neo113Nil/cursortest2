package defpackage;

import com.yandex.plus.pay.repository.api.model.offers.Offer;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class xad0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Offer.StructureType.values().length];
        try {
            iArr[Offer.StructureType.TARIFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Offer.StructureType.OPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Offer.StructureType.COMPOSITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[Offer.Vendor.values().length];
        try {
            iArr2[Offer.Vendor.GOOGLE_PLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Offer.Vendor.NATIVE_YANDEX.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Offer.Vendor.APP_STORE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Offer.Vendor.MICROSOFT_STORE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[Offer.Vendor.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
