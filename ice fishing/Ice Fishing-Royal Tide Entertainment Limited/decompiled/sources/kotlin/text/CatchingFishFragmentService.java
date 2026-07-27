package kotlin.text;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishFragmentService extends CatchingFishMoshiFirebase {
    public CatchingFishMoshiFirebase CatchingFishDaggerWebsocket;

    public CatchingFishFragmentService(CatchingFishMoshiFirebase catchingFishMoshiFirebase) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMoshiFirebase, "delegate");
        this.CatchingFishDaggerWebsocket = catchingFishMoshiFirebase;
    }

    @Override // kotlin.text.CatchingFishMoshiFirebase
    public final long CatchingFishCoroutine() {
        return this.CatchingFishDaggerWebsocket.CatchingFishCoroutine();
    }

    @Override // kotlin.text.CatchingFishMoshiFirebase
    public final boolean CatchingFishDaggerWebsocket() {
        return this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket();
    }

    @Override // kotlin.text.CatchingFishMoshiFirebase
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
    }

    @Override // kotlin.text.CatchingFishMoshiFirebase
    public final CatchingFishMoshiFirebase CatchingFishReduxKtor(long j) {
        return this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(j);
    }

    @Override // kotlin.text.CatchingFishMoshiFirebase
    public final CatchingFishMoshiFirebase CatchingFishSnackbar() {
        return this.CatchingFishDaggerWebsocket.CatchingFishSnackbar();
    }

    @Override // kotlin.text.CatchingFishMoshiFirebase
    public final long CatchingFishViewModelFAB() {
        return this.CatchingFishDaggerWebsocket.CatchingFishViewModelFAB();
    }

    @Override // kotlin.text.CatchingFishMoshiFirebase
    public final CatchingFishMoshiFirebase CatchingFishViewModelScope(long j, TimeUnit timeUnit) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(timeUnit, "unit");
        return this.CatchingFishDaggerWebsocket.CatchingFishViewModelScope(j, timeUnit);
    }

    @Override // kotlin.text.CatchingFishMoshiFirebase
    public final void CatchingFishWorkManager() {
        this.CatchingFishDaggerWebsocket.CatchingFishWorkManager();
    }
}
