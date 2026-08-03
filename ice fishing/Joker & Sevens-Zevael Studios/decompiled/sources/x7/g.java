package x7;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f8390a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.h f8391b;

    public g(k kVar, g7.h hVar) {
        this.f8390a = kVar;
        this.f8391b = hVar;
    }

    @Override // x7.j
    public final boolean a(y7.b bVar) {
        if (bVar.f8804b != 4 || this.f8390a.a(bVar)) {
            return false;
        }
        String str = bVar.f8805c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f8391b.a(new a(str, bVar.f8807e, bVar.f8808f));
        return true;
    }

    @Override // x7.j
    public final boolean b(Exception exc) {
        this.f8391b.b(exc);
        return true;
    }
}
