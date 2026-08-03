package y1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b1 extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f8476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x4.l f8477h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f8478i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(boolean z10, x4.l lVar, String str) {
        super(0);
        this.f8476g = z10;
        this.f8477h = lVar;
        this.f8478i = str;
    }

    @Override // oc.a
    public final Object invoke() {
        if (this.f8476g) {
            x4.l lVar = this.f8477h;
            String str = this.f8478i;
            g4.a aVar = (g4.a) lVar.f8312h;
            synchronized (aVar.f2509c) {
            }
        }
        return ac.o.f277a;
    }
}
