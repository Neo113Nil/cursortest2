package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0.n f3309g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f3310h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f3311i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3312j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f3313k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(y0.n nVar, long j3, long j6, int i10, float f10, int i11) {
        super(2);
        this.f3309g = nVar;
        this.f3310h = j3;
        this.f3311i = j6;
        this.f3312j = i10;
        this.f3313k = f10;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int y10 = m0.z.y(433);
        e0.a(this.f3309g, this.f3310h, this.f3311i, this.f3312j, this.f3313k, (m0.r) obj, y10);
        return ac.o.f277a;
    }
}
