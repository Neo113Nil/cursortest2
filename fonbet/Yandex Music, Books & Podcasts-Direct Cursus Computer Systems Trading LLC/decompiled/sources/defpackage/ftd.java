package defpackage;

/* loaded from: classes5.dex */
public final class ftd {
    public boolean e;
    public final x6k a = szf.g0(new enj(9205357640488583168L));
    public final x6k b = szf.g0(new nmq(9205357640488583168L));
    public final t6k c = new t6k(0.0f);
    public final x6k d = szf.g0(null);
    public final u6k f = new u6k(0);

    public final ynn a() {
        x6k x6kVar = this.b;
        if (((nmq) x6kVar.getValue()).a == 9205357640488583168L || !swf.U(c())) {
            return null;
        }
        return ywf.d(c(), ((nmq) x6kVar.getValue()).a);
    }

    public final xod b() {
        return (xod) this.d.getValue();
    }

    public final long c() {
        return ((enj) this.a.getValue()).a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HazeArea(");
        sb.append("positionOnScreen=" + enj.j(c()) + ", ");
        sb.append("size=" + nmq.g(((nmq) this.b.getValue()).a) + ", ");
        sb.append("zIndex=" + this.c.e() + ", ");
        sb.append("contentLayer=" + b() + ", ");
        sb.append("contentDrawing=" + this.e);
        sb.append(")");
        return sb.toString();
    }
}
