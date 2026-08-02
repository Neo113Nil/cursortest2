package u7;

import java.io.Serializable;

/* renamed from: u7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5085k implements InterfaceC5079e, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public I7.a f41058n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f41059u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f41060v;

    public C5085k(I7.a initializer) {
        kotlin.jvm.internal.h.e(initializer, "initializer");
        this.f41058n = initializer;
        this.f41059u = C5093s.f41070a;
        this.f41060v = this;
    }

    @Override // u7.InterfaceC5079e
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f41059u;
        C5093s c5093s = C5093s.f41070a;
        if (obj2 != c5093s) {
            return obj2;
        }
        synchronized (this.f41060v) {
            obj = this.f41059u;
            if (obj == c5093s) {
                I7.a aVar = this.f41058n;
                kotlin.jvm.internal.h.b(aVar);
                obj = aVar.invoke();
                this.f41059u = obj;
                this.f41058n = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f41059u != C5093s.f41070a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
