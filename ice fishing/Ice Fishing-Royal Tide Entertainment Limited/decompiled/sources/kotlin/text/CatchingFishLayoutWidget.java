package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishLayoutWidget {
    public static final CatchingFishReduxXMLLayout CatchingFishParcelableFAB;
    public static final CatchingFishReduxXMLLayout CatchingFishSnackbar;

    static {
        CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
        CatchingFishReduxXMLLayout catchingFishReduxXMLLayout = null;
        try {
            catchingFishReduxXMLLayout = (CatchingFishReduxXMLLayout) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        CatchingFishParcelableFAB = catchingFishReduxXMLLayout;
        CatchingFishSnackbar = new CatchingFishReduxXMLLayout();
    }
}
