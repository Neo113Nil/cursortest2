package q7;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: q7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4941j implements InterfaceC4936e, Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f40165v = AtomicReferenceFieldUpdater.newUpdater(C4941j.class, Object.class, "u");

    /* renamed from: n, reason: collision with root package name */
    public volatile E7.a f40166n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f40167u;

    @Override // q7.InterfaceC4936e
    public final Object getValue() {
        Object obj = this.f40167u;
        C4950s c4950s = C4950s.f40180a;
        if (obj != c4950s) {
            return obj;
        }
        E7.a aVar = this.f40166n;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40165v;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c4950s, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c4950s) {
                }
            }
            this.f40166n = null;
            return invoke;
        }
        return this.f40167u;
    }

    public final String toString() {
        return this.f40167u != C4950s.f40180a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
