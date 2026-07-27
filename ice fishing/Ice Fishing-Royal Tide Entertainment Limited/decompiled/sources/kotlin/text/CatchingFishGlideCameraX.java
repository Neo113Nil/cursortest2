package kotlin.text;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishGlideCameraX {
    public final int CatchingFishCoroutine;
    public final int CatchingFishParcelableFAB;
    public final /* synthetic */ AtomicReferenceArray CatchingFishReduxKtor;
    public final boolean CatchingFishSnackbar;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishDaggerWebsocket = AtomicReferenceFieldUpdater.newUpdater(CatchingFishGlideCameraX.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater CatchingFishWorkManager = AtomicLongFieldUpdater.newUpdater(CatchingFishGlideCameraX.class, "_state$volatile");
    public static final CatchingFishFluxWorkManager CatchingFishViewModelScope = new CatchingFishFluxWorkManager("REMOVE_FROZEN", 1);

    public CatchingFishGlideCameraX(int i, boolean z) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = z;
        int i2 = i - 1;
        this.CatchingFishCoroutine = i2;
        this.CatchingFishReduxKtor = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final CatchingFishGlideCameraX CatchingFishCoroutine() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        CatchingFishGlideCameraX catchingFishGlideCameraX;
        while (true) {
            atomicLongFieldUpdater = CatchingFishWorkManager;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                catchingFishGlideCameraX = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            catchingFishGlideCameraX = this;
            if (atomicLongFieldUpdater.compareAndSet(catchingFishGlideCameraX, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishDaggerWebsocket;
            CatchingFishGlideCameraX catchingFishGlideCameraX2 = (CatchingFishGlideCameraX) atomicReferenceFieldUpdater.get(this);
            if (catchingFishGlideCameraX2 != null) {
                return catchingFishGlideCameraX2;
            }
            CatchingFishGlideCameraX catchingFishGlideCameraX3 = new CatchingFishGlideCameraX(catchingFishGlideCameraX.CatchingFishParcelableFAB * 2, catchingFishGlideCameraX.CatchingFishSnackbar);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = catchingFishGlideCameraX.CatchingFishCoroutine;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = catchingFishGlideCameraX.CatchingFishReduxKtor.get(i4);
                if (obj == null) {
                    obj = new CatchingFishGradlePayPal(i);
                }
                catchingFishGlideCameraX3.CatchingFishReduxKtor.set(catchingFishGlideCameraX3.CatchingFishCoroutine & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(catchingFishGlideCameraX3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, catchingFishGlideCameraX3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final int CatchingFishParcelableFAB(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishWorkManager;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.CatchingFishCoroutine;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.CatchingFishSnackbar;
            AtomicReferenceArray atomicReferenceArray = this.CatchingFishReduxKtor;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (CatchingFishWorkManager.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    CatchingFishGlideCameraX catchingFishGlideCameraX = this;
                    while ((atomicLongFieldUpdater.get(catchingFishGlideCameraX) & 1152921504606846976L) != 0) {
                        catchingFishGlideCameraX = catchingFishGlideCameraX.CatchingFishCoroutine();
                        AtomicReferenceArray atomicReferenceArray2 = catchingFishGlideCameraX.CatchingFishReduxKtor;
                        int i4 = catchingFishGlideCameraX.CatchingFishCoroutine & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof CatchingFishGradlePayPal) && ((CatchingFishGradlePayPal) obj2).CatchingFishParcelableFAB == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            catchingFishGlideCameraX = null;
                        }
                        if (catchingFishGlideCameraX == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.CatchingFishParcelableFAB;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final Object CatchingFishReduxKtor() {
        CatchingFishGlideCameraX catchingFishGlideCameraX = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishWorkManager;
            long j = atomicLongFieldUpdater.get(catchingFishGlideCameraX);
            if ((j & 1152921504606846976L) != 0) {
                return CatchingFishViewModelScope;
            }
            int i = (int) (j & 1073741823);
            int i2 = catchingFishGlideCameraX.CatchingFishCoroutine;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = catchingFishGlideCameraX.CatchingFishReduxKtor;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = catchingFishGlideCameraX.CatchingFishSnackbar;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof CatchingFishGradlePayPal) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (CatchingFishWorkManager.compareAndSet(catchingFishGlideCameraX, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                catchingFishGlideCameraX = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(catchingFishGlideCameraX);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            catchingFishGlideCameraX = catchingFishGlideCameraX.CatchingFishCoroutine();
                        } else {
                            CatchingFishGlideCameraX catchingFishGlideCameraX2 = catchingFishGlideCameraX;
                            if (CatchingFishWorkManager.compareAndSet(catchingFishGlideCameraX2, j3, (j3 & (-1073741824)) | j2)) {
                                catchingFishGlideCameraX2.CatchingFishReduxKtor.set(i4 & catchingFishGlideCameraX2.CatchingFishCoroutine, null);
                                catchingFishGlideCameraX = null;
                            } else {
                                catchingFishGlideCameraX = catchingFishGlideCameraX2;
                            }
                        }
                        if (catchingFishGlideCameraX == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean CatchingFishSnackbar() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = CatchingFishWorkManager;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }
}
