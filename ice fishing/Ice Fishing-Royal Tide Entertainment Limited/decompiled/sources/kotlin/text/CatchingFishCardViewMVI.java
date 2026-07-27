package kotlin.text;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CatchingFishCardViewMVI implements Executor {
    public Runnable CatchingFishViewModelScope;
    public final CatchingFishToastGraphQLMVP CatchingFishWorkManager;
    public final Object CatchingFishReduxKtor = new Object();
    public final ArrayDeque CatchingFishDaggerWebsocket = new ArrayDeque();

    public CatchingFishCardViewMVI(CatchingFishToastGraphQLMVP catchingFishToastGraphQLMVP) {
        this.CatchingFishWorkManager = catchingFishToastGraphQLMVP;
    }

    public final void CatchingFishParcelableFAB() {
        synchronized (this.CatchingFishReduxKtor) {
            try {
                Runnable runnable = (Runnable) this.CatchingFishDaggerWebsocket.poll();
                this.CatchingFishViewModelScope = runnable;
                if (runnable != null) {
                    this.CatchingFishWorkManager.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.CatchingFishReduxKtor) {
            try {
                this.CatchingFishDaggerWebsocket.add(new CatchingFishEspressoFlux(3, this, runnable));
                if (this.CatchingFishViewModelScope == null) {
                    CatchingFishParcelableFAB();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
