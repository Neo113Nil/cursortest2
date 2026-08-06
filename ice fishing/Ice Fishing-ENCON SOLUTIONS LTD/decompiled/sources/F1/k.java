package F1;

import A1.AbstractC0022x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f612a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f613b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f614c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((F1.r) r6).f628a;
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
    public final k e() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f613b;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            k kVar2 = kVar;
            while (true) {
                k kVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f612a;
                    Object obj = atomicReferenceFieldUpdater2.get(kVar2);
                    if (obj == this) {
                        if (kVar == kVar2) {
                            return kVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != kVar) {
                                break;
                            }
                        }
                        return kVar2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (obj == null) {
                        return kVar2;
                    }
                    if (obj instanceof q) {
                        ((q) obj).a(kVar2);
                        break;
                    }
                    if (!(obj instanceof r)) {
                        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        kVar3 = kVar2;
                        kVar2 = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar2 = (k) atomicReferenceFieldUpdater.get(kVar2);
                    }
                }
                kVar2 = kVar3;
            }
        }
    }

    public final void f(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f613b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (g() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (i()) {
                kVar.e();
                return;
            }
            return;
        }
    }

    public final Object g() {
        while (true) {
            Object obj = f612a.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public final k h() {
        k kVar;
        Object g2 = g();
        r rVar = g2 instanceof r ? (r) g2 : null;
        if (rVar != null && (kVar = rVar.f628a) != null) {
            return kVar;
        }
        kotlin.jvm.internal.i.c(g2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) g2;
    }

    public boolean i() {
        return g() instanceof r;
    }

    public String toString() {
        return new j(this, AbstractC0022x.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0022x.b(this);
    }
}
