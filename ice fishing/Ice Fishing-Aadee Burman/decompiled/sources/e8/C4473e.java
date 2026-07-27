package e8;

/* renamed from: e8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4473e extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4473e f37288c = new C4473e(C4474f.f37290a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.h.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        C4472d builder = (C4472d) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        boolean n9 = aVar.n(this.f37257b, i);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f37284a;
        int i6 = builder.f37285b;
        builder.f37285b = i6 + 1;
        zArr[i6] = n9;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.h.e(zArr, "<this>");
        C4472d c4472d = new C4472d();
        c4472d.f37284a = zArr;
        c4472d.f37285b = zArr.length;
        c4472d.b(10);
        return c4472d;
    }

    @Override // e8.M
    public final Object m() {
        return new boolean[0];
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        boolean[] content = (boolean[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i6 = 0; i6 < i; i6++) {
            boolean z3 = content[i6];
            L descriptor = this.f37257b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i6);
            encoder.b(z3);
        }
    }
}
