package a8;

import q7.C4948q;

/* loaded from: classes2.dex */
public final class c0 implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f4467a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final C0454v f4468b = I.a("kotlin.ULong", F.f4432a);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        rVar.h(f4468b).k(((C4948q) obj).f40178n);
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        return new C4948q(decoder.q(f4468b).m());
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4468b;
    }
}
