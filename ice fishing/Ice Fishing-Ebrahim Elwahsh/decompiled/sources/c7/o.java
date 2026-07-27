package c7;

import B1.w;
import g1.C4523c;

/* loaded from: classes2.dex */
public class o implements i6.i, i6.p {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5732n;

    /* renamed from: u, reason: collision with root package name */
    public final m f5733u;

    public o(t tVar, String str, int i) {
        this.f5732n = i;
        switch (i) {
            case 1:
                this.f5733u = new m(str, n.f5727u, 1, tVar);
                break;
            default:
                this.f5733u = new m(str, n.f5730x, 2, tVar);
                break;
        }
    }

    @Override // i6.i
    public i6.n a() {
        m mVar = this.f5733u;
        return new C4523c((t) mVar.f5723f, mVar.f5719b, (String) mVar.f5721d, (String) mVar.f5722e, (e8.k) mVar.f5725h);
    }

    public i6.o build() {
        return (i6.o) this.f5733u.b(new w(29));
    }

    @Override // i6.p
    public i6.p c(String str) {
        this.f5733u.f5721d = str;
        return this;
    }

    @Override // i6.p
    public i6.p d(String str) {
        this.f5733u.f5722e = str;
        return this;
    }

    public final String toString() {
        switch (this.f5732n) {
            case 0:
                return this.f5733u.d(getClass().getSimpleName());
            default:
                return this.f5733u.d(getClass().getSimpleName());
        }
    }
}
