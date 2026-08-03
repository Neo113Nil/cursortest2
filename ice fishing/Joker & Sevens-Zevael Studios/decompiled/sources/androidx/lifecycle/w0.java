package androidx.lifecycle;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class w0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public static w0 f730a;

    @Override // androidx.lifecycle.v0
    public t0 a(Class cls) {
        return u2.b.j(cls);
    }

    @Override // androidx.lifecycle.v0
    public t0 b(Class cls, x3.c cVar) {
        return a(cls);
    }

    @Override // androidx.lifecycle.v0
    public final t0 c(pc.e eVar, x3.c cVar) {
        Class a6 = eVar.a();
        pc.j.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return b(a6, cVar);
    }
}
