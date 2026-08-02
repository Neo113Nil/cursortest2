package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u41 extends bfu {
    public final String k;
    public final rw5 l;
    public final jyr m;
    public final xdr n;
    public final fkn o;
    public final rar p;

    public u41(String str, rw5 rw5Var) {
        Object value;
        t41 t41Var;
        str.getClass();
        rw5Var.getClass();
        this.k = str;
        this.l = rw5Var;
        this.m = l18.b.b(hag.I(go1.class), true);
        s41 s41Var = s41.a;
        xdr a = ydr.a(s41Var);
        this.n = a;
        this.o = new fkn(a);
        do {
            value = a.getValue();
            t41Var = (t41) value;
            if (!Intrinsics.d(t41Var, s41Var)) {
                if (t41Var instanceof r41) {
                    r41 r41Var = (r41) t41Var;
                    String str2 = r41Var.a;
                    List list = r41Var.b;
                    list.getClass();
                    t41Var = new r41(str2, list, true);
                } else {
                    if (!(t41Var instanceof q41)) {
                        b6e.s();
                        throw null;
                    }
                    t41Var = s41Var;
                }
            }
        } while (!a.k(value, t41Var));
        rar rarVar = this.p;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.p = x97.y(ot0.F(this), null, null, new hl(this, continuation, 7), 3);
    }
}
