package e8;

import u7.C5092r;

/* loaded from: classes2.dex */
public final class b0 extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f37356c = new b0(c0.f37358a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        long[] collectionSize = ((C5092r) obj).f41069n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        a0 builder = (a0) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        long j6 = aVar.l(this.f37333b, i).j();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f37354a;
        int i4 = builder.f37355b;
        builder.f37355b = i4 + 1;
        jArr[i4] = j6;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        long[] toBuilder = ((C5092r) obj).f41069n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        a0 a0Var = new a0();
        a0Var.f37354a = toBuilder;
        a0Var.f37355b = toBuilder.length;
        a0Var.b(10);
        return a0Var;
    }

    @Override // e8.M
    public final Object m() {
        return new C5092r(new long[0]);
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        long[] jArr = ((C5092r) obj).f41069n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i4 = 0; i4 < i; i4++) {
            encoder.i(this.f37333b, i4).k(jArr[i4]);
        }
    }
}
