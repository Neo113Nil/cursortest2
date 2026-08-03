package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 extends u1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4575b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(oc.a aVar) {
        super(aVar);
        z0 z0Var = z0.f4844l;
        this.f4576c = z0Var;
    }

    @Override // m0.u1
    public final v1 a(Object obj) {
        switch (this.f4575b) {
            case 0:
                return new v1(this, obj, obj == null, null, true);
            default:
                return new v1(this, obj, obj == null, (r2) this.f4576c, true);
        }
    }

    @Override // m0.u1
    public z2 b() {
        switch (this.f4575b) {
            case 0:
                return (f0) this.f4576c;
            default:
                return super.b();
        }
    }

    public e0(oc.c cVar) {
        super(new e.b(12));
        this.f4576c = new f0(cVar);
    }
}
