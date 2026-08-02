package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes11.dex */
public final /* synthetic */ class x640 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ q740 b;
    public final /* synthetic */ sls c;

    public /* synthetic */ x640(q740 q740Var, sls slsVar, int i) {
        this.a = i;
        this.b = q740Var;
        this.c = slsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = 3;
        c530 c530Var = c530.a;
        sls slsVar = this.c;
        zy11 zy11Var = zy11.a;
        q740 q740Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    y311 y311Var = y311.a;
                    if (y311Var.equals(y311Var)) {
                        btsVar.e0(1063201032);
                        gpb1.b(an91.m(c530Var, 20.0f, 0.0f, 2), tje.n(AppColor$Palette.Background, btsVar), wwg.S(670082788, true, new x640(q740Var, slsVar, r5), btsVar), btsVar, 390);
                        btsVar.t(false);
                    } else if (y311Var.equals(a411.a)) {
                        btsVar.e0(1063585246);
                        gpb1.d(null, tje.n(AppColor$Palette.Background, btsVar), wwg.S(-1761009201, true, new x640(q740Var, slsVar, i2), btsVar), btsVar, 384);
                        btsVar.t(false);
                    } else {
                        if (!y311Var.equals(z311.a)) {
                            throw unr0.y(-1489725309, btsVar, false);
                        }
                        btsVar.e0(1063879064);
                        btsVar.t(false);
                    }
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                bj6 bj6Var = (bj6) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(bj6Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    CharSequence charSequence = q740Var.b;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    CharSequence charSequence2 = charSequence;
                    if (charSequence2.length() > 0) {
                        btsVar2.e0(-1965641198);
                        f530 c = ljs0.c(an91.o(bj6Var.a(c530Var, x4c.B), 32.0f, 0.0f, 32.0f, 40.0f, 2), 1.0f);
                        boolean k = btsVar2.k(slsVar);
                        Object Q = btsVar2.Q();
                        if (k || Q == did.a) {
                            Q = new zvr(10, slsVar);
                            btsVar2.o0(Q);
                        }
                        qgy.b(charSequence2, null, q791.b(c, null, null, false, null, new awk0(0), (sls) Q, 12), null, 0L, 0L, new sjy0(3), 0L, 2, 2, 0, null, null, btsVar2, 805306368, 6, 14714);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-1965194085);
                        btsVar2.t(false);
                    }
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    nl91.b(null, q740Var.a, q740Var.c, this.c, btsVar3, 0);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    nl91.b(null, q740Var.a, q740Var.c, this.c, btsVar4, 0);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }
}
