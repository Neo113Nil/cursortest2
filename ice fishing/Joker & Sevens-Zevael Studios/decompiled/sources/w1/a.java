package w1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends u5.d {

    /* renamed from: a, reason: collision with root package name */
    public e f7632a;

    @Override // u5.d
    public final boolean e(g gVar) {
        return gVar == this.f7632a.getKey();
    }

    @Override // u5.d
    public final Object f(g gVar) {
        if (gVar != this.f7632a.getKey()) {
            u1.a.b("Check failed.");
        }
        return this.f7632a.getValue();
    }
}
