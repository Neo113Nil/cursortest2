package defpackage;

import com.yandex.go.scooters.bdui.c;
import com.yandex.go.scooters.bdui.view.ScootersComposeToDivkitCompatFrameLayout;
import com.yandex.messaging.ui.folders.e;
import com.yx360.design.compose.atoms.DsButtonClose$Type;
import java.util.List;

/* loaded from: classes11.dex */
public final class s0n0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ s0n0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.w;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    c.b(i9a1.c(ljs0.c), (ScootersComposeToDivkitCompatFrameLayout) obj6, (xhr) obj5, (pjr) obj4, btsVar, ScootersComposeToDivkitCompatFrameLayout.$stable << 3);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj2;
                ((Number) obj3).intValue();
                csm.c(true, null, null, null, new zrm(0, DsButtonClose$Type.Close, (sls) obj6), wwg.S(-1031669633, true, new ut9(17, (m3u0) obj5, (e) obj4), fidVar2), fidVar2, 196614, 14);
                break;
            case 2:
                bj6 bj6Var = (bj6) obj;
                fid fidVar3 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar3).k(bj6Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar3;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    com.yandex.go.scooters.passes.active.v3.c.a(bj6Var, (fum0) obj6, (tls) obj5, (oip0) obj4, btsVar2, intValue2 & 14);
                    break;
                }
            case 3:
                bj6 bj6Var2 = (bj6) obj;
                fid fidVar4 = (fid) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar4).k(bj6Var2) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar4;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    btsVar3.Y();
                    break;
                } else {
                    k4b1.a(bj6Var2, (s1p0) obj6, (tls) obj5, (oip0) obj4, btsVar3, intValue3 & 14);
                    break;
                }
            default:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar5 = (fid) obj2;
                int intValue4 = ((Number) obj3).intValue();
                tyx0 tyx0Var = (tyx0) obj6;
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((bts) fidVar5).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar5;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                    btsVar4.Y();
                    break;
                } else if (((List) ((oz40) obj5).getValue()).size() == 1) {
                    btsVar4.e0(-1018272413);
                    btsVar4.t(false);
                    break;
                } else {
                    btsVar4.e0(-1018737537);
                    String e = ohb1.e(btsVar4, kyh0.common_remove);
                    awk0 awk0Var = new awk0(0);
                    boolean k = btsVar4.k(tyx0Var);
                    tls tlsVar = (tls) obj4;
                    Object Q = btsVar4.Q();
                    o430 o430Var = did.a;
                    if (k || Q == o430Var) {
                        Q = new z5(25, tlsVar, tyx0Var);
                        btsVar4.o0(Q);
                    }
                    f530 d = q791.d(c530.a, false, null, awk0Var, (sls) Q, 11);
                    boolean k2 = btsVar4.k(e);
                    Object Q2 = btsVar4.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new oav0(2, e);
                        btsVar4.o0(Q2);
                    }
                    xrb1.c(ibp0Var, mub1.d(), fnq0.a(d, (tls) Q2), null, null, btsVar4, intValue4 & 14, 12);
                    btsVar4.t(false);
                    break;
                }
        }
        return zy11Var;
    }
}
