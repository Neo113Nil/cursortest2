package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k1.b f3478g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f3479h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y0.n f3480i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f3481j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3482k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k1.b bVar, String str, y0.n nVar, long j3, int i10) {
        super(2);
        this.f3478g = bVar;
        this.f3479h = str;
        this.f3480i = nVar;
        this.f3481j = j3;
        this.f3482k = i10;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        u.a(this.f3478g, this.f3479h, this.f3480i, this.f3481j, (m0.r) obj, m0.z.y(this.f3482k | 1));
        return ac.o.f277a;
    }
}
