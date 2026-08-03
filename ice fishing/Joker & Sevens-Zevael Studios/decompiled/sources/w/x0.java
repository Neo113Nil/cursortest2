package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x0 extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7521g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0 f7522h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, int i10) {
        super(0);
        this.f7521g = i10;
        this.f7522h = y0Var;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f7521g) {
            case 0:
                return Float.valueOf(this.f7522h.f7534u.f7382a.g());
            default:
                return Float.valueOf(this.f7522h.f7534u.f7385d.g());
        }
    }
}
