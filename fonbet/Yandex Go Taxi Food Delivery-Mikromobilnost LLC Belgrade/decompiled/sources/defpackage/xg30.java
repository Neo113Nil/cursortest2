package defpackage;

import ru.yandex.taxi.masstransit.detailedroute.ui.v2.c;

/* loaded from: classes6.dex */
public final /* synthetic */ class xg30 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ h111 b;
    public final /* synthetic */ f530 c;

    public /* synthetic */ xg30(h111 h111Var, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = h111Var;
        this.c = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f530 f530Var = this.c;
        h111 h111Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c.d(h111Var, f530Var, fidVar, vng.O(1));
                break;
            default:
                utb1.a(h111Var, f530Var, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
