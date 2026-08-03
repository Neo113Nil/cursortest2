package g1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2472g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f2473h;

    public /* synthetic */ m(q qVar, int i10) {
        this.f2472g = i10;
        this.f2473h = qVar;
    }

    @Override // g1.i
    public final double c(double d10) {
        switch (this.f2472g) {
            case 0:
                return uc.e.f(this.f2473h.f2488k.c(d10), r10.f2482e, r10.f2483f);
            default:
                return this.f2473h.f2491n.c(uc.e.f(d10, r0.f2482e, r0.f2483f));
        }
    }
}
