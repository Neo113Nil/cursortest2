package kotlin.text;

import com.adjust.sdk.ActivityKind;

/* loaded from: classes.dex */
public abstract /* synthetic */ class CatchingFishJUnitExoPlayer {
    public static final /* synthetic */ int[] CatchingFishParcelableFAB;

    static {
        int[] iArr = new int[ActivityKind.values().length];
        CatchingFishParcelableFAB = iArr;
        try {
            iArr[ActivityKind.SESSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.EVENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.ATTRIBUTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.INFO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.GDPR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.AD_REVENUE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.SUBSCRIPTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.MEASUREMENT_CONSENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
