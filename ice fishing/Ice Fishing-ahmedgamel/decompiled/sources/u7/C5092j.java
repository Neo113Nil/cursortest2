package u7;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: u7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5092j implements InterfaceC5087e, Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f41335v = AtomicReferenceFieldUpdater.newUpdater(C5092j.class, Object.class, "u");

    /* renamed from: n, reason: collision with root package name */
    public volatile I7.a f41336n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f41337u;

    @Override // u7.InterfaceC5087e
    public final Object getValue() {
        Object obj = this.f41337u;
        C5101s c5101s = C5101s.f41350a;
        if (obj != c5101s) {
            return obj;
        }
        I7.a aVar = this.f41336n;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41335v;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c5101s, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c5101s) {
                }
            }
            this.f41336n = null;
            return invoke;
        }
        return this.f41337u;
    }

    public final String toString() {
        return this.f41337u != C5101s.f41350a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
