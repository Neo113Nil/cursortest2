package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishDaggerOkHttp extends CatchingFishWidgetSpannable {
    public final char[] CatchingFishReduxKtor;

    public CatchingFishDaggerOkHttp(CatchingFishAsyncTaskFlux catchingFishAsyncTaskFlux) {
        super(catchingFishAsyncTaskFlux, (Character) null);
        this.CatchingFishReduxKtor = new char[512];
        char[] cArr = catchingFishAsyncTaskFlux.CatchingFishSnackbar;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.CatchingFishReduxKtor;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }
}
