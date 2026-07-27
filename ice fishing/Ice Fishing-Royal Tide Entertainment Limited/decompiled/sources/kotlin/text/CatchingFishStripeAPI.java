package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishStripeAPI {
    public static final Class CatchingFishParcelableFAB;
    public static final boolean CatchingFishSnackbar;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        CatchingFishParcelableFAB = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        CatchingFishSnackbar = cls2 != null;
    }

    public static boolean CatchingFishParcelableFAB() {
        return (CatchingFishParcelableFAB == null || CatchingFishSnackbar) ? false : true;
    }
}
