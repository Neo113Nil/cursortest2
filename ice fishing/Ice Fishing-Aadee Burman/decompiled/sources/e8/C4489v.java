package e8;

import a.AbstractC0422a;
import b8.InterfaceC0529a;
import java.util.Arrays;
import java.util.List;
import u7.EnumC5088f;
import v7.AbstractC5129j;
import v7.C5135p;

/* renamed from: e8.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4489v implements c8.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f37324a;

    /* renamed from: b, reason: collision with root package name */
    public final C4490w f37325b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f37326c = {"[UNINITIALIZED]"};

    /* renamed from: d, reason: collision with root package name */
    public final List[] f37327d = new List[1];

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f37328e = new boolean[1];

    /* renamed from: f, reason: collision with root package name */
    public final Object f37329f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f37330g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f37331h;
    public final boolean i;

    public C4489v(String str, C4490w c4490w) {
        this.f37324a = str;
        this.f37325b = c4490w;
        EnumC5088f enumC5088f = EnumC5088f.f41326n;
        this.f37329f = AbstractC0422a.p(enumC5088f, new J(this, 1));
        this.f37330g = AbstractC0422a.p(enumC5088f, new J(this, 2));
        this.f37331h = AbstractC0422a.p(enumC5088f, new J(this, 0));
        this.i = true;
    }

    @Override // c8.e
    public final String a() {
        return this.f37324a;
    }

    @Override // c8.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        return -3;
    }

    @Override // c8.e
    public final t8.g d() {
        return c8.i.f5651b;
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
        if (obj instanceof C4489v) {
            c8.e eVar = (c8.e) obj;
            if (this.f37324a.equals(eVar.a())) {
                C4489v c4489v = (C4489v) obj;
                if (c4489v.i && Arrays.equals((c8.e[]) this.f37330g.getValue(), (c8.e[]) c4489v.f37330g.getValue()) && 1 == eVar.e() && kotlin.jvm.internal.h.a(i(0).a(), eVar.i(0).a()) && kotlin.jvm.internal.h.a(i(0).d(), eVar.i(0).d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c8.e
    public final String f(int i) {
        return this.f37326c[i];
    }

    @Override // c8.e
    public final boolean g() {
        return this.i;
    }

    @Override // c8.e
    public final List getAnnotations() {
        return C5135p.f41439n;
    }

    @Override // c8.e
    public final List h(int i) {
        List list = this.f37327d[i];
        return list == null ? C5135p.f41439n : list;
    }

    public final int hashCode() {
        return k() * 31;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u7.e] */
    @Override // c8.e
    public final c8.e i(int i) {
        return ((InterfaceC0529a[]) this.f37329f.getValue())[i].c();
    }

    @Override // c8.e
    public final boolean j(int i) {
        return this.f37328e[i];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u7.e] */
    public final int k() {
        return ((Number) this.f37331h.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC5129j.E(V2.a.x(0, 1), ", ", this.f37324a.concat("("), ")", new J0.l(6, this), 24);
    }

    @Override // c8.e
    public final void b() {
    }
}
