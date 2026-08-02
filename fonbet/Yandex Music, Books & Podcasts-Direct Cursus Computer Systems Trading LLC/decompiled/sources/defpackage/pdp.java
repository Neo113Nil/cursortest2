package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class pdp {
    public final cq4 a;
    public final j0q b;
    public final j0q c;
    public final gfp d;
    public final ConcurrentHashMap e;
    public volatile ConcurrentHashMap f;

    public pdp(cq4 cq4Var, cc7 cc7Var, frt frtVar) {
        cc7Var.getClass();
        frtVar.getClass();
        this.a = cq4Var;
        j0q j0qVar = new j0q();
        this.b = j0qVar;
        this.c = j0qVar;
        this.d = new gfp(cc7Var, frtVar);
        this.e = new ConcurrentHashMap();
        x97.y(cq4Var, null, null, new v5p(this, (Continuation) null, 1), 3);
    }

    public final void a(String str, tx3 tx3Var) {
        str.getClass();
        this.e.put(str, tx3Var);
        x97.y(this.a, null, null, new odp(this, null, 1), 3);
    }
}
