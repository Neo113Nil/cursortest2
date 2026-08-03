package i0;

import yc.a0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2959g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2960h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f2961i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, fc.d dVar, int i10) {
        super(2, dVar);
        this.f2959g = i10;
        this.f2961i = jVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f2959g) {
            case 0:
                i iVar = new i(this.f2961i, dVar, 0);
                iVar.f2960h = obj;
                return iVar;
            default:
                i iVar2 = new i(this.f2961i, dVar, 1);
                iVar2.f2960h = obj;
                return iVar2;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f2959g) {
        }
        return ((i) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2959g) {
            case 0:
                v6.a.W(obj);
                y yVar = (y) this.f2960h;
                j jVar = this.f2961i;
                fc.d dVar = null;
                a0.q(yVar, null, new h(jVar, dVar, 0), 3);
                a0.q(yVar, null, new h(jVar, dVar, 1), 3);
                return a0.q(yVar, null, new h(jVar, dVar, 2), 3);
            default:
                v6.a.W(obj);
                return a0.q((y) this.f2960h, null, new h(this.f2961i, null, 3), 3);
        }
    }
}
