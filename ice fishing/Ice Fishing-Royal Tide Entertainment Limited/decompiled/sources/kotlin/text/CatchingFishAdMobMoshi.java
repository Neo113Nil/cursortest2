package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAdMobMoshi extends RuntimeException {
    public final transient CatchingFishManifestMockk CatchingFishReduxKtor;

    public CatchingFishAdMobMoshi(CatchingFishManifestMockk catchingFishManifestMockk) {
        this.CatchingFishReduxKtor = catchingFishManifestMockk;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.CatchingFishReduxKtor.toString();
    }
}
