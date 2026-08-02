package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class y240 implements zls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ k340 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ y240(tls tlsVar, k340 k340Var) {
        this.c = tlsVar;
        this.b = k340Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        k340 k340Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    tls tlsVar = this.c;
                    rab1.b(null, wwg.S(1335480215, true, new sg0(19, tlsVar), btsVar), null, null, null, wwg.S(523799315, true, new iu30(5, k340Var, tlsVar), btsVar), null, btsVar, 196656, 93);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(1 & intValue2, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    yt30 yt30Var = k340Var.f;
                    if (yt30Var == null) {
                        btsVar2.e0(-1956913404);
                        m791.d(false, false, btsVar2, 0);
                        btsVar2.t(false);
                        break;
                    } else {
                        btsVar2.e0(-1957041930);
                        wob1.c(yt30Var, this.c, null, null, btsVar2, 0, 12);
                        btsVar2.t(false);
                        break;
                    }
                }
        }
        return zy11Var;
    }

    public /* synthetic */ y240(k340 k340Var, tls tlsVar) {
        this.b = k340Var;
        this.c = tlsVar;
    }
}
