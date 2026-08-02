package defpackage;

import com.yandex.plus.pay.repository.api.model.offers.CompositeOfferDetails$PaymentMethod$Type;
import com.yandex.plus.pay.repository.api.model.offers.UpsaleStep;
import com.yandex.plus.pay.repository.api.model.offers.UpsaleType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class tad0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[CompositeOfferDetails$PaymentMethod$Type.values().length];
        try {
            iArr[CompositeOfferDetails$PaymentMethod$Type.NEW_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CompositeOfferDetails$PaymentMethod$Type.NEW_YB_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CompositeOfferDetails$PaymentMethod$Type.NEW_SBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CompositeOfferDetails$PaymentMethod$Type.CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CompositeOfferDetails$PaymentMethod$Type.SBP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[UpsaleStep.values().length];
        try {
            iArr2[UpsaleStep.CHECKOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[UpsaleStep.UPSALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[UpsaleStep.PRESALE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[UpsaleType.values().length];
        try {
            iArr3[UpsaleType.ADDITION.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[UpsaleType.REPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
