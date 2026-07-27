package T7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3155e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3156f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final v f3157g = new v("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f3158a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3159b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3160c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3161d;

    public n(int i, boolean z8) {
        this.f3158a = i;
        this.f3159b = z8;
        int i4 = i - 1;
        this.f3160c = i4;
        this.f3161d = new AtomicReferenceArray(i);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3156f;
            long j9 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j9) != 0) {
                return (2305843009213693952L & j9) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j9);
            int i4 = (int) ((1152921503533105152L & j9) >> 30);
            int i9 = this.f3160c;
            if (((i4 + 2) & i9) == (i & i9)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f3161d;
            if (!this.f3159b && atomicReferenceArray.get(i4 & i9) != null) {
                int i10 = this.f3158a;
                if (i10 < 1024 || ((i4 - i) & 1073741823) > (i10 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j9, ((-1152921503533105153L) & j9) | (((i4 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i4 & i9, runnable);
                n nVar = this;
                while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                    nVar = nVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = nVar.f3161d;
                    int i11 = nVar.f3160c & i4;
                    Object obj = atomicReferenceArray2.get(i11);
                    if ((obj instanceof m) && ((m) obj).f3154a == i4) {
                        atomicReferenceArray2.set(i11, runnable);
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
        long j9;
        do {
            atomicLongFieldUpdater = f3156f;
            j9 = atomicLongFieldUpdater.get(this);
            if ((j9 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j9) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j9, 2305843009213693952L | j9));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j9;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f3156f;
            j9 = atomicLongFieldUpdater.get(this);
            if ((j9 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j10 = 1152921504606846976L | j9;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j9, j10)) {
                j9 = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3155e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f3158a * 2, nVar.f3159b);
            int i = (int) (1073741823 & j9);
            int i4 = (int) ((1152921503533105152L & j9) >> 30);
            while (true) {
                int i9 = nVar.f3160c;
                int i10 = i & i9;
                if (i10 == (i9 & i4)) {
                    break;
                }
                Object obj = nVar.f3161d.get(i10);
                if (obj == null) {
                    obj = new m(i);
                }
                nVar3.f3161d.set(nVar3.f3160c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j9);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3156f;
            long j9 = atomicLongFieldUpdater.get(nVar);
            if ((j9 & 1152921504606846976L) != 0) {
                return f3157g;
            }
            int i = (int) (j9 & 1073741823);
            int i4 = nVar.f3160c;
            int i9 = ((int) ((1152921503533105152L & j9) >> 30)) & i4;
            int i10 = i4 & i;
            if (i9 == i10) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.f3161d;
            Object obj = atomicReferenceArray.get(i10);
            boolean z8 = nVar.f3159b;
            if (obj == null) {
                if (z8) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j10 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(nVar, j9, (j9 & (-1073741824)) | j10)) {
                    atomicReferenceArray.set(i10, null);
                    return obj;
                }
                nVar = this;
                if (z8) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3156f;
                        long j11 = atomicLongFieldUpdater2.get(nVar);
                        int i11 = (int) (j11 & 1073741823);
                        if ((j11 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            nVar = nVar2;
                            if (atomicLongFieldUpdater2.compareAndSet(nVar2, j11, (j11 & (-1073741824)) | j10)) {
                                nVar.f3161d.set(nVar.f3160c & i11, null);
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
        return null;
    }
}
