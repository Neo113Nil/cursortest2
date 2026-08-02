package defpackage;

import com.ybsdk.feature.savings.internal.entities.SavingsDivEntity$ProductType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class rcm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SavingsDivEntity$ProductType.values().length];
        try {
            iArr[SavingsDivEntity$ProductType.DEPOSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavingsDivEntity$ProductType.INVESTMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SavingsDivEntity$ProductType.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SavingsDivEntity$ProductType.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
