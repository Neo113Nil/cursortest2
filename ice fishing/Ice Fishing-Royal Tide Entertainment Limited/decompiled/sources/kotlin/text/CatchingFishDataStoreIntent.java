package kotlin.text;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class CatchingFishDataStoreIntent extends CatchingFishCloudMessaging {
    public final CatchingFishReduxMockkView CatchingFishViewModelFAB;
    public final Thread CatchingFishViewModelScope;

    public CatchingFishDataStoreIntent(CatchingFishManifestMockk catchingFishManifestMockk, Thread thread, CatchingFishReduxMockkView catchingFishReduxMockkView) {
        super(catchingFishManifestMockk, true);
        this.CatchingFishViewModelScope = thread;
        this.CatchingFishViewModelFAB = catchingFishReduxMockkView;
    }

    @Override // kotlin.text.CatchingFishPicassoView
    public final void CatchingFishDaggerHiltFAB(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.CatchingFishViewModelScope;
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
