package fc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: g, reason: collision with root package name */
    public final h f2341g;

    public a(h hVar) {
        this.f2341g = hVar;
    }

    @Override // fc.i
    public final i d(i iVar) {
        return v6.a.K(this, iVar);
    }

    @Override // fc.i
    public i g(h hVar) {
        return v6.a.J(this, hVar);
    }

    @Override // fc.g
    public final h getKey() {
        return this.f2341g;
    }

    @Override // fc.i
    public final Object i(Object obj, oc.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // fc.i
    public g v(h hVar) {
        return v6.a.D(this, hVar);
    }
}
