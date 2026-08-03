package androidx.lifecycle;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface v0 {
    default t0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default t0 b(Class cls, x3.c cVar) {
        return a(cls);
    }

    default t0 c(pc.e eVar, x3.c cVar) {
        Class a6 = eVar.a();
        pc.j.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return b(a6, cVar);
    }
}
