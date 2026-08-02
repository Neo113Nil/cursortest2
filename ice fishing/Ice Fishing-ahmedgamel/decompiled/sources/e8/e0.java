package e8;

/* loaded from: classes2.dex */
public final class e0 extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f37365c = new e0(f0.f37368a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        short[] collectionSize = ((u7.u) obj).f41072n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        d0 builder = (d0) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        short t6 = aVar.l(this.f37333b, i).t();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f37362a;
        int i4 = builder.f37363b;
        builder.f37363b = i4 + 1;
        sArr[i4] = t6;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        short[] toBuilder = ((u7.u) obj).f41072n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        d0 d0Var = new d0();
        d0Var.f37362a = toBuilder;
        d0Var.f37363b = toBuilder.length;
        d0Var.b(10);
        return d0Var;
    }

    @Override // e8.M
    public final Object m() {
        return new u7.u(new short[0]);
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        short[] sArr = ((u7.u) obj).f41072n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i4 = 0; i4 < i; i4++) {
            encoder.i(this.f37333b, i4).n(sArr[i4]);
        }
    }
}
