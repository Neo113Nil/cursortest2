package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVPMVVM extends CatchingFishRoomGradle {
    public boolean CatchingFishViewModelScope;

    @Override // kotlin.text.CatchingFishRoomGradle, kotlin.text.CatchingFishGradleStripeAPI
    public final long CatchingFishSpannableWidget(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        if (this.CatchingFishDaggerWebsocket) {
            throw new IllegalStateException("closed");
        }
        if (this.CatchingFishViewModelScope) {
            return -1L;
        }
        long CatchingFishSpannableWidget = super.CatchingFishSpannableWidget(catchingFishWidgetGradle, 8192L);
        if (CatchingFishSpannableWidget != -1) {
            return CatchingFishSpannableWidget;
        }
        this.CatchingFishViewModelScope = true;
        CatchingFishSnackbar();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.CatchingFishDaggerWebsocket) {
            return;
        }
        if (!this.CatchingFishViewModelScope) {
            CatchingFishSnackbar();
        }
        this.CatchingFishDaggerWebsocket = true;
    }
}
