package defpackage;

import com.yandex.go.design.compose.slot.body.BodyAlign;

/* loaded from: classes6.dex */
public final /* synthetic */ class r140 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd30 b;

    public /* synthetic */ r140(gd30 gd30Var, int i) {
        this.a = i;
        this.b = gd30Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        gd30 gd30Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    boolean z = gd30Var.d;
                    f530 f530Var = c530.a;
                    if (z) {
                        f530Var = ofb1.b(f530Var, false, null, 15);
                    }
                    ydb1.a(f530Var, null, wwg.S(168195735, true, new r140(gd30Var, i2), btsVar), null, null, null, null, false, btsVar, 384, 250);
                    break;
                }
            default:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var, gd30Var.a, null, null, xya1.e(btsVar2).g.b, 0, 0, null, null, null, 0, 0, BodyAlign.Center, btsVar2, intValue2 & 14, 384, 6134);
                    break;
                }
        }
        return zy11Var;
    }
}
