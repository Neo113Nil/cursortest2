package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFluxCoroutine implements CatchingFishViewOkHttp {
    public boolean CatchingFishDaggerWebsocket;
    public final CatchingFishFragmentService CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishFragmentMockk CatchingFishWorkManager;

    public CatchingFishFluxCoroutine(CatchingFishFragmentMockk catchingFishFragmentMockk) {
        this.CatchingFishWorkManager = catchingFishFragmentMockk;
        this.CatchingFishReduxKtor = new CatchingFishFragmentService(catchingFishFragmentMockk.CatchingFishReduxKtor.CatchingFishParcelableFAB());
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final void CatchingFishCloudMessaging(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        if (this.CatchingFishDaggerWebsocket) {
            throw new IllegalStateException("closed");
        }
        long j2 = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        if (j < 0 || 0 > j2 || j2 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.CatchingFishWorkManager.CatchingFishReduxKtor.CatchingFishCloudMessaging(catchingFishWidgetGradle, j);
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.CatchingFishDaggerWebsocket) {
            return;
        }
        this.CatchingFishDaggerWebsocket = true;
        CatchingFishFragmentService catchingFishFragmentService = this.CatchingFishReduxKtor;
        CatchingFishMoshiFirebase catchingFishMoshiFirebase = catchingFishFragmentService.CatchingFishDaggerWebsocket;
        catchingFishFragmentService.CatchingFishDaggerWebsocket = CatchingFishMoshiFirebase.CatchingFishReduxKtor;
        catchingFishMoshiFirebase.CatchingFishParcelableFAB();
        catchingFishMoshiFirebase.CatchingFishSnackbar();
        this.CatchingFishWorkManager.CatchingFishDaggerWebsocket = 3;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp, java.io.Flushable
    public final void flush() {
        if (this.CatchingFishDaggerWebsocket) {
            return;
        }
        this.CatchingFishWorkManager.CatchingFishReduxKtor.flush();
    }
}
