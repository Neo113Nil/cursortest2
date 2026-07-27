package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishSnackbarHandler extends CatchingFishWidgetSpannable {
    public CatchingFishSnackbarHandler(String str, String str2) {
        this(new CatchingFishAsyncTaskFlux(str, str2.toCharArray()), (Character) '=');
    }

    public CatchingFishSnackbarHandler(CatchingFishAsyncTaskFlux catchingFishAsyncTaskFlux, Character ch) {
        super(catchingFishAsyncTaskFlux, ch);
        if (catchingFishAsyncTaskFlux.CatchingFishSnackbar.length != 64) {
            throw new IllegalArgumentException();
        }
    }
}
