package a8;

import q7.C4944m;

/* loaded from: classes2.dex */
public final class W implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final W f4456a = new W();

    /* renamed from: b, reason: collision with root package name */
    public static final C0454v f4457b = I.a("kotlin.UByte", C0442i.f4484a);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        rVar.h(f4457b).c(((C4944m) obj).f40174n);
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new C4944m(decoder.q(f4457b).u());
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4457b;
    }
}
