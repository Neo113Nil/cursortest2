package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b16 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d16 b;

    public /* synthetic */ b16(d16 d16Var, int i) {
        this.a = i;
        this.b = d16Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                d16 d16Var = this.b;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                d16Var.j.getClass();
                jf0.a(new qzm[0], pd.t(new qzm[0]), false, ild.C(-1823151053, new b16(d16Var, 1), hq5Var), hq5Var, 0, 4);
                return Unit.a;
            case 1:
                d16 d16Var2 = this.b;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                y childFragmentManager = d16Var2.getChildFragmentManager();
                childFragmentManager.getClass();
                t requireActivity = d16Var2.requireActivity();
                requireActivity.getClass();
                dzf viewLifecycleOwner = d16Var2.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                d16Var2.A(new qnq(childFragmentManager, requireActivity, wyf.F(viewLifecycleOwner.getLifecycle()), d16Var2.d(), 48), hq5Var2, 8);
                return Unit.a;
            default:
                d16 d16Var3 = this.b;
                jnq jnqVar = (jnq) obj;
                tmb tmbVar = (tmb) obj2;
                jnqVar.getClass();
                tmbVar.getClass();
                u12 u12Var = d16Var3.j;
                bz2 bz2Var = new bz2((rw5) ((jyr) ((y16) d16Var3.l.getValue()).a.e).getValue(), sj.l());
                u12Var.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(u26.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new uvf(new wl(jnqVar, tmbVar, new qne(14), new f26((u26) qdcVar.C(I), bz2Var), 28));
        }
    }
}
