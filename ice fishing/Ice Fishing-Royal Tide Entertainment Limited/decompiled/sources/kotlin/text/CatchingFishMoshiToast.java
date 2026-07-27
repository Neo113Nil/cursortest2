package kotlin.text;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class CatchingFishMoshiToast {
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishParcelableFAB = AtomicReferenceFieldUpdater.newUpdater(CatchingFishMoshiToast.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new CatchingFishGlideCameraX(8, false);

    public final int CatchingFishCoroutine() {
        CatchingFishGlideCameraX catchingFishGlideCameraX = (CatchingFishGlideCameraX) CatchingFishParcelableFAB.get(this);
        catchingFishGlideCameraX.getClass();
        long j = CatchingFishGlideCameraX.CatchingFishWorkManager.get(catchingFishGlideCameraX);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final boolean CatchingFishParcelableFAB(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishParcelableFAB;
            CatchingFishGlideCameraX catchingFishGlideCameraX = (CatchingFishGlideCameraX) atomicReferenceFieldUpdater.get(this);
            int CatchingFishParcelableFAB2 = catchingFishGlideCameraX.CatchingFishParcelableFAB(runnable);
            if (CatchingFishParcelableFAB2 == 0) {
                return true;
            }
            if (CatchingFishParcelableFAB2 == 1) {
                CatchingFishGlideCameraX CatchingFishCoroutine = catchingFishGlideCameraX.CatchingFishCoroutine();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishGlideCameraX, CatchingFishCoroutine) && atomicReferenceFieldUpdater.get(this) == catchingFishGlideCameraX) {
                }
            } else if (CatchingFishParcelableFAB2 == 2) {
                return false;
            }
        }
    }

    public final Object CatchingFishReduxKtor() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishParcelableFAB;
            CatchingFishGlideCameraX catchingFishGlideCameraX = (CatchingFishGlideCameraX) atomicReferenceFieldUpdater.get(this);
            Object CatchingFishReduxKtor = catchingFishGlideCameraX.CatchingFishReduxKtor();
            if (CatchingFishReduxKtor != CatchingFishGlideCameraX.CatchingFishViewModelScope) {
                return CatchingFishReduxKtor;
            }
            CatchingFishGlideCameraX CatchingFishCoroutine = catchingFishGlideCameraX.CatchingFishCoroutine();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishGlideCameraX, CatchingFishCoroutine) && atomicReferenceFieldUpdater.get(this) == catchingFishGlideCameraX) {
            }
        }
    }

    public final void CatchingFishSnackbar() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishParcelableFAB;
            CatchingFishGlideCameraX catchingFishGlideCameraX = (CatchingFishGlideCameraX) atomicReferenceFieldUpdater.get(this);
            if (catchingFishGlideCameraX.CatchingFishSnackbar()) {
                return;
            }
            CatchingFishGlideCameraX CatchingFishCoroutine = catchingFishGlideCameraX.CatchingFishCoroutine();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishGlideCameraX, CatchingFishCoroutine) && atomicReferenceFieldUpdater.get(this) == catchingFishGlideCameraX) {
            }
        }
    }
}
