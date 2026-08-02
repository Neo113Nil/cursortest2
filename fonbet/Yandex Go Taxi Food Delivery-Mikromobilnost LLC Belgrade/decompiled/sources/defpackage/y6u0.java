package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class y6u0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ntb0 b;

    public /* synthetic */ y6u0(ntb0 ntb0Var) {
        this.b = ntb0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ntb0 ntb0Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    tl91 tl91Var = ntb0Var.c;
                    if (tl91Var instanceof ltb0) {
                        btsVar.e0(879205214);
                        s3b1.f(((ltb0) tl91Var).a, an91.k(c530.a, 5.0f), null, btsVar, 48, 4);
                        btsVar.t(false);
                    } else {
                        if (!tl91Var.equals(mtb0.a)) {
                            throw unr0.y(1690926620, btsVar, false);
                        }
                        btsVar.e0(879391121);
                        qn91.e(0.0f, 0, 0L, btsVar);
                        btsVar.t(false);
                    }
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                num.getClass();
                sfb1.a(ntb0Var, fidVar, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ y6u0(ntb0 ntb0Var, int i) {
        this.b = ntb0Var;
    }
}
