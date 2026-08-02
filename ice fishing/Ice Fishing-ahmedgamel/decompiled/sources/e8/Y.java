package e8;

import u7.C5090p;

/* loaded from: classes2.dex */
public final class Y extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f37351c = new Y(Z.f37352a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        int[] collectionSize = ((C5090p) obj).f41067n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        X builder = (X) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        int e9 = aVar.l(this.f37333b, i).e();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f37349a;
        int i4 = builder.f37350b;
        builder.f37350b = i4 + 1;
        iArr[i4] = e9;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        int[] toBuilder = ((C5090p) obj).f41067n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        X x9 = new X();
        x9.f37349a = toBuilder;
        x9.f37350b = toBuilder.length;
        x9.b(10);
        return x9;
    }

    @Override // e8.M
    public final Object m() {
        return new C5090p(new int[0]);
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        int[] iArr = ((C5090p) obj).f41067n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i4 = 0; i4 < i; i4++) {
            encoder.i(this.f37333b, i4).j(iArr[i4]);
        }
    }
}
