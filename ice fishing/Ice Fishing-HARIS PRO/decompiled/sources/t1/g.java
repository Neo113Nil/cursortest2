package t1;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class g implements b, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4381c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile D1.j f4382a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f4383b;

    /* JADX WARN: Type inference failed for: r0v1, types: [C1.a, D1.j] */
    @Override // t1.b
    public final Object getValue() {
        Object obj = this.f4383b;
        i iVar = i.f4387b;
        if (obj != iVar) {
            return obj;
        }
        ?? r02 = this.f4382a;
        if (r02 != 0) {
            Object c2 = r02.c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4381c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, c2)) {
                if (atomicReferenceFieldUpdater.get(this) != iVar) {
                }
            }
            this.f4382a = null;
            return c2;
        }
        return this.f4383b;
    }

    public final String toString() {
        return this.f4383b != i.f4387b ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
