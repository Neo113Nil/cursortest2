package e8;

import java.util.List;
import v7.C5135p;

/* loaded from: classes2.dex */
public final class N implements c8.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f37258a;

    /* renamed from: b, reason: collision with root package name */
    public final c8.d f37259b;

    public N(String str, c8.d kind) {
        kotlin.jvm.internal.h.e(kind, "kind");
        this.f37258a = str;
        this.f37259b = kind;
    }

    @Override // c8.e
    public final String a() {
        return this.f37258a;
    }

    @Override // c8.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // c8.e
    public final t8.g d() {
        return this.f37259b;
    }

    @Override // c8.e
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n9 = (N) obj;
        if (kotlin.jvm.internal.h.a(this.f37258a, n9.f37258a)) {
            if (kotlin.jvm.internal.h.a(this.f37259b, n9.f37259b)) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.e
    public final String f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
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
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f37259b.hashCode() * 31) + this.f37258a.hashCode();
    }

    @Override // c8.e
    public final c8.e i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // c8.e
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f37258a + ')';
    }

    @Override // c8.e
    public final void b() {
    }
}
