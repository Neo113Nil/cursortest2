package t1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public D1.j f4390a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4391b;

    /* JADX WARN: Type inference failed for: r0v2, types: [C1.a, D1.j, java.lang.Object] */
    @Override // t1.b
    public final Object getValue() {
        if (this.f4391b == i.f4387b) {
            ?? r02 = this.f4390a;
            D1.i.b(r02);
            this.f4391b = r02.c();
            this.f4390a = null;
        }
        return this.f4391b;
    }

    public final String toString() {
        return this.f4391b != i.f4387b ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
