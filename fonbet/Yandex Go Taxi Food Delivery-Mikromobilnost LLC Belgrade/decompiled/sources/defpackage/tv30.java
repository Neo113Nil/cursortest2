package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class tv30 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2v0 b;

    public /* synthetic */ tv30(r2v0 r2v0Var, int i) {
        this.a = i;
        this.b = r2v0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c530 c530Var = c530.a;
        r2v0 r2v0Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    o4b1.b(vfc.k(r2v0Var.b.intValue(), 0, -1411607277, btsVar, false), null, ljs0.n(c530Var, 7.0f, 8.0f), null, null, 0.0f, null, btsVar, 440, 56);
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
                    o4b1.b(vfc.k(r2v0Var.b.intValue(), 0, -1411607277, btsVar2, false), null, ljs0.n(c530Var, 7.0f, 8.0f), null, null, 0.0f, null, btsVar2, 440, 56);
                    break;
                }
        }
        return zy11Var;
    }
}
