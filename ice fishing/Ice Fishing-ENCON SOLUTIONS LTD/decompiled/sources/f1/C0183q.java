package f1;

import h1.C0239i;
import m1.EnumC0985a;

/* renamed from: f1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183q implements D1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D1.d f2956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I.d f2957c;

    public /* synthetic */ C0183q(D1.d dVar, I.d dVar2, int i2) {
        this.f2955a = i2;
        this.f2956b = dVar;
        this.f2957c = dVar2;
    }

    @Override // D1.d
    public final Object r(D1.e eVar, l1.d dVar) {
        switch (this.f2955a) {
            case 0:
                Object r2 = this.f2956b.r(new C0182p(eVar, this.f2957c, 0), dVar);
                if (r2 != EnumC0985a.f8194a) {
                    break;
                }
                break;
            case 1:
                Object r3 = this.f2956b.r(new C0182p(eVar, this.f2957c, 1), dVar);
                if (r3 != EnumC0985a.f8194a) {
                    break;
                }
                break;
            case 2:
                Object r4 = this.f2956b.r(new C0182p(eVar, this.f2957c, 2), dVar);
                if (r4 != EnumC0985a.f8194a) {
                    break;
                }
                break;
            default:
                Object r5 = this.f2956b.r(new C0182p(eVar, this.f2957c, 3), dVar);
                if (r5 != EnumC0985a.f8194a) {
                    break;
                }
                break;
        }
        return C0239i.f3393a;
    }
}
