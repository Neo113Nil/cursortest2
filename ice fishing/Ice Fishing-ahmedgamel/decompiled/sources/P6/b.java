package P6;

import N6.o;

/* loaded from: classes2.dex */
public final class b extends N6.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2405b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final N6.f[] f2406c;

    public b(m[] mVarArr) {
        super(N6.k.e(U6.e.f3341a, mVarArr));
        this.f2406c = mVarArr;
    }

    @Override // N6.f
    public final void c(o oVar) {
        switch (this.f2405b) {
            case 0:
                oVar.k(U6.b.f3335a, this.f2406c);
                break;
            default:
                oVar.k(U6.e.f3341a, this.f2406c);
                break;
        }
    }

    public b(N6.f[] fVarArr) {
        super(N6.k.e(U6.b.f3335a, fVarArr));
        this.f2406c = fVarArr;
    }
}
