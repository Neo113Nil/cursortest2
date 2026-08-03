package pc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends n implements vc.c, oc.c {
    public l(String str, String str2) {
        super(1, e2.u.class, b.f5663g, str, str2);
    }

    @Override // pc.c
    public final vc.a a() {
        t.f5684a.getClass();
        return this;
    }

    public final void g() {
        if (this.f5678m) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        vc.a f10 = f();
        if (f10 == this) {
            throw new nc.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((l) ((vc.c) f10)).g();
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        g();
        throw null;
    }
}
