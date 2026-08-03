package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Float f6835g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f6836h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Float f6837i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f6838j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Float f10, c0 c0Var, Float f11, b0 b0Var) {
        super(0);
        this.f6835g = f10;
        this.f6836h = c0Var;
        this.f6837i = f11;
        this.f6838j = b0Var;
    }

    @Override // oc.a
    public final Object invoke() {
        c0 c0Var = this.f6836h;
        Float f10 = c0Var.f6800g;
        Float f11 = this.f6835g;
        boolean equals = f11.equals(f10);
        Float f12 = this.f6837i;
        if (!equals || !f12.equals(c0Var.f6801h)) {
            c0Var.f6800g = f11;
            c0Var.f6801h = f12;
            c0Var.f6803j = new w0(this.f6838j, i1.f6863a, f11, f12, null);
            c0Var.f6807n.f6820b.setValue(Boolean.TRUE);
            c0Var.f6804k = false;
            c0Var.f6805l = true;
        }
        return ac.o.f277a;
    }
}
