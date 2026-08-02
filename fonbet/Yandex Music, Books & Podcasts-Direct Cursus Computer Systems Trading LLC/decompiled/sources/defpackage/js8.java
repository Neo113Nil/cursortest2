package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class js8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns8 b;

    public /* synthetic */ js8(ns8 ns8Var, int i) {
        this.a = i;
        this.b = ns8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                l13 l13Var = ((ay2) this.b.h.getValue()).a;
                return new gs8(l13Var.b(hag.I(oi5.class), true), l13Var.b(hag.I(pi5.class), true), l13Var.b(hag.I(is8.class), true));
            case 1:
                ns8 ns8Var = this.b;
                ay2 ay2Var = (ay2) ns8Var.h.getValue();
                t requireActivity = ns8Var.requireActivity();
                requireActivity.getClass();
                ay2Var.getClass();
                return new fs8(requireActivity);
            case 2:
                ns8 ns8Var2 = this.b;
                String x = ns8Var2.x();
                gs8 gs8Var = (gs8) ns8Var2.j.getValue();
                l18 l18Var = l18.b;
                bdt I = hag.I(vs8.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                vs8 vs8Var = (vs8) qdcVar.C(I);
                bdt I2 = hag.I(wx2.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                return new bt8(x, gs8Var, vs8Var, (wx2) qdcVar2.C(I2));
            case 3:
                ns8 ns8Var3 = this.b;
                hs8 y = ns8Var3.y();
                if (y == null || (str = y.a) == null) {
                    str = "";
                }
                String str2 = y != null ? y.b : null;
                return new lhk(ns8Var3.x(), (gs8) ns8Var3.j.getValue(), str, str2 != null ? str2 : "");
            case 4:
                return new ks8(this.b);
            case 5:
                ns8 ns8Var4 = this.b;
                return new ls8(ns8Var4, ns8Var4.requireContext());
            default:
                ns8 ns8Var5 = this.b;
                ns8Var5.z().a("close_system");
                ((lhk) ns8Var5.n.getValue()).H();
                ((fs8) ns8Var5.k.getValue()).a.finish();
                return Unit.a;
        }
    }
}
