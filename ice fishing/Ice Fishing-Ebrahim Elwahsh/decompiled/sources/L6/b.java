package L6;

import J6.o;

/* loaded from: classes2.dex */
public final class b extends J6.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1758b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final J6.f[] f1759c;

    public b(m[] mVarArr) {
        super(J6.k.e(Q6.e.f2730a, mVarArr));
        this.f1759c = mVarArr;
    }

    @Override // J6.f
    public final void c(o oVar) {
        switch (this.f1758b) {
            case 0:
                oVar.j(Q6.b.f2724a, this.f1759c);
                break;
            default:
                oVar.j(Q6.e.f2730a, this.f1759c);
                break;
        }
    }

    public b(J6.f[] fVarArr) {
        super(J6.k.e(Q6.b.f2724a, fVarArr));
        this.f1759c = fVarArr;
    }
}
