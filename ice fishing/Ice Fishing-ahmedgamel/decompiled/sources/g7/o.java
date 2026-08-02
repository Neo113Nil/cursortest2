package g7;

import com.anythink.core.common.n.b.A;

/* loaded from: classes2.dex */
public class o implements m6.i, m6.p {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37702n;

    /* renamed from: u, reason: collision with root package name */
    public final m f37703u;

    public o(t tVar, String str, int i) {
        this.f37702n = i;
        switch (i) {
            case 1:
                this.f37703u = new m(str, n.f37697u, 1, tVar);
                break;
            default:
                this.f37703u = new m(str, n.f37700x, 2, tVar);
                break;
        }
    }

    @Override // m6.i
    public m6.n a() {
        m mVar = this.f37703u;
        return new n4.c((t) mVar.f37693f, mVar.f37689b, (String) mVar.f37691d, (String) mVar.f37692e, (I0.j) mVar.f37695h);
    }

    public m6.o build() {
        return (m6.o) this.f37703u.b(new A(7));
    }

    @Override // m6.p
    public m6.p d(String str) {
        this.f37703u.f37691d = str;
        return this;
    }

    @Override // m6.p
    public m6.p e(String str) {
        this.f37703u.f37692e = str;
        return this;
    }

    public final String toString() {
        switch (this.f37702n) {
            case 0:
                return this.f37703u.d(getClass().getSimpleName());
            default:
                return this.f37703u.d(getClass().getSimpleName());
        }
    }
}
