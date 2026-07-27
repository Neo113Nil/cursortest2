package kotlin.text;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class CatchingFishJUnit implements Choreographer.FrameCallback {
    public final /* synthetic */ CatchingFishServiceHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishKtorMockk CatchingFishReduxKtor;

    public CatchingFishJUnit(CatchingFishKtorMockk catchingFishKtorMockk, CatchingFishWebsocketWidget catchingFishWebsocketWidget, CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishReduxKtor = catchingFishKtorMockk;
        this.CatchingFishDaggerWebsocket = catchingFishServiceHandler;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object CatchingFishViewModelFAB;
        try {
            CatchingFishViewModelFAB = this.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler(Long.valueOf(j));
        } catch (Throwable th) {
            CatchingFishViewModelFAB = CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
        }
        this.CatchingFishReduxKtor.CatchingFishViewModelFAB(CatchingFishViewModelFAB);
    }
}
