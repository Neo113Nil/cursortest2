package defpackage;

/* loaded from: classes3.dex */
public final class t5c {
    public final rdk a;
    public final rmb b;
    public final g6c c;
    public final g0l d;
    public final kxi e;
    public final fkn f;
    public final qc4 g;

    public t5c(rdk rdkVar, rmb rmbVar, g6c g6cVar, g0l g0lVar, kxi kxiVar) {
        kxiVar.getClass();
        this.a = rdkVar;
        this.b = rmbVar;
        this.c = g6cVar;
        this.d = g0lVar;
        this.e = kxiVar;
        this.f = g6cVar.q;
        this.g = g6cVar.h;
    }

    public final mdc a() {
        Object value = this.f.a.getValue();
        x5c x5cVar = value instanceof x5c ? (x5c) value : null;
        odc b = x5cVar != null ? x5cVar.b() : null;
        if (b instanceof mdc) {
            return (mdc) b;
        }
        return null;
    }
}
