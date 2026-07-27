package kotlin.text;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class CatchingFishFluxSnackbar extends CatchingFishJUnitLifecycle implements CatchingFishFluxKtorOkHttp {
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishReduxKtor = AtomicIntegerFieldUpdater.newUpdater(CatchingFishFluxSnackbar.class, "cleanedAndPointers$volatile");
    public final long CatchingFishCoroutine;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public CatchingFishFluxSnackbar(long j, CatchingFishFluxSnackbar catchingFishFluxSnackbar, int i) {
        super(catchingFishFluxSnackbar);
        this.CatchingFishCoroutine = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // kotlin.text.CatchingFishJUnitLifecycle
    public final boolean CatchingFishCoroutine() {
        return CatchingFishReduxKtor.get(this) == CatchingFishWorkManager() && CatchingFishSnackbar() != null;
    }

    public final boolean CatchingFishDaggerWebsocket() {
        return CatchingFishReduxKtor.addAndGet(this, -65536) == CatchingFishWorkManager() && CatchingFishSnackbar() != null;
    }

    public final boolean CatchingFishLayout() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = CatchingFishReduxKtor;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == CatchingFishWorkManager() && CatchingFishSnackbar() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public final void CatchingFishViewModelFAB() {
        if (CatchingFishReduxKtor.incrementAndGet(this) == CatchingFishWorkManager()) {
            CatchingFishReduxKtor();
        }
    }

    public abstract void CatchingFishViewModelScope(int i, CatchingFishManifestMockk catchingFishManifestMockk);

    public abstract int CatchingFishWorkManager();
}
