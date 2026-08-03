package a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends pc.k implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.x f73g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f74h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f76j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b0.x xVar, long j3, int i10, int i11) {
        super(3);
        this.f73g = xVar;
        this.f74h = j3;
        this.f75i = i10;
        this.f76j = i11;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int i10 = intValue + this.f75i;
        long j3 = this.f74h;
        int f10 = s2.b.f(i10, j3);
        int e10 = s2.b.e(intValue2 + this.f76j, j3);
        return this.f73g.f927h.H(f10, e10, bc.w.f1068g, (oc.c) obj3);
    }
}
