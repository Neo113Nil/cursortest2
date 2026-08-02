package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class t0v implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k811 b;

    public /* synthetic */ t0v(k811 k811Var) {
        this.b = k811Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        k811 k811Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    o4b1.b(mt71.m(k811Var.b, 0, btsVar), null, ljs0.m(c530.a, 8.0f), null, null, 0.0f, new c36(ldc.d, 5), btsVar, 1573304, 56);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                o2b1.d(k811Var, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ t0v(k811 k811Var, int i) {
        this.b = k811Var;
    }
}
