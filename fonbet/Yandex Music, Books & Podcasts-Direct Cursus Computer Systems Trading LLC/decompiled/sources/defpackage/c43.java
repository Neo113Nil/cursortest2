package defpackage;

import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.e;

/* loaded from: classes6.dex */
public final class c43 {
    public static final long e;
    public static final long f;
    public final mm6 a;
    public final CopyOnWriteArraySet b;
    public LinkedHashSet c;
    public final qqi d;

    static {
        msa msaVar = nsa.b;
        ssa ssaVar = ssa.SECONDS;
        e = yd5.N(30L, ssaVar);
        f = yd5.N(30L, ssaVar);
    }

    public c43(nu2 nu2Var) {
        wqr n = a4g.n();
        dq7 dq7Var = ca8.a;
        tf6 e2 = gld.e(e.c(n, mn7.d).plus(new b43(rre.f, 0)));
        this.a = e2;
        this.b = new CopyOnWriteArraySet();
        this.c = new LinkedHashSet();
        this.d = rqi.a();
        x97.y(e2, null, null, new z33(this, nu2Var, null), 3);
    }
}
