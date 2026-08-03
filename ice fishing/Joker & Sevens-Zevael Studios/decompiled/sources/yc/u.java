package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class u extends fc.a implements fc.f {

    /* renamed from: h, reason: collision with root package name */
    public static final t f8906h = new t(fc.e.f2347g, s.f8899g);

    public u() {
        super(fc.e.f2347g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((fc.g) r3.f8904g.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return fc.j.f2348g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (fc.e.f2347g == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [oc.c, pc.k] */
    @Override // fc.a, fc.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fc.i g(fc.h hVar) {
        pc.j.e(hVar, "key");
        if (hVar instanceof t) {
            t tVar = (t) hVar;
            fc.h hVar2 = this.f2341g;
            if (hVar2 != tVar && tVar.f8905h != hVar2) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a0.j(this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [oc.c, pc.k] */
    @Override // fc.a, fc.i
    public final fc.g v(fc.h hVar) {
        fc.g gVar;
        pc.j.e(hVar, "key");
        if (hVar instanceof t) {
            t tVar = (t) hVar;
            fc.h hVar2 = this.f2341g;
            if ((hVar2 == tVar || tVar.f8905h == hVar2) && (gVar = (fc.g) tVar.f8904g.invoke(this)) != null) {
                return gVar;
            }
        } else if (fc.e.f2347g == hVar) {
            return this;
        }
        return null;
    }

    public abstract void w(fc.i iVar, Runnable runnable);

    public void x(fc.i iVar, Runnable runnable) {
        w(iVar, runnable);
    }

    public boolean y() {
        return !(this instanceof y1);
    }
}
