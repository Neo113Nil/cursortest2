package defpackage;

import com.yandex.go.design.compose.button.utils.ButtonSize;

/* loaded from: classes5.dex */
public final class s940 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ s940(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        o430 o430Var = did.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tic ticVar = (tic) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ticVar) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new q940(0, tlsVar);
                        btsVar.o0(Q);
                    }
                    vpa1.a(an91.o(ticVar.a(x4c.G, c530Var), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, (sls) Q, wwg.S(367939781, false, r940.a, btsVar), btsVar, 24960, 2);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    boolean k2 = btsVar2.k(tlsVar);
                    Object Q2 = btsVar2.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new q940(3, tlsVar);
                        btsVar2.o0(Q2);
                    }
                    iab1.b(null, (sls) Q2, btsVar2, 0, 1);
                    break;
                }
            case 2:
                tic ticVar2 = (tic) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ticVar2) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    btsVar3.Y();
                    break;
                } else {
                    boolean k3 = btsVar3.k(tlsVar);
                    Object Q3 = btsVar3.Q();
                    if (k3 || Q3 == o430Var) {
                        Q3 = new q940(7, tlsVar);
                        btsVar3.o0(Q3);
                    }
                    vpa1.a(u3a1.d(an91.o(ticVar2.a(x4c.I, c530Var), 0.0f, 8.0f, 8.0f, 8.0f, 1), "modal_close_button"), false, ButtonSize.M, (sls) Q3, wwg.S(-771186319, false, oao0.a, btsVar3), btsVar3, 24960, 2);
                    break;
                }
            case 3:
                tic ticVar3 = (tic) obj;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Number) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((bts) fidVar4).k(ticVar3) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                    btsVar4.Y();
                    break;
                } else {
                    boolean k4 = btsVar4.k(tlsVar);
                    Object Q4 = btsVar4.Q();
                    if (k4 || Q4 == o430Var) {
                        Q4 = new q940(8, tlsVar);
                        btsVar4.o0(Q4);
                    }
                    vpa1.a(u3a1.d(an91.o(ticVar3.a(x4c.I, c530Var), 0.0f, 8.0f, 8.0f, 8.0f, 1), "modal_close_button"), false, ButtonSize.M, (sls) Q4, wwg.S(-771186319, false, kzo0.a, btsVar4), btsVar4, 24960, 2);
                    break;
                }
            default:
                tic ticVar4 = (tic) obj;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Number) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((bts) fidVar5).k(ticVar4) ? 4 : 2;
                }
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                    btsVar5.Y();
                    break;
                } else {
                    boolean k5 = btsVar5.k(tlsVar);
                    Object Q5 = btsVar5.Q();
                    if (k5 || Q5 == o430Var) {
                        Q5 = new q940(9, tlsVar);
                        btsVar5.o0(Q5);
                    }
                    vpa1.a(u3a1.d(an91.o(ticVar4.a(x4c.I, c530Var), 0.0f, 8.0f, 8.0f, 8.0f, 1), "modal_close_button"), false, ButtonSize.M, (sls) Q5, wwg.S(-771186319, false, f2p0.a, btsVar5), btsVar5, 24960, 2);
                    break;
                }
        }
        return zy11Var;
    }
}
