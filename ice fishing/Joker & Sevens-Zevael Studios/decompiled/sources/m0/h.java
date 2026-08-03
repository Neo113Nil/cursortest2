package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public static final h f4595h = new h(0);

    /* renamed from: i, reason: collision with root package name */
    public static final h f4596i = new h(1);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4597g;

    public /* synthetic */ h(int i10) {
        this.f4597g = i10;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4597g) {
            case 0:
                r rVar = (r) obj;
                int intValue = ((Number) obj2).intValue();
                if (!rVar.P(intValue & 1, (intValue & 3) != 2)) {
                    rVar.S();
                }
                break;
            default:
                r rVar2 = (r) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!rVar2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    rVar2.S();
                }
                break;
        }
        return ac.o.f277a;
    }
}
