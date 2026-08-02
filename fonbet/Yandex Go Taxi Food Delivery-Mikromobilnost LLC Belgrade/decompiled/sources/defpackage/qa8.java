package defpackage;

import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationInputState;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardCvvValidationResult;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardNumberValidationResult;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class qa8 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[CardActivationInputState.values().length];
        try {
            iArr[CardActivationInputState.CVV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardActivationInputState.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[CardCvvValidationResult.values().length];
        try {
            iArr2[CardCvvValidationResult.VALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CardCvvValidationResult.EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CardCvvValidationResult.WRONG_LENGTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[CardNumberValidationResult.values().length];
        try {
            iArr3[CardNumberValidationResult.VALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[CardNumberValidationResult.EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[CardNumberValidationResult.WRONG_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[CardNumberValidationResult.WRONG_LENGTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[CardNumberValidationResult.SERVER_VALIDATION_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
