package e8;

/* renamed from: e8.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4492y extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4492y f37336c = new C4492y(C4493z.f37337a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.h.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        C4491x builder = (C4491x) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        int f3 = aVar.f(this.f37257b, i);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f37334a;
        int i6 = builder.f37335b;
        builder.f37335b = i6 + 1;
        iArr[i6] = f3;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.h.e(iArr, "<this>");
        C4491x c4491x = new C4491x();
        c4491x.f37334a = iArr;
        c4491x.f37335b = iArr.length;
        c4491x.b(10);
        return c4491x;
    }

    @Override // e8.M
    public final Object m() {
        return new int[0];
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        int[] content = (int[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i6 = 0; i6 < i; i6++) {
            int i9 = content[i6];
            L descriptor = this.f37257b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i6);
            encoder.j(i9);
        }
    }
}
