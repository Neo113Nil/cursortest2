package u7;

import java.io.Serializable;

/* renamed from: u7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5093k implements InterfaceC5087e, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public I7.a f41338n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f41339u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f41340v;

    public C5093k(I7.a initializer) {
        kotlin.jvm.internal.h.e(initializer, "initializer");
        this.f41338n = initializer;
        this.f41339u = C5101s.f41350a;
        this.f41340v = this;
    }

    @Override // u7.InterfaceC5087e
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f41339u;
        C5101s c5101s = C5101s.f41350a;
        if (obj2 != c5101s) {
            return obj2;
        }
        synchronized (this.f41340v) {
            obj = this.f41339u;
            if (obj == c5101s) {
                I7.a aVar = this.f41338n;
                kotlin.jvm.internal.h.b(aVar);
                obj = aVar.invoke();
                this.f41339u = obj;
                this.f41338n = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f41339u != C5101s.f41350a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
