package e8;

import u7.C5088n;

/* loaded from: classes2.dex */
public final class V extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final V f37346c = new V(W.f37347a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        byte[] collectionSize = ((C5088n) obj).f41065n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        U builder = (U) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        byte r9 = aVar.l(this.f37333b, i).r();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f37344a;
        int i4 = builder.f37345b;
        builder.f37345b = i4 + 1;
        bArr[i4] = r9;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        byte[] toBuilder = ((C5088n) obj).f41065n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        U u6 = new U();
        u6.f37344a = toBuilder;
        u6.f37345b = toBuilder.length;
        u6.b(10);
        return u6;
    }

    @Override // e8.M
    public final Object m() {
        return new C5088n(new byte[0]);
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        byte[] bArr = ((C5088n) obj).f41065n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i4 = 0; i4 < i; i4++) {
            encoder.i(this.f37333b, i4).c(bArr[i4]);
        }
    }
}
