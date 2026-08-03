package v1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u0 extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7142g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m[] f7143h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(m[] mVarArr, int i10) {
        super(2);
        this.f7142g = i10;
        this.f7143h = mVarArr;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7142g) {
            case 0:
                return Float.valueOf(p0.c((i0) obj, true, this.f7143h, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(p0.c((i0) obj, false, this.f7143h, ((Number) obj2).floatValue()));
        }
    }
}
