package t1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class h implements b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public D1.j f4384a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f4385b = i.f4387b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4386c = this;

    /* JADX WARN: Multi-variable type inference failed */
    public h(C1.a aVar) {
        this.f4384a = (D1.j) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [C1.a, D1.j, java.lang.Object] */
    @Override // t1.b
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f4385b;
        i iVar = i.f4387b;
        if (obj2 != iVar) {
            return obj2;
        }
        synchronized (this.f4386c) {
            obj = this.f4385b;
            if (obj == iVar) {
                ?? r1 = this.f4384a;
                D1.i.b(r1);
                obj = r1.c();
                this.f4385b = obj;
                this.f4384a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f4385b != i.f4387b ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
