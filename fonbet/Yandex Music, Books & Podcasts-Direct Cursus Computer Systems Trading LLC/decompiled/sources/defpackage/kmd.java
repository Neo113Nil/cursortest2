package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class kmd {
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final tf6 a;
    public final jyr b;
    public rar c;
    public final xdr d;
    public final xdr e;

    static {
        msa msaVar = nsa.b;
        long M = yd5.M(300, ssa.MILLISECONDS);
        f = M;
        g = nsa.p(2, M);
    }

    public kmd() {
        dq7 dq7Var = ca8.a;
        this.a = gld.e(j5h.a);
        this.b = l18.b.b(hag.I(k1l.class), true);
        xdr a = ydr.a(ljs.a);
        this.d = a;
        this.e = a;
    }

    public final void a(long j) {
        if (this.e.getValue() instanceof jjs) {
            lgc.a = j;
            msa msaVar = nsa.b;
            lgc.b = yd5.N(System.currentTimeMillis(), ssa.MILLISECONDS);
        } else {
            rar rarVar = this.c;
            Continuation continuation = null;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.c = x97.y(this.a, null, null, new mj0(j, this, continuation, 3), 3);
        }
    }
}
