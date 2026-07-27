package g7;

/* loaded from: classes2.dex */
public class o implements m6.i, m6.p {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37677n;

    /* renamed from: u, reason: collision with root package name */
    public final m f37678u;

    public o(t tVar, String str, int i) {
        this.f37677n = i;
        switch (i) {
            case 1:
                this.f37678u = new m(str, n.f37672u, 1, tVar);
                break;
            default:
                this.f37678u = new m(str, n.f37675x, 2, tVar);
                break;
        }
    }

    @Override // m6.i
    public m6.n a() {
        m mVar = this.f37678u;
        return new I0.j((t) mVar.f37668f, mVar.f37664b, (String) mVar.f37666d, (String) mVar.f37667e, (F1.a) mVar.f37670h);
    }

    public m6.o build() {
        return (m6.o) this.f37678u.b(new d4.f(7));
    }

    @Override // m6.p
    public m6.p d(String str) {
        this.f37678u.f37666d = str;
        return this;
    }

    @Override // m6.p
    public m6.p e(String str) {
        this.f37678u.f37667e = str;
        return this;
    }

    public final String toString() {
        switch (this.f37677n) {
            case 0:
                return this.f37678u.d(getClass().getSimpleName());
            default:
                return this.f37678u.d(getClass().getSimpleName());
        }
    }
}
