package e8;

/* renamed from: e8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4476h extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4476h f37298c = new C4476h(C4477i.f37299a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.h.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        C4475g builder = (C4475g) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        byte p9 = aVar.p(this.f37257b, i);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f37294a;
        int i6 = builder.f37295b;
        builder.f37295b = i6 + 1;
        bArr[i6] = p9;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.h.e(bArr, "<this>");
        C4475g c4475g = new C4475g();
        c4475g.f37294a = bArr;
        c4475g.f37295b = bArr.length;
        c4475g.b(10);
        return c4475g;
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
        for (int i6 = 0; i6 < i; i6++) {
            byte b9 = content[i6];
            L descriptor = this.f37257b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i6);
            encoder.c(b9);
        }
    }
}
