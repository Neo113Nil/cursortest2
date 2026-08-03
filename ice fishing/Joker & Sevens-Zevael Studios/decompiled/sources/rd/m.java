package rd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v.c f6162h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6163i;

    public /* synthetic */ m(v.c cVar, boolean z10, int i10) {
        this.f6161g = i10;
        this.f6162h = cVar;
        this.f6163i = z10;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        f1.e0 e0Var = (f1.e0) obj;
        switch (this.f6161g) {
            case 0:
                pc.j.e(e0Var, "$this$graphicsLayer");
                v.c cVar = this.f6162h;
                e0Var.g(((Number) cVar.d()).floatValue());
                e0Var.h(((Number) cVar.d()).floatValue());
                e0Var.a(this.f6163i ? 1.0f : 0.6f);
                break;
            default:
                pc.j.e(e0Var, "$this$graphicsLayer");
                v.c cVar2 = this.f6162h;
                e0Var.g(((Number) cVar2.d()).floatValue());
                e0Var.h(((Number) cVar2.d()).floatValue());
                e0Var.a(this.f6163i ? 1.0f : 0.5f);
                break;
        }
        return ac.o.f277a;
    }
}
