package nd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends c5.b {

    /* renamed from: b, reason: collision with root package name */
    public final String f5097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f5098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, String str, k2.e eVar) {
        super(eVar);
        this.f5098c = kVar;
        this.f5097b = str;
    }

    @Override // c5.b
    public final f5.d a(oc.c cVar) {
        return ((g5.j) this.f5098c.f1234a).d(220990786, "SELECT * FROM power_ups WHERE id = ?", cVar, 1, new k2.e(8, this));
    }

    public final String toString() {
        return "GameDatabase.sq:getPowerUpById";
    }
}
