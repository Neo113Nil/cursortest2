package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHandlerGlideMVP extends UnsupportedOperationException {
    public final CatchingFishAppCompatPayPal CatchingFishReduxKtor;

    public CatchingFishHandlerGlideMVP(CatchingFishAppCompatPayPal catchingFishAppCompatPayPal) {
        this.CatchingFishReduxKtor = catchingFishAppCompatPayPal;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.CatchingFishReduxKtor));
    }
}
