package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public int f7889g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0 f7890h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f7891i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f7892j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, float f10, float f11, fc.d dVar) {
        super(2, dVar);
        this.f7890h = s0Var;
        this.f7891i = f10;
        this.f7892j = f11;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        return new r0(this.f7890h, this.f7891i, this.f7892j, dVar);
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f7889g;
        if (i10 == 0) {
            v6.a.W(obj);
            z0 z0Var = this.f7890h.J;
            long h10 = v6.a.h(this.f7891i, this.f7892j);
            this.f7889g = 1;
            Object a6 = androidx.compose.foundation.gestures.a.a(z0Var, h10, this);
            gc.a aVar = gc.a.f2559g;
            if (a6 == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
        }
        return ac.o.f277a;
    }
}
