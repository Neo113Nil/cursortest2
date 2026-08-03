package p6;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z extends r {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f5653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.google.android.gms.common.internal.a aVar, int i10) {
        super(aVar, i10, null);
        this.f5653g = aVar;
    }

    @Override // p6.r
    public final void a(m6.b bVar) {
        com.google.android.gms.common.internal.a aVar = this.f5653g;
        aVar.f1438n.a(bVar);
        aVar.f1428d = bVar.f4903h;
        aVar.f1429e = System.currentTimeMillis();
    }

    @Override // p6.r
    public final boolean b() {
        this.f5653g.f1438n.a(m6.b.f4901k);
        return true;
    }
}
