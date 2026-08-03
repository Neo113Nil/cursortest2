package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7870g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7871h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7872i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(long j3, fc.d dVar, int i10) {
        super(2, dVar);
        this.f7870g = i10;
        this.f7872i = j3;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f7870g) {
            case 0:
                q0 q0Var = new q0(this.f7872i, dVar, 0);
                q0Var.f7871h = obj;
                return q0Var;
            default:
                q0 q0Var2 = new q0(this.f7872i, dVar, 1);
                q0Var2.f7871h = obj;
                return q0Var2;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f7870g) {
            case 0:
                q0 q0Var = (q0) create(x0Var, dVar);
                ac.o oVar = ac.o.f277a;
                q0Var.invokeSuspend(oVar);
                return oVar;
            default:
                q0 q0Var2 = (q0) create(x0Var, dVar);
                ac.o oVar2 = ac.o.f277a;
                q0Var2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7870g) {
            case 0:
                v6.a.W(obj);
                z0 z0Var = ((x0) this.f7871h).f7935a;
                z0.a(z0Var, z0Var.f7958h, this.f7872i, 1);
                break;
            default:
                v6.a.W(obj);
                z0 z0Var2 = ((x0) this.f7871h).f7935a;
                z0.a(z0Var2, z0Var2.f7958h, this.f7872i, 1);
                break;
        }
        return ac.o.f277a;
    }
}
