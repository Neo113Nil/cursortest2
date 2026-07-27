package kotlin.text;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public abstract /* synthetic */ class CatchingFishFABSnackbar {
    public static final /* synthetic */ int[] CatchingFishParcelableFAB;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        CatchingFishParcelableFAB = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            CatchingFishParcelableFAB[RoundingMode.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            CatchingFishParcelableFAB[RoundingMode.FLOOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            CatchingFishParcelableFAB[RoundingMode.UP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            CatchingFishParcelableFAB[RoundingMode.CEILING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            CatchingFishParcelableFAB[RoundingMode.HALF_DOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            CatchingFishParcelableFAB[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            CatchingFishParcelableFAB[RoundingMode.HALF_EVEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
