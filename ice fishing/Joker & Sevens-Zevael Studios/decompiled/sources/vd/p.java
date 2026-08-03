package vd;

import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7354g;

    /* renamed from: h, reason: collision with root package name */
    public int f7355h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f7356i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, fc.d dVar, int i10) {
        super(2, dVar);
        this.f7354g = i10;
        this.f7356i = qVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f7354g) {
            case 0:
                return new p(this.f7356i, dVar, 0);
            default:
                return new p(this.f7356i, dVar, 1);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f7354g) {
        }
        return ((p) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7354g) {
            case 0:
                int i10 = this.f7355h;
                if (i10 == 0) {
                    v6.a.W(obj);
                    q qVar = this.f7356i;
                    f8.c e10 = qVar.f7357b.e();
                    o oVar = new o(qVar, 0);
                    this.f7355h = 1;
                    Object c3 = e10.c(oVar, this);
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
                int i11 = this.f7355h;
                if (i11 == 0) {
                    v6.a.W(obj);
                    q qVar2 = this.f7356i;
                    f8.c f10 = qVar2.f7357b.f();
                    o oVar2 = new o(qVar2, 1);
                    this.f7355h = 1;
                    Object c7 = f10.c(oVar2, this);
                    gc.a aVar2 = gc.a.f2559g;
                    if (c7 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
        }
    }
}
