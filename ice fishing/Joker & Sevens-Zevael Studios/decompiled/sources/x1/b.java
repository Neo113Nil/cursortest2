package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f7976h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(0);
        this.f7975g = i10;
        this.f7976h = cVar;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f7975g) {
            case 0:
                this.f7976h.t0();
                break;
            default:
                c cVar = this.f7976h;
                y0.l lVar = cVar.f7977u;
                pc.j.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                z.x xVar = (z.x) lVar;
                xVar.getClass();
                z.o0 o0Var = (z.o0) cVar.f(z.r0.f9028a);
                z.o0 o0Var2 = xVar.f9039a;
                xVar.f9040b.setValue(new z.t(o0Var2, o0Var));
                xVar.f9041c.setValue(new z.l0(o0Var, o0Var2));
                break;
        }
        return ac.o.f277a;
    }
}
