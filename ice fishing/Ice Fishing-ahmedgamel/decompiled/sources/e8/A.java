package e8;

import java.util.List;
import v7.C5125p;

/* loaded from: classes2.dex */
public final class A implements c8.e {

    /* renamed from: a, reason: collision with root package name */
    public final c8.e f37316a;

    /* renamed from: b, reason: collision with root package name */
    public final c8.e f37317b;

    public A(c8.e keyDesc, c8.e valueDesc) {
        kotlin.jvm.internal.h.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.h.e(valueDesc, "valueDesc");
        this.f37316a = keyDesc;
        this.f37317b = valueDesc;
    }

    @Override // c8.e
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // c8.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        Integer i02 = Q7.q.i0(name);
        if (i02 != null) {
            return i02.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // c8.e
    public final com.bumptech.glide.h d() {
        return c8.i.f5829d;
    }

    @Override // c8.e
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a9 = (A) obj;
        a9.getClass();
        return kotlin.jvm.internal.h.a(this.f37316a, a9.f37316a) && kotlin.jvm.internal.h.a(this.f37317b, a9.f37317b);
    }

    @Override // c8.e
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // c8.e
    public final boolean g() {
        return false;
    }

    @Override // c8.e
    public final List getAnnotations() {
        return C5125p.f41221n;
    }

    @Override // c8.e
    public final List h(int i) {
        if (i >= 0) {
            return C5125p.f41221n;
        }
        throw new IllegalArgumentException(D.x.j(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f37317b.hashCode() + ((this.f37316a.hashCode() + 710441009) * 31);
    }

    @Override // c8.e
    public final c8.e i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(D.x.j(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i4 = i % 2;
        if (i4 == 0) {
            return this.f37316a;
        }
        if (i4 == 1) {
            return this.f37317b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // c8.e
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(D.x.j(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f37316a + ", " + this.f37317b + ')';
    }

    @Override // c8.e
    public final void b() {
    }
}
