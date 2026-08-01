package e8;

import java.util.List;
import v7.C5135p;

/* loaded from: classes2.dex */
public final class A implements c8.e {

    /* renamed from: a, reason: collision with root package name */
    public final c8.e f37240a;

    /* renamed from: b, reason: collision with root package name */
    public final c8.e f37241b;

    public A(c8.e keyDesc, c8.e valueDesc) {
        kotlin.jvm.internal.h.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.h.e(valueDesc, "valueDesc");
        this.f37240a = keyDesc;
        this.f37241b = valueDesc;
    }

    @Override // c8.e
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // c8.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        Integer S8 = Q7.q.S(name);
        if (S8 != null) {
            return S8.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // c8.e
    public final t8.g d() {
        return c8.i.f5653d;
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
        return kotlin.jvm.internal.h.a(this.f37240a, a9.f37240a) && kotlin.jvm.internal.h.a(this.f37241b, a9.f37241b);
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
        return C5135p.f41442n;
    }

    @Override // c8.e
    public final List h(int i) {
        if (i >= 0) {
            return C5135p.f41442n;
        }
        throw new IllegalArgumentException(D.y.k(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f37241b.hashCode() + ((this.f37240a.hashCode() + 710441009) * 31);
    }

    @Override // c8.e
    public final c8.e i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(D.y.k(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i6 = i % 2;
        if (i6 == 0) {
            return this.f37240a;
        }
        if (i6 == 1) {
            return this.f37241b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // c8.e
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(D.y.k(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f37240a + ", " + this.f37241b + ')';
    }

    @Override // c8.e
    public final void b() {
    }
}
