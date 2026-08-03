package g1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2478g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f2479h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i10) {
        super(1);
        this.f2478g = i10;
        this.f2479h = qVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f2478g) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f2479h.f2491n.c(uc.e.f(doubleValue, r10.f2482e, r10.f2483f)));
            default:
                return Double.valueOf(uc.e.f(this.f2479h.f2488k.c(((Number) obj).doubleValue()), r10.f2482e, r10.f2483f));
        }
    }
}
