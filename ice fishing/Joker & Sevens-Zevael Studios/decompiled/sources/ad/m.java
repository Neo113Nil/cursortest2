package ad;

import java.util.concurrent.atomic.AtomicReferenceArray;
import yc.b2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends dd.u {

    /* renamed from: e, reason: collision with root package name */
    public final e f329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f330f;

    public m(long j3, m mVar, e eVar, int i10) {
        super(j3, mVar, i10);
        this.f329e = eVar;
        this.f330f = new AtomicReferenceArray(g.f305b * 2);
    }

    @Override // dd.u
    public final int f() {
        return g.f305b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        pc.j.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // dd.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i10, fc.i iVar) {
        int i11 = g.f305b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        this.f330f.get(i10 * 2);
        while (true) {
            Object k3 = k(i10);
            boolean z11 = k3 instanceof b2;
            e eVar = this.f329e;
            if (z11 || (k3 instanceof v)) {
                if (j(i10, k3, z10 ? g.f313j : g.f314k)) {
                    m(i10, null);
                    l(i10, !z10);
                    if (z10) {
                        pc.j.b(eVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k3 == g.f313j || k3 == g.f314k) {
                    break;
                }
                if (k3 != g.f310g && k3 != g.f309f) {
                    if (k3 == g.f312i || k3 == g.f307d || k3 == g.f315l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k3).toString());
                }
            }
        }
    }

    public final boolean j(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f330f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object k(int i10) {
        return this.f330f.get((i10 * 2) + 1);
    }

    public final void l(int i10, boolean z10) {
        if (z10) {
            e eVar = this.f329e;
            pc.j.b(eVar);
            eVar.I((this.f1884c * g.f305b) + i10);
        }
        h();
    }

    public final void m(int i10, Object obj) {
        this.f330f.set(i10 * 2, obj);
    }

    public final void n(int i10, Object obj) {
        this.f330f.set((i10 * 2) + 1, obj);
    }
}
