package t0;

import E0.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public D0.a f2985f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f2986g = f.f2988a;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2987h = this;

    public e(D0.a aVar) {
        this.f2985f = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f2986g;
        f fVar = f.f2988a;
        if (obj2 != fVar) {
            return obj2;
        }
        synchronized (this.f2987h) {
            obj = this.f2986g;
            if (obj == fVar) {
                D0.a aVar = this.f2985f;
                i.b(aVar);
                obj = aVar.a();
                this.f2986g = obj;
                this.f2985f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f2986g != f.f2988a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
