package e8;

/* renamed from: e8.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4487t extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4487t f37321c = new C4487t(C4488u.f37322a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.h.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        C4486s builder = (C4486s) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        float q8 = aVar.q(this.f37257b, i);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f37319a;
        int i6 = builder.f37320b;
        builder.f37320b = i6 + 1;
        fArr[i6] = q8;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.h.e(fArr, "<this>");
        C4486s c4486s = new C4486s();
        c4486s.f37319a = fArr;
        c4486s.f37320b = fArr.length;
        c4486s.b(10);
        return c4486s;
    }

    @Override // e8.M
    public final Object m() {
        return new float[0];
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        float[] content = (float[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i6 = 0; i6 < i; i6++) {
            float f3 = content[i6];
            L descriptor = this.f37257b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i6);
            encoder.g(f3);
        }
    }
}
