package u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f6563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oc.a f6564h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z10, oc.a aVar) {
        super(1);
        this.f6563g = z10;
        this.f6564h = aVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        ((f1.e0) obj).e(!this.f6563g && ((Boolean) this.f6564h.invoke()).booleanValue());
        return ac.o.f277a;
    }
}
