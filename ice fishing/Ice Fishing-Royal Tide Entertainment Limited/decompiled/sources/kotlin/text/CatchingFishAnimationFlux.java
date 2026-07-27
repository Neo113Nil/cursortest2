package kotlin.text;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class CatchingFishAnimationFlux {
    public static final AtomicReference[] CatchingFishCoroutine;
    public static final CatchingFishMoshiDaggerMVP CatchingFishParcelableFAB = new CatchingFishMoshiDaggerMVP(new byte[0], 0, 0, false, false);
    public static final int CatchingFishSnackbar;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        CatchingFishSnackbar = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        CatchingFishCoroutine = atomicReferenceArr;
    }

    public static final void CatchingFishParcelableFAB(CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMoshiDaggerMVP, "segment");
        if (catchingFishMoshiDaggerMVP.CatchingFishWorkManager != null || catchingFishMoshiDaggerMVP.CatchingFishViewModelScope != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (catchingFishMoshiDaggerMVP.CatchingFishReduxKtor) {
            return;
        }
        AtomicReference atomicReference = CatchingFishCoroutine[(int) (Thread.currentThread().getId() & (CatchingFishSnackbar - 1))];
        CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP2 = CatchingFishParcelableFAB;
        CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP3 = (CatchingFishMoshiDaggerMVP) atomicReference.getAndSet(catchingFishMoshiDaggerMVP2);
        if (catchingFishMoshiDaggerMVP3 == catchingFishMoshiDaggerMVP2) {
            return;
        }
        int i = catchingFishMoshiDaggerMVP3 != null ? catchingFishMoshiDaggerMVP3.CatchingFishCoroutine : 0;
        if (i >= 65536) {
            atomicReference.set(catchingFishMoshiDaggerMVP3);
            return;
        }
        catchingFishMoshiDaggerMVP.CatchingFishWorkManager = catchingFishMoshiDaggerMVP3;
        catchingFishMoshiDaggerMVP.CatchingFishSnackbar = 0;
        catchingFishMoshiDaggerMVP.CatchingFishCoroutine = i + 8192;
        atomicReference.set(catchingFishMoshiDaggerMVP);
    }

    public static final CatchingFishMoshiDaggerMVP CatchingFishSnackbar() {
        AtomicReference atomicReference = CatchingFishCoroutine[(int) (Thread.currentThread().getId() & (CatchingFishSnackbar - 1))];
        CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP = CatchingFishParcelableFAB;
        CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP2 = (CatchingFishMoshiDaggerMVP) atomicReference.getAndSet(catchingFishMoshiDaggerMVP);
        if (catchingFishMoshiDaggerMVP2 == catchingFishMoshiDaggerMVP) {
            return new CatchingFishMoshiDaggerMVP();
        }
        if (catchingFishMoshiDaggerMVP2 == null) {
            atomicReference.set(null);
            return new CatchingFishMoshiDaggerMVP();
        }
        atomicReference.set(catchingFishMoshiDaggerMVP2.CatchingFishWorkManager);
        catchingFishMoshiDaggerMVP2.CatchingFishWorkManager = null;
        catchingFishMoshiDaggerMVP2.CatchingFishCoroutine = 0;
        return catchingFishMoshiDaggerMVP2;
    }
}
