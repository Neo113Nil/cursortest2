package defpackage;

import com.yandex.messaging.core.ui.utils.a;
import com.yandex.messaging.ui.folders.d;
import com.yandex.messaging.ui.folders.e;

/* loaded from: classes10.dex */
public final class z1c implements zls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ sls b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public z1c(sls slsVar, f530 f530Var, oz40 oz40Var, oz40 oz40Var2, e eVar, oz40 oz40Var3) {
        this.b = slsVar;
        this.c = f530Var;
        this.w = oz40Var;
        this.x = oz40Var2;
        this.y = eVar;
        this.z = oz40Var3;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.z;
        Object obj5 = this.w;
        Object obj6 = this.c;
        Object obj7 = this.y;
        Object obj8 = this.x;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                bts btsVar = (bts) ((fid) obj2);
                btsVar.e0(-1525724089);
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = ly3.i(btsVar);
                }
                zx40 zx40Var = (zx40) Q;
                f530 k = lrv.a(c530.a, zx40Var, (jrv) obj6).k(new wic(zx40Var, null, false, true, (awk0) obj5, this.b, (String) obj4, (sls) obj8, (sls) obj7));
                btsVar.t(false);
                return k;
            default:
                e eVar = (e) obj7;
                tic ticVar = (tic) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ticVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    bts btsVar2 = (bts) fidVar;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        return zy11.a;
                    }
                }
                b3b1.a(false, this.b, fidVar, 0, 1);
                oz40 b = a.b(fidVar);
                f530 d = u3a1.d(((f530) obj6).k(ljs0.c), "folder_edit_screen");
                qnm qnmVar = qnm.a;
                dkm0.a(d, wwg.S(-1953093644, true, new v4f(ticVar, (m3u0) obj5, b, this.b, (m3u0) obj8, eVar), fidVar), null, null, null, 0, qnm.c(fidVar).a(), 0L, null, wwg.S(145526143, true, new d((m3u0) obj8, eVar, (oz40) obj4), fidVar), fidVar, 805306416, 444);
                return zy11.a;
        }
    }

    public z1c(jrv jrvVar, awk0 awk0Var, sls slsVar, String str, sls slsVar2, sls slsVar3) {
        this.c = jrvVar;
        this.w = awk0Var;
        this.b = slsVar;
        this.z = str;
        this.x = slsVar2;
        this.y = slsVar3;
    }
}
