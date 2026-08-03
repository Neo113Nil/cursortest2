package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements d1.j {

    /* renamed from: a, reason: collision with root package name */
    public static final g f8039a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f8040b;

    @Override // d1.j
    public final boolean a() {
        Boolean bool = f8040b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw a4.d.e("canFocus is read before it is written");
    }

    @Override // d1.j
    public final void b(boolean z10) {
        f8040b = Boolean.valueOf(z10);
    }
}
