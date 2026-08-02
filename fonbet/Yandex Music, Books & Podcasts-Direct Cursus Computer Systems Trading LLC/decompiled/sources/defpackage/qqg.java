package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public final class qqg {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(qqg.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(qqg.class, "_state$volatile");
    public static final js3 g = new js3("REMOVE_FROZEN", 2);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public qqg(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            xq0.q("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        xq0.q("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    qqg qqgVar = this;
                    while ((atomicLongFieldUpdater.get(qqgVar) & 1152921504606846976L) != 0) {
                        qqgVar = qqgVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = qqgVar.d;
                        int i4 = qqgVar.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof pqg) && ((pqg) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            qqgVar = null;
                        }
                        if (qqgVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
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

    public final qqg c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        qqg qqgVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                qqgVar = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            qqgVar = this;
            if (atomicLongFieldUpdater.compareAndSet(qqgVar, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            qqg qqgVar2 = (qqg) atomicReferenceFieldUpdater.get(this);
            if (qqgVar2 != null) {
                return qqgVar2;
            }
            qqg qqgVar3 = new qqg(qqgVar.a * 2, qqgVar.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = qqgVar.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = qqgVar.d.get(i4);
                if (obj == null) {
                    obj = new pqg(i);
                }
                qqgVar3.d.set(qqgVar3.c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(qqgVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, qqgVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        qqg qqgVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(qqgVar);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = qqgVar.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = qqgVar.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = qqgVar.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof pqg) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(qqgVar, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                qqgVar = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(qqgVar);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            qqgVar = qqgVar.c();
                        } else {
                            qqg qqgVar2 = qqgVar;
                            if (f.compareAndSet(qqgVar2, j3, (j3 & (-1073741824)) | j2)) {
                                qqgVar2.d.set(i4 & qqgVar2.c, null);
                                qqgVar = null;
                            } else {
                                qqgVar = qqgVar2;
                            }
                        }
                        if (qqgVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
