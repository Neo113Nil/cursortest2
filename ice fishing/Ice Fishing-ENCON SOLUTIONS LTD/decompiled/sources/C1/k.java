package C1;

import A1.AbstractC0022x;
import A1.C0015p;
import A1.n0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class k extends F1.u {

    /* renamed from: e, reason: collision with root package name */
    public final c f186e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f187f;

    public k(long j2, k kVar, c cVar, int i2) {
        super(j2, kVar, i2);
        this.f186e = cVar;
        this.f187f = new AtomicReferenceArray(e.f163b * 2);
    }

    @Override // F1.u
    public final int f() {
        return e.f163b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        kotlin.jvm.internal.i.b(r4);
        r7 = r4.f160b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r7 = F1.a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        A1.AbstractC0022x.d(r7, r8);
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
    @Override // F1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, l1.i iVar) {
        C0015p a2;
        int i3 = e.f163b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        Object obj = this.f187f.get(i2 * 2);
        while (true) {
            Object k2 = k(i2);
            boolean z3 = k2 instanceof n0;
            c cVar = this.f186e;
            if (z3 || (k2 instanceof u)) {
                if (j(i2, k2, z2 ? e.f171j : e.f172k)) {
                    m(i2, null);
                    l(i2, !z2);
                    if (z2) {
                        kotlin.jvm.internal.i.b(cVar);
                        t1.l lVar = cVar.f160b;
                        if (lVar == null || (a2 = F1.a.a(lVar, obj, null)) == null) {
                            return;
                        }
                        AbstractC0022x.d(a2, iVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == e.f171j || k2 == e.f172k) {
                    break;
                }
                if (k2 != e.f168g && k2 != e.f167f) {
                    if (k2 == e.f170i || k2 == e.f165d || k2 == e.f173l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f187f;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f187f.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        if (z2) {
            c cVar = this.f186e;
            kotlin.jvm.internal.i.b(cVar);
            cVar.C((this.f631c * e.f163b) + i2);
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f187f.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, C.j jVar) {
        this.f187f.set((i2 * 2) + 1, jVar);
    }
}
