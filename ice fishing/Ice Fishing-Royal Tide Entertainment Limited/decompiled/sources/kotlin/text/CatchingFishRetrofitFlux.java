package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitFlux implements CatchingFishViewOkHttp {
    public boolean CatchingFishDaggerWebsocket;
    public final CatchingFishFragmentService CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishFragmentMockk CatchingFishWorkManager;

    public CatchingFishRetrofitFlux(CatchingFishFragmentMockk catchingFishFragmentMockk) {
        this.CatchingFishWorkManager = catchingFishFragmentMockk;
        this.CatchingFishReduxKtor = new CatchingFishFragmentService(catchingFishFragmentMockk.CatchingFishReduxKtor.CatchingFishParcelableFAB());
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final void CatchingFishCloudMessaging(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        CatchingFishAnimationMVI catchingFishAnimationMVI = this.CatchingFishWorkManager.CatchingFishReduxKtor;
        if (this.CatchingFishDaggerWebsocket) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        catchingFishAnimationMVI.CatchingFishWorkManager(j);
        catchingFishAnimationMVI.CatchingFishDaggerHiltFAB("\r\n");
        catchingFishAnimationMVI.CatchingFishCloudMessaging(catchingFishWidgetGradle, j);
        catchingFishAnimationMVI.CatchingFishDaggerHiltFAB("\r\n");
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.CatchingFishDaggerWebsocket) {
            return;
        }
        this.CatchingFishDaggerWebsocket = true;
        this.CatchingFishWorkManager.CatchingFishReduxKtor.CatchingFishDaggerHiltFAB("0\r\n\r\n");
        CatchingFishFragmentService catchingFishFragmentService = this.CatchingFishReduxKtor;
        CatchingFishMoshiFirebase catchingFishMoshiFirebase = catchingFishFragmentService.CatchingFishDaggerWebsocket;
        catchingFishFragmentService.CatchingFishDaggerWebsocket = CatchingFishMoshiFirebase.CatchingFishReduxKtor;
        catchingFishMoshiFirebase.CatchingFishParcelableFAB();
        catchingFishMoshiFirebase.CatchingFishSnackbar();
        this.CatchingFishWorkManager.CatchingFishDaggerWebsocket = 3;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp, java.io.Flushable
    public final synchronized void flush() {
        if (this.CatchingFishDaggerWebsocket) {
            return;
        }
        this.CatchingFishWorkManager.CatchingFishReduxKtor.flush();
    }
}
