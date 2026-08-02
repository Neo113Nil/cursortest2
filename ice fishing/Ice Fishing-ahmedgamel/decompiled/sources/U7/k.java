package U7;

import E2.C0316m;
import S7.y0;
import X7.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class k extends t {

    /* renamed from: x, reason: collision with root package name */
    public final c f3383x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3384y;

    public k(long j6, k kVar, c cVar, int i) {
        super(j6, kVar, i);
        this.f3383x = cVar;
        this.f3384y = new AtomicReferenceArray(e.f3361b * 2);
    }

    @Override // X7.t
    public final int f() {
        return e.f3361b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.h.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // X7.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, InterfaceC5245i interfaceC5245i) {
        int i4 = e.f3361b;
        boolean z6 = i >= i4;
        if (z6) {
            i -= i4;
        }
        this.f3384y.get(i * 2);
        while (true) {
            Object k9 = k(i);
            boolean z9 = k9 instanceof y0;
            c cVar = this.f3383x;
            if (z9 || (k9 instanceof s)) {
                if (j(i, k9, z6 ? e.f3368j : e.f3369k)) {
                    m(i, null);
                    l(i, !z6);
                    if (z6) {
                        kotlin.jvm.internal.h.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k9 == e.f3368j || k9 == e.f3369k) {
                    break;
                }
                if (k9 != e.f3366g && k9 != e.f3365f) {
                    if (k9 == e.i || k9 == e.f3363d || k9 == e.f3370l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k9).toString());
                }
            }
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f3384y;
        int i4 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i) {
        return this.f3384y.get((i * 2) + 1);
    }

    public final void l(int i, boolean z6) {
        if (z6) {
            c cVar = this.f3383x;
            kotlin.jvm.internal.h.b(cVar);
            cVar.D((this.f3815v * e.f3361b) + i);
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f3384y.set(i * 2, obj);
    }

    public final void n(int i, C0316m c0316m) {
        this.f3384y.set((i * 2) + 1, c0316m);
    }
}
