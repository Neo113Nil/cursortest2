package kotlin.text;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class CatchingFishJUnitLifecycle {
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishParcelableFAB = AtomicReferenceFieldUpdater.newUpdater(CatchingFishJUnitLifecycle.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishSnackbar = AtomicReferenceFieldUpdater.newUpdater(CatchingFishJUnitLifecycle.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public CatchingFishJUnitLifecycle(CatchingFishFluxSnackbar catchingFishFluxSnackbar) {
        this._prev$volatile = catchingFishFluxSnackbar;
    }

    public abstract boolean CatchingFishCoroutine();

    public final void CatchingFishParcelableFAB() {
        CatchingFishSnackbar.set(this, null);
    }

    public final void CatchingFishReduxKtor() {
        CatchingFishJUnitLifecycle CatchingFishSnackbar2;
        if (CatchingFishSnackbar() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishSnackbar;
            CatchingFishJUnitLifecycle catchingFishJUnitLifecycle = (CatchingFishJUnitLifecycle) atomicReferenceFieldUpdater.get(this);
            while (catchingFishJUnitLifecycle != null && catchingFishJUnitLifecycle.CatchingFishCoroutine()) {
                catchingFishJUnitLifecycle = (CatchingFishJUnitLifecycle) atomicReferenceFieldUpdater.get(catchingFishJUnitLifecycle);
            }
            CatchingFishJUnitLifecycle CatchingFishSnackbar3 = CatchingFishSnackbar();
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishSnackbar3);
            while (CatchingFishSnackbar3.CatchingFishCoroutine() && (CatchingFishSnackbar2 = CatchingFishSnackbar3.CatchingFishSnackbar()) != null) {
                CatchingFishSnackbar3 = CatchingFishSnackbar2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(CatchingFishSnackbar3);
                CatchingFishJUnitLifecycle catchingFishJUnitLifecycle2 = ((CatchingFishJUnitLifecycle) obj) == null ? null : catchingFishJUnitLifecycle;
                while (!atomicReferenceFieldUpdater.compareAndSet(CatchingFishSnackbar3, obj, catchingFishJUnitLifecycle2)) {
                    if (atomicReferenceFieldUpdater.get(CatchingFishSnackbar3) != obj) {
                        break;
                    }
                }
            }
            if (catchingFishJUnitLifecycle != null) {
                CatchingFishParcelableFAB.set(catchingFishJUnitLifecycle, CatchingFishSnackbar3);
            }
            if (!CatchingFishSnackbar3.CatchingFishCoroutine() || CatchingFishSnackbar3.CatchingFishSnackbar() == null) {
                if (catchingFishJUnitLifecycle == null || !catchingFishJUnitLifecycle.CatchingFishCoroutine()) {
                    return;
                }
            }
        }
    }

    public final CatchingFishJUnitLifecycle CatchingFishSnackbar() {
        Object obj = CatchingFishParcelableFAB.get(this);
        if (obj == CatchingFishLayoutRoomFAB.CatchingFishSnackbar) {
            return null;
        }
        return (CatchingFishJUnitLifecycle) obj;
    }
}
