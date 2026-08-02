package u7;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: u7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5084j implements InterfaceC5079e, Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f41055v = AtomicReferenceFieldUpdater.newUpdater(C5084j.class, Object.class, "u");

    /* renamed from: n, reason: collision with root package name */
    public volatile I7.a f41056n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f41057u;

    @Override // u7.InterfaceC5079e
    public final Object getValue() {
        Object obj = this.f41057u;
        C5093s c5093s = C5093s.f41070a;
        if (obj != c5093s) {
            return obj;
        }
        I7.a aVar = this.f41056n;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41055v;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c5093s, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c5093s) {
                }
            }
            this.f41056n = null;
            return invoke;
        }
        return this.f41057u;
    }

    public final String toString() {
        return this.f41057u != C5093s.f41070a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
