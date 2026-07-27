package kotlin.text;

import com.adjust.sdk.ActivityKind;

/* loaded from: classes.dex */
public abstract /* synthetic */ class CatchingFishManifestFlux {
    public static final /* synthetic */ int[] CatchingFishParcelableFAB;

    static {
        int[] iArr = new int[ActivityKind.values().length];
        CatchingFishParcelableFAB = iArr;
        try {
            iArr[ActivityKind.SESSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.ATTRIBUTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.EVENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            CatchingFishParcelableFAB[ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
