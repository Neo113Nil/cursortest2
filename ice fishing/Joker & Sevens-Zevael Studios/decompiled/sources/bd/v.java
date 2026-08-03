package bd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v extends cd.d {

    /* renamed from: a, reason: collision with root package name */
    public long f1157a;

    /* renamed from: b, reason: collision with root package name */
    public yc.g f1158b;

    @Override // cd.d
    public final boolean a(cd.b bVar) {
        t tVar = (t) bVar;
        if (this.f1157a >= 0) {
            return false;
        }
        long j3 = tVar.f1150o;
        if (j3 < tVar.f1151p) {
            tVar.f1151p = j3;
        }
        this.f1157a = j3;
        return true;
    }

    @Override // cd.d
    public final fc.d[] b(cd.b bVar) {
        long j3 = this.f1157a;
        this.f1157a = -1L;
        this.f1158b = null;
        return ((t) bVar).v(j3);
    }
}
