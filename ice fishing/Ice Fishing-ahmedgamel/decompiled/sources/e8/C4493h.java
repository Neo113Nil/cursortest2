package e8;

/* renamed from: e8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4493h extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4493h f37374c = new C4493h(C4494i.f37375a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.h.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        C4492g builder = (C4492g) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        byte p9 = aVar.p(this.f37333b, i);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f37370a;
        int i4 = builder.f37371b;
        builder.f37371b = i4 + 1;
        bArr[i4] = p9;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.h.e(bArr, "<this>");
        C4492g c4492g = new C4492g();
        c4492g.f37370a = bArr;
        c4492g.f37371b = bArr.length;
        c4492g.b(10);
        return c4492g;
    }

    @Override // e8.M
    public final Object m() {
        return new byte[0];
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        byte[] content = (byte[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i4 = 0; i4 < i; i4++) {
            byte b9 = content[i4];
            L descriptor = this.f37333b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.c(b9);
        }
    }
}
