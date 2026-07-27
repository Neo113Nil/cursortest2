package kotlin.text;

import java.net.SocketTimeoutException;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class CatchingFishHandlerMVVM extends CatchingFishToastLifecycle {
    public final /* synthetic */ CatchingFishPayPalMVI CatchingFishOkHttp;

    public CatchingFishHandlerMVVM(CatchingFishPayPalMVI catchingFishPayPalMVI) {
        this.CatchingFishOkHttp = catchingFishPayPalMVI;
    }

    @Override // kotlin.text.CatchingFishToastLifecycle
    public final void CatchingFishCloudMessaging() {
        this.CatchingFishOkHttp.CatchingFishDaggerWebsocket(6);
        CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = this.CatchingFishOkHttp.CatchingFishReduxKtor;
        synchronized (catchingFishSharedFlowMoshi) {
            try {
                long j = catchingFishSharedFlowMoshi.CatchingFishStateLiveData;
                long j2 = catchingFishSharedFlowMoshi.CatchingFishAnimationMockk;
                if (j < j2) {
                    return;
                }
                catchingFishSharedFlowMoshi.CatchingFishAnimationMockk = j2 + 1;
                catchingFishSharedFlowMoshi.CatchingFishRoomDatabase = System.nanoTime() + 1000000000;
                try {
                    catchingFishSharedFlowMoshi.CatchingFishCloudMessaging.execute(new CatchingFishRealmPayPal(catchingFishSharedFlowMoshi, new Object[]{catchingFishSharedFlowMoshi.CatchingFishViewModelScope}));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishEspressoTesting() {
        if (CatchingFishFragmentHandler()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
