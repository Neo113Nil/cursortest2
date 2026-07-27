package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMockkViewModel {
    public static CatchingFishMockkAppCompat CatchingFishParcelableFAB(Object obj, Object obj2) {
        CatchingFishMockkAppCompat catchingFishMockkAppCompat = (CatchingFishMockkAppCompat) obj;
        CatchingFishMockkAppCompat catchingFishMockkAppCompat2 = (CatchingFishMockkAppCompat) obj2;
        if (!catchingFishMockkAppCompat2.isEmpty()) {
            if (!catchingFishMockkAppCompat.CatchingFishReduxKtor) {
                catchingFishMockkAppCompat = catchingFishMockkAppCompat.CatchingFishSnackbar();
            }
            catchingFishMockkAppCompat.CatchingFishParcelableFAB();
            if (!catchingFishMockkAppCompat2.isEmpty()) {
                catchingFishMockkAppCompat.putAll(catchingFishMockkAppCompat2);
            }
        }
        return catchingFishMockkAppCompat;
    }
}
