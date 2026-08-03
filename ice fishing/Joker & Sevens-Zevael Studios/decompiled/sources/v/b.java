package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends hc.j implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f6772g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6773h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Object obj, fc.d dVar) {
        super(1, dVar);
        this.f6772g = cVar;
        this.f6773h = obj;
    }

    @Override // hc.a
    public final fc.d create(fc.d dVar) {
        return new b(this.f6772g, this.f6773h, dVar);
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        b bVar = (b) create((fc.d) obj);
        ac.o oVar = ac.o.f277a;
        bVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        v6.a.W(obj);
        c cVar = this.f6772g;
        c.b(cVar);
        Object a6 = c.a(cVar, this.f6773h);
        cVar.f6792c.f6857h.setValue(a6);
        cVar.f6794e.setValue(a6);
        return ac.o.f277a;
    }
}
