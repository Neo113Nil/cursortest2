package a8;

import q7.C4947p;

/* loaded from: classes2.dex */
public final class Y extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f4460c = new Y(Z.f4461a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        int[] collectionSize = ((C4947p) obj).f40177n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        X builder = (X) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        int h9 = aVar.r(this.f4442b, i).h();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f4458a;
        int i4 = builder.f4459b;
        builder.f4459b = i4 + 1;
        iArr[i4] = h9;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        int[] toBuilder = ((C4947p) obj).f40177n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        X x3 = new X();
        x3.f4458a = toBuilder;
        x3.f4459b = toBuilder.length;
        x3.b(10);
        return x3;
    }

    @Override // a8.M
    public final Object m() {
        return new C4947p(new int[0]);
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        int[] iArr = ((C4947p) obj).f40177n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i4 = 0; i4 < i; i4++) {
            encoder.i(this.f4442b, i4).j(iArr[i4]);
        }
    }
}
