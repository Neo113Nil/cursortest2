package e8;

import u7.C5098p;

/* loaded from: classes2.dex */
public final class Y extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f37275c = new Y(Z.f37276a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        int[] collectionSize = ((C5098p) obj).f41347n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        X builder = (X) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        int e9 = aVar.l(this.f37257b, i).e();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f37273a;
        int i6 = builder.f37274b;
        builder.f37274b = i6 + 1;
        iArr[i6] = e9;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        int[] toBuilder = ((C5098p) obj).f41347n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        X x9 = new X();
        x9.f37273a = toBuilder;
        x9.f37274b = toBuilder.length;
        x9.b(10);
        return x9;
    }

    @Override // e8.M
    public final Object m() {
        return new C5098p(new int[0]);
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        int[] iArr = ((C5098p) obj).f41347n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i6 = 0; i6 < i; i6++) {
            encoder.i(this.f37257b, i6).j(iArr[i6]);
        }
    }
}
