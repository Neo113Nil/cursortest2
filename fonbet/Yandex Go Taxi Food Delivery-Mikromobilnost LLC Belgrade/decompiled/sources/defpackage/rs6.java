package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class rs6 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tls c;

    public /* synthetic */ rs6(boolean z, tls tlsVar, int i) {
        this.a = i;
        this.b = z;
        this.c = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o430 o430Var = did.a;
        tls tlsVar = this.c;
        boolean z = this.b;
        int i2 = 18;
        bj6 bj6Var = (bj6) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(bj6Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else if (!z) {
                    btsVar.e0(2120667380);
                    btsVar.t(false);
                    break;
                } else {
                    btsVar.e0(2120469414);
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new a0(i2, tlsVar);
                        btsVar.o0(Q);
                    }
                    wpa1.a(bj6Var, (tls) Q, btsVar, intValue & 14);
                    btsVar.t(false);
                    break;
                }
            default:
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(bj6Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else if (!z) {
                    btsVar2.e0(-1003938300);
                    btsVar2.t(false);
                    break;
                } else {
                    btsVar2.e0(-1004132422);
                    boolean k2 = btsVar2.k(tlsVar);
                    Object Q2 = btsVar2.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new a0(21, tlsVar);
                        btsVar2.o0(Q2);
                    }
                    wpa1.a(bj6Var, (tls) Q2, btsVar2, intValue & 14);
                    btsVar2.t(false);
                    break;
                }
        }
        return zy11Var;
    }
}
