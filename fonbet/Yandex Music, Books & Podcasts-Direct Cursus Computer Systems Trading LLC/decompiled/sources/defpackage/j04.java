package defpackage;

import java.util.Date;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class j04 implements c04 {
    public static final long d;
    public final a04 a;
    public final dp1 b;
    public final boolean c;

    static {
        msa msaVar = nsa.b;
        d = yd5.M(1, ssa.DAYS);
    }

    public j04(a04 a04Var, dp1 dp1Var, boolean z) {
        a04Var.getClass();
        dp1Var.getClass();
        this.a = a04Var;
        this.b = dp1Var;
        this.c = z;
    }

    public static final boolean a(j04 j04Var, c01 c01Var) {
        Date date = c01Var.r;
        if (date != null) {
            return new Date(System.currentTimeMillis()).getTime() - date.getTime() < nsa.f(d);
        }
        return false;
    }

    @Override // defpackage.c04
    public final pjc c() {
        Continuation continuation = null;
        boolean z = this.c;
        a04 a04Var = this.a;
        return z ? zsd.M0(new u21(10, new wz3(((e15) a04Var.a.getValue()).c(9), a04Var, 1), new eno(new h04(this, null, 0)), new t81(3, 2, continuation)), new g04(null, this)) : new u21(10, new wz3(((e15) a04Var.a.getValue()).c(9), a04Var, 1), new eno(new h04(this, null, 1)), new v42(this, null, 3));
    }
}
