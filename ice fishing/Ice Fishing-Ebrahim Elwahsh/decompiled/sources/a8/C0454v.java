package a8;

import a.AbstractC0415a;
import java.util.Arrays;
import java.util.List;
import q7.EnumC4937f;
import r7.AbstractC4979j;
import r7.C4985p;

/* renamed from: a8.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0454v implements Y7.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f4509a;

    /* renamed from: b, reason: collision with root package name */
    public final C0455w f4510b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f4511c = {"[UNINITIALIZED]"};

    /* renamed from: d, reason: collision with root package name */
    public final List[] f4512d = new List[1];

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f4513e = new boolean[1];

    /* renamed from: f, reason: collision with root package name */
    public final Object f4514f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4515g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4516h;
    public final boolean i;

    public C0454v(String str, C0455w c0455w) {
        this.f4509a = str;
        this.f4510b = c0455w;
        EnumC4937f enumC4937f = EnumC4937f.f40159n;
        this.f4514f = com.bumptech.glide.e.p(enumC4937f, new J(this, 1));
        this.f4515g = com.bumptech.glide.e.p(enumC4937f, new J(this, 2));
        this.f4516h = com.bumptech.glide.e.p(enumC4937f, new J(this, 0));
        this.i = true;
    }

    @Override // Y7.e
    public final String a() {
        return this.f4509a;
    }

    @Override // Y7.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        return -3;
    }

    @Override // Y7.e
    public final com.bumptech.glide.e d() {
        return Y7.i.f4056g;
    }

    @Override // Y7.e
    public final int e() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, q7.e] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, q7.e] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0454v) {
            Y7.e eVar = (Y7.e) obj;
            if (this.f4509a.equals(eVar.a())) {
                C0454v c0454v = (C0454v) obj;
                if (c0454v.i && Arrays.equals((Y7.e[]) this.f4515g.getValue(), (Y7.e[]) c0454v.f4515g.getValue()) && 1 == eVar.e() && kotlin.jvm.internal.h.a(i(0).a(), eVar.i(0).a()) && kotlin.jvm.internal.h.a(i(0).d(), eVar.i(0).d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Y7.e
    public final String f(int i) {
        return this.f4511c[i];
    }

    @Override // Y7.e
    public final boolean g() {
        return this.i;
    }

    @Override // Y7.e
    public final List getAnnotations() {
        return C4985p.f40358n;
    }

    @Override // Y7.e
    public final List h(int i) {
        List list = this.f4512d[i];
        return list == null ? C4985p.f40358n : list;
    }

    public final int hashCode() {
        return k() * 31;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q7.e] */
    @Override // Y7.e
    public final Y7.e i(int i) {
        return ((X7.a[]) this.f4514f.getValue())[i].c();
    }

    @Override // Y7.e
    public final boolean j(int i) {
        return this.f4513e[i];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q7.e] */
    public final int k() {
        return ((Number) this.f4516h.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC4979j.K(AbstractC0415a.E(0, 1), ", ", this.f4509a.concat("("), ")", new J0.l(6, this), 24);
    }

    @Override // Y7.e
    public final void b() {
    }
}
