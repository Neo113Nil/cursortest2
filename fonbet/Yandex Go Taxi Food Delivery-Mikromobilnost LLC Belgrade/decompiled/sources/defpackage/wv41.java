package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes2.dex */
public final /* synthetic */ class wv41 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv41 b;

    public /* synthetic */ wv41(yv41 yv41Var, int i) {
        this.a = i;
        this.b = yv41Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        EmptySet emptySet = EmptySet.a;
        boolean z = false;
        yv41 yv41Var = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(ffx.K(((lkd0) yv41Var.a.s).j));
            case 1:
                Set set = (Set) ((lkd0) yv41Var.a.s).o.getValue();
                return set == null ? emptySet : set;
            case 2:
                Set set2 = (Set) ((lkd0) yv41Var.a.s).p.getValue();
                return set2 == null ? emptySet : set2;
            case 3:
                Set set3 = (Set) ((lkd0) yv41Var.a.s).q.getValue();
                return set3 == null ? emptySet : set3;
            case 4:
                nkd0 nkd0Var = yv41Var.a.s;
                nkd0Var.getClass();
                Set set4 = (Set) ((lkd0) nkd0Var).n.getValue();
                if (set4 != null) {
                    return set4;
                }
                nkd0.c.getClass();
                return (Set) mkd0.b.getValue();
            case 5:
                return yv41Var.a.o.f();
            case 6:
                return yv41Var.a.o.g();
            case 7:
                return Boolean.valueOf(ffx.K(((lkd0) yv41Var.a.s).y));
            case 8:
                return Boolean.valueOf(ffx.K(((lkd0) yv41Var.a.s).v));
            case 9:
                return Boolean.valueOf(ffx.K(((lkd0) yv41Var.a.s).x));
            case 10:
                return Boolean.valueOf(ffx.K(((lkd0) yv41Var.a.s).w));
            case 11:
                cop0 cop0Var = yv41Var.a;
                if (ffx.K(((lkd0) cop0Var.s).z) && ffx.K(((lkd0) cop0Var.s).y)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                cop0 cop0Var2 = yv41Var.a;
                if (ffx.K(((lkd0) cop0Var2.s).z) && ffx.K(((lkd0) cop0Var2.s).v)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                cop0 cop0Var3 = yv41Var.a;
                if (ffx.K(((lkd0) cop0Var3.s).z) && ffx.K(((lkd0) cop0Var3.s).x)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                return (Integer) ((lkd0) yv41Var.a.s).m.getValue();
            case 15:
                nkd0 nkd0Var2 = yv41Var.a.s;
                nkd0Var2.getClass();
                Integer num = (Integer) ((lkd0) nkd0Var2).r.getValue();
                return Integer.valueOf(num != null ? num.intValue() : 40);
            case 16:
                nkd0 nkd0Var3 = yv41Var.a.s;
                nkd0Var3.getClass();
                Integer num2 = (Integer) ((lkd0) nkd0Var3).s.getValue();
                return Integer.valueOf(num2 != null ? num2.intValue() : 80);
            default:
                return Boolean.valueOf(ffx.K(((lkd0) yv41Var.a.s).A));
        }
    }
}
