package defpackage;

import com.yandex.go.scooters.passes.purchase.packages.f;

/* loaded from: classes11.dex */
public final /* synthetic */ class s7o0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8o0 b;

    public /* synthetic */ s7o0(p8o0 p8o0Var, int i) {
        this.a = 2;
        this.b = p8o0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        p8o0 p8o0Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qgy.b(p8o0Var.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).e.d, null, btsVar, 0, 0, 12286);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(1 & intValue2, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else if (p8o0Var.c == null) {
                    btsVar2.e0(641057467);
                    oeb1.c(btsVar2, c530.a);
                    btsVar2.t(false);
                    break;
                } else {
                    btsVar2.e0(640964901);
                    f.a(p8o0Var.c, xya1.e(btsVar2).h.b, null, btsVar2, 0);
                    btsVar2.t(false);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                f.e(p8o0Var, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ s7o0(p8o0 p8o0Var, int i, byte b) {
        this.a = i;
        this.b = p8o0Var;
    }
}
