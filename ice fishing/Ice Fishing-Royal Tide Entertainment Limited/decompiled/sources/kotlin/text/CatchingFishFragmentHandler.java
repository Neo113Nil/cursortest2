package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishFragmentHandler {
    public static final CatchingFishMockkViewModel CatchingFishParcelableFAB;
    public static final CatchingFishMockkViewModel CatchingFishSnackbar;

    static {
        CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
        CatchingFishMockkViewModel catchingFishMockkViewModel = null;
        try {
            catchingFishMockkViewModel = (CatchingFishMockkViewModel) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        CatchingFishParcelableFAB = catchingFishMockkViewModel;
        CatchingFishSnackbar = new CatchingFishMockkViewModel();
    }
}
