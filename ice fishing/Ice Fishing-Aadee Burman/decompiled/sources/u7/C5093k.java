package u7;

import java.io.Serializable;

/* renamed from: u7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5093k implements InterfaceC5087e, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public I7.a f41335n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f41336u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f41337v;

    public C5093k(I7.a initializer) {
        kotlin.jvm.internal.h.e(initializer, "initializer");
        this.f41335n = initializer;
        this.f41336u = C5101s.f41347a;
        this.f41337v = this;
    }

    @Override // u7.InterfaceC5087e
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f41336u;
        C5101s c5101s = C5101s.f41347a;
        if (obj2 != c5101s) {
            return obj2;
        }
        synchronized (this.f41337v) {
            obj = this.f41336u;
            if (obj == c5101s) {
                I7.a aVar = this.f41335n;
                kotlin.jvm.internal.h.b(aVar);
                obj = aVar.invoke();
                this.f41336u = obj;
                this.f41335n = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f41336u != C5101s.f41347a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
