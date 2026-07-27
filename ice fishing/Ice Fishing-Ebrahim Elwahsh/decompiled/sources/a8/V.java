package a8;

import q7.C4945n;

/* loaded from: classes2.dex */
public final class V extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final V f4455c = new V(W.f4456a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        byte[] collectionSize = ((C4945n) obj).f40175n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        U builder = (U) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        byte u7 = aVar.r(this.f4442b, i).u();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f4453a;
        int i4 = builder.f4454b;
        builder.f4454b = i4 + 1;
        bArr[i4] = u7;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        byte[] toBuilder = ((C4945n) obj).f40175n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        U u7 = new U();
        u7.f4453a = toBuilder;
        u7.f4454b = toBuilder.length;
        u7.b(10);
        return u7;
    }

    @Override // a8.M
    public final Object m() {
        return new C4945n(new byte[0]);
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        byte[] bArr = ((C4945n) obj).f40175n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i4 = 0; i4 < i; i4++) {
            encoder.i(this.f4442b, i4).c(bArr[i4]);
        }
    }
}
