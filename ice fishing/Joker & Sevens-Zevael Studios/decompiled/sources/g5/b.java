package g5;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: g, reason: collision with root package name */
    public final i4.i f2516g;

    public b(i4.i iVar) {
        pc.j.e(iVar, "statement");
        this.f2516g = iVar;
    }

    @Override // g5.k
    public final long a() {
        return this.f2516g.a();
    }

    @Override // g5.k
    public final void c(String str, int i10) {
        i4.i iVar = this.f2516g;
        int i11 = i10 + 1;
        if (str == null) {
            iVar.h(i11);
        } else {
            iVar.c(str, i11);
        }
    }

    @Override // g5.k
    public final void close() {
        this.f2516g.close();
    }

    @Override // g5.k
    public final void e(int i10, Long l10) {
        long longValue = l10.longValue();
        this.f2516g.n(i10 + 1, longValue);
    }

    @Override // g5.k
    public final Object f(oc.c cVar) {
        throw new UnsupportedOperationException();
    }
}
