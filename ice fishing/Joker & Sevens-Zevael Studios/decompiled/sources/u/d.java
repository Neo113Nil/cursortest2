package u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6576g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6577h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, Object obj) {
        super(1);
        this.f6576g = i10;
        this.f6577h = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f6576g) {
            case 0:
                return Boolean.valueOf(pc.j.a(obj, this.f6577h));
            default:
                this.f6577h.get(((Number) obj).intValue());
                return null;
        }
    }
}
