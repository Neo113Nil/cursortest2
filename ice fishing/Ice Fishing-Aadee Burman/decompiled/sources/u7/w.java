package u7;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class w implements InterfaceC5087e, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public I7.a f41351n;

    /* renamed from: u, reason: collision with root package name */
    public Object f41352u;

    @Override // u7.InterfaceC5087e
    public final Object getValue() {
        if (this.f41352u == C5101s.f41347a) {
            I7.a aVar = this.f41351n;
            kotlin.jvm.internal.h.b(aVar);
            this.f41352u = aVar.invoke();
            this.f41351n = null;
        }
        return this.f41352u;
    }

    public final String toString() {
        return this.f41352u != C5101s.f41347a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
