package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class sgg implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tgg b;
    public final /* synthetic */ g2q0 c;

    public /* synthetic */ sgg(tgg tggVar, g2q0 g2q0Var) {
        this.b = tggVar;
        this.c = g2q0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g2q0 g2q0Var = this.c;
        tgg tggVar = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    tggVar.b(g2q0Var, btsVar, 0);
                    break;
                }
            default:
                num.getClass();
                tggVar.b(g2q0Var, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ sgg(tgg tggVar, g2q0 g2q0Var, int i) {
        this.b = tggVar;
        this.c = g2q0Var;
    }
}
