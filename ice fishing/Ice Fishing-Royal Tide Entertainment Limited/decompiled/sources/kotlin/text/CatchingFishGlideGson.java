package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGlideGson extends CatchingFishLayoutFAB {
    public static final CatchingFishGlideGson CatchingFishViewModelScope;

    static {
        int i = CatchingFishPicassoService.CatchingFishCoroutine;
        int i2 = CatchingFishPicassoService.CatchingFishReduxKtor;
        long j = CatchingFishPicassoService.CatchingFishDaggerWebsocket;
        String str = CatchingFishPicassoService.CatchingFishParcelableFAB;
        CatchingFishGlideGson catchingFishGlideGson = new CatchingFishGlideGson();
        catchingFishGlideGson.CatchingFishWorkManager = new CatchingFishSnackbarGraphQL(i, i2, j, str);
        CatchingFishViewModelScope = catchingFishGlideGson;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final String toString() {
        return "Dispatchers.Default";
    }
}
