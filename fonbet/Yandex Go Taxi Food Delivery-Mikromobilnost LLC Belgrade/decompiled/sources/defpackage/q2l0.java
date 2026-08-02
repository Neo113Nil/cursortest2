package defpackage;

/* loaded from: classes14.dex */
public final class q2l0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2l0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ q2l0(w2l0 w2l0Var, tls tlsVar, int i) {
        this.a = i;
        this.b = w2l0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        w2l0 w2l0Var = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Number) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    w2l0Var.getClass();
                    btsVar.e0(1816673243);
                    ut91.g(w2l0Var, tlsVar, btsVar, 0);
                    btsVar.t(false);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Number) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    btsVar2.e0(1009180378);
                    sb2.b(m290.a.a(null), wwg.S(-580511462, true, new q2l0(w2l0Var, tlsVar, i2), btsVar2), btsVar2, 48);
                    btsVar2.t(false);
                    break;
                }
        }
        return zy11Var;
    }
}
