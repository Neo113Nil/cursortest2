package e8;

import b8.InterfaceC0537a;
import java.util.Arrays;
import java.util.List;
import u7.EnumC5080f;
import v7.AbstractC5119j;
import v7.C5125p;

/* renamed from: e8.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4506v implements c8.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f37400a;

    /* renamed from: b, reason: collision with root package name */
    public final C4507w f37401b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f37402c = {"[UNINITIALIZED]"};

    /* renamed from: d, reason: collision with root package name */
    public final List[] f37403d = new List[1];

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f37404e = new boolean[1];

    /* renamed from: f, reason: collision with root package name */
    public final Object f37405f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f37406g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f37407h;
    public final boolean i;

    public C4506v(String str, C4507w c4507w) {
        this.f37400a = str;
        this.f37401b = c4507w;
        EnumC5080f enumC5080f = EnumC5080f.f41049n;
        this.f37405f = N3.C.N(enumC5080f, new J(this, 1));
        this.f37406g = N3.C.N(enumC5080f, new J(this, 2));
        this.f37407h = N3.C.N(enumC5080f, new J(this, 0));
        this.i = true;
    }

    @Override // c8.e
    public final String a() {
        return this.f37400a;
    }

    @Override // c8.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        return -3;
    }

    @Override // c8.e
    public final com.bumptech.glide.h d() {
        return c8.i.f5827b;
    }

    @Override // c8.e
    public final int e() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, u7.e] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, u7.e] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4506v) {
            c8.e eVar = (c8.e) obj;
            if (this.f37400a.equals(eVar.a())) {
                C4506v c4506v = (C4506v) obj;
                if (c4506v.i && Arrays.equals((c8.e[]) this.f37406g.getValue(), (c8.e[]) c4506v.f37406g.getValue()) && 1 == eVar.e() && kotlin.jvm.internal.h.a(i(0).a(), eVar.i(0).a()) && kotlin.jvm.internal.h.a(i(0).d(), eVar.i(0).d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c8.e
    public final String f(int i) {
        return this.f37402c[i];
    }

    @Override // c8.e
    public final boolean g() {
        return this.i;
    }

    @Override // c8.e
    public final List getAnnotations() {
        return C5125p.f41221n;
    }

    @Override // c8.e
    public final List h(int i) {
        List list = this.f37403d[i];
        return list == null ? C5125p.f41221n : list;
    }

    public final int hashCode() {
        return k() * 31;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u7.e] */
    @Override // c8.e
    public final c8.e i(int i) {
        return ((InterfaceC0537a[]) this.f37405f.getValue())[i].c();
    }

    @Override // c8.e
    public final boolean j(int i) {
        return this.f37404e[i];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u7.e] */
    public final int k() {
        return ((Number) this.f37407h.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC5119j.C(S0.f.x(0, 1), ", ", this.f37400a.concat("("), ")", new J0.k(6, this), 24);
    }

    @Override // c8.e
    public final void b() {
    }
}
