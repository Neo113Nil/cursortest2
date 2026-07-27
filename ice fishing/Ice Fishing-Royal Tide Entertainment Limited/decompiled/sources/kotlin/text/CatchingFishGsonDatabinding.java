package kotlin.text;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class CatchingFishGsonDatabinding {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishReduxKtor = AtomicReferenceFieldUpdater.newUpdater(CatchingFishGsonDatabinding.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishDaggerWebsocket = AtomicReferenceFieldUpdater.newUpdater(CatchingFishGsonDatabinding.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishWorkManager = AtomicReferenceFieldUpdater.newUpdater(CatchingFishGsonDatabinding.class, Object.class, "_removedRef$volatile");

    public final boolean CatchingFishDaggerWebsocket(CatchingFishGsonDatabinding catchingFishGsonDatabinding, int i) {
        while (true) {
            CatchingFishGsonDatabinding CatchingFishWorkManager2 = CatchingFishWorkManager();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishDaggerWebsocket;
            if (CatchingFishWorkManager2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    CatchingFishWorkManager2 = (CatchingFishGsonDatabinding) obj;
                    if (!CatchingFishWorkManager2.CatchingFishLayout()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(CatchingFishWorkManager2);
                }
            }
            if (CatchingFishWorkManager2 instanceof CatchingFishSharedFlowKtor) {
                return (((CatchingFishSharedFlowKtor) CatchingFishWorkManager2).CatchingFishViewModelScope & i) == 0 && CatchingFishWorkManager2.CatchingFishDaggerWebsocket(catchingFishGsonDatabinding, i);
            }
            atomicReferenceFieldUpdater.set(catchingFishGsonDatabinding, CatchingFishWorkManager2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CatchingFishReduxKtor;
            atomicReferenceFieldUpdater2.set(catchingFishGsonDatabinding, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(CatchingFishWorkManager2, this, catchingFishGsonDatabinding)) {
                if (atomicReferenceFieldUpdater2.get(CatchingFishWorkManager2) != this) {
                    break;
                }
            }
            catchingFishGsonDatabinding.CatchingFishViewModelScope(this);
            return true;
        }
    }

    public boolean CatchingFishLayout() {
        return CatchingFishReduxKtor.get(this) instanceof CatchingFishGlideFirebase;
    }

    public final CatchingFishGsonDatabinding CatchingFishViewModelFAB() {
        CatchingFishGsonDatabinding catchingFishGsonDatabinding;
        Object obj = CatchingFishReduxKtor.get(this);
        CatchingFishGlideFirebase catchingFishGlideFirebase = obj instanceof CatchingFishGlideFirebase ? (CatchingFishGlideFirebase) obj : null;
        if (catchingFishGlideFirebase != null && (catchingFishGsonDatabinding = catchingFishGlideFirebase.CatchingFishParcelableFAB) != null) {
            return catchingFishGsonDatabinding;
        }
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (CatchingFishGsonDatabinding) obj;
    }

    public final void CatchingFishViewModelScope(CatchingFishGsonDatabinding catchingFishGsonDatabinding) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishDaggerWebsocket;
            CatchingFishGsonDatabinding catchingFishGsonDatabinding2 = (CatchingFishGsonDatabinding) atomicReferenceFieldUpdater.get(catchingFishGsonDatabinding);
            if (CatchingFishReduxKtor.get(this) != catchingFishGsonDatabinding) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(catchingFishGsonDatabinding, catchingFishGsonDatabinding2, this)) {
                if (atomicReferenceFieldUpdater.get(catchingFishGsonDatabinding) != catchingFishGsonDatabinding2) {
                    break;
                }
            }
            if (CatchingFishLayout()) {
                catchingFishGsonDatabinding.CatchingFishWorkManager();
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((kotlin.text.CatchingFishGlideFirebase) r6).CatchingFishParcelableFAB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatchingFishGsonDatabinding CatchingFishWorkManager() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishDaggerWebsocket;
            CatchingFishGsonDatabinding catchingFishGsonDatabinding = (CatchingFishGsonDatabinding) atomicReferenceFieldUpdater.get(this);
            CatchingFishGsonDatabinding catchingFishGsonDatabinding2 = catchingFishGsonDatabinding;
            while (true) {
                CatchingFishGsonDatabinding catchingFishGsonDatabinding3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CatchingFishReduxKtor;
                    Object obj = atomicReferenceFieldUpdater2.get(catchingFishGsonDatabinding2);
                    if (obj == this) {
                        if (catchingFishGsonDatabinding == catchingFishGsonDatabinding2) {
                            return catchingFishGsonDatabinding2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishGsonDatabinding, catchingFishGsonDatabinding2)) {
                            if (atomicReferenceFieldUpdater.get(this) != catchingFishGsonDatabinding) {
                                break;
                            }
                        }
                        return catchingFishGsonDatabinding2;
                    }
                    if (CatchingFishLayout()) {
                        return null;
                    }
                    if (!(obj instanceof CatchingFishGlideFirebase)) {
                        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        catchingFishGsonDatabinding3 = catchingFishGsonDatabinding2;
                        catchingFishGsonDatabinding2 = (CatchingFishGsonDatabinding) obj;
                    } else {
                        if (catchingFishGsonDatabinding3 != null) {
                            break;
                        }
                        catchingFishGsonDatabinding2 = (CatchingFishGsonDatabinding) atomicReferenceFieldUpdater.get(catchingFishGsonDatabinding2);
                    }
                }
                catchingFishGsonDatabinding2 = catchingFishGsonDatabinding3;
            }
        }
    }

    public String toString() {
        return new CatchingFishAsyncTaskGlide(1, CatchingFishBiometricBundle.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + CatchingFishBiometricBundle.CatchingFish(this);
    }
}
