package Q0;

import L0.AbstractC0064w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class l {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f895e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f896f = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f897g = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((Q0.s) r6).f911a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l h() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f896f;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            l lVar2 = lVar;
            while (true) {
                l lVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f895e;
                    Object obj = atomicReferenceFieldUpdater2.get(lVar2);
                    if (obj == this) {
                        if (lVar == lVar2) {
                            return lVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != lVar) {
                                break;
                            }
                        }
                        return lVar2;
                    }
                    if (m()) {
                        return null;
                    }
                    if (obj == null) {
                        return lVar2;
                    }
                    if (obj instanceof r) {
                        ((r) obj).a(lVar2);
                        break;
                    }
                    if (!(obj instanceof s)) {
                        E0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        lVar3 = lVar2;
                        lVar2 = (l) obj;
                    } else {
                        if (lVar3 != null) {
                            break;
                        }
                        lVar2 = (l) atomicReferenceFieldUpdater.get(lVar2);
                    }
                }
                lVar2 = lVar3;
            }
        }
    }

    public final void j(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f896f;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (k() != lVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                if (atomicReferenceFieldUpdater.get(lVar) != lVar2) {
                    break;
                }
            }
            if (m()) {
                lVar.h();
                return;
            }
            return;
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f895e.get(this);
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).a(this);
        }
    }

    public final l l() {
        l lVar;
        Object k2 = k();
        s sVar = k2 instanceof s ? (s) k2 : null;
        if (sVar != null && (lVar = sVar.f911a) != null) {
            return lVar;
        }
        E0.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (l) k2;
    }

    public boolean m() {
        return k() instanceof s;
    }

    public String toString() {
        return new k(this, AbstractC0064w.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0064w.b(this);
    }
}
