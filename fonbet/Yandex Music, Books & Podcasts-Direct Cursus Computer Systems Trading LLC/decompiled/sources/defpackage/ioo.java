package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ioo implements hoo {
    public static final apo e;
    public final Map a;
    public final tpi b;
    public koo c;
    public final ybg d;

    static {
        zwn zwnVar = zwn.y;
        hhm hhmVar = hhm.E;
        apo apoVar = bpo.a;
        e = new apo(0, zwnVar, hhmVar);
    }

    public ioo(Map map) {
        this.a = map;
        long[] jArr = vso.a;
        this.b = new tpi();
        this.d = new ybg(26, this);
    }

    @Override // defpackage.hoo
    public final void b(Object obj, wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1198538093);
        oq5Var.c0(obj);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            ybg ybgVar = this.d;
            if (!((Boolean) ybgVar.invoke(obj)).booleanValue()) {
                xq0.o(dfi.g("Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.", obj));
                return;
            }
            Map map = (Map) this.a.get(obj);
            agr agrVar = moo.a;
            loo looVar = new loo(map, ybgVar);
            oq5Var.k0(looVar);
            K = looVar;
        }
        koo kooVar = (koo) K;
        etn.l(moo.a.a(kooVar), wn5Var, oq5Var, (i & 112) | 8);
        Unit unit = Unit.a;
        boolean h = oq5Var.h(this) | oq5Var.h(obj) | oq5Var.h(kooVar);
        Object K2 = oq5Var.K();
        if (h || K2 == kjnVar) {
            K2 = new lma(20, this, obj, kooVar);
            oq5Var.k0(K2);
        }
        gld.k(unit, (Function1) K2, oq5Var);
        if (oq5Var.x && oq5Var.F.i == oq5Var.y) {
            oq5Var.y = -1;
            oq5Var.x = false;
        }
        oq5Var.p(false);
        oq5Var.p(false);
    }
}
