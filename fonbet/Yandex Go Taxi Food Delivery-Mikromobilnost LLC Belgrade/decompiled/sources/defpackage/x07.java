package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes10.dex */
public final /* synthetic */ class x07 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ j690 b;
    public final /* synthetic */ zls c;

    public /* synthetic */ x07(j690 j690Var, zls zlsVar, int i) {
        this.a = i;
        this.b = j690Var;
        this.c = zlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        nhl0 nhl0Var = nhl0.a;
        m501 m501Var = lr20.e;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        zls zlsVar = this.c;
        j690 j690Var = this.b;
        int i2 = 2;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 j = an91.j(ljs0.a(c530Var, rz6.c, rz6.d), j690Var);
                    lhl0 a = khl0.a(m501Var, x4c.E, btsVar, 54);
                    int S = cma1.S(btsVar);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, j);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar, S, wlsVar);
                    }
                    qje.W(btsVar, d.d, d);
                    zlsVar.invoke(nhl0Var, btsVar, 6);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    wqy0.a(((cq11) btsVar2.m(fq11.b)).k, wwg.S(165539859, true, new x07(j690Var, zlsVar, i2), btsVar2), btsVar2, 48);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            default:
                bts btsVar3 = (bts) fidVar;
                if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 j2 = an91.j(ljs0.a(c530Var, sz6.b, sz6.c), j690Var);
                    lhl0 a2 = khl0.a(m501Var, x4c.E, btsVar3, 54);
                    int S2 = cma1.S(btsVar3);
                    r1b0 o2 = btsVar3.o();
                    f530 d2 = b.d(btsVar3, j2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar2);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, a2);
                    qje.W(btsVar3, d.e, o2);
                    wls wlsVar2 = d.g;
                    if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(S2))) {
                        b64.z(S2, btsVar3, S2, wlsVar2);
                    }
                    qje.W(btsVar3, d.d, d2);
                    zlsVar.invoke(nhl0Var, btsVar3, 6);
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
        }
    }
}
