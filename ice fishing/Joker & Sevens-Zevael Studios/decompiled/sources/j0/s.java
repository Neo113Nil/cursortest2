package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l1.f f3457g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f3458h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y0.n f3459i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f3460j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3461k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3462l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(l1.f fVar, String str, y0.n nVar, long j3, int i10, int i11) {
        super(2);
        this.f3457g = fVar;
        this.f3458h = str;
        this.f3459i = nVar;
        this.f3460j = j3;
        this.f3461k = i10;
        this.f3462l = i11;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        u.b(this.f3457g, this.f3458h, this.f3459i, this.f3460j, (m0.r) obj, m0.z.y(this.f3461k | 1), this.f3462l);
        return ac.o.f277a;
    }
}
