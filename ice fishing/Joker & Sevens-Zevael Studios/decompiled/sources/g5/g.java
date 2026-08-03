package g5;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f2526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2527i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, j jVar, int i10) {
        super(0);
        this.f2525g = str;
        this.f2526h = jVar;
        this.f2527i = i10;
    }

    @Override // oc.a
    public final Object invoke() {
        return new d(this.f2525g, (i4.c) this.f2526h.f2532i.getValue(), this.f2527i);
    }
}
