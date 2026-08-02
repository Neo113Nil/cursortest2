package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ov4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv4 b;

    public /* synthetic */ ov4(rv4 rv4Var, int i) {
        this.a = i;
        this.b = rv4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                rv4 rv4Var = this.b;
                nv4 nv4Var = (nv4) rv4Var.j.getValue();
                t requireActivity = rv4Var.requireActivity();
                requireActivity.getClass();
                nv4Var.getClass();
                return new mv4(requireActivity);
            case 1:
                rv4 rv4Var2 = this.b;
                kuv kuvVar = (kuv) rv4Var2.o.getValue();
                t requireActivity2 = rv4Var2.requireActivity();
                requireActivity2.getClass();
                zh zhVar = rv4Var2.l;
                kuvVar.getClass();
                zhVar.getClass();
                return new muv(requireActivity2, zhVar);
            case 2:
                rv4 rv4Var3 = this.b;
                return new ovv(rv4Var3.x().a(new jab(qkb.Wizard, 1, 5, 0), null), ((mvv) rv4Var3.n.getValue()).a);
            case 3:
                rv4 rv4Var4 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(ibc.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity3 = rv4Var4.requireActivity();
                requireActivity3.getClass();
                return ibc.a(requireActivity3);
            default:
                rv4 rv4Var5 = this.b;
                return new gv4(rv4Var5.g.m(), rv4Var5.k);
        }
    }
}
