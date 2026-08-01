package u7;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class w implements InterfaceC5087e, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public I7.a f41354n;

    /* renamed from: u, reason: collision with root package name */
    public Object f41355u;

    @Override // u7.InterfaceC5087e
    public final Object getValue() {
        if (this.f41355u == C5101s.f41350a) {
            I7.a aVar = this.f41354n;
            kotlin.jvm.internal.h.b(aVar);
            this.f41355u = aVar.invoke();
            this.f41354n = null;
        }
        return this.f41355u;
    }

    public final String toString() {
        return this.f41355u != C5101s.f41350a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
