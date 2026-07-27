package X7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3849e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3850f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final D2.b f3851g = new D2.b("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f3852a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3853b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3854c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3855d;

    public n(int i, boolean z3) {
        this.f3852a = i;
        this.f3853b = z3;
        int i6 = i - 1;
        this.f3854c = i6;
        this.f3855d = new AtomicReferenceArray(i);
        if (i6 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i6) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3850f;
            long j6 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j6) != 0) {
                return (2305843009213693952L & j6) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j6);
            int i6 = (int) ((1152921503533105152L & j6) >> 30);
            int i9 = this.f3854c;
            if (((i6 + 2) & i9) == (i & i9)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f3855d;
            if (!this.f3853b && atomicReferenceArray.get(i6 & i9) != null) {
                int i10 = this.f3852a;
                if (i10 < 1024 || ((i6 - i) & 1073741823) > (i10 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j6, ((-1152921503533105153L) & j6) | (((i6 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i6 & i9, runnable);
                n nVar = this;
                while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                    nVar = nVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = nVar.f3855d;
                    int i11 = nVar.f3854c & i6;
                    Object obj = atomicReferenceArray2.get(i11);
                    if ((obj instanceof m) && ((m) obj).f3848a == i6) {
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
        long j6;
        do {
            atomicLongFieldUpdater = f3850f;
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
            atomicLongFieldUpdater = f3850f;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3849e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f3852a * 2, nVar.f3853b);
            int i = (int) (1073741823 & j6);
            int i6 = (int) ((1152921503533105152L & j6) >> 30);
            while (true) {
                int i9 = nVar.f3854c;
                int i10 = i & i9;
                if (i10 == (i9 & i6)) {
                    break;
                }
                Object obj = nVar.f3855d.get(i10);
                if (obj == null) {
                    obj = new m(i);
                }
                nVar3.f3855d.set(nVar3.f3854c & i, obj);
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
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3850f;
            long j6 = atomicLongFieldUpdater.get(nVar);
            if ((j6 & 1152921504606846976L) != 0) {
                return f3851g;
            }
            int i = (int) (j6 & 1073741823);
            int i6 = nVar.f3854c;
            int i9 = ((int) ((1152921503533105152L & j6) >> 30)) & i6;
            int i10 = i6 & i;
            if (i9 == i10) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.f3855d;
            Object obj = atomicReferenceArray.get(i10);
            boolean z3 = nVar.f3853b;
            if (obj == null) {
                if (z3) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j9 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(nVar, j6, (j6 & (-1073741824)) | j9)) {
                    atomicReferenceArray.set(i10, null);
                    return obj;
                }
                nVar = this;
                if (z3) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3850f;
                        long j10 = atomicLongFieldUpdater2.get(nVar);
                        int i11 = (int) (j10 & 1073741823);
                        if ((j10 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            nVar = nVar2;
                            if (atomicLongFieldUpdater2.compareAndSet(nVar2, j10, (j10 & (-1073741824)) | j9)) {
                                nVar.f3855d.set(nVar.f3854c & i11, null);
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
