package i0;

import m0.z;
import v.c1;
import v.e1;
import yc.a0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2998g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f2999h;

    /* renamed from: i, reason: collision with root package name */
    public int f3000i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f3001j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3002k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0.u uVar, float f10, v.h hVar, fc.d dVar) {
        super(2, dVar);
        this.f3001j = uVar;
        this.f2999h = f10;
        this.f3002k = hVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f2998g) {
            case 0:
                return new u((a0.u) this.f3001j, this.f2999h, (v.h) this.f3002k, dVar);
            default:
                u uVar = new u((e1) this.f3002k, dVar);
                uVar.f3001j = obj;
                return uVar;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f2998g) {
        }
        return ((u) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        float g8;
        y yVar;
        switch (this.f2998g) {
            case 0:
                int i10 = this.f3000i;
                if (i10 == 0) {
                    v6.a.W(obj);
                    v.c cVar = (v.c) ((a0.u) this.f3001j).f137c;
                    Float f10 = new Float(this.f2999h);
                    v.h hVar = (v.h) this.f3002k;
                    this.f3000i = 1;
                    Object c3 = v.c.c(cVar, f10, hVar, null, this, 12);
                    gc.a aVar = gc.a.f2559g;
                    if (c3 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            default:
                int i11 = this.f3000i;
                if (i11 == 0) {
                    v6.a.W(obj);
                    y yVar2 = (y) this.f3001j;
                    g8 = v.d.g(yVar2.f());
                    yVar = yVar2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8 = this.f2999h;
                    yVar = (y) this.f3001j;
                    v6.a.W(obj);
                }
                while (a0.p(yVar)) {
                    c1 c1Var = new c1((e1) this.f3002k, g8);
                    this.f3001j = yVar;
                    this.f2999h = g8;
                    this.f3000i = 1;
                    Object l10 = z.p(getContext()).l(c1Var, this);
                    gc.a aVar2 = gc.a.f2559g;
                    if (l10 == aVar2) {
                        return aVar2;
                    }
                }
                return ac.o.f277a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(e1 e1Var, fc.d dVar) {
        super(2, dVar);
        this.f3002k = e1Var;
    }
}
