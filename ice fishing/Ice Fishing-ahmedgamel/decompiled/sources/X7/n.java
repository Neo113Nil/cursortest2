package X7;

import E2.C0316m;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3804e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3805f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final C0316m f3806g = new C0316m("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f3807a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3808b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3810d;

    public n(int i, boolean z6) {
        this.f3807a = i;
        this.f3808b = z6;
        int i4 = i - 1;
        this.f3809c = i4;
        this.f3810d = new AtomicReferenceArray(i);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3805f;
            long j6 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j6) != 0) {
                return (2305843009213693952L & j6) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j6);
            int i4 = (int) ((1152921503533105152L & j6) >> 30);
            int i6 = this.f3809c;
            if (((i4 + 2) & i6) == (i & i6)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f3810d;
            if (!this.f3808b && atomicReferenceArray.get(i4 & i6) != null) {
                int i9 = this.f3807a;
                if (i9 < 1024 || ((i4 - i) & 1073741823) > (i9 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j6, ((-1152921503533105153L) & j6) | (((i4 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i4 & i6, runnable);
                n nVar = this;
                while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                    nVar = nVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = nVar.f3810d;
                    int i10 = nVar.f3809c & i4;
                    Object obj = atomicReferenceArray2.get(i10);
                    if ((obj instanceof m) && ((m) obj).f3803a == i4) {
                        atomicReferenceArray2.set(i10, runnable);
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
        long j6;
        do {
            atomicLongFieldUpdater = f3805f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j6) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, 2305843009213693952L | j6));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f3805f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j9 = 1152921504606846976L | j6;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j6, j9)) {
                j6 = j9;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3804e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f3807a * 2, nVar.f3808b);
            int i = (int) (1073741823 & j6);
            int i4 = (int) ((1152921503533105152L & j6) >> 30);
            while (true) {
                int i6 = nVar.f3809c;
                int i9 = i & i6;
                if (i9 == (i6 & i4)) {
                    break;
                }
                Object obj = nVar.f3810d.get(i9);
                if (obj == null) {
                    obj = new m(i);
                }
                nVar3.f3810d.set(nVar3.f3809c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j6);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3805f;
            long j6 = atomicLongFieldUpdater.get(nVar);
            if ((j6 & 1152921504606846976L) != 0) {
                return f3806g;
            }
            int i = (int) (j6 & 1073741823);
            int i4 = nVar.f3809c;
            int i6 = ((int) ((1152921503533105152L & j6) >> 30)) & i4;
            int i9 = i4 & i;
            if (i6 == i9) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.f3810d;
            Object obj = atomicReferenceArray.get(i9);
            boolean z6 = nVar.f3808b;
            if (obj == null) {
                if (z6) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j9 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(nVar, j6, (j6 & (-1073741824)) | j9)) {
                    atomicReferenceArray.set(i9, null);
                    return obj;
                }
                nVar = this;
                if (z6) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3805f;
                        long j10 = atomicLongFieldUpdater2.get(nVar);
                        int i10 = (int) (j10 & 1073741823);
                        if ((j10 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            nVar = nVar2;
                            if (atomicLongFieldUpdater2.compareAndSet(nVar2, j10, (j10 & (-1073741824)) | j9)) {
                                nVar.f3810d.set(nVar.f3809c & i10, null);
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
