package p6;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e7.a f5547a;

    public c(e7.a aVar) {
        this.f5547a = aVar;
    }

    @Override // p6.b
    public final void a(m6.b bVar) {
        boolean b2 = bVar.b();
        e7.a aVar = this.f5547a;
        if (b2) {
            aVar.k(null, aVar.B);
            return;
        }
        m7.g gVar = aVar.f1444t;
        if (gVar != null) {
            ((n6.g) gVar.f4957h).onConnectionFailed(bVar);
        }
    }
}
