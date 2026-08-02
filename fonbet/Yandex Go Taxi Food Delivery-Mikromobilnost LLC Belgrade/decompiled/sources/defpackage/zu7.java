package defpackage;

import java.util.HashMap;

/* loaded from: classes14.dex */
public final /* synthetic */ class zu7 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bv7 b;

    public /* synthetic */ zu7(bv7 bv7Var, int i) {
        this.a = i;
        this.b = bv7Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        bv7 bv7Var = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new zu7(bv7Var, i2);
                z3d.a.getClass();
                ((agd) yfdVar).g = z3d.b;
                return zy11Var;
            default:
                ev7 ev7Var = (ev7) obj;
                md6 md6Var = bv7Var.J;
                bv7 bv7Var2 = (bv7) ((sr4) md6Var.c).b;
                if (ev7Var instanceof cv7) {
                    bv7Var2.r(new qu(9));
                    return zy11Var;
                }
                String str = null;
                if (!(ev7Var instanceof dv7)) {
                    w511.b();
                    return null;
                }
                co40 co40Var = (co40) md6Var.b;
                String str2 = ((dv7) ev7Var).a;
                co40Var.getClass();
                HashMap hashMap = new HashMap();
                if (str2 != null) {
                    hashMap.put("text", str2);
                }
                co40Var.a.a("TaxiOrderCancel.CancelCommentModalView.DoneButton.Clicked", hashMap, 1, new HashMap());
                if (str2 != null && !evu0.J(str2)) {
                    str = str2;
                }
                bv7Var2.r(new h0(str, 24));
                return zy11Var;
        }
    }
}
