package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishFABView {
    public static final long CatchingFishParcelableFAB = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);
    public static final /* synthetic */ int CatchingFishSnackbar = 0;

    public static final float CatchingFishParcelableFAB(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float CatchingFishSnackbar(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
