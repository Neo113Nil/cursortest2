package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c1 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d1 f7396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7397h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v1.j0 f7398i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, int i10, v1.j0 j0Var) {
        super(1);
        this.f7396g = d1Var;
        this.f7397h = i10;
        this.f7398i = j0Var;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        v1.i0 i0Var = (v1.i0) obj;
        d1 d1Var = this.f7396g;
        int i10 = -uc.e.h(d1Var.f7404u.f7382a.g(), 0, this.f7397h);
        boolean z10 = d1Var.f7405v;
        int i11 = z10 ? 0 : i10;
        if (!z10) {
            i10 = 0;
        }
        j0.y yVar = new j0.y(this.f7398i, i11, i10, 1);
        i0Var.f7081g = true;
        yVar.invoke(i0Var);
        i0Var.f7081g = false;
        return ac.o.f277a;
    }
}
