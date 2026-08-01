package Q1;

import L1.AbstractC0018t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f953a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f954b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f955c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((Q1.q) r6).f968a;
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
    public final j i() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f954b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            j jVar2 = jVar;
            while (true) {
                j jVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f953a;
                    Object obj = atomicReferenceFieldUpdater2.get(jVar2);
                    if (obj == this) {
                        if (jVar == jVar2) {
                            return jVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, jVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != jVar) {
                                break;
                            }
                        }
                        return jVar2;
                    }
                    if (m()) {
                        return null;
                    }
                    if (obj == null) {
                        return jVar2;
                    }
                    if (obj instanceof p) {
                        ((p) obj).a(jVar2);
                        break;
                    }
                    if (!(obj instanceof q)) {
                        D1.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        jVar3 = jVar2;
                        jVar2 = (j) obj;
                    } else {
                        if (jVar3 != null) {
                            break;
                        }
                        jVar2 = (j) atomicReferenceFieldUpdater.get(jVar2);
                    }
                }
                jVar2 = jVar3;
            }
        }
    }

    public final void j(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f954b;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (k() != jVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                    break;
                }
            }
            if (m()) {
                jVar.i();
                return;
            }
            return;
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f953a.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final j l() {
        j jVar;
        Object k2 = k();
        q qVar = k2 instanceof q ? (q) k2 : null;
        if (qVar != null && (jVar = qVar.f968a) != null) {
            return jVar;
        }
        D1.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (j) k2;
    }

    public boolean m() {
        return k() instanceof q;
    }

    public String toString() {
        return new i(this) + '@' + AbstractC0018t.a(this);
    }
}
