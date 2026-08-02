package u7;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class w implements InterfaceC5079e, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public I7.a f41074n;

    /* renamed from: u, reason: collision with root package name */
    public Object f41075u;

    @Override // u7.InterfaceC5079e
    public final Object getValue() {
        if (this.f41075u == C5093s.f41070a) {
            I7.a aVar = this.f41074n;
            kotlin.jvm.internal.h.b(aVar);
            this.f41075u = aVar.invoke();
            this.f41074n = null;
        }
        return this.f41075u;
    }

    public final String toString() {
        return this.f41075u != C5093s.f41070a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
