package t0;

import E0.i;
import java.io.Serializable;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250e implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public D0.a f2990e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f2991f = C0251f.f2993a;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2992g = this;

    public C0250e(D0.a aVar) {
        this.f2990e = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f2991f;
        C0251f c0251f = C0251f.f2993a;
        if (obj2 != c0251f) {
            return obj2;
        }
        synchronized (this.f2992g) {
            obj = this.f2991f;
            if (obj == c0251f) {
                D0.a aVar = this.f2990e;
                i.b(aVar);
                obj = aVar.a();
                this.f2991f = obj;
                this.f2990e = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f2991f != C0251f.f2993a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
