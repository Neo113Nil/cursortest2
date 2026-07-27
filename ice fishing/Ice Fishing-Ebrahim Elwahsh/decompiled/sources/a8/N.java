package a8;

import java.util.List;
import r7.C4985p;

/* loaded from: classes2.dex */
public final class N implements Y7.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f4443a;

    /* renamed from: b, reason: collision with root package name */
    public final Y7.d f4444b;

    public N(String str, Y7.d kind) {
        kotlin.jvm.internal.h.e(kind, "kind");
        this.f4443a = str;
        this.f4444b = kind;
    }

    @Override // Y7.e
    public final String a() {
        return this.f4443a;
    }

    @Override // Y7.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // Y7.e
    public final com.bumptech.glide.e d() {
        return this.f4444b;
    }

    @Override // Y7.e
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
        if (kotlin.jvm.internal.h.a(this.f4443a, n9.f4443a)) {
            if (kotlin.jvm.internal.h.a(this.f4444b, n9.f4444b)) {
                return true;
            }
        }
        return false;
    }

    @Override // Y7.e
    public final String f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // Y7.e
    public final boolean g() {
        return false;
    }

    @Override // Y7.e
    public final List getAnnotations() {
        return C4985p.f40358n;
    }

    @Override // Y7.e
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f4444b.hashCode() * 31) + this.f4443a.hashCode();
    }

    @Override // Y7.e
    public final Y7.e i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // Y7.e
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f4443a + ')';
    }

    @Override // Y7.e
    public final void b() {
    }
}
