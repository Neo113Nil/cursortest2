package N1;

import L1.AbstractC0018t;
import L1.C0011l;
import L1.d0;
import Q1.s;
import Q1.u;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class h extends s {
    public final b e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f737f;

    public h(long j, h hVar, b bVar, int i) {
        super(j, hVar, i);
        this.e = bVar;
        this.f737f = new AtomicReferenceArray(d.f722b * 2);
    }

    @Override // Q1.s
    public final int f() {
        return d.f722b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        D1.i.b(r4);
        r7 = r4.f720b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r7 = Q1.a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        L1.AbstractC0018t.b(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    @Override // Q1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, v1.i iVar) {
        C0011l a2;
        int i2 = d.f722b;
        boolean z2 = i >= i2;
        if (z2) {
            i -= i2;
        }
        Object obj = this.f737f.get(i * 2);
        while (true) {
            Object k2 = k(i);
            boolean z3 = k2 instanceof d0;
            b bVar = this.e;
            if (z3 || (k2 instanceof l)) {
                if (j(k2, i, z2 ? d.j : d.f728k)) {
                    m(i, null);
                    l(i, !z2);
                    if (z2) {
                        D1.i.b(bVar);
                        C1.l lVar = bVar.f720b;
                        if (lVar == null || (a2 = Q1.a.a(lVar, obj, null)) == null) {
                            return;
                        }
                        AbstractC0018t.b(a2, iVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == d.j || k2 == d.f728k) {
                    break;
                }
                if (k2 != d.f726g && k2 != d.f725f) {
                    if (k2 == d.i || k2 == d.f724d || k2 == d.f729l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f737f;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i) {
        return this.f737f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        long j2;
        if (z2) {
            b bVar = this.e;
            D1.i.b(bVar);
            long j3 = (this.f970c * d.f722b) + i;
            if (!bVar.n()) {
                do {
                    atomicLongFieldUpdater = b.e;
                } while (atomicLongFieldUpdater.get(bVar) <= j3);
                int i2 = d.f723c;
                int i3 = 0;
                while (true) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = b.f716f;
                    if (i3 < i2) {
                        long j4 = atomicLongFieldUpdater.get(bVar);
                        if (j4 == (atomicLongFieldUpdater3.get(bVar) & 4611686018427387903L) && j4 == atomicLongFieldUpdater.get(bVar)) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        do {
                            j = atomicLongFieldUpdater3.get(bVar);
                        } while (!atomicLongFieldUpdater3.compareAndSet(bVar, j, 4611686018427387904L + (j & 4611686018427387903L)));
                        while (true) {
                            long j5 = atomicLongFieldUpdater.get(bVar);
                            atomicLongFieldUpdater2 = b.f716f;
                            long j6 = atomicLongFieldUpdater2.get(bVar);
                            long j7 = j6 & 4611686018427387903L;
                            boolean z3 = (j6 & 4611686018427387904L) != 0;
                            if (j5 == j7 && j5 == atomicLongFieldUpdater.get(bVar)) {
                                break;
                            } else if (!z3) {
                                atomicLongFieldUpdater2.compareAndSet(bVar, j6, j7 + 4611686018427387904L);
                            }
                        }
                        do {
                            j2 = atomicLongFieldUpdater2.get(bVar);
                        } while (!atomicLongFieldUpdater2.compareAndSet(bVar, j2, j2 & 4611686018427387903L));
                    }
                }
            }
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f737f.lazySet(i * 2, obj);
    }

    public final void n(int i, u uVar) {
        this.f737f.set((i * 2) + 1, uVar);
    }
}
