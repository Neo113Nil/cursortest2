package v0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oc.e f7048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oc.c f7049b;

    public j(oc.e eVar, oc.c cVar) {
        this.f7048a = eVar;
        this.f7049b = cVar;
    }

    @Override // v0.i
    public final Object a(b bVar, Object obj) {
        return this.f7048a.invoke(bVar, obj);
    }

    @Override // v0.i
    public final Object b(Object obj) {
        return this.f7049b.invoke(obj);
    }
}
