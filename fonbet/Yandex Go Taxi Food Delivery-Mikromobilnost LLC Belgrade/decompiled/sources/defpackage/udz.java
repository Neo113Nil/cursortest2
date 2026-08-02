package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public final class udz {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(udz.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = wb4.a.objectFieldOffset(udz.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(udz.class, "_state$volatile");
    public static final jb20 g = new jb20("REMOVE_FROZEN", 1);

    public udz(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            ny61.r("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        ny61.r("Check failed.");
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
                udz udzVar = this;
                if (f.compareAndSet(udzVar, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    udz udzVar2 = udzVar;
                    while ((atomicLongFieldUpdater.get(udzVar2) & 1152921504606846976L) != 0) {
                        udzVar2 = udzVar2.d();
                        AtomicReferenceArray atomicReferenceArray2 = udzVar2.d;
                        int i4 = udzVar2.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof tdz) && ((tdz) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            udzVar2 = null;
                        }
                        if (udzVar2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = udzVar;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final udz b(long j) {
        udz udzVar;
        while (true) {
            e.getClass();
            Unsafe unsafe = wb4.a;
            long j2 = h;
            udz udzVar2 = (udz) unsafe.getObjectVolatile(this, j2);
            if (udzVar2 != null) {
                return udzVar2;
            }
            udz udzVar3 = new udz(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new tdz(i);
                }
                udzVar3.d.set(udzVar3.c & i, obj);
                i++;
            }
            f.set(udzVar3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = wb4.a;
                udzVar = this;
                if (!unsafe2.compareAndSwapObject(udzVar, h, (Object) null, udzVar3) && unsafe2.getObjectVolatile(udzVar, j2) == null) {
                    this = udzVar;
                }
            }
            this = udzVar;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            udz udzVar = this;
            if (atomicLongFieldUpdater.compareAndSet(udzVar, j, 2305843009213693952L | j)) {
                return true;
            }
            this = udzVar;
        }
    }

    public final udz d() {
        long j;
        udz udzVar;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                udzVar = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            udzVar = this;
            if (atomicLongFieldUpdater.compareAndSet(udzVar, j, j2)) {
                j = j2;
                break;
            }
            this = udzVar;
        }
        return udzVar.b(j);
    }

    public final Object e() {
        udz udzVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(udzVar);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = udzVar.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = udzVar.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = udzVar.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof tdz) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(udzVar, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                udzVar = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(udzVar);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            udzVar = udzVar.d();
                        } else {
                            udz udzVar2 = udzVar;
                            if (f.compareAndSet(udzVar2, j3, (j3 & (-1073741824)) | j2)) {
                                udzVar2.d.set(i4 & udzVar2.c, null);
                                udzVar = null;
                            } else {
                                udzVar = udzVar2;
                            }
                        }
                        if (udzVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
