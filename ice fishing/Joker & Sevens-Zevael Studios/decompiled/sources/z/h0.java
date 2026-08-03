package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.j0[] f8955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f8956h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8957i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int[] f8958j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(v1.j0[] j0VarArr, i0 i0Var, int i10, int[] iArr) {
        super(1);
        this.f8955g = j0VarArr;
        this.f8956h = i0Var;
        this.f8957i = i10;
        this.f8958j = iArr;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        v1.i0 i0Var = (v1.i0) obj;
        v1.j0[] j0VarArr = this.f8955g;
        int length = j0VarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            v1.j0 j0Var = j0VarArr[i10];
            pc.j.b(j0Var);
            j0Var.g();
            v1.i0.g(i0Var, j0Var, this.f8958j[i11], Math.round((1 + this.f8956h.f8964b.f8434a) * (((this.f8957i - j0Var.f7086h) - 0) / 2.0f)));
            i10++;
            i11++;
        }
        return ac.o.f277a;
    }
}
