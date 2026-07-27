package r0;

import t0.C0252g;

/* loaded from: classes.dex */
public final class o implements O0.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O0.d f2907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ G.d f2908g;

    public /* synthetic */ o(O0.d dVar, G.d dVar2, int i2) {
        this.f2906e = i2;
        this.f2907f = dVar;
        this.f2908g = dVar2;
    }

    @Override // O0.d
    public final Object c(O0.e eVar, v0.d dVar) {
        switch (this.f2906e) {
            case 0:
                Object c2 = this.f2907f.c(new C0242n(eVar, this.f2908g, 0), dVar);
                if (c2 != w0.a.f3076e) {
                    break;
                }
                break;
            case 1:
                Object c3 = this.f2907f.c(new C0242n(eVar, this.f2908g, 1), dVar);
                if (c3 != w0.a.f3076e) {
                    break;
                }
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object c4 = this.f2907f.c(new C0242n(eVar, this.f2908g, 2), dVar);
                if (c4 != w0.a.f3076e) {
                    break;
                }
                break;
            default:
                Object c5 = this.f2907f.c(new C0242n(eVar, this.f2908g, 3), dVar);
                if (c5 != w0.a.f3076e) {
                    break;
                }
                break;
        }
        return C0252g.f2994a;
    }
}
