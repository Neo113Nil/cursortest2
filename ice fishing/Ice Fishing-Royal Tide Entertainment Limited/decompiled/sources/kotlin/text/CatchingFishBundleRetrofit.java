package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishBundleRetrofit {
    public static final CatchingFishPicassoHandler CatchingFishParcelableFAB;
    public static final CatchingFishPicassoHandler CatchingFishSnackbar;

    static {
        CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
        CatchingFishPicassoHandler catchingFishPicassoHandler = null;
        try {
            catchingFishPicassoHandler = (CatchingFishPicassoHandler) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        CatchingFishParcelableFAB = catchingFishPicassoHandler;
        CatchingFishSnackbar = new CatchingFishPicassoHandler();
    }
}
