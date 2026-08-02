package defpackage;

import androidx.compose.runtime.c;

/* loaded from: classes.dex */
public final /* synthetic */ class vgd implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb7 b;

    public /* synthetic */ vgd(lb7 lb7Var, int i) {
        this.a = i;
        this.b = lb7Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        lb7 lb7Var = this.b;
        int i2 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    rzo.a(wwg.S(770289688, true, new vgd(lb7Var, i2), btsVar), btsVar, 6);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    c y0 = cma1.y0(btsVar2);
                    boolean e = btsVar2.e(lb7Var) | btsVar2.e(y0);
                    Object Q = btsVar2.Q();
                    if (e || Q == did.a) {
                        Q = new kn2(3, lb7Var, y0);
                        btsVar2.o0(Q);
                    }
                    zpn.a(zy11Var, (tls) Q, btsVar2);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
