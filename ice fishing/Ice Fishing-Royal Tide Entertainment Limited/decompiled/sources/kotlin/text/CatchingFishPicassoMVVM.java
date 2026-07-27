package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishPicassoMVVM {
    public static final CatchingFishRealmDaggerHilt CatchingFishReduxKtor;

    static {
        Integer num = CatchingFishMVPAppCompat.CatchingFishParcelableFAB;
        CatchingFishReduxKtor = (num == null || num.intValue() >= 34) ? new CatchingFishReduxWidgetRoom() : new CatchingFishAppCompatKtor();
    }

    public int CatchingFishCoroutine(int i) {
        int CatchingFishSnackbar;
        int i2;
        if (i <= 0) {
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0) + ", " + Integer.valueOf(i) + ").").toString());
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return CatchingFishParcelableFAB(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                CatchingFishSnackbar = CatchingFishSnackbar() >>> 1;
                i2 = CatchingFishSnackbar % i;
            } while ((i - 1) + (CatchingFishSnackbar - i2) < 0);
            return i2;
        }
        while (true) {
            int CatchingFishSnackbar2 = CatchingFishSnackbar();
            if (CatchingFishSnackbar2 >= 0 && CatchingFishSnackbar2 < i) {
                return CatchingFishSnackbar2;
            }
        }
    }

    public abstract int CatchingFishParcelableFAB(int i);

    public abstract int CatchingFishSnackbar();
}
