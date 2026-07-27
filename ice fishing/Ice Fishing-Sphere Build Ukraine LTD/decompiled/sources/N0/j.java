package N0;

import L0.m0;
import Q0.AbstractC0068a;
import Q0.v;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: i, reason: collision with root package name */
    public final b f742i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceArray f743j;

    public j(long j2, j jVar, b bVar, int i2) {
        super(j2, jVar, i2);
        this.f742i = bVar;
        this.f743j = new AtomicReferenceArray(d.f720b * 2);
    }

    @Override // Q0.v
    public final int f() {
        return d.f720b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        E0.i.b(r4);
        r7 = r4.f717f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        Q0.AbstractC0068a.a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // Q0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, v0.i iVar) {
        int i3 = d.f720b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        Object obj = this.f743j.get(i2 * 2);
        while (true) {
            Object k2 = k(i2);
            boolean z3 = k2 instanceof m0;
            b bVar = this.f742i;
            if (z3 || (k2 instanceof s)) {
                if (j(i2, k2, z2 ? d.f728j : d.f729k)) {
                    m(i2, null);
                    l(i2, !z2);
                    if (z2) {
                        E0.i.b(bVar);
                        D0.l lVar = bVar.f717f;
                        if (lVar != null) {
                            AbstractC0068a.a(lVar, obj, iVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == d.f728j || k2 == d.f729k) {
                    break;
                }
                if (k2 != d.f725g && k2 != d.f724f) {
                    if (k2 == d.f727i || k2 == d.f722d || k2 == d.f730l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f743j;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f743j.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        if (z2) {
            b bVar = this.f742i;
            E0.i.b(bVar);
            bVar.C((this.f914g * d.f720b) + i2);
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f743j.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, A.j jVar) {
        this.f743j.set((i2 * 2) + 1, jVar);
    }
}
