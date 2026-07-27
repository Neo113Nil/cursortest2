package a8;

/* renamed from: a8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0441h extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C0441h f4483c = new C0441h(C0442i.f4484a);

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.h.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // a8.AbstractC0446m, a8.AbstractC0434a
    public final void i(Z7.a aVar, int i, Object obj) {
        C0440g builder = (C0440g) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        byte b9 = aVar.b(this.f4442b, i);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f4479a;
        int i4 = builder.f4480b;
        builder.f4480b = i4 + 1;
        bArr[i4] = b9;
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.h.e(bArr, "<this>");
        C0440g c0440g = new C0440g();
        c0440g.f4479a = bArr;
        c0440g.f4480b = bArr.length;
        c0440g.b(10);
        return c0440g;
    }

    @Override // a8.M
    public final Object m() {
        return new byte[0];
    }

    @Override // a8.M
    public final void n(c8.r encoder, Object obj, int i) {
        byte[] content = (byte[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            byte b9 = content[i4];
            L descriptor = this.f4442b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.c(b9);
        }
    }
}
