package defpackage;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class f4d {
    public final LinkedHashMap a = new LinkedHashMap();
    public final tf6 b = gld.e(dm6.b);
    public final LinkedHashMap c = new LinkedHashMap();
    public final long d;

    public f4d() {
        msa msaVar = nsa.b;
        this.d = yd5.M(1, ssa.SECONDS);
    }

    public final vdr a(e5d e5dVar) {
        e5dVar.getClass();
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(e5dVar);
        if (obj == null) {
            obj = ydr.a(j1g.b);
            linkedHashMap.put(e5dVar, obj);
        }
        return (vdr) obj;
    }

    public final void b(e5d e5dVar, j1g j1gVar) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(e5dVar);
        if (obj == null) {
            obj = ydr.a(j1gVar);
            linkedHashMap.put(e5dVar, obj);
        }
        ((xdr) ((bqi) obj)).m(null, j1gVar);
    }

    public final void c(e5d e5dVar, j1g j1gVar) {
        j1g j1gVar2 = j1g.a;
        LinkedHashMap linkedHashMap = this.c;
        r2f r2fVar = (r2f) linkedHashMap.get(e5dVar);
        if (r2fVar != null) {
            r2fVar.g(null);
        }
        linkedHashMap.put(e5dVar, x97.y(this.b, null, null, new akc(this, e5dVar, j1gVar, (Continuation) null), 3));
    }
}
