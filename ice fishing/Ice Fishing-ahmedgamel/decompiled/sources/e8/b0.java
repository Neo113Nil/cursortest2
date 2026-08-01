package e8;

import u7.C5100r;

/* loaded from: classes2.dex */
public final class b0 extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f37280c = new b0(c0.f37282a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        long[] collectionSize = ((C5100r) obj).f41349n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        a0 builder = (a0) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        long j6 = aVar.l(this.f37257b, i).j();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f37278a;
        int i6 = builder.f37279b;
        builder.f37279b = i6 + 1;
        jArr[i6] = j6;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        long[] toBuilder = ((C5100r) obj).f41349n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        a0 a0Var = new a0();
        a0Var.f37278a = toBuilder;
        a0Var.f37279b = toBuilder.length;
        a0Var.b(10);
        return a0Var;
    }

    @Override // e8.M
    public final Object m() {
        return new C5100r(new long[0]);
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        long[] jArr = ((C5100r) obj).f41349n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i6 = 0; i6 < i; i6++) {
            encoder.i(this.f37257b, i6).k(jArr[i6]);
        }
    }
}
