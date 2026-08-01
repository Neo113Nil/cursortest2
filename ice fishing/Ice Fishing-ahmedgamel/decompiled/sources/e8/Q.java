package e8;

/* loaded from: classes2.dex */
public final class Q extends M {

    /* renamed from: c, reason: collision with root package name */
    public static final Q f37263c = new Q(S.f37264a);

    @Override // e8.AbstractC4469a
    public final int g(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.h.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // e8.AbstractC4481m, e8.AbstractC4469a
    public final void i(d8.a aVar, int i, Object obj) {
        P builder = (P) obj;
        kotlin.jvm.internal.h.e(builder, "builder");
        short o6 = aVar.o(this.f37257b, i);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f37261a;
        int i6 = builder.f37262b;
        builder.f37262b = i6 + 1;
        sArr[i6] = o6;
    }

    @Override // e8.AbstractC4469a
    public final Object j(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.h.e(sArr, "<this>");
        P p9 = new P();
        p9.f37261a = sArr;
        p9.f37262b = sArr.length;
        p9.b(10);
        return p9;
    }

    @Override // e8.M
    public final Object m() {
        return new short[0];
    }

    @Override // e8.M
    public final void n(g8.q encoder, Object obj, int i) {
        short[] content = (short[]) obj;
        kotlin.jvm.internal.h.e(encoder, "encoder");
        kotlin.jvm.internal.h.e(content, "content");
        for (int i6 = 0; i6 < i; i6++) {
            short s9 = content[i6];
            L descriptor = this.f37257b;
            kotlin.jvm.internal.h.e(descriptor, "descriptor");
            encoder.f(descriptor, i6);
            encoder.n(s9);
        }
    }
}
