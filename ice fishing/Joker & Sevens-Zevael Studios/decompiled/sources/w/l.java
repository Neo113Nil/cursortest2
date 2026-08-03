package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1.c f7454g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pc.s f7455h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7456i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f1.l f7457j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e1.c cVar, pc.s sVar, long j3, f1.l lVar) {
        super(1);
        this.f7454g = cVar;
        this.f7455h = sVar;
        this.f7456i = j3;
        this.f7457j = lVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        x1.i0 i0Var = (x1.i0) obj;
        i0Var.a();
        e1.c cVar = this.f7454g;
        float f10 = cVar.f1931a;
        float f11 = cVar.f1932b;
        pc.s sVar = this.f7455h;
        long j3 = this.f7456i;
        f1.l lVar = this.f7457j;
        h1.b bVar = i0Var.f8081g;
        ((f8.c) bVar.f2596h.f262h).u(f10, f11);
        try {
            h1.d.V(i0Var, (f1.g) sVar.f5683g, j3, 0L, 0.0f, lVar, 0, 890);
            ((f8.c) bVar.f2596h.f262h).u(-f10, -f11);
            return ac.o.f277a;
        } catch (Throwable th) {
            ((f8.c) bVar.f2596h.f262h).u(-f10, -f11);
            throw th;
        }
    }
}
