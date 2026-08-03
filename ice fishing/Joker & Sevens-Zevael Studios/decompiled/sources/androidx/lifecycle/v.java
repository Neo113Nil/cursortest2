package androidx.lifecycle;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public p f719a;

    /* renamed from: b, reason: collision with root package name */
    public s f720b;

    public final void a(u uVar, o oVar) {
        p a6 = oVar.a();
        p pVar = this.f719a;
        pc.j.e(pVar, "state1");
        if (a6.compareTo(pVar) < 0) {
            pVar = a6;
        }
        this.f719a = pVar;
        this.f720b.b(uVar, oVar);
        this.f719a = a6;
    }
}
