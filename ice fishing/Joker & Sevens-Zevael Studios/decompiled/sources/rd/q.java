package rd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yc.y f6177h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oc.a f6178i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v.c f6179j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v.c f6180k;

    public /* synthetic */ q(yc.y yVar, oc.a aVar, v.c cVar, v.c cVar2, int i10) {
        this.f6176g = i10;
        this.f6177h = yVar;
        this.f6178i = aVar;
        this.f6179j = cVar;
        this.f6180k = cVar2;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f6176g) {
            case 0:
                yc.a0.q(this.f6177h, null, new x(this.f6179j, this.f6180k, null, 0), 3);
                this.f6178i.invoke();
                break;
            default:
                yc.a0.q(this.f6177h, null, new x(this.f6179j, this.f6180k, null, 1), 3);
                this.f6178i.invoke();
                break;
        }
        return ac.o.f277a;
    }
}
