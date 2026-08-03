package x;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public int f7898g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s0 f7900i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r1.r f7901j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v f7902k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0.l0 f7903l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f7904m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f7905n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a1.f f7906o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s0 s0Var, r1.r rVar, v vVar, b0.l0 l0Var, u uVar, u uVar2, a1.f fVar, fc.d dVar) {
        super(2, dVar);
        this.f7900i = s0Var;
        this.f7901j = rVar;
        this.f7902k = vVar;
        this.f7903l = l0Var;
        this.f7904m = uVar;
        this.f7905n = uVar2;
        this.f7906o = fVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        t tVar = new t(this.f7900i, this.f7901j, this.f7902k, this.f7903l, this.f7904m, this.f7905n, this.f7906o, dVar);
        tVar.f7899h = obj;
        return tVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        yc.y yVar;
        Object c3;
        gc.a aVar;
        int i10 = this.f7898g;
        ac.o oVar = ac.o.f277a;
        s0 s0Var = this.f7900i;
        if (i10 == 0) {
            v6.a.W(obj);
            yc.y yVar2 = (yc.y) this.f7899h;
            try {
                e0 e0Var = s0Var.f7894w;
                r1.r rVar = this.f7901j;
                v vVar = this.f7902k;
                b0.l0 l0Var = this.f7903l;
                u uVar = this.f7904m;
                u uVar2 = this.f7905n;
                a1.f fVar = this.f7906o;
                this.f7899h = yVar2;
                this.f7898g = 1;
                float f10 = s.f7893a;
                c3 = u.l0.c(rVar, new r(uVar2, e0Var, vVar, fVar, uVar, l0Var, null), this);
                aVar = gc.a.f2559g;
                if (c3 != aVar) {
                    c3 = oVar;
                }
            } catch (CancellationException e10) {
                e = e10;
                yVar = yVar2;
            }
            return c3 == aVar ? aVar : oVar;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yVar = (yc.y) this.f7899h;
        try {
            v6.a.W(obj);
            return oVar;
        } catch (CancellationException e11) {
            e = e11;
        }
        CancellationException cancellationException = e;
        ad.e eVar = s0Var.A;
        if (eVar != null) {
            eVar.s(m.f7845a);
        }
        if (!yc.a0.p(yVar)) {
            throw cancellationException;
        }
    }
}
