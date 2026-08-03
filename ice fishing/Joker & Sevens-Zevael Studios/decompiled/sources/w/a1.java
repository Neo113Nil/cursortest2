package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a1 extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7368g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b1 f7369h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(b1 b1Var, int i10) {
        super(0);
        this.f7368g = i10;
        this.f7369h = b1Var;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f7368g) {
            case 0:
                return Boolean.valueOf(this.f7369h.f7382a.g() > 0);
            default:
                b1 b1Var = this.f7369h;
                return Boolean.valueOf(b1Var.f7382a.g() < b1Var.f7385d.g());
        }
    }
}
