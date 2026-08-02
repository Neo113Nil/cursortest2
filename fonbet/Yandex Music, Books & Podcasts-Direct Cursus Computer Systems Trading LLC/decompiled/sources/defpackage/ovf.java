package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;

/* loaded from: classes.dex */
public abstract class ovf {
    public static final ofg a;

    static {
        nfg nfgVar = new nfg(false);
        a = new ofg(mfg.b, nfgVar, nfgVar);
    }

    public static final lvf a(pjc pjcVar, hq5 hq5Var) {
        pjcVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(388053246);
        g gVar = g.a;
        oq5Var.a0(1157296644);
        boolean f = oq5Var.f(pjcVar);
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            K = new lvf(pjcVar);
            oq5Var.k0(K);
        }
        oq5Var.p(false);
        lvf lvfVar = (lvf) K;
        Continuation continuation = null;
        gld.w(oq5Var, lvfVar, new nvf(gVar, lvfVar, continuation, 0));
        gld.w(oq5Var, lvfVar, new nvf(gVar, lvfVar, continuation, 1));
        oq5Var.p(false);
        return lvfVar;
    }
}
