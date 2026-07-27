package kotlin.text;

import java.io.IOException;

/* loaded from: classes.dex */
public final class CatchingFishRoomToastToast implements CatchingFishViewOkHttp {
    public long CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishMVIRecyclerView CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishRoomToastToast(CatchingFishMVIRecyclerView catchingFishMVIRecyclerView) {
        this.CatchingFishViewModelFAB = catchingFishMVIRecyclerView;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final void CatchingFishCloudMessaging(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        boolean z;
        long CatchingFishSnackbar;
        CatchingFishMVIRecyclerView catchingFishMVIRecyclerView = this.CatchingFishViewModelFAB;
        CatchingFishWidgetGradle catchingFishWidgetGradle2 = catchingFishMVIRecyclerView.CatchingFishDaggerWebsocket;
        if (this.CatchingFishViewModelScope) {
            throw new IOException("closed");
        }
        catchingFishWidgetGradle2.CatchingFishCloudMessaging(catchingFishWidgetGradle, j);
        if (this.CatchingFishWorkManager) {
            long j2 = this.CatchingFishDaggerWebsocket;
            if (j2 != -1 && catchingFishWidgetGradle2.CatchingFishDaggerWebsocket > j2 - 8192) {
                z = true;
                CatchingFishSnackbar = catchingFishWidgetGradle2.CatchingFishSnackbar();
                if (CatchingFishSnackbar > 0 || z) {
                }
                catchingFishMVIRecyclerView.CatchingFishSnackbar(this.CatchingFishReduxKtor, CatchingFishSnackbar, this.CatchingFishWorkManager, false);
                this.CatchingFishWorkManager = false;
                return;
            }
        }
        z = false;
        CatchingFishSnackbar = catchingFishWidgetGradle2.CatchingFishSnackbar();
        if (CatchingFishSnackbar > 0) {
        }
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishViewModelFAB.CatchingFishSnackbar.CatchingFishParcelableFAB();
    }

    @Override // kotlin.text.CatchingFishViewOkHttp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.CatchingFishViewModelScope) {
            throw new IOException("closed");
        }
        int i = this.CatchingFishReduxKtor;
        CatchingFishMVIRecyclerView catchingFishMVIRecyclerView = this.CatchingFishViewModelFAB;
        catchingFishMVIRecyclerView.CatchingFishSnackbar(i, catchingFishMVIRecyclerView.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, true);
        this.CatchingFishViewModelScope = true;
        catchingFishMVIRecyclerView.CatchingFishViewModelScope = false;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp, java.io.Flushable
    public final void flush() {
        if (this.CatchingFishViewModelScope) {
            throw new IOException("closed");
        }
        int i = this.CatchingFishReduxKtor;
        CatchingFishMVIRecyclerView catchingFishMVIRecyclerView = this.CatchingFishViewModelFAB;
        catchingFishMVIRecyclerView.CatchingFishSnackbar(i, catchingFishMVIRecyclerView.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, false);
        this.CatchingFishWorkManager = false;
    }
}
