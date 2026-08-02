package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class lw4 implements ryc {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lw4(long j, sai saiVar) {
        this.b = j;
        this.c = saiVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                sai saiVar = (sai) this.c;
                hq5 hq5Var = (hq5) obj3;
                int d = eta.d((Integer) obj4, (ua5) obj, (sai) obj2);
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(d & 1, (d & 129) != 128)) {
                    Object K = oq5Var.K();
                    if (K == gq5.a) {
                        K = new k75(new ub4(0, saiVar, sai.class, "hide", "hide()V", 0, 19));
                        oq5Var.k0(K);
                    }
                    wct.d(this.b, (k75) K, oq5Var, 48);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                d85 d85Var = (d85) this.c;
                dh3 dh3Var = (dh3) obj;
                hq5 hq5Var2 = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                dh3Var.getClass();
                ((uoi) obj2).getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var2).f(dh3Var) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue & 1, (intValue & 131) != 130)) {
                    hyf.a(dh3Var, d85Var.a, this.b, oq5Var2, intValue & 14);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lw4(d85 d85Var, long j) {
        this.c = d85Var;
        this.b = j;
    }
}
