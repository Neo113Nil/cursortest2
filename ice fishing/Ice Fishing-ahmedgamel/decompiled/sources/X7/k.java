package X7;

import S7.AbstractC0406y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3844n = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3845u = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3846v = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((X7.q) r6).f3857a;
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
    public final k c() {
        k kVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3845u;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
            kVar = kVar2;
            while (true) {
                k kVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3844n;
                    Object obj = atomicReferenceFieldUpdater2.get(kVar);
                    if (obj == this) {
                        if (kVar2 != kVar) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar2, kVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != kVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (g()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof p) {
                        ((p) obj).a(kVar);
                        break;
                    }
                    if (!(obj instanceof q)) {
                        kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        kVar3 = kVar;
                        kVar = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar = (k) atomicReferenceFieldUpdater.get(kVar);
                    }
                }
                kVar = kVar3;
            }
        }
        return kVar;
    }

    public final void d(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3845u;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (e() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (g()) {
                kVar.c();
                return;
            }
            return;
        }
    }

    public final Object e() {
        while (true) {
            Object obj = f3844n.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k f() {
        k kVar;
        Object e9 = e();
        q qVar = e9 instanceof q ? (q) e9 : null;
        if (qVar != null && (kVar = qVar.f3857a) != null) {
            return kVar;
        }
        kotlin.jvm.internal.h.c(e9, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) e9;
    }

    public boolean g() {
        return e() instanceof q;
    }

    public String toString() {
        return new j(this, AbstractC0406y.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0406y.j(this);
    }
}
