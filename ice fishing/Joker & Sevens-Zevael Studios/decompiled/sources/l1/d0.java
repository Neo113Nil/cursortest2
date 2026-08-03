package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0 f3964h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i10) {
        super(1);
        this.f3963g = i10;
        this.f3964h = e0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [oc.a, pc.k] */
    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f3963g) {
            case 0:
                e0 e0Var = this.f3964h;
                e0Var.f3978d = true;
                e0Var.f3980f.invoke();
                return ac.o.f277a;
            default:
                h1.d dVar = (h1.d) obj;
                e0 e0Var2 = this.f3964h;
                c cVar = e0Var2.f3976b;
                float f10 = e0Var2.f3985k;
                float f11 = e0Var2.f3986l;
                a5.c A = dVar.A();
                long x10 = A.x();
                A.t().k();
                try {
                    ((f8.c) A.f262h).t(f10, f11, 0L);
                    cVar.a(dVar);
                    A.t().g();
                    A.Q(x10);
                    return ac.o.f277a;
                } catch (Throwable th) {
                    A.t().g();
                    A.Q(x10);
                    throw th;
                }
        }
    }
}
