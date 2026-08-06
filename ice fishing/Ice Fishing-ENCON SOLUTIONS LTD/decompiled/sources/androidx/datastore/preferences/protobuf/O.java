package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class O implements W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0122w f2340a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f2341b;

    /* renamed from: c, reason: collision with root package name */
    public final C0116p f2342c;

    public O(e0 e0Var, C0116p c0116p, AbstractC0122w abstractC0122w) {
        this.f2341b = e0Var;
        c0116p.getClass();
        this.f2342c = c0116p;
        this.f2340a = abstractC0122w;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean a(Object obj) {
        this.f2342c.getClass();
        C1.a.n(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, C0111k c0111k, C0115o c0115o) {
        this.f2341b.getClass();
        e0.a(obj);
        this.f2342c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(Object obj, Object obj2) {
        X.A(this.f2341b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj, F f2) {
        this.f2342c.getClass();
        C1.a.n(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int e(AbstractC0122w abstractC0122w) {
        this.f2341b.getClass();
        return abstractC0122w.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int f(AbstractC0122w abstractC0122w) {
        this.f2341b.getClass();
        d0 d0Var = abstractC0122w.unknownFields;
        int i2 = d0Var.f2382d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < d0Var.f2379a; i4++) {
            int i5 = d0Var.f2380b[i4] >>> 3;
            i3 += C0113m.Q(3, (C0107g) d0Var.f2381c[i4]) + C0113m.g0(2, i5) + (C0113m.f0(1) * 2);
        }
        d0Var.f2382d = i3;
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0122w g() {
        AbstractC0122w abstractC0122w = this.f2340a;
        return abstractC0122w != null ? abstractC0122w.k() : ((AbstractC0120u) abstractC0122w.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void h(Object obj) {
        this.f2341b.getClass();
        e0.b(obj);
        this.f2342c.getClass();
        C1.a.n(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean i(AbstractC0122w abstractC0122w, Object obj) {
        this.f2341b.getClass();
        return abstractC0122w.unknownFields.equals(((AbstractC0122w) obj).unknownFields);
    }
}
