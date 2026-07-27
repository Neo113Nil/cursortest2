package U7;

import S7.y0;
import X7.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class k extends t {

    /* renamed from: x, reason: collision with root package name */
    public final c f3260x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3261y;

    public k(long j6, k kVar, c cVar, int i) {
        super(j6, kVar, i);
        this.f3260x = cVar;
        this.f3261y = new AtomicReferenceArray(e.f3238b * 2);
    }

    @Override // X7.t
    public final int f() {
        return e.f3238b;
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
    public final void g(int i, InterfaceC5272i interfaceC5272i) {
        int i6 = e.f3238b;
        boolean z3 = i >= i6;
        if (z3) {
            i -= i6;
        }
        this.f3261y.get(i * 2);
        while (true) {
            Object k9 = k(i);
            boolean z6 = k9 instanceof y0;
            c cVar = this.f3260x;
            if (z6 || (k9 instanceof s)) {
                if (j(i, k9, z3 ? e.f3245j : e.f3246k)) {
                    m(i, null);
                    l(i, !z3);
                    if (z3) {
                        kotlin.jvm.internal.h.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k9 == e.f3245j || k9 == e.f3246k) {
                    break;
                }
                if (k9 != e.f3243g && k9 != e.f3242f) {
                    if (k9 == e.i || k9 == e.f3240d || k9 == e.f3247l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k9).toString());
                }
            }
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f3261y;
        int i6 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i6, obj, obj2)) {
            if (atomicReferenceArray.get(i6) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i) {
        return this.f3261y.get((i * 2) + 1);
    }

    public final void l(int i, boolean z3) {
        if (z3) {
            c cVar = this.f3260x;
            kotlin.jvm.internal.h.b(cVar);
            cVar.D((this.f3860v * e.f3238b) + i);
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f3261y.set(i * 2, obj);
    }

    public final void n(int i, D2.b bVar) {
        this.f3261y.set((i * 2) + 1, bVar);
    }
}
