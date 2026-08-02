package defpackage;

import com.ybsdk.feature.savings.internal.entities.CellType;
import com.ybsdk.feature.savings.internal.entities.SavingProductType;
import com.ybsdk.feature.savings.internal.entities.SavingsDivEntity$ProductType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class v2m0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SavingProductType.values().length];
        try {
            iArr[SavingProductType.SAVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavingProductType.DEPOSIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SavingProductType.INVESTMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[CellType.values().length];
        try {
            iArr2[CellType.EXISTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CellType.EXISTING_NON_DRAGGABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CellType.SUGGEST_TO_CREATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CellType.OPENING.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[CellType.CLOSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[CellType.BANNER.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
        int[] iArr3 = new int[SavingsDivEntity$ProductType.values().length];
        try {
            iArr3[SavingsDivEntity$ProductType.SAVINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[SavingsDivEntity$ProductType.DEPOSIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[SavingsDivEntity$ProductType.INVESTMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[SavingsDivEntity$ProductType.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        c = iArr3;
    }
}
