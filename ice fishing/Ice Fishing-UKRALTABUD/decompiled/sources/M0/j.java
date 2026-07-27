package M0;

import K0.m0;
import P0.AbstractC0068a;
import P0.v;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: j, reason: collision with root package name */
    public final b f734j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceArray f735k;

    public j(long j2, j jVar, b bVar, int i2) {
        super(j2, jVar, i2);
        this.f734j = bVar;
        this.f735k = new AtomicReferenceArray(d.f712b * 2);
    }

    @Override // P0.v
    public final int f() {
        return d.f712b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        E0.i.b(r4);
        r7 = r4.f709g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        P0.AbstractC0068a.a(r7, r0, r8);
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
    @Override // P0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, v0.i iVar) {
        int i3 = d.f712b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        Object obj = this.f735k.get(i2 * 2);
        while (true) {
            Object k2 = k(i2);
            boolean z3 = k2 instanceof m0;
            b bVar = this.f734j;
            if (z3 || (k2 instanceof s)) {
                if (j(i2, k2, z2 ? d.f720j : d.f721k)) {
                    m(i2, null);
                    l(i2, !z2);
                    if (z2) {
                        E0.i.b(bVar);
                        D0.l lVar = bVar.f709g;
                        if (lVar != null) {
                            AbstractC0068a.a(lVar, obj, iVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == d.f720j || k2 == d.f721k) {
                    break;
                }
                if (k2 != d.f717g && k2 != d.f716f) {
                    if (k2 == d.f719i || k2 == d.f714d || k2 == d.f722l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f735k;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f735k.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        if (z2) {
            b bVar = this.f734j;
            E0.i.b(bVar);
            bVar.C((this.f905h * d.f712b) + i2);
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f735k.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, A.j jVar) {
        this.f735k.set((i2 * 2) + 1, jVar);
    }
}
