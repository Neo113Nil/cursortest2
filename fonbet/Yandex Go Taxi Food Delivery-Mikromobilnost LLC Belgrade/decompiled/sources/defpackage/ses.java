package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class ses implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ nvi0 b;

    public /* synthetic */ ses(nvi0 nvi0Var, int i) {
        this.a = i;
        this.b = nvi0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    mua1.b(ibp0Var, this.b, btsVar, intValue & 14);
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
                    f530 m = ljs0.m(an91.k(c530.a, 16.0f), 24.0f);
                    qed.a.getClass();
                    v0b1.a(this.b, m, null, qed.c, qed.d, null, null, null, 0.0f, 0, btsVar2, 27696, 996);
                    break;
                }
        }
        return zy11Var;
    }
}
