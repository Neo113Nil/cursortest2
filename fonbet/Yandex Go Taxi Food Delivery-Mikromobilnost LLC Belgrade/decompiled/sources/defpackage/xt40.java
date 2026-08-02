package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class xt40 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ cu40 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ xt40(cu40 cu40Var, tls tlsVar) {
        this.b = cu40Var;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        cu40 cu40Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                jm91.c(cu40Var, tlsVar, fidVar, vng.O(1));
                break;
            default:
                int intValue = num.intValue();
                int i2 = 2;
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qy20.a(null, null, null, false, wwg.S(1640452749, true, new y740(i2, cu40Var, tlsVar), btsVar), btsVar, 27648, 7);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ xt40(cu40 cu40Var, tls tlsVar, int i) {
        this.b = cu40Var;
        this.c = tlsVar;
    }
}
