package e8;

/* loaded from: classes2.dex */
public final class e0 extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f37289c = new e0(f0.f37292a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        short[] collectionSize = ((u7.u) obj).f41349n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        d0 builder = (d0) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        short t6 = aVar.l(this.f37257b, i).t();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f37286a;
        int i6 = builder.f37287b;
        builder.f37287b = i6 + 1;
        sArr[i6] = t6;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        short[] toBuilder = ((u7.u) obj).f41349n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        d0 d0Var = new d0();
        d0Var.f37286a = toBuilder;
        d0Var.f37287b = toBuilder.length;
        d0Var.b(10);
        return d0Var;
    }

    @Override // e8.M
    public final Object m() {
        return new u7.u(new short[0]);
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        short[] sArr = ((u7.u) obj).f41349n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i6 = 0; i6 < i; i6++) {
            encoder.i(this.f37257b, i6).n(sArr[i6]);
        }
    }
}
