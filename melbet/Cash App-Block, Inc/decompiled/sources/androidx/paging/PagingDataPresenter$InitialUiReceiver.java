package androidx.paging;

/* loaded from: classes3.dex */
public final class PagingDataPresenter$InitialUiReceiver implements UiReceiver {
    public boolean shouldRefresh;
    public boolean shouldRetry;

    @Override // androidx.paging.UiReceiver
    public final void refresh() {
        this.shouldRefresh = true;
    }

    @Override // androidx.paging.UiReceiver
    public final void retry() {
        this.shouldRetry = true;
    }
}
