package c0;

import a0.l;
import ac.o;
import hc.j;
import pc.k;
import x1.f1;
import yc.a0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1186g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f1187h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f1 f1188i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f1189j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f1190k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(f fVar, f1 f1Var, oc.a aVar, l lVar, fc.d dVar) {
        super(2, dVar);
        this.f1187h = fVar;
        this.f1188i = f1Var;
        this.f1189j = (k) aVar;
        this.f1190k = lVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [oc.a, pc.k] */
    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        e eVar = new e(this.f1187h, this.f1188i, this.f1189j, this.f1190k, dVar);
        eVar.f1186g = obj;
        return eVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [oc.a, pc.k] */
    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        v6.a.W(obj);
        y yVar = (y) this.f1186g;
        f1 f1Var = this.f1188i;
        ?? r22 = this.f1189j;
        f fVar = this.f1187h;
        a0.q(yVar, null, new c(fVar, f1Var, (oc.a) r22, (fc.d) null), 3);
        return a0.q(yVar, null, new d(fVar, this.f1190k, null, 0), 3);
    }
}
