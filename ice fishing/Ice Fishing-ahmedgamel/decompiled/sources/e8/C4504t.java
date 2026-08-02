package e8;

/* renamed from: e8.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4504t extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final C4504t f37397c = new C4504t(C4505u.f37398a);

    @Override // e8.AbstractC4486a
    public final int g(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.h.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // e8.AbstractC4498m, e8.AbstractC4486a
    public final void i(d8.a aVar, int i, Object obj) {
        C4503s builder = (C4503s) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        float q8 = aVar.q(this.f37333b, i);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f37395a;
        int i4 = builder.f37396b;
        builder.f37396b = i4 + 1;
        fArr[i4] = q8;
    }

    @Override // e8.AbstractC4486a
    public final Object j(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.h.e(fArr, "<this>");
        C4503s c4503s = new C4503s();
        c4503s.f37395a = fArr;
        c4503s.f37396b = fArr.length;
        c4503s.b(10);
        return c4503s;
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
        for (int i4 = 0; i4 < i; i4++) {
            float f2 = content[i4];
            L descriptor = this.f37333b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i4);
            encoder.g(f2);
        }
    }
}
