package F1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f617e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f618f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final C.j f619g = new C.j(5, "REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f620a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f621b;

    /* renamed from: c, reason: collision with root package name */
    public final int f622c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f623d;

    public n(int i2, boolean z2) {
        this.f620a = i2;
        this.f621b = z2;
        int i3 = i2 - 1;
        this.f622c = i3;
        this.f623d = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f618f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.f622c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f623d;
            if (!this.f621b && atomicReferenceArray.get(i3 & i4) != null) {
                int i5 = this.f620a;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    break;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((i3 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i3 & i4, runnable);
                n nVar = this;
                while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                    nVar = nVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = nVar.f623d;
                    int i6 = nVar.f622c & i3;
                    Object obj = atomicReferenceArray2.get(i6);
                    if ((obj instanceof m) && ((m) obj).f616a == i3) {
                        atomicReferenceArray2.set(i6, runnable);
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        do {
            atomicLongFieldUpdater = f618f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        while (true) {
            atomicLongFieldUpdater = f618f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                break;
            }
            long j3 = j2 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f617e;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n(this.f620a * 2, this.f621b);
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.f622c;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object obj = this.f623d.get(i5);
                if (obj == null) {
                    obj = new m(i2);
                }
                nVar2.f623d.set(nVar2.f622c & i2, obj);
                i2++;
            }
            atomicLongFieldUpdater.set(nVar2, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f618f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return f619g;
            }
            int i2 = (int) (j2 & 1073741823);
            int i3 = this.f622c;
            int i4 = i2 & i3;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i3) == i4) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f623d;
            Object obj = atomicReferenceArray.get(i4);
            boolean z2 = this.f621b;
            if (obj == null) {
                if (z2) {
                    return null;
                }
            } else {
                if (obj instanceof m) {
                    return null;
                }
                long j3 = (i2 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                if (z2) {
                    n nVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f618f;
                        long j4 = atomicLongFieldUpdater2.get(nVar);
                        int i5 = (int) (j4 & 1073741823);
                        if ((j4 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVar, j4, (j4 & (-1073741824)) | j3)) {
                                nVar.f623d.set(nVar.f622c & i5, null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
