package e8;

import u7.C5096n;

/* loaded from: classes2.dex */
public final class V extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final V f37270c = new V(W.f37271a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        byte[] collectionSize = ((C5096n) obj).f41345n;
        kotlin.jvm.internal.h.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        U builder = (U) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        byte r9 = aVar.l(this.f37257b, i).r();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f37268a;
        int i6 = builder.f37269b;
        builder.f37269b = i6 + 1;
        bArr[i6] = r9;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        byte[] toBuilder = ((C5096n) obj).f41345n;
        kotlin.jvm.internal.h.e(toBuilder, "$this$toBuilder");
        U u3 = new U();
        u3.f37268a = toBuilder;
        u3.f37269b = toBuilder.length;
        u3.b(10);
        return u3;
    }

    @Override // e8.M
    public final Object m() {
        return new C5096n(new byte[0]);
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        byte[] bArr = ((C5096n) obj).f41345n;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        for (int i6 = 0; i6 < i; i6++) {
            encoder.i(this.f37257b, i6).c(bArr[i6]);
        }
    }
}
