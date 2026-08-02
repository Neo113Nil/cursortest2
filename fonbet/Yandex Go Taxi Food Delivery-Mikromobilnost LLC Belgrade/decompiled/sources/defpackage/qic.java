package defpackage;

/* loaded from: classes10.dex */
public abstract class qic {
    public static final sic a = new sic(lr20.c, x4c.G);

    public static final sic a(k43 k43Var, it1 it1Var, fid fidVar, int i) {
        if (jl40.l(k43Var, lr20.c) && jl40.l(it1Var, x4c.G)) {
            bts btsVar = (bts) fidVar;
            btsVar.e0(-1446604504);
            btsVar.t(false);
            return a;
        }
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && btsVar2.k(k43Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !btsVar2.k(it1Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object Q = btsVar2.Q();
        if (z3 || Q == did.a) {
            Q = new sic(k43Var, it1Var);
            btsVar2.o0(Q);
        }
        sic sicVar = (sic) Q;
        btsVar2.t(false);
        return sicVar;
    }
}
