package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final /* synthetic */ class qm9 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ rm9 b;

    public /* synthetic */ qm9(rm9 rm9Var, int i) {
        this.a = i;
        this.b = rm9Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        rm9 rm9Var = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                rm5 rm5Var = rm9Var.I;
                hm9 hm9Var = ((dn9) ((agd) yfdVar).a).a;
                r0 r0Var = (r0) rm5Var.b;
                bn9 bn9Var = (bn9) rm5Var.d;
                bn9Var.getClass();
                CharSequence charSequence = hm9Var.a;
                CharSequence charSequence2 = hm9Var.b;
                String str = hm9Var.c;
                an9 an9Var = new an9(charSequence, charSequence2, str != null ? ((m7x0) bn9Var.a).a(str) : null);
                r0Var.getClass();
                r0Var.m(null, an9Var);
                agd agdVar = (agd) yfdVar;
                agdVar.c = (gci0) rm5Var.c;
                agdVar.e = new qm9(rm9Var, 1);
                j4d.a.getClass();
                agdVar.g = j4d.b;
                return zy11Var;
            default:
                wm9 wm9Var = (wm9) obj;
                rm9Var.J.getClass();
                if (jl40.l(wm9Var, um9.a)) {
                    rm9Var.r(new qu(9));
                } else {
                    if (!(wm9Var instanceof vm9)) {
                        w511.b();
                        return null;
                    }
                    ((mg21) ((lg21) rm9Var.F.get())).c(((vm9) wm9Var).a);
                }
                return zy11Var;
        }
    }
}
