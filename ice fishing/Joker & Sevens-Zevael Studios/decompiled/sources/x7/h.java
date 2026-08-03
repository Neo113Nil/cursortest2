package x7;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final g7.h f8392a;

    public h(g7.h hVar) {
        this.f8392a = hVar;
    }

    @Override // x7.j
    public final boolean a(y7.b bVar) {
        int i10 = bVar.f8804b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.f8392a.c(bVar.f8803a);
        return true;
    }

    @Override // x7.j
    public final boolean b(Exception exc) {
        return false;
    }
}
