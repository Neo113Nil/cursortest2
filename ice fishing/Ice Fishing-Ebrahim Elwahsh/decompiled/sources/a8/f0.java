package a8;

/* loaded from: classes2.dex */
public final class f0 implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f4477a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0454v f4478b = I.a("kotlin.UShort", S.f4449a);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        rVar.h(f4478b).n(((q7.t) obj).f40181n);
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new q7.t(decoder.q(f4478b).v());
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4478b;
    }
}
