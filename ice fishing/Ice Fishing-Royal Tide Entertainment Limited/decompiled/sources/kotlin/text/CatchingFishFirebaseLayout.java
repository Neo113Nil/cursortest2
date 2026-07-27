package kotlin.text;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class CatchingFishFirebaseLayout implements Closeable {
    public final CatchingFishAnimationMVI CatchingFishDaggerWebsocket;
    public final CatchingFishLayoutFragment CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishFluxFluxBundle CatchingFishWorkManager;

    public CatchingFishFirebaseLayout(CatchingFishLayoutFragment catchingFishLayoutFragment, CatchingFishAnimationMVI catchingFishAnimationMVI, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle) {
        this.CatchingFishWorkManager = catchingFishFluxFluxBundle;
        this.CatchingFishReduxKtor = catchingFishLayoutFragment;
        this.CatchingFishDaggerWebsocket = catchingFishAnimationMVI;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.CatchingFishWorkManager.CatchingFishReduxKtor(true, true, null);
    }
}
